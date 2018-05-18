// Generated from c:\GitHub\AdvancedPP\Asn3\PlayChecker\src\playchecker\Play.g4 by ANTLR 4.7.1
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
		Act=1, Scene=2, SceneContinue=3, Precursor=4, MoreActions=5, Action=6, 
		WS=7, LINE_COMMENT=8, BREAK=9, DIMLIGHTS=10, STRONGLIGHTS=11, OPENCURTAIN=12, 
		ENTRY=13, CLOSECURTAIN=14, TALK=15, MOVE=16, EXIT=17, DEATH=18;
	public static final int
		RULE_init = 0, RULE_theatricalplay = 1;
	public static final String[] ruleNames = {
		"init", "theatricalplay"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Act", "Scene", "SceneContinue", "Precursor", "MoreActions", "Action", 
		"WS", "LINE_COMMENT", "BREAK", "DIMLIGHTS", "STRONGLIGHTS", "OPENCURTAIN", 
		"ENTRY", "CLOSECURTAIN", "TALK", "MOVE", "EXIT", "DEATH"
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
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				theatricalplay();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Act || _la==BREAK );
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
		public TerminalNode BREAK() { return getToken(PlayParser.BREAK, 0); }
		public List<TerminalNode> Act() { return getTokens(PlayParser.Act); }
		public TerminalNode Act(int i) {
			return getToken(PlayParser.Act, i);
		}
		public TheatricalplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theatricalplay; }
	}

	public final TheatricalplayContext theatricalplay() throws RecognitionException {
		TheatricalplayContext _localctx = new TheatricalplayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_theatricalplay);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(9);
					match(Act);
					}
					} 
				}
				setState(14);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(18);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(15);
					match(Act);
					}
					} 
				}
				setState(20);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Act) {
				{
				{
				setState(21);
				match(Act);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(BREAK);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					match(Act);
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					match(Act);
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24+\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\7\3\r\n\3\f\3\16\3\20\13\3\3\3\7\3\23"+
		"\n\3\f\3\16\3\26\13\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\7\3 \n\3"+
		"\f\3\16\3#\13\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\3\2\2\4\2\4\2\2\2.\2\7\3"+
		"\2\2\2\4\16\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t"+
		"\n\3\2\2\2\n\3\3\2\2\2\13\r\7\3\2\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\24\3\2\2\2\20\16\3\2\2\2\21\23\7\3\2\2\22\21\3\2"+
		"\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\32\3\2\2\2\26\24\3\2"+
		"\2\2\27\31\7\3\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35!\7\13\2\2\36 \7\3\2\2\37\36\3\2\2"+
		"\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\7\3\2\2%$"+
		"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2\b\t\16"+
		"\24\32!\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}