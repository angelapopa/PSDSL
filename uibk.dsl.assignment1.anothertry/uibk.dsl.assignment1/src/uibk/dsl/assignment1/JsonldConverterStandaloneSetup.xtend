/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class JsonldConverterStandaloneSetup extends JsonldConverterStandaloneSetupGenerated {

	def static void doSetup() {
		new JsonldConverterStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}