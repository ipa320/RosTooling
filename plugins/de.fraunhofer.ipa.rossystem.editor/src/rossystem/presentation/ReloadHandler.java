package rossystem.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ros.ActionClient;
import ros.ActionServer;
import ros.Node;
import ros.Parameter;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;
import rossystem.RosSystem;

public class ReloadHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        return event;
//
//      ISelection selection = HandlerUtil.getCurrentSelection(event);
//
//      if (selection instanceof IStructuredSelection) {
//          IStructuredSelection structuredSelection = (IStructuredSelection) selection;
//          Object firstElement = structuredSelection.getFirstElement();
//          if (firstElement instanceof IFile) {
//          IFile file = (IFile) firstElement;
//          URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
//          ResourceSet rs = new ResourceSetImpl();
//          Resource r = rs.getResource(uri, true);
//          RosSystem rossystem = (RosSystem)r.getContents().get(0);
//
//          EList<ComponentInterface> roscomponents = rossystem.getRosComponent();
//
//          for (int i=0; i<roscomponents.size(); i++) {
//              ComponentInterface component;
//              component=roscomponents.get(i);
//              if (component.getFromRosNode() != null) {
//                  Node rosnode = component.getFromRosNode();
//                  List<EObject> RosNodeInterfaces = getNodeInterfaces(rosnode);
//                  ComponentInterface UpdatedComponent = SyncComponentInterfaces(component, RosNodeInterfaces);
//                  rossystem.getRosComponent().add(UpdatedComponent);
//              }
//          }
//
//          r.getContents().add(rossystem);
//
//          try {
//              r.save(null);
//          } catch (IOException e) {
//              // TODO Auto-generated catch block
//              e.printStackTrace();
//          }
//          }}
//          return null;

    }

    private List<EObject> getNodeInterfaces(Node rosnode) {
        List<EObject> Interfaces = new ArrayList<EObject>();
        for (Publisher pub:rosnode.getPublisher()) { Interfaces.add(pub);}
        for (Subscriber sub:rosnode.getSubscriber()) { Interfaces.add(sub);}
        for (ServiceClient srvc:rosnode.getServiceclient()) { Interfaces.add(srvc);}
        for (ServiceServer srvs:rosnode.getServiceserver()) { Interfaces.add(srvs);}
        for (ActionClient actc:rosnode.getActionclient()) { Interfaces.add(actc);}
        for (ActionServer acts:rosnode.getActionserver()) { Interfaces.add(acts);}
        for (Parameter param:rosnode.getParameter()) { Interfaces.add(param);}

        return Interfaces;
    }

//  private ComponentInterface SyncComponentInterfaces(ComponentInterface componentInterface_model, List<EObject> RosNodeInterfaces) {
//      String NameSpace="";
//      if (componentInterface_model.getNameSpace()!=null) {
//          NameSpace = componentInterface_model.getNameSpace();
//      }
//      for (RosPublisher RosPub: componentInterface_model.getRospublisher()) {
//          if (RosNodeInterfaces.contains(RosPub.getPublisher())) {
//              RosNodeInterfaces.remove(RosPub.getPublisher());
//              componentInterface_model.getRospublisher().add(RosPub);
//          }
//      }
//      for (RosSubscriber RosSub: componentInterface_model.getRossubscriber()) {
//          if (RosNodeInterfaces.contains(RosSub.getSubscriber())) {
//              RosNodeInterfaces.remove(RosSub.getSubscriber());
//              componentInterface_model.getRossubscriber().add(RosSub);
//          }
//      }
//      for (RosServiceClient RosSrvc: componentInterface_model.getRosserviceclient()) {
//          if (RosNodeInterfaces.contains(RosSrvc.getSrvclient())) {
//              RosNodeInterfaces.remove(RosSrvc.getSrvclient());
//              componentInterface_model.getRosserviceclient().add(RosSrvc);
//          }
//      }
//      for (RosServiceServer RosSrvs: componentInterface_model.getRosserviceserver()) {
//          if (RosNodeInterfaces.contains(RosSrvs.getSrvserver())) {
//              RosNodeInterfaces.remove(RosSrvs.getSrvserver());
//              componentInterface_model.getRosserviceserver().add(RosSrvs);
//          }
//      }
//      for (RosActionClient RosActc: componentInterface_model.getRosactionclient()) {
//          if (RosNodeInterfaces.contains(RosActc.getActclient())) {
//              RosNodeInterfaces.remove(RosActc.getActclient());
//              componentInterface_model.getRosactionclient().add(RosActc);
//          }
//      }
//      for (RosActionServer RosActs: componentInterface_model.getRosactionserver()) {
//          if (RosNodeInterfaces.contains(RosActs.getActserver())) {
//              RosNodeInterfaces.remove(RosActs.getActserver());
//              componentInterface_model.getRosactionserver().add(RosActs);
//          }
//      }
//      for (RosParameter RosParam: componentInterface_model.getRosparameter()) {
//          if (RosNodeInterfaces.contains(RosParam.getParameter())) {
//              RosNodeInterfaces.remove(RosParam.getParameter());
//              componentInterface_model.getRosparameter().add(RosParam);
//          }
//      }
//
//      for (EObject new_interface:RosNodeInterfaces) {
//          if (new_interface.eClass().getName()=="Publisher") {
//              RosPublisher rospub = new RosPublisherImpl();
//              rospub.setName((NameSpace +((Publisher) new_interface).getName()));
//              rospub.setNs(NameSpace);
//              rospub.setPublisher((Publisher)new_interface);
//              componentInterface_model.getRospublisher().add(rospub);
//          }
//          if (new_interface.eClass().getName()=="Subscriber") {
//              RosSubscriber rossub = new RosSubscriberImpl();
//              rossub.setName((NameSpace +((Subscriber) new_interface).getName()));
//              rossub.setNs(NameSpace);
//              rossub.setSubscriber((Subscriber)new_interface);
//              componentInterface_model.getRossubscriber().add(rossub);
//          }
//          if (new_interface.eClass().getName()=="ServiceServer") {
//              RosServiceServer rossrvs = new RosServiceServerImpl();
//              rossrvs.setName((NameSpace +((ServiceServer) new_interface).getName()));
//              rossrvs.setNs(NameSpace);
//              rossrvs.setSrvserver((ServiceServer)new_interface);
//              componentInterface_model.getRosserviceserver().add(rossrvs);
//          }
//          if (new_interface.eClass().getName()=="ServiceClient") {
//              RosServiceClient rossrvc = new RosServiceClientImpl();
//              rossrvc.setName((NameSpace +((ServiceClient) new_interface).getName()));
//              rossrvc.setNs(NameSpace);
//              rossrvc.setSrvclient((ServiceClient)new_interface);
//              componentInterface_model.getRosserviceclient().add(rossrvc);
//          }
//          if (new_interface.eClass().getName()=="ActionServer") {
//              RosActionServer rosacts = new RosActionServerImpl();
//              rosacts.setName((NameSpace +((ActionServer) new_interface).getName()));
//              rosacts.setNs(NameSpace);
//              rosacts.setActserver((ActionServer)new_interface);
//              componentInterface_model.getRosactionserver().add(rosacts);
//          }
//          if (new_interface.eClass().getName()=="ActionClient") {
//              RosActionClient rosactc = new RosActionClientImpl();
//              rosactc.setName((NameSpace +((ActionClient) new_interface).getName()));
//              rosactc.setNs(NameSpace);
//              rosactc.setActclient((ActionClient)new_interface);
//              componentInterface_model.getRosactionclient().add(rosactc);
//          }
//          if (new_interface.eClass().getName()=="Parameter") {
//              RosParameter rosparam = new RosParameterImpl();
//              rosparam.setName((NameSpace +((Parameter) new_interface).getName()));
//              rosparam.setNs(NameSpace);
//              rosparam.setParameter((Parameter)new_interface);
//              componentInterface_model.getRosparameter().add(rosparam);
//          }
//      }
//      return componentInterface_model;
//  }
}
