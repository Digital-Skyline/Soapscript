// Generated from Soapscript.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SoapscriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SoapscriptParser.NumberContext ctx);
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
}