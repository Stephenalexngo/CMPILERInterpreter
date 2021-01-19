// Generated from c:\Users\Lenard\Documents\CMPILERParser\Main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOWERCASE=1, UPPERCASE=2, DIGIT=3, NEWLINE=4, BLOCKCOMMENT=5, LINECOMMENT=6, 
		STRING=7, NUMBER=8, LABEL=9, WHITE_SPACE=10, VARIABLE_TYPE=11, FIRST_OPERATORS=12, 
		SECOND_OPERATORS=13, OPERATORS=14, SIMPLE_PUNCTUATIONS=15, CREATE=16, 
		CONSTANT=17, RETURN=18, PRINT=19, SCAN=20, IF=21, ELSE=22, ELSE_IF=23, 
		FOR=24, UP_TO=25, DOWN_TO=26, WHILE=27, VOID=28, INT_DEC=29, BOOLEAN_DEC=30, 
		FLOAT_DEC=31, STRING_DEC=32, OPEN_PAREN=33, CLOSE_PAREN=34, OPEN_BRACKET=35, 
		CLOSE_BRACKET=36, OPEN_BRACE=37, CLOSE_BRACE=38, LESS=39, LESSQEUAL=40, 
		GREATER=41, GREATEREQUAL=42, PLUS=43, MINUS=44, MULTI=45, DIV=46, MOD=47, 
		AND=48, OR=49, ANDAND=50, OROR=51, NOT=52, ASSIGN=53, EQUAL=54, QUESTION=55, 
		COLON=56, DOT=57, SEMICOLON=58, COMMA=59;
	public static final int
		RULE_start = 0, RULE_any_declaration = 1, RULE_assigned_expression = 2, 
		RULE_variable_declaration_vartype = 3, RULE_variable_declaration_no_vartype = 4, 
		RULE_array_size = 5, RULE_array_variable = 6, RULE_array_declaration_vartype = 7, 
		RULE_array_declaration_no_vartype = 8, RULE_scan_statement = 9, RULE_display_message_parameter = 10, 
		RULE_value_parameter = 11, RULE_constant_declaration = 12, RULE_expression = 13, 
		RULE_sub_expression = 14, RULE_value_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "any_declaration", "assigned_expression", "variable_declaration_vartype", 
			"variable_declaration_no_vartype", "array_size", "array_variable", "array_declaration_vartype", 
			"array_declaration_no_vartype", "scan_statement", "display_message_parameter", 
			"value_parameter", "constant_declaration", "expression", "sub_expression", 
			"value_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'create'", "'constant'", "'return'", "'print'", 
			"'scan'", "'if'", "'else'", "'else if'", "'for'", "'up to'", "'down to'", 
			"'while'", "'void'", "'int'", "'bool'", "'float'", "'String'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'!'", "'='", 
			"'=='", "'?'", "':'", "'.'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOWERCASE", "UPPERCASE", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT", 
			"STRING", "NUMBER", "LABEL", "WHITE_SPACE", "VARIABLE_TYPE", "FIRST_OPERATORS", 
			"SECOND_OPERATORS", "OPERATORS", "SIMPLE_PUNCTUATIONS", "CREATE", "CONSTANT", 
			"RETURN", "PRINT", "SCAN", "IF", "ELSE", "ELSE_IF", "FOR", "UP_TO", "DOWN_TO", 
			"WHILE", "VOID", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", 
			"CLOSE_BRACE", "LESS", "LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", 
			"MINUS", "MULTI", "DIV", "MOD", "AND", "OR", "ANDAND", "OROR", "NOT", 
			"ASSIGN", "EQUAL", "QUESTION", "COLON", "DOT", "SEMICOLON", "COMMA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			any_declaration();
			setState(33);
			match(EOF);
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

	public static class Any_declarationContext extends ParserRuleContext {
		public Variable_declaration_vartypeContext variable_declaration_vartype() {
			return getRuleContext(Variable_declaration_vartypeContext.class,0);
		}
		public Variable_declaration_no_vartypeContext variable_declaration_no_vartype() {
			return getRuleContext(Variable_declaration_no_vartypeContext.class,0);
		}
		public Array_declaration_vartypeContext array_declaration_vartype() {
			return getRuleContext(Array_declaration_vartypeContext.class,0);
		}
		public Array_declaration_no_vartypeContext array_declaration_no_vartype() {
			return getRuleContext(Array_declaration_no_vartypeContext.class,0);
		}
		public Any_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_declaration; }
	}

	public final Any_declarationContext any_declaration() throws RecognitionException {
		Any_declarationContext _localctx = new Any_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_any_declaration);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				variable_declaration_no_vartype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				array_declaration_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				array_declaration_no_vartype();
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

	public static class Assigned_expressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MainParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MainParser.NUMBER, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public Assigned_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigned_expression; }
	}

	public final Assigned_expressionContext assigned_expression() throws RecognitionException {
		Assigned_expressionContext _localctx = new Assigned_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assigned_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LABEL))) != 0)) ) {
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

	public static class Variable_declaration_vartypeContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE() { return getToken(MainParser.VARIABLE_TYPE, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public Variable_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_vartype; }
	}

	public final Variable_declaration_vartypeContext variable_declaration_vartype() throws RecognitionException {
		Variable_declaration_vartypeContext _localctx = new Variable_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(VARIABLE_TYPE);
			setState(44);
			match(WHITE_SPACE);
			setState(45);
			match(LABEL);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE || _la==ASSIGN) {
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(46);
					match(WHITE_SPACE);
					}
				}

				setState(49);
				match(ASSIGN);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(50);
					match(WHITE_SPACE);
					}
				}

				setState(53);
				assigned_expression();
				}
			}

			setState(56);
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

	public static class Variable_declaration_no_vartypeContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Variable_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_no_vartype; }
	}

	public final Variable_declaration_no_vartypeContext variable_declaration_no_vartype() throws RecognitionException {
		Variable_declaration_no_vartypeContext _localctx = new Variable_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(LABEL);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(59);
				match(WHITE_SPACE);
				}
			}

			setState(62);
			match(ASSIGN);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(63);
				match(WHITE_SPACE);
				}
			}

			setState(66);
			assigned_expression();
			setState(67);
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

	public static class Array_sizeContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode OPERATORS() { return getToken(MainParser.OPERATORS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MainParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MainParser.NUMBER, i);
		}
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(69);
					match(NUMBER);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				{
				setState(75);
				match(LABEL);
				setState(76);
				match(OPERATORS);
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(77);
					match(LABEL);
					}
					break;
				case NUMBER:
					{
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(78);
						match(NUMBER);
						}
						}
						setState(81); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(85);
				match(LABEL);
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

	public static class Array_variableContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variable; }
	}

	public final Array_variableContext array_variable() throws RecognitionException {
		Array_variableContext _localctx = new Array_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LABEL);
			setState(89);
			match(OPEN_BRACE);
			setState(90);
			array_size();
			setState(91);
			match(CLOSE_BRACE);
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

	public static class Array_declaration_vartypeContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE_TYPE() { return getTokens(MainParser.VARIABLE_TYPE); }
		public TerminalNode VARIABLE_TYPE(int i) {
			return getToken(MainParser.VARIABLE_TYPE, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public Array_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_vartype; }
	}

	public final Array_declaration_vartypeContext array_declaration_vartype() throws RecognitionException {
		Array_declaration_vartypeContext _localctx = new Array_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_declaration_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(VARIABLE_TYPE);
			setState(94);
			match(OPEN_BRACE);
			setState(95);
			match(CLOSE_BRACE);
			setState(96);
			match(WHITE_SPACE);
			setState(97);
			match(LABEL);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE || _la==ASSIGN) {
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(98);
					match(WHITE_SPACE);
					}
				}

				setState(101);
				match(ASSIGN);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(102);
					match(WHITE_SPACE);
					}
				}

				setState(105);
				match(CREATE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(106);
					match(WHITE_SPACE);
					}
				}

				setState(109);
				match(VARIABLE_TYPE);
				setState(110);
				match(OPEN_BRACE);
				setState(111);
				array_size();
				setState(112);
				match(CLOSE_BRACE);
				}
			}

			setState(116);
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

	public static class Array_declaration_no_vartypeContext extends ParserRuleContext {
		public List<Array_variableContext> array_variable() {
			return getRuleContexts(Array_variableContext.class);
		}
		public Array_variableContext array_variable(int i) {
			return getRuleContext(Array_variableContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Array_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_no_vartype; }
	}

	public final Array_declaration_no_vartypeContext array_declaration_no_vartype() throws RecognitionException {
		Array_declaration_no_vartypeContext _localctx = new Array_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_declaration_no_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			array_variable();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(119);
				match(WHITE_SPACE);
				}
			}

			setState(122);
			match(ASSIGN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(123);
				match(WHITE_SPACE);
				}
			}

			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(126);
				assigned_expression();
				}
				break;
			case 2:
				{
				setState(127);
				array_variable();
				}
				break;
			}
			setState(130);
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

	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(MainParser.SCAN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Display_message_parameterContext display_message_parameter() {
			return getRuleContext(Display_message_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(SCAN);
			setState(133);
			match(OPEN_PAREN);
			setState(134);
			display_message_parameter();
			setState(135);
			match(COMMA);
			setState(136);
			match(CLOSE_PAREN);
			setState(137);
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

	public static class Display_message_parameterContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MainParser.STRING, 0); }
		public Display_message_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_message_parameter; }
	}

	public final Display_message_parameterContext display_message_parameter() throws RecognitionException {
		Display_message_parameterContext _localctx = new Display_message_parameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_display_message_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(STRING);
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

	public static class Value_parameterContext extends ParserRuleContext {
		public Value_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_parameter; }
	}

	public final Value_parameterContext value_parameter() throws RecognitionException {
		Value_parameterContext _localctx = new Value_parameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(MainParser.CONSTANT, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CONSTANT);
			setState(144);
			match(WHITE_SPACE);
			setState(145);
			any_declaration();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Sub_expressionContext sub_expression() {
			return getRuleContext(Sub_expressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode FIRST_OPERATORS() { return getToken(MainParser.FIRST_OPERATORS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case LABEL:
				{
				setState(148);
				sub_expression(0);
				}
				break;
			case OPEN_PAREN:
				{
				setState(149);
				match(OPEN_PAREN);
				setState(150);
				expression(0);
				setState(151);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(156);
					match(FIRST_OPERATORS);
					}
					setState(157);
					sub_expression(0);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sub_expressionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Sub_expressionContext sub_expression() {
			return getRuleContext(Sub_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SECOND_OPERATORS() { return getToken(MainParser.SECOND_OPERATORS, 0); }
		public Sub_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_expression; }
	}

	public final Sub_expressionContext sub_expression() throws RecognitionException {
		return sub_expression(0);
	}

	private Sub_expressionContext sub_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sub_expressionContext _localctx = new Sub_expressionContext(_ctx, _parentState);
		Sub_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_sub_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			value_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sub_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sub_expression);
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(167);
					match(SECOND_OPERATORS);
					}
					setState(168);
					expression(0);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Value_expressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MainParser.NUMBER, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==LABEL) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return sub_expression_sempred((Sub_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sub_expression_sempred(Sub_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\62\n\5\3\5\3\5"+
		"\5\5\66\n\5\3\5\5\59\n\5\3\5\3\5\3\6\3\6\5\6?\n\6\3\6\3\6\5\6C\n\6\3\6"+
		"\3\6\3\6\3\7\7\7I\n\7\f\7\16\7L\13\7\3\7\3\7\3\7\3\7\6\7R\n\7\r\7\16\7"+
		"S\5\7V\n\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tf\n\t\3\t\3\t\5\tj\n\t\3\t\3\t\5\tn\n\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t"+
		"\3\t\3\t\3\n\3\n\5\n{\n\n\3\n\3\n\5\n\177\n\n\3\n\3\n\5\n\u0083\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3\17\3\17\3\17"+
		"\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00ac\n\20\f\20\16\20\u00af\13\20\3\21\3\21\3\21\2\4\34\36\22\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\t\13\3\2\n\13\2\u00b9\2"+
		"\"\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n<\3\2\2\2\fX\3\2\2\2\16Z"+
		"\3\2\2\2\20_\3\2\2\2\22x\3\2\2\2\24\u0086\3\2\2\2\26\u008d\3\2\2\2\30"+
		"\u008f\3\2\2\2\32\u0091\3\2\2\2\34\u009b\3\2\2\2\36\u00a5\3\2\2\2 \u00b0"+
		"\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%*\5\b\5\2&*\5\n\6\2\'*\5\20\t"+
		"\2(*\5\22\n\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\t"+
		"\2\2\2,\7\3\2\2\2-.\7\r\2\2./\7\f\2\2/8\7\13\2\2\60\62\7\f\2\2\61\60\3"+
		"\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\65\7\67\2\2\64\66\7\f\2\2\65\64"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\5\6\4\28\61\3\2\2\289\3\2\2\2"+
		"9:\3\2\2\2:;\7<\2\2;\t\3\2\2\2<>\7\13\2\2=?\7\f\2\2>=\3\2\2\2>?\3\2\2"+
		"\2?@\3\2\2\2@B\7\67\2\2AC\7\f\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\6"+
		"\4\2EF\7<\2\2F\13\3\2\2\2GI\7\n\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KY\3\2\2\2LJ\3\2\2\2MN\7\13\2\2NU\7\20\2\2OV\7\13\2\2PR\7\n\2\2"+
		"QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UO\3\2\2\2UQ\3\2\2\2"+
		"VY\3\2\2\2WY\7\13\2\2XJ\3\2\2\2XM\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2Z[\7\13"+
		"\2\2[\\\7\'\2\2\\]\5\f\7\2]^\7(\2\2^\17\3\2\2\2_`\7\r\2\2`a\7\'\2\2ab"+
		"\7(\2\2bc\7\f\2\2ct\7\13\2\2df\7\f\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2g"+
		"i\7\67\2\2hj\7\f\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\22\2\2ln\7\f\2"+
		"\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\r\2\2pq\7\'\2\2qr\5\f\7\2rs\7(\2"+
		"\2su\3\2\2\2te\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7<\2\2w\21\3\2\2\2xz\5\16"+
		"\b\2y{\7\f\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\67\2\2}\177\7\f\2\2~"+
		"}\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080\u0083\5\6\4\2\u0081\u0083"+
		"\5\16\b\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\7<\2\2\u0085\23\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u0088"+
		"\7#\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7=\2\2\u008a\u008b\7$\2\2\u008b"+
		"\u008c\7<\2\2\u008c\25\3\2\2\2\u008d\u008e\7\t\2\2\u008e\27\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\31\3\2\2\2\u0091\u0092\7\23\2\2\u0092\u0093\7\f\2"+
		"\2\u0093\u0094\5\4\3\2\u0094\33\3\2\2\2\u0095\u0096\b\17\1\2\u0096\u009c"+
		"\5\36\20\2\u0097\u0098\7#\2\2\u0098\u0099\5\34\17\2\u0099\u009a\7$\2\2"+
		"\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u00a2"+
		"\3\2\2\2\u009d\u009e\f\4\2\2\u009e\u009f\7\16\2\2\u009f\u00a1\5\36\20"+
		"\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\20\1\2\u00a6"+
		"\u00a7\5 \21\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\17"+
		"\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b1\t\3\2\2\u00b1!\3\2\2\2\26)\61\658>BJSUXeimtz~\u0082\u009b"+
		"\u00a2\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}