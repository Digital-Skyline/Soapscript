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
	 * Visit a parse tree produced by {@link SoapscriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SoapscriptParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(SoapscriptParser.Stmt_listContext ctx);
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
	 * Visit a parse tree produced by {@link SoapscriptParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(SoapscriptParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#bubble_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBubble_stmt(SoapscriptParser.Bubble_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#clean_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClean_stmt(SoapscriptParser.Clean_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#statementexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementexpr(SoapscriptParser.StatementexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SoapscriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SoapscriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SoapscriptParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SoapscriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SoapscriptParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(SoapscriptParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SoapscriptParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(SoapscriptParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(SoapscriptParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id(SoapscriptParser.Type_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoapscriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(SoapscriptParser.VariableDeclaratorContext ctx);
}