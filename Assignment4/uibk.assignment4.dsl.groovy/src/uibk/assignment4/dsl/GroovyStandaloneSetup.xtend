/*
 * generated by Xtext 2.12.0
 */
package uibk.assignment4.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GroovyStandaloneSetup extends GroovyStandaloneSetupGenerated {

	def static void doSetup() {
		new GroovyStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
