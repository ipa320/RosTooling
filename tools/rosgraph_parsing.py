#!/usr/bin/env python

import rosgraph
import rosservice
import yaml
import socket

BLACK_LIST_PARAM = ['/rosdistro', '/rosversion', 'run_id']
BLACK_LIST_TOPIC = ["/tf", "/tf_static", "/rosout", "/clock"]
BLACK_LIST_NODE = ["/rosout"]

ACTION_FILTER = ['cancel','goal','status', 'result', 'feedback']


class Node(object):
    def __init__(self, name=""):
        self.name = name
        self.action_clients = {}
        self.action_servers = {}
        self.publishers = {}
        self.subscribers = {}
        self.services = {}
    
    def add_publisher(self, topic_name, topic_type):
        self.publishers[topic_name] = topic_type

    def add_subscriber(self, topic_name, topic_type):
        self.subscribers[topic_name] = topic_type

    def add_service(self, service_name, service_type):
        self.services[service_name] = service_type

    def _clean_action_client(self):
        for name in self.action_clients.iterkeys():
            self.publishers.pop(name+'goal', None)
            self.publishers.pop(name+'cancel', None)
            self.subscribers.pop(name+'status', None)
            self.subscribers.pop(name+'result', None)
            self.subscribers.pop(name+'feedback', None)

    def _clean_action_server(self):
        for name in self.action_servers.iterkeys():
            self.subscribers.pop(name+'goal', None)
            self.subscribers.pop(name+'cancel', None)
            self.publishers.pop(name+'status', None)
            self.publishers.pop(name+'result', None)
            self.publishers.pop(name+'feedback', None)

    def check_actions(self):
        # Check Action client
        for topic_name, topic_type in self.publishers.iteritems():
            if topic_name.endswith('goal'):
                _action_name = topic_name[:-4]
                if not (_action_name + 'cancel' in self.publishers.iterkeys()):
                    continue
                if not (_action_name + 'status' in self.subscribers.iterkeys()):
                    continue
                if not (_action_name + 'result' in self.subscribers.iterkeys()):
                    continue
                if not (_action_name + 'feedback' in self.subscribers.iterkeys()):
                    continue
                _action_type = topic_type[:-10] # Hardcoded ActionGoal
                self.action_clients[_action_name] = _action_type
        self._clean_action_client()
        # Check Action Server
        for topic_name, topic_type in self.subscribers.iteritems():
            if topic_name.endswith('goal'):
                _action_name = topic_name[:-4]
                if not (_action_name + 'cancel' in self.subscribers.iterkeys()):
                    continue
                if not (_action_name + 'status' in self.publishers.iterkeys()):
                    continue
                if not (_action_name + 'result' in self.publishers.iterkeys()):
                    continue
                if not (_action_name + 'feedback' in self.publishers.iterkeys()):
                    continue
                _action_type = topic_type[:-10] # Hardcode ActionGoal
                self.action_servers[_action_name] = _action_type
        self._clean_action_server()

    def dump_print(self):
        print("Node:",self.name)
        print("Publishers")
        for pub, pub_type in self.publishers.iteritems():
            print(pub, pub_type)
        print("Subscribers")
        for sub, sub_type in self.subscribers.iteritems():
            print(sub, sub_type)
        print("Services")
        for serv, serv_type in self.services.iteritems():
            print(serv, serv_type)
        print("Action Clients")
        for action_, action_type in self.action_clients.iteritems():
            print(action_, action_type)
        print("Action Servers")
        for action_, action_type in self.action_servers.iteritems():
            print(action_, action_type)

    def dump_yaml(self):
        yaml_dict=dict()
        yaml_dict['Publishers'] = self.publishers
        yaml_dict['Subscribers'] = self.subscribers
        yaml_dict['Services'] = self.services
        yaml_dict['ActionClients'] = self.action_clients
        yaml_dict['ActionServers'] = self.action_servers
        return yaml_dict

def create_ros_graph_snapshot():
    master = rosgraph.Master('snapshot')
    node_names = list()
    nodes = list()
    params = list()
    services_dict = dict()
    topics_dict = dict()

    if not(master.is_online()):
        print("Error: ROSMaster not found")

    # Get parameters
    for param_name in master.getParamNames():
        if param_name not in BLACK_LIST_PARAM and not(param_name.startswith('/roslaunch')):
            params.append(param_name)
    state = master.getSystemState() #get the system state
    pubs, subs, services = state

    #get all topics type
    topic_list = master.getTopicTypes()
    for topic, topic_type in topic_list:
        topics_dict[topic] = topic_type

    #get all service types
    for service_name, _ in services:
        try:
            services_dict[service_name] = rosservice.get_service_type(service_name)
        except:
            pass

    # Get all nodes
    for s in state:
        for _, l in s:
            for n in l:
                if n not in BLACK_LIST_NODE:
                    node_names.append(n)

    node_names = list(set(node_names))
    for n in node_names:
        node = Node(n)
        for pub, nodes_name in pubs:
            if pub in BLACK_LIST_TOPIC:
                continue
            if n in nodes_name:
                node.add_publisher(pub, topics_dict[pub])
        for sub, nodes_name in subs:
            if sub in BLACK_LIST_TOPIC:
                continue
            if n in nodes_name:
                node.add_subscriber(sub, topics_dict[sub])
        for serv, node_names in services:
           if n in nodes_name:
               try:
                   node.add_service(serv, services_dict[serv])
               except:
                   pass
        node.check_actions()
        nodes.append(node)

    return nodes

nodes = create_ros_graph_snapshot()

dump = dict()
dump['nodes']=dict()
pkg_name = "dump_pkg"
ros_model_str = "PackageSet { package { \n"
ros_model_str+="  CatkinPackage "+pkg_name +" { "
system_model_str = "RosSystem { Name 'my_system'\n"
if len(nodes) > 0:
    cout_n = len(nodes)
    ros_model_str+="artifact {\n"
    system_model_str+="    RosComponents ( \n"
    for node in nodes:
        ros_model_str+="    Artifact "+node.name+"{\n"
        ros_model_str+="      node Node { name "+ node.name+"\n"
        system_model_str+="        ComponentInterface { name '"+node.name+"'\n" 
        pubs = node.publishers
        subs = node.subscribers
        srvs = node.services
        asrvs = node.action_servers
        acls = node.action_clients
        if len(pubs) > 0:
            ros_model_str+="        publisher {\n"
            system_model_str+="            RosPublishers{\n"
            count = len(pubs)
            for pub in pubs:
                ros_model_str+="          Publisher { name '"+pub+"' message '"+pubs[pub].replace("/",".")+"'}"
                system_model_str+="                RosPublisher '"+pub+"' { RefPublisher '"+pkg_name+"."+node.name+"."+node.name+"."+pub+"'}"
                count = count -1
                if count > 0:
                    ros_model_str+=",\n"
                    system_model_str+=",\n"
                else:
                    ros_model_str+="}"
                    system_model_str+="}\n"
        if len(subs) > 0:
            ros_model_str+="\n        subscriber {\n"
            system_model_str+="            RosSubscribers{\n"
            count = len(subs)
            for sub in subs:
                ros_model_str+="          Subscriber { name '"+sub+"' message '"+subs[sub].replace("/",".")+"'}"
                system_model_str+="                RosSubscriber '"+sub+"' { RefSubscriber '"+pkg_name+"."+node.name+"."+node.name+"."+sub+"'}"
                count = count -1
                if count > 0:
                    ros_model_str+=",\n"
                    system_model_str+=",\n"
                else:
                    ros_model_str+="}"
                    system_model_str+="}\n"
        if len(srvs) > 0:
            ros_model_str+="\n        serviceserver {\n"
            system_model_str+="            RosSrvServers{\n"
            count = len(srvs)
            for srv in srvs:
                ros_model_str+="          ServiceServer { name '"+srv+"' service '"+srvs[srv].replace("/",".")+"'}"
                system_model_str+="                RosServiceServer '"+srv+"' { RefServer '"+pkg_name+"."+node.name+"."+node.name+"."+srv+"'}"
                count = count -1
                if count > 0:
                    ros_model_str+=",\n"
                    system_model_str+=",\n"
                else:
                    ros_model_str+="}"
                    system_model_str+="}\n"
        if len(asrvs) > 0:
            ros_model_str+="\n        actionserver {\n"
            system_model_str+="            RosActionServers{\n"
            count = len(asrvs)
            for asrv in asrvs:
                ros_model_str+="          ActionServer { name '"+asrv+"' action '"+asrvs[asrv].replace("/",".")+"'}"
                system_model_str+="                RosActionServer '"+asrv+"' { RefServer '"+pkg_name+"."+node.name+"."+node.name+"."+asrv+"'}"
                count = count -1
                if count > 0:
                    ros_model_str+=",\n"
                    system_model_str+=",\n"
                else:
                    ros_model_str+="}"
                    system_model_str+="}\n"
        if len(acls) > 0:
            ros_model_str+="\n        actionclient {\n"
            system_model_str+="            RosActionClients{\n"
            count = len(acls)
            for acl in acls:
                ros_model_str+="          ActionClient { name '"+acl+"' action '"+acls[acl].replace("/",".")+"'}"
                system_model_str+="                RosActionClient '"+acl+"' { RefClient '"+pkg_name+"."+node.name+"."+node.name+"."+acl+"'}"
                count = count -1
                if count > 0:
                    ros_model_str+=",\n"
                    system_model_str+=",\n"
                else:
                    ros_model_str+="}"
                    system_model_str+="}\n"
        cout_n = cout_n -1
        if cout_n > 0:
            ros_model_str+="}},\n"
            system_model_str+="},\n"
        else:
            ros_model_str+="}\n"
            system_model_str+="}\n"

ros_model_str+="}}}"
system_model_str+="})}"


ros_file = open("dump.ros", "w")
ros_file.write(ros_model_str)
ros_file.close()

system_file = open("Mysystem.rossystem", "w")
system_file.write(system_model_str)
system_file.close()
