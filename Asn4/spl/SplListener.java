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
	 * Enter a parse tree produced by {@link SplParser#ifelse_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse_statement(SplParser.Ifelse_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#ifelse_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse_statement(SplParser.Ifelse_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#if_st}.
	 * @param ctx the parse tree
	 */
	void enterIf_st(SplParser.If_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#if_st}.
	 * @param ctx the parse tree
	 */
	void exitIf_st(SplParser.If_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#elseif_st}.
	 * @param ctx the parse tree
	 */
	void enterElseif_st(SplParser.Elseif_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#elseif_st}.
	 * @param ctx the parse tree
	 */
	void exitElseif_st(SplParser.Elseif_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#else_st}.
	 * @param ctx the parse tree
	 */
	void enterElse_st(SplParser.Else_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#else_st}.
	 * @param ctx the parse tree
	 */
	void exitElse_st(SplParser.Else_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(SplParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(SplParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(SplParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(SplParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SplParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SplParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(SplParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(SplParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SplParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SplParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SplParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SplParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#comp_res}.
	 * @param ctx the parse tree
	 */
	void enterComp_res(SplParser.Comp_resContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#comp_res}.
	 * @param ctx the parse tree
	 */
	void exitComp_res(SplParser.Comp_resContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#bool_ops}.
	 * @param ctx the parse tree
	 */
	void enterBool_ops(SplParser.Bool_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#bool_ops}.
	 * @param ctx the parse tree
	 */
	void exitBool_ops(SplParser.Bool_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#log_ops}.
	 * @param ctx the parse tree
	 */
	void enterLog_ops(SplParser.Log_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#log_ops}.
	 * @param ctx the parse tree
	 */
	void exitLog_ops(SplParser.Log_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#asn_numbers}.
	 * @param ctx the parse tree
	 */
	void enterAsn_numbers(SplParser.Asn_numbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#asn_numbers}.
	 * @param ctx the parse tree
	 */
	void exitAsn_numbers(SplParser.Asn_numbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SplParser#array_bracks}.
	 * @param ctx the parse tree
	 */
	void enterArray_bracks(SplParser.Array_bracksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#array_bracks}.
	 * @param ctx the parse tree
	 */
	void exitArray_bracks(SplParser.Array_bracksContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SplParser#comp_ops}.
	 * @param ctx the parse tree
	 */
	void enterComp_ops(SplParser.Comp_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SplParser#comp_ops}.
	 * @param ctx the parse tree
	 */
	void exitComp_ops(SplParser.Comp_opsContext ctx);
}