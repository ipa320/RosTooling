/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.seronetgw.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSeronetGwValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/rosgw"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/ros"));
		return result;
	}
	
}