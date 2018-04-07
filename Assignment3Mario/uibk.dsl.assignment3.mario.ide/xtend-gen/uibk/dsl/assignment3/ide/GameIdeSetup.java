/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uibk.dsl.assignment3.GameRuntimeModule;
import uibk.dsl.assignment3.GameStandaloneSetup;
import uibk.dsl.assignment3.ide.GameIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GameIdeSetup extends GameStandaloneSetup {
  @Override
  public Injector createInjector() {
    GameRuntimeModule _gameRuntimeModule = new GameRuntimeModule();
    GameIdeModule _gameIdeModule = new GameIdeModule();
    return Guice.createInjector(Modules2.mixin(_gameRuntimeModule, _gameIdeModule));
  }
}
