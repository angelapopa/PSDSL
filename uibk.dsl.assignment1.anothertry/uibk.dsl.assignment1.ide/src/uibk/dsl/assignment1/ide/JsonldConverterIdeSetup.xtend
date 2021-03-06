/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uibk.dsl.assignment1.JsonldConverterRuntimeModule
import uibk.dsl.assignment1.JsonldConverterStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class JsonldConverterIdeSetup extends JsonldConverterStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new JsonldConverterRuntimeModule, new JsonldConverterIdeModule))
	}
	
}
