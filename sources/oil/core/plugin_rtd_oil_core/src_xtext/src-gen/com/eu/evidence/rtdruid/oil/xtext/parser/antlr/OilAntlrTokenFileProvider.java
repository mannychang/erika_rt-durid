/*
* generated by Xtext
*/
package com.eu.evidence.rtdruid.oil.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OilAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/eu/evidence/rtdruid/oil/xtext/parser/antlr/internal/InternalOil.tokens");
	}
}
