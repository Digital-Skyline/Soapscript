// Generated from Soapscript.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SoapscriptParser}.
 */
public interface SoapscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SoapscriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SoapscriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SoapscriptParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SoapscriptParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SoapscriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SoapscriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(SoapscriptParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(SoapscriptParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SoapscriptParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SoapscriptParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(SoapscriptParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(SoapscriptParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SoapscriptParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SoapscriptParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SoapscriptParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SoapscriptParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SoapscriptParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SoapscriptParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(SoapscriptParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(SoapscriptParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(SoapscriptParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(SoapscriptParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code posNegExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPosNegExpr(SoapscriptParser.PosNegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code posNegExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPosNegExpr(SoapscriptParser.PosNegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(SoapscriptParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(SoapscriptParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SoapscriptParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SoapscriptParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(SoapscriptParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(SoapscriptParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(SoapscriptParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(SoapscriptParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(SoapscriptParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(SoapscriptParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrExpr(SoapscriptParser.IncrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrExpr(SoapscriptParser.IncrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SoapscriptParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SoapscriptParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SoapscriptParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SoapscriptParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConst(SoapscriptParser.IntegerConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConst(SoapscriptParser.IntegerConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatConst(SoapscriptParser.FloatConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatConst(SoapscriptParser.FloatConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SoapscriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SoapscriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SoapscriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SoapscriptParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(SoapscriptParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(SoapscriptParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#conditionalOp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOp(SoapscriptParser.ConditionalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#conditionalOp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOp(SoapscriptParser.ConditionalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(SoapscriptParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(SoapscriptParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#mulDivModOp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModOp(SoapscriptParser.MulDivModOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#mulDivModOp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModOp(SoapscriptParser.MulDivModOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#notOp}.
	 * @param ctx the parse tree
	 */
	void enterNotOp(SoapscriptParser.NotOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#notOp}.
	 * @param ctx the parse tree
	 */
	void exitNotOp(SoapscriptParser.NotOpContext ctx);
}