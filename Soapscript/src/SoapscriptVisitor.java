// Generated from Soapscript.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SoapscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SoapscriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SoapscriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SoapscriptParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SoapscriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(SoapscriptParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SoapscriptParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(SoapscriptParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SoapscriptParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(SoapscriptParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(SoapscriptParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(SoapscriptParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(SoapscriptParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code posNegExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosNegExpr(SoapscriptParser.PosNegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(SoapscriptParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(SoapscriptParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(SoapscriptParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(SoapscriptParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(SoapscriptParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrExpr(SoapscriptParser.IncrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(SoapscriptParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SoapscriptParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(SoapscriptParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(SoapscriptParser.FloatConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SoapscriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SoapscriptParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id(SoapscriptParser.Type_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#conditionalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOp(SoapscriptParser.ConditionalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(SoapscriptParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#mulDivModOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModOp(SoapscriptParser.MulDivModOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#notOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOp(SoapscriptParser.NotOpContext ctx);
}