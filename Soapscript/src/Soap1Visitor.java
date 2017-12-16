import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;

public class Soap1Visitor extends SoapscriptBaseVisitor<Integer> {

	private SymTabStack symTabStack;
	private SymTabEntry programId;
	private ArrayList<SymTabEntry> variableIdList;
	private PrintWriter jFile;

	public Soap1Visitor()
	{
		// Create and initialize the symbol table stack.
		symTabStack = SymTabFactory.createSymTabStack();
		Predefined.initialize(symTabStack);
	}

	public PrintWriter getAssemblyFile() { 
		return jFile;
	}

	@Override
	public Integer visitProgram(SoapscriptParser.ProgramContext ctx)
	{
		Integer value = visitChildren(ctx);

		// Print the cross-reference table.
		CrossReferencer crossReferencer = new CrossReferencer();
		crossReferencer.print(symTabStack);

		return value;
	}

	@Override
	public Integer visitHeader(SoapscriptParser.HeaderContext ctx)
	{
		String programName = ctx.ID().toString();

		programId = symTabStack.enterLocal(programName);
		programId.setDefinition(DefinitionImpl.PROGRAM);
		programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
		symTabStack.setProgramId(programId);

		// Create the assembly output file.
		try {
			jFile = new PrintWriter(new FileWriter(programName + ".j"));
		}
		catch (Exception ex) {
			ex.printStackTrace();
			return 0;
		}

		// Emit the program header.
		jFile.println(".class public " + programName);
		jFile.println(".super java/lang/Object");

		// Emit the RunTimer and PascalTextIn fields.
		jFile.println();
		jFile.println(".field private static _runTimer LRunTimer;");
		jFile.println(".field private static _standardIn LPascalTextIn;");

		variableIdList = new ArrayList<SymTabEntry>();
		return visitChildren(ctx);
	}

	@Override
	public Integer visitAssignment(SoapscriptParser.AssignmentContext ctx)
	{
		String variableName = ctx.ID().toString();       
		SymTabEntry variableId = symTabStack.enterLocal(variableName);
		variableId.setDefinition(VARIABLE);
		variableIdList.add(variableId);

		String typeName = ctx.type_id().ID().toString();
		TypeSpec type;
		String   typeIndicator;

		if (typeName.equalsIgnoreCase("int")) {
			type = Predefined.integerType;
			typeIndicator = "I";
		}
		else if (typeName.equalsIgnoreCase("float")) {
			type = Predefined.realType;
			typeIndicator = "F";
		}
		else {
			type = null;
			typeIndicator = "?";
		}
		variableId.setTypeSpec(type);
		jFile.println(".field private static " +
				variableName + " " + typeIndicator);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitVariableExpr(SoapscriptParser.VariableExprContext ctx)
	{
		String variableName = ctx.variable().ID().toString();
		SymTabEntry variableId = symTabStack.lookup(variableName);       
		ctx.type = variableId.getTypeSpec();
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitParenExpr(SoapscriptParser.ParenExprContext ctx)
	{
		Integer value = visitChildren(ctx); 
		ctx.type = ctx.expr().type;
		return value;
	}
	
	@Override
	public Integer visitIntegerConst(SoapscriptParser.IntegerConstContext ctx)
	{
		ctx.type = Predefined.integerType;
		return visitChildren(ctx);
	}

	@Override
	public Integer visitFloatConst(SoapscriptParser.FloatConstContext ctx)
	{
		ctx.type = Predefined.realType;
		return visitChildren(ctx);
	}
	
	/**
	@Override public Integer visitPrintStmt(SoapscriptParser.PrintStmtContext ctx) {
		jFile.println("getstatic    java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("ldc          "+ctx.ID().toString());
		jFile.println("iconst_2");
		jFile.println("anewarray    java/lang/Object");
		jFile.println("dup");
		jFile.println("iconst_0");
		jFile.println("getstatic     FormatTest/n I ");
		jFile.println("invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
		jFile.println("aastore");
		jFile.println("dup");
		jFile.println("iconst_1");
		jFile.println("getstatic     FormatTest/root F");
		jFile.println("invokestatic  java/lang/Float.valueOf(F)Ljava/lang/Float;");
		jFile.println("aastore");
		jFile.println("invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)"
				+ "Ljava/lang/String;");
		jFile.println("invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V");

		return visitChildren(ctx); 
	}
*/
}
