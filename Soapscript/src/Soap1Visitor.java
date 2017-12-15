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
//  private ArrayList<SymTabEntry> variableIdList;
  private PrintWriter jFile;

  public Soap1Visitor()
  {
    // Create and initialize the symbol table stack.
    symTabStack = SymTabFactory.createSymTabStack();
    Predefined.initialize(symTabStack);
  }

  public PrintWriter getAssemblyFile() { return jFile;
  
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

      return visitChildren(ctx);
  }

	// @Override
  // public Integer visitBlock(SoapscriptParser.BlockContext ctx)
  // { return visitChildren(ctx); }

	// @Override
  // public Integer visitStmt_list(SoapscriptParser.Stmt_listContext ctx)
  // { return visitChildren(ctx); }
  //
	// @Override
  // public Integer visitStmt(SoapscriptParser.StmtContext ctx)
  // { return visitChildren(ctx); }

	// @Override
  // public Integer visitAssignment_stmt(SoapscriptParser.Assignment_stmtContext ctx)
  // { return visitChildren(ctx); }

	// @Override
  // public Integer visitIf_stmt(SoapscriptParser.If_stmtContext ctx)
  // { return visitChildren(ctx); }
  //
	// @Override
  // public Integer visitFor_stmt(SoapscriptParser.For_stmtContext ctx)
  // { return visitChildren(ctx); }
  //
	// @Override
  // public Integer visitLoop(SoapscriptParser.LoopContext ctx)
  // { return visitChildren(ctx); }
  //
	// @Override
  // public Integer visitFor_loop(SoapscriptParser.For_loopContext ctx)
  // { return visitChildren(ctx); }

	// @Override
  // public Integer visitExpr(SoapscriptParser.ExprContext ctx)
  // { return visitChildren(ctx); }

//	@Override
//  public Integer visitNumber(SoapscriptParser.NumberContext ctx)
//  {
//    Integer value = visit(ctx.number());
//    ctx.type = ctx.number().type;
//    return value;
//  }

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

	// @Override
  // public Integer visitAssignment(SoapscriptParser.AssignmentContext ctx)
  // {
  //   return visitChildren(ctx);
  // }

	@Override
  public Integer visitVariable(SoapscriptParser.VariableContext ctx)
  {
    String variableName = ctx.ID().toString();
    SymTabEntry variableId = symTabStack.lookup(variableName);
    //ctx.type = variableId.getTypeSpec();
    return visitChildren(ctx);
  }

	@Override
  public Integer visitType_id(SoapscriptParser.Type_idContext ctx)
  {
    String typeName = ctx.ID().toString();

    TypeSpec type;
    String   typeIndicator;

    if (typeName.equalsIgnoreCase("integer")) {
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

    // for (SymTabEntry id : variableIdList) {
    //     id.setTypeSpec(type);
    //
    //     // Emit a field declaration.
    //     jFile.println(".field private static " +
    //                        id.getName() + " " + typeIndicator);
    // }

    return visitChildren(ctx);
  }
}
