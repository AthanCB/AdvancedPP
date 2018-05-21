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
		DIGIT=47, PNAME=48, STRING=49, COMMENT=50, WS=51;
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
		"ASSIGN", "GTEQ", "LTEQ", "NEQ", "LETTER", "DIGIT", "PNAME", "STRING", 
		"COMMENT", "WS"
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
		"ASSIGN", "GTEQ", "LTEQ", "NEQ", "LETTER", "DIGIT", "PNAME", "STRING", 
		"COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\6/\u0118\n/\r/\16/\u0119"+
		"\3\60\6\60\u011d\n\60\r\60\16\60\u011e\3\61\6\61\u0122\n\61\r\61\16\61"+
		"\u0123\3\61\7\61\u0127\n\61\f\61\16\61\u012a\13\61\3\62\3\62\3\62\3\62"+
		"\7\62\u0130\n\62\f\62\16\62\u0133\13\62\3\62\3\62\3\63\3\63\7\63\u0139"+
		"\n\63\f\63\16\63\u013c\13\63\3\63\3\63\3\63\3\63\3\64\6\64\u0143\n\64"+
		"\r\64\16\64\u0144\3\64\3\64\3\u013a\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65\3\2\7\4\2C\\c|\3\2\62;\6\2\f\f\17\17$$^"+
		"^\4\2$$^^\5\2\13\f\17\17\"\"\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3i\3\2\2\2\5q\3\2\2\2\7y\3\2\2\2\t\u0081\3\2\2\2\13\u0088\3\2\2\2"+
		"\r\u008e\3\2\2\2\17\u0091\3\2\2\2\21\u0096\3\2\2\2\23\u009c\3\2\2\2\25"+
		"\u009f\3\2\2\2\27\u00a4\3\2\2\2\31\u00a9\3\2\2\2\33\u00b1\3\2\2\2\35\u00b7"+
		"\3\2\2\2\37\u00ba\3\2\2\2!\u00bf\3\2\2\2#\u00c3\3\2\2\2%\u00c8\3\2\2\2"+
		"\'\u00ce\3\2\2\2)\u00d2\3\2\2\2+\u00d6\3\2\2\2-\u00d9\3\2\2\2/\u00dd\3"+
		"\2\2\2\61\u00e2\3\2\2\2\63\u00e8\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2"+
		"\2\29\u00ee\3\2\2\2;\u00f0\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6"+
		"\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K"+
		"\u0100\3\2\2\2M\u0102\3\2\2\2O\u0104\3\2\2\2Q\u0106\3\2\2\2S\u0108\3\2"+
		"\2\2U\u010a\3\2\2\2W\u010d\3\2\2\2Y\u0110\3\2\2\2[\u0113\3\2\2\2]\u0117"+
		"\3\2\2\2_\u011c\3\2\2\2a\u0121\3\2\2\2c\u012b\3\2\2\2e\u0136\3\2\2\2g"+
		"\u0142\3\2\2\2ij\7R\2\2jk\7T\2\2kl\7Q\2\2lm\7I\2\2mn\7T\2\2no\7C\2\2o"+
		"p\7O\2\2p\4\3\2\2\2qr\7K\2\2rs\7P\2\2st\7V\2\2tu\7G\2\2uv\7I\2\2vw\7G"+
		"\2\2wx\7T\2\2x\6\3\2\2\2yz\7D\2\2z{\7Q\2\2{|\7Q\2\2|}\7N\2\2}~\7G\2\2"+
		"~\177\7C\2\2\177\u0080\7P\2\2\u0080\b\3\2\2\2\u0081\u0082\7U\2\2\u0082"+
		"\u0083\7V\2\2\u0083\u0084\7T\2\2\u0084\u0085\7K\2\2\u0085\u0086\7P\2\2"+
		"\u0086\u0087\7I\2\2\u0087\n\3\2\2\2\u0088\u0089\7C\2\2\u0089\u008a\7T"+
		"\2\2\u008a\u008b\7T\2\2\u008b\u008c\7C\2\2\u008c\u008d\7[\2\2\u008d\f"+
		"\3\2\2\2\u008e\u008f\7Q\2\2\u008f\u0090\7H\2\2\u0090\16\3\2\2\2\u0091"+
		"\u0092\7T\2\2\u0092\u0093\7G\2\2\u0093\u0094\7C\2\2\u0094\u0095\7F\2\2"+
		"\u0095\20\3\2\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7T\2\2\u0098\u0099\7"+
		"K\2\2\u0099\u009a\7V\2\2\u009a\u009b\7G\2\2\u009b\22\3\2\2\2\u009c\u009d"+
		"\7K\2\2\u009d\u009e\7H\2\2\u009e\24\3\2\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1"+
		"\7J\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7P\2\2\u00a3\26\3\2\2\2\u00a4\u00a5"+
		"\7G\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7G\2\2\u00a8"+
		"\30\3\2\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac\7U\2\2\u00ac"+
		"\u00ad\7G\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7H\2"+
		"\2\u00b0\32\3\2\2\2\u00b1\u00b2\7Y\2\2\u00b2\u00b3\7J\2\2\u00b3\u00b4"+
		"\7K\2\2\u00b4\u00b5\7N\2\2\u00b5\u00b6\7G\2\2\u00b6\34\3\2\2\2\u00b7\u00b8"+
		"\7F\2\2\u00b8\u00b9\7Q\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc"+
		"\7Z\2\2\u00bc\u00bd\7K\2\2\u00bd\u00be\7V\2\2\u00be \3\2\2\2\u00bf\u00c0"+
		"\7X\2\2\u00c0\u00c1\7C\2\2\u00c1\u00c2\7T\2\2\u00c2\"\3\2\2\2\u00c3\u00c4"+
		"\7D\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7F\2\2\u00c6\u00c7\7[\2\2\u00c7"+
		"$\3\2\2\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7I\2\2\u00cb"+
		"\u00cc\7K\2\2\u00cc\u00cd\7P\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7G\2\2\u00cf"+
		"\u00d0\7P\2\2\u00d0\u00d1\7F\2\2\u00d1(\3\2\2\2\u00d2\u00d3\7C\2\2\u00d3"+
		"\u00d4\7P\2\2\u00d4\u00d5\7F\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7Q\2\2\u00d7"+
		"\u00d8\7T\2\2\u00d8,\3\2\2\2\u00d9\u00da\7P\2\2\u00da\u00db\7Q\2\2\u00db"+
		"\u00dc\7V\2\2\u00dc.\3\2\2\2\u00dd\u00de\7V\2\2\u00de\u00df\7T\2\2\u00df"+
		"\u00e0\7W\2\2\u00e0\u00e1\7G\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7H\2\2\u00e3"+
		"\u00e4\7C\2\2\u00e4\u00e5\7N\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e7\7G\2\2"+
		"\u00e7\62\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7/\2"+
		"\2\u00eb\66\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7\61"+
		"\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7\'\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7?"+
		"\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7>\2"+
		"\2\u00f7B\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7+\2\2"+
		"\u00fbF\3\2\2\2\u00fc\u00fd\7.\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7<\2\2\u00ff"+
		"J\3\2\2\2\u0100\u0101\7]\2\2\u0101L\3\2\2\2\u0102\u0103\7_\2\2\u0103N"+
		"\3\2\2\2\u0104\u0105\7~\2\2\u0105P\3\2\2\2\u0106\u0107\7a\2\2\u0107R\3"+
		"\2\2\2\u0108\u0109\7=\2\2\u0109T\3\2\2\2\u010a\u010b\7<\2\2\u010b\u010c"+
		"\7?\2\2\u010cV\3\2\2\2\u010d\u010e\7@\2\2\u010e\u010f\7?\2\2\u010fX\3"+
		"\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7?\2\2\u0112Z\3\2\2\2\u0113\u0114"+
		"\7>\2\2\u0114\u0115\7@\2\2\u0115\\\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"^\3\2\2\2\u011b\u011d\t\3\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f`\3\2\2\2\u0120\u0122\5"+
		"]/\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0127\5_\60\2\u0126\u0125\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0131\7$\2\2\u012c\u0130\n\4\2\2\u012d"+
		"\u012e\7^\2\2\u012e\u0130\t\5\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7$\2\2\u0135d\3\2\2\2\u0136"+
		"\u013a\7}\2\2\u0137\u0139\13\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\7\177\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b"+
		"\63\2\2\u0140f\3\2\2\2\u0141\u0143\t\6\2\2\u0142\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\b\64\2\2\u0147h\3\2\2\2\13\2\u0119\u011e\u0123\u0128\u012f\u0131"+
		"\u013a\u0144\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}