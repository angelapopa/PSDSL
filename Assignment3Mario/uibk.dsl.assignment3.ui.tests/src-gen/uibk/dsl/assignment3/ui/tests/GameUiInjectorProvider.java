/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uibk.dsl.assignment3.ui.internal.Assignment3Activator;

public class GameUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Assignment3Activator.getInstance().getInjector("uibk.dsl.assignment3.Game");
	}

}
