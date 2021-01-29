// Generated from Main.g4 by ANTLR 4.9
package grammarfile;

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
		RULE_return_statement = 22, RULE_expression = 23, RULE_second_operator_expression = 24, 
		RULE_first_operator_expression = 25, RULE_value_expression = 26, RULE_comparison_statement = 27, 
		RULE_value_comparison = 28, RULE_conditional_statement = 29, RULE_conditional_comparison_structure = 30, 
		RULE_conditional_body = 31, RULE_loop_statement = 32, RULE_while_statement = 33, 
		RULE_for_statement = 34, RULE_loop_variable_declaration = 35, RULE_loop_structure = 36, 
		RULE_function_calling = 37, RULE_function_parameters = 38, RULE_function_paremeters_value = 39, 
		RULE_function_declaration = 40, RULE_function_structure = 41, RULE_function_declaration_parameters = 42, 
		RULE_main_function = 43, RULE_scoping_statement = 44, RULE_left_bracket = 45, 
		RULE_right_bracket = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "number", "logic_relational_operators", "statements", 
			"big_statements", "small_statements", "any_declaration", "var_declaration", 
			"arr_declaration", "float_arr_declaration", "int_arr_declaration", "string_arr_declaration", 
			"boolean_arr_declaration", "float_declaration", "int_declaration", "string_declaration", 
			"boolean_declaration", "assignment_statement", "print_statement", "extended_value_print", 
			"scan_statement", "return_statement", "expression", "second_operator_expression", 
			"first_operator_expression", "value_expression", "comparison_statement", 
			"value_comparison", "conditional_statement", "conditional_comparison_structure", 
			"conditional_body", "loop_statement", "while_statement", "for_statement", 
			"loop_variable_declaration", "loop_structure", "function_calling", "function_parameters", 
			"function_paremeters_value", "function_declaration", "function_structure", 
			"function_declaration_parameters", "main_function", "scoping_statement", 
			"left_bracket", "right_bracket"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'constant'", "'return'", "'print'", "'scan'", "'void'", 
			"'func'", "'main'", "'if'", "'else'", "'else if'", "'then'", "'for'", 
			"'up to'", "'down to'", "'while'", "'int'", "'bool'", "'float'", "'String'", 
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(94);
				function_declaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			main_function();
			setState(101);
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
			setState(103);
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
			setState(105);
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
			setState(107);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				big_statements();
				}
				break;
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				small_statements();
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

	public static class Big_statementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				loop_statement();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				scoping_statement();
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(118);
				print_statement();
				}
				break;
			case 2:
				{
				setState(119);
				scan_statement();
				}
				break;
			case 3:
				{
				setState(120);
				return_statement();
				}
				break;
			case 4:
				{
				setState(121);
				any_declaration();
				}
				break;
			case 5:
				{
				setState(122);
				function_calling();
				}
				break;
			case 6:
				{
				setState(123);
				assignment_statement();
				}
				break;
			}
			setState(126);
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
		public TerminalNode CONSTANT() { return getToken(MainParser.CONSTANT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(128);
				match(CONSTANT);
				}
			}

			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(131);
				var_declaration();
				}
				break;
			case 2:
				{
				setState(132);
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				float_declaration();
				}
				break;
			case INT_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				int_declaration();
				}
				break;
			case STRING_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				string_declaration();
				}
				break;
			case BOOLEAN_DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				boolean_declaration();
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				float_arr_declaration();
				}
				break;
			case INT_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				int_arr_declaration();
				}
				break;
			case STRING_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				string_arr_declaration();
				}
				break;
			case BOOLEAN_DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				boolean_arr_declaration();
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
			setState(147);
			match(FLOAT_DEC);
			setState(148);
			match(OPEN_BRACE);
			setState(149);
			match(CLOSE_BRACE);
			setState(150);
			match(LABEL);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(151);
				match(ASSIGN);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(152);
					match(CREATE);
					setState(153);
					match(FLOAT_DEC);
					}
					break;
				case LABEL:
					{
					setState(154);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157);
				match(OPEN_BRACE);
				setState(158);
				expression();
				setState(159);
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
			setState(163);
			match(INT_DEC);
			setState(164);
			match(OPEN_BRACE);
			setState(165);
			match(CLOSE_BRACE);
			setState(166);
			match(LABEL);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(167);
				match(ASSIGN);
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(168);
					match(CREATE);
					setState(169);
					match(INT_DEC);
					}
					break;
				case LABEL:
					{
					setState(170);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173);
				match(OPEN_BRACE);
				setState(174);
				expression();
				setState(175);
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
			setState(179);
			match(STRING_DEC);
			setState(180);
			match(OPEN_BRACE);
			setState(181);
			match(CLOSE_BRACE);
			setState(182);
			match(LABEL);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(183);
				match(ASSIGN);
				{
				setState(184);
				match(CREATE);
				setState(185);
				match(STRING_DEC);
				}
				setState(187);
				match(OPEN_BRACE);
				setState(188);
				expression();
				setState(189);
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
			setState(193);
			match(BOOLEAN_DEC);
			setState(194);
			match(OPEN_BRACE);
			setState(195);
			match(CLOSE_BRACE);
			setState(196);
			match(LABEL);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(197);
				match(ASSIGN);
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(198);
					match(CREATE);
					setState(199);
					match(BOOLEAN_DEC);
					}
					break;
				case LABEL:
					{
					setState(200);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203);
				match(OPEN_BRACE);
				setState(204);
				expression();
				setState(205);
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
			setState(209);
			match(FLOAT_DEC);
			setState(210);
			match(LABEL);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(211);
				match(ASSIGN);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(212);
					match(FLOAT_NUMBER);
					}
					break;
				case 2:
					{
					setState(213);
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
			setState(218);
			match(INT_DEC);
			setState(219);
			match(LABEL);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(220);
				match(ASSIGN);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(221);
					match(INT_NUMBER);
					}
					break;
				case 2:
					{
					setState(222);
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
			setState(227);
			match(STRING_DEC);
			setState(228);
			match(LABEL);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(229);
				match(ASSIGN);
				setState(230);
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
			setState(233);
			match(BOOLEAN_DEC);
			setState(234);
			match(LABEL);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(235);
				match(ASSIGN);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(236);
					comparison_statement();
					}
					break;
				case 2:
					{
					setState(237);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(242);
			match(LABEL);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(243);
				match(OPEN_BRACE);
				setState(244);
				expression();
				setState(245);
				match(CLOSE_BRACE);
				}
			}

			setState(249);
			match(ASSIGN);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(250);
				number();
				}
				break;
			case 2:
				{
				setState(251);
				expression();
				}
				break;
			case 3:
				{
				setState(252);
				match(STRING_TYPE);
				}
				break;
			case 4:
				{
				setState(253);
				comparison_statement();
				}
				break;
			case 5:
				{
				setState(254);
				match(LABEL);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(255);
					match(OPEN_BRACE);
					setState(256);
					expression();
					setState(257);
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
			setState(263);
			match(PRINT);
			setState(264);
			match(OPEN_PAREN);
			setState(265);
			extended_value_print();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(266);
				match(PLUS);
				setState(267);
				extended_value_print();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(STRING_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(LABEL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
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
			setState(281);
			match(SCAN);
			setState(282);
			match(OPEN_PAREN);
			setState(283);
			match(STRING_TYPE);
			setState(284);
			match(COMMA);
			setState(285);
			match(LABEL);
			setState(286);
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
		enterRule(_localctx, 44, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(RETURN);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(289);
				match(STRING_TYPE);
				}
				break;
			case 2:
				{
				setState(290);
				number();
				}
				break;
			case 3:
				{
				setState(291);
				match(LABEL);
				}
				break;
			case 4:
				{
				setState(292);
				expression();
				}
				break;
			case 5:
				{
				setState(293);
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
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_second_operator_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			first_operator_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Second_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_second_operator_expression);
						setState(301);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(302);
						match(PLUS);
						setState(303);
						first_operator_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Second_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_second_operator_expression);
						setState(304);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(305);
						match(MINUS);
						setState(306);
						first_operator_expression(0);
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_first_operator_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			value_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(315);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(316);
						match(DIV);
						setState(317);
						value_expression();
						}
						break;
					case 2:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319);
						match(MULTI);
						setState(320);
						value_expression();
						}
						break;
					case 3:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(MOD);
						setState(323);
						value_expression();
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 52, RULE_value_expression);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(OPEN_PAREN);
				setState(331);
				expression();
				setState(332);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
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
		enterRule(_localctx, 54, RULE_comparison_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(338);
				match(NOT);
				}
			}

			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(341);
				match(OPEN_PAREN);
				}
				break;
			}
			setState(344);
			value_comparison();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					logic_relational_operators();
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(346);
						value_comparison();
						}
						break;
					case 2:
						{
						setState(347);
						comparison_statement();
						}
						break;
					}
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(355);
				match(CLOSE_PAREN);
				}
				break;
			}
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(358);
				logic_relational_operators();
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(359);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(360);
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
		enterRule(_localctx, 56, RULE_value_comparison);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(STRING_TYPE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
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
		enterRule(_localctx, 58, RULE_conditional_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IF);
			setState(373);
			conditional_comparison_structure();
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					match(ELSE_IF);
					setState(375);
					conditional_comparison_structure();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(381);
				match(ELSE);
				setState(382);
				match(THEN);
				setState(383);
				conditional_body();
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
		enterRule(_localctx, 60, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(OPEN_PAREN);
			setState(387);
			comparison_statement();
			setState(388);
			match(CLOSE_PAREN);
			setState(389);
			match(THEN);
			setState(390);
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
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_conditional_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			left_bracket();
			setState(394); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(393);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(396); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(398);
			right_bracket();
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
		enterRule(_localctx, 64, RULE_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(400);
				while_statement();
				}
				break;
			case FOR:
				{
				setState(401);
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
		enterRule(_localctx, 66, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(WHILE);
			setState(405);
			expression();
			setState(406);
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
		enterRule(_localctx, 68, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(FOR);
			setState(409);
			loop_variable_declaration();
			setState(410);
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
		enterRule(_localctx, 70, RULE_loop_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
					{
					setState(412);
					variable_type();
					}
				}

				setState(415);
				match(LABEL);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(416);
					match(ASSIGN);
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(417);
						number();
						}
						break;
					case 2:
						{
						setState(418);
						match(LABEL);
						}
						break;
					case 3:
						{
						setState(419);
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
				setState(424);
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
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==UP_TO || _la==DOWN_TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(428);
			expression();
			setState(429);
			left_bracket();
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					statements();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(436);
			right_bracket();
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
		enterRule(_localctx, 74, RULE_function_calling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(LABEL);
			setState(439);
			match(OPEN_PAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << STRING_TYPE) | (1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << LABEL))) != 0)) {
				{
				setState(440);
				function_parameters();
				}
			}

			setState(443);
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
		enterRule(_localctx, 76, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			function_paremeters_value();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446);
				match(COMMA);
				setState(447);
				function_paremeters_value();
				}
				}
				setState(452);
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
		enterRule(_localctx, 78, RULE_function_paremeters_value);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				match(STRING_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
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
		enterRule(_localctx, 80, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(FUNC);
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(461);
				variable_type();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(462);
					match(OPEN_BRACE);
					setState(463);
					match(CLOSE_BRACE);
					}
				}

				}
				break;
			case VOID:
				{
				setState(466);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(469);
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
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(LABEL);
			setState(472);
			match(OPEN_PAREN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(473);
				function_declaration_parameters();
				}
			}

			setState(476);
			match(CLOSE_PAREN);
			setState(477);
			left_bracket();
			setState(479); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				statements();
				}
				}
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(483);
			right_bracket();
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
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
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
		enterRule(_localctx, 84, RULE_function_declaration_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			variable_type();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(486);
				match(OPEN_BRACE);
				setState(487);
				match(CLOSE_BRACE);
				}
			}

			setState(490);
			match(LABEL);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(491);
				match(COMMA);
				setState(492);
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
		public Left_bracketContext left_bracket() {
			return getRuleContext(Left_bracketContext.class,0);
		}
		public Right_bracketContext right_bracket() {
			return getRuleContext(Right_bracketContext.class,0);
		}
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
		enterRule(_localctx, 86, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(MAIN);
			setState(496);
			match(OPEN_PAREN);
			setState(497);
			match(CLOSE_PAREN);
			setState(498);
			left_bracket();
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				statements();
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(504);
			right_bracket();
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
		enterRule(_localctx, 88, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(OPEN_BRACKET);
			setState(508); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				statements();
				}
				}
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(512);
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

	public static class Left_bracketContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public Left_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLeft_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLeft_bracket(this);
		}
	}

	public final Left_bracketContext left_bracket() throws RecognitionException {
		Left_bracketContext _localctx = new Left_bracketContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_left_bracket);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(OPEN_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing Left Bracket");
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

	public static class Right_bracketContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public Right_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterRight_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitRight_bracket(this);
		}
	}

	public final Right_bracketContext right_bracket() throws RecognitionException {
		Right_bracketContext _localctx = new Right_bracketContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_right_bracket);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing Right Bracket");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return second_operator_expression_sempred((Second_operator_expressionContext)_localctx, predIndex);
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u020d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6r\n\6\3\7\3\7\3\7\5\7w\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\3\t\5\t\u0084\n\t\3\t\3\t\5\t\u0088"+
		"\n\t\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\5\13\u0094\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009e\n\f\3\f\3\f\3\f\3\f\5\f\u00a4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00b4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00c2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00d2\n\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00d9\n\20\5\20\u00db\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00e2\n\21\5"+
		"\21\u00e4\n\21\3\22\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00f1\n\23\5\23\u00f3\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00fa"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24"+
		"\5\24\u0108\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u010f\n\25\f\25\16\25\u0112"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0129\n\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0136\n\32\f\32"+
		"\16\32\u0139\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\7\33\u0147\n\33\f\33\16\33\u014a\13\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0153\n\34\3\35\5\35\u0156\n\35\3\35\5\35\u0159\n\35"+
		"\3\35\3\35\3\35\3\35\5\35\u015f\n\35\7\35\u0161\n\35\f\35\16\35\u0164"+
		"\13\35\3\35\5\35\u0167\n\35\3\35\3\35\3\35\5\35\u016c\n\35\5\35\u016e"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0175\n\36\3\37\3\37\3\37\3\37\7\37"+
		"\u017b\n\37\f\37\16\37\u017e\13\37\3\37\3\37\3\37\5\37\u0183\n\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\6!\u018d\n!\r!\16!\u018e\3!\3!\3\"\3\"\5\"\u0195\n"+
		"\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\5%\u01a0\n%\3%\3%\3%\3%\3%\5%\u01a7\n%\5"+
		"%\u01a9\n%\3%\5%\u01ac\n%\3&\3&\3&\3&\7&\u01b2\n&\f&\16&\u01b5\13&\3&"+
		"\3&\3\'\3\'\3\'\5\'\u01bc\n\'\3\'\3\'\3(\3(\3(\7(\u01c3\n(\f(\16(\u01c6"+
		"\13(\3)\3)\3)\3)\3)\5)\u01cd\n)\3*\3*\3*\3*\5*\u01d3\n*\3*\5*\u01d6\n"+
		"*\3*\3*\3+\3+\3+\5+\u01dd\n+\3+\3+\3+\6+\u01e2\n+\r+\16+\u01e3\3+\3+\3"+
		",\3,\3,\5,\u01eb\n,\3,\3,\3,\5,\u01f0\n,\3-\3-\3-\3-\3-\6-\u01f7\n-\r"+
		"-\16-\u01f8\3-\3-\3.\3.\6.\u01ff\n.\r.\16.\u0200\3.\3.\3/\3/\5/\u0207"+
		"\n/\3\60\3\60\5\60\u020b\n\60\3\60\2\4\62\64\61\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\6\3\2\23\26"+
		"\3\2\63\64\5\2\35 &\'**\3\2\20\21\2\u0237\2c\3\2\2\2\4i\3\2\2\2\6k\3\2"+
		"\2\2\bm\3\2\2\2\nq\3\2\2\2\fv\3\2\2\2\16~\3\2\2\2\20\u0083\3\2\2\2\22"+
		"\u008d\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30\u00a5\3\2\2\2\32\u00b5"+
		"\3\2\2\2\34\u00c3\3\2\2\2\36\u00d3\3\2\2\2 \u00dc\3\2\2\2\"\u00e5\3\2"+
		"\2\2$\u00eb\3\2\2\2&\u00f4\3\2\2\2(\u0109\3\2\2\2*\u0119\3\2\2\2,\u011b"+
		"\3\2\2\2.\u0122\3\2\2\2\60\u012a\3\2\2\2\62\u012c\3\2\2\2\64\u013a\3\2"+
		"\2\2\66\u0152\3\2\2\28\u0155\3\2\2\2:\u0174\3\2\2\2<\u0176\3\2\2\2>\u0184"+
		"\3\2\2\2@\u018a\3\2\2\2B\u0194\3\2\2\2D\u0196\3\2\2\2F\u019a\3\2\2\2H"+
		"\u01ab\3\2\2\2J\u01ad\3\2\2\2L\u01b8\3\2\2\2N\u01bf\3\2\2\2P\u01cc\3\2"+
		"\2\2R\u01ce\3\2\2\2T\u01d9\3\2\2\2V\u01e7\3\2\2\2X\u01f1\3\2\2\2Z\u01fc"+
		"\3\2\2\2\\\u0206\3\2\2\2^\u020a\3\2\2\2`b\5R*\2a`\3\2\2\2be\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5X-\2gh\7\2\2\3h\3\3\2\2\2ij"+
		"\t\2\2\2j\5\3\2\2\2kl\t\3\2\2l\7\3\2\2\2mn\t\4\2\2n\t\3\2\2\2or\5\f\7"+
		"\2pr\5\16\b\2qo\3\2\2\2qp\3\2\2\2r\13\3\2\2\2sw\5<\37\2tw\5B\"\2uw\5Z"+
		".\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\r\3\2\2\2x\177\5(\25\2y\177\5,\27\2"+
		"z\177\5.\30\2{\177\5\20\t\2|\177\5L\'\2}\177\5&\24\2~x\3\2\2\2~y\3\2\2"+
		"\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\7.\2\2\u0081\17\3\2\2\2\u0082\u0084\7\4\2\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0088\5\22\n\2\u0086\u0088\5"+
		"\24\13\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\21\3\2\2\2\u0089"+
		"\u008e\5\36\20\2\u008a\u008e\5 \21\2\u008b\u008e\5\"\22\2\u008c\u008e"+
		"\5$\23\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f\u0094\5\26\f\2\u0090\u0094\5\30"+
		"\r\2\u0091\u0094\5\32\16\2\u0092\u0094\5\34\17\2\u0093\u008f\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2"+
		"\2\u0095\u0096\7\25\2\2\u0096\u0097\7\33\2\2\u0097\u0098\7\34\2\2\u0098"+
		"\u00a3\7\65\2\2\u0099\u009d\7)\2\2\u009a\u009b\7\3\2\2\u009b\u009e\7\25"+
		"\2\2\u009c\u009e\7\65\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00a2"+
		"\7\34\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\27\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8"+
		"\7\34\2\2\u00a8\u00b3\7\65\2\2\u00a9\u00ad\7)\2\2\u00aa\u00ab\7\3\2\2"+
		"\u00ab\u00ae\7\23\2\2\u00ac\u00ae\7\65\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b1\5\60\31"+
		"\2\u00b1\u00b2\7\34\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\7\33"+
		"\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00c1\7\65\2\2\u00b9\u00ba\7)\2\2\u00ba"+
		"\u00bb\7\3\2\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7"+
		"\33\2\2\u00be\u00bf\5\60\31\2\u00bf\u00c0\7\34\2\2\u00c0\u00c2\3\2\2\2"+
		"\u00c1\u00b9\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\33\3\2\2\2\u00c3\u00c4"+
		"\7\24\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00d1\7\65\2"+
		"\2\u00c7\u00cb\7)\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00cc\7\24\2\2\u00ca\u00cc"+
		"\7\65\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00ce\7\33\2\2\u00ce\u00cf\5\60\31\2\u00cf\u00d0\7\34\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\7\25\2\2\u00d4\u00da\7\65\2\2\u00d5\u00d8\7)\2\2\u00d6"+
		"\u00d9\7\64\2\2\u00d7\u00d9\5\60\31\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\37\3\2\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00e3\7\65\2\2\u00de\u00e1\7)\2"+
		"\2\u00df\u00e2\7\63\2\2\u00e0\u00e2\5\60\31\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4!\3\2\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00e9\7\65\2\2\u00e7\u00e8"+
		"\7)\2\2\u00e8\u00ea\7\62\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"#\3\2\2\2\u00eb\u00ec\7\24\2\2\u00ec\u00f2\7\65\2\2\u00ed\u00f0\7)\2\2"+
		"\u00ee\u00f1\58\35\2\u00ef\u00f1\7\65\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"%\3\2\2\2\u00f4\u00f9\7\65\2\2\u00f5\u00f6\7\33\2\2\u00f6\u00f7\5\60\31"+
		"\2\u00f7\u00f8\7\34\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0107\7)\2\2\u00fc\u0108\5\6"+
		"\4\2\u00fd\u0108\5\60\31\2\u00fe\u0108\7\62\2\2\u00ff\u0108\58\35\2\u0100"+
		"\u0105\7\65\2\2\u0101\u0102\7\33\2\2\u0102\u0103\5\60\31\2\u0103\u0104"+
		"\7\34\2\2\u0104\u0106\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0108\3\2\2\2\u0107\u00fc\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u00fe"+
		"\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0108\'\3\2\2\2\u0109"+
		"\u010a\7\6\2\2\u010a\u010b\7\27\2\2\u010b\u0110\5*\26\2\u010c\u010d\7"+
		"!\2\2\u010d\u010f\5*\26\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0114\7\30\2\2\u0114)\3\2\2\2\u0115\u011a\7\62\2\2\u0116\u011a"+
		"\7\65\2\2\u0117\u011a\5\60\31\2\u0118\u011a\5L\'\2\u0119\u0115\3\2\2\2"+
		"\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a+\3"+
		"\2\2\2\u011b\u011c\7\7\2\2\u011c\u011d\7\27\2\2\u011d\u011e\7\62\2\2\u011e"+
		"\u011f\7/\2\2\u011f\u0120\7\65\2\2\u0120\u0121\7\30\2\2\u0121-\3\2\2\2"+
		"\u0122\u0128\7\5\2\2\u0123\u0129\7\62\2\2\u0124\u0129\5\6\4\2\u0125\u0129"+
		"\7\65\2\2\u0126\u0129\5\60\31\2\u0127\u0129\5L\'\2\u0128\u0123\3\2\2\2"+
		"\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129/\3\2\2\2\u012a\u012b\5\62\32\2\u012b\61\3\2\2\2\u012c\u012d"+
		"\b\32\1\2\u012d\u012e\5\64\33\2\u012e\u0137\3\2\2\2\u012f\u0130\f\5\2"+
		"\2\u0130\u0131\7!\2\2\u0131\u0136\5\64\33\2\u0132\u0133\f\4\2\2\u0133"+
		"\u0134\7\"\2\2\u0134\u0136\5\64\33\2\u0135\u012f\3\2\2\2\u0135\u0132\3"+
		"\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\63\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b\33\1\2\u013b\u013c\5\66"+
		"\34\2\u013c\u0148\3\2\2\2\u013d\u013e\f\6\2\2\u013e\u013f\7$\2\2\u013f"+
		"\u0147\5\66\34\2\u0140\u0141\f\5\2\2\u0141\u0142\7#\2\2\u0142\u0147\5"+
		"\66\34\2\u0143\u0144\f\4\2\2\u0144\u0145\7%\2\2\u0145\u0147\5\66\34\2"+
		"\u0146\u013d\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\65\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u0153\5\6\4\2\u014c\u014d\7\27\2\2\u014d\u014e\5"+
		"\60\31\2\u014e\u014f\7\30\2\2\u014f\u0153\3\2\2\2\u0150\u0153\5L\'\2\u0151"+
		"\u0153\7\65\2\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0151\3\2\2\2\u0153\67\3\2\2\2\u0154\u0156\7(\2\2\u0155\u0154"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\7\27\2\2"+
		"\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0162"+
		"\5:\36\2\u015b\u015e\5\b\5\2\u015c\u015f\5:\36\2\u015d\u015f\58\35\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015b\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\7\30\2\2\u0166\u0165\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0167\u016d\3\2\2\2\u0168\u016b\5\b\5\2\u0169"+
		"\u016c\5:\36\2\u016a\u016c\58\35\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"9\3\2\2\2\u016f\u0175\7\65\2\2\u0170\u0175\5\6\4\2\u0171\u0175\5\60\31"+
		"\2\u0172\u0175\7\62\2\2\u0173\u0175\5L\'\2\u0174\u016f\3\2\2\2\u0174\u0170"+
		"\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		";\3\2\2\2\u0176\u0177\7\13\2\2\u0177\u017c\5> \2\u0178\u0179\7\r\2\2\u0179"+
		"\u017b\5> \2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u0182\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180"+
		"\7\f\2\2\u0180\u0181\7\16\2\2\u0181\u0183\5@!\2\u0182\u017f\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183=\3\2\2\2\u0184\u0185\7\27\2\2\u0185\u0186\58\35\2"+
		"\u0186\u0187\7\30\2\2\u0187\u0188\7\16\2\2\u0188\u0189\5@!\2\u0189?\3"+
		"\2\2\2\u018a\u018c\5\\/\2\u018b\u018d\5\n\6\2\u018c\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\5^\60\2\u0191A\3\2\2\2\u0192\u0195\5D#\2\u0193\u0195"+
		"\5F$\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195C\3\2\2\2\u0196\u0197"+
		"\7\22\2\2\u0197\u0198\5\60\31\2\u0198\u0199\5J&\2\u0199E\3\2\2\2\u019a"+
		"\u019b\7\17\2\2\u019b\u019c\5H%\2\u019c\u019d\5J&\2\u019dG\3\2\2\2\u019e"+
		"\u01a0\5\4\3\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a8\7\65\2\2\u01a2\u01a6\7)\2\2\u01a3\u01a7\5\6\4\2\u01a4"+
		"\u01a7\7\65\2\2\u01a5\u01a7\5\60\31\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\5\60\31\2\u01ab\u019f\3"+
		"\2\2\2\u01ab\u01aa\3\2\2\2\u01acI\3\2\2\2\u01ad\u01ae\t\5\2\2\u01ae\u01af"+
		"\5\60\31\2\u01af\u01b3\5\\/\2\u01b0\u01b2\5\n\6\2\u01b1\u01b0\3\2\2\2"+
		"\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\5^\60\2\u01b7K\3\2\2\2\u01b8"+
		"\u01b9\7\65\2\2\u01b9\u01bb\7\27\2\2\u01ba\u01bc\5N(\2\u01bb\u01ba\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\30\2\2\u01be"+
		"M\3\2\2\2\u01bf\u01c4\5P)\2\u01c0\u01c1\7/\2\2\u01c1\u01c3\5P)\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5O\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cd\7\65\2\2\u01c8\u01cd"+
		"\5\60\31\2\u01c9\u01cd\7\62\2\2\u01ca\u01cd\5\6\4\2\u01cb\u01cd\5L\'\2"+
		"\u01cc\u01c7\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cdQ\3\2\2\2\u01ce\u01d5\7\t\2\2\u01cf"+
		"\u01d2\5\4\3\2\u01d0\u01d1\7\33\2\2\u01d1\u01d3\7\34\2\2\u01d2\u01d0\3"+
		"\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d6\7\b\2\2\u01d5"+
		"\u01cf\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5T"+
		"+\2\u01d8S\3\2\2\2\u01d9\u01da\7\65\2\2\u01da\u01dc\7\27\2\2\u01db\u01dd"+
		"\5V,\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\7\30\2\2\u01df\u01e1\5\\/\2\u01e0\u01e2\5\n\6\2\u01e1\u01e0\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\5^\60\2\u01e6U\3\2\2\2\u01e7\u01ea\5\4\3\2"+
		"\u01e8\u01e9\7\33\2\2\u01e9\u01eb\7\34\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\7\65\2\2\u01ed\u01ee\7/\2\2\u01ee"+
		"\u01f0\5V,\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0W\3\2\2\2\u01f1"+
		"\u01f2\7\n\2\2\u01f2\u01f3\7\27\2\2\u01f3\u01f4\7\30\2\2\u01f4\u01f6\5"+
		"\\/\2\u01f5\u01f7\5\n\6\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5^"+
		"\60\2\u01fbY\3\2\2\2\u01fc\u01fe\7\31\2\2\u01fd\u01ff\5\n\6\2\u01fe\u01fd"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\7\32\2\2\u0203[\3\2\2\2\u0204\u0207\7\31\2"+
		"\2\u0205\u0207\b/\1\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207]\3"+
		"\2\2\2\u0208\u020b\7\32\2\2\u0209\u020b\b\60\1\2\u020a\u0208\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b_\3\2\2\2Acqv~\u0083\u0087\u008d\u0093\u009d\u00a3"+
		"\u00ad\u00b3\u00c1\u00cb\u00d1\u00d8\u00da\u00e1\u00e3\u00e9\u00f0\u00f2"+
		"\u00f9\u0105\u0107\u0110\u0119\u0128\u0135\u0137\u0146\u0148\u0152\u0155"+
		"\u0158\u015e\u0162\u0166\u016b\u016d\u0174\u017c\u0182\u018e\u0194\u019f"+
		"\u01a6\u01a8\u01ab\u01b3\u01bb\u01c4\u01cc\u01d2\u01d5\u01dc\u01e3\u01ea"+
		"\u01ef\u01f8\u0200\u0206\u020a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}