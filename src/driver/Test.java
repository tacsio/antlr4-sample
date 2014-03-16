package driver;

import java.io.IOException;

import listener.MonitoringDSLBaseListener;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.MonitoringDSLLexer;
import parser.MonitoringDSLParser;

public class Test {

	public static void main(String[] args) throws IOException {
		
		ANTLRInputStream input = new ANTLRFileStream("sample.in");
		
		MonitoringDSLLexer lexer = new MonitoringDSLLexer(input);
		CommonTokenStream tokes = new CommonTokenStream(lexer);
		
		MonitoringDSLParser parser = new MonitoringDSLParser(tokes);
		ParseTree tree = parser.root();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(new MonitoringDSLBaseListener(), tree);
		
				
	}
}
