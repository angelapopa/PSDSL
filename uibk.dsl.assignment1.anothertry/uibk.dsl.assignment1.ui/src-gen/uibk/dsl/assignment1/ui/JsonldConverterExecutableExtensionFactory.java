/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uibk.dsl.assignment1.ui.internal.Assignment1Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JsonldConverterExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Assignment1Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Assignment1Activator.getInstance().getInjector(Assignment1Activator.UIBK_DSL_ASSIGNMENT1_JSONLDCONVERTER);
	}
	
}