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
		WRITE=8, IF=9, THEN=10, ELSE=11, WHILE=12, DO=13, EXIT=14, VAR=15, BODY=16, 
		BEGIN=17, END=18, AND=19, OR=20, NOT=21, TRUE=22, FALSE=23, PLUS=24, MINUS=25, 
		MULTIPLE=26, DIV=27, MOD=28, EQUALS=29, GREATER=30, LESS=31, LFPAR=32, 
		RTPAR=33, COMMA=34, COLON=35, LBRA=36, RBRA=37, S_CONC=38, UNDERSCORE=39, 
		SEMICOLON=40, ASSIGN=41, GTEQ=42, LTEQ=43, NEQ=44, LETTER=45, DIGIT=46, 
		PNAME=47, STRING=48, COMMENT=49, WS=50;
	public static final int
		RULE_init = 0, RULE_mainprogram = 1, RULE_var_dec = 2, RULE_type = 3, 
		RULE_array_type = 4, RULE_s_body = 5, RULE_r_body = 6, RULE_statement = 7, 
		RULE_assign_statement = 8, RULE_ifelse_statement = 9, RULE_if_st = 10, 
		RULE_else_st = 11, RULE_read_statement = 12, RULE_write_statement = 13, 
		RULE_while_statement = 14, RULE_output = 15, RULE_exp = 16, RULE_term = 17, 
		RULE_comp_res = 18, RULE_bool_ops = 19, RULE_log_ops = 20, RULE_asn_numbers = 21, 
		RULE_array_bracks = 22, RULE_id = 23, RULE_comp_ops = 24;
	public static final String[] ruleNames = {
		"init", "mainprogram", "var_dec", "type", "array_type", "s_body", "r_body", 
		"statement", "assign_statement", "ifelse_statement", "if_st", "else_st", 
		"read_statement", "write_statement", "while_statement", "output", "exp", 
		"term", "comp_res", "bool_ops", "log_ops", "asn_numbers", "array_bracks", 
		"id", "comp_ops"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'ARRAY'", "'OF'", 
		"'READ'", "'WRITE'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'EXIT'", 
		"'VAR'", "'BODY'", "'BEGIN'", "'END'", "'AND'", "'OR'", "'NOT'", "'TRUE'", 
		"'FALSE'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'>'", "'<'", "'('", 
		"')'", "','", "':'", "'['", "']'", "'|'", "'_'", "';'", "':='", "'>='", 
		"'<='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "INT_TYPE", "BOOL_TYPE", "STRING_TYPE", "ARRAY", "OF", 
		"READ", "WRITE", "IF", "THEN", "ELSE", "WHILE", "DO", "EXIT", "VAR", "BODY", 
		"BEGIN", "END", "AND", "OR", "NOT", "TRUE", "FALSE", "PLUS", "MINUS", 
		"MULTIPLE", "DIV", "MOD", "EQUALS", "GREATER", "LESS", "LFPAR", "RTPAR", 
		"COMMA", "COLON", "LBRA", "RBRA", "S_CONC", "UNDERSCORE", "SEMICOLON", 
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
			setState(50);
			match(PROGRAM);
			setState(51);
			match(PNAME);
			setState(52);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(54);
				var_dec();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(BODY);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case UNDERSCORE:
			case LETTER:
				{
				setState(61);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(62);
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
			setState(65);
			match(VAR);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				id();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(67);
					match(COMMA);
					setState(68);
					id();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(COLON);
				setState(75);
				type();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(76);
					match(SEMICOLON);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(84); 
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
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(INT_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(STRING_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
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
		public Array_bracksContext array_bracks() {
			return getRuleContext(Array_bracksContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ARRAY);
			setState(93);
			array_bracks();
			setState(94);
			match(OF);
			setState(95);
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
		enterRule(_localctx, 10, RULE_s_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		public List<R_bodyContext> r_body() {
			return getRuleContexts(R_bodyContext.class);
		}
		public R_bodyContext r_body(int i) {
			return getRuleContext(R_bodyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SplParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SplParser.SEMICOLON, i);
		}
		public R_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_body; }
	}

	public final R_bodyContext r_body() throws RecognitionException {
		R_bodyContext _localctx = new R_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_r_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(BEGIN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << EXIT) | (1L << BEGIN) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case READ:
						case WRITE:
						case IF:
						case WHILE:
						case EXIT:
						case UNDERSCORE:
						case LETTER:
							{
							setState(101); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(100);
								statement();
								}
								}
								setState(103); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << EXIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0) );
							}
							break;
						case BEGIN:
							{
							setState(105);
							r_body();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(108);
						match(SEMICOLON);
						}
						} 
					}
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READ:
				case WRITE:
				case IF:
				case WHILE:
				case EXIT:
				case UNDERSCORE:
				case LETTER:
					{
					setState(115);
					statement();
					}
					break;
				case BEGIN:
					{
					setState(116);
					r_body();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(121);
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
		public Ifelse_statementContext ifelse_statement() {
			return getRuleContext(Ifelse_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public TerminalNode EXIT() { return getToken(SplParser.EXIT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				assign_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				ifelse_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				while_statement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				read_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				write_statement();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(EXIT);
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

	public static class Assign_statementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SplParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(SplParser.STRING, 0); }
		public Array_bracksContext array_bracks() {
			return getRuleContext(Array_bracksContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(SplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SplParser.FALSE, 0); }
		public Comp_resContext comp_res() {
			return getRuleContext(Comp_resContext.class,0);
		}
		public Asn_numbersContext asn_numbers() {
			return getRuleContext(Asn_numbersContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			id();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRA) {
				{
				setState(132);
				array_bracks();
				}
			}

			setState(135);
			match(ASSIGN);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case READ:
			case WRITE:
			case IF:
			case ELSE:
			case WHILE:
			case EXIT:
			case END:
			case PLUS:
			case MINUS:
			case UNDERSCORE:
			case SEMICOLON:
			case LETTER:
			case DIGIT:
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(136);
					id();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(139);
					comp_res();
					}
					break;
				}
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(142);
					asn_numbers();
					}
					break;
				}
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(145);
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
				setState(146);
				match(STRING);
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

	public static class Ifelse_statementContext extends ParserRuleContext {
		public If_stContext if_st() {
			return getRuleContext(If_stContext.class,0);
		}
		public Else_stContext else_st() {
			return getRuleContext(Else_stContext.class,0);
		}
		public Ifelse_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_statement; }
	}

	public final Ifelse_statementContext ifelse_statement() throws RecognitionException {
		Ifelse_statementContext _localctx = new Ifelse_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifelse_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			if_st();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(150);
				else_st();
				}
				break;
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

	public static class If_stContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SplParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SplParser.THEN, 0); }
		public S_bodyContext s_body() {
			return getRuleContext(S_bodyContext.class,0);
		}
		public R_bodyContext r_body() {
			return getRuleContext(R_bodyContext.class,0);
		}
		public If_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_st; }
	}

	public final If_stContext if_st() throws RecognitionException {
		If_stContext _localctx = new If_stContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			exp();
			setState(155);
			match(THEN);
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case UNDERSCORE:
			case LETTER:
				{
				setState(156);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(157);
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

	public static class Else_stContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SplParser.ELSE, 0); }
		public S_bodyContext s_body() {
			return getRuleContext(S_bodyContext.class,0);
		}
		public R_bodyContext r_body() {
			return getRuleContext(R_bodyContext.class,0);
		}
		public Else_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_st; }
	}

	public final Else_stContext else_st() throws RecognitionException {
		Else_stContext _localctx = new Else_stContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ELSE);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case UNDERSCORE:
			case LETTER:
				{
				setState(161);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(162);
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

	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(SplParser.READ, 0); }
		public TerminalNode LFPAR() { return getToken(SplParser.LFPAR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode RTPAR() { return getToken(SplParser.RTPAR, 0); }
		public List<TerminalNode> NOT() { return getTokens(SplParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(SplParser.NOT, i);
		}
		public Log_opsContext log_ops() {
			return getRuleContext(Log_opsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SplParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SplParser.COMMA, i);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_read_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(READ);
			setState(166);
			match(LFPAR);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(167);
				match(NOT);
				}
				break;
			case AND:
			case OR:
				{
				setState(168);
				log_ops();
				}
				break;
			case UNDERSCORE:
			case LETTER:
				break;
			default:
				break;
			}
			setState(171);
			id();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(173);
					match(NOT);
					}
				}

				setState(176);
				id();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RTPAR);
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

	public static class Write_statementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(SplParser.WRITE, 0); }
		public TerminalNode LFPAR() { return getToken(SplParser.LFPAR, 0); }
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public TerminalNode RTPAR() { return getToken(SplParser.RTPAR, 0); }
		public List<TerminalNode> NOT() { return getTokens(SplParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(SplParser.NOT, i);
		}
		public List<Log_opsContext> log_ops() {
			return getRuleContexts(Log_opsContext.class);
		}
		public Log_opsContext log_ops(int i) {
			return getRuleContext(Log_opsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SplParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SplParser.COMMA, i);
		}
		public List<Comp_opsContext> comp_ops() {
			return getRuleContexts(Comp_opsContext.class);
		}
		public Comp_opsContext comp_ops(int i) {
			return getRuleContext(Comp_opsContext.class,i);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WRITE);
			setState(185);
			match(LFPAR);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(186);
				match(NOT);
				}
			}

			setState(189);
			output();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << COMMA) | (1L << S_CONC) | (1L << GTEQ) | (1L << LTEQ) | (1L << NEQ))) != 0)) {
				{
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
				case OR:
					{
					setState(190);
					log_ops();
					}
					break;
				case COMMA:
					{
					setState(191);
					match(COMMA);
					}
					break;
				case DIV:
				case MOD:
				case EQUALS:
				case GREATER:
				case LESS:
				case S_CONC:
				case GTEQ:
				case LTEQ:
				case NEQ:
					{
					setState(192);
					comp_ops();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(195);
					match(NOT);
					}
				}

				setState(198);
				output();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RTPAR);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SplParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DO() { return getToken(SplParser.DO, 0); }
		public S_bodyContext s_body() {
			return getRuleContext(S_bodyContext.class,0);
		}
		public R_bodyContext r_body() {
			return getRuleContext(R_bodyContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(WHILE);
			setState(207);
			exp();
			setState(208);
			match(DO);
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case EXIT:
			case UNDERSCORE:
			case LETTER:
				{
				setState(209);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(210);
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

	public static class OutputContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(SplParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SplParser.STRING, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SplParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SplParser.DIGIT, i);
		}
		public List<Bool_opsContext> bool_ops() {
			return getRuleContexts(Bool_opsContext.class);
		}
		public Bool_opsContext bool_ops(int i) {
			return getRuleContext(Bool_opsContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(213);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(214);
					match(DIGIT);
					}
					break;
				case 3:
					{
					setState(215);
					bool_ops();
					}
					break;
				case 4:
					{
					setState(216);
					id();
					}
					break;
				case 5:
					{
					setState(217);
					exp();
					}
					break;
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT) | (1L << STRING))) != 0) );
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

	public static class ExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Log_opsContext log_ops() {
			return getRuleContext(Log_opsContext.class,0);
		}
		public Comp_opsContext comp_ops() {
			return getRuleContext(Comp_opsContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			term();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(223);
				log_ops();
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(226);
				comp_ops();
				}
				break;
			}
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(229);
				term();
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public Bool_opsContext bool_ops() {
			return getRuleContext(Bool_opsContext.class,0);
		}
		public Comp_resContext comp_res() {
			return getRuleContext(Comp_resContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				bool_ops();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				comp_res();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				id();
				}
				break;
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

	public static class Comp_resContext extends ParserRuleContext {
		public List<Asn_numbersContext> asn_numbers() {
			return getRuleContexts(Asn_numbersContext.class);
		}
		public Asn_numbersContext asn_numbers(int i) {
			return getRuleContext(Asn_numbersContext.class,i);
		}
		public TerminalNode DIV() { return getToken(SplParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SplParser.MOD, 0); }
		public TerminalNode MINUS() { return getToken(SplParser.MINUS, 0); }
		public TerminalNode AND() { return getToken(SplParser.AND, 0); }
		public TerminalNode MULTIPLE() { return getToken(SplParser.MULTIPLE, 0); }
		public TerminalNode GREATER() { return getToken(SplParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(SplParser.LESS, 0); }
		public TerminalNode GTEQ() { return getToken(SplParser.GTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(SplParser.LTEQ, 0); }
		public TerminalNode NEQ() { return getToken(SplParser.NEQ, 0); }
		public Comp_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_res; }
	}

	public final Comp_resContext comp_res() throws RecognitionException {
		Comp_resContext _localctx = new Comp_resContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comp_res);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			asn_numbers();
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(238);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MINUS) | (1L << MULTIPLE) | (1L << DIV) | (1L << MOD) | (1L << GREATER) | (1L << LESS) | (1L << GTEQ) | (1L << LTEQ) | (1L << NEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				asn_numbers();
				}
				break;
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

	public static class Bool_opsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SplParser.FALSE, 0); }
		public Bool_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_ops; }
	}

	public final Bool_opsContext bool_ops() throws RecognitionException {
		Bool_opsContext _localctx = new Bool_opsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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

	public static class Log_opsContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SplParser.OR, 0); }
		public TerminalNode AND() { return getToken(SplParser.AND, 0); }
		public Log_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_ops; }
	}

	public final Log_opsContext log_ops() throws RecognitionException {
		Log_opsContext _localctx = new Log_opsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_log_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class Asn_numbersContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(SplParser.DIGIT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SplParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SplParser.MINUS, 0); }
		public Asn_numbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asn_numbers; }
	}

	public final Asn_numbersContext asn_numbers() throws RecognitionException {
		Asn_numbersContext _localctx = new Asn_numbersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asn_numbers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(246);
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

			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(249);
				match(DIGIT);
				}
				break;
			case UNDERSCORE:
			case LETTER:
				{
				setState(250);
				id();
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

	public static class Array_bracksContext extends ParserRuleContext {
		public TerminalNode LBRA() { return getToken(SplParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(SplParser.RBRA, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SplParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SplParser.DIGIT, i);
		}
		public Array_bracksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_bracks; }
	}

	public final Array_bracksContext array_bracks() throws RecognitionException {
		Array_bracksContext _localctx = new Array_bracksContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_bracks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LBRA);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
				case LETTER:
					{
					setState(254);
					id();
					}
					break;
				case DIGIT:
					{
					setState(255);
					match(DIGIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT))) != 0) );
			setState(260);
			match(RBRA);
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
		enterRule(_localctx, 46, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNDERSCORE) {
				{
				{
				setState(262);
				match(UNDERSCORE);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(LETTER);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
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
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class Comp_opsContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(SplParser.EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(SplParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(SplParser.LESS, 0); }
		public TerminalNode NEQ() { return getToken(SplParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(SplParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(SplParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(SplParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SplParser.MOD, 0); }
		public TerminalNode S_CONC() { return getToken(SplParser.S_CONC, 0); }
		public Comp_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_ops; }
	}

	public final Comp_opsContext comp_ops() throws RecognitionException {
		Comp_opsContext _localctx = new Comp_opsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comp_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << S_CONC) | (1L << GTEQ) | (1L << LTEQ) | (1L << NEQ))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0118\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\7\4P\n\4\f\4"+
		"\16\4S\13\4\6\4U\n\4\r\4\16\4V\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\6\bh\n\b\r\b\16\bi\3\b\5\bm\n\b\3\b\3\b\7\bq\n"+
		"\b\f\b\16\bt\13\b\3\b\3\b\5\bx\n\b\5\bz\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0084\n\t\3\n\3\n\5\n\u0088\n\n\3\n\3\n\5\n\u008c\n\n\3\n\5"+
		"\n\u008f\n\n\3\n\5\n\u0092\n\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\5\13\u009a"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\5\r\u00a6\n\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00ac\n\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\7"+
		"\16\u00b4\n\16\f\16\16\16\u00b7\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u00be"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\17\5\17\u00c7\n\17\3\17\7"+
		"\17\u00ca\n\17\f\17\16\17\u00cd\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00d6\n\20\3\21\3\21\3\21\3\21\3\21\6\21\u00dd\n\21\r\21\16\21"+
		"\u00de\3\22\3\22\5\22\u00e3\n\22\3\22\5\22\u00e6\n\22\3\22\5\22\u00e9"+
		"\n\22\3\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\24\5\24\u00f3\n\24\3"+
		"\25\3\25\3\26\3\26\3\27\5\27\u00fa\n\27\3\27\3\27\5\27\u00fe\n\27\3\30"+
		"\3\30\3\30\6\30\u0103\n\30\r\30\16\30\u0104\3\30\3\30\3\31\7\31\u010a"+
		"\n\31\f\31\16\31\u010d\13\31\3\31\3\31\7\31\u0111\n\31\f\31\16\31\u0114"+
		"\13\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\b\3\2\30\31\6\2\25\25\33\36 !,.\3\2\25\26\3\2\32\33\4\2"+
		"))/\60\5\2\35!((,.\2\u0134\2\64\3\2\2\2\4;\3\2\2\2\6C\3\2\2\2\b\\\3\2"+
		"\2\2\n^\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2"+
		"\2\24\u0097\3\2\2\2\26\u009b\3\2\2\2\30\u00a2\3\2\2\2\32\u00a7\3\2\2\2"+
		"\34\u00ba\3\2\2\2\36\u00d0\3\2\2\2 \u00dc\3\2\2\2\"\u00e0\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u00ef\3\2\2\2(\u00f4\3\2\2\2*\u00f6\3\2\2\2,\u00f9\3\2\2\2."+
		"\u00ff\3\2\2\2\60\u010b\3\2\2\2\62\u0115\3\2\2\2\64\65\7\3\2\2\65\66\7"+
		"\61\2\2\66\67\5\4\3\2\67\3\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>A\7\22\2\2?B\5\f\7\2@B\5\16\b\2A?\3"+
		"\2\2\2A@\3\2\2\2B\5\3\2\2\2CT\7\21\2\2DI\5\60\31\2EF\7$\2\2FH\5\60\31"+
		"\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7%\2"+
		"\2MQ\5\b\5\2NP\7*\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2TD\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2X]\7\4"+
		"\2\2Y]\7\5\2\2Z]\7\6\2\2[]\5\n\6\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\"+
		"[\3\2\2\2]\t\3\2\2\2^_\7\7\2\2_`\5.\30\2`a\7\b\2\2ab\5\b\5\2b\13\3\2\2"+
		"\2cd\5\20\t\2d\r\3\2\2\2ey\7\23\2\2fh\5\20\t\2gf\3\2\2\2hi\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jm\3\2\2\2km\5\16\b\2lg\3\2\2\2lk\3\2\2\2mn\3\2\2\2no"+
		"\7*\2\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sw\3\2\2\2tr"+
		"\3\2\2\2ux\5\20\t\2vx\5\16\b\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2yr\3\2\2\2"+
		"yz\3\2\2\2z{\3\2\2\2{|\7\24\2\2|\17\3\2\2\2}\u0084\5\22\n\2~\u0084\5\24"+
		"\13\2\177\u0084\5\36\20\2\u0080\u0084\5\32\16\2\u0081\u0084\5\34\17\2"+
		"\u0082\u0084\7\20\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2"+
		"\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\21"+
		"\3\2\2\2\u0085\u0087\5\60\31\2\u0086\u0088\5.\30\2\u0087\u0086\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0095\7+\2\2\u008a\u008c"+
		"\5\60\31\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2"+
		"\u008d\u008f\5&\24\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u0092\5,\27\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0096\3\2\2\2\u0093\u0096\t\2\2\2\u0094\u0096\7\62\2\2\u0095\u008b\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097"+
		"\u0099\5\26\f\2\u0098\u009a\5\30\r\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\25\3\2\2\2\u009b\u009c\7\13\2\2\u009c\u009d\5\"\22\2\u009d"+
		"\u00a0\7\f\2\2\u009e\u00a1\5\f\7\2\u009f\u00a1\5\16\b\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a5\7\r\2\2\u00a3"+
		"\u00a6\5\f\7\2\u00a4\u00a6\5\16\b\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00ab\7\"\2\2\u00a9"+
		"\u00ac\7\27\2\2\u00aa\u00ac\5*\26\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b5\5\60\31\2\u00ae"+
		"\u00b0\7$\2\2\u00af\u00b1\7\27\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00ae\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\33\3\2\2\2\u00ba\u00bb"+
		"\7\n\2\2\u00bb\u00bd\7\"\2\2\u00bc\u00be\7\27\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00cb\5 \21\2\u00c0\u00c4"+
		"\5*\26\2\u00c1\u00c4\7$\2\2\u00c2\u00c4\5\62\32\2\u00c3\u00c0\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7"+
		"\7\27\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00ca\5 \21\2\u00c9\u00c3\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\7#\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\5\"\22"+
		"\2\u00d2\u00d5\7\17\2\2\u00d3\u00d6\5\f\7\2\u00d4\u00d6\5\16\b\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\37\3\2\2\2\u00d7\u00dd\7\62\2"+
		"\2\u00d8\u00dd\7\60\2\2\u00d9\u00dd\5(\25\2\u00da\u00dd\5\60\31\2\u00db"+
		"\u00dd\5\"\22\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e2\5$\23\2"+
		"\u00e1\u00e3\5*\26\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e6\5\62\32\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5$\23\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00ee\5(\25\2\u00eb\u00ee\5&\24\2\u00ec"+
		"\u00ee\5\60\31\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee%\3\2\2\2\u00ef\u00f2\5,\27\2\u00f0\u00f1\t\3\2\2\u00f1\u00f3"+
		"\5,\27\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\'\3\2\2\2\u00f4"+
		"\u00f5\t\2\2\2\u00f5)\3\2\2\2\u00f6\u00f7\t\4\2\2\u00f7+\3\2\2\2\u00f8"+
		"\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00fe\7\60\2\2\u00fc\u00fe\5\60\31\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe-\3\2\2\2\u00ff\u0102\7&\2\2\u0100\u0103\5\60\31\2"+
		"\u0101\u0103\7\60\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7\'\2\2\u0107/\3\2\2\2\u0108\u010a\7)\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u0112\7/\2\2\u010f\u0111\t\6\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\61\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\t\7\2\2\u0116\63"+
		"\3\2\2\2+;AIQV\\ilrwy\u0083\u0087\u008b\u008e\u0091\u0095\u0099\u00a0"+
		"\u00a5\u00ab\u00b0\u00b5\u00bd\u00c3\u00c6\u00cb\u00d5\u00dc\u00de\u00e2"+
		"\u00e5\u00e8\u00ed\u00f2\u00f9\u00fd\u0102\u0104\u010b\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}