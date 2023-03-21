package de.fraunhofer.ipa.ros.sirius;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.impl.DSemanticDiagramImpl;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DView;

import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import ros.SpecBase;
import rossystem.ActionConnection;
import rossystem.RosSystem;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

/*
 * Class with utility functions used by AutoConnect and SimulateRuntimeConnections
 */

public final class ConnectionsCheckUtils {

    private ConnectionsCheckUtils() {

    }

    static List<DView> getDiagramViews(EObject diagram) {

        EObject target = ((DSemanticDiagramImpl) diagram).getTarget();
        Session session = SessionManager.INSTANCE.getSession(target);
        DAnalysis slaveAnalysis = (DAnalysis) session.getSessionResource().getContents().get(0);
        String name = ((DSemanticDiagramImpl) diagram).getName();
        EList<DView> owned_views = slaveAnalysis.getOwnedViews();

        List<DView> current_views = owned_views.stream()
                .filter(view -> view.getOwnedRepresentationDescriptors().toString().contains(name))
                .collect(Collectors.toList());

        return current_views;
    }

    static boolean containEqualCommunicationObjects(SpecBase message1, SpecBase message2) {
        if (message1==null | message2==null) {
            return false;
        }
        boolean haveEqualName = false;
        if (message1.isSetFullname() && message2.isSetFullname()) {
            if (message1.getFullname().equals(message2.getFullname())) {
                haveEqualName = true;
            }
        } else {
            if (message1.getName().equals(message2.getName())) {
                haveEqualName = true;
            }
        }

        boolean haveEqualContent = true;
        if (message1.eContents().size() != message2.eContents().size()) {
            haveEqualContent = false;
        } else {
            for (EObject communicationObject1 : message1.eContents()) {
                Optional<EObject> optional = message2.eContents().stream()
                        .filter(obj -> EcoreUtil.equals(obj, communicationObject1)).findFirst();
                if (!optional.isPresent()) {
                    haveEqualContent = false;
                }
            }
        }
        return haveEqualName && haveEqualContent;
    }

    static boolean isDuplicatedTopicConnection(RosSystem rossystem, RosPublisher rospub, RosSubscriber rossub) {
        for (TopicConnection topic_con : rossystem.getTopicConnections()) {
            for (RosPublisher pub_con : topic_con.getFrom()) {
                for (RosSubscriber sub_con : topic_con.getTo()) {
                    if (pub_con == rospub && sub_con == rossub) {
                        System.out.println("Connection already exits");
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static boolean isDuplicatedServiceConnection(RosSystem rossystem, RosServiceServer rosss, RosServiceClient rosscl) {
        for (ServiceConnection srv_con : ((RosSystem) rossystem).getServiceConnections()) {
            for (RosServiceServer srvs_con : srv_con.getFrom()) {
                if (srvs_con == rosss && EcoreUtil.equals(srv_con.getTo(), rosscl)) {
                    System.out.println("Connection already exits");
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isDuplicatedActionConnection(RosSystem rossystem, RosActionClient rosac, RosActionServer rosas) {
        for (ActionConnection act_con : rossystem.getActionConnections()) {
            if (EcoreUtil.equals(act_con.getTo(), rosac) && EcoreUtil.equals(act_con.getFrom(), rosas)) {
                System.out.println("Connection already exits");
                return true;
            }
        }

        return false;
    }

}
