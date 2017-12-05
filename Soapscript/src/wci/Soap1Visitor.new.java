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

  public PrintWriter getAssemblyFile() { return jFile; }


	@Override
  public Integer visitProgram(SoapscriptParser.ProgramContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitHeader(SoapscriptParser.HeaderContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitBlock(SoapscriptParser.BlockContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitStmt_list(SoapscriptParser.Stmt_listContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitStmt(SoapscriptParser.StmtContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitAssignment_stmt(SoapscriptParser.Assignment_stmtContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitIf_stmt(SoapscriptParser.If_stmtContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitFor_stmt(SoapscriptParser.For_stmtContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitLoop(SoapscriptParser.LoopContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitFor_loop(SoapscriptParser.For_loopContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitExpr(SoapscriptParser.ExprContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitNumber(SoapscriptParser.NumberContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitAssignment(SoapscriptParser.AssignmentContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitVariable(SoapscriptParser.VariableContext ctx)
  { return visitChildren(ctx); }

	@Override
  public Integer visitType_id(SoapscriptParser.Type_idContext ctx)
  { return visitChildren(ctx); }
}
