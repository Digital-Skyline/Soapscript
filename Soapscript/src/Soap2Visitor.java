import java.io.PrintWriter;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class Soap2Visitor extends SoapscriptBaseVisitor<Integer>{
    String programName;
    private PrintWriter jFile;

    public Soap2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
    }

    @Override
    public Integer visitProgram(SoapscriptParser.ProgramContext ctx)
    {
        Integer value = visitChildren(ctx);
        jFile.close();
        return value;
    }

    @Override
    public Integer visitHeader(SoapscriptParser.HeaderContext ctx)
    {
        programName = ctx.ID().toString();
        return visitChildren(ctx);
    }

    @Override
    public Integer visitBlock(SoapscriptParser.BlockContext ctx)
    {
        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");

        // This probably won't work. It's consuming our stmt_list
        Integer value = visitChildren(ctx);

        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");

        return value;
    }

    @Override
    public Integer visitStmt(SoapscriptParser.StmtContext ctx)
    {
        jFile.println("\n; " + ctx.getText() + "\n");

        return visitChildren(ctx);
    }

    @Override
    public Integer visitAssignment(SoapscriptParser.AssignmentContext ctx)
    {
        Integer value = visit(ctx.);

        String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
                             : (ctx.expr().type == Predefined.realType)    ? "F"
                             :                                    "?";

        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().ID().toString()
                           + " " + typeIndicator);

        return value;
    }

    @Override
    public Integer visitIntegerConst(SoapscriptParser.IntegerConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());

        return visitChildren(ctx);
    }

    @Override
    public Integer visitFloatConst(SoapscriptParser.FloatConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());

        return visitChildren(ctx);
    }
}
