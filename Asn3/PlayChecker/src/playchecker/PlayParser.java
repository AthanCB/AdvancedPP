package playchecker;

// Generated from C:\GitHub\AdvancedPP\Asn3\PlayChecker\src\playchecker\Play.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, LINE_COMMENT=12, WS=13;
	public static final int
		RULE_reg = 0, RULE_theatricalplay = 1, RULE_act = 2, RULE_scene = 3, RULE_scenecontinue = 4, 
		RULE_precursor = 5, RULE_moreactions = 6, RULE_action = 7;
	public static final String[] ruleNames = {
		"reg", "theatricalplay", "act", "scene", "scenecontinue", "precursor", 
		"moreactions", "action"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BREAK'", "'DIMLIGHTS'", "'STRONGLIGHTS'", "'OPENCURTAIN'", "'ENTRY'", 
		"'CLOSECURTAIN'", "'e'", "'TALK'", "'MOVE'", "'EXIT'", "'DEATH'", "'//'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"LINE_COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Play.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RegContext extends ParserRuleContext {
		public TheatricalplayContext theatricalplay() {
			return getRuleContext(TheatricalplayContext.class,0);
		}
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitReg(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			theatricalplay();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheatricalplayContext extends ParserRuleContext {
		public List<ActContext> act() {
			return getRuleContexts(ActContext.class);
		}
		public ActContext act(int i) {
			return getRuleContext(ActContext.class,i);
		}
		public TheatricalplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theatricalplay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterTheatricalplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitTheatricalplay(this);
		}
	}

	public final TheatricalplayContext theatricalplay() throws RecognitionException {
		TheatricalplayContext _localctx = new TheatricalplayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_theatricalplay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			act();
			setState(19);
			act();
			setState(20);
			act();
			setState(21);
			match(T__0);
			setState(22);
			act();
			setState(23);
			act();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActContext extends ParserRuleContext {
		public SceneContext scene() {
			return getRuleContext(SceneContext.class,0);
		}
		public ScenecontinueContext scenecontinue() {
			return getRuleContext(ScenecontinueContext.class,0);
		}
		public ActContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterAct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitAct(this);
		}
	}

	public final ActContext act() throws RecognitionException {
		ActContext _localctx = new ActContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_act);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__1);
			setState(26);
			scene();
			setState(27);
			scenecontinue();
			setState(28);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SceneContext extends ParserRuleContext {
		public PrecursorContext precursor() {
			return getRuleContext(PrecursorContext.class,0);
		}
		public MoreactionsContext moreactions() {
			return getRuleContext(MoreactionsContext.class,0);
		}
		public SceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitScene(this);
		}
	}

	public final SceneContext scene() throws RecognitionException {
		SceneContext _localctx = new SceneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scene);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__3);
			setState(31);
			precursor();
			setState(32);
			match(T__4);
			setState(33);
			moreactions();
			setState(34);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScenecontinueContext extends ParserRuleContext {
		public SceneContext scene() {
			return getRuleContext(SceneContext.class,0);
		}
		public ScenecontinueContext scenecontinue() {
			return getRuleContext(ScenecontinueContext.class,0);
		}
		public ScenecontinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenecontinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterScenecontinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitScenecontinue(this);
		}
	}

	public final ScenecontinueContext scenecontinue() throws RecognitionException {
		ScenecontinueContext _localctx = new ScenecontinueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scenecontinue);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				scene();
				setState(37);
				scenecontinue();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecursorContext extends ParserRuleContext {
		public PrecursorContext precursor() {
			return getRuleContext(PrecursorContext.class,0);
		}
		public PrecursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterPrecursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitPrecursor(this);
		}
	}

	public final PrecursorContext precursor() throws RecognitionException {
		PrecursorContext _localctx = new PrecursorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_precursor);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__7);
				setState(43);
				precursor();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreactionsContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public MoreactionsContext moreactions() {
			return getRuleContext(MoreactionsContext.class,0);
		}
		public MoreactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreactions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterMoreactions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitMoreactions(this);
		}
	}

	public final MoreactionsContext moreactions() throws RecognitionException {
		MoreactionsContext _localctx = new MoreactionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moreactions);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				action();
				setState(48);
				moreactions();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\5\6+\n\6\3\7\3\7\3\7\5\7\60\n\7\3\b\3\b\3\b\3\b\5\b\66\n\b\3\t"+
		"\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\7\7\n\r\2\64\2\22\3\2\2\2\4\24"+
		"\3\2\2\2\6\33\3\2\2\2\b \3\2\2\2\n*\3\2\2\2\f/\3\2\2\2\16\65\3\2\2\2\20"+
		"\67\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\5\6\4\2\25\26\5\6\4\2\26"+
		"\27\5\6\4\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\5\6\4\2\32\5\3\2\2\2\33"+
		"\34\7\4\2\2\34\35\5\b\5\2\35\36\5\n\6\2\36\37\7\5\2\2\37\7\3\2\2\2 !\7"+
		"\6\2\2!\"\5\f\7\2\"#\7\7\2\2#$\5\16\b\2$%\7\b\2\2%\t\3\2\2\2&\'\5\b\5"+
		"\2\'(\5\n\6\2(+\3\2\2\2)+\7\t\2\2*&\3\2\2\2*)\3\2\2\2+\13\3\2\2\2,-\7"+
		"\n\2\2-\60\5\f\7\2.\60\7\t\2\2/,\3\2\2\2/.\3\2\2\2\60\r\3\2\2\2\61\62"+
		"\5\20\t\2\62\63\5\16\b\2\63\66\3\2\2\2\64\66\7\t\2\2\65\61\3\2\2\2\65"+
		"\64\3\2\2\2\66\17\3\2\2\2\678\t\2\2\28\21\3\2\2\2\5*/\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}