// Generated from Soapscript.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link SoapscriptParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SoapscriptParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SoapscriptParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#bubble_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBubble_stmt(SoapscriptParser.Bubble_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#bubble_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBubble_stmt(SoapscriptParser.Bubble_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#clean_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClean_stmt(SoapscriptParser.Clean_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#clean_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClean_stmt(SoapscriptParser.Clean_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#statementexpr}.
	 * @param ctx the parse tree
	 */
	void enterStatementexpr(SoapscriptParser.StatementexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#statementexpr}.
	 * @param ctx the parse tree
	 */
	void exitStatementexpr(SoapscriptParser.StatementexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SoapscriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SoapscriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SoapscriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SoapscriptParser.PrimaryContext ctx);
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
	 * Enter a parse tree produced by {@link SoapscriptParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SoapscriptParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SoapscriptParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(SoapscriptParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(SoapscriptParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SoapscriptParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SoapscriptParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(SoapscriptParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(SoapscriptParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(SoapscriptParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(SoapscriptParser.Var_idContext ctx);
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
	 * Enter a parse tree produced by {@link SoapscriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(SoapscriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(SoapscriptParser.VariableDeclaratorContext ctx);
}