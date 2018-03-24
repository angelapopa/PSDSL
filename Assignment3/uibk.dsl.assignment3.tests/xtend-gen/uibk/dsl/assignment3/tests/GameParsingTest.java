/**
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uibk.dsl.assignment3.game.Adventure;
import uibk.dsl.assignment3.tests.GameInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GameInjectorProvider.class)
@SuppressWarnings("all")
public class GameParsingTest {
  @Inject
  private ParseHelper<Adventure> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Adventure result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
