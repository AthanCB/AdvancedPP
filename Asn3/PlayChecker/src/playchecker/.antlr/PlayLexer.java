// Generated from c:\GitHub\AdvancedPP\Asn3\PlayChecker\src\playchecker\Play.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Act=1, Scene=2, SceneContinue=3, Precursor=4, MoreActions=5, Action=6, 
		WS=7, LINE_COMMENT=8, BREAK=9, DIMLIGHTS=10, STRONGLIGHTS=11, OPENCURTAIN=12, 
		ENTRY=13, CLOSECURTAIN=14, TALK=15, MOVE=16, EXIT=17, DEATH=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Act", "Scene", "SceneContinue", "Precursor", "MoreActions", "Action", 
		"WS", "LINE_COMMENT", "BREAK", "DIMLIGHTS", "STRONGLIGHTS", "OPENCURTAIN", 
		"ENTRY", "CLOSECURTAIN", "TALK", "MOVE", "EXIT", "DEATH"
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


	public PlayLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Play.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\6\b"+
		"S\n\b\r\b\16\bT\3\b\3\b\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\5"+
		"\tc\n\t\3\t\3\t\3\t\3\t\3\n\6\nj\n\n\r\n\16\nk\3\13\6\13o\n\13\r\13\16"+
		"\13p\3\f\6\ft\n\f\r\f\16\fu\3\r\6\ry\n\r\r\r\16\rz\3\16\6\16~\n\16\r\16"+
		"\16\16\177\3\17\6\17\u0083\n\17\r\17\16\17\u0084\3\20\6\20\u0088\n\20"+
		"\r\20\16\20\u0089\3\21\6\21\u008d\n\21\r\21\16\21\u008e\3\22\6\22\u0092"+
		"\n\22\r\22\16\22\u0093\3\23\6\23\u0097\n\23\r\23\16\23\u0098\3^\2\24\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\3\2\4\5\2\13\f\17\17\"\"\3\2C\\\2\u00ad\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\3\'\3\2\2\2\5\66\3\2\2\2\7A\3\2\2\2\tD\3\2\2\2\13G\3\2\2\2\rO\3\2\2\2"+
		"\17R\3\2\2\2\21X\3\2\2\2\23i\3\2\2\2\25n\3\2\2\2\27s\3\2\2\2\31x\3\2\2"+
		"\2\33}\3\2\2\2\35\u0082\3\2\2\2\37\u0087\3\2\2\2!\u008c\3\2\2\2#\u0091"+
		"\3\2\2\2%\u0096\3\2\2\2\'+\5\25\13\2(*\5\5\3\2)(\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\5\7\4\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5\27"+
		"\f\2\65\4\3\2\2\2\66:\5\31\r\2\679\5\t\5\28\67\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\33\16\2>?\5\13\6\2?@\5\35\17\2"+
		"@\6\3\2\2\2AB\5\5\3\2BC\5\7\4\2C\b\3\2\2\2DE\5\37\20\2EF\5\t\5\2F\n\3"+
		"\2\2\2GH\5\r\7\2HI\5\13\6\2I\f\3\2\2\2JP\5\37\20\2KP\5!\21\2LP\5\33\16"+
		"\2MP\5#\22\2NP\5%\23\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2"+
		"\2P\16\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2"+
		"\2\2VW\b\b\2\2W\20\3\2\2\2XY\7\61\2\2YZ\7\61\2\2Z^\3\2\2\2[]\13\2\2\2"+
		"\\[\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2ac\7\17"+
		"\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2ef\3\2\2\2fg\b\t\2\2g\22\3"+
		"\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\24\3\2\2\2m"+
		"o\t\3\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\26\3\2\2\2rt\t\3\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\30\3\2\2\2wy\t\3\2\2xw\3\2"+
		"\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\32\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\34\3\2\2\2\u0081\u0083\t"+
		"\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\36\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a "+
		"\3\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\"\3\2\2\2\u0090\u0092\t\3\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094$\3\2\2\2\u0095\u0097\t\3\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099&\3\2\2\2"+
		"\24\2+\61:OT^bkpuz\177\u0084\u0089\u008e\u0093\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}