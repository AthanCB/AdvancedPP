// Generated from Play.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayParser}.
 */
public interface PlayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(PlayParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(PlayParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#theatricalplay}.
	 * @param ctx the parse tree
	 */
	void enterTheatricalplay(PlayParser.TheatricalplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#theatricalplay}.
	 * @param ctx the parse tree
	 */
	void exitTheatricalplay(PlayParser.TheatricalplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#act}.
	 * @param ctx the parse tree
	 */
	void enterAct(PlayParser.ActContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#act}.
	 * @param ctx the parse tree
	 */
	void exitAct(PlayParser.ActContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterScene(PlayParser.SceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitScene(PlayParser.SceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#sceneContinue}.
	 * @param ctx the parse tree
	 */
	void enterSceneContinue(PlayParser.SceneContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#sceneContinue}.
	 * @param ctx the parse tree
	 */
	void exitSceneContinue(PlayParser.SceneContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#precursor}.
	 * @param ctx the parse tree
	 */
	void enterPrecursor(PlayParser.PrecursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#precursor}.
	 * @param ctx the parse tree
	 */
	void exitPrecursor(PlayParser.PrecursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#moreActions}.
	 * @param ctx the parse tree
	 */
	void enterMoreActions(PlayParser.MoreActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#moreActions}.
	 * @param ctx the parse tree
	 */
	void exitMoreActions(PlayParser.MoreActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PlayParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PlayParser.ActionContext ctx);
}