/*
 * generated by Xtext 2.11.0
 */
package at.uibk.ase.ex3.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ComponentDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("at/uibk/ase/ex3/parser/antlr/internal/InternalComponentDsl.tokens");
	}
}
