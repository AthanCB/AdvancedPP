package playchecker;

// Generated from C:\GitHub\AdvancedPP\Asn3\PlayChecker\src\playchecker\Play.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, LINE_COMMENT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "LINE_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16w\n\16\r\16\16\16x\3\16"+
		"\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\3\2\3\5\2\13\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2"+
		"\2\5#\3\2\2\2\7-\3\2\2\2\t:\3\2\2\2\13F\3\2\2\2\rL\3\2\2\2\17Y\3\2\2\2"+
		"\21[\3\2\2\2\23`\3\2\2\2\25e\3\2\2\2\27j\3\2\2\2\31p\3\2\2\2\33v\3\2\2"+
		"\2\35\36\7D\2\2\36\37\7T\2\2\37 \7G\2\2 !\7C\2\2!\"\7M\2\2\"\4\3\2\2\2"+
		"#$\7F\2\2$%\7K\2\2%&\7O\2\2&\'\7N\2\2\'(\7K\2\2()\7I\2\2)*\7J\2\2*+\7"+
		"V\2\2+,\7U\2\2,\6\3\2\2\2-.\7U\2\2./\7V\2\2/\60\7T\2\2\60\61\7Q\2\2\61"+
		"\62\7P\2\2\62\63\7I\2\2\63\64\7N\2\2\64\65\7K\2\2\65\66\7I\2\2\66\67\7"+
		"J\2\2\678\7V\2\289\7U\2\29\b\3\2\2\2:;\7Q\2\2;<\7R\2\2<=\7G\2\2=>\7P\2"+
		"\2>?\7E\2\2?@\7W\2\2@A\7T\2\2AB\7V\2\2BC\7C\2\2CD\7K\2\2DE\7P\2\2E\n\3"+
		"\2\2\2FG\7G\2\2GH\7P\2\2HI\7V\2\2IJ\7T\2\2JK\7[\2\2K\f\3\2\2\2LM\7E\2"+
		"\2MN\7N\2\2NO\7Q\2\2OP\7U\2\2PQ\7G\2\2QR\7E\2\2RS\7W\2\2ST\7T\2\2TU\7"+
		"V\2\2UV\7C\2\2VW\7K\2\2WX\7P\2\2X\16\3\2\2\2YZ\7g\2\2Z\20\3\2\2\2[\\\7"+
		"V\2\2\\]\7C\2\2]^\7N\2\2^_\7M\2\2_\22\3\2\2\2`a\7O\2\2ab\7Q\2\2bc\7X\2"+
		"\2cd\7G\2\2d\24\3\2\2\2ef\7G\2\2fg\7Z\2\2gh\7K\2\2hi\7V\2\2i\26\3\2\2"+
		"\2jk\7F\2\2kl\7G\2\2lm\7C\2\2mn\7V\2\2no\7J\2\2o\30\3\2\2\2pq\7\61\2\2"+
		"qr\7\61\2\2rs\3\2\2\2st\b\r\2\2t\32\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\16\2\2{\34\3\2\2\2\4\2x\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}