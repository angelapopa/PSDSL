/**
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3;

import at.uibk.ase.ex3.ComponentDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ComponentDslStandaloneSetup extends ComponentDslStandaloneSetupGenerated {
  public static void doSetup() {
    new ComponentDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
