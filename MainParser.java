// Generated from Main.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, CONSTANT=2, RETURN=3, PRINT=4, SCAN=5, VOID=6, FUNC=7, MAIN=8, 
		IF=9, ELSE=10, ELSE_IF=11, THEN=12, FOR=13, UP_TO=14, DOWN_TO=15, WHILE=16, 
		INT_DEC=17, BOOLEAN_DEC=18, FLOAT_DEC=19, STRING_DEC=20, OPEN_PAREN=21, 
		CLOSE_PAREN=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, OPEN_BRACE=25, CLOSE_BRACE=26, 
		LESS=27, LESSQEUAL=28, GREATER=29, GREATEREQUAL=30, PLUS=31, MINUS=32, 
		MULTI=33, DIV=34, MOD=35, ANDAND=36, OROR=37, NOT=38, ASSIGN=39, EQUAL=40, 
		QUESTION=41, COLON=42, DOT=43, SEMICOLON=44, COMMA=45, UNDERSCORE=46, 
		SINGLE_QUOTE=47, STRING_TYPE=48, INT_NUMBER=49, FLOAT_NUMBER=50, LABEL=51, 
		LETTER=52, DIGIT=53, BLOCKCOMMENT=54, LINECOMMENT=55, WHITE_SPACE=56;
	public static final int
		RULE_start = 0, RULE_variable_type = 1, RULE_number = 2, RULE_logic_relational_operators = 3, 
		RULE_statements = 4, RULE_big_statements = 5, RULE_small_statements = 6, 
		RULE_any_declaration = 7, RULE_var_declaration = 8, RULE_arr_declaration = 9, 
		RULE_float_arr_declaration = 10, RULE_int_arr_declaration = 11, RULE_string_arr_declaration = 12, 
		RULE_boolean_arr_declaration = 13, RULE_float_declaration = 14, RULE_int_declaration = 15, 
		RULE_string_declaration = 16, RULE_boolean_declaration = 17, RULE_assignment_statement = 18, 
		RULE_print_statement = 19, RULE_extended_value_print = 20, RULE_scan_statement = 21, 
		RULE_constant_declaration = 22, RULE_return_statement = 23, RULE_expression = 24, 
		RULE_second_operator_expression = 25, RULE_first_operator_expression = 26, 
		RULE_value_expression = 27, RULE_comparison_statement = 28, RULE_value_comparison = 29, 
		RULE_conditional_statement = 30, RULE_conditional_comparison_structure = 31, 
		RULE_conditional_body = 32, RULE_loop_statement = 33, RULE_while_statement = 34, 
		RULE_for_statement = 35, RULE_loop_variable_declaration = 36, RULE_loop_structure = 37, 
		RULE_function_calling = 38, RULE_function_parameters = 39, RULE_function_paremeters_value = 40, 
		RULE_function_declaration = 41, RULE_function_structure = 42, RULE_function_declaration_parameters = 43, 
		RULE_main_function = 44, RULE_scoping_statement = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "number", "logic_relational_operators", "statements", 
			"big_statements", "small_statements", "any_declaration", "var_declaration", 
			"arr_declaration", "float_arr_declaration", "int_arr_declaration", "string_arr_declaration", 
			"boolean_arr_declaration", "float_declaration", "int_declaration", "string_declaration", 
			"boolean_declaration", "assignment_statement", "print_statement", "extended_value_print", 
			"scan_statement", "constant_declaration", "return_statement", "expression", 
			"second_operator_expression", "first_operator_expression", "value_expression", 
			"comparison_statement", "value_comparison", "conditional_statement", 
			"conditional_comparison_structure", "conditional_body", "loop_statement", 
			"while_statement", "for_statement", "loop_variable_declaration", "loop_structure", 
			"function_calling", "function_parameters", "function_paremeters_value", 
			"function_declaration", "function_structure", "function_declaration_parameters", 
			"main_function", "scoping_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'constant'", "'return'", "'print'", "'scan'", "'void'", 
			"'func'", "'main'", "'if'", "'else'", "'else if'", "'then'", "'for'", 
			"'up to'", "'down to'", "'while'", "'int'", "'bool'", "'float'", "'STRING'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'='", "'=='", 
			"'?'", "':'", "'.'", "';'", "','", "'_'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", "FUNC", 
			"MAIN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", "WHILE", 
			"INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "LESS", 
			"LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", "COLON", 
			"DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "STRING_TYPE", 
			"INT_NUMBER", "FLOAT_NUMBER", "LABEL", "LETTER", "DIGIT", "BLOCKCOMMENT", 
			"LINECOMMENT", "WHITE_SPACE"
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
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(92);
				function_declaration();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			main_function();
			setState(99);
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

	public static class Variable_typeContext extends ParserRuleContext {
		public TerminalNode INT_DEC() { return getToken(MainParser.INT_DEC, 0); }
		public TerminalNode BOOLEAN_DEC() { return getToken(MainParser.BOOLEAN_DEC, 0); }
		public TerminalNode FLOAT_DEC() { return getToken(MainParser.FLOAT_DEC, 0); }
		public TerminalNode STRING_DEC() { return getToken(MainParser.STRING_DEC, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVariable_type(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(MainParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(MainParser.FLOAT_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==INT_NUMBER || _la==FLOAT_NUMBER) ) {
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

	public static class Logic_relational_operatorsContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(MainParser.LESS, 0); }
		public TerminalNode LESSQEUAL() { return getToken(MainParser.LESSQEUAL, 0); }
		public TerminalNode GREATER() { return getToken(MainParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(MainParser.GREATEREQUAL, 0); }
		public TerminalNode ANDAND() { return getToken(MainParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(MainParser.OROR, 0); }
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Logic_relational_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_relational_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLogic_relational_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLogic_relational_operators(this);
		}
	}

	public final Logic_relational_operatorsContext logic_relational_operators() throws RecognitionException {
		Logic_relational_operatorsContext _localctx = new Logic_relational_operatorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logic_relational_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR) | (1L << EQUAL))) != 0)) ) {
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

	public static class StatementsContext extends ParserRuleContext {
		public Big_statementsContext big_statements() {
			return getRuleContext(Big_statementsContext.class,0);
		}
		public Small_statementsContext small_statements() {
			return getRuleContext(Small_statementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
			case IF:
			case FOR:
			case WHILE:
			case OPEN_BRACKET:
				{
				setState(107);
				big_statements();
				}
				break;
			case RETURN:
			case PRINT:
			case SCAN:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case LABEL:
				{
				setState(108);
				small_statements();
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

	public static class Big_statementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Scoping_statementContext scoping_statement() {
			return getRuleContext(Scoping_statementContext.class,0);
		}
		public Big_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_big_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterBig_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitBig_statements(this);
		}
	}

	public final Big_statementsContext big_statements() throws RecognitionException {
		Big_statementsContext _localctx = new Big_statementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_big_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(111);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
				{
				setState(112);
				loop_statement();
				}
				break;
			case CONSTANT:
				{
				setState(113);
				constant_declaration();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(114);
				scoping_statement();
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

	public static class Small_statementsContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Small_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSmall_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSmall_statements(this);
		}
	}

	public final Small_statementsContext small_statements() throws RecognitionException {
		Small_statementsContext _localctx = new Small_statementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_small_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(117);
				print_statement();
				}
				break;
			case 2:
				{
				setState(118);
				scan_statement();
				}
				break;
			case 3:
				{
				setState(119);
				return_statement();
				}
				break;
			case 4:
				{
				setState(120);
				any_declaration();
				}
				break;
			case 5:
				{
				setState(121);
				function_calling();
				}
				break;
			case 6:
				{
				setState(122);
				assignment_statement();
				}
				break;
			}
			setState(125);
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

	public static class Any_declarationContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Arr_declarationContext arr_declaration() {
			return getRuleContext(Arr_declarationContext.class,0);
		}
		public Any_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAny_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAny_declaration(this);
		}
	}

	public final Any_declarationContext any_declaration() throws RecognitionException {
		Any_declarationContext _localctx = new Any_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_any_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(127);
				var_declaration();
				}
				break;
			case 2:
				{
				setState(128);
				arr_declaration();
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

	public static class Var_declarationContext extends ParserRuleContext {
		public Float_declarationContext float_declaration() {
			return getRuleContext(Float_declarationContext.class,0);
		}
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_DEC:
				{
				setState(131);
				float_declaration();
				}
				break;
			case INT_DEC:
				{
				setState(132);
				int_declaration();
				}
				break;
			case STRING_DEC:
				{
				setState(133);
				string_declaration();
				}
				break;
			case BOOLEAN_DEC:
				{
				setState(134);
				boolean_declaration();
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

	public static class Arr_declarationContext extends ParserRuleContext {
		public Float_arr_declarationContext float_arr_declaration() {
			return getRuleContext(Float_arr_declarationContext.class,0);
		}
		public Int_arr_declarationContext int_arr_declaration() {
			return getRuleContext(Int_arr_declarationContext.class,0);
		}
		public String_arr_declarationContext string_arr_declaration() {
			return getRuleContext(String_arr_declarationContext.class,0);
		}
		public Boolean_arr_declarationContext boolean_arr_declaration() {
			return getRuleContext(Boolean_arr_declarationContext.class,0);
		}
		public Arr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArr_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArr_declaration(this);
		}
	}

	public final Arr_declarationContext arr_declaration() throws RecognitionException {
		Arr_declarationContext _localctx = new Arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arr_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_DEC:
				{
				setState(137);
				float_arr_declaration();
				}
				break;
			case INT_DEC:
				{
				setState(138);
				int_arr_declaration();
				}
				break;
			case STRING_DEC:
				{
				setState(139);
				string_arr_declaration();
				}
				break;
			case BOOLEAN_DEC:
				{
				setState(140);
				boolean_arr_declaration();
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

	public static class Float_arr_declarationContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT_DEC() { return getTokens(MainParser.FLOAT_DEC); }
		public TerminalNode FLOAT_DEC(int i) {
			return getToken(MainParser.FLOAT_DEC, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public Float_arr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_arr_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFloat_arr_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFloat_arr_declaration(this);
		}
	}

	public final Float_arr_declarationContext float_arr_declaration() throws RecognitionException {
		Float_arr_declarationContext _localctx = new Float_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_float_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FLOAT_DEC);
			setState(144);
			match(OPEN_BRACE);
			setState(145);
			match(CLOSE_BRACE);
			setState(146);
			match(LABEL);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(147);
				match(ASSIGN);
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(148);
					match(CREATE);
					setState(149);
					match(FLOAT_DEC);
					}
					break;
				case LABEL:
					{
					setState(150);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153);
				match(OPEN_BRACE);
				setState(154);
				expression();
				setState(155);
				match(CLOSE_BRACE);
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

	public static class Int_arr_declarationContext extends ParserRuleContext {
		public List<TerminalNode> INT_DEC() { return getTokens(MainParser.INT_DEC); }
		public TerminalNode INT_DEC(int i) {
			return getToken(MainParser.INT_DEC, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public Int_arr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_arr_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterInt_arr_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitInt_arr_declaration(this);
		}
	}

	public final Int_arr_declarationContext int_arr_declaration() throws RecognitionException {
		Int_arr_declarationContext _localctx = new Int_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_int_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(INT_DEC);
			setState(160);
			match(OPEN_BRACE);
			setState(161);
			match(CLOSE_BRACE);
			setState(162);
			match(LABEL);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(163);
				match(ASSIGN);
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(164);
					match(CREATE);
					setState(165);
					match(INT_DEC);
					}
					break;
				case LABEL:
					{
					setState(166);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(169);
				match(OPEN_BRACE);
				setState(170);
				expression();
				setState(171);
				match(CLOSE_BRACE);
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

	public static class String_arr_declarationContext extends ParserRuleContext {
		public List<TerminalNode> STRING_DEC() { return getTokens(MainParser.STRING_DEC); }
		public TerminalNode STRING_DEC(int i) {
			return getToken(MainParser.STRING_DEC, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public String_arr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_arr_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterString_arr_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitString_arr_declaration(this);
		}
	}

	public final String_arr_declarationContext string_arr_declaration() throws RecognitionException {
		String_arr_declarationContext _localctx = new String_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(STRING_DEC);
			setState(176);
			match(OPEN_BRACE);
			setState(177);
			match(CLOSE_BRACE);
			setState(178);
			match(LABEL);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(179);
				match(ASSIGN);
				{
				setState(180);
				match(CREATE);
				setState(181);
				match(STRING_DEC);
				}
				setState(183);
				match(OPEN_BRACE);
				setState(184);
				expression();
				setState(185);
				match(CLOSE_BRACE);
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

	public static class Boolean_arr_declarationContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN_DEC() { return getTokens(MainParser.BOOLEAN_DEC); }
		public TerminalNode BOOLEAN_DEC(int i) {
			return getToken(MainParser.BOOLEAN_DEC, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public Boolean_arr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_arr_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterBoolean_arr_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitBoolean_arr_declaration(this);
		}
	}

	public final Boolean_arr_declarationContext boolean_arr_declaration() throws RecognitionException {
		Boolean_arr_declarationContext _localctx = new Boolean_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(BOOLEAN_DEC);
			setState(190);
			match(OPEN_BRACE);
			setState(191);
			match(CLOSE_BRACE);
			setState(192);
			match(LABEL);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(193);
				match(ASSIGN);
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(194);
					match(CREATE);
					setState(195);
					match(BOOLEAN_DEC);
					}
					break;
				case LABEL:
					{
					setState(196);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199);
				match(OPEN_BRACE);
				setState(200);
				expression();
				setState(201);
				match(CLOSE_BRACE);
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

	public static class Float_declarationContext extends ParserRuleContext {
		public TerminalNode FLOAT_DEC() { return getToken(MainParser.FLOAT_DEC, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(MainParser.FLOAT_NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Float_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFloat_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFloat_declaration(this);
		}
	}

	public final Float_declarationContext float_declaration() throws RecognitionException {
		Float_declarationContext _localctx = new Float_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_float_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(FLOAT_DEC);
			setState(206);
			match(LABEL);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(207);
				match(ASSIGN);
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(208);
					match(FLOAT_NUMBER);
					}
					break;
				case 2:
					{
					setState(209);
					expression();
					}
					break;
				}
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

	public static class Int_declarationContext extends ParserRuleContext {
		public TerminalNode INT_DEC() { return getToken(MainParser.INT_DEC, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode INT_NUMBER() { return getToken(MainParser.INT_NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterInt_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitInt_declaration(this);
		}
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_int_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(INT_DEC);
			setState(215);
			match(LABEL);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(216);
				match(ASSIGN);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(217);
					match(INT_NUMBER);
					}
					break;
				case 2:
					{
					setState(218);
					expression();
					}
					break;
				}
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

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode STRING_DEC() { return getToken(MainParser.STRING_DEC, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitString_declaration(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(STRING_DEC);
			setState(224);
			match(LABEL);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(225);
				match(ASSIGN);
				setState(226);
				match(STRING_TYPE);
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

	public static class Boolean_declarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_DEC() { return getToken(MainParser.BOOLEAN_DEC, 0); }
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterBoolean_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitBoolean_declaration(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolean_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(BOOLEAN_DEC);
			setState(230);
			match(LABEL);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(231);
				match(ASSIGN);
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(232);
					comparison_statement();
					}
					break;
				case 2:
					{
					setState(233);
					match(LABEL);
					}
					break;
				}
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(MainParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(MainParser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(MainParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(MainParser.CLOSE_BRACE, i);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LABEL);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(239);
				match(OPEN_BRACE);
				setState(240);
				match(CLOSE_BRACE);
				}
			}

			setState(243);
			match(ASSIGN);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(244);
				number();
				}
				break;
			case 2:
				{
				setState(245);
				expression();
				}
				break;
			case 3:
				{
				setState(246);
				match(STRING_TYPE);
				}
				break;
			case 4:
				{
				setState(247);
				comparison_statement();
				}
				break;
			case 5:
				{
				setState(248);
				match(LABEL);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(249);
					match(OPEN_BRACE);
					setState(250);
					match(CLOSE_BRACE);
					}
				}

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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MainParser.PRINT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public List<Extended_value_printContext> extended_value_print() {
			return getRuleContexts(Extended_value_printContext.class);
		}
		public Extended_value_printContext extended_value_print(int i) {
			return getRuleContext(Extended_value_printContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> PLUS() { return getTokens(MainParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MainParser.PLUS, i);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PRINT);
			setState(256);
			match(OPEN_PAREN);
			setState(257);
			extended_value_print();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(258);
				match(PLUS);
				setState(259);
				extended_value_print();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(CLOSE_PAREN);
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

	public static class Extended_value_printContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Extended_value_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_value_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExtended_value_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExtended_value_print(this);
		}
	}

	public final Extended_value_printContext extended_value_print() throws RecognitionException {
		Extended_value_printContext _localctx = new Extended_value_printContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extended_value_print);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(STRING_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(LABEL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				function_calling();
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

	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(MainParser.SCAN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScan_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScan_statement(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(SCAN);
			setState(274);
			match(OPEN_PAREN);
			setState(275);
			match(STRING_TYPE);
			setState(276);
			match(COMMA);
			setState(277);
			match(LABEL);
			setState(278);
			match(CLOSE_PAREN);
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
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConstant_declaration(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(CONSTANT);
			setState(281);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MainParser.RETURN, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(RETURN);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(284);
				match(STRING_TYPE);
				}
				break;
			case 2:
				{
				setState(285);
				number();
				}
				break;
			case 3:
				{
				setState(286);
				match(LABEL);
				}
				break;
			case 4:
				{
				setState(287);
				expression();
				}
				break;
			case 5:
				{
				setState(288);
				function_calling();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Second_operator_expressionContext second_operator_expression() {
			return getRuleContext(Second_operator_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			second_operator_expression(0);
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

	public static class Second_operator_expressionContext extends ParserRuleContext {
		public First_operator_expressionContext first_operator_expression() {
			return getRuleContext(First_operator_expressionContext.class,0);
		}
		public Second_operator_expressionContext second_operator_expression() {
			return getRuleContext(Second_operator_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MainParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MainParser.MINUS, 0); }
		public Second_operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSecond_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSecond_operator_expression(this);
		}
	}

	public final Second_operator_expressionContext second_operator_expression() throws RecognitionException {
		return second_operator_expression(0);
	}

	private Second_operator_expressionContext second_operator_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Second_operator_expressionContext _localctx = new Second_operator_expressionContext(_ctx, _parentState);
		Second_operator_expressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_second_operator_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(294);
			first_operator_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Second_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_second_operator_expression);
						setState(296);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(297);
						match(PLUS);
						setState(298);
						first_operator_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Second_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_second_operator_expression);
						setState(299);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(300);
						match(MINUS);
						setState(301);
						first_operator_expression(0);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class First_operator_expressionContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public First_operator_expressionContext first_operator_expression() {
			return getRuleContext(First_operator_expressionContext.class,0);
		}
		public TerminalNode DIV() { return getToken(MainParser.DIV, 0); }
		public TerminalNode MULTI() { return getToken(MainParser.MULTI, 0); }
		public TerminalNode MOD() { return getToken(MainParser.MOD, 0); }
		public First_operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFirst_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFirst_operator_expression(this);
		}
	}

	public final First_operator_expressionContext first_operator_expression() throws RecognitionException {
		return first_operator_expression(0);
	}

	private First_operator_expressionContext first_operator_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		First_operator_expressionContext _localctx = new First_operator_expressionContext(_ctx, _parentState);
		First_operator_expressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_first_operator_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			value_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(310);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(311);
						match(DIV);
						setState(312);
						value_expression();
						}
						break;
					case 2:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(313);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(314);
						match(MULTI);
						setState(315);
						value_expression();
						}
						break;
					case 3:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(316);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(317);
						match(MOD);
						setState(318);
						value_expression();
						}
						break;
					}
					} 
				}
				setState(323);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Value_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_expression(this);
		}
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value_expression);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(OPEN_PAREN);
				setState(326);
				expression();
				setState(327);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(LABEL);
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

	public static class Comparison_statementContext extends ParserRuleContext {
		public List<Value_comparisonContext> value_comparison() {
			return getRuleContexts(Value_comparisonContext.class);
		}
		public Value_comparisonContext value_comparison(int i) {
			return getRuleContext(Value_comparisonContext.class,i);
		}
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public List<Logic_relational_operatorsContext> logic_relational_operators() {
			return getRuleContexts(Logic_relational_operatorsContext.class);
		}
		public Logic_relational_operatorsContext logic_relational_operators(int i) {
			return getRuleContext(Logic_relational_operatorsContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public List<Comparison_statementContext> comparison_statement() {
			return getRuleContexts(Comparison_statementContext.class);
		}
		public Comparison_statementContext comparison_statement(int i) {
			return getRuleContext(Comparison_statementContext.class,i);
		}
		public Comparison_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterComparison_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitComparison_statement(this);
		}
	}

	public final Comparison_statementContext comparison_statement() throws RecognitionException {
		Comparison_statementContext _localctx = new Comparison_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparison_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(333);
				match(NOT);
				}
			}

			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(336);
				match(OPEN_PAREN);
				}
				break;
			}
			setState(339);
			value_comparison();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					logic_relational_operators();
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(341);
						value_comparison();
						}
						break;
					case 2:
						{
						setState(342);
						comparison_statement();
						}
						break;
					}
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(350);
				match(CLOSE_PAREN);
				}
				break;
			}
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(353);
				logic_relational_operators();
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(354);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(355);
					comparison_statement();
					}
					break;
				}
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

	public static class Value_comparisonContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Value_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_comparison(this);
		}
	}

	public final Value_comparisonContext value_comparison() throws RecognitionException {
		Value_comparisonContext _localctx = new Value_comparisonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_value_comparison);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(STRING_TYPE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				function_calling();
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MainParser.IF, 0); }
		public List<Conditional_comparison_structureContext> conditional_comparison_structure() {
			return getRuleContexts(Conditional_comparison_structureContext.class);
		}
		public Conditional_comparison_structureContext conditional_comparison_structure(int i) {
			return getRuleContext(Conditional_comparison_structureContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(MainParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(MainParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(MainParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public Conditional_bodyContext conditional_body() {
			return getRuleContext(Conditional_bodyContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditional_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IF);
			setState(368);
			conditional_comparison_structure();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(369);
				match(ELSE_IF);
				setState(370);
				conditional_comparison_structure();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(376);
				match(ELSE);
				setState(377);
				match(THEN);
				setState(378);
				conditional_body();
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

	public static class Conditional_comparison_structureContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public Conditional_bodyContext conditional_body() {
			return getRuleContext(Conditional_bodyContext.class,0);
		}
		public Conditional_comparison_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_comparison_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_comparison_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_comparison_structure(this);
		}
	}

	public final Conditional_comparison_structureContext conditional_comparison_structure() throws RecognitionException {
		Conditional_comparison_structureContext _localctx = new Conditional_comparison_structureContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(OPEN_PAREN);
			setState(382);
			comparison_statement();
			setState(383);
			match(CLOSE_PAREN);
			setState(384);
			match(THEN);
			setState(385);
			conditional_body();
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

	public static class Conditional_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Conditional_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_body(this);
		}
	}

	public final Conditional_bodyContext conditional_body() throws RecognitionException {
		Conditional_bodyContext _localctx = new Conditional_bodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(OPEN_BRACKET);
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				statements();
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(393);
			match(CLOSE_BRACKET);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(395);
				while_statement();
				}
				break;
			case FOR:
				{
				setState(396);
				for_statement();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MainParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_structureContext loop_structure() {
			return getRuleContext(Loop_structureContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(WHILE);
			setState(400);
			expression();
			setState(401);
			loop_structure();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MainParser.FOR, 0); }
		public Loop_variable_declarationContext loop_variable_declaration() {
			return getRuleContext(Loop_variable_declarationContext.class,0);
		}
		public Loop_structureContext loop_structure() {
			return getRuleContext(Loop_structureContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(FOR);
			setState(404);
			loop_variable_declaration();
			setState(405);
			loop_structure();
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

	public static class Loop_variable_declarationContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(MainParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(MainParser.LABEL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Loop_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_variable_declaration(this);
		}
	}

	public final Loop_variable_declarationContext loop_variable_declaration() throws RecognitionException {
		Loop_variable_declarationContext _localctx = new Loop_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
					{
					setState(407);
					variable_type();
					}
				}

				setState(410);
				match(LABEL);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(411);
					match(ASSIGN);
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(412);
						number();
						}
						break;
					case 2:
						{
						setState(413);
						match(LABEL);
						}
						break;
					case 3:
						{
						setState(414);
						expression();
						}
						break;
					}
					}
				}

				}
				break;
			case 2:
				{
				setState(419);
				expression();
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

	public static class Loop_structureContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Loop_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_structure(this);
		}
	}

	public final Loop_structureContext loop_structure() throws RecognitionException {
		Loop_structureContext _localctx = new Loop_structureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_loop_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==UP_TO || _la==DOWN_TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(423);
			expression();
			setState(424);
			match(OPEN_BRACKET);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0)) {
				{
				{
				setState(425);
				statements();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(CLOSE_BRACKET);
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

	public static class Function_callingContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_callingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_calling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_calling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_calling(this);
		}
	}

	public final Function_callingContext function_calling() throws RecognitionException {
		Function_callingContext _localctx = new Function_callingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_calling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(LABEL);
			setState(434);
			match(OPEN_PAREN);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << STRING_TYPE) | (1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << LABEL))) != 0)) {
				{
				setState(435);
				function_parameters();
				}
			}

			setState(438);
			match(CLOSE_PAREN);
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

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Function_paremeters_valueContext> function_paremeters_value() {
			return getRuleContexts(Function_paremeters_valueContext.class);
		}
		public Function_paremeters_valueContext function_paremeters_value(int i) {
			return getRuleContext(Function_paremeters_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			function_paremeters_value();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(441);
				match(COMMA);
				setState(442);
				function_paremeters_value();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_paremeters_valueContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Function_paremeters_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_paremeters_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_paremeters_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_paremeters_value(this);
		}
	}

	public final Function_paremeters_valueContext function_paremeters_value() throws RecognitionException {
		Function_paremeters_valueContext _localctx = new Function_paremeters_valueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_paremeters_value);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(STRING_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(452);
				function_calling();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MainParser.VOID, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(FUNC);
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(456);
				variable_type();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(457);
					match(OPEN_BRACE);
					setState(458);
					match(CLOSE_BRACE);
					}
				}

				}
				break;
			case VOID:
				{
				setState(461);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(464);
			function_structure();
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

	public static class Function_structureContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Function_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_structure(this);
		}
	}

	public final Function_structureContext function_structure() throws RecognitionException {
		Function_structureContext _localctx = new Function_structureContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(LABEL);
			setState(467);
			match(OPEN_PAREN);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(468);
				function_declaration_parameters();
				}
			}

			setState(471);
			match(CLOSE_PAREN);
			setState(472);
			match(OPEN_BRACKET);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				statements();
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(478);
			match(CLOSE_BRACKET);
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

	public static class Function_declaration_parametersContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public Function_declaration_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_declaration_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_declaration_parameters(this);
		}
	}

	public final Function_declaration_parametersContext function_declaration_parameters() throws RecognitionException {
		Function_declaration_parametersContext _localctx = new Function_declaration_parametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_declaration_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			variable_type();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(481);
				match(OPEN_BRACE);
				setState(482);
				match(CLOSE_BRACE);
				}
			}

			setState(485);
			match(LABEL);
			setState(486);
			match(COMMA);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(487);
				function_declaration_parameters();
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

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MainParser.MAIN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(MAIN);
			setState(491);
			match(OPEN_PAREN);
			setState(492);
			match(CLOSE_PAREN);
			setState(493);
			match(OPEN_BRACKET);
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(494);
				statements();
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(499);
			match(CLOSE_BRACKET);
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

	public static class Scoping_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Scoping_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoping_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScoping_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScoping_statement(this);
		}
	}

	public final Scoping_statementContext scoping_statement() throws RecognitionException {
		Scoping_statementContext _localctx = new Scoping_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(OPEN_BRACKET);
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				statements();
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(507);
			match(CLOSE_BRACKET);
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
		case 25:
			return second_operator_expression_sempred((Second_operator_expressionContext)_localctx, predIndex);
		case 26:
			return first_operator_expression_sempred((First_operator_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean second_operator_expression_sempred(Second_operator_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean first_operator_expression_sempred(First_operator_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0200\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\5\7v\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\t\3\t\5\t\u0084\n\t\3\n\3\n\3\n\3\n\5"+
		"\n\u008a\n\n\3\13\3\13\3\13\3\13\5\13\u0090\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u009a\n\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c8\n\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ce\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\5\20\u00d7\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\5\21\u00de\n\21\5\21\u00e0\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00e6\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00ed\n\23\5"+
		"\23\u00ef\n\23\3\24\3\24\3\24\5\24\u00f4\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00fe\n\24\5\24\u0100\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0107\n\25\f\25\16\25\u010a\13\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\5\26\u0112\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0124\n\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0131\n\33\f\33\16\33\u0134\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0142"+
		"\n\34\f\34\16\34\u0145\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u014e"+
		"\n\35\3\36\5\36\u0151\n\36\3\36\5\36\u0154\n\36\3\36\3\36\3\36\3\36\5"+
		"\36\u015a\n\36\7\36\u015c\n\36\f\36\16\36\u015f\13\36\3\36\5\36\u0162"+
		"\n\36\3\36\3\36\3\36\5\36\u0167\n\36\5\36\u0169\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\5\37\u0170\n\37\3 \3 \3 \3 \7 \u0176\n \f \16 \u0179\13 \3 \3"+
		" \3 \5 \u017e\n \3!\3!\3!\3!\3!\3!\3\"\3\"\6\"\u0188\n\"\r\"\16\"\u0189"+
		"\3\"\3\"\3#\3#\5#\u0190\n#\3$\3$\3$\3$\3%\3%\3%\3%\3&\5&\u019b\n&\3&\3"+
		"&\3&\3&\3&\5&\u01a2\n&\5&\u01a4\n&\3&\5&\u01a7\n&\3\'\3\'\3\'\3\'\7\'"+
		"\u01ad\n\'\f\'\16\'\u01b0\13\'\3\'\3\'\3(\3(\3(\5(\u01b7\n(\3(\3(\3)\3"+
		")\3)\7)\u01be\n)\f)\16)\u01c1\13)\3*\3*\3*\3*\3*\5*\u01c8\n*\3+\3+\3+"+
		"\3+\5+\u01ce\n+\3+\5+\u01d1\n+\3+\3+\3,\3,\3,\5,\u01d8\n,\3,\3,\3,\6,"+
		"\u01dd\n,\r,\16,\u01de\3,\3,\3-\3-\3-\5-\u01e6\n-\3-\3-\3-\5-\u01eb\n"+
		"-\3.\3.\3.\3.\3.\6.\u01f2\n.\r.\16.\u01f3\3.\3.\3/\3/\6/\u01fa\n/\r/\16"+
		"/\u01fb\3/\3/\3/\2\4\64\66\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\3\2\23\26\3\2\63\64\5\2\35"+
		" &\'**\3\2\20\21\2\u0229\2a\3\2\2\2\4g\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\n"+
		"o\3\2\2\2\fu\3\2\2\2\16}\3\2\2\2\20\u0083\3\2\2\2\22\u0089\3\2\2\2\24"+
		"\u008f\3\2\2\2\26\u0091\3\2\2\2\30\u00a1\3\2\2\2\32\u00b1\3\2\2\2\34\u00bf"+
		"\3\2\2\2\36\u00cf\3\2\2\2 \u00d8\3\2\2\2\"\u00e1\3\2\2\2$\u00e7\3\2\2"+
		"\2&\u00f0\3\2\2\2(\u0101\3\2\2\2*\u0111\3\2\2\2,\u0113\3\2\2\2.\u011a"+
		"\3\2\2\2\60\u011d\3\2\2\2\62\u0125\3\2\2\2\64\u0127\3\2\2\2\66\u0135\3"+
		"\2\2\28\u014d\3\2\2\2:\u0150\3\2\2\2<\u016f\3\2\2\2>\u0171\3\2\2\2@\u017f"+
		"\3\2\2\2B\u0185\3\2\2\2D\u018f\3\2\2\2F\u0191\3\2\2\2H\u0195\3\2\2\2J"+
		"\u01a6\3\2\2\2L\u01a8\3\2\2\2N\u01b3\3\2\2\2P\u01ba\3\2\2\2R\u01c7\3\2"+
		"\2\2T\u01c9\3\2\2\2V\u01d4\3\2\2\2X\u01e2\3\2\2\2Z\u01ec\3\2\2\2\\\u01f7"+
		"\3\2\2\2^`\5T+\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3"+
		"\2\2\2de\5Z.\2ef\7\2\2\3f\3\3\2\2\2gh\t\2\2\2h\5\3\2\2\2ij\t\3\2\2j\7"+
		"\3\2\2\2kl\t\4\2\2l\t\3\2\2\2mp\5\f\7\2np\5\16\b\2om\3\2\2\2on\3\2\2\2"+
		"p\13\3\2\2\2qv\5> \2rv\5D#\2sv\5.\30\2tv\5\\/\2uq\3\2\2\2ur\3\2\2\2us"+
		"\3\2\2\2ut\3\2\2\2v\r\3\2\2\2w~\5(\25\2x~\5,\27\2y~\5\60\31\2z~\5\20\t"+
		"\2{~\5N(\2|~\5&\24\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2"+
		"}|\3\2\2\2~\177\3\2\2\2\177\u0080\7.\2\2\u0080\17\3\2\2\2\u0081\u0084"+
		"\5\22\n\2\u0082\u0084\5\24\13\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\21\3\2\2\2\u0085\u008a\5\36\20\2\u0086\u008a\5 \21\2\u0087\u008a"+
		"\5\"\22\2\u0088\u008a\5$\23\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\23\3\2\2\2\u008b\u0090"+
		"\5\26\f\2\u008c\u0090\5\30\r\2\u008d\u0090\5\32\16\2\u008e\u0090\5\34"+
		"\17\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\33"+
		"\2\2\u0093\u0094\7\34\2\2\u0094\u009f\7\65\2\2\u0095\u0099\7)\2\2\u0096"+
		"\u0097\7\3\2\2\u0097\u009a\7\25\2\2\u0098\u009a\7\65\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\33\2\2\u009c"+
		"\u009d\5\62\32\2\u009d\u009e\7\34\2\2\u009e\u00a0\3\2\2\2\u009f\u0095"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\23\2\2\u00a2"+
		"\u00a3\7\33\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00af\7\65\2\2\u00a5\u00a9"+
		"\7)\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00aa\7\23\2\2\u00a8\u00aa\7\65\2\2"+
		"\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\33\2\2\u00ac\u00ad\5\62\32\2\u00ad\u00ae\7\34\2\2\u00ae\u00b0\3\2\2"+
		"\2\u00af\u00a5\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b2"+
		"\7\26\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\34\2\2\u00b4\u00bd\7\65\2"+
		"\2\u00b5\u00b6\7)\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb\5\62\32\2\u00bb\u00bc\7\34\2"+
		"\2\u00bc\u00be\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\33"+
		"\3\2\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2\7\34\2"+
		"\2\u00c2\u00cd\7\65\2\2\u00c3\u00c7\7)\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c8"+
		"\7\24\2\2\u00c6\u00c8\7\65\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cb\5\62\32\2\u00cb"+
		"\u00cc\7\34\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7\25\2\2\u00d0\u00d6\7\65\2\2\u00d1"+
		"\u00d4\7)\2\2\u00d2\u00d5\7\64\2\2\u00d3\u00d5\5\62\32\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\37\3\2\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00df\7\65"+
		"\2\2\u00da\u00dd\7)\2\2\u00db\u00de\7\63\2\2\u00dc\u00de\5\62\32\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00da\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0!\3\2\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e5"+
		"\7\65\2\2\u00e3\u00e4\7)\2\2\u00e4\u00e6\7\62\2\2\u00e5\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6#\3\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00ee\7"+
		"\65\2\2\u00e9\u00ec\7)\2\2\u00ea\u00ed\5:\36\2\u00eb\u00ed\7\65\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef%\3\2\2\2\u00f0\u00f3\7\65\2\2\u00f1\u00f2"+
		"\7\33\2\2\u00f2\u00f4\7\34\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00ff\7)\2\2\u00f6\u0100\5\6\4\2\u00f7\u0100"+
		"\5\62\32\2\u00f8\u0100\7\62\2\2\u00f9\u0100\5:\36\2\u00fa\u00fd\7\65\2"+
		"\2\u00fb\u00fc\7\33\2\2\u00fc\u00fe\7\34\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f7\3\2"+
		"\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100"+
		"\'\3\2\2\2\u0101\u0102\7\6\2\2\u0102\u0103\7\27\2\2\u0103\u0108\5*\26"+
		"\2\u0104\u0105\7!\2\2\u0105\u0107\5*\26\2\u0106\u0104\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\7\30\2\2\u010c)\3\2\2\2\u010d\u0112\7\62\2"+
		"\2\u010e\u0112\7\65\2\2\u010f\u0112\5\62\32\2\u0110\u0112\5N(\2\u0111"+
		"\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2"+
		"\2\2\u0112+\3\2\2\2\u0113\u0114\7\7\2\2\u0114\u0115\7\27\2\2\u0115\u0116"+
		"\7\62\2\2\u0116\u0117\7/\2\2\u0117\u0118\7\65\2\2\u0118\u0119\7\30\2\2"+
		"\u0119-\3\2\2\2\u011a\u011b\7\4\2\2\u011b\u011c\5\20\t\2\u011c/\3\2\2"+
		"\2\u011d\u0123\7\5\2\2\u011e\u0124\7\62\2\2\u011f\u0124\5\6\4\2\u0120"+
		"\u0124\7\65\2\2\u0121\u0124\5\62\32\2\u0122\u0124\5N(\2\u0123\u011e\3"+
		"\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\61\3\2\2\2\u0125\u0126\5\64\33\2\u0126\63\3\2\2\2"+
		"\u0127\u0128\b\33\1\2\u0128\u0129\5\66\34\2\u0129\u0132\3\2\2\2\u012a"+
		"\u012b\f\5\2\2\u012b\u012c\7!\2\2\u012c\u0131\5\66\34\2\u012d\u012e\f"+
		"\4\2\2\u012e\u012f\7\"\2\2\u012f\u0131\5\66\34\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\65\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\34\1\2\u0136\u0137"+
		"\58\35\2\u0137\u0143\3\2\2\2\u0138\u0139\f\6\2\2\u0139\u013a\7$\2\2\u013a"+
		"\u0142\58\35\2\u013b\u013c\f\5\2\2\u013c\u013d\7#\2\2\u013d\u0142\58\35"+
		"\2\u013e\u013f\f\4\2\2\u013f\u0140\7%\2\2\u0140\u0142\58\35\2\u0141\u0138"+
		"\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\67\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u014e\5\6\4\2\u0147\u0148\7\27\2\2\u0148\u0149\5\62\32\2\u0149"+
		"\u014a\7\30\2\2\u014a\u014e\3\2\2\2\u014b\u014e\5N(\2\u014c\u014e\7\65"+
		"\2\2\u014d\u0146\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e9\3\2\2\2\u014f\u0151\7(\2\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\7\27\2\2\u0153\u0152\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015d\5<\37\2\u0156"+
		"\u0159\5\b\5\2\u0157\u015a\5<\37\2\u0158\u015a\5:\36\2\u0159\u0157\3\2"+
		"\2\2\u0159\u0158\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0156\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\30\2\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0168\3\2\2\2\u0163\u0166\5\b\5\2\u0164\u0167\5<"+
		"\37\2\u0165\u0167\5:\36\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0169\3\2\2\2\u0169;\3\2\2\2"+
		"\u016a\u0170\7\65\2\2\u016b\u0170\5\6\4\2\u016c\u0170\5\62\32\2\u016d"+
		"\u0170\7\62\2\2\u016e\u0170\5N(\2\u016f\u016a\3\2\2\2\u016f\u016b\3\2"+
		"\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"=\3\2\2\2\u0171\u0172\7\13\2\2\u0172\u0177\5@!\2\u0173\u0174\7\r\2\2\u0174"+
		"\u0176\5@!\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2"+
		"\2\u0177\u0178\3\2\2\2\u0178\u017d\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b"+
		"\7\f\2\2\u017b\u017c\7\16\2\2\u017c\u017e\5B\"\2\u017d\u017a\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e?\3\2\2\2\u017f\u0180\7\27\2\2\u0180\u0181\5:\36\2"+
		"\u0181\u0182\7\30\2\2\u0182\u0183\7\16\2\2\u0183\u0184\5B\"\2\u0184A\3"+
		"\2\2\2\u0185\u0187\7\31\2\2\u0186\u0188\5\n\6\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018c\7\32\2\2\u018cC\3\2\2\2\u018d\u0190\5F$\2\u018e\u0190"+
		"\5H%\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190E\3\2\2\2\u0191\u0192"+
		"\7\22\2\2\u0192\u0193\5\62\32\2\u0193\u0194\5L\'\2\u0194G\3\2\2\2\u0195"+
		"\u0196\7\17\2\2\u0196\u0197\5J&\2\u0197\u0198\5L\'\2\u0198I\3\2\2\2\u0199"+
		"\u019b\5\4\3\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u01a3\7\65\2\2\u019d\u01a1\7)\2\2\u019e\u01a2\5\6\4\2\u019f"+
		"\u01a2\7\65\2\2\u01a0\u01a2\5\62\32\2\u01a1\u019e\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\5\62\32\2\u01a6\u019a\3"+
		"\2\2\2\u01a6\u01a5\3\2\2\2\u01a7K\3\2\2\2\u01a8\u01a9\t\5\2\2\u01a9\u01aa"+
		"\5\62\32\2\u01aa\u01ae\7\31\2\2\u01ab\u01ad\5\n\6\2\u01ac\u01ab\3\2\2"+
		"\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1"+
		"\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\32\2\2\u01b2M\3\2\2\2\u01b3"+
		"\u01b4\7\65\2\2\u01b4\u01b6\7\27\2\2\u01b5\u01b7\5P)\2\u01b6\u01b5\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7\30\2\2\u01b9"+
		"O\3\2\2\2\u01ba\u01bf\5R*\2\u01bb\u01bc\7/\2\2\u01bc\u01be\5R*\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0Q\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c8\7\65\2\2\u01c3\u01c8"+
		"\5\62\32\2\u01c4\u01c8\7\62\2\2\u01c5\u01c8\5\6\4\2\u01c6\u01c8\5N(\2"+
		"\u01c7\u01c2\3\2\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8S\3\2\2\2\u01c9\u01d0\7\t\2\2\u01ca"+
		"\u01cd\5\4\3\2\u01cb\u01cc\7\33\2\2\u01cc\u01ce\7\34\2\2\u01cd\u01cb\3"+
		"\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01d1\7\b\2\2\u01d0"+
		"\u01ca\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5V"+
		",\2\u01d3U\3\2\2\2\u01d4\u01d5\7\65\2\2\u01d5\u01d7\7\27\2\2\u01d6\u01d8"+
		"\5X-\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\7\30\2\2\u01da\u01dc\7\31\2\2\u01db\u01dd\5\n\6\2\u01dc\u01db\3"+
		"\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\7\32\2\2\u01e1W\3\2\2\2\u01e2\u01e5\5\4\3\2"+
		"\u01e3\u01e4\7\33\2\2\u01e4\u01e6\7\34\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7\65\2\2\u01e8\u01ea\7/\2\2\u01e9"+
		"\u01eb\5X-\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebY\3\2\2\2\u01ec"+
		"\u01ed\7\n\2\2\u01ed\u01ee\7\27\2\2\u01ee\u01ef\7\30\2\2\u01ef\u01f1\7"+
		"\31\2\2\u01f0\u01f2\5\n\6\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\32"+
		"\2\2\u01f6[\3\2\2\2\u01f7\u01f9\7\31\2\2\u01f8\u01fa\5\n\6\2\u01f9\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\7\32\2\2\u01fe]\3\2\2\2>aou}\u0083\u0089\u008f"+
		"\u0099\u009f\u00a9\u00af\u00bd\u00c7\u00cd\u00d4\u00d6\u00dd\u00df\u00e5"+
		"\u00ec\u00ee\u00f3\u00fd\u00ff\u0108\u0111\u0123\u0130\u0132\u0141\u0143"+
		"\u014d\u0150\u0153\u0159\u015d\u0161\u0166\u0168\u016f\u0177\u017d\u0189"+
		"\u018f\u019a\u01a1\u01a3\u01a6\u01ae\u01b6\u01bf\u01c7\u01cd\u01d0\u01d7"+
		"\u01de\u01e5\u01ea\u01f3\u01fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}