// Generated from Play.g4 by ANTLR 4.7.1
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
		T__9=10, WS=11, LINE_COMMENT=12;
	public static final int
		RULE_init = 0, RULE_theatricalplay = 1, RULE_act = 2, RULE_scene = 3, 
		RULE_sceneContinue = 4, RULE_precursor = 5, RULE_moreActions = 6, RULE_action = 7;
	public static final String[] ruleNames = {
		"init", "theatricalplay", "act", "scene", "sceneContinue", "precursor", 
		"moreActions", "action"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BREAK'", "'DIMLIGHTS'", "'STRONGLIGHTS'", "'OPENCURTAIN'", "'ENTRY'", 
		"'CLOSECURTAIN'", "'TALK'", "'MOVE'", "'EXIT'", "'DEATH'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WS", 
		"LINE_COMMENT"
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
	public static class InitContext extends ParserRuleContext {
		public List<TheatricalplayContext> theatricalplay() {
			return getRuleContexts(TheatricalplayContext.class);
		}
		public TheatricalplayContext theatricalplay(int i) {
			return getRuleContext(TheatricalplayContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				theatricalplay();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			act();
			setState(22);
			act();
			setState(23);
			act();
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(T__0);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(29);
			act();
			setState(30);
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
		public List<SceneContext> scene() {
			return getRuleContexts(SceneContext.class);
		}
		public SceneContext scene(int i) {
			return getRuleContext(SceneContext.class,i);
		}
		public List<SceneContinueContext> sceneContinue() {
			return getRuleContexts(SceneContinueContext.class);
		}
		public SceneContinueContext sceneContinue(int i) {
			return getRuleContext(SceneContinueContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				match(T__1);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					scene();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(42);
				sceneContinue();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		public List<PrecursorContext> precursor() {
			return getRuleContexts(PrecursorContext.class);
		}
		public PrecursorContext precursor(int i) {
			return getRuleContext(PrecursorContext.class,i);
		}
		public List<MoreActionsContext> moreActions() {
			return getRuleContexts(MoreActionsContext.class);
		}
		public MoreActionsContext moreActions(int i) {
			return getRuleContext(MoreActionsContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(T__3);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(55);
				precursor();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					match(T__4);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(66);
				moreActions();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(T__5);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	public static class SceneContinueContext extends ParserRuleContext {
		public SceneContext scene() {
			return getRuleContext(SceneContext.class,0);
		}
		public List<SceneContinueContext> sceneContinue() {
			return getRuleContexts(SceneContinueContext.class);
		}
		public SceneContinueContext sceneContinue(int i) {
			return getRuleContext(SceneContinueContext.class,i);
		}
		public SceneContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sceneContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterSceneContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitSceneContinue(this);
		}
	}

	public final SceneContinueContext sceneContinue() throws RecognitionException {
		SceneContinueContext _localctx = new SceneContinueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sceneContinue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			scene();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					sceneContinue();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class PrecursorContext extends ParserRuleContext {
		public List<PrecursorContext> precursor() {
			return getRuleContexts(PrecursorContext.class);
		}
		public PrecursorContext precursor(int i) {
			return getRuleContext(PrecursorContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__6);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					precursor();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class MoreActionsContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<MoreActionsContext> moreActions() {
			return getRuleContexts(MoreActionsContext.class);
		}
		public MoreActionsContext moreActions(int i) {
			return getRuleContext(MoreActionsContext.class,i);
		}
		public MoreActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreActions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).enterMoreActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayListener ) ((PlayListener)listener).exitMoreActions(this);
		}
	}

	public final MoreActionsContext moreActions() throws RecognitionException {
		MoreActionsContext _localctx = new MoreActionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moreActions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			action();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					moreActions();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\3\3\4\6\4$\n"+
		"\4\r\4\16\4%\3\4\6\4)\n\4\r\4\16\4*\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4"+
		"\3\4\3\5\6\5\66\n\5\r\5\16\5\67\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\6\5A\n"+
		"\5\r\5\16\5B\3\5\7\5F\n\5\f\5\16\5I\13\5\3\5\6\5L\n\5\r\5\16\5M\3\6\3"+
		"\6\7\6R\n\6\f\6\16\6U\13\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\b\3\b\7"+
		"\b`\n\b\f\b\16\bc\13\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\7\7"+
		"\t\f\2k\2\23\3\2\2\2\4\27\3\2\2\2\6#\3\2\2\2\b\65\3\2\2\2\nO\3\2\2\2\f"+
		"V\3\2\2\2\16]\3\2\2\2\20d\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30\5\6\4\2\30\31\5"+
		"\6\4\2\31\33\5\6\4\2\32\34\7\3\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \5\6\4\2 !\5\6\4\2!\5\3\2\2\2\""+
		"$\7\4\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\b\5"+
		"\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+/\3\2\2\2,.\5\n\6\2-,\3\2"+
		"\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63"+
		"\7\5\2\2\63\7\3\2\2\2\64\66\7\6\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28<\3\2\2\29;\5\f\7\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?A\7\7\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2"+
		"BC\3\2\2\2CG\3\2\2\2DF\5\16\b\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2JL\7\b\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2N\t\3\2\2\2OS\5\b\5\2PR\5\n\6\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2T\13\3\2\2\2US\3\2\2\2VZ\7\t\2\2WY\5\f\7\2XW\3\2\2\2Y\\\3\2\2\2ZX"+
		"\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\Z\3\2\2\2]a\5\20\t\2^`\5\16\b\2_^\3\2\2"+
		"\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca\3\2\2\2de\t\2\2\2e\21\3"+
		"\2\2\2\17\25\35%*/\67<BGMSZa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}