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
		DIGIT=47, PNAME=48, STRING=49, COMMENT=50, WS=51;
	public static final int
		RULE_init = 0, RULE_mainprogram = 1, RULE_var_dec = 2, RULE_assign_statement = 3, 
		RULE_statement = 4, RULE_read_statement = 5, RULE_write_statement = 6, 
		RULE_output = 7, RULE_ifelse_statement = 8, RULE_while_statement = 9, 
		RULE_if_st = 10, RULE_else_st = 11, RULE_exp = 12, RULE_term = 13, RULE_comp_res = 14, 
		RULE_s_body = 15, RULE_r_body = 16, RULE_log_ops = 17, RULE_asn_numbers = 18, 
		RULE_type = 19, RULE_array_type = 20, RULE_array_bracks = 21, RULE_id = 22, 
		RULE_comp_ops = 23;
	public static final String[] ruleNames = {
		"init", "mainprogram", "var_dec", "assign_statement", "statement", "read_statement", 
		"write_statement", "output", "ifelse_statement", "while_statement", "if_st", 
		"else_st", "exp", "term", "comp_res", "s_body", "r_body", "log_ops", "asn_numbers", 
		"type", "array_type", "array_bracks", "id", "comp_ops"
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
			setState(48);
			match(PROGRAM);
			setState(49);
			match(PNAME);
			setState(50);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(52);
				var_dec();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(BODY);
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case UNDERSCORE:
			case LETTER:
				{
				setState(59);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(60);
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
			setState(63);
			match(VAR);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				id();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(65);
					match(COMMA);
					setState(66);
					id();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(COLON);
				setState(73);
				type();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(74);
					match(SEMICOLON);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(82); 
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

	public static class Assign_statementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SplParser.ASSIGN, 0); }
		public Asn_numbersContext asn_numbers() {
			return getRuleContext(Asn_numbersContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SplParser.STRING, 0); }
		public Array_bracksContext array_bracks() {
			return getRuleContext(Array_bracksContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(SplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SplParser.FALSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SplParser.SEMICOLON, 0); }
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			id();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRA) {
				{
				setState(85);
				array_bracks();
				}
			}

			setState(88);
			match(ASSIGN);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case UNDERSCORE:
			case LETTER:
			case DIGIT:
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(89);
					id();
					}
					break;
				}
				setState(92);
				asn_numbers();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(93);
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
				setState(94);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(97);
				match(SEMICOLON);
				}
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				assign_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				ifelse_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				while_statement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				read_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				write_statement();
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
		public TerminalNode SEMICOLON() { return getToken(SplParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 10, RULE_read_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(READ);
			setState(108);
			match(LFPAR);
			setState(109);
			id();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				id();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RTPAR);
			setState(118);
			match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(SplParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SplParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SplParser.COMMA, i);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(WRITE);
			setState(121);
			match(LFPAR);
			setState(122);
			output();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				output();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RTPAR);
			setState(131);
			match(SEMICOLON);
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
		public List<Log_opsContext> log_ops() {
			return getRuleContexts(Log_opsContext.class);
		}
		public Log_opsContext log_ops(int i) {
			return getRuleContext(Log_opsContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(133);
					match(STRING);
					}
					break;
				case DIGIT:
					{
					setState(134);
					match(DIGIT);
					}
					break;
				case TRUE:
				case FALSE:
					{
					setState(135);
					log_ops();
					}
					break;
				case UNDERSCORE:
				case LETTER:
					{
					setState(136);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT) | (1L << STRING))) != 0) );
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
		public List<If_stContext> if_st() {
			return getRuleContexts(If_stContext.class);
		}
		public If_stContext if_st(int i) {
			return getRuleContext(If_stContext.class,i);
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
		enterRule(_localctx, 16, RULE_ifelse_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(141);
					if_st();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(146);
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
		enterRule(_localctx, 18, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WHILE);
			setState(150);
			exp();
			setState(151);
			match(DO);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case UNDERSCORE:
			case LETTER:
				{
				setState(152);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(153);
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
			setState(156);
			match(IF);
			setState(157);
			exp();
			setState(158);
			match(THEN);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case UNDERSCORE:
			case LETTER:
				{
				setState(159);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(160);
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
			setState(163);
			match(ELSE);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case IF:
			case WHILE:
			case UNDERSCORE:
			case LETTER:
				{
				setState(164);
				s_body();
				}
				break;
			case BEGIN:
				{
				setState(165);
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

	public static class ExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
		enterRule(_localctx, 24, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			term();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GTEQ) | (1L << LTEQ) | (1L << NEQ))) != 0)) {
				{
				setState(169);
				comp_ops();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				setState(172);
				term();
				}
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
		public Log_opsContext log_ops() {
			return getRuleContext(Log_opsContext.class,0);
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
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				log_ops();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				comp_res();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
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
		public Comp_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_res; }
	}

	public final Comp_resContext comp_res() throws RecognitionException {
		Comp_resContext _localctx = new Comp_resContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comp_res);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			asn_numbers();
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(181);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MINUS) | (1L << MULTIPLE) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
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
		enterRule(_localctx, 30, RULE_s_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 32, RULE_r_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(BEGIN);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				statement();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << UNDERSCORE) | (1L << LETTER))) != 0) );
			setState(193);
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

	public static class Log_opsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SplParser.FALSE, 0); }
		public Log_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_ops; }
	}

	public final Log_opsContext log_ops() throws RecognitionException {
		Log_opsContext _localctx = new Log_opsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_log_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		enterRule(_localctx, 36, RULE_asn_numbers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(197);
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

			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(200);
				match(DIGIT);
				}
				break;
			case UNDERSCORE:
			case LETTER:
				{
				setState(201);
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
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(INT_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(STRING_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
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
		enterRule(_localctx, 40, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ARRAY);
			setState(211);
			array_bracks();
			setState(212);
			match(OF);
			setState(213);
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
		enterRule(_localctx, 42, RULE_array_bracks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LBRA);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
				case LETTER:
					{
					setState(216);
					id();
					}
					break;
				case DIGIT:
					{
					setState(217);
					match(DIGIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERSCORE) | (1L << LETTER) | (1L << DIGIT))) != 0) );
			setState(222);
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
		enterRule(_localctx, 44, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNDERSCORE) {
				{
				{
				setState(224);
				match(UNDERSCORE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(LETTER);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
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
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public Comp_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_ops; }
	}

	public final Comp_opsContext comp_ops() throws RecognitionException {
		Comp_opsContext _localctx = new Comp_opsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comp_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GTEQ) | (1L << LTEQ) | (1L << NEQ))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00f2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13"+
		"\4\6\4S\n\4\r\4\16\4T\3\5\3\5\5\5Y\n\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\5"+
		"\5b\n\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\7\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0080\n\b"+
		"\f\b\16\b\u0083\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t\u008c\n\t\r\t\16"+
		"\t\u008d\3\n\6\n\u0091\n\n\r\n\16\n\u0092\3\n\5\n\u0096\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\r"+
		"\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\5\16\u00ad\n\16\3\16\5\16\u00b0\n\16"+
		"\3\17\3\17\3\17\5\17\u00b5\n\17\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3"+
		"\21\3\22\3\22\6\22\u00c0\n\22\r\22\16\22\u00c1\3\22\3\22\3\23\3\23\3\24"+
		"\5\24\u00c9\n\24\3\24\3\24\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\5\25\u00d3"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\6\27\u00dd\n\27\r\27\16"+
		"\27\u00de\3\27\3\27\3\30\7\30\u00e4\n\30\f\30\16\30\u00e7\13\30\3\30\3"+
		"\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13\30\3\31\3\31\3\31\2\2\32\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7\3\2\31\32\4\2\26\26"+
		"\34\37\3\2\33\34\4\2**\60\61\4\2\36\"-/\2\u0101\2\62\3\2\2\2\49\3\2\2"+
		"\2\6A\3\2\2\2\bV\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16z\3\2\2\2\20\u008b\3"+
		"\2\2\2\22\u0090\3\2\2\2\24\u0097\3\2\2\2\26\u009e\3\2\2\2\30\u00a5\3\2"+
		"\2\2\32\u00aa\3\2\2\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2 \u00bb\3\2\2\2"+
		"\"\u00bd\3\2\2\2$\u00c5\3\2\2\2&\u00c8\3\2\2\2(\u00d2\3\2\2\2*\u00d4\3"+
		"\2\2\2,\u00d9\3\2\2\2.\u00e5\3\2\2\2\60\u00ef\3\2\2\2\62\63\7\3\2\2\63"+
		"\64\7\62\2\2\64\65\5\4\3\2\65\3\3\2\2\2\668\5\6\4\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<?\7\23\2\2=@\5 \21\2"+
		">@\5\"\22\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AR\7\22\2\2BG\5.\30\2CD\7%\2"+
		"\2DF\5.\30\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JK\7&\2\2KO\5(\25\2LN\7+\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2RB\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2"+
		"\2VX\5.\30\2WY\5,\27\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Za\7,\2\2[]\5.\30"+
		"\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\5&\24\2_b\t\2\2\2`b\7\63\2\2a\\\3"+
		"\2\2\2a_\3\2\2\2a`\3\2\2\2bd\3\2\2\2ce\7+\2\2dc\3\2\2\2de\3\2\2\2e\t\3"+
		"\2\2\2fl\5\b\5\2gl\5\22\n\2hl\5\24\13\2il\5\f\7\2jl\5\16\b\2kf\3\2\2\2"+
		"kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\13\3\2\2\2mn\7\t\2\2no\7#\2"+
		"\2ot\5.\30\2pq\7%\2\2qs\5.\30\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uw\3\2\2\2vt\3\2\2\2wx\7$\2\2xy\7+\2\2y\r\3\2\2\2z{\7\n\2\2{|\7#\2\2"+
		"|\u0081\5\20\t\2}~\7%\2\2~\u0080\5\20\t\2\177}\3\2\2\2\u0080\u0083\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\7$\2\2\u0085\u0086\7+\2\2\u0086\17\3\2\2\2\u0087"+
		"\u008c\7\63\2\2\u0088\u008c\7\61\2\2\u0089\u008c\5$\23\2\u008a\u008c\5"+
		".\30\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\21\3\2\2\2\u008f\u0091\5\26\f\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\23\3\2\2"+
		"\2\u0097\u0098\7\17\2\2\u0098\u0099\5\32\16\2\u0099\u009c\7\20\2\2\u009a"+
		"\u009d\5 \21\2\u009b\u009d\5\"\22\2\u009c\u009a\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d\25\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\5\32\16\2\u00a0"+
		"\u00a3\7\f\2\2\u00a1\u00a4\5 \21\2\u00a2\u00a4\5\"\22\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00a8\7\r\2\2\u00a6"+
		"\u00a9\5 \21\2\u00a7\u00a9\5\"\22\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00ad\5\60\31\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5\34"+
		"\17\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b5"+
		"\5$\23\2\u00b2\u00b5\5\36\20\2\u00b3\u00b5\5.\30\2\u00b4\u00b1\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b9"+
		"\5&\24\2\u00b7\u00b8\t\3\2\2\u00b8\u00ba\5&\24\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\5\n\6\2\u00bc!\3\2\2\2\u00bd"+
		"\u00bf\7\24\2\2\u00be\u00c0\5\n\6\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\25\2\2\u00c4#\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6%\3\2\2\2\u00c7"+
		"\u00c9\t\4\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00cd\7\61\2\2\u00cb\u00cd\5.\30\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\'\3\2\2\2\u00ce\u00d3\7\4\2\2\u00cf\u00d3\7\5\2\2"+
		"\u00d0\u00d3\7\6\2\2\u00d1\u00d3\5*\26\2\u00d2\u00ce\3\2\2\2\u00d2\u00cf"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3)\3\2\2\2\u00d4"+
		"\u00d5\7\7\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5("+
		"\25\2\u00d8+\3\2\2\2\u00d9\u00dc\7\'\2\2\u00da\u00dd\5.\30\2\u00db\u00dd"+
		"\7\61\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\7(\2\2\u00e1-\3\2\2\2\u00e2\u00e4\7*\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00ec\7\60\2\2\u00e9\u00eb\t\5\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"/\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0\61\3\2\2\2!9?"+
		"GOTX\\adkt\u0081\u008b\u008d\u0092\u0095\u009c\u00a3\u00a8\u00ac\u00af"+
		"\u00b4\u00b9\u00c1\u00c8\u00cc\u00d2\u00dc\u00de\u00e5\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}