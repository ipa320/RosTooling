/*
 * generated by Xtext 2.23.0
 */
package de.fraunhofer.ipa.rossystem.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RosSystemAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/fraunhofer/ipa/rossystem/parser/antlr/internal/InternalRosSystem.tokens");
	}
}
