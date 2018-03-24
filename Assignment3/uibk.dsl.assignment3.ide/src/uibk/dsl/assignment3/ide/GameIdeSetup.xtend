/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uibk.dsl.assignment3.GameRuntimeModule
import uibk.dsl.assignment3.GameStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GameIdeSetup extends GameStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GameRuntimeModule, new GameIdeModule))
	}
	
}
