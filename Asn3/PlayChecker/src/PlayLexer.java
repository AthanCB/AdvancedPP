// Generated from Play.g4 by ANTLR 4.7.1
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
		T__9=10, WS=11, LINE_COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\6\fn\n\f\r\f\16\fo\3\f\3\f\3\r\3\r\3\r\3\r\7\rx\n\r\f\r\16\r"+
		"{\13\r\3\r\5\r~\n\r\3\r\3\r\3\r\3\r\3y\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\3\2\3\5\2\13\f\17\17\"\"\2\u0085\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\3\33\3\2\2\2\5!\3\2\2\2\7+\3\2\2\2\t8\3\2\2\2\13D\3\2\2\2\rJ\3\2"+
		"\2\2\17W\3\2\2\2\21\\\3\2\2\2\23a\3\2\2\2\25f\3\2\2\2\27m\3\2\2\2\31s"+
		"\3\2\2\2\33\34\7D\2\2\34\35\7T\2\2\35\36\7G\2\2\36\37\7C\2\2\37 \7M\2"+
		"\2 \4\3\2\2\2!\"\7F\2\2\"#\7K\2\2#$\7O\2\2$%\7N\2\2%&\7K\2\2&\'\7I\2\2"+
		"\'(\7J\2\2()\7V\2\2)*\7U\2\2*\6\3\2\2\2+,\7U\2\2,-\7V\2\2-.\7T\2\2./\7"+
		"Q\2\2/\60\7P\2\2\60\61\7I\2\2\61\62\7N\2\2\62\63\7K\2\2\63\64\7I\2\2\64"+
		"\65\7J\2\2\65\66\7V\2\2\66\67\7U\2\2\67\b\3\2\2\289\7Q\2\29:\7R\2\2:;"+
		"\7G\2\2;<\7P\2\2<=\7E\2\2=>\7W\2\2>?\7T\2\2?@\7V\2\2@A\7C\2\2AB\7K\2\2"+
		"BC\7P\2\2C\n\3\2\2\2DE\7G\2\2EF\7P\2\2FG\7V\2\2GH\7T\2\2HI\7[\2\2I\f\3"+
		"\2\2\2JK\7E\2\2KL\7N\2\2LM\7Q\2\2MN\7U\2\2NO\7G\2\2OP\7E\2\2PQ\7W\2\2"+
		"QR\7T\2\2RS\7V\2\2ST\7C\2\2TU\7K\2\2UV\7P\2\2V\16\3\2\2\2WX\7V\2\2XY\7"+
		"C\2\2YZ\7N\2\2Z[\7M\2\2[\20\3\2\2\2\\]\7O\2\2]^\7Q\2\2^_\7X\2\2_`\7G\2"+
		"\2`\22\3\2\2\2ab\7G\2\2bc\7Z\2\2cd\7K\2\2de\7V\2\2e\24\3\2\2\2fg\7F\2"+
		"\2gh\7G\2\2hi\7C\2\2ij\7V\2\2jk\7J\2\2k\26\3\2\2\2ln\t\2\2\2ml\3\2\2\2"+
		"no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\f\2\2r\30\3\2\2\2st\7\61"+
		"\2\2tu\7\61\2\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2|~\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\7\f\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\r\2\2\u0082\32\3"+
		"\2\2\2\6\2oy}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}