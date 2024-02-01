package de.fraunhofer.ipa.rossystem.deployment;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class DeploymentArtifactsGeneratorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

      @Override
        protected Bundle getBundle() {
            return Activator.getInstance().getBundle();
        }

        @Override
        protected Injector getInjector() {
            return Activator.getInstance().getInjector(Activator.DE_FRAUNHOFER_IPA_ROSSYSTEM_ROSSYSTEM);
        }
 }
