// Generated from Soapscript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SoapscriptParser}.
 */
public interface SoapscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#clean_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClean_stmt(@NotNull SoapscriptParser.Clean_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#clean_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClean_stmt(@NotNull SoapscriptParser.Clean_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(@NotNull SoapscriptParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(@NotNull SoapscriptParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull SoapscriptParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull SoapscriptParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull SoapscriptParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull SoapscriptParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#stmt_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmt_expr(@NotNull SoapscriptParser.Stmt_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#stmt_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmt_expr(@NotNull SoapscriptParser.Stmt_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SoapscriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SoapscriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(@NotNull SoapscriptParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(@NotNull SoapscriptParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull SoapscriptParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull SoapscriptParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SoapscriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SoapscriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(@NotNull SoapscriptParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(@NotNull SoapscriptParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull SoapscriptParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull SoapscriptParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#var_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVar_declarator(@NotNull SoapscriptParser.Var_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#var_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVar_declarator(@NotNull SoapscriptParser.Var_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#bubble_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBubble_stmt(@NotNull SoapscriptParser.Bubble_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#bubble_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBubble_stmt(@NotNull SoapscriptParser.Bubble_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull SoapscriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull SoapscriptParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull SoapscriptParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull SoapscriptParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(@NotNull SoapscriptParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(@NotNull SoapscriptParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SoapscriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SoapscriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(@NotNull SoapscriptParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(@NotNull SoapscriptParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SoapscriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SoapscriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(@NotNull SoapscriptParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(@NotNull SoapscriptParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull SoapscriptParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull SoapscriptParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoapscriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull SoapscriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoapscriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull SoapscriptParser.PrimaryContext ctx);
}