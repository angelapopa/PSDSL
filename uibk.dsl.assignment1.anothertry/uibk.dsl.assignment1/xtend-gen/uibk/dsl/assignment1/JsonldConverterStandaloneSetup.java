/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment1;

import uibk.dsl.assignment1.JsonldConverterStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class JsonldConverterStandaloneSetup extends JsonldConverterStandaloneSetupGenerated {
  public static void doSetup() {
    new JsonldConverterStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
