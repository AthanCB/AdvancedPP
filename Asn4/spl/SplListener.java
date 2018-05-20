// Generated from Spl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SplParser}.
 */
public interface SplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SplParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(SplParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(SplParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#mainprogram}.
	 * @param ctx the parse tree
	 */
	void enterMainprogram(SplParser.MainprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#mainprogram}.
	 * @param ctx the parse tree
	 */
	void exitMainprogram(SplParser.MainprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(SplParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(SplParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#s_body}.
	 * @param ctx the parse tree
	 */
	void enterS_body(SplParser.S_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#s_body}.
	 * @param ctx the parse tree
	 */
	void exitS_body(SplParser.S_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#r_body}.
	 * @param ctx the parse tree
	 */
	void enterR_body(SplParser.R_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#r_body}.
	 * @param ctx the parse tree
	 */
	void exitR_body(SplParser.R_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SplParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SplParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(SplParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(SplParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SplParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SplParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(SplParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(SplParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SplParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SplParser.IdContext ctx);
}