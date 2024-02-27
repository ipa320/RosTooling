package de.fraunhofer.ipa.roscode.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ros.Package
import ros.impl.ParameterStructTypeImpl
import ros.Node

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Ros2PythonCodeGenerator extends AbstractGenerator {
 
	String resourcepath
	String import_msgs
	int char_i
	Node node
	List<String> PkgsList
	Set<String> set
	ParameterGeneratorHelpers parameter_helper = new ParameterGeneratorHelpers() {

		override get_param_declaration_str(String param_type, String param_name, String delim, Boolean has_value) {
			var struct_str = "";
			struct_str += "this->declare_parameter";
			if (has_value) {
				struct_str += "<" + param_type + ">";
			}
			struct_str += "(\"" + param_name + "\");\n";
		 	struct_str += "this->get_parameter(\"" + param_name + "\", " + param_name.replace(delim, "_") + "_);\n\n";

		 	return struct_str;
		}

	};

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resourcepath = resource.URI.toString();
		if (! resourcepath.contains("/ros-input")) {
			for (pkg : resource.allContents.toIterable.filter(Package)){
				fsa.generateFile(pkg.getName().toLowerCase+"/package.xml",pkg.compile_package_xml)
				fsa.generateFile(pkg.getName().toLowerCase+"/"+pkg.getName().toLowerCase+"/__init__.py","")
                fsa.generateFile(pkg.getName().toLowerCase+"/resource/"+pkg.getName().toLowerCase,"")
                fsa.generateFile(pkg.getName().toLowerCase+"/setup.cfg",pkg.compile_setup_cfg)
                fsa.generateFile(pkg.getName().toLowerCase+"/setup.py",pkg.compile_setup_py)
                

				 for (art : pkg.artifact){
				 	node = art.node
                    fsa.generateFile(pkg.getName().toLowerCase+"/"+pkg.getName().toLowerCase+"/"+node.name+".py",node.compile_node)
				 	}
				 }
				}
			}


def compile_package_xml(Package pkg)'''
<?xml version="1.0"?>
<?xml-model
   href="http://download.ros.org/schema/package_format3.xsd"
   schematypens="http://www.w3.org/2001/XMLSchema"?>
<package format="3">
 <name>«pkg.name»</name>
 <version>0.0.0</version>
 <description>This package contains the implementation of the node «pkg.artifact.get(0).node.name»</description>
  <maintainer email="your@email.com">Name</maintainer>
  <author email="your@email.com">Name</author>
  <license>Apache 2.0</license>

  <buildtool_depend>ament_cmake</buildtool_depend>
  
  <depend>boost</depend>
  <depend>rclpy</depend>
  «FOR depend_pkg:pkg.getPkgDependencies»
  <depend>«depend_pkg»</depend>
  «ENDFOR»

  <test_depend>ament_lint_auto</test_depend>
  <test_depend>ament_lint_common</test_depend>

  <export>
    <build_type>ament_cmake</build_type>
  </export>
</package>
'''

def compile_setup_cfg(Package pkg)'''
[develop]
script-dir=$base/lib/«pkg.getName().toLowerCase»
[install]
install-scripts=$base/lib/«pkg.getName().toLowerCase»
'''

def compile_setup_py(Package pkg)'''
from setuptools import setup

package_name = '«pkg.getName().toLowerCase»'

setup(
    name=package_name,
    version='0.0.0',
    packages=[package_name],
    data_files=[
        ('share/ament_index/resource_index/packages',
            ['resource/' + package_name]),
        ('share/' + package_name, ['package.xml']),
    ],
    install_requires=['setuptools'],
    zip_safe=True,
    maintainer='Name',
    maintainer_email='your@email.com',
    description='TODO: Package description',
    license='TODO: License declaration',
    tests_require=['pytest'],
    entry_points={
        'console_scripts': [
        ],
    },
)
'''

def compile_node(Node node) '''
import rclpy
from rclpy.node import Node

            «FOR pub : node.publisher»
from «pub.message.package.name».msg import «pub.message.name»
            «ENDFOR»
            «FOR sub : node.subscriber»
from «sub.message.package.name».msg import «sub.message.name»
            «ENDFOR»
            «FOR srvserver : node.serviceserver»
from «srvserver.service.package.name».srv import «srvserver.service.name»
            «ENDFOR»
            «FOR srvclient : node.serviceclient»
from «srvclient.service.package.name».srv import «srvclient.service.name»
            «ENDFOR»



def main(args=None):
    rclpy.init(args=args)

    node = rclpy.create_node('«node.name»')
    «FOR pub:node.publisher»publisher_«pub.name» = node.create_publisher(«pub.message.name», '«pub.name»', 10)«ENDFOR»
    «FOR sub:node.subscriber»subscription_«sub.name» = node.create_subscription( «sub.message.name», '«sub.name»', lambda msg: node.get_logger().info('I heard: "%s"' % msg.data), 10)
    subscription_«sub.name»  # prevent unused variable warning«ENDFOR»
    msg = String()
    i = 0

    def timer_callback():
        nonlocal i
        # Build here the message type
        msg.data = 'Hello World: %d' % i
        i += 1
        node.get_logger().info('Publishing: "%s"' % msg.data)
        «FOR pub:node.publisher»publisher_«pub.name».publish(msg)«ENDFOR»

    timer_period = 0.5  # seconds
    timer = node.create_timer(timer_period, timer_callback)

    rclpy.spin(node)

    # Destroy the timer attached to the node explicitly
    # (optional - otherwise it will be done automatically
    # when the garbage collector destroys the node object)
    node.destroy_timer(timer)
    node.destroy_node()
    rclpy.shutdown()


if __name__ == '__main__':
    main()
 '''
 
 def List<String> getPkgDependencies(Package pkg){
 	set=new HashSet<String>()
	PkgsList = new ArrayList()
	for (art:pkg.artifact){
		node=art.node
		for (pub:node.publisher){ if (pub.message.package !== null) set.add(pub.message.package.name)}
		for (sub:node.subscriber){ if (sub.message.package !== null)  set.add(sub.message.package.name)}
		for (srvserver:node.serviceserver){if (srvserver.service.package !== null) set.add(srvserver.service.package.name)}
		for (srvclient:node.serviceclient){if (srvclient.service.package !== null) set.add(srvclient.service.package.name)}
	}
	PkgsList.addAll(set)
	return PkgsList
 }
 
 def String check_name(String interface_name){
 	return interface_name.replace("/","");
 }

}
