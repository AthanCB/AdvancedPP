package playchecker;

// Generated from C:\GitHub\AdvancedPP\Asn3\PlayChecker\src\playchecker\Play.g4 by ANTLR 4.7.1
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
}