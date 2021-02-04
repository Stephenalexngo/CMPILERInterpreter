// Generated from c:\Users\Lenard\Documents\CMPILERInterpreter\grammarfile\Main.g4 by ANTLR 4.8
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
		RULE_function_calling = 37, RULE_function_paremeters_value = 38, RULE_function_declaration = 39, 
		RULE_function_structure = 40, RULE_function_declaration_parameters = 41, 
		RULE_main_function = 42, RULE_scoping_statement = 43, RULE_left_bracket = 44, 
		RULE_right_bracket = 45;
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
			"loop_variable_declaration", "loop_structure", "function_calling", "function_paremeters_value", 
			"function_declaration", "function_structure", "function_declaration_parameters", 
			"main_function", "scoping_statement", "left_bracket", "right_bracket"
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
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
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
				setState(108);
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
	}

	public final Big_statementsContext big_statements() throws RecognitionException {
		Big_statementsContext _localctx = new Big_statementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_big_statements);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				loop_statement();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
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
	}

	public final Small_statementsContext small_statements() throws RecognitionException {
		Small_statementsContext _localctx = new Small_statementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_small_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(116);
				print_statement();
				}
				break;
			case 2:
				{
				setState(117);
				scan_statement();
				}
				break;
			case 3:
				{
				setState(118);
				return_statement();
				}
				break;
			case 4:
				{
				setState(119);
				any_declaration();
				}
				break;
			case 5:
				{
				setState(120);
				function_calling();
				}
				break;
			case 6:
				{
				setState(121);
				assignment_statement();
				}
				break;
			}
			setState(124);
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
	}

	public final Any_declarationContext any_declaration() throws RecognitionException {
		Any_declarationContext _localctx = new Any_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_any_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(126);
				match(CONSTANT);
				}
			}

			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129);
				var_declaration();
				}
				break;
			case 2:
				{
				setState(130);
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
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_declaration);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				float_declaration();
				}
				break;
			case INT_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				int_declaration();
				}
				break;
			case STRING_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				string_declaration();
				}
				break;
			case BOOLEAN_DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
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
	}

	public final Arr_declarationContext arr_declaration() throws RecognitionException {
		Arr_declarationContext _localctx = new Arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arr_declaration);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				float_arr_declaration();
				}
				break;
			case INT_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				int_arr_declaration();
				}
				break;
			case STRING_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				string_arr_declaration();
				}
				break;
			case BOOLEAN_DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
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
	}

	public final Float_arr_declarationContext float_arr_declaration() throws RecognitionException {
		Float_arr_declarationContext _localctx = new Float_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_float_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(FLOAT_DEC);
			setState(146);
			match(OPEN_BRACE);
			setState(147);
			match(CLOSE_BRACE);
			setState(148);
			match(LABEL);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(149);
				match(ASSIGN);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(150);
					match(CREATE);
					setState(151);
					match(FLOAT_DEC);
					}
					break;
				case LABEL:
					{
					setState(152);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155);
				match(OPEN_BRACE);
				setState(156);
				expression();
				setState(157);
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
	}

	public final Int_arr_declarationContext int_arr_declaration() throws RecognitionException {
		Int_arr_declarationContext _localctx = new Int_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_int_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(INT_DEC);
			setState(162);
			match(OPEN_BRACE);
			setState(163);
			match(CLOSE_BRACE);
			setState(164);
			match(LABEL);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(165);
				match(ASSIGN);
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(166);
					match(CREATE);
					setState(167);
					match(INT_DEC);
					}
					break;
				case LABEL:
					{
					setState(168);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				match(OPEN_BRACE);
				setState(172);
				expression();
				setState(173);
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
	}

	public final String_arr_declarationContext string_arr_declaration() throws RecognitionException {
		String_arr_declarationContext _localctx = new String_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(STRING_DEC);
			setState(178);
			match(OPEN_BRACE);
			setState(179);
			match(CLOSE_BRACE);
			setState(180);
			match(LABEL);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(181);
				match(ASSIGN);
				{
				setState(182);
				match(CREATE);
				setState(183);
				match(STRING_DEC);
				}
				setState(185);
				match(OPEN_BRACE);
				setState(186);
				expression();
				setState(187);
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
	}

	public final Boolean_arr_declarationContext boolean_arr_declaration() throws RecognitionException {
		Boolean_arr_declarationContext _localctx = new Boolean_arr_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_arr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BOOLEAN_DEC);
			setState(192);
			match(OPEN_BRACE);
			setState(193);
			match(CLOSE_BRACE);
			setState(194);
			match(LABEL);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(195);
				match(ASSIGN);
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
					{
					setState(196);
					match(CREATE);
					setState(197);
					match(BOOLEAN_DEC);
					}
					break;
				case LABEL:
					{
					setState(198);
					match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201);
				match(OPEN_BRACE);
				setState(202);
				expression();
				setState(203);
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
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Float_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_declaration; }
	}

	public final Float_declarationContext float_declaration() throws RecognitionException {
		Float_declarationContext _localctx = new Float_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_float_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(FLOAT_DEC);
			setState(208);
			match(LABEL);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(209);
				match(ASSIGN);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(210);
					match(FLOAT_NUMBER);
					}
					break;
				case 2:
					{
					setState(211);
					function_calling();
					}
					break;
				case 3:
					{
					setState(212);
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
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_int_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(INT_DEC);
			setState(218);
			match(LABEL);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(219);
				match(ASSIGN);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(220);
					match(INT_NUMBER);
					}
					break;
				case 2:
					{
					setState(221);
					function_calling();
					}
					break;
				case 3:
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
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(STRING_DEC);
			setState(228);
			match(LABEL);
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(229);
				match(ASSIGN);
				setState(230);
				match(STRING_TYPE);
				}
				break;
			case LABEL:
				{
				setState(231);
				function_calling();
				}
				break;
			case SEMICOLON:
				break;
			default:
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
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolean_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(BOOLEAN_DEC);
			setState(235);
			match(LABEL);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(236);
				match(ASSIGN);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(237);
					match(LABEL);
					}
					break;
				case 2:
					{
					setState(238);
					comparison_statement();
					}
					break;
				case 3:
					{
					setState(239);
					function_calling();
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
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
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
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LABEL);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(245);
				match(OPEN_BRACE);
				setState(246);
				expression();
				setState(247);
				match(CLOSE_BRACE);
				}
			}

			setState(251);
			match(ASSIGN);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(252);
				match(LABEL);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(253);
					match(OPEN_BRACE);
					setState(254);
					expression();
					setState(255);
					match(CLOSE_BRACE);
					}
				}

				}
				break;
			case 2:
				{
				setState(259);
				number();
				}
				break;
			case 3:
				{
				setState(260);
				match(STRING_TYPE);
				}
				break;
			case 4:
				{
				setState(261);
				expression();
				}
				break;
			case 5:
				{
				setState(262);
				comparison_statement();
				}
				break;
			case 6:
				{
				setState(263);
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
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(PRINT);
			setState(267);
			match(OPEN_PAREN);
			setState(268);
			extended_value_print();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(269);
				match(PLUS);
				setState(270);
				extended_value_print();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Extended_value_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_value_print; }
	}

	public final Extended_value_printContext extended_value_print() throws RecognitionException {
		Extended_value_printContext _localctx = new Extended_value_printContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extended_value_print);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(STRING_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(LABEL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				expression();
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
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SCAN);
			setState(285);
			match(OPEN_PAREN);
			setState(286);
			match(STRING_TYPE);
			setState(287);
			match(COMMA);
			setState(288);
			match(LABEL);
			setState(289);
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
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(RETURN);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(292);
				match(STRING_TYPE);
				}
				break;
			case 2:
				{
				setState(293);
				number();
				}
				break;
			case 3:
				{
				setState(294);
				match(LABEL);
				}
				break;
			case 4:
				{
				setState(295);
				function_calling();
				}
				break;
			case 5:
				{
				setState(296);
				expression();
				}
				break;
			case 6:
				{
				setState(297);
				comparison_statement();
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
			setState(303);
			first_operator_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Second_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_second_operator_expression);
						setState(305);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(306);
						match(PLUS);
						setState(307);
						first_operator_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Second_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_second_operator_expression);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						match(MINUS);
						setState(310);
						first_operator_expression(0);
						}
						break;
					}
					} 
				}
				setState(315);
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
			setState(317);
			value_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(319);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(320);
						match(DIV);
						setState(321);
						value_expression();
						}
						break;
					case 2:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(323);
						match(MULTI);
						setState(324);
						value_expression();
						}
						break;
					case 3:
						{
						_localctx = new First_operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_first_operator_expression);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(MOD);
						setState(327);
						value_expression();
						}
						break;
					}
					} 
				}
				setState(332);
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
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value_expression);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(OPEN_PAREN);
				setState(335);
				expression();
				setState(336);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
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
	}

	public final Comparison_statementContext comparison_statement() throws RecognitionException {
		Comparison_statementContext _localctx = new Comparison_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparison_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(342);
				match(NOT);
				}
			}

			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(345);
				match(OPEN_PAREN);
				}
			}

			setState(348);
			value_comparison();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					logic_relational_operators();
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(350);
						value_comparison();
						}
						break;
					case 2:
						{
						setState(351);
						comparison_statement();
						}
						break;
					}
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(359);
				match(CLOSE_PAREN);
				}
				break;
			}
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(362);
				logic_relational_operators();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(363);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(364);
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
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Value_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_comparison; }
	}

	public final Value_comparisonContext value_comparison() throws RecognitionException {
		Value_comparisonContext _localctx = new Value_comparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value_comparison);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(STRING_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
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
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(IF);
			setState(376);
			conditional_comparison_structure();
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					match(ELSE_IF);
					setState(378);
					conditional_comparison_structure();
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(384);
				match(ELSE);
				setState(385);
				match(THEN);
				setState(386);
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
	}

	public final Conditional_comparison_structureContext conditional_comparison_structure() throws RecognitionException {
		Conditional_comparison_structureContext _localctx = new Conditional_comparison_structureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(OPEN_PAREN);
			setState(390);
			comparison_statement();
			setState(391);
			match(CLOSE_PAREN);
			setState(392);
			match(THEN);
			setState(393);
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
	}

	public final Conditional_bodyContext conditional_body() throws RecognitionException {
		Conditional_bodyContext _localctx = new Conditional_bodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			left_bracket();
			setState(397); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(396);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(399); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(401);
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
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(403);
				while_statement();
				}
				break;
			case FOR:
				{
				setState(404);
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
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(WHILE);
			setState(408);
			expression();
			setState(409);
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
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(FOR);
			setState(412);
			loop_variable_declaration();
			setState(413);
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
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_variable_declaration; }
	}

	public final Loop_variable_declarationContext loop_variable_declaration() throws RecognitionException {
		Loop_variable_declarationContext _localctx = new Loop_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loop_variable_declaration);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				int_declaration();
				}
				break;
			case OPEN_PAREN:
			case INT_NUMBER:
			case FLOAT_NUMBER:
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				expression();
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
	}

	public final Loop_structureContext loop_structure() throws RecognitionException {
		Loop_structureContext _localctx = new Loop_structureContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==UP_TO || _la==DOWN_TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(420);
			expression();
			setState(421);
			left_bracket();
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					statements();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(428);
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
		public Function_callingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_calling; }
	}

	public final Function_callingContext function_calling() throws RecognitionException {
		Function_callingContext _localctx = new Function_callingContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_calling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(LABEL);
			setState(431);
			match(OPEN_PAREN);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << STRING_TYPE) | (1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << LABEL))) != 0)) {
				{
				setState(432);
				function_paremeters_value();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					function_paremeters_value();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(442);
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

	public static class Function_paremeters_valueContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(MainParser.STRING_TYPE, 0); }
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_paremeters_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_paremeters_value; }
	}

	public final Function_paremeters_valueContext function_paremeters_value() throws RecognitionException {
		Function_paremeters_valueContext _localctx = new Function_paremeters_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_paremeters_value);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(STRING_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				function_calling();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				expression();
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
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(FUNC);
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(452);
				variable_type();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(453);
					match(OPEN_BRACE);
					setState(454);
					match(CLOSE_BRACE);
					}
				}

				}
				break;
			case VOID:
				{
				setState(457);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(460);
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
		public List<Function_declaration_parametersContext> function_declaration_parameters() {
			return getRuleContexts(Function_declaration_parametersContext.class);
		}
		public Function_declaration_parametersContext function_declaration_parameters(int i) {
			return getRuleContext(Function_declaration_parametersContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainParser.COMMA, i);
		}
		public Function_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_structure; }
	}

	public final Function_structureContext function_structure() throws RecognitionException {
		Function_structureContext _localctx = new Function_structureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(LABEL);
			setState(463);
			match(OPEN_PAREN);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
				{
				setState(464);
				function_declaration_parameters();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(465);
					match(COMMA);
					setState(466);
					function_declaration_parameters();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(474);
			match(CLOSE_PAREN);
			setState(475);
			left_bracket();
			setState(477); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(476);
				statements();
				}
				}
				setState(479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << LABEL))) != 0) );
			setState(481);
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
		public Function_declaration_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters; }
	}

	public final Function_declaration_parametersContext function_declaration_parameters() throws RecognitionException {
		Function_declaration_parametersContext _localctx = new Function_declaration_parametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function_declaration_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			variable_type();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(484);
				match(OPEN_BRACE);
				setState(485);
				match(CLOSE_BRACE);
				}
			}

			setState(488);
			match(LABEL);
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
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_main_function);
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
			left_bracket();
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
	}

	public final Scoping_statementContext scoping_statement() throws RecognitionException {
		Scoping_statementContext _localctx = new Scoping_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_scoping_statement);
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

	public static class Left_bracketContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public Left_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_bracket; }
	}

	public final Left_bracketContext left_bracket() throws RecognitionException {
		Left_bracketContext _localctx = new Left_bracketContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_left_bracket);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
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
	}

	public final Right_bracketContext right_bracket() throws RecognitionException {
		Right_bracketContext _localctx = new Right_bracketContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_right_bracket);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0208\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\5\7u\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b}\n\b\3\b\3\b\3\t\5\t\u0082\n\t\3\t\3\t\5\t\u0086\n\t\3\n"+
		"\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\5\13\u0092\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\3\r\3\r\3\r\5\r\u00b2"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00c0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00d0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00d8\n\20\5\20\u00da\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e2\n"+
		"\21\5\21\u00e4\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00f3\n\23\5\23\u00f5\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00fc\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0104\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u010b\n\24\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0112\n\25\f\25\16\25\u0115\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u011d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u012d\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u013a\n\32\f\32\16\32\u013d\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u014b\n\33\f\33\16\33\u014e"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0157\n\34\3\35\5\35\u015a"+
		"\n\35\3\35\5\35\u015d\n\35\3\35\3\35\3\35\3\35\5\35\u0163\n\35\7\35\u0165"+
		"\n\35\f\35\16\35\u0168\13\35\3\35\5\35\u016b\n\35\3\35\3\35\3\35\5\35"+
		"\u0170\n\35\5\35\u0172\n\35\3\36\3\36\3\36\3\36\5\36\u0178\n\36\3\37\3"+
		"\37\3\37\3\37\7\37\u017e\n\37\f\37\16\37\u0181\13\37\3\37\3\37\3\37\5"+
		"\37\u0186\n\37\3 \3 \3 \3 \3 \3 \3!\3!\6!\u0190\n!\r!\16!\u0191\3!\3!"+
		"\3\"\3\"\5\"\u0198\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\5%\u01a4\n%\3&\3"+
		"&\3&\3&\7&\u01aa\n&\f&\16&\u01ad\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u01b6"+
		"\n\'\f\'\16\'\u01b9\13\'\5\'\u01bb\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u01c4"+
		"\n(\3)\3)\3)\3)\5)\u01ca\n)\3)\5)\u01cd\n)\3)\3)\3*\3*\3*\3*\3*\7*\u01d6"+
		"\n*\f*\16*\u01d9\13*\5*\u01db\n*\3*\3*\3*\6*\u01e0\n*\r*\16*\u01e1\3*"+
		"\3*\3+\3+\3+\5+\u01e9\n+\3+\3+\3,\3,\3,\3,\3,\6,\u01f2\n,\r,\16,\u01f3"+
		"\3,\3,\3-\3-\6-\u01fa\n-\r-\16-\u01fb\3-\3-\3.\3.\5.\u0202\n.\3/\3/\5"+
		"/\u0206\n/\3/\2\4\62\64\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\3\2\23\26\3\2\63\64\5\2\35 "+
		"&\'**\3\2\20\21\2\u0234\2a\3\2\2\2\4g\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\n"+
		"o\3\2\2\2\ft\3\2\2\2\16|\3\2\2\2\20\u0081\3\2\2\2\22\u008b\3\2\2\2\24"+
		"\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00a3\3\2\2\2\32\u00b3\3\2\2\2\34\u00c1"+
		"\3\2\2\2\36\u00d1\3\2\2\2 \u00db\3\2\2\2\"\u00e5\3\2\2\2$\u00ec\3\2\2"+
		"\2&\u00f6\3\2\2\2(\u010c\3\2\2\2*\u011c\3\2\2\2,\u011e\3\2\2\2.\u0125"+
		"\3\2\2\2\60\u012e\3\2\2\2\62\u0130\3\2\2\2\64\u013e\3\2\2\2\66\u0156\3"+
		"\2\2\28\u0159\3\2\2\2:\u0177\3\2\2\2<\u0179\3\2\2\2>\u0187\3\2\2\2@\u018d"+
		"\3\2\2\2B\u0197\3\2\2\2D\u0199\3\2\2\2F\u019d\3\2\2\2H\u01a3\3\2\2\2J"+
		"\u01a5\3\2\2\2L\u01b0\3\2\2\2N\u01c3\3\2\2\2P\u01c5\3\2\2\2R\u01d0\3\2"+
		"\2\2T\u01e5\3\2\2\2V\u01ec\3\2\2\2X\u01f7\3\2\2\2Z\u0201\3\2\2\2\\\u0205"+
		"\3\2\2\2^`\5P)\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3"+
		"\2\2\2de\5V,\2ef\7\2\2\3f\3\3\2\2\2gh\t\2\2\2h\5\3\2\2\2ij\t\3\2\2j\7"+
		"\3\2\2\2kl\t\4\2\2l\t\3\2\2\2mp\5\f\7\2np\5\16\b\2om\3\2\2\2on\3\2\2\2"+
		"p\13\3\2\2\2qu\5<\37\2ru\5B\"\2su\5X-\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2"+
		"u\r\3\2\2\2v}\5(\25\2w}\5,\27\2x}\5.\30\2y}\5\20\t\2z}\5L\'\2{}\5&\24"+
		"\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~\177\7.\2\2\177\17\3\2\2\2\u0080\u0082\7\4\2\2\u0081\u0080\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0086\5\22\n\2\u0084\u0086"+
		"\5\24\13\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\21\3\2\2\2\u0087"+
		"\u008c\5\36\20\2\u0088\u008c\5 \21\2\u0089\u008c\5\"\22\2\u008a\u008c"+
		"\5$\23\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\23\3\2\2\2\u008d\u0092\5\26\f\2\u008e\u0092\5\30"+
		"\r\2\u008f\u0092\5\32\16\2\u0090\u0092\5\34\17\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25\3\2\2"+
		"\2\u0093\u0094\7\25\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\34\2\2\u0096"+
		"\u00a1\7\65\2\2\u0097\u009b\7)\2\2\u0098\u0099\7\3\2\2\u0099\u009c\7\25"+
		"\2\2\u009a\u009c\7\65\2\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7\33\2\2\u009e\u009f\5\60\31\2\u009f\u00a0"+
		"\7\34\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\27\3\2\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6"+
		"\7\34\2\2\u00a6\u00b1\7\65\2\2\u00a7\u00ab\7)\2\2\u00a8\u00a9\7\3\2\2"+
		"\u00a9\u00ac\7\23\2\2\u00aa\u00ac\7\65\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00af\5\60\31"+
		"\2\u00af\u00b0\7\34\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\7\33"+
		"\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00bf\7\65\2\2\u00b7\u00b8\7)\2\2\u00b8"+
		"\u00b9\7\3\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7"+
		"\33\2\2\u00bc\u00bd\5\60\31\2\u00bd\u00be\7\34\2\2\u00be\u00c0\3\2\2\2"+
		"\u00bf\u00b7\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c2"+
		"\7\24\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00cf\7\65\2"+
		"\2\u00c5\u00c9\7)\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00ca\7\24\2\2\u00c8\u00ca"+
		"\7\65\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2"+
		"\u00cb\u00cc\7\33\2\2\u00cc\u00cd\5\60\31\2\u00cd\u00ce\7\34\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\35\3\2\2"+
		"\2\u00d1\u00d2\7\25\2\2\u00d2\u00d9\7\65\2\2\u00d3\u00d7\7)\2\2\u00d4"+
		"\u00d8\7\64\2\2\u00d5\u00d8\5L\'\2\u00d6\u00d8\5\60\31\2\u00d7\u00d4\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\23\2"+
		"\2\u00dc\u00e3\7\65\2\2\u00dd\u00e1\7)\2\2\u00de\u00e2\7\63\2\2\u00df"+
		"\u00e2\5L\'\2\u00e0\u00e2\5\60\31\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00ea\7\65\2"+
		"\2\u00e7\u00e8\7)\2\2\u00e8\u00eb\7\62\2\2\u00e9\u00eb\5L\'\2\u00ea\u00e7"+
		"\3\2\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec"+
		"\u00ed\7\24\2\2\u00ed\u00f4\7\65\2\2\u00ee\u00f2\7)\2\2\u00ef\u00f3\7"+
		"\65\2\2\u00f0\u00f3\58\35\2\u00f1\u00f3\5L\'\2\u00f2\u00ef\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5%\3\2\2\2\u00f6\u00fb\7\65\2\2\u00f7\u00f8"+
		"\7\33\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\7\34\2\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00f7\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u010a"+
		"\7)\2\2\u00fe\u0103\7\65\2\2\u00ff\u0100\7\33\2\2\u0100\u0101\5\60\31"+
		"\2\u0101\u0102\7\34\2\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u010b\3\2\2\2\u0105\u010b\5\6\4\2\u0106\u010b\7\62"+
		"\2\2\u0107\u010b\5\60\31\2\u0108\u010b\58\35\2\u0109\u010b\5L\'\2\u010a"+
		"\u00fe\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\'\3\2\2\2\u010c\u010d"+
		"\7\6\2\2\u010d\u010e\7\27\2\2\u010e\u0113\5*\26\2\u010f\u0110\7!\2\2\u0110"+
		"\u0112\5*\26\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7\30\2\2\u0117)\3\2\2\2\u0118\u011d\7\62\2\2\u0119\u011d\7\65\2"+
		"\2\u011a\u011d\5L\'\2\u011b\u011d\5\60\31\2\u011c\u0118\3\2\2\2\u011c"+
		"\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d+\3\2\2\2"+
		"\u011e\u011f\7\7\2\2\u011f\u0120\7\27\2\2\u0120\u0121\7\62\2\2\u0121\u0122"+
		"\7/\2\2\u0122\u0123\7\65\2\2\u0123\u0124\7\30\2\2\u0124-\3\2\2\2\u0125"+
		"\u012c\7\5\2\2\u0126\u012d\7\62\2\2\u0127\u012d\5\6\4\2\u0128\u012d\7"+
		"\65\2\2\u0129\u012d\5L\'\2\u012a\u012d\5\60\31\2\u012b\u012d\58\35\2\u012c"+
		"\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d/\3\2\2\2\u012e\u012f"+
		"\5\62\32\2\u012f\61\3\2\2\2\u0130\u0131\b\32\1\2\u0131\u0132\5\64\33\2"+
		"\u0132\u013b\3\2\2\2\u0133\u0134\f\5\2\2\u0134\u0135\7!\2\2\u0135\u013a"+
		"\5\64\33\2\u0136\u0137\f\4\2\2\u0137\u0138\7\"\2\2\u0138\u013a\5\64\33"+
		"\2\u0139\u0133\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\63\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\b\33\1\2\u013f\u0140\5\66\34\2\u0140\u014c\3\2\2\2\u0141\u0142"+
		"\f\6\2\2\u0142\u0143\7$\2\2\u0143\u014b\5\66\34\2\u0144\u0145\f\5\2\2"+
		"\u0145\u0146\7#\2\2\u0146\u014b\5\66\34\2\u0147\u0148\f\4\2\2\u0148\u0149"+
		"\7%\2\2\u0149\u014b\5\66\34\2\u014a\u0141\3\2\2\2\u014a\u0144\3\2\2\2"+
		"\u014a\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\65\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0157\5\6\4\2\u0150"+
		"\u0151\7\27\2\2\u0151\u0152\5\60\31\2\u0152\u0153\7\30\2\2\u0153\u0157"+
		"\3\2\2\2\u0154\u0157\5L\'\2\u0155\u0157\7\65\2\2\u0156\u014f\3\2\2\2\u0156"+
		"\u0150\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\67\3\2\2"+
		"\2\u0158\u015a\7(\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u015d\7\27\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u0166\5:\36\2\u015f\u0162\5\b\5\2\u0160\u0163"+
		"\5:\36\2\u0161\u0163\58\35\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u015f\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016b\7\30\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0171\3"+
		"\2\2\2\u016c\u016f\5\b\5\2\u016d\u0170\5:\36\2\u016e\u0170\58\35\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016c\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u01729\3\2\2\2\u0173\u0178\7\65\2\2\u0174\u0178"+
		"\5\6\4\2\u0175\u0178\7\62\2\2\u0176\u0178\5L\'\2\u0177\u0173\3\2\2\2\u0177"+
		"\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178;\3\2\2\2"+
		"\u0179\u017a\7\13\2\2\u017a\u017f\5> \2\u017b\u017c\7\r\2\2\u017c\u017e"+
		"\5> \2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0185\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\f"+
		"\2\2\u0183\u0184\7\16\2\2\u0184\u0186\5@!\2\u0185\u0182\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186=\3\2\2\2\u0187\u0188\7\27\2\2\u0188\u0189\58\35\2"+
		"\u0189\u018a\7\30\2\2\u018a\u018b\7\16\2\2\u018b\u018c\5@!\2\u018c?\3"+
		"\2\2\2\u018d\u018f\5Z.\2\u018e\u0190\5\n\6\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\5\\/\2\u0194A\3\2\2\2\u0195\u0198\5D#\2\u0196\u0198\5"+
		"F$\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198C\3\2\2\2\u0199\u019a"+
		"\7\22\2\2\u019a\u019b\5\60\31\2\u019b\u019c\5J&\2\u019cE\3\2\2\2\u019d"+
		"\u019e\7\17\2\2\u019e\u019f\5H%\2\u019f\u01a0\5J&\2\u01a0G\3\2\2\2\u01a1"+
		"\u01a4\5 \21\2\u01a2\u01a4\5\60\31\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3"+
		"\2\2\2\u01a4I\3\2\2\2\u01a5\u01a6\t\5\2\2\u01a6\u01a7\5\60\31\2\u01a7"+
		"\u01ab\5Z.\2\u01a8\u01aa\5\n\6\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2"+
		"\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ae\u01af\5\\/\2\u01afK\3\2\2\2\u01b0\u01b1\7\65\2\2\u01b1"+
		"\u01ba\7\27\2\2\u01b2\u01b7\5N(\2\u01b3\u01b4\7/\2\2\u01b4\u01b6\5N(\2"+
		"\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\30\2\2\u01bdM\3\2\2\2"+
		"\u01be\u01c4\7\65\2\2\u01bf\u01c4\5\6\4\2\u01c0\u01c4\7\62\2\2\u01c1\u01c4"+
		"\5L\'\2\u01c2\u01c4\5\60\31\2\u01c3\u01be\3\2\2\2\u01c3\u01bf\3\2\2\2"+
		"\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4O\3"+
		"\2\2\2\u01c5\u01cc\7\t\2\2\u01c6\u01c9\5\4\3\2\u01c7\u01c8\7\33\2\2\u01c8"+
		"\u01ca\7\34\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3"+
		"\2\2\2\u01cb\u01cd\7\b\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\5R*\2\u01cfQ\3\2\2\2\u01d0\u01d1\7\65\2\2\u01d1"+
		"\u01da\7\27\2\2\u01d2\u01d7\5T+\2\u01d3\u01d4\7/\2\2\u01d4\u01d6\5T+\2"+
		"\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01d2\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7\30\2\2\u01dd\u01df\5"+
		"Z.\2\u01de\u01e0\5\n\6\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\5\\"+
		"/\2\u01e4S\3\2\2\2\u01e5\u01e8\5\4\3\2\u01e6\u01e7\7\33\2\2\u01e7\u01e9"+
		"\7\34\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2"+
		"\u01ea\u01eb\7\65\2\2\u01ebU\3\2\2\2\u01ec\u01ed\7\n\2\2\u01ed\u01ee\7"+
		"\27\2\2\u01ee\u01ef\7\30\2\2\u01ef\u01f1\5Z.\2\u01f0\u01f2\5\n\6\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5\\/\2\u01f6W\3\2\2\2\u01f7\u01f9"+
		"\7\31\2\2\u01f8\u01fa\5\n\6\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2"+
		"\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe"+
		"\7\32\2\2\u01feY\3\2\2\2\u01ff\u0202\7\31\2\2\u0200\u0202\b.\1\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202[\3\2\2\2\u0203\u0206\7\32\2\2"+
		"\u0204\u0206\b/\1\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206]\3\2"+
		"\2\2>aot|\u0081\u0085\u008b\u0091\u009b\u00a1\u00ab\u00b1\u00bf\u00c9"+
		"\u00cf\u00d7\u00d9\u00e1\u00e3\u00ea\u00f2\u00f4\u00fb\u0103\u010a\u0113"+
		"\u011c\u012c\u0139\u013b\u014a\u014c\u0156\u0159\u015c\u0162\u0166\u016a"+
		"\u016f\u0171\u0177\u017f\u0185\u0191\u0197\u01a3\u01ab\u01b7\u01ba\u01c3"+
		"\u01c9\u01cc\u01d7\u01da\u01e1\u01e8\u01f3\u01fb\u0201\u0205";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}