package de.fraunhofer.ipa.rossystem;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import rossystem.RosInterface;
import rossystem.RosNode;
import ros.Node;
import ros.Package;


public class RosSystemQNP extends DefaultDeclarativeQualifiedNameProvider{

    QualifiedName qualifiedName(RosInterface i) {
        RosNode n = (RosNode) i.eContainer();
        return QualifiedName.create(n.getName(), i.getName());
    }
//
//    QualifiedName qualifiedName(Node n) {
//        Package p = (Package) n.eContainer().eContainer();
//        QualifiedName qn = QualifiedName.create(p.getName(), n.getName());
//        System.out.println(qn.toString());
//        return qn;
//    }

}
