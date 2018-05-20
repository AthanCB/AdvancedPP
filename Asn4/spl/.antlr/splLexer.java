// Generated from c:\GitHub\AdvancedPP\Asn4\spl\Spl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INT_TYPE=2, BOOL_TYPE=3, STRING_TYPE=4, ARRAY=5, OF=6, READ=7, 
		WRITE=8, IF=9, THEN=10, ELSE=11, ELSE_IF=12, WHILE=13, DO=14, EXIT=15, 
		VAR=16, BODY=17, BEGIN=18, END=19, AND=20, OR=21, NOT=22, TRUE=23, FALSE=24, 
		PLUS=25, MINUS=26, MULTIPLE=27, DIV=28, MOD=29, EQUALS=30, GREATER=31, 
		LESS=32, LFPAR=33, RTPAR=34, COMMA=35, COLON=36, LBRA=37, RBRA=38, S_CONC=39, 
		UNDERSCORE=40, SEMICOLON=41, ASSIGN=42, GTEQ=43, LTEQ=44, NEQ=45, LETTER=46, 
		DIGIT=47, PNAME=48, ARRAY_BRACKS=49, STRING=50, COMMENT=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "INT_TYPE", "BOOL_TYPE", "STRING_TYPE", "ARRAY", "OF", "READ", 
		"WRITE", "IF", "THEN", "ELSE", "ELSE_IF", "WHILE", "DO", "EXIT", "VAR", 
		"BODY", "BEGIN", "END", "AND", "OR", "NOT", "TRUE", "FALSE", "PLUS", "MINUS", 
		"MULTIPLE", "DIV", "MOD", "EQUALS", "GREATER", "LESS", "LFPAR", "RTPAR", 
		"COMMA", "COLON", "LBRA", "RBRA", "S_CONC", "UNDERSCORE", "SEMICOLON", 
		"ASSIGN", "GTEQ", "LTEQ", "NEQ", "LETTER", "DIGIT", "PNAME", "ARRAY_BRACKS", 
		"STRING", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'ARRAY'", "'OF'", 
		"'READ'", "'WRITE'", "'IF'", "'THEN'", "'ELSE'", "'ELSE IF'", "'WHILE'", 
		"'DO'", "'EXIT'", "'VAR'", "'BODY'", "'BEGIN'", "'END'", "'AND'", "'OR'", 
		"'NOT'", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
		"'>'", "'<'", "'('", "')'", "','", "':'", "'['", "']'", "'|'", "'_'", 
		"';'", "':='", "'>='", "'<='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "INT_TYPE", "BOOL_TYPE", "STRING_TYPE", "ARRAY", "OF", 
		"READ", "WRITE", "IF", "THEN", "ELSE", "ELSE_IF", "WHILE", "DO", "EXIT", 
		"VAR", "BODY", "BEGIN", "END", "AND", "OR", "NOT", "TRUE", "FALSE", "PLUS", 
		"MINUS", "MULTIPLE", "DIV", "MOD", "EQUALS", "GREATER", "LESS", "LFPAR", 
		"RTPAR", "COMMA", "COLON", "LBRA", "RBRA", "S_CONC", "UNDERSCORE", "SEMICOLON", 
		"ASSIGN", "GTEQ", "LTEQ", "NEQ", "LETTER", "DIGIT", "PNAME", "ARRAY_BRACKS", 
		"STRING", "COMMENT", "WS"
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


	public SplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Spl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\6/\u011a\n/\r"+
		"/\16/\u011b\3\60\3\60\3\61\6\61\u0121\n\61\r\61\16\61\u0122\3\61\7\61"+
		"\u0126\n\61\f\61\16\61\u0129\13\61\3\62\3\62\6\62\u012d\n\62\r\62\16\62"+
		"\u012e\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0137\n\63\f\63\16\63\u013a"+
		"\13\63\3\63\3\63\3\64\3\64\7\64\u0140\n\64\f\64\16\64\u0143\13\64\3\64"+
		"\3\64\3\64\3\64\3\65\6\65\u014a\n\65\r\65\16\65\u014b\3\65\3\65\3\u0141"+
		"\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2"+
		"\7\4\2C\\c|\3\2\62;\6\2\f\f\17\17$$^^\4\2$$^^\5\2\13\f\17\17\"\"\2\u0156"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5s\3\2\2"+
		"\2\7{\3\2\2\2\t\u0083\3\2\2\2\13\u008a\3\2\2\2\r\u0090\3\2\2\2\17\u0093"+
		"\3\2\2\2\21\u0098\3\2\2\2\23\u009e\3\2\2\2\25\u00a1\3\2\2\2\27\u00a6\3"+
		"\2\2\2\31\u00ab\3\2\2\2\33\u00b3\3\2\2\2\35\u00b9\3\2\2\2\37\u00bc\3\2"+
		"\2\2!\u00c1\3\2\2\2#\u00c5\3\2\2\2%\u00ca\3\2\2\2\'\u00d0\3\2\2\2)\u00d4"+
		"\3\2\2\2+\u00d8\3\2\2\2-\u00db\3\2\2\2/\u00df\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E"+
		"\u00fc\3\2\2\2G\u00fe\3\2\2\2I\u0100\3\2\2\2K\u0102\3\2\2\2M\u0104\3\2"+
		"\2\2O\u0106\3\2\2\2Q\u0108\3\2\2\2S\u010a\3\2\2\2U\u010c\3\2\2\2W\u010f"+
		"\3\2\2\2Y\u0112\3\2\2\2[\u0115\3\2\2\2]\u0119\3\2\2\2_\u011d\3\2\2\2a"+
		"\u0120\3\2\2\2c\u012a\3\2\2\2e\u0132\3\2\2\2g\u013d\3\2\2\2i\u0149\3\2"+
		"\2\2kl\7R\2\2lm\7T\2\2mn\7Q\2\2no\7I\2\2op\7T\2\2pq\7C\2\2qr\7O\2\2r\4"+
		"\3\2\2\2st\7K\2\2tu\7P\2\2uv\7V\2\2vw\7G\2\2wx\7I\2\2xy\7G\2\2yz\7T\2"+
		"\2z\6\3\2\2\2{|\7D\2\2|}\7Q\2\2}~\7Q\2\2~\177\7N\2\2\177\u0080\7G\2\2"+
		"\u0080\u0081\7C\2\2\u0081\u0082\7P\2\2\u0082\b\3\2\2\2\u0083\u0084\7U"+
		"\2\2\u0084\u0085\7V\2\2\u0085\u0086\7T\2\2\u0086\u0087\7K\2\2\u0087\u0088"+
		"\7P\2\2\u0088\u0089\7I\2\2\u0089\n\3\2\2\2\u008a\u008b\7C\2\2\u008b\u008c"+
		"\7T\2\2\u008c\u008d\7T\2\2\u008d\u008e\7C\2\2\u008e\u008f\7[\2\2\u008f"+
		"\f\3\2\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7H\2\2\u0092\16\3\2\2\2\u0093"+
		"\u0094\7T\2\2\u0094\u0095\7G\2\2\u0095\u0096\7C\2\2\u0096\u0097\7F\2\2"+
		"\u0097\20\3\2\2\2\u0098\u0099\7Y\2\2\u0099\u009a\7T\2\2\u009a\u009b\7"+
		"K\2\2\u009b\u009c\7V\2\2\u009c\u009d\7G\2\2\u009d\22\3\2\2\2\u009e\u009f"+
		"\7K\2\2\u009f\u00a0\7H\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3"+
		"\7J\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7P\2\2\u00a5\26\3\2\2\2\u00a6\u00a7"+
		"\7G\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7G\2\2\u00aa"+
		"\30\3\2\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7U\2\2\u00ae"+
		"\u00af\7G\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7K\2\2\u00b1\u00b2\7H\2"+
		"\2\u00b2\32\3\2\2\2\u00b3\u00b4\7Y\2\2\u00b4\u00b5\7J\2\2\u00b5\u00b6"+
		"\7K\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8\7G\2\2\u00b8\34\3\2\2\2\u00b9\u00ba"+
		"\7F\2\2\u00ba\u00bb\7Q\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be"+
		"\7Z\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7V\2\2\u00c0 \3\2\2\2\u00c1\u00c2"+
		"\7X\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7T\2\2\u00c4\"\3\2\2\2\u00c5\u00c6"+
		"\7D\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7F\2\2\u00c8\u00c9\7[\2\2\u00c9"+
		"$\3\2\2\2\u00ca\u00cb\7D\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7I\2\2\u00cd"+
		"\u00ce\7K\2\2\u00ce\u00cf\7P\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7G\2\2\u00d1"+
		"\u00d2\7P\2\2\u00d2\u00d3\7F\2\2\u00d3(\3\2\2\2\u00d4\u00d5\7C\2\2\u00d5"+
		"\u00d6\7P\2\2\u00d6\u00d7\7F\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7Q\2\2\u00d9"+
		"\u00da\7T\2\2\u00da,\3\2\2\2\u00db\u00dc\7P\2\2\u00dc\u00dd\7Q\2\2\u00dd"+
		"\u00de\7V\2\2\u00de.\3\2\2\2\u00df\u00e0\7V\2\2\u00e0\u00e1\7T\2\2\u00e1"+
		"\u00e2\7W\2\2\u00e2\u00e3\7G\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7H\2\2\u00e5"+
		"\u00e6\7C\2\2\u00e6\u00e7\7N\2\2\u00e7\u00e8\7U\2\2\u00e8\u00e9\7G\2\2"+
		"\u00e9\62\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7/\2"+
		"\2\u00ed\66\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7\61"+
		"\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7?"+
		"\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7>\2"+
		"\2\u00f9B\3\2\2\2\u00fa\u00fb\7*\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7+\2\2"+
		"\u00fdF\3\2\2\2\u00fe\u00ff\7.\2\2\u00ffH\3\2\2\2\u0100\u0101\7<\2\2\u0101"+
		"J\3\2\2\2\u0102\u0103\7]\2\2\u0103L\3\2\2\2\u0104\u0105\7_\2\2\u0105N"+
		"\3\2\2\2\u0106\u0107\7~\2\2\u0107P\3\2\2\2\u0108\u0109\7a\2\2\u0109R\3"+
		"\2\2\2\u010a\u010b\7=\2\2\u010bT\3\2\2\2\u010c\u010d\7<\2\2\u010d\u010e"+
		"\7?\2\2\u010eV\3\2\2\2\u010f\u0110\7@\2\2\u0110\u0111\7?\2\2\u0111X\3"+
		"\2\2\2\u0112\u0113\7>\2\2\u0113\u0114\7?\2\2\u0114Z\3\2\2\2\u0115\u0116"+
		"\7>\2\2\u0116\u0117\7@\2\2\u0117\\\3\2\2\2\u0118\u011a\t\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"^\3\2\2\2\u011d\u011e\t\3\2\2\u011e`\3\2\2\2\u011f\u0121\5]/\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0127\3\2\2\2\u0124\u0126\5_\60\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012c\5K&\2\u012b\u012d\5_\60\2\u012c\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\5M\'\2\u0131d\3\2\2\2\u0132\u0138\7$\2\2\u0133\u0137"+
		"\n\4\2\2\u0134\u0135\7^\2\2\u0135\u0137\t\5\2\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013c"+
		"f\3\2\2\2\u013d\u0141\7}\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2"+
		"\u0140\u0143\3\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\177\2\2\u0145\u0146\3\2\2\2"+
		"\u0146\u0147\b\64\2\2\u0147h\3\2\2\2\u0148\u014a\t\6\2\2\u0149\u0148\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\b\65\2\2\u014ej\3\2\2\2\13\2\u011b\u0122\u0127"+
		"\u012e\u0136\u0138\u0141\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}