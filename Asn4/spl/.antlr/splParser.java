// Generated from c:\GitHub\AdvancedPP\Asn4\spl\Spl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SplParser extends Parser {
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
	public static final int
		RULE_init = 0, RULE_mainprogram = 1, RULE_var_dec = 2, RULE_s_body = 3, 
		RULE_r_body = 4, RULE_statement = 5, RULE_assign_statement = 6, RULE_type = 7, 
		RULE_array_type = 8, RULE_id = 9;
	public static final String[] ruleNames = {
		"init", "mainprogram", "var_dec", "s_body", "r_body", "statement", "assign_statement", 
		"type", "array_type", "id"
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

	@Override
	public String getGrammarFileName() { return "Spl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SplParser.PROGRAM, 0); }
		public TerminalNode PNAME() { return getToken(SplParser.PNAME, 0); }
		public MainprogramContext mainprogram() {
			return getRuleContext(MainprogramContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PROGRAM);
			setState(21);
			match(PNAME);
			setState(22);
			mainprogram();
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

	public static class MainprogramContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(SplParser.BODY, 0); }
		public S_bodyContext s_body() {
			return getRuleContext(S_bodyContext.class,0);
		}
		public R_bodyContext r_body() {
			return getRuleContext(R_bodyContext.class,0);
		}
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public MainprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainprogram; }
	}

	public final MainprogramContext mainprogram() throws RecognitionException {
		MainprogramContext _localctx = new MainprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainprogram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(24);
				var_dec();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(BODY);
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case LETTER:
				{
				setState(31);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(32);
				r_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Var_decContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SplParser.VAR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(SplParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SplParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SplParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SplParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SplParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SplParser.SEMICOLON, i);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VAR);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				id();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(37);
					match(COMMA);
					setState(38);
					id();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(COLON);
				setState(45);
				type();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(46);
					match(SEMICOLON);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNDERSCORE || _la==LETTER );
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

	public static class S_bodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public S_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_body; }
	}

	public final S_bodyContext s_body() throws RecognitionException {
		S_bodyContext _localctx = new S_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_s_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			statement();
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

	public static class R_bodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SplParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SplParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public R_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_body; }
	}

	public final R_bodyContext r_body() throws RecognitionException {
		R_bodyContext _localctx = new R_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_r_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BEGIN);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNDERSCORE || _la==LETTER );
			setState(64);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			assign_statement();
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

	public static class Assign_statementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SplParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SplParser.ASSIGN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SplParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SplParser.SEMICOLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SplParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SplParser.STRING, i);
		}
		public List<TerminalNode> ARRAY_BRACKS() { return getTokens(SplParser.ARRAY_BRACKS); }
		public TerminalNode ARRAY_BRACKS(int i) {
			return getToken(SplParser.ARRAY_BRACKS, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(SplParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(SplParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(SplParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(SplParser.FALSE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SplParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SplParser.DIGIT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SplParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SplParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SplParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SplParser.MINUS, i);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					id();
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARRAY_BRACKS) {
						{
						setState(69);
						match(ARRAY_BRACKS);
						}
					}

					setState(72);
					match(ASSIGN);
					setState(92);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
					case MINUS:
					case UNDERSCORE:
					case LETTER:
					case DIGIT:
						{
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==UNDERSCORE || _la==LETTER) {
							{
							{
							setState(73);
							id();
							}
							}
							setState(78);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==PLUS || _la==MINUS) {
							{
							{
							setState(79);
							_la = _input.LA(1);
							if ( !(_la==PLUS || _la==MINUS) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(84);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(85);
							match(DIGIT);
							}
							}
							setState(88); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==DIGIT );
						}
						break;
					case TRUE:
					case FALSE:
						{
						setState(90);
						_la = _input.LA(1);
						if ( !(_la==TRUE || _la==FALSE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case STRING:
						{
						setState(91);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(SplParser.INT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(SplParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(SplParser.STRING_TYPE, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(INT_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(STRING_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				array_type();
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SplParser.ARRAY, 0); }
		public TerminalNode ARRAY_BRACKS() { return getToken(SplParser.ARRAY_BRACKS, 0); }
		public TerminalNode OF() { return getToken(SplParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ARRAY);
			setState(107);
			match(ARRAY_BRACKS);
			setState(108);
			match(OF);
			setState(109);
			type();
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(SplParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(SplParser.LETTER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(SplParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(SplParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SplParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SplParser.DIGIT, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNDERSCORE) {
				{
				{
				setState(111);
				match(UNDERSCORE);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(LETTER);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\4\7\4\62\n\4\f\4"+
		"\16\4\65\13\4\6\4\67\n\4\r\4\16\48\3\5\3\5\3\6\3\6\6\6?\n\6\r\6\16\6@"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\5\bI\n\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b"+
		"\7\bS\n\b\f\b\16\bV\13\b\3\b\6\bY\n\b\r\b\16\bZ\3\b\3\b\5\b_\n\b\3\b\3"+
		"\b\6\bc\n\b\r\b\16\bd\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\7\13s\n\13\f\13\16\13v\13\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3"+
		"\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\33\34\3\2\31\32\4\2**\60\61"+
		"\2\u0086\2\26\3\2\2\2\4\35\3\2\2\2\6%\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\f"+
		"D\3\2\2\2\16b\3\2\2\2\20j\3\2\2\2\22l\3\2\2\2\24t\3\2\2\2\26\27\7\3\2"+
		"\2\27\30\7\62\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2"+
		"\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2"+
		" #\7\23\2\2!$\5\b\5\2\"$\5\n\6\2#!\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%\66\7"+
		"\22\2\2&+\5\24\13\2\'(\7%\2\2(*\5\24\13\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7&\2\2/\63\5\20\t\2\60\62\7+\2\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\66&\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:"+
		";\5\f\7\2;\t\3\2\2\2<>\7\24\2\2=?\5\f\7\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AB\3\2\2\2BC\7\25\2\2C\13\3\2\2\2DE\5\16\b\2E\r\3\2\2\2FH"+
		"\5\24\13\2GI\7\63\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J^\7,\2\2KM\5\24\13"+
		"\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\t\2\2"+
		"\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WY\7\61"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\_\t\3\2\2]_\7"+
		"\64\2\2^N\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`a\7+\2\2ac\3\2\2\2bF"+
		"\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2fk\7\4\2\2gk\7\5\2\2"+
		"hk\7\6\2\2ik\5\22\n\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\21\3\2"+
		"\2\2lm\7\7\2\2mn\7\63\2\2no\7\b\2\2op\5\20\t\2p\23\3\2\2\2qs\7*\2\2rq"+
		"\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2w{\7\60\2\2"+
		"xz\t\4\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\25\3\2\2\2}{\3\2\2"+
		"\2\21\35#+\638@HNTZ^djt{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}