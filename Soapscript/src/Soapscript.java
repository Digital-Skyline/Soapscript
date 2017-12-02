import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Soapscript {
	public static void main(String[] args) throws Exception 
    {
        String inputFile = null;
        
        if (args.length > 0) inputFile = args[0];
        InputStream is = (inputFile != null)
                                ? new FileInputStream(inputFile)
                                : System.in;
        
        ANTLRInputStream input = new ANTLRInputStream(is);
        SoapscriptLexer lexer = new SoapscriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SoapscriptParser parser = new SoapscriptParser(tokens);
        ParseTree tree = parser.program();

        CompilerVisitor compiler = new CompilerVisitor();
        compiler.visit(tree);
    }
}
