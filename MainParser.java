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
		T__0=1, T__1=2, CREATE=3, CONSTANT=4, RETURN=5, PRINT=6, SCAN=7, VOID=8, 
		FUNC=9, MAIN=10, IF=11, ELSE=12, ELSE_IF=13, THEN=14, FOR=15, UP_TO=16, 
		DOWN_TO=17, WHILE=18, INT_DEC=19, BOOLEAN_DEC=20, FLOAT_DEC=21, STRING_DEC=22, 
		OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, OPEN_BRACE=27, 
		CLOSE_BRACE=28, LESS=29, LESSQEUAL=30, GREATER=31, GREATEREQUAL=32, PLUS=33, 
		MINUS=34, MULTI=35, DIV=36, MOD=37, ANDAND=38, OROR=39, NOT=40, ASSIGN=41, 
		EQUAL=42, QUESTION=43, COLON=44, DOT=45, SEMICOLON=46, COMMA=47, UNDERSCORE=48, 
		SINGLE_QUOTE=49, LOWERCASE=50, UPPERCASE=51, DIGIT=52, NEWLINE=53, LINECOMMENT=54, 
		WHITE_SPACE=55;
	public static final int
		RULE_start = 0, RULE_variable_type = 1, RULE_string = 2, RULE_number = 3, 
		RULE_label = 4, RULE_label_words = 5, RULE_label_words_withoutsymbol = 6, 
		RULE_first_operators = 7, RULE_second_operators = 8, RULE_operators = 9, 
		RULE_logical_operators = 10, RULE_relational_operators = 11, RULE_other_operators = 12, 
		RULE_lexer_predefined_words = 13, RULE_constant_words = 14, RULE_conditional_words = 15, 
		RULE_loop_words = 16, RULE_simple_punctuations = 17, RULE_symbol_words = 18, 
		RULE_statements = 19, RULE_any_declaration = 20, RULE_assigned_expression = 21, 
		RULE_multiple_declaration = 22, RULE_variable_declaration_vartype = 23, 
		RULE_variable_declaration_no_vartype = 24, RULE_array_size = 25, RULE_array_variable = 26, 
		RULE_array_assign_body = 27, RULE_array_assign = 28, RULE_array_declaration_vartype = 29, 
		RULE_array_declaration_no_vartype = 30, RULE_print_statement = 31, RULE_other_label_for_print_error = 32, 
		RULE_value_print = 33, RULE_extended_value_print = 34, RULE_scan_statement = 35, 
		RULE_scan_body = 36, RULE_display_message_parameter = 37, RULE_scan_label = 38, 
		RULE_value_parameter = 39, RULE_constant_declaration = 40, RULE_return_statement = 41, 
		RULE_return_value = 42, RULE_expression = 43, RULE_array_label = 44, RULE_value_expression = 45, 
		RULE_alt_expression = 46, RULE_alt_operator_expression = 47, RULE_alt_parenthesis_expression = 48, 
		RULE_alt_first_expression_operator = 49, RULE_alt_second_expression_operator = 50, 
		RULE_alt_value_expression = 51, RULE_comparison_statement = 52, RULE_assignment_statement = 53, 
		RULE_value_comparison = 54, RULE_conditional_statement = 55, RULE_conditional_comparison_structure = 56, 
		RULE_with_then = 57, RULE_with_comparison = 58, RULE_conditional_body = 59, 
		RULE_if_statement = 60, RULE_else_if_statement = 61, RULE_else_statement = 62, 
		RULE_loop_statement = 63, RULE_loop_conditional = 64, RULE_loop_structure = 65, 
		RULE_loop_variable_declaration = 66, RULE_loop_expression = 67, RULE_while_statement = 68, 
		RULE_for_statement = 69, RULE_function_calling = 70, RULE_function_parameters = 71, 
		RULE_function_paremeters_value = 72, RULE_function_declaration = 73, RULE_function_label = 74, 
		RULE_function_structure = 75, RULE_function_declaration_parameters = 76, 
		RULE_function_declaration_parameters_body = 77, RULE_void_function = 78, 
		RULE_non_void_function = 79, RULE_error_function = 80, RULE_error_function_head = 81, 
		RULE_scoping_statement = 82, RULE_main_function = 83, RULE_main_head = 84, 
		RULE_main_body = 85, RULE_main_body_first = 86, RULE_main_body_second = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variable_type", "string", "number", "label", "label_words", 
			"label_words_withoutsymbol", "first_operators", "second_operators", "operators", 
			"logical_operators", "relational_operators", "other_operators", "lexer_predefined_words", 
			"constant_words", "conditional_words", "loop_words", "simple_punctuations", 
			"symbol_words", "statements", "any_declaration", "assigned_expression", 
			"multiple_declaration", "variable_declaration_vartype", "variable_declaration_no_vartype", 
			"array_size", "array_variable", "array_assign_body", "array_assign", 
			"array_declaration_vartype", "array_declaration_no_vartype", "print_statement", 
			"other_label_for_print_error", "value_print", "extended_value_print", 
			"scan_statement", "scan_body", "display_message_parameter", "scan_label", 
			"value_parameter", "constant_declaration", "return_statement", "return_value", 
			"expression", "array_label", "value_expression", "alt_expression", "alt_operator_expression", 
			"alt_parenthesis_expression", "alt_first_expression_operator", "alt_second_expression_operator", 
			"alt_value_expression", "comparison_statement", "assignment_statement", 
			"value_comparison", "conditional_statement", "conditional_comparison_structure", 
			"with_then", "with_comparison", "conditional_body", "if_statement", "else_if_statement", 
			"else_statement", "loop_statement", "loop_conditional", "loop_structure", 
			"loop_variable_declaration", "loop_expression", "while_statement", "for_statement", 
			"function_calling", "function_parameters", "function_paremeters_value", 
			"function_declaration", "function_label", "function_structure", "function_declaration_parameters", 
			"function_declaration_parameters_body", "void_function", "non_void_function", 
			"error_function", "error_function_head", "scoping_statement", "main_function", 
			"main_head", "main_body", "main_body_first", "main_body_second"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'f'", "'create'", "'constant'", "'return'", "'print'", 
			"'scan'", "'void'", "'func'", "'main'", "'if'", "'else'", "'else if'", 
			"'then'", "'for'", "'up to'", "'down to'", "'while'", "'int'", "'bool'", 
			"'float'", "'String'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'", "'='", "'=='", "'?'", "':'", "'.'", "';'", "','", "'_'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", 
			"FUNC", "MAIN", "IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", 
			"WHILE", "INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", 
			"LESS", "LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", 
			"DIV", "MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", 
			"COLON", "DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "LOWERCASE", 
			"UPPERCASE", "DIGIT", "NEWLINE", "LINECOMMENT", "WHITE_SPACE"
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
		public List<TerminalNode> LINECOMMENT() { return getTokens(MainParser.LINECOMMENT); }
		public TerminalNode LINECOMMENT(int i) {
			return getToken(MainParser.LINECOMMENT, i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINECOMMENT) {
				{
				{
				setState(176);
				match(LINECOMMENT);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(177);
					match(NEWLINE);
					}
				}

				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(185);
				function_declaration();
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(197);
				match(WHITE_SPACE);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			main_function();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(204);
				match(NEWLINE);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(210);
				match(WHITE_SPACE);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
			setState(218);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<Lexer_predefined_wordsContext> lexer_predefined_words() {
			return getRuleContexts(Lexer_predefined_wordsContext.class);
		}
		public Lexer_predefined_wordsContext lexer_predefined_words(int i) {
			return getRuleContext(Lexer_predefined_wordsContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__0);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(221);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(222);
					lexer_predefined_words();
					}
					break;
				case 3:
					{
					setState(223);
					label();
					}
					break;
				case 4:
					{
					setState(224);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE) | (1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << MOD) | (1L << ANDAND) | (1L << OROR) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0) );
			setState(229);
			match(T__0);
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
		public TerminalNode DOT() { return getToken(MainParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(MainParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
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
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			int _alt;
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(231);
					match(MINUS);
					}
				}

				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					match(DIGIT);
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				{
				setState(239);
				match(DOT);
				setState(241); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(240);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(243); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(245);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(248);
					match(MINUS);
					}
				}

				setState(252); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(251);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(254); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LabelContext extends ParserRuleContext {
		public List<Label_wordsContext> label_words() {
			return getRuleContexts(Label_wordsContext.class);
		}
		public Label_wordsContext label_words(int i) {
			return getRuleContext(Label_wordsContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> LOWERCASE() { return getTokens(MainParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(MainParser.LOWERCASE, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(MainParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MainParser.UNDERSCORE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(MainParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(MainParser.UPPERCASE, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		int _la;
		try {
			int _alt;
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						label_words();
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(265); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(264);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(267); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						match(DIGIT);
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						label_words();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						label();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE))) != 0)) {
					{
					{
					setState(287);
					label_words();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(DIGIT);
				setState(295); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(294);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						match(DIGIT);
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						label_words();
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						label();
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				notifyErrorListeners("Missing Operator");
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

	public static class Label_wordsContext extends ParserRuleContext {
		public Constant_wordsContext constant_words() {
			return getRuleContext(Constant_wordsContext.class,0);
		}
		public Conditional_wordsContext conditional_words() {
			return getRuleContext(Conditional_wordsContext.class,0);
		}
		public Loop_wordsContext loop_words() {
			return getRuleContext(Loop_wordsContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Simple_punctuationsContext simple_punctuations() {
			return getRuleContext(Simple_punctuationsContext.class,0);
		}
		public Label_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel_words(this);
		}
	}

	public final Label_wordsContext label_words() throws RecognitionException {
		Label_wordsContext _localctx = new Label_wordsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
				{
				setState(320);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(321);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(322);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(323);
				variable_type();
				}
				break;
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
				{
				setState(324);
				simple_punctuations();
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

	public static class Label_words_withoutsymbolContext extends ParserRuleContext {
		public Constant_wordsContext constant_words() {
			return getRuleContext(Constant_wordsContext.class,0);
		}
		public Conditional_wordsContext conditional_words() {
			return getRuleContext(Conditional_wordsContext.class,0);
		}
		public Loop_wordsContext loop_words() {
			return getRuleContext(Loop_wordsContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Label_words_withoutsymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_words_withoutsymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel_words_withoutsymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel_words_withoutsymbol(this);
		}
	}

	public final Label_words_withoutsymbolContext label_words_withoutsymbol() throws RecognitionException {
		Label_words_withoutsymbolContext _localctx = new Label_words_withoutsymbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label_words_withoutsymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
				{
				setState(327);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(328);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(329);
				loop_words();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(330);
				variable_type();
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

	public static class First_operatorsContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(MainParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(MainParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MainParser.MOD, 0); }
		public First_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFirst_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFirst_operators(this);
		}
	}

	public final First_operatorsContext first_operators() throws RecognitionException {
		First_operatorsContext _localctx = new First_operatorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_first_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class Second_operatorsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MainParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MainParser.MINUS, 0); }
		public Second_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSecond_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSecond_operators(this);
		}
	}

	public final Second_operatorsContext second_operators() throws RecognitionException {
		Second_operatorsContext _localctx = new Second_operatorsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_second_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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

	public static class OperatorsContext extends ParserRuleContext {
		public First_operatorsContext first_operators() {
			return getRuleContext(First_operatorsContext.class,0);
		}
		public Second_operatorsContext second_operators() {
			return getRuleContext(Second_operatorsContext.class,0);
		}
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(337);
				first_operators();
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(338);
				second_operators();
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

	public static class Logical_operatorsContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(MainParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(MainParser.OROR, 0); }
		public Logical_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLogical_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLogical_operators(this);
		}
	}

	public final Logical_operatorsContext logical_operators() throws RecognitionException {
		Logical_operatorsContext _localctx = new Logical_operatorsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==OROR) ) {
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

	public static class Relational_operatorsContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(MainParser.LESS, 0); }
		public TerminalNode LESSQEUAL() { return getToken(MainParser.LESSQEUAL, 0); }
		public TerminalNode GREATER() { return getToken(MainParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(MainParser.GREATEREQUAL, 0); }
		public Relational_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterRelational_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitRelational_operators(this);
		}
	}

	public final Relational_operatorsContext relational_operators() throws RecognitionException {
		Relational_operatorsContext _localctx = new Relational_operatorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relational_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
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

	public static class Other_operatorsContext extends ParserRuleContext {
		public Logical_operatorsContext logical_operators() {
			return getRuleContext(Logical_operatorsContext.class,0);
		}
		public Relational_operatorsContext relational_operators() {
			return getRuleContext(Relational_operatorsContext.class,0);
		}
		public Other_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOther_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOther_operators(this);
		}
	}

	public final Other_operatorsContext other_operators() throws RecognitionException {
		Other_operatorsContext _localctx = new Other_operatorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_other_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(345);
				logical_operators();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
				{
				setState(346);
				relational_operators();
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

	public static class Lexer_predefined_wordsContext extends ParserRuleContext {
		public Constant_wordsContext constant_words() {
			return getRuleContext(Constant_wordsContext.class,0);
		}
		public Conditional_wordsContext conditional_words() {
			return getRuleContext(Conditional_wordsContext.class,0);
		}
		public Loop_wordsContext loop_words() {
			return getRuleContext(Loop_wordsContext.class,0);
		}
		public Simple_punctuationsContext simple_punctuations() {
			return getRuleContext(Simple_punctuationsContext.class,0);
		}
		public Symbol_wordsContext symbol_words() {
			return getRuleContext(Symbol_wordsContext.class,0);
		}
		public Other_operatorsContext other_operators() {
			return getRuleContext(Other_operatorsContext.class,0);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Lexer_predefined_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_predefined_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLexer_predefined_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLexer_predefined_words(this);
		}
	}

	public final Lexer_predefined_wordsContext lexer_predefined_words() throws RecognitionException {
		Lexer_predefined_wordsContext _localctx = new Lexer_predefined_wordsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lexer_predefined_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
				{
				setState(349);
				constant_words();
				}
				break;
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
				{
				setState(350);
				conditional_words();
				}
				break;
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
				{
				setState(351);
				loop_words();
				}
				break;
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
				{
				setState(352);
				simple_punctuations();
				}
				break;
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACKET:
			case OPEN_BRACE:
			case CLOSE_BRACE:
				{
				setState(353);
				symbol_words();
				}
				break;
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
			case ANDAND:
			case OROR:
				{
				setState(354);
				other_operators();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
				{
				setState(355);
				operators();
				}
				break;
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
				{
				setState(356);
				variable_type();
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

	public static class Constant_wordsContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public TerminalNode CONSTANT() { return getToken(MainParser.CONSTANT, 0); }
		public TerminalNode RETURN() { return getToken(MainParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(MainParser.PRINT, 0); }
		public TerminalNode SCAN() { return getToken(MainParser.SCAN, 0); }
		public TerminalNode VOID() { return getToken(MainParser.VOID, 0); }
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(MainParser.MAIN, 0); }
		public Constant_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConstant_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConstant_words(this);
		}
	}

	public final Constant_wordsContext constant_words() throws RecognitionException {
		Constant_wordsContext _localctx = new Constant_wordsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN))) != 0)) ) {
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

	public static class Conditional_wordsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MainParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(MainParser.ELSE, 0); }
		public TerminalNode ELSE_IF() { return getToken(MainParser.ELSE_IF, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public Conditional_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterConditional_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitConditional_words(this);
		}
	}

	public final Conditional_wordsContext conditional_words() throws RecognitionException {
		Conditional_wordsContext _localctx = new Conditional_wordsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditional_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN))) != 0)) ) {
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

	public static class Loop_wordsContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MainParser.FOR, 0); }
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
		public TerminalNode WHILE() { return getToken(MainParser.WHILE, 0); }
		public Loop_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_words(this);
		}
	}

	public final Loop_wordsContext loop_words() throws RecognitionException {
		Loop_wordsContext _localctx = new Loop_wordsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE))) != 0)) ) {
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

	public static class Simple_punctuationsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public TerminalNode DOT() { return getToken(MainParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(MainParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(MainParser.COLON, 0); }
		public TerminalNode UNDERSCORE() { return getToken(MainParser.UNDERSCORE, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(MainParser.SINGLE_QUOTE, 0); }
		public Simple_punctuationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_punctuations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSimple_punctuations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSimple_punctuations(this);
		}
	}

	public final Simple_punctuationsContext simple_punctuations() throws RecognitionException {
		Simple_punctuationsContext _localctx = new Simple_punctuationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_punctuations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE))) != 0)) ) {
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

	public static class Symbol_wordsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Symbol_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSymbol_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSymbol_words(this);
		}
	}

	public final Symbol_wordsContext symbol_words() throws RecognitionException {
		Symbol_wordsContext _localctx = new Symbol_wordsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_symbol_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << OPEN_BRACE) | (1L << CLOSE_BRACE))) != 0)) ) {
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
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LINECOMMENT() { return getToken(MainParser.LINECOMMENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MainParser.SEMICOLON, 0); }
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Any_declarationContext any_declaration() {
			return getRuleContext(Any_declarationContext.class,0);
		}
		public Scoping_statementContext scoping_statement() {
			return getRuleContext(Scoping_statementContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
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
		enterRule(_localctx, 38, RULE_statements);
		try {
			int _alt;
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				conditional_statement();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(376);
					match(LINECOMMENT);
					}
					break;
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						match(NEWLINE);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				loop_statement();
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(392);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(398);
					match(LINECOMMENT);
					}
					break;
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(401);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(407);
						match(NEWLINE);
						}
						} 
					}
					setState(412);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				print_statement();
				setState(414);
				match(SEMICOLON);
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(421);
					match(LINECOMMENT);
					}
					break;
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(424);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(429);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						match(NEWLINE);
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				print_statement();
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(437);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(443);
					match(LINECOMMENT);
					}
					break;
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(446);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(452);
						match(NEWLINE);
						}
						} 
					}
					setState(457);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				scan_statement();
				setState(461);
				match(SEMICOLON);
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(462);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(468);
					match(LINECOMMENT);
					}
					break;
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(477);
						match(NEWLINE);
						}
						} 
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				scan_statement();
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(484);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(490);
					match(LINECOMMENT);
					}
					break;
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(493);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(498);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						match(NEWLINE);
						}
						} 
					}
					setState(504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(507);
				return_statement();
				setState(508);
				match(SEMICOLON);
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(509);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(515);
					match(LINECOMMENT);
					}
					break;
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(518);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(524);
						match(NEWLINE);
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(530);
				return_statement();
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(531);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(537);
					match(LINECOMMENT);
					}
					break;
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(540);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(546);
						match(NEWLINE);
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				constant_declaration();
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(561);
					match(LINECOMMENT);
					}
					break;
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(564);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(569);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570);
						match(NEWLINE);
						}
						} 
					}
					setState(575);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(576);
				any_declaration();
				setState(577);
				match(SEMICOLON);
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(578);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(584);
					match(LINECOMMENT);
					}
					break;
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(587);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(593);
						match(NEWLINE);
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(599);
				any_declaration();
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(606);
					match(LINECOMMENT);
					}
					break;
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(609);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(614);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(615);
						match(NEWLINE);
						}
						} 
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(623);
				scoping_statement();
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(630);
					match(LINECOMMENT);
					}
					break;
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(633);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(639);
						match(NEWLINE);
						}
						} 
					}
					setState(644);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(645);
				function_calling();
				setState(646);
				match(SEMICOLON);
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(647);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(653);
					match(LINECOMMENT);
					}
					break;
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(656);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						match(NEWLINE);
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(668);
				function_calling();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(669);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(675);
					match(LINECOMMENT);
					}
					break;
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(678);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						match(NEWLINE);
						}
						} 
					}
					setState(689);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				notifyErrorListeners("Missing semicolon");
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(692);
				match(LINECOMMENT);
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

	public static class Any_declarationContext extends ParserRuleContext {
		public Variable_declaration_vartypeContext variable_declaration_vartype() {
			return getRuleContext(Variable_declaration_vartypeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
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
		enterRule(_localctx, 40, RULE_any_declaration);
		try {
			int _alt;
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				variable_declaration_vartype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(698);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
						case 1:
							{
							setState(696);
							label();
							}
							break;
						case 2:
							{
							setState(697);
							variable_type();
							}
							break;
						}
						setState(700);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(704); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(706);
				variable_declaration_vartype();
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				variable_declaration_no_vartype();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				array_declaration_vartype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(717); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(713);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(711);
							label();
							}
							break;
						case 2:
							{
							setState(712);
							variable_type();
							}
							break;
						}
						setState(715);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(719); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(721);
				array_declaration_vartype();
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(724);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Assigned_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigned_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssigned_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssigned_expression(this);
		}
	}

	public final Assigned_expressionContext assigned_expression() throws RecognitionException {
		Assigned_expressionContext _localctx = new Assigned_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assigned_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(727);
				string();
				}
				break;
			case 2:
				{
				setState(728);
				number();
				}
				break;
			case 3:
				{
				setState(729);
				label();
				}
				break;
			case 4:
				{
				setState(730);
				expression(0);
				}
				break;
			case 5:
				{
				setState(731);
				comparison_statement(0);
				}
				break;
			case 6:
				{
				setState(732);
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

	public static class Multiple_declarationContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Multiple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMultiple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMultiple_declaration(this);
		}
	}

	public final Multiple_declarationContext multiple_declaration() throws RecognitionException {
		Multiple_declarationContext _localctx = new Multiple_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiple_declaration);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				label();
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(736);
						match(WHITE_SPACE);
						}
					}

					setState(739);
					match(ASSIGN);
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(740);
						match(WHITE_SPACE);
						}
					}

					setState(743);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				variable_type();
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(747);
						match(WHITE_SPACE);
						}
					}

					setState(750);
					match(ASSIGN);
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(751);
						match(WHITE_SPACE);
						}
					}

					setState(754);
					assigned_expression();
					}
					break;
				}
				notifyErrorListeners("Invalid declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				label();
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(760);
						match(WHITE_SPACE);
						}
					}

					setState(763);
					match(EQUAL);
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(764);
						match(WHITE_SPACE);
						}
					}

					setState(767);
					assigned_expression();
					}
					break;
				}
				notifyErrorListeners("Invalid symbol '==' for declaration");
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

	public static class Variable_declaration_vartypeContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Multiple_declarationContext> multiple_declaration() {
			return getRuleContexts(Multiple_declarationContext.class);
		}
		public Multiple_declarationContext multiple_declaration(int i) {
			return getRuleContext(Multiple_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainParser.COMMA, i);
		}
		public Variable_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVariable_declaration_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVariable_declaration_vartype(this);
		}
	}

	public final Variable_declaration_vartypeContext variable_declaration_vartype() throws RecognitionException {
		Variable_declaration_vartypeContext _localctx = new Variable_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable_declaration_vartype);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			variable_type();
			setState(775);
			match(WHITE_SPACE);
			setState(776);
			multiple_declaration();
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(777);
						match(WHITE_SPACE);
						}
					}

					setState(780);
					match(COMMA);
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(781);
						match(WHITE_SPACE);
						}
					}

					setState(784);
					multiple_declaration();
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class Variable_declaration_no_vartypeContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Variable_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_no_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVariable_declaration_no_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVariable_declaration_no_vartype(this);
		}
	}

	public final Variable_declaration_no_vartypeContext variable_declaration_no_vartype() throws RecognitionException {
		Variable_declaration_no_vartypeContext _localctx = new Variable_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_declaration_no_vartype);
		int _la;
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				label();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(791);
					match(WHITE_SPACE);
					}
				}

				setState(794);
				match(ASSIGN);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(795);
					match(WHITE_SPACE);
					}
				}

				setState(798);
				assigned_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				label();
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(801);
					match(WHITE_SPACE);
					}
				}

				setState(804);
				match(EQUAL);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(805);
					match(WHITE_SPACE);
					}
				}

				setState(808);
				assigned_expression();
				notifyErrorListeners("Invalid symbol '==' for declaration");
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

	public static class Array_sizeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_size(this);
		}
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			expression(0);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_variable(this);
		}
	}

	public final Array_variableContext array_variable() throws RecognitionException {
		Array_variableContext _localctx = new Array_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_variable);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				label();
				setState(816);
				match(OPEN_BRACE);
				setState(817);
				array_size();
				setState(818);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				label();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(821);
					match(OPEN_BRACE);
					}
				}

				setState(824);
				array_size();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(825);
					match(CLOSE_BRACE);
					}
				}

				notifyErrorListeners("Missing brace/s");
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

	public static class Array_assign_bodyContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MainParser.CREATE, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_assign_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_assign_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_assign_body(this);
		}
	}

	public final Array_assign_bodyContext array_assign_body() throws RecognitionException {
		Array_assign_bodyContext _localctx = new Array_assign_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_assign_body);
		int _la;
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(CREATE);
				setState(833);
				match(WHITE_SPACE);
				setState(834);
				variable_type();
				setState(835);
				match(OPEN_BRACE);
				setState(836);
				array_size();
				setState(837);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(CREATE);
				setState(840);
				match(WHITE_SPACE);
				setState(841);
				variable_type();
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(842);
					match(OPEN_BRACE);
					}
				}

				setState(845);
				array_size();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(846);
					match(CLOSE_BRACE);
					}
				}

				notifyErrorListeners("Missing brace for array declaration");
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

	public static class Array_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Array_assign_bodyContext array_assign_body() {
			return getRuleContext(Array_assign_bodyContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Array_variableContext array_variable() {
			return getRuleContext(Array_variableContext.class,0);
		}
		public Assigned_expressionContext assigned_expression() {
			return getRuleContext(Assigned_expressionContext.class,0);
		}
		public Array_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_assign(this);
		}
	}

	public final Array_assignContext array_assign() throws RecognitionException {
		Array_assignContext _localctx = new Array_assignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_assign);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(853);
					match(WHITE_SPACE);
					}
				}

				setState(856);
				match(ASSIGN);
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(857);
					match(WHITE_SPACE);
					}
				}

				setState(860);
				array_assign_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(861);
					match(WHITE_SPACE);
					}
				}

				setState(864);
				match(EQUAL);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(865);
					match(WHITE_SPACE);
					}
				}

				setState(868);
				array_assign_body();
				notifyErrorListeners("Invalid symbol '==' for declaration");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(871);
					match(WHITE_SPACE);
					}
				}

				setState(874);
				match(ASSIGN);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(875);
					match(WHITE_SPACE);
					}
				}

				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(878);
					array_variable();
					}
					break;
				case 2:
					{
					setState(879);
					assigned_expression();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(882);
					match(WHITE_SPACE);
					}
				}

				setState(885);
				match(EQUAL);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(886);
					match(WHITE_SPACE);
					}
				}

				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(889);
					array_variable();
					}
					break;
				case 2:
					{
					setState(890);
					assigned_expression();
					}
					break;
				}
				notifyErrorListeners("Invalid symbol '==' for declaration");
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

	public static class Array_declaration_vartypeContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Array_assignContext array_assign() {
			return getRuleContext(Array_assignContext.class,0);
		}
		public Array_declaration_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_declaration_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_declaration_vartype(this);
		}
	}

	public final Array_declaration_vartypeContext array_declaration_vartype() throws RecognitionException {
		Array_declaration_vartypeContext _localctx = new Array_declaration_vartypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_declaration_vartype);
		int _la;
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				variable_type();
				setState(898);
				match(OPEN_BRACE);
				setState(899);
				match(CLOSE_BRACE);
				setState(900);
				match(WHITE_SPACE);
				setState(901);
				label();
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(902);
					array_assign();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				variable_type();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(906);
					match(OPEN_BRACE);
					}
				}

				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_BRACE) {
					{
					setState(909);
					match(CLOSE_BRACE);
					}
				}

				setState(912);
				match(WHITE_SPACE);
				setState(913);
				label();
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(914);
					array_assign();
					}
					break;
				}
				notifyErrorListeners("Missing braces during array declaration");
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

	public static class Array_declaration_no_vartypeContext extends ParserRuleContext {
		public Array_variableContext array_variable() {
			return getRuleContext(Array_variableContext.class,0);
		}
		public Array_assignContext array_assign() {
			return getRuleContext(Array_assignContext.class,0);
		}
		public Array_declaration_no_vartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration_no_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_declaration_no_vartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_declaration_no_vartype(this);
		}
	}

	public final Array_declaration_no_vartypeContext array_declaration_no_vartype() throws RecognitionException {
		Array_declaration_no_vartypeContext _localctx = new Array_declaration_no_vartypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_declaration_no_vartype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			array_variable();
			setState(922);
			array_assign();
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
		public Value_printContext value_print() {
			return getRuleContext(Value_printContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 62, RULE_print_statement);
		int _la;
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(PRINT);
				setState(925);
				match(OPEN_PAREN);
				setState(926);
				value_print();
				setState(927);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				match(PRINT);
				setState(931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(930);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(933);
				value_print();
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(934);
					match(CLOSE_PAREN);
					}
				}

				notifyErrorListeners("Missing parenthesis");
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

	public static class Other_label_for_print_errorContext extends ParserRuleContext {
		public List<Label_wordsContext> label_words() {
			return getRuleContexts(Label_wordsContext.class);
		}
		public Label_wordsContext label_words(int i) {
			return getRuleContext(Label_wordsContext.class,i);
		}
		public List<TerminalNode> LOWERCASE() { return getTokens(MainParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(MainParser.LOWERCASE, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(MainParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MainParser.UNDERSCORE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(MainParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(MainParser.UPPERCASE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public Other_label_for_print_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_label_for_print_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterOther_label_for_print_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitOther_label_for_print_error(this);
		}
	}

	public final Other_label_for_print_errorContext other_label_for_print_error() throws RecognitionException {
		Other_label_for_print_errorContext _localctx = new Other_label_for_print_errorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_other_label_for_print_error);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(947); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
					case 1:
						{
						setState(941);
						label_words();
						}
						break;
					case 2:
						{
						setState(942);
						match(LOWERCASE);
						}
						break;
					case 3:
						{
						setState(943);
						match(UNDERSCORE);
						}
						break;
					case 4:
						{
						setState(944);
						match(UPPERCASE);
						}
						break;
					case 5:
						{
						setState(945);
						match(DIGIT);
						}
						break;
					case 6:
						{
						setState(946);
						match(T__1);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(949); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class Value_printContext extends ParserRuleContext {
		public List<Other_label_for_print_errorContext> other_label_for_print_error() {
			return getRuleContexts(Other_label_for_print_errorContext.class);
		}
		public Other_label_for_print_errorContext other_label_for_print_error(int i) {
			return getRuleContext(Other_label_for_print_errorContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Extended_value_printContext> extended_value_print() {
			return getRuleContexts(Extended_value_printContext.class);
		}
		public Extended_value_printContext extended_value_print(int i) {
			return getRuleContext(Extended_value_printContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MainParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MainParser.PLUS, i);
		}
		public Value_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_print(this);
		}
	}

	public final Value_printContext value_print() throws RecognitionException {
		Value_printContext _localctx = new Value_printContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value_print);
		int _la;
		try {
			int _alt;
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				other_label_for_print_error();
				setState(954); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(952);
						match(WHITE_SPACE);
						setState(953);
						other_label_for_print_error();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(956); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("No double quotes");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				extended_value_print();
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(962);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(961);
							match(WHITE_SPACE);
							}
						}

						setState(964);
						match(PLUS);
						setState(966);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(965);
							match(WHITE_SPACE);
							}
						}

						setState(968);
						extended_value_print();
						setState(970);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
						case 1:
							{
							setState(969);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(976);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				extended_value_print();
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(979);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(978);
							match(WHITE_SPACE);
							}
						}

						setState(981);
						match(PLUS);
						setState(983);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(982);
							match(WHITE_SPACE);
							}
						}

						setState(985);
						extended_value_print();
						setState(987);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
						case 1:
							{
							setState(986);
							match(WHITE_SPACE);
							}
							break;
						}
						}
						} 
					}
					setState(993);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				setState(995); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(994);
					match(PLUS);
					}
					}
					setState(997); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				notifyErrorListeners("Additional ‘+’ sign at end of print");
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

	public static class Extended_value_printContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_extended_value_print);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1006);
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
		public Scan_bodyContext scan_body() {
			return getRuleContext(Scan_bodyContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_scan_statement);
		int _la;
		try {
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(SCAN);
				setState(1010);
				match(OPEN_PAREN);
				setState(1011);
				scan_body();
				setState(1012);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(SCAN);
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1018);
				scan_body();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1019);
					match(CLOSE_PAREN);
					}
				}

				notifyErrorListeners("Missing parenthesis");
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

	public static class Scan_bodyContext extends ParserRuleContext {
		public Display_message_parameterContext display_message_parameter() {
			return getRuleContext(Display_message_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public Value_parameterContext value_parameter() {
			return getRuleContext(Value_parameterContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Scan_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScan_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScan_body(this);
		}
	}

	public final Scan_bodyContext scan_body() throws RecognitionException {
		Scan_bodyContext _localctx = new Scan_bodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scan_body);
		int _la;
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				display_message_parameter();
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1027);
					match(WHITE_SPACE);
					}
				}

				setState(1030);
				match(COMMA);
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1031);
					match(WHITE_SPACE);
					}
				}

				setState(1034);
				value_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				display_message_parameter();
				setState(1038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1037);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1040);
					match(COMMA);
					}
					break;
				}
				notifyErrorListeners("Missing 2nd scan parameter");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				display_message_parameter();
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1046);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1050);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1049);
					match(COMMA);
					}
					break;
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1052);
					match(WHITE_SPACE);
					}
				}

				setState(1055);
				value_parameter();
				notifyErrorListeners("Missing comma");
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

	public static class Display_message_parameterContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Scan_labelContext scan_label() {
			return getRuleContext(Scan_labelContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Display_message_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_message_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterDisplay_message_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitDisplay_message_parameter(this);
		}
	}

	public final Display_message_parameterContext display_message_parameter() throws RecognitionException {
		Display_message_parameterContext _localctx = new Display_message_parameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_display_message_parameter);
		try {
			int _alt;
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				string();
				}
				break;
			case T__1:
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_BRACKET:
			case CLOSE_BRACKET:
			case OPEN_BRACE:
			case CLOSE_BRACE:
			case LESS:
			case LESSQEUAL:
			case GREATER:
			case GREATEREQUAL:
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case MOD:
			case ANDAND:
			case OROR:
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1063);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1061);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1062);
					scan_label();
					}
					break;
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1065);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1070);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				}
				notifyErrorListeners("1st parameter should be string");
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

	public static class Scan_labelContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<Lexer_predefined_wordsContext> lexer_predefined_words() {
			return getRuleContexts(Lexer_predefined_wordsContext.class);
		}
		public Lexer_predefined_wordsContext lexer_predefined_words(int i) {
			return getRuleContext(Lexer_predefined_wordsContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Scan_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterScan_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitScan_label(this);
		}
	}

	public final Scan_labelContext scan_label() throws RecognitionException {
		Scan_labelContext _localctx = new Scan_labelContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scan_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1079);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						setState(1075);
						match(DIGIT);
						}
						break;
					case 2:
						{
						setState(1076);
						lexer_predefined_words();
						}
						break;
					case 3:
						{
						setState(1077);
						label();
						}
						break;
					case 4:
						{
						setState(1078);
						match(WHITE_SPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1081); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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

	public static class Value_parameterContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Value_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterValue_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitValue_parameter(this);
		}
	}

	public final Value_parameterContext value_parameter() throws RecognitionException {
		Value_parameterContext _localctx = new Value_parameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value_parameter);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case CREATE:
			case CONSTANT:
			case RETURN:
			case PRINT:
			case SCAN:
			case VOID:
			case FUNC:
			case MAIN:
			case IF:
			case ELSE:
			case ELSE_IF:
			case THEN:
			case FOR:
			case UP_TO:
			case DOWN_TO:
			case WHILE:
			case INT_DEC:
			case BOOLEAN_DEC:
			case FLOAT_DEC:
			case STRING_DEC:
			case NOT:
			case ASSIGN:
			case EQUAL:
			case QUESTION:
			case COLON:
			case DOT:
			case SEMICOLON:
			case COMMA:
			case UNDERSCORE:
			case SINGLE_QUOTE:
			case LOWERCASE:
			case UPPERCASE:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				label();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				string();
				notifyErrorListeners("2nd parameter should not be string");
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
		enterRule(_localctx, 80, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(CONSTANT);
			setState(1090);
			match(WHITE_SPACE);
			setState(1091);
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
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
		enterRule(_localctx, 82, RULE_return_statement);
		int _la;
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				match(RETURN);
				setState(1094);
				match(WHITE_SPACE);
				setState(1095);
				return_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(RETURN);
				setState(1097);
				match(WHITE_SPACE);
				setState(1098);
				return_value();
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1099);
					match(WHITE_SPACE);
					}
					}
					setState(1104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1105);
				match(OPEN_PAREN);
				setState(1106);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1109);
				match(RETURN);
				setState(1110);
				match(WHITE_SPACE);
				setState(1111);
				variable_type();
				notifyErrorListeners("Invalid return value");
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

	public static class Return_valueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterReturn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitReturn_value(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_return_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1116);
				string();
				}
				break;
			case 2:
				{
				setState(1117);
				number();
				}
				break;
			case 3:
				{
				setState(1118);
				label();
				}
				break;
			case 4:
				{
				setState(1119);
				expression(0);
				}
				break;
			case 5:
				{
				setState(1120);
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
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MainParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MainParser.OPEN_PAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1124);
				value_expression();
				}
				break;
			case 2:
				{
				setState(1125);
				match(OPEN_PAREN);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1126);
					match(WHITE_SPACE);
					}
				}

				setState(1129);
				expression(0);
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1130);
					match(WHITE_SPACE);
					}
				}

				setState(1133);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				setState(1136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1135);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1140);
					match(WHITE_SPACE);
					}
				}

				setState(1143);
				expression(0);
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1144);
					match(WHITE_SPACE);
					}
				}

				setState(1148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1147);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1150); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Multiple parenthesis");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1158);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1157);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1160);
						operators();
						}
						setState(1162);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1161);
							match(WHITE_SPACE);
							}
						}

						setState(1164);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1168);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1167);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1170);
						operators();
						setState(1172); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1171);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1174); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						setState(1177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1176);
							match(WHITE_SPACE);
							}
						}

						setState(1179);
						expression(4);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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

	public static class Array_labelContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Array_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterArray_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitArray_label(this);
		}
	}

	public final Array_labelContext array_label() throws RecognitionException {
		Array_labelContext _localctx = new Array_labelContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_array_label);
		int _la;
		try {
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1187);
				label();
				setState(1188);
				match(OPEN_BRACE);
				setState(1189);
				alt_expression();
				setState(1190);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				label();
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1193);
					match(OPEN_BRACE);
					}
				}

				setState(1196);
				alt_expression();
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1197);
					match(CLOSE_BRACE);
					}
					break;
				}
				notifyErrorListeners("Missing brace/s");
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

	public static class Value_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Array_labelContext array_label() {
			return getRuleContext(Array_labelContext.class,0);
		}
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
		enterRule(_localctx, 90, RULE_value_expression);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1206);
				function_calling();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1207);
				array_label();
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

	public static class Alt_expressionContext extends ParserRuleContext {
		public Alt_parenthesis_expressionContext alt_parenthesis_expression() {
			return getRuleContext(Alt_parenthesis_expressionContext.class,0);
		}
		public Alt_operator_expressionContext alt_operator_expression() {
			return getRuleContext(Alt_operator_expressionContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Alt_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_expression(this);
		}
	}

	public final Alt_expressionContext alt_expression() throws RecognitionException {
		Alt_expressionContext _localctx = new Alt_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alt_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			alt_parenthesis_expression();
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1211);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1214);
			alt_operator_expression();
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

	public static class Alt_operator_expressionContext extends ParserRuleContext {
		public Alt_first_expression_operatorContext alt_first_expression_operator() {
			return getRuleContext(Alt_first_expression_operatorContext.class,0);
		}
		public Alt_second_expression_operatorContext alt_second_expression_operator() {
			return getRuleContext(Alt_second_expression_operatorContext.class,0);
		}
		public Alt_operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_operator_expression(this);
		}
	}

	public final Alt_operator_expressionContext alt_operator_expression() throws RecognitionException {
		Alt_operator_expressionContext _localctx = new Alt_operator_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alt_operator_expression);
		try {
			setState(1218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				alt_first_expression_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				alt_second_expression_operator();
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

	public static class Alt_parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Alt_value_expressionContext> alt_value_expression() {
			return getRuleContexts(Alt_value_expressionContext.class);
		}
		public Alt_value_expressionContext alt_value_expression(int i) {
			return getRuleContext(Alt_value_expressionContext.class,i);
		}
		public Alt_operator_expressionContext alt_operator_expression() {
			return getRuleContext(Alt_operator_expressionContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public Alt_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_parenthesis_expression(this);
		}
	}

	public final Alt_parenthesis_expressionContext alt_parenthesis_expression() throws RecognitionException {
		Alt_parenthesis_expressionContext _localctx = new Alt_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alt_parenthesis_expression);
		int _la;
		try {
			int _alt;
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				match(OPEN_PAREN);
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1221);
					match(WHITE_SPACE);
					}
				}

				setState(1224);
				alt_expression();
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1225);
					match(WHITE_SPACE);
					}
				}

				setState(1228);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				match(OPEN_PAREN);
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1231);
					match(WHITE_SPACE);
					}
				}

				setState(1234);
				alt_expression();
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1235);
					match(WHITE_SPACE);
					}
					break;
				}
				notifyErrorListeners("Uneven parenthesis, missing ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1240);
				match(OPEN_PAREN);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1241);
					match(WHITE_SPACE);
					}
				}

				setState(1244);
				alt_expression();
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1245);
					match(WHITE_SPACE);
					}
				}

				setState(1249); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1248);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1251); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Uneven parenthesis, duplicate ')'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1255);
				alt_value_expression();
				setState(1257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1256);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1259);
				alt_operator_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1261);
				alt_value_expression();
				setState(1267); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1262);
						match(WHITE_SPACE);
						setState(1265);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
						case CREATE:
						case CONSTANT:
						case RETURN:
						case PRINT:
						case SCAN:
						case VOID:
						case FUNC:
						case MAIN:
						case IF:
						case ELSE:
						case ELSE_IF:
						case THEN:
						case FOR:
						case UP_TO:
						case DOWN_TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case NOT:
						case ASSIGN:
						case EQUAL:
						case QUESTION:
						case COLON:
						case DOT:
						case SEMICOLON:
						case COMMA:
						case UNDERSCORE:
						case SINGLE_QUOTE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1263);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1264);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1269); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1271);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1274);
				alt_operator_expression();
				notifyErrorListeners("Too many value expression");
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

	public static class Alt_first_expression_operatorContext extends ParserRuleContext {
		public First_operatorsContext first_operators() {
			return getRuleContext(First_operatorsContext.class,0);
		}
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Alt_value_expressionContext> alt_value_expression() {
			return getRuleContexts(Alt_value_expressionContext.class);
		}
		public Alt_value_expressionContext alt_value_expression(int i) {
			return getRuleContext(Alt_value_expressionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public Alt_first_expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_first_expression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_first_expression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_first_expression_operator(this);
		}
	}

	public final Alt_first_expression_operatorContext alt_first_expression_operator() throws RecognitionException {
		Alt_first_expression_operatorContext _localctx = new Alt_first_expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alt_first_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279);
				first_operators();
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1280);
					match(WHITE_SPACE);
					}
				}

				setState(1283);
				alt_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				first_operators();
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1286);
					match(WHITE_SPACE);
					}
				}

				setState(1289);
				alt_expression();
				setState(1295); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1290);
						match(WHITE_SPACE);
						setState(1293);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
						case CREATE:
						case CONSTANT:
						case RETURN:
						case PRINT:
						case SCAN:
						case VOID:
						case FUNC:
						case MAIN:
						case IF:
						case ELSE:
						case ELSE_IF:
						case THEN:
						case FOR:
						case UP_TO:
						case DOWN_TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case NOT:
						case ASSIGN:
						case EQUAL:
						case QUESTION:
						case COLON:
						case DOT:
						case SEMICOLON:
						case COMMA:
						case UNDERSCORE:
						case SINGLE_QUOTE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1291);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1292);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1301);
				first_operators();
				setState(1309); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1305);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1302);
							match(WHITE_SPACE);
							}
							}
							setState(1307);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1308);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1311); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1313);
					match(WHITE_SPACE);
					}
				}

				setState(1316);
				alt_expression();
				notifyErrorListeners("Too Many Operators");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Alt_second_expression_operatorContext extends ParserRuleContext {
		public Second_operatorsContext second_operators() {
			return getRuleContext(Second_operatorsContext.class,0);
		}
		public Alt_expressionContext alt_expression() {
			return getRuleContext(Alt_expressionContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Alt_value_expressionContext> alt_value_expression() {
			return getRuleContexts(Alt_value_expressionContext.class);
		}
		public Alt_value_expressionContext alt_value_expression(int i) {
			return getRuleContext(Alt_value_expressionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public Alt_second_expression_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_second_expression_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_second_expression_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_second_expression_operator(this);
		}
	}

	public final Alt_second_expression_operatorContext alt_second_expression_operator() throws RecognitionException {
		Alt_second_expression_operatorContext _localctx = new Alt_second_expression_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alt_second_expression_operator);
		int _la;
		try {
			int _alt;
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				second_operators();
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1323);
					match(WHITE_SPACE);
					}
				}

				setState(1326);
				alt_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				second_operators();
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1329);
					match(WHITE_SPACE);
					}
				}

				setState(1332);
				alt_expression();
				setState(1338); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1333);
						match(WHITE_SPACE);
						setState(1336);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
						case CREATE:
						case CONSTANT:
						case RETURN:
						case PRINT:
						case SCAN:
						case VOID:
						case FUNC:
						case MAIN:
						case IF:
						case ELSE:
						case ELSE_IF:
						case THEN:
						case FOR:
						case UP_TO:
						case DOWN_TO:
						case WHILE:
						case INT_DEC:
						case BOOLEAN_DEC:
						case FLOAT_DEC:
						case STRING_DEC:
						case MINUS:
						case NOT:
						case ASSIGN:
						case EQUAL:
						case QUESTION:
						case COLON:
						case DOT:
						case SEMICOLON:
						case COMMA:
						case UNDERSCORE:
						case SINGLE_QUOTE:
						case LOWERCASE:
						case UPPERCASE:
						case DIGIT:
							{
							setState(1334);
							alt_value_expression();
							}
							break;
						case T__0:
							{
							setState(1335);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1340); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many value expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				second_operators();
				setState(1352); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1348);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITE_SPACE) {
							{
							{
							setState(1345);
							match(WHITE_SPACE);
							}
							}
							setState(1350);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1351);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1354); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1356);
					match(WHITE_SPACE);
					}
				}

				setState(1359);
				alt_expression();
				notifyErrorListeners("Too Many Operators");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Alt_value_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Function_callingContext function_calling() {
			return getRuleContext(Function_callingContext.class,0);
		}
		public Alt_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAlt_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAlt_value_expression(this);
		}
	}

	public final Alt_value_expressionContext alt_value_expression() throws RecognitionException {
		Alt_value_expressionContext _localctx = new Alt_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_alt_value_expression);
		try {
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1367);
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

	public static class Comparison_statementContext extends ParserRuleContext {
		public Value_comparisonContext value_comparison() {
			return getRuleContext(Value_comparisonContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public List<Comparison_statementContext> comparison_statement() {
			return getRuleContexts(Comparison_statementContext.class);
		}
		public Comparison_statementContext comparison_statement(int i) {
			return getRuleContext(Comparison_statementContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode NOT() { return getToken(MainParser.NOT, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<Other_operatorsContext> other_operators() {
			return getRuleContexts(Other_operatorsContext.class);
		}
		public Other_operatorsContext other_operators(int i) {
			return getRuleContext(Other_operatorsContext.class,i);
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
		return comparison_statement(0);
	}

	private Comparison_statementContext comparison_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comparison_statementContext _localctx = new Comparison_statementContext(_ctx, _parentState);
		Comparison_statementContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_comparison_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1371);
				value_comparison();
				}
				break;
			case 2:
				{
				setState(1372);
				assignment_statement();
				}
				break;
			case 3:
				{
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1373);
					match(NOT);
					}
				}

				setState(1376);
				match(OPEN_PAREN);
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1377);
					match(WHITE_SPACE);
					}
				}

				setState(1380);
				comparison_statement(0);
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1381);
					match(WHITE_SPACE);
					}
				}

				setState(1384);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1388);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1390);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1389);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1392);
						other_operators();
						}
						setState(1394);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1393);
							match(WHITE_SPACE);
							}
						}

						setState(1396);
						comparison_statement(4);
						}
						break;
					case 2:
						{
						_localctx = new Comparison_statementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparison_statement);
						setState(1398);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1400);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1399);
							match(WHITE_SPACE);
							}
						}

						{
						setState(1402);
						other_operators();
						setState(1404); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1403);
							other_operators();
							}
							}
							setState(1406); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSQEUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << ANDAND) | (1L << OROR))) != 0) );
						}
						setState(1409);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1408);
							match(WHITE_SPACE);
							}
						}

						setState(1411);
						comparison_statement(3);
						notifyErrorListeners("Multiple operators");
						}
						break;
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MainParser.EQUAL, 0); }
		public Value_comparisonContext value_comparison() {
			return getRuleContext(Value_comparisonContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
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
		enterRule(_localctx, 106, RULE_assignment_statement);
		int _la;
		try {
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				label();
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1420);
					match(WHITE_SPACE);
					}
				}

				setState(1423);
				match(EQUAL);
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1424);
					match(WHITE_SPACE);
					}
				}

				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1427);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(1428);
					string();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				label();
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1432);
					match(WHITE_SPACE);
					}
				}

				setState(1435);
				match(ASSIGN);
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1436);
					match(WHITE_SPACE);
					}
				}

				setState(1441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1439);
					value_comparison();
					}
					break;
				case 2:
					{
					setState(1440);
					string();
					}
					break;
				}
				notifyErrorListeners("Invalid comparison symbol '=', should be '=='");
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

	public static class Value_comparisonContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 108, RULE_value_comparison);
		try {
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1449);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1450);
				string();
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
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
		enterRule(_localctx, 110, RULE_conditional_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			if_statement();
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1454);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WHITE_SPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1457);
					else_if_statement();
					setState(1459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
					case 1:
						{
						setState(1458);
						_la = _input.LA(1);
						if ( !(_la==NEWLINE || _la==WHITE_SPACE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(1465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1466);
				else_statement();
				setState(1470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1467);
						match(NEWLINE);
						}
						} 
					}
					setState(1472);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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

	public static class Conditional_comparison_structureContext extends ParserRuleContext {
		public With_comparisonContext with_comparison() {
			return getRuleContext(With_comparisonContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_conditional_comparison_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			with_comparison();
			setState(1476);
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

	public static class With_thenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode LINECOMMENT() { return getToken(MainParser.LINECOMMENT, 0); }
		public With_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWith_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWith_then(this);
		}
	}

	public final With_thenContext with_then() throws RecognitionException {
		With_thenContext _localctx = new With_thenContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_with_then);
		int _la;
		try {
			int _alt;
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1478);
					match(WHITE_SPACE);
					}
				}

				setState(1481);
				match(THEN);
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1482);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1485);
					match(LINECOMMENT);
					}
					break;
				}
				setState(1491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1488);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1494);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1497);
					match(THEN);
					}
					break;
				}
				setState(1501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1500);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1503);
					match(LINECOMMENT);
					}
					break;
				}
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1506);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				}
				notifyErrorListeners("Missing 'then' word");
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

	public static class With_comparisonContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public With_thenContext with_then() {
			return getRuleContext(With_thenContext.class,0);
		}
		public With_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterWith_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitWith_comparison(this);
		}
	}

	public final With_comparisonContext with_comparison() throws RecognitionException {
		With_comparisonContext _localctx = new With_comparisonContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_with_comparison);
		int _la;
		try {
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				match(OPEN_PAREN);
				setState(1516);
				comparison_statement(0);
				setState(1517);
				match(CLOSE_PAREN);
				setState(1518);
				with_then();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1520);
					match(OPEN_PAREN);
					}
					break;
				}
				setState(1523);
				comparison_statement(0);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(1524);
					match(CLOSE_PAREN);
					}
				}

				setState(1527);
				with_then();
				notifyErrorListeners("Uneven parenthesis");
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

	public static class Conditional_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 118, RULE_conditional_body);
		int _la;
		try {
			int _alt;
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1532);
					match(WHITE_SPACE);
					}
					}
					setState(1537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1538);
				match(OPEN_BRACKET);
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1539);
					match(WHITE_SPACE);
					}
					}
					setState(1544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1545);
					statements();
					}
					}
					setState(1548); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1550);
					match(WHITE_SPACE);
					}
					}
					setState(1555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1556);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1558);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1563);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				}
				setState(1565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(1564);
					match(OPEN_BRACKET);
					}
					break;
				}
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1567);
					match(WHITE_SPACE);
					}
					}
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1574); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1573);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1576); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1578);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				}
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(1584);
					match(CLOSE_BRACKET);
					}
					break;
				}
				notifyErrorListeners("Uneven bracket/s");
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MainParser.IF, 0); }
		public Conditional_comparison_structureContext conditional_comparison_structure() {
			return getRuleContext(Conditional_comparison_structureContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(IF);
			setState(1592);
			conditional_comparison_structure();
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

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(MainParser.ELSE_IF, 0); }
		public Conditional_comparison_structureContext conditional_comparison_structure() {
			return getRuleContext(Conditional_comparison_structureContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitElse_if_statement(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(ELSE_IF);
			setState(1595);
			conditional_comparison_structure();
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MainParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(MainParser.THEN, 0); }
		public Conditional_bodyContext conditional_body() {
			return getRuleContext(Conditional_bodyContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			match(ELSE);
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1598);
				match(WHITE_SPACE);
				}
			}

			setState(1601);
			match(THEN);
			setState(1603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(1602);
				match(WHITE_SPACE);
				}
				break;
			}
			setState(1605);
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
		enterRule(_localctx, 126, RULE_loop_statement);
		try {
			setState(1609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608);
				for_statement();
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

	public static class Loop_conditionalContext extends ParserRuleContext {
		public TerminalNode UP_TO() { return getToken(MainParser.UP_TO, 0); }
		public TerminalNode DOWN_TO() { return getToken(MainParser.DOWN_TO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Loop_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_conditional(this);
		}
	}

	public final Loop_conditionalContext loop_conditional() throws RecognitionException {
		Loop_conditionalContext _localctx = new Loop_conditionalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_loop_conditional);
		try {
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				match(UP_TO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(DOWN_TO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1613);
				label();
				notifyErrorListeners("Must be 'up to' or 'down to' only");
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

	public static class Loop_structureContext extends ParserRuleContext {
		public Loop_conditionalContext loop_conditional() {
			return getRuleContext(Loop_conditionalContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
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
		enterRule(_localctx, 130, RULE_loop_structure);
		int _la;
		try {
			int _alt;
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1618);
				loop_conditional();
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1619);
					match(WHITE_SPACE);
					}
				}

				setState(1622);
				expression(0);
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1623);
					match(WHITE_SPACE);
					}
				}

				setState(1626);
				match(OPEN_BRACKET);
				setState(1630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1627);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				}
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(1633);
					statements();
					}
					}
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1639);
					match(WHITE_SPACE);
					}
					}
					setState(1644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1645);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				loop_conditional();
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1648);
					match(WHITE_SPACE);
					}
				}

				setState(1651);
				expression(0);
				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1652);
					match(WHITE_SPACE);
					}
				}

				setState(1655);
				match(OPEN_BRACKET);
				setState(1659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1656);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1662);
						statements();
						}
						} 
					}
					setState(1667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
				}
				setState(1671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1668);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1673);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				}
				notifyErrorListeners("Missing closing curly brackets");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676);
				loop_conditional();
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1677);
					match(WHITE_SPACE);
					}
				}

				setState(1680);
				expression(0);
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(1681);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1684);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(1689);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				}
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(1690);
					statements();
					}
					}
					setState(1695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITE_SPACE) {
					{
					{
					setState(1696);
					match(WHITE_SPACE);
					}
					}
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1702);
				match(CLOSE_BRACKET);
				notifyErrorListeners("Missing opening curly brackets");
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

	public static class Loop_variable_declarationContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode ASSIGN() { return getToken(MainParser.ASSIGN, 0); }
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 132, RULE_loop_variable_declaration);
		int _la;
		try {
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(1707);
					variable_type();
					setState(1708);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1712);
				label();
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(1713);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(1716);
					match(ASSIGN);
					setState(1718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE) {
						{
						setState(1717);
						match(WHITE_SPACE);
						}
					}

					setState(1720);
					loop_expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				expression(0);
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLoop_expression(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(1726);
				number();
				}
				break;
			case 2:
				{
				setState(1727);
				label();
				}
				break;
			case 3:
				{
				setState(1728);
				expression(0);
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
		public TerminalNode WHILE() { return getToken(MainParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_structureContext loop_structure() {
			return getRuleContext(Loop_structureContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 136, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(WHILE);
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1732);
				match(WHITE_SPACE);
				}
			}

			setState(1735);
			expression(0);
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1736);
				match(WHITE_SPACE);
				}
			}

			setState(1739);
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 138, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			match(FOR);
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1742);
				match(WHITE_SPACE);
				}
			}

			setState(1745);
			loop_variable_declaration();
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1746);
				match(WHITE_SPACE);
				}
			}

			setState(1749);
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

	public static class Function_callingContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MainParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MainParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MainParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MainParser.CLOSE_PAREN, i);
		}
		public List<Function_parametersContext> function_parameters() {
			return getRuleContexts(Function_parametersContext.class);
		}
		public Function_parametersContext function_parameters(int i) {
			return getRuleContext(Function_parametersContext.class,i);
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
		enterRule(_localctx, 140, RULE_function_calling);
		int _la;
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1751);
				label();
				setState(1752);
				match(OPEN_PAREN);
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1753);
					function_parameters();
					}
				}

				setState(1756);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1758);
				label();
				setState(1759);
				match(OPEN_PAREN);
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(1760);
					function_parameters();
					}
					break;
				}
				notifyErrorListeners("Missing closing parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1765);
				label();
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1766);
					function_parameters();
					}
				}

				setState(1769);
				match(CLOSE_PAREN);
				notifyErrorListeners("Missing opening parenthesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1772);
				label();
				setState(1773);
				match(OPEN_PAREN);
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1774);
					function_parameters();
					}
				}

				setState(1777);
				match(CLOSE_PAREN);
				setState(1778);
				match(OPEN_PAREN);
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_PAREN) | (1L << MINUS) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT))) != 0)) {
					{
					setState(1779);
					function_parameters();
					}
				}

				setState(1782);
				match(CLOSE_PAREN);
				notifyErrorListeners("Redundant parenthesis");
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
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
		enterRule(_localctx, 142, RULE_function_parameters);
		int _la;
		try {
			int _alt;
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				function_paremeters_value();
				setState(1798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1789);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1788);
							match(WHITE_SPACE);
							}
						}

						setState(1791);
						match(COMMA);
						setState(1793);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1792);
							match(WHITE_SPACE);
							}
						}

						setState(1795);
						function_paremeters_value();
						}
						} 
					}
					setState(1800);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1801);
				function_paremeters_value();
				setState(1806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1802);
						match(WHITE_SPACE);
						setState(1803);
						function_paremeters_value();
						}
						} 
					}
					setState(1808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				}
				notifyErrorListeners("Missing Comma");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1811);
				function_paremeters_value();
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1813);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1812);
							match(WHITE_SPACE);
							}
						}

						setState(1815);
						match(COMMA);
						setState(1817); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1816);
								match(COMMA);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1819); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1822);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WHITE_SPACE) {
							{
							setState(1821);
							match(WHITE_SPACE);
							}
						}

						setState(1824);
						function_paremeters_value();
						}
						} 
					}
					setState(1829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
				}
				notifyErrorListeners("Too much Commas");
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

	public static class Function_paremeters_valueContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 144, RULE_function_paremeters_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(1834);
				label();
				}
				break;
			case 2:
				{
				setState(1835);
				expression(0);
				}
				break;
			case 3:
				{
				setState(1836);
				string();
				}
				break;
			case 4:
				{
				setState(1837);
				number();
				}
				break;
			case 5:
				{
				setState(1838);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Void_functionContext void_function() {
			return getRuleContext(Void_functionContext.class,0);
		}
		public Non_void_functionContext non_void_function() {
			return getRuleContext(Non_void_functionContext.class,0);
		}
		public Error_functionContext error_function() {
			return getRuleContext(Error_functionContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_function_declaration);
		try {
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1841);
				void_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				non_void_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1843);
				error_function();
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

	public static class Function_labelContext extends ParserRuleContext {
		public List<Label_words_withoutsymbolContext> label_words_withoutsymbol() {
			return getRuleContexts(Label_words_withoutsymbolContext.class);
		}
		public Label_words_withoutsymbolContext label_words_withoutsymbol(int i) {
			return getRuleContext(Label_words_withoutsymbolContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MainParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MainParser.DIGIT, i);
		}
		public List<Function_labelContext> function_label() {
			return getRuleContexts(Function_labelContext.class);
		}
		public Function_labelContext function_label(int i) {
			return getRuleContext(Function_labelContext.class,i);
		}
		public List<TerminalNode> LOWERCASE() { return getTokens(MainParser.LOWERCASE); }
		public TerminalNode LOWERCASE(int i) {
			return getToken(MainParser.LOWERCASE, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(MainParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MainParser.UNDERSCORE, i);
		}
		public List<TerminalNode> UPPERCASE() { return getTokens(MainParser.UPPERCASE); }
		public TerminalNode UPPERCASE(int i) {
			return getToken(MainParser.UPPERCASE, i);
		}
		public Function_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_label(this);
		}
	}

	public final Function_labelContext function_label() throws RecognitionException {
		Function_labelContext _localctx = new Function_labelContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_function_label);
		int _la;
		try {
			int _alt;
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
					{
					{
					setState(1846);
					label_words_withoutsymbol();
					}
					}
					setState(1851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1853); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1852);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1855); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1857);
						match(DIGIT);
						}
						} 
					}
					setState(1862);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
				}
				setState(1866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1863);
						label_words_withoutsymbol();
						}
						} 
					}
					setState(1868);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1869);
						function_label();
						}
						} 
					}
					setState(1874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC))) != 0)) {
					{
					{
					setState(1875);
					label_words_withoutsymbol();
					}
					}
					setState(1880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1881);
				match(DIGIT);
				setState(1883); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1882);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1885); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1887);
						match(DIGIT);
						}
						} 
					}
					setState(1892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
				}
				setState(1896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1893);
						label_words_withoutsymbol();
						}
						} 
					}
					setState(1898);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
				}
				setState(1902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1899);
						function_label();
						}
						} 
					}
					setState(1904);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
				}
				notifyErrorListeners("Missing Operator");
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

	public static class Function_structureContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MainParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MainParser.NEWLINE, i);
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
		enterRule(_localctx, 150, RULE_function_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			label();
			setState(1909);
			match(OPEN_PAREN);
			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACE) | (1L << UNDERSCORE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << WHITE_SPACE))) != 0)) {
				{
				setState(1910);
				function_declaration_parameters();
				}
			}

			setState(1913);
			match(CLOSE_PAREN);
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(1914);
				match(WHITE_SPACE);
				}
			}

			setState(1917);
			match(OPEN_BRACKET);
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1918);
				match(WHITE_SPACE);
				}
				}
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1924);
				statements();
				}
				}
				setState(1927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(1929);
				match(WHITE_SPACE);
				}
				}
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1935);
			match(CLOSE_BRACKET);
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1936);
				match(NEWLINE);
				}
				}
				setState(1941);
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

	public static class Function_declaration_parametersContext extends ParserRuleContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Function_labelContext function_label() {
			return getRuleContext(Function_labelContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Function_declaration_parameters_bodyContext function_declaration_parameters_body() {
			return getRuleContext(Function_declaration_parameters_bodyContext.class,0);
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
		enterRule(_localctx, 152, RULE_function_declaration_parameters);
		int _la;
		try {
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1942);
				variable_type();
				setState(1945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1943);
					match(OPEN_BRACE);
					setState(1944);
					match(CLOSE_BRACE);
					}
				}

				setState(1947);
				match(WHITE_SPACE);
				setState(1948);
				function_label();
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1949);
					function_declaration_parameters_body();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(1952);
					variable_type();
					}
					break;
				}
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACE) {
					{
					setState(1955);
					match(OPEN_BRACE);
					setState(1956);
					match(CLOSE_BRACE);
					}
				}

				setState(1960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(1959);
					match(WHITE_SPACE);
					}
				}

				setState(1962);
				function_label();
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==WHITE_SPACE) {
					{
					setState(1963);
					function_declaration_parameters_body();
					}
				}

				notifyErrorListeners("Missing data type in function parameter");
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

	public static class Function_declaration_parameters_bodyContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MainParser.COMMA, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Function_declaration_parameters_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterFunction_declaration_parameters_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitFunction_declaration_parameters_body(this);
		}
	}

	public final Function_declaration_parameters_bodyContext function_declaration_parameters_body() throws RecognitionException {
		Function_declaration_parameters_bodyContext _localctx = new Function_declaration_parameters_bodyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_function_declaration_parameters_body);
		try {
			int _alt;
			setState(1983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1970);
				match(COMMA);
				setState(1972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(1971);
					match(WHITE_SPACE);
					}
					break;
				}
				setState(1974);
				function_declaration_parameters();
				}
				break;
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1975);
						match(WHITE_SPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1978); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1980);
				function_declaration_parameters();
				notifyErrorListeners("Missing comma after each parameter");
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

	public static class Void_functionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public TerminalNode VOID() { return getToken(MainParser.VOID, 0); }
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public Void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterVoid_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitVoid_function(this);
		}
	}

	public final Void_functionContext void_function() throws RecognitionException {
		Void_functionContext _localctx = new Void_functionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_void_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			match(FUNC);
			setState(1986);
			match(WHITE_SPACE);
			setState(1987);
			match(VOID);
			setState(1988);
			match(WHITE_SPACE);
			setState(1989);
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

	public static class Non_void_functionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(MainParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(MainParser.CLOSE_BRACE, 0); }
		public Non_void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNon_void_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNon_void_function(this);
		}
	}

	public final Non_void_functionContext non_void_function() throws RecognitionException {
		Non_void_functionContext _localctx = new Non_void_functionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_non_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			match(FUNC);
			setState(1992);
			match(WHITE_SPACE);
			setState(1993);
			variable_type();
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1994);
				match(OPEN_BRACE);
				setState(1995);
				match(CLOSE_BRACE);
				}
			}

			setState(1998);
			match(WHITE_SPACE);
			setState(1999);
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

	public static class Error_functionContext extends ParserRuleContext {
		public Error_function_headContext error_function_head() {
			return getRuleContext(Error_function_headContext.class,0);
		}
		public Function_structureContext function_structure() {
			return getRuleContext(Function_structureContext.class,0);
		}
		public Error_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterError_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitError_function(this);
		}
	}

	public final Error_functionContext error_function() throws RecognitionException {
		Error_functionContext _localctx = new Error_functionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_error_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			error_function_head();
			setState(2002);
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

	public static class Error_function_headContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MainParser.FUNC, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(MainParser.WHITE_SPACE, 0); }
		public Error_function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterError_function_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitError_function_head(this);
		}
	}

	public final Error_function_headContext error_function_head() throws RecognitionException {
		Error_function_headContext _localctx = new Error_function_headContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_error_function_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(FUNC);
			setState(2005);
			match(WHITE_SPACE);
			notifyErrorListeners("Missing datatype after func");
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
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
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
		enterRule(_localctx, 164, RULE_scoping_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			match(OPEN_BRACKET);
			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(2009);
				match(WHITE_SPACE);
				}
				}
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2016); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2015);
				statements();
				}
				}
				setState(2018); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(2023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(2020);
				match(WHITE_SPACE);
				}
				}
				setState(2025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2026);
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

	public static class Main_functionContext extends ParserRuleContext {
		public Main_headContext main_head() {
			return getRuleContext(Main_headContext.class,0);
		}
		public Main_bodyContext main_body() {
			return getRuleContext(Main_bodyContext.class,0);
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
		enterRule(_localctx, 166, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			main_head();
			setState(2029);
			main_body();
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

	public static class Main_headContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MainParser.MAIN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MainParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MainParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public Main_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_head(this);
		}
	}

	public final Main_headContext main_head() throws RecognitionException {
		Main_headContext _localctx = new Main_headContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_main_head);
		int _la;
		try {
			int _alt;
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				match(MAIN);
				setState(2032);
				match(OPEN_PAREN);
				setState(2033);
				match(CLOSE_PAREN);
				setState(2037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2034);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(2039);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2040);
				match(MAIN);
				setState(2042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(2041);
					match(OPEN_PAREN);
					}
				}

				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAREN) {
					{
					setState(2044);
					match(CLOSE_PAREN);
					}
				}

				setState(2050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2047);
						match(WHITE_SPACE);
						}
						} 
					}
					setState(2052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
				}
				notifyErrorListeners("Missing parenthesis");
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

	public static class Main_bodyContext extends ParserRuleContext {
		public Main_body_firstContext main_body_first() {
			return getRuleContext(Main_body_firstContext.class,0);
		}
		public Main_body_secondContext main_body_second() {
			return getRuleContext(Main_body_secondContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(MainParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(MainParser.WHITE_SPACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Main_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_body(this);
		}
	}

	public final Main_bodyContext main_body() throws RecognitionException {
		Main_bodyContext _localctx = new Main_bodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			main_body_first();
			setState(2060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(2057);
				match(WHITE_SPACE);
				}
				}
				setState(2062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2064); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2063);
				statements();
				}
				}
				setState(2066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CREATE) | (1L << CONSTANT) | (1L << RETURN) | (1L << PRINT) | (1L << SCAN) | (1L << VOID) | (1L << FUNC) | (1L << MAIN) | (1L << IF) | (1L << ELSE) | (1L << ELSE_IF) | (1L << THEN) | (1L << FOR) | (1L << UP_TO) | (1L << DOWN_TO) | (1L << WHILE) | (1L << INT_DEC) | (1L << BOOLEAN_DEC) | (1L << FLOAT_DEC) | (1L << STRING_DEC) | (1L << OPEN_BRACKET) | (1L << NOT) | (1L << ASSIGN) | (1L << EQUAL) | (1L << QUESTION) | (1L << COLON) | (1L << DOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << UNDERSCORE) | (1L << SINGLE_QUOTE) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << DIGIT) | (1L << LINECOMMENT))) != 0) );
			setState(2071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2068);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(2073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			}
			setState(2074);
			main_body_second();
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

	public static class Main_body_firstContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MainParser.OPEN_BRACKET, 0); }
		public Main_body_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_body_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_body_first(this);
		}
	}

	public final Main_body_firstContext main_body_first() throws RecognitionException {
		Main_body_firstContext _localctx = new Main_body_firstContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_main_body_first);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				match(OPEN_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing opening curly brackets");
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

	public static class Main_body_secondContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACKET() { return getToken(MainParser.CLOSE_BRACKET, 0); }
		public Main_body_secondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterMain_body_second(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitMain_body_second(this);
		}
	}

	public final Main_body_secondContext main_body_second() throws RecognitionException {
		Main_body_secondContext _localctx = new Main_body_secondContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_main_body_second);
		try {
			setState(2082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2080);
				match(CLOSE_BRACKET);
				}
				break;
			case EOF:
			case NEWLINE:
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Missing closing curly brackets");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 52:
			return comparison_statement_sempred((Comparison_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean comparison_statement_sempred(Comparison_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0827\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\5\2\u00b5\n\2\7\2\u00b7\n\2\f\2"+
		"\16\2\u00ba\13\2\3\2\3\2\7\2\u00be\n\2\f\2\16\2\u00c1\13\2\7\2\u00c3\n"+
		"\2\f\2\16\2\u00c6\13\2\3\2\7\2\u00c9\n\2\f\2\16\2\u00cc\13\2\3\2\3\2\7"+
		"\2\u00d0\n\2\f\2\16\2\u00d3\13\2\3\2\7\2\u00d6\n\2\f\2\16\2\u00d9\13\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\u00e4\n\4\r\4\16\4\u00e5\3\4"+
		"\3\4\3\5\5\5\u00eb\n\5\3\5\6\5\u00ee\n\5\r\5\16\5\u00ef\3\5\3\5\6\5\u00f4"+
		"\n\5\r\5\16\5\u00f5\3\5\5\5\u00f9\n\5\3\5\5\5\u00fc\n\5\3\5\6\5\u00ff"+
		"\n\5\r\5\16\5\u0100\5\5\u0103\n\5\3\6\7\6\u0106\n\6\f\6\16\6\u0109\13"+
		"\6\3\6\6\6\u010c\n\6\r\6\16\6\u010d\3\6\7\6\u0111\n\6\f\6\16\6\u0114\13"+
		"\6\3\6\7\6\u0117\n\6\f\6\16\6\u011a\13\6\3\6\7\6\u011d\n\6\f\6\16\6\u0120"+
		"\13\6\3\6\7\6\u0123\n\6\f\6\16\6\u0126\13\6\3\6\3\6\6\6\u012a\n\6\r\6"+
		"\16\6\u012b\3\6\7\6\u012f\n\6\f\6\16\6\u0132\13\6\3\6\7\6\u0135\n\6\f"+
		"\6\16\6\u0138\13\6\3\6\7\6\u013b\n\6\f\6\16\6\u013e\13\6\3\6\5\6\u0141"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0148\n\7\3\b\3\b\3\b\3\b\5\b\u014e\n\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\5\13\u0156\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16"+
		"\u015e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0168\n\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u0176"+
		"\n\25\f\25\16\25\u0179\13\25\3\25\5\25\u017c\n\25\3\25\7\25\u017f\n\25"+
		"\f\25\16\25\u0182\13\25\3\25\7\25\u0185\n\25\f\25\16\25\u0188\13\25\3"+
		"\25\3\25\7\25\u018c\n\25\f\25\16\25\u018f\13\25\3\25\5\25\u0192\n\25\3"+
		"\25\7\25\u0195\n\25\f\25\16\25\u0198\13\25\3\25\7\25\u019b\n\25\f\25\16"+
		"\25\u019e\13\25\3\25\3\25\3\25\7\25\u01a3\n\25\f\25\16\25\u01a6\13\25"+
		"\3\25\5\25\u01a9\n\25\3\25\7\25\u01ac\n\25\f\25\16\25\u01af\13\25\3\25"+
		"\7\25\u01b2\n\25\f\25\16\25\u01b5\13\25\3\25\3\25\7\25\u01b9\n\25\f\25"+
		"\16\25\u01bc\13\25\3\25\5\25\u01bf\n\25\3\25\7\25\u01c2\n\25\f\25\16\25"+
		"\u01c5\13\25\3\25\7\25\u01c8\n\25\f\25\16\25\u01cb\13\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u01d2\n\25\f\25\16\25\u01d5\13\25\3\25\5\25\u01d8\n\25"+
		"\3\25\7\25\u01db\n\25\f\25\16\25\u01de\13\25\3\25\7\25\u01e1\n\25\f\25"+
		"\16\25\u01e4\13\25\3\25\3\25\7\25\u01e8\n\25\f\25\16\25\u01eb\13\25\3"+
		"\25\5\25\u01ee\n\25\3\25\7\25\u01f1\n\25\f\25\16\25\u01f4\13\25\3\25\7"+
		"\25\u01f7\n\25\f\25\16\25\u01fa\13\25\3\25\3\25\3\25\3\25\3\25\7\25\u0201"+
		"\n\25\f\25\16\25\u0204\13\25\3\25\5\25\u0207\n\25\3\25\7\25\u020a\n\25"+
		"\f\25\16\25\u020d\13\25\3\25\7\25\u0210\n\25\f\25\16\25\u0213\13\25\3"+
		"\25\3\25\7\25\u0217\n\25\f\25\16\25\u021a\13\25\3\25\5\25\u021d\n\25\3"+
		"\25\7\25\u0220\n\25\f\25\16\25\u0223\13\25\3\25\7\25\u0226\n\25\f\25\16"+
		"\25\u0229\13\25\3\25\3\25\3\25\3\25\7\25\u022f\n\25\f\25\16\25\u0232\13"+
		"\25\3\25\5\25\u0235\n\25\3\25\7\25\u0238\n\25\f\25\16\25\u023b\13\25\3"+
		"\25\7\25\u023e\n\25\f\25\16\25\u0241\13\25\3\25\3\25\3\25\7\25\u0246\n"+
		"\25\f\25\16\25\u0249\13\25\3\25\5\25\u024c\n\25\3\25\7\25\u024f\n\25\f"+
		"\25\16\25\u0252\13\25\3\25\7\25\u0255\n\25\f\25\16\25\u0258\13\25\3\25"+
		"\3\25\7\25\u025c\n\25\f\25\16\25\u025f\13\25\3\25\5\25\u0262\n\25\3\25"+
		"\7\25\u0265\n\25\f\25\16\25\u0268\13\25\3\25\7\25\u026b\n\25\f\25\16\25"+
		"\u026e\13\25\3\25\3\25\3\25\3\25\7\25\u0274\n\25\f\25\16\25\u0277\13\25"+
		"\3\25\5\25\u027a\n\25\3\25\7\25\u027d\n\25\f\25\16\25\u0280\13\25\3\25"+
		"\7\25\u0283\n\25\f\25\16\25\u0286\13\25\3\25\3\25\3\25\7\25\u028b\n\25"+
		"\f\25\16\25\u028e\13\25\3\25\5\25\u0291\n\25\3\25\7\25\u0294\n\25\f\25"+
		"\16\25\u0297\13\25\3\25\7\25\u029a\n\25\f\25\16\25\u029d\13\25\3\25\3"+
		"\25\7\25\u02a1\n\25\f\25\16\25\u02a4\13\25\3\25\5\25\u02a7\n\25\3\25\7"+
		"\25\u02aa\n\25\f\25\16\25\u02ad\13\25\3\25\7\25\u02b0\n\25\f\25\16\25"+
		"\u02b3\13\25\3\25\3\25\3\25\5\25\u02b8\n\25\3\26\3\26\3\26\5\26\u02bd"+
		"\n\26\3\26\3\26\6\26\u02c1\n\26\r\26\16\26\u02c2\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u02cc\n\26\3\26\3\26\6\26\u02d0\n\26\r\26\16\26\u02d1"+
		"\3\26\3\26\3\26\3\26\5\26\u02d8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u02e0\n\27\3\30\3\30\5\30\u02e4\n\30\3\30\3\30\5\30\u02e8\n\30\3\30\5"+
		"\30\u02eb\n\30\3\30\3\30\5\30\u02ef\n\30\3\30\3\30\5\30\u02f3\n\30\3\30"+
		"\5\30\u02f6\n\30\3\30\3\30\3\30\3\30\5\30\u02fc\n\30\3\30\3\30\5\30\u0300"+
		"\n\30\3\30\5\30\u0303\n\30\3\30\3\30\5\30\u0307\n\30\3\31\3\31\3\31\3"+
		"\31\5\31\u030d\n\31\3\31\3\31\5\31\u0311\n\31\3\31\7\31\u0314\n\31\f\31"+
		"\16\31\u0317\13\31\3\32\3\32\5\32\u031b\n\32\3\32\3\32\5\32\u031f\n\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0325\n\32\3\32\3\32\5\32\u0329\n\32\3\32\3"+
		"\32\3\32\5\32\u032e\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0339\n\34\3\34\3\34\5\34\u033d\n\34\3\34\3\34\5\34\u0341\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u034e\n\35"+
		"\3\35\3\35\5\35\u0352\n\35\3\35\3\35\5\35\u0356\n\35\3\36\5\36\u0359\n"+
		"\36\3\36\3\36\5\36\u035d\n\36\3\36\3\36\5\36\u0361\n\36\3\36\3\36\5\36"+
		"\u0365\n\36\3\36\3\36\3\36\3\36\5\36\u036b\n\36\3\36\3\36\5\36\u036f\n"+
		"\36\3\36\3\36\5\36\u0373\n\36\3\36\5\36\u0376\n\36\3\36\3\36\5\36\u037a"+
		"\n\36\3\36\3\36\5\36\u037e\n\36\3\36\3\36\5\36\u0382\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u038a\n\37\3\37\3\37\5\37\u038e\n\37\3\37\5\37"+
		"\u0391\n\37\3\37\3\37\3\37\5\37\u0396\n\37\3\37\3\37\5\37\u039a\n\37\3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u03a6\n!\3!\3!\5!\u03aa\n!\3!\3!\5!\u03ae"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u03b6\n\"\r\"\16\"\u03b7\3#\3#\3#\6#\u03bd"+
		"\n#\r#\16#\u03be\3#\3#\3#\3#\5#\u03c5\n#\3#\3#\5#\u03c9\n#\3#\3#\5#\u03cd"+
		"\n#\7#\u03cf\n#\f#\16#\u03d2\13#\3#\3#\5#\u03d6\n#\3#\3#\5#\u03da\n#\3"+
		"#\3#\5#\u03de\n#\7#\u03e0\n#\f#\16#\u03e3\13#\3#\6#\u03e6\n#\r#\16#\u03e7"+
		"\3#\3#\5#\u03ec\n#\3$\3$\3$\3$\5$\u03f2\n$\3%\3%\3%\3%\3%\3%\3%\5%\u03fb"+
		"\n%\3%\3%\5%\u03ff\n%\3%\3%\5%\u0403\n%\3&\3&\5&\u0407\n&\3&\3&\5&\u040b"+
		"\n&\3&\3&\3&\3&\5&\u0411\n&\3&\5&\u0414\n&\3&\3&\3&\3&\5&\u041a\n&\3&"+
		"\5&\u041d\n&\3&\5&\u0420\n&\3&\3&\3&\5&\u0425\n&\3\'\3\'\3\'\5\'\u042a"+
		"\n\'\3\'\7\'\u042d\n\'\f\'\16\'\u0430\13\'\3\'\3\'\5\'\u0434\n\'\3(\3"+
		"(\3(\3(\6(\u043a\n(\r(\16(\u043b\3)\3)\3)\3)\5)\u0442\n)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\7+\u044f\n+\f+\16+\u0452\13+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u045d\n+\3,\3,\3,\3,\3,\5,\u0464\n,\3-\3-\3-\3-\5-\u046a\n-"+
		"\3-\3-\5-\u046e\n-\3-\3-\3-\6-\u0473\n-\r-\16-\u0474\3-\5-\u0478\n-\3"+
		"-\3-\5-\u047c\n-\3-\6-\u047f\n-\r-\16-\u0480\3-\3-\5-\u0485\n-\3-\3-\5"+
		"-\u0489\n-\3-\3-\5-\u048d\n-\3-\3-\3-\3-\5-\u0493\n-\3-\3-\6-\u0497\n"+
		"-\r-\16-\u0498\3-\5-\u049c\n-\3-\3-\3-\7-\u04a1\n-\f-\16-\u04a4\13-\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u04ad\n.\3.\3.\5.\u04b1\n.\3.\3.\5.\u04b5\n.\3"+
		"/\3/\3/\3/\5/\u04bb\n/\3\60\3\60\5\60\u04bf\n\60\3\60\3\60\3\61\3\61\5"+
		"\61\u04c5\n\61\3\62\3\62\5\62\u04c9\n\62\3\62\3\62\5\62\u04cd\n\62\3\62"+
		"\3\62\3\62\3\62\5\62\u04d3\n\62\3\62\3\62\5\62\u04d7\n\62\3\62\3\62\3"+
		"\62\3\62\5\62\u04dd\n\62\3\62\3\62\5\62\u04e1\n\62\3\62\6\62\u04e4\n\62"+
		"\r\62\16\62\u04e5\3\62\3\62\3\62\3\62\5\62\u04ec\n\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u04f4\n\62\6\62\u04f6\n\62\r\62\16\62\u04f7\3\62\5"+
		"\62\u04fb\n\62\3\62\3\62\3\62\5\62\u0500\n\62\3\63\3\63\5\63\u0504\n\63"+
		"\3\63\3\63\3\63\3\63\5\63\u050a\n\63\3\63\3\63\3\63\3\63\5\63\u0510\n"+
		"\63\6\63\u0512\n\63\r\63\16\63\u0513\3\63\3\63\3\63\3\63\7\63\u051a\n"+
		"\63\f\63\16\63\u051d\13\63\3\63\6\63\u0520\n\63\r\63\16\63\u0521\3\63"+
		"\5\63\u0525\n\63\3\63\3\63\3\63\3\63\5\63\u052b\n\63\3\64\3\64\5\64\u052f"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u0535\n\64\3\64\3\64\3\64\3\64\5\64\u053b"+
		"\n\64\6\64\u053d\n\64\r\64\16\64\u053e\3\64\3\64\3\64\3\64\7\64\u0545"+
		"\n\64\f\64\16\64\u0548\13\64\3\64\6\64\u054b\n\64\r\64\16\64\u054c\3\64"+
		"\5\64\u0550\n\64\3\64\3\64\3\64\3\64\5\64\u0556\n\64\3\65\3\65\3\65\5"+
		"\65\u055b\n\65\3\66\3\66\3\66\3\66\5\66\u0561\n\66\3\66\3\66\5\66\u0565"+
		"\n\66\3\66\3\66\5\66\u0569\n\66\3\66\3\66\5\66\u056d\n\66\3\66\3\66\5"+
		"\66\u0571\n\66\3\66\3\66\5\66\u0575\n\66\3\66\3\66\3\66\3\66\5\66\u057b"+
		"\n\66\3\66\3\66\6\66\u057f\n\66\r\66\16\66\u0580\3\66\5\66\u0584\n\66"+
		"\3\66\3\66\3\66\7\66\u0589\n\66\f\66\16\66\u058c\13\66\3\67\3\67\5\67"+
		"\u0590\n\67\3\67\3\67\5\67\u0594\n\67\3\67\3\67\5\67\u0598\n\67\3\67\3"+
		"\67\5\67\u059c\n\67\3\67\3\67\5\67\u05a0\n\67\3\67\3\67\5\67\u05a4\n\67"+
		"\3\67\3\67\5\67\u05a8\n\67\38\38\38\38\58\u05ae\n8\39\39\59\u05b2\n9\3"+
		"9\39\59\u05b6\n9\79\u05b8\n9\f9\169\u05bb\139\39\39\79\u05bf\n9\f9\16"+
		"9\u05c2\139\59\u05c4\n9\3:\3:\3:\3;\5;\u05ca\n;\3;\3;\5;\u05ce\n;\3;\5"+
		";\u05d1\n;\3;\7;\u05d4\n;\f;\16;\u05d7\13;\3;\5;\u05da\n;\3;\5;\u05dd"+
		"\n;\3;\5;\u05e0\n;\3;\5;\u05e3\n;\3;\7;\u05e6\n;\f;\16;\u05e9\13;\3;\5"+
		";\u05ec\n;\3<\3<\3<\3<\3<\3<\5<\u05f4\n<\3<\3<\5<\u05f8\n<\3<\3<\3<\5"+
		"<\u05fd\n<\3=\7=\u0600\n=\f=\16=\u0603\13=\3=\3=\7=\u0607\n=\f=\16=\u060a"+
		"\13=\3=\6=\u060d\n=\r=\16=\u060e\3=\7=\u0612\n=\f=\16=\u0615\13=\3=\3"+
		"=\3=\7=\u061a\n=\f=\16=\u061d\13=\3=\5=\u0620\n=\3=\7=\u0623\n=\f=\16"+
		"=\u0626\13=\3=\6=\u0629\n=\r=\16=\u062a\3=\7=\u062e\n=\f=\16=\u0631\13"+
		"=\3=\5=\u0634\n=\3=\3=\5=\u0638\n=\3>\3>\3>\3?\3?\3?\3@\3@\5@\u0642\n"+
		"@\3@\3@\5@\u0646\n@\3@\3@\3A\3A\5A\u064c\nA\3B\3B\3B\3B\3B\5B\u0653\n"+
		"B\3C\3C\5C\u0657\nC\3C\3C\5C\u065b\nC\3C\3C\7C\u065f\nC\fC\16C\u0662\13"+
		"C\3C\7C\u0665\nC\fC\16C\u0668\13C\3C\7C\u066b\nC\fC\16C\u066e\13C\3C\3"+
		"C\3C\3C\5C\u0674\nC\3C\3C\5C\u0678\nC\3C\3C\7C\u067c\nC\fC\16C\u067f\13"+
		"C\3C\7C\u0682\nC\fC\16C\u0685\13C\3C\7C\u0688\nC\fC\16C\u068b\13C\3C\3"+
		"C\3C\3C\5C\u0691\nC\3C\3C\5C\u0695\nC\3C\7C\u0698\nC\fC\16C\u069b\13C"+
		"\3C\7C\u069e\nC\fC\16C\u06a1\13C\3C\7C\u06a4\nC\fC\16C\u06a7\13C\3C\3"+
		"C\3C\5C\u06ac\nC\3D\3D\3D\5D\u06b1\nD\3D\3D\5D\u06b5\nD\3D\3D\5D\u06b9"+
		"\nD\3D\5D\u06bc\nD\3D\5D\u06bf\nD\3E\3E\3E\5E\u06c4\nE\3F\3F\5F\u06c8"+
		"\nF\3F\3F\5F\u06cc\nF\3F\3F\3G\3G\5G\u06d2\nG\3G\3G\5G\u06d6\nG\3G\3G"+
		"\3H\3H\3H\5H\u06dd\nH\3H\3H\3H\3H\3H\5H\u06e4\nH\3H\3H\3H\3H\5H\u06ea"+
		"\nH\3H\3H\3H\3H\3H\3H\5H\u06f2\nH\3H\3H\3H\5H\u06f7\nH\3H\3H\3H\5H\u06fc"+
		"\nH\3I\3I\5I\u0700\nI\3I\3I\5I\u0704\nI\3I\7I\u0707\nI\fI\16I\u070a\13"+
		"I\3I\3I\3I\7I\u070f\nI\fI\16I\u0712\13I\3I\3I\3I\3I\5I\u0718\nI\3I\3I"+
		"\6I\u071c\nI\rI\16I\u071d\3I\5I\u0721\nI\3I\7I\u0724\nI\fI\16I\u0727\13"+
		"I\3I\3I\5I\u072b\nI\3J\3J\3J\3J\3J\5J\u0732\nJ\3K\3K\3K\5K\u0737\nK\3"+
		"L\7L\u073a\nL\fL\16L\u073d\13L\3L\6L\u0740\nL\rL\16L\u0741\3L\7L\u0745"+
		"\nL\fL\16L\u0748\13L\3L\7L\u074b\nL\fL\16L\u074e\13L\3L\7L\u0751\nL\f"+
		"L\16L\u0754\13L\3L\7L\u0757\nL\fL\16L\u075a\13L\3L\3L\6L\u075e\nL\rL\16"+
		"L\u075f\3L\7L\u0763\nL\fL\16L\u0766\13L\3L\7L\u0769\nL\fL\16L\u076c\13"+
		"L\3L\7L\u076f\nL\fL\16L\u0772\13L\3L\5L\u0775\nL\3M\3M\3M\5M\u077a\nM"+
		"\3M\3M\5M\u077e\nM\3M\3M\7M\u0782\nM\fM\16M\u0785\13M\3M\6M\u0788\nM\r"+
		"M\16M\u0789\3M\7M\u078d\nM\fM\16M\u0790\13M\3M\3M\7M\u0794\nM\fM\16M\u0797"+
		"\13M\3N\3N\3N\5N\u079c\nN\3N\3N\3N\5N\u07a1\nN\3N\5N\u07a4\nN\3N\3N\5"+
		"N\u07a8\nN\3N\5N\u07ab\nN\3N\3N\5N\u07af\nN\3N\3N\5N\u07b3\nN\3O\3O\5"+
		"O\u07b7\nO\3O\3O\6O\u07bb\nO\rO\16O\u07bc\3O\3O\3O\5O\u07c2\nO\3P\3P\3"+
		"P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\5Q\u07cf\nQ\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3"+
		"T\3T\7T\u07dd\nT\fT\16T\u07e0\13T\3T\6T\u07e3\nT\rT\16T\u07e4\3T\7T\u07e8"+
		"\nT\fT\16T\u07eb\13T\3T\3T\3U\3U\3U\3V\3V\3V\3V\7V\u07f6\nV\fV\16V\u07f9"+
		"\13V\3V\3V\5V\u07fd\nV\3V\5V\u0800\nV\3V\7V\u0803\nV\fV\16V\u0806\13V"+
		"\3V\5V\u0809\nV\3W\3W\7W\u080d\nW\fW\16W\u0810\13W\3W\6W\u0813\nW\rW\16"+
		"W\u0814\3W\7W\u0818\nW\fW\16W\u081b\13W\3W\3W\3X\3X\5X\u0821\nX\3Y\3Y"+
		"\5Y\u0825\nY\3Y\2\4XjZ\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\16\3\2\25\30"+
		"\5\2\4\4\62\62\64\65\3\2%\'\3\2#$\3\2()\3\2\37\"\3\2\5\f\3\2\r\20\3\2"+
		"\21\24\3\2*\63\3\2\31\36\4\2\67\6799\2\u097e\2\u00b8\3\2\2\2\4\u00dc\3"+
		"\2\2\2\6\u00de\3\2\2\2\b\u0102\3\2\2\2\n\u0140\3\2\2\2\f\u0147\3\2\2\2"+
		"\16\u014d\3\2\2\2\20\u014f\3\2\2\2\22\u0151\3\2\2\2\24\u0155\3\2\2\2\26"+
		"\u0157\3\2\2\2\30\u0159\3\2\2\2\32\u015d\3\2\2\2\34\u0167\3\2\2\2\36\u0169"+
		"\3\2\2\2 \u016b\3\2\2\2\"\u016d\3\2\2\2$\u016f\3\2\2\2&\u0171\3\2\2\2"+
		"(\u02b7\3\2\2\2*\u02d7\3\2\2\2,\u02df\3\2\2\2.\u0306\3\2\2\2\60\u0308"+
		"\3\2\2\2\62\u032d\3\2\2\2\64\u032f\3\2\2\2\66\u0340\3\2\2\28\u0355\3\2"+
		"\2\2:\u0381\3\2\2\2<\u0399\3\2\2\2>\u039b\3\2\2\2@\u03ad\3\2\2\2B\u03b5"+
		"\3\2\2\2D\u03eb\3\2\2\2F\u03f1\3\2\2\2H\u0402\3\2\2\2J\u0424\3\2\2\2L"+
		"\u0433\3\2\2\2N\u0439\3\2\2\2P\u0441\3\2\2\2R\u0443\3\2\2\2T\u045c\3\2"+
		"\2\2V\u0463\3\2\2\2X\u0484\3\2\2\2Z\u04b4\3\2\2\2\\\u04ba\3\2\2\2^\u04bc"+
		"\3\2\2\2`\u04c4\3\2\2\2b\u04ff\3\2\2\2d\u052a\3\2\2\2f\u0555\3\2\2\2h"+
		"\u055a\3\2\2\2j\u056c\3\2\2\2l\u05a7\3\2\2\2n\u05ad\3\2\2\2p\u05af\3\2"+
		"\2\2r\u05c5\3\2\2\2t\u05eb\3\2\2\2v\u05fc\3\2\2\2x\u0637\3\2\2\2z\u0639"+
		"\3\2\2\2|\u063c\3\2\2\2~\u063f\3\2\2\2\u0080\u064b\3\2\2\2\u0082\u0652"+
		"\3\2\2\2\u0084\u06ab\3\2\2\2\u0086\u06be\3\2\2\2\u0088\u06c3\3\2\2\2\u008a"+
		"\u06c5\3\2\2\2\u008c\u06cf\3\2\2\2\u008e\u06fb\3\2\2\2\u0090\u072a\3\2"+
		"\2\2\u0092\u0731\3\2\2\2\u0094\u0736\3\2\2\2\u0096\u0774\3\2\2\2\u0098"+
		"\u0776\3\2\2\2\u009a\u07b2\3\2\2\2\u009c\u07c1\3\2\2\2\u009e\u07c3\3\2"+
		"\2\2\u00a0\u07c9\3\2\2\2\u00a2\u07d3\3\2\2\2\u00a4\u07d6\3\2\2\2\u00a6"+
		"\u07da\3\2\2\2\u00a8\u07ee\3\2\2\2\u00aa\u0808\3\2\2\2\u00ac\u080a\3\2"+
		"\2\2\u00ae\u0820\3\2\2\2\u00b0\u0824\3\2\2\2\u00b2\u00b4\78\2\2\u00b3"+
		"\u00b5\7\67\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3"+
		"\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00c4\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\5\u0094"+
		"K\2\u00bc\u00be\79\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00bb\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\79\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\5\u00a8U\2\u00ce"+
		"\u00d0\7\67\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\79\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7\2\2\3\u00db\3\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\5\3\2\2\2\u00de"+
		"\u00e3\7\3\2\2\u00df\u00e4\7\66\2\2\u00e0\u00e4\5\34\17\2\u00e1\u00e4"+
		"\5\n\6\2\u00e2\u00e4\79\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8"+
		"\7\3\2\2\2\u00e9\u00eb\7$\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00ed\3\2\2\2\u00ec\u00ee\7\66\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\7/\2\2\u00f2\u00f4\7\66\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f9\7\4\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0103\3\2"+
		"\2\2\u00fa\u00fc\7$\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00ff\7\66\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00ea\3\2\2\2\u0102\u00fb\3\2\2\2\u0103\t\3\2\2\2\u0104\u0106\5\f\7\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\t\3\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0112\3\2\2\2\u010f\u0111\7\66\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0118\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5\f\7\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011e\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011d\5\n\6\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0141\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5\f\7\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0129\7\66\2\2\u0128\u012a\t\3\2\2\u0129"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u0130\3\2\2\2\u012d\u012f\7\66\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0136\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133\u0135\5\f\7\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013c\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5\n\6\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0141\b\6\1\2\u0140\u0107\3\2\2\2\u0140"+
		"\u0124\3\2\2\2\u0141\13\3\2\2\2\u0142\u0148\5\36\20\2\u0143\u0148\5 \21"+
		"\2\u0144\u0148\5\"\22\2\u0145\u0148\5\4\3\2\u0146\u0148\5$\23\2\u0147"+
		"\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0146\3\2\2\2\u0148\r\3\2\2\2\u0149\u014e\5\36\20\2\u014a\u014e"+
		"\5 \21\2\u014b\u014e\5\"\22\2\u014c\u014e\5\4\3\2\u014d\u0149\3\2\2\2"+
		"\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\17"+
		"\3\2\2\2\u014f\u0150\t\4\2\2\u0150\21\3\2\2\2\u0151\u0152\t\5\2\2\u0152"+
		"\23\3\2\2\2\u0153\u0156\5\20\t\2\u0154\u0156\5\22\n\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0154\3\2\2\2\u0156\25\3\2\2\2\u0157\u0158\t\6\2\2\u0158\27"+
		"\3\2\2\2\u0159\u015a\t\7\2\2\u015a\31\3\2\2\2\u015b\u015e\5\26\f\2\u015c"+
		"\u015e\5\30\r\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\33\3\2\2"+
		"\2\u015f\u0168\5\36\20\2\u0160\u0168\5 \21\2\u0161\u0168\5\"\22\2\u0162"+
		"\u0168\5$\23\2\u0163\u0168\5&\24\2\u0164\u0168\5\32\16\2\u0165\u0168\5"+
		"\24\13\2\u0166\u0168\5\4\3\2\u0167\u015f\3\2\2\2\u0167\u0160\3\2\2\2\u0167"+
		"\u0161\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\35\3\2\2\2\u0169\u016a"+
		"\t\b\2\2\u016a\37\3\2\2\2\u016b\u016c\t\t\2\2\u016c!\3\2\2\2\u016d\u016e"+
		"\t\n\2\2\u016e#\3\2\2\2\u016f\u0170\t\13\2\2\u0170%\3\2\2\2\u0171\u0172"+
		"\t\f\2\2\u0172\'\3\2\2\2\u0173\u0177\5p9\2\u0174\u0176\79\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\78\2\2\u017b\u017a\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017f\79\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0186\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7\67\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u02b8\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018d\5\u0080A\2\u018a"+
		"\u018c\79\2\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0192\78\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2"+
		"\2\2\u0193\u0195\79\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019c\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0199\u019b\7\67\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u02b8\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u01a0\5@!\2\u01a0\u01a4\7\60\2\2\u01a1\u01a3\79\2\2\u01a2\u01a1"+
		"\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\78\2\2\u01a8\u01a7\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ac\79\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01b3\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\7\67\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u02b8\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\5@!\2\u01b7\u01b9"+
		"\79\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\78"+
		"\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c3\3\2\2\2\u01c0"+
		"\u01c2\79\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c9\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c8\7\67\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3"+
		"\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01cd\b\25\1\2\u01cd\u02b8\3\2\2\2\u01ce\u01cf\5H%\2\u01cf\u01d3\7\60"+
		"\2\2\u01d0\u01d2\79\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01d8\78\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01dc\3\2\2\2\u01d9\u01db\79\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e2\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e1\7\67\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3"+
		"\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u02b8\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e9\5H%\2\u01e6\u01e8\79\2\2\u01e7\u01e6\3\2\2"+
		"\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\78\2\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01f1\79\2\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f8\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\7\67\2\2\u01f6\u01f5\3"+
		"\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\b\25\1\2\u01fc\u02b8\3"+
		"\2\2\2\u01fd\u01fe\5T+\2\u01fe\u0202\7\60\2\2\u01ff\u0201\79\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0207\78\2\2\u0206"+
		"\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020b\3\2\2\2\u0208\u020a\79"+
		"\2\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u0211\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0210\7\67"+
		"\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u02b8\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0218\5T"+
		"+\2\u0215\u0217\79\2\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216"+
		"\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021b"+
		"\u021d\78\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0221\3\2"+
		"\2\2\u021e\u0220\79\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0227\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0224\u0226\7\67\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022b\b\25\1\2\u022b\u02b8\3\2\2\2\u022c\u0230\5R*\2\u022d"+
		"\u022f\79\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0235\78\2\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0239\3\2"+
		"\2\2\u0236\u0238\79\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023f\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u023e\7\67\2\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u02b8\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0242\u0243\5*\26\2\u0243\u0247\7\60\2\2\u0244\u0246\79\2\2\u0245"+
		"\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\78\2\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0250\3\2\2\2\u024d\u024f\79"+
		"\2\2\u024e\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0256\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0255\7\67"+
		"\2\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u02b8\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025d\5*"+
		"\26\2\u025a\u025c\79\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2"+
		"\2\2\u0260\u0262\78\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0266\3\2\2\2\u0263\u0265\79\2\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026c\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026b\7\67\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3"+
		"\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0270\b\25\1\2\u0270\u02b8\3\2\2\2\u0271\u0275\5"+
		"\u00a6T\2\u0272\u0274\79\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u027a\78\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027e\3\2\2\2\u027b\u027d\79\2\2\u027c\u027b\3\2\2\2\u027d\u0280\3\2"+
		"\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0284\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0283\7\67\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3"+
		"\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u02b8\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0287\u0288\5\u008eH\2\u0288\u028c\7\60\2\2\u0289\u028b"+
		"\79\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\78"+
		"\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0295\3\2\2\2\u0292"+
		"\u0294\79\2\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u029b\3\2\2\2\u0297\u0295\3\2\2\2\u0298"+
		"\u029a\7\67\2\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3"+
		"\2\2\2\u029b\u029c\3\2\2\2\u029c\u02b8\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"\u02a2\5\u008eH\2\u029f\u02a1\79\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a4\3"+
		"\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a7\78\2\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02ab\3\2\2\2\u02a8\u02aa\79\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b1\3\2"+
		"\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\7\67\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2"+
		"\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\b\25\1\2\u02b5\u02b8\3\2\2\2\u02b6"+
		"\u02b8\78\2\2\u02b7\u0173\3\2\2\2\u02b7\u0189\3\2\2\2\u02b7\u019f\3\2"+
		"\2\2\u02b7\u01b6\3\2\2\2\u02b7\u01ce\3\2\2\2\u02b7\u01e5\3\2\2\2\u02b7"+
		"\u01fd\3\2\2\2\u02b7\u0214\3\2\2\2\u02b7\u022c\3\2\2\2\u02b7\u0242\3\2"+
		"\2\2\u02b7\u0259\3\2\2\2\u02b7\u0271\3\2\2\2\u02b7\u0287\3\2\2\2\u02b7"+
		"\u029e\3\2\2\2\u02b7\u02b6\3\2\2\2\u02b8)\3\2\2\2\u02b9\u02d8\5\60\31"+
		"\2\u02ba\u02bd\5\n\6\2\u02bb\u02bd\5\4\3\2\u02bc\u02ba\3\2\2\2\u02bc\u02bb"+
		"\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\79\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02bc\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\5\60\31\2\u02c5\u02c6\b\26\1\2\u02c6"+
		"\u02d8\3\2\2\2\u02c7\u02d8\5\62\32\2\u02c8\u02d8\5<\37\2\u02c9\u02cc\5"+
		"\n\6\2\u02ca\u02cc\5\4\3\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\79\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cb\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d4\5<\37\2\u02d4\u02d5\b\26\1\2\u02d5\u02d8\3"+
		"\2\2\2\u02d6\u02d8\5> \2\u02d7\u02b9\3\2\2\2\u02d7\u02c0\3\2\2\2\u02d7"+
		"\u02c7\3\2\2\2\u02d7\u02c8\3\2\2\2\u02d7\u02cf\3\2\2\2\u02d7\u02d6\3\2"+
		"\2\2\u02d8+\3\2\2\2\u02d9\u02e0\5\6\4\2\u02da\u02e0\5\b\5\2\u02db\u02e0"+
		"\5\n\6\2\u02dc\u02e0\5X-\2\u02dd\u02e0\5j\66\2\u02de\u02e0\5\u008eH\2"+
		"\u02df\u02d9\3\2\2\2\u02df\u02da\3\2\2\2\u02df\u02db\3\2\2\2\u02df\u02dc"+
		"\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0-\3\2\2\2\u02e1"+
		"\u02ea\5\n\6\2\u02e2\u02e4\79\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\7+\2\2\u02e6\u02e8\79\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\5,\27\2\u02ea"+
		"\u02e3\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0307\3\2\2\2\u02ec\u02f5\5\4"+
		"\3\2\u02ed\u02ef\79\2\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\7+\2\2\u02f1\u02f3\79\2\2\u02f2\u02f1\3\2\2"+
		"\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\5,\27\2\u02f5\u02ee"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\b\30\1\2"+
		"\u02f8\u0307\3\2\2\2\u02f9\u0302\5\n\6\2\u02fa\u02fc\79\2\2\u02fb\u02fa"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7,\2\2\u02fe"+
		"\u0300\79\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0303\5,\27\2\u0302\u02fb\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\b\30\1\2\u0305\u0307\3\2\2\2\u0306\u02e1\3"+
		"\2\2\2\u0306\u02ec\3\2\2\2\u0306\u02f9\3\2\2\2\u0307/\3\2\2\2\u0308\u0309"+
		"\5\4\3\2\u0309\u030a\79\2\2\u030a\u0315\5.\30\2\u030b\u030d\79\2\2\u030c"+
		"\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\7\61"+
		"\2\2\u030f\u0311\79\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0314\5.\30\2\u0313\u030c\3\2\2\2\u0314\u0317\3\2"+
		"\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\61\3\2\2\2\u0317\u0315"+
		"\3\2\2\2\u0318\u031a\5\n\6\2\u0319\u031b\79\2\2\u031a\u0319\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\7+\2\2\u031d\u031f\79\2"+
		"\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321"+
		"\5,\27\2\u0321\u032e\3\2\2\2\u0322\u0324\5\n\6\2\u0323\u0325\79\2\2\u0324"+
		"\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\7,"+
		"\2\2\u0327\u0329\79\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032b\5,\27\2\u032b\u032c\b\32\1\2\u032c\u032e\3"+
		"\2\2\2\u032d\u0318\3\2\2\2\u032d\u0322\3\2\2\2\u032e\63\3\2\2\2\u032f"+
		"\u0330\5X-\2\u0330\65\3\2\2\2\u0331\u0332\5\n\6\2\u0332\u0333\7\35\2\2"+
		"\u0333\u0334\5\64\33\2\u0334\u0335\7\36\2\2\u0335\u0341\3\2\2\2\u0336"+
		"\u0338\5\n\6\2\u0337\u0339\7\35\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3"+
		"\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\5\64\33\2\u033b\u033d\7\36\2\2"+
		"\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f"+
		"\b\34\1\2\u033f\u0341\3\2\2\2\u0340\u0331\3\2\2\2\u0340\u0336\3\2\2\2"+
		"\u0341\67\3\2\2\2\u0342\u0343\7\5\2\2\u0343\u0344\79\2\2\u0344\u0345\5"+
		"\4\3\2\u0345\u0346\7\35\2\2\u0346\u0347\5\64\33\2\u0347\u0348\7\36\2\2"+
		"\u0348\u0356\3\2\2\2\u0349\u034a\7\5\2\2\u034a\u034b\79\2\2\u034b\u034d"+
		"\5\4\3\2\u034c\u034e\7\35\2\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2"+
		"\u034e\u034f\3\2\2\2\u034f\u0351\5\64\33\2\u0350\u0352\7\36\2\2\u0351"+
		"\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\b\35"+
		"\1\2\u0354\u0356\3\2\2\2\u0355\u0342\3\2\2\2\u0355\u0349\3\2\2\2\u0356"+
		"9\3\2\2\2\u0357\u0359\79\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035c\7+\2\2\u035b\u035d\79\2\2\u035c\u035b\3\2\2"+
		"\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0382\58\35\2\u035f\u0361"+
		"\79\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0364\7,\2\2\u0363\u0365\79\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2"+
		"\2\u0365\u0366\3\2\2\2\u0366\u0367\58\35\2\u0367\u0368\b\36\1\2\u0368"+
		"\u0382\3\2\2\2\u0369\u036b\79\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2"+
		"\2\2\u036b\u036c\3\2\2\2\u036c\u036e\7+\2\2\u036d\u036f\79\2\2\u036e\u036d"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u0373\5\66\34\2"+
		"\u0371\u0373\5,\27\2\u0372\u0370\3\2\2\2\u0372\u0371\3\2\2\2\u0373\u0382"+
		"\3\2\2\2\u0374\u0376\79\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u0379\7,\2\2\u0378\u037a\79\2\2\u0379\u0378\3\2\2"+
		"\2\u0379\u037a\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u037e\5\66\34\2\u037c"+
		"\u037e\5,\27\2\u037d\u037b\3\2\2\2\u037d\u037c\3\2\2\2\u037e\u037f\3\2"+
		"\2\2\u037f\u0380\b\36\1\2\u0380\u0382\3\2\2\2\u0381\u0358\3\2\2\2\u0381"+
		"\u0360\3\2\2\2\u0381\u036a\3\2\2\2\u0381\u0375\3\2\2\2\u0382;\3\2\2\2"+
		"\u0383\u0384\5\4\3\2\u0384\u0385\7\35\2\2\u0385\u0386\7\36\2\2\u0386\u0387"+
		"\79\2\2\u0387\u0389\5\n\6\2\u0388\u038a\5:\36\2\u0389\u0388\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u039a\3\2\2\2\u038b\u038d\5\4\3\2\u038c\u038e\7\35"+
		"\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f"+
		"\u0391\7\36\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3"+
		"\2\2\2\u0392\u0393\79\2\2\u0393\u0395\5\n\6\2\u0394\u0396\5:\36\2\u0395"+
		"\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\b\37"+
		"\1\2\u0398\u039a\3\2\2\2\u0399\u0383\3\2\2\2\u0399\u038b\3\2\2\2\u039a"+
		"=\3\2\2\2\u039b\u039c\5\66\34\2\u039c\u039d\5:\36\2\u039d?\3\2\2\2\u039e"+
		"\u039f\7\b\2\2\u039f\u03a0\7\31\2\2\u03a0\u03a1\5D#\2\u03a1\u03a2\7\32"+
		"\2\2\u03a2\u03ae\3\2\2\2\u03a3\u03a5\7\b\2\2\u03a4\u03a6\7\31\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\5D"+
		"#\2\u03a8\u03aa\7\32\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ac\b!\1\2\u03ac\u03ae\3\2\2\2\u03ad\u039e\3\2"+
		"\2\2\u03ad\u03a3\3\2\2\2\u03aeA\3\2\2\2\u03af\u03b6\5\f\7\2\u03b0\u03b6"+
		"\7\64\2\2\u03b1\u03b6\7\62\2\2\u03b2\u03b6\7\65\2\2\u03b3\u03b6\7\66\2"+
		"\2\u03b4\u03b6\7\4\2\2\u03b5\u03af\3\2\2\2\u03b5\u03b0\3\2\2\2\u03b5\u03b1"+
		"\3\2\2\2\u03b5\u03b2\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b4\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8C\3\2\2\2"+
		"\u03b9\u03bc\5B\"\2\u03ba\u03bb\79\2\2\u03bb\u03bd\5B\"\2\u03bc\u03ba"+
		"\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c1\b#\1\2\u03c1\u03ec\3\2\2\2\u03c2\u03d0\5F$"+
		"\2\u03c3\u03c5\79\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u03c8\7#\2\2\u03c7\u03c9\79\2\2\u03c8\u03c7\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\5F$\2\u03cb\u03cd\79\2"+
		"\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03c4"+
		"\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03ec\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03e1\5F$\2\u03d4\u03d6\79\2"+
		"\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9"+
		"\7#\2\2\u03d8\u03da\79\2\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dd\5F$\2\u03dc\u03de\79\2\2\u03dd\u03dc\3\2\2"+
		"\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03d5\3\2\2\2\u03e0\u03e3"+
		"\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e4\u03e6\7#\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03ea\b#\1\2\u03ea\u03ec\3\2\2\2\u03eb\u03b9\3\2\2\2\u03eb\u03c2\3\2"+
		"\2\2\u03eb\u03d3\3\2\2\2\u03ecE\3\2\2\2\u03ed\u03f2\5\6\4\2\u03ee\u03f2"+
		"\5\n\6\2\u03ef\u03f2\5X-\2\u03f0\u03f2\5\u008eH\2\u03f1\u03ed\3\2\2\2"+
		"\u03f1\u03ee\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2G\3"+
		"\2\2\2\u03f3\u03f4\7\t\2\2\u03f4\u03f5\7\31\2\2\u03f5\u03f6\5J&\2\u03f6"+
		"\u03f7\7\32\2\2\u03f7\u0403\3\2\2\2\u03f8\u03fa\7\t\2\2\u03f9\u03fb\7"+
		"\31\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fe\5J&\2\u03fd\u03ff\7\32\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2"+
		"\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\b%\1\2\u0401\u0403\3\2\2\2\u0402"+
		"\u03f3\3\2\2\2\u0402\u03f8\3\2\2\2\u0403I\3\2\2\2\u0404\u0406\5L\'\2\u0405"+
		"\u0407\79\2\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u040a\7\61\2\2\u0409\u040b\79\2\2\u040a\u0409\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\5P)\2\u040d\u0425\3\2\2"+
		"\2\u040e\u0410\5L\'\2\u040f\u0411\79\2\2\u0410\u040f\3\2\2\2\u0410\u0411"+
		"\3\2\2\2\u0411\u0413\3\2\2\2\u0412\u0414\7\61\2\2\u0413\u0412\3\2\2\2"+
		"\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\b&\1\2\u0416\u0425"+
		"\3\2\2\2\u0417\u0419\5L\'\2\u0418\u041a\79\2\2\u0419\u0418\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u041d\7\61\2\2\u041c\u041b\3"+
		"\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e\u0420\79\2\2\u041f"+
		"\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\5P"+
		")\2\u0422\u0423\b&\1\2\u0423\u0425\3\2\2\2\u0424\u0404\3\2\2\2\u0424\u040e"+
		"\3\2\2\2\u0424\u0417\3\2\2\2\u0425K\3\2\2\2\u0426\u0434\5\6\4\2\u0427"+
		"\u042a\5X-\2\u0428\u042a\5N(\2\u0429\u0427\3\2\2\2\u0429\u0428\3\2\2\2"+
		"\u042a\u042e\3\2\2\2\u042b\u042d\79\2\2\u042c\u042b\3\2\2\2\u042d\u0430"+
		"\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0431\u0432\b\'\1\2\u0432\u0434\3\2\2\2\u0433\u0426\3\2"+
		"\2\2\u0433\u0429\3\2\2\2\u0434M\3\2\2\2\u0435\u043a\7\66\2\2\u0436\u043a"+
		"\5\34\17\2\u0437\u043a\5\n\6\2\u0438\u043a\79\2\2\u0439\u0435\3\2\2\2"+
		"\u0439\u0436\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u0438\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043cO\3\2\2\2\u043d"+
		"\u0442\5\n\6\2\u043e\u043f\5\6\4\2\u043f\u0440\b)\1\2\u0440\u0442\3\2"+
		"\2\2\u0441\u043d\3\2\2\2\u0441\u043e\3\2\2\2\u0442Q\3\2\2\2\u0443\u0444"+
		"\7\6\2\2\u0444\u0445\79\2\2\u0445\u0446\5*\26\2\u0446S\3\2\2\2\u0447\u0448"+
		"\7\7\2\2\u0448\u0449\79\2\2\u0449\u045d\5V,\2\u044a\u044b\7\7\2\2\u044b"+
		"\u044c\79\2\2\u044c\u0450\5V,\2\u044d\u044f\79\2\2\u044e\u044d\3\2\2\2"+
		"\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453"+
		"\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0454\7\31\2\2\u0454\u0455\7\32\2\2"+
		"\u0455\u0456\b+\1\2\u0456\u045d\3\2\2\2\u0457\u0458\7\7\2\2\u0458\u0459"+
		"\79\2\2\u0459\u045a\5\4\3\2\u045a\u045b\b+\1\2\u045b\u045d\3\2\2\2\u045c"+
		"\u0447\3\2\2\2\u045c\u044a\3\2\2\2\u045c\u0457\3\2\2\2\u045dU\3\2\2\2"+
		"\u045e\u0464\5\6\4\2\u045f\u0464\5\b\5\2\u0460\u0464\5\n\6\2\u0461\u0464"+
		"\5X-\2\u0462\u0464\5\u008eH\2\u0463\u045e\3\2\2\2\u0463\u045f\3\2\2\2"+
		"\u0463\u0460\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0462\3\2\2\2\u0464W\3"+
		"\2\2\2\u0465\u0466\b-\1\2\u0466\u0485\5\\/\2\u0467\u0469\7\31\2\2\u0468"+
		"\u046a\79\2\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2"+
		"\2\2\u046b\u046d\5X-\2\u046c\u046e\79\2\2\u046d\u046c\3\2\2\2\u046d\u046e"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\32\2\2\u0470\u0485\3\2\2\2"+
		"\u0471\u0473\7\31\2\2\u0472\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0472"+
		"\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0478\79\2\2\u0477"+
		"\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\5X"+
		"-\2\u047a\u047c\79\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e"+
		"\3\2\2\2\u047d\u047f\7\32\2\2\u047e\u047d\3\2\2\2\u047f\u0480\3\2\2\2"+
		"\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483"+
		"\b-\1\2\u0483\u0485\3\2\2\2\u0484\u0465\3\2\2\2\u0484\u0467\3\2\2\2\u0484"+
		"\u0472\3\2\2\2\u0485\u04a2\3\2\2\2\u0486\u0488\f\6\2\2\u0487\u0489\79"+
		"\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u048c\5\24\13\2\u048b\u048d\79\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3"+
		"\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\5X-\7\u048f\u04a1\3\2\2\2\u0490"+
		"\u0492\f\5\2\2\u0491\u0493\79\2\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0494\3\2\2\2\u0494\u0496\5\24\13\2\u0495\u0497\5\24\13\2\u0496"+
		"\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2"+
		"\2\2\u0499\u049b\3\2\2\2\u049a\u049c\79\2\2\u049b\u049a\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\5X-\6\u049e\u049f\b-\1"+
		"\2\u049f\u04a1\3\2\2\2\u04a0\u0486\3\2\2\2\u04a0\u0490\3\2\2\2\u04a1\u04a4"+
		"\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3Y\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a5\u04a6\5\n\6\2\u04a6\u04a7\7\35\2\2\u04a7\u04a8\5"+
		"^\60\2\u04a8\u04a9\7\36\2\2\u04a9\u04b5\3\2\2\2\u04aa\u04ac\5\n\6\2\u04ab"+
		"\u04ad\7\35\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3"+
		"\2\2\2\u04ae\u04b0\5^\60\2\u04af\u04b1\7\36\2\2\u04b0\u04af\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\b.\1\2\u04b3\u04b5\3\2"+
		"\2\2\u04b4\u04a5\3\2\2\2\u04b4\u04aa\3\2\2\2\u04b5[\3\2\2\2\u04b6\u04bb"+
		"\5\b\5\2\u04b7\u04bb\5\n\6\2\u04b8\u04bb\5\u008eH\2\u04b9\u04bb\5Z.\2"+
		"\u04ba\u04b6\3\2\2\2\u04ba\u04b7\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04b9"+
		"\3\2\2\2\u04bb]\3\2\2\2\u04bc\u04be\5b\62\2\u04bd\u04bf\79\2\2\u04be\u04bd"+
		"\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\5`\61\2\u04c1"+
		"_\3\2\2\2\u04c2\u04c5\5d\63\2\u04c3\u04c5\5f\64\2\u04c4\u04c2\3\2\2\2"+
		"\u04c4\u04c3\3\2\2\2\u04c5a\3\2\2\2\u04c6\u04c8\7\31\2\2\u04c7\u04c9\7"+
		"9\2\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca"+
		"\u04cc\5^\60\2\u04cb\u04cd\79\2\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\7\32\2\2\u04cf\u0500\3\2\2\2\u04d0"+
		"\u04d2\7\31\2\2\u04d1\u04d3\79\2\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\5^\60\2\u04d5\u04d7\79\2\2\u04d6"+
		"\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\b\62"+
		"\1\2\u04d9\u0500\3\2\2\2\u04da\u04dc\7\31\2\2\u04db\u04dd\79\2\2\u04dc"+
		"\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\5^"+
		"\60\2\u04df\u04e1\79\2\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04e3\3\2\2\2\u04e2\u04e4\7\32\2\2\u04e3\u04e2\3\2\2\2\u04e4\u04e5\3"+
		"\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04e8\b\62\1\2\u04e8\u0500\3\2\2\2\u04e9\u04eb\5h\65\2\u04ea\u04ec\7"+
		"9\2\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ee\5`\61\2\u04ee\u0500\3\2\2\2\u04ef\u04f5\5h\65\2\u04f0\u04f3\79"+
		"\2\2\u04f1\u04f4\5h\65\2\u04f2\u04f4\5\6\4\2\u04f3\u04f1\3\2\2\2\u04f3"+
		"\u04f2\3\2\2\2\u04f4\u04f6\3\2\2\2\u04f5\u04f0\3\2\2\2\u04f6\u04f7\3\2"+
		"\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9"+
		"\u04fb\79\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2"+
		"\2\2\u04fc\u04fd\5`\61\2\u04fd\u04fe\b\62\1\2\u04fe\u0500\3\2\2\2\u04ff"+
		"\u04c6\3\2\2\2\u04ff\u04d0\3\2\2\2\u04ff\u04da\3\2\2\2\u04ff\u04e9\3\2"+
		"\2\2\u04ff\u04ef\3\2\2\2\u0500c\3\2\2\2\u0501\u0503\5\20\t\2\u0502\u0504"+
		"\79\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\5^\60\2\u0506\u052b\3\2\2\2\u0507\u0509\5\20\t\2\u0508\u050a\7"+
		"9\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u0511\5^\60\2\u050c\u050f\79\2\2\u050d\u0510\5h\65\2\u050e\u0510\5\6"+
		"\4\2\u050f\u050d\3\2\2\2\u050f\u050e\3\2\2\2\u0510\u0512\3\2\2\2\u0511"+
		"\u050c\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2"+
		"\2\2\u0514\u0515\3\2\2\2\u0515\u0516\b\63\1\2\u0516\u052b\3\2\2\2\u0517"+
		"\u051f\5\20\t\2\u0518\u051a\79\2\2\u0519\u0518\3\2\2\2\u051a\u051d\3\2"+
		"\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d"+
		"\u051b\3\2\2\2\u051e\u0520\5\24\13\2\u051f\u051b\3\2\2\2\u0520\u0521\3"+
		"\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523"+
		"\u0525\79\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2"+
		"\2\2\u0526\u0527\5^\60\2\u0527\u0528\b\63\1\2\u0528\u052b\3\2\2\2\u0529"+
		"\u052b\3\2\2\2\u052a\u0501\3\2\2\2\u052a\u0507\3\2\2\2\u052a\u0517\3\2"+
		"\2\2\u052a\u0529\3\2\2\2\u052be\3\2\2\2\u052c\u052e\5\22\n\2\u052d\u052f"+
		"\79\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0531\5^\60\2\u0531\u0556\3\2\2\2\u0532\u0534\5\22\n\2\u0533\u0535\7"+
		"9\2\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u053c\5^\60\2\u0537\u053a\79\2\2\u0538\u053b\5h\65\2\u0539\u053b\5\6"+
		"\4\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b\u053d\3\2\2\2\u053c"+
		"\u0537\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2"+
		"\2\2\u053f\u0540\3\2\2\2\u0540\u0541\b\64\1\2\u0541\u0556\3\2\2\2\u0542"+
		"\u054a\5\22\n\2\u0543\u0545\79\2\2\u0544\u0543\3\2\2\2\u0545\u0548\3\2"+
		"\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0549\u054b\5\24\13\2\u054a\u0546\3\2\2\2\u054b\u054c\3"+
		"\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f\3\2\2\2\u054e"+
		"\u0550\79\2\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2"+
		"\2\2\u0551\u0552\5^\60\2\u0552\u0553\b\64\1\2\u0553\u0556\3\2\2\2\u0554"+
		"\u0556\3\2\2\2\u0555\u052c\3\2\2\2\u0555\u0532\3\2\2\2\u0555\u0542\3\2"+
		"\2\2\u0555\u0554\3\2\2\2\u0556g\3\2\2\2\u0557\u055b\5\b\5\2\u0558\u055b"+
		"\5\n\6\2\u0559\u055b\5\u008eH\2\u055a\u0557\3\2\2\2\u055a\u0558\3\2\2"+
		"\2\u055a\u0559\3\2\2\2\u055bi\3\2\2\2\u055c\u055d\b\66\1\2\u055d\u056d"+
		"\5n8\2\u055e\u056d\5l\67\2\u055f\u0561\7*\2\2\u0560\u055f\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\7\31\2\2\u0563\u0565\7"+
		"9\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566"+
		"\u0568\5j\66\2\u0567\u0569\79\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2"+
		"\2\2\u0569\u056a\3\2\2\2\u056a\u056b\7\32\2\2\u056b\u056d\3\2\2\2\u056c"+
		"\u055c\3\2\2\2\u056c\u055e\3\2\2\2\u056c\u0560\3\2\2\2\u056d\u058a\3\2"+
		"\2\2\u056e\u0570\f\5\2\2\u056f\u0571\79\2\2\u0570\u056f\3\2\2\2\u0570"+
		"\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\5\32\16\2\u0573\u0575\7"+
		"9\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2\u0576"+
		"\u0577\5j\66\6\u0577\u0589\3\2\2\2\u0578\u057a\f\4\2\2\u0579\u057b\79"+
		"\2\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057e\5\32\16\2\u057d\u057f\5\32\16\2\u057e\u057d\3\2\2\2\u057f\u0580"+
		"\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582"+
		"\u0584\79\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2"+
		"\2\2\u0585\u0586\5j\66\5\u0586\u0587\b\66\1\2\u0587\u0589\3\2\2\2\u0588"+
		"\u056e\3\2\2\2\u0588\u0578\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2"+
		"\2\2\u058a\u058b\3\2\2\2\u058bk\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u058f"+
		"\5\n\6\2\u058e\u0590\79\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0591\3\2\2\2\u0591\u0593\7,\2\2\u0592\u0594\79\2\2\u0593\u0592\3\2\2"+
		"\2\u0593\u0594\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0598\5n8\2\u0596\u0598"+
		"\5\6\4\2\u0597\u0595\3\2\2\2\u0597\u0596\3\2\2\2\u0598\u05a8\3\2\2\2\u0599"+
		"\u059b\5\n\6\2\u059a\u059c\79\2\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2"+
		"\2\2\u059c\u059d\3\2\2\2\u059d\u059f\7+\2\2\u059e\u05a0\79\2\2\u059f\u059e"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u05a4\5n8\2\u05a2"+
		"\u05a4\5\6\4\2\u05a3\u05a1\3\2\2\2\u05a3\u05a2\3\2\2\2\u05a4\u05a5\3\2"+
		"\2\2\u05a5\u05a6\b\67\1\2\u05a6\u05a8\3\2\2\2\u05a7\u058d\3\2\2\2\u05a7"+
		"\u0599\3\2\2\2\u05a8m\3\2\2\2\u05a9\u05ae\5\n\6\2\u05aa\u05ae\5\b\5\2"+
		"\u05ab\u05ae\5X-\2\u05ac\u05ae\5\6\4\2\u05ad\u05a9\3\2\2\2\u05ad\u05aa"+
		"\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ac\3\2\2\2\u05aeo\3\2\2\2\u05af"+
		"\u05b1\5z>\2\u05b0\u05b2\t\r\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2"+
		"\2\u05b2\u05b9\3\2\2\2\u05b3\u05b5\5|?\2\u05b4\u05b6\t\r\2\2\u05b5\u05b4"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b3\3\2\2\2\u05b8"+
		"\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05c3\3\2"+
		"\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05c0\5~@\2\u05bd\u05bf\7\67\2\2\u05be"+
		"\u05bd\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2"+
		"\2\2\u05c1\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05bc\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4q\3\2\2\2\u05c5\u05c6\5v<\2\u05c6\u05c7\5x=\2\u05c7"+
		"s\3\2\2\2\u05c8\u05ca\79\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05cd\7\20\2\2\u05cc\u05ce\79\2\2\u05cd\u05cc\3\2"+
		"\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1\78\2\2\u05d0"+
		"\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d5\3\2\2\2\u05d2\u05d4\79"+
		"\2\2\u05d3\u05d2\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5"+
		"\u05d6\3\2\2\2\u05d6\u05ec\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8\u05da\79"+
		"\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db"+
		"\u05dd\7\20\2\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05df\3"+
		"\2\2\2\u05de\u05e0\79\2\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0"+
		"\u05e2\3\2\2\2\u05e1\u05e3\78\2\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2"+
		"\2\2\u05e3\u05e7\3\2\2\2\u05e4\u05e6\79\2\2\u05e5\u05e4\3\2\2\2\u05e6"+
		"\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ea\3\2"+
		"\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05ec\b;\1\2\u05eb\u05c9\3\2\2\2\u05eb"+
		"\u05d9\3\2\2\2\u05ecu\3\2\2\2\u05ed\u05ee\7\31\2\2\u05ee\u05ef\5j\66\2"+
		"\u05ef\u05f0\7\32\2\2\u05f0\u05f1\5t;\2\u05f1\u05fd\3\2\2\2\u05f2\u05f4"+
		"\7\31\2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\3\2\2\2"+
		"\u05f5\u05f7\5j\66\2\u05f6\u05f8\7\32\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\5t;\2\u05fa\u05fb\b<\1\2\u05fb"+
		"\u05fd\3\2\2\2\u05fc\u05ed\3\2\2\2\u05fc\u05f3\3\2\2\2\u05fdw\3\2\2\2"+
		"\u05fe\u0600\79\2\2\u05ff\u05fe\3\2\2\2\u0600\u0603\3\2\2\2\u0601\u05ff"+
		"\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603\u0601\3\2\2\2\u0604"+
		"\u0608\7\33\2\2\u0605\u0607\79\2\2\u0606\u0605\3\2\2\2\u0607\u060a\3\2"+
		"\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060c\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060b\u060d\5(\25\2\u060c\u060b\3\2\2\2\u060d\u060e\3\2"+
		"\2\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0613\3\2\2\2\u0610"+
		"\u0612\79\2\2\u0611\u0610\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2"+
		"\2\2\u0613\u0614\3\2\2\2\u0614\u0616\3\2\2\2\u0615\u0613\3\2\2\2\u0616"+
		"\u0617\7\34\2\2\u0617\u0638\3\2\2\2\u0618\u061a\79\2\2\u0619\u0618\3\2"+
		"\2\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c"+
		"\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u0620\7\33\2\2\u061f\u061e\3"+
		"\2\2\2\u061f\u0620\3\2\2\2\u0620\u0624\3\2\2\2\u0621\u0623\79\2\2\u0622"+
		"\u0621\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u0629\5(\25\2\u0628"+
		"\u0627\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2"+
		"\2\2\u062b\u062f\3\2\2\2\u062c\u062e\79\2\2\u062d\u062c\3\2\2\2\u062e"+
		"\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0633\3\2"+
		"\2\2\u0631\u062f\3\2\2\2\u0632\u0634\7\34\2\2\u0633\u0632\3\2\2\2\u0633"+
		"\u0634\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\b=\1\2\u0636\u0638\3\2"+
		"\2\2\u0637\u0601\3\2\2\2\u0637\u061b\3\2\2\2\u0638y\3\2\2\2\u0639\u063a"+
		"\7\r\2\2\u063a\u063b\5r:\2\u063b{\3\2\2\2\u063c\u063d\7\17\2\2\u063d\u063e"+
		"\5r:\2\u063e}\3\2\2\2\u063f\u0641\7\16\2\2\u0640\u0642\79\2\2\u0641\u0640"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0645\7\20\2\2"+
		"\u0644\u0646\79\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647"+
		"\3\2\2\2\u0647\u0648\5x=\2\u0648\177\3\2\2\2\u0649\u064c\5\u008aF\2\u064a"+
		"\u064c\5\u008cG\2\u064b\u0649\3\2\2\2\u064b\u064a\3\2\2\2\u064c\u0081"+
		"\3\2\2\2\u064d\u0653\7\22\2\2\u064e\u0653\7\23\2\2\u064f\u0650\5\n\6\2"+
		"\u0650\u0651\bB\1\2\u0651\u0653\3\2\2\2\u0652\u064d\3\2\2\2\u0652\u064e"+
		"\3\2\2\2\u0652\u064f\3\2\2\2\u0653\u0083\3\2\2\2\u0654\u0656\5\u0082B"+
		"\2\u0655\u0657\79\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658"+
		"\3\2\2\2\u0658\u065a\5X-\2\u0659\u065b\79\2\2\u065a\u0659\3\2\2\2\u065a"+
		"\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u0660\7\33\2\2\u065d\u065f\7"+
		"9\2\2\u065e\u065d\3\2\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660"+
		"\u0661\3\2\2\2\u0661\u0666\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0665\5("+
		"\25\2\u0664\u0663\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666"+
		"\u0667\3\2\2\2\u0667\u066c\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u066b\79"+
		"\2\2\u066a\u0669\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066c"+
		"\u066d\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u066c\3\2\2\2\u066f\u0670\7\34"+
		"\2\2\u0670\u06ac\3\2\2\2\u0671\u0673\5\u0082B\2\u0672\u0674\79\2\2\u0673"+
		"\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\5X"+
		"-\2\u0676\u0678\79\2\2\u0677\u0676\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679"+
		"\3\2\2\2\u0679\u067d\7\33\2\2\u067a\u067c\79\2\2\u067b\u067a\3\2\2\2\u067c"+
		"\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0683\3\2"+
		"\2\2\u067f\u067d\3\2\2\2\u0680\u0682\5(\25\2\u0681\u0680\3\2\2\2\u0682"+
		"\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0689\3\2"+
		"\2\2\u0685\u0683\3\2\2\2\u0686\u0688\79\2\2\u0687\u0686\3\2\2\2\u0688"+
		"\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2"+
		"\2\2\u068b\u0689\3\2\2\2\u068c\u068d\bC\1\2\u068d\u06ac\3\2\2\2\u068e"+
		"\u0690\5\u0082B\2\u068f\u0691\79\2\2\u0690\u068f\3\2\2\2\u0690\u0691\3"+
		"\2\2\2\u0691\u0692\3\2\2\2\u0692\u0694\5X-\2\u0693\u0695\79\2\2\u0694"+
		"\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0699\3\2\2\2\u0696\u0698\79"+
		"\2\2\u0697\u0696\3\2\2\2\u0698\u069b\3\2\2\2\u0699\u0697\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u069f\3\2\2\2\u069b\u0699\3\2\2\2\u069c\u069e\5("+
		"\25\2\u069d\u069c\3\2\2\2\u069e\u06a1\3\2\2\2\u069f\u069d\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a5\3\2\2\2\u06a1\u069f\3\2\2\2\u06a2\u06a4\79"+
		"\2\2\u06a3\u06a2\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5"+
		"\u06a6\3\2\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a8\u06a9\7\34"+
		"\2\2\u06a9\u06aa\bC\1\2\u06aa\u06ac\3\2\2\2\u06ab\u0654\3\2\2\2\u06ab"+
		"\u0671\3\2\2\2\u06ab\u068e\3\2\2\2\u06ac\u0085\3\2\2\2\u06ad\u06ae\5\4"+
		"\3\2\u06ae\u06af\79\2\2\u06af\u06b1\3\2\2\2\u06b0\u06ad\3\2\2\2\u06b0"+
		"\u06b1\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\5\n\6\2\u06b3\u06b5\79"+
		"\2\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06bb\3\2\2\2\u06b6"+
		"\u06b8\7+\2\2\u06b7\u06b9\79\2\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2"+
		"\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc\5\u0088E\2\u06bb\u06b6\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06bf\3\2\2\2\u06bd\u06bf\5X-\2\u06be\u06b0\3\2\2"+
		"\2\u06be\u06bd\3\2\2\2\u06bf\u0087\3\2\2\2\u06c0\u06c4\5\b\5\2\u06c1\u06c4"+
		"\5\n\6\2\u06c2\u06c4\5X-\2\u06c3\u06c0\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3"+
		"\u06c2\3\2\2\2\u06c4\u0089\3\2\2\2\u06c5\u06c7\7\24\2\2\u06c6\u06c8\7"+
		"9\2\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06cb\5X-\2\u06ca\u06cc\79\2\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2"+
		"\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\5\u0084C\2\u06ce\u008b\3\2\2\2\u06cf"+
		"\u06d1\7\21\2\2\u06d0\u06d2\79\2\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2"+
		"\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\5\u0086D\2\u06d4\u06d6\79\2\2\u06d5"+
		"\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\5\u0084"+
		"C\2\u06d8\u008d\3\2\2\2\u06d9\u06da\5\n\6\2\u06da\u06dc\7\31\2\2\u06db"+
		"\u06dd\5\u0090I\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de"+
		"\3\2\2\2\u06de\u06df\7\32\2\2\u06df\u06fc\3\2\2\2\u06e0\u06e1\5\n\6\2"+
		"\u06e1\u06e3\7\31\2\2\u06e2\u06e4\5\u0090I\2\u06e3\u06e2\3\2\2\2\u06e3"+
		"\u06e4\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\bH\1\2\u06e6\u06fc\3\2"+
		"\2\2\u06e7\u06e9\5\n\6\2\u06e8\u06ea\5\u0090I\2\u06e9\u06e8\3\2\2\2\u06e9"+
		"\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\7\32\2\2\u06ec\u06ed\b"+
		"H\1\2\u06ed\u06fc\3\2\2\2\u06ee\u06ef\5\n\6\2\u06ef\u06f1\7\31\2\2\u06f0"+
		"\u06f2\5\u0090I\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3"+
		"\3\2\2\2\u06f3\u06f4\7\32\2\2\u06f4\u06f6\7\31\2\2\u06f5\u06f7\5\u0090"+
		"I\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8"+
		"\u06f9\7\32\2\2\u06f9\u06fa\bH\1\2\u06fa\u06fc\3\2\2\2\u06fb\u06d9\3\2"+
		"\2\2\u06fb\u06e0\3\2\2\2\u06fb\u06e7\3\2\2\2\u06fb\u06ee\3\2\2\2\u06fc"+
		"\u008f\3\2\2\2\u06fd\u0708\5\u0092J\2\u06fe\u0700\79\2\2\u06ff\u06fe\3"+
		"\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0703\7\61\2\2\u0702"+
		"\u0704\79\2\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\3\2"+
		"\2\2\u0705\u0707\5\u0092J\2\u0706\u06ff\3\2\2\2\u0707\u070a\3\2\2\2\u0708"+
		"\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u072b\3\2\2\2\u070a\u0708\3\2"+
		"\2\2\u070b\u0710\5\u0092J\2\u070c\u070d\79\2\2\u070d\u070f\5\u0092J\2"+
		"\u070e\u070c\3\2\2\2\u070f\u0712\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711"+
		"\3\2\2\2\u0711\u0713\3\2\2\2\u0712\u0710\3\2\2\2\u0713\u0714\bI\1\2\u0714"+
		"\u072b\3\2\2\2\u0715\u0725\5\u0092J\2\u0716\u0718\79\2\2\u0717\u0716\3"+
		"\2\2\2\u0717\u0718\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b\7\61\2\2\u071a"+
		"\u071c\7\61\2\2\u071b\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u071b\3"+
		"\2\2\2\u071d\u071e\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u0721\79\2\2\u0720"+
		"\u071f\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0724\5\u0092"+
		"J\2\u0723\u0717\3\2\2\2\u0724\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725"+
		"\u0726\3\2\2\2\u0726\u0728\3\2\2\2\u0727\u0725\3\2\2\2\u0728\u0729\bI"+
		"\1\2\u0729\u072b\3\2\2\2\u072a\u06fd\3\2\2\2\u072a\u070b\3\2\2\2\u072a"+
		"\u0715\3\2\2\2\u072b\u0091\3\2\2\2\u072c\u0732\5\n\6\2\u072d\u0732\5X"+
		"-\2\u072e\u0732\5\6\4\2\u072f\u0732\5\b\5\2\u0730\u0732\5\u008eH\2\u0731"+
		"\u072c\3\2\2\2\u0731\u072d\3\2\2\2\u0731\u072e\3\2\2\2\u0731\u072f\3\2"+
		"\2\2\u0731\u0730\3\2\2\2\u0732\u0093\3\2\2\2\u0733\u0737\5\u009eP\2\u0734"+
		"\u0737\5\u00a0Q\2\u0735\u0737\5\u00a2R\2\u0736\u0733\3\2\2\2\u0736\u0734"+
		"\3\2\2\2\u0736\u0735\3\2\2\2\u0737\u0095\3\2\2\2\u0738\u073a\5\16\b\2"+
		"\u0739\u0738\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c"+
		"\3\2\2\2\u073c\u073f\3\2\2\2\u073d\u073b\3\2\2\2\u073e\u0740\t\3\2\2\u073f"+
		"\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2"+
		"\2\2\u0742\u0746\3\2\2\2\u0743\u0745\7\66\2\2\u0744\u0743\3\2\2\2\u0745"+
		"\u0748\3\2\2\2\u0746\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u074c\3\2"+
		"\2\2\u0748\u0746\3\2\2\2\u0749\u074b\5\16\b\2\u074a\u0749\3\2\2\2\u074b"+
		"\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0752\3\2"+
		"\2\2\u074e\u074c\3\2\2\2\u074f\u0751\5\u0096L\2\u0750\u074f\3\2\2\2\u0751"+
		"\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0775\3\2"+
		"\2\2\u0754\u0752\3\2\2\2\u0755\u0757\5\16\b\2\u0756\u0755\3\2\2\2\u0757"+
		"\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075b\3\2"+
		"\2\2\u075a\u0758\3\2\2\2\u075b\u075d\7\66\2\2\u075c\u075e\t\3\2\2\u075d"+
		"\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2"+
		"\2\2\u0760\u0764\3\2\2\2\u0761\u0763\7\66\2\2\u0762\u0761\3\2\2\2\u0763"+
		"\u0766\3\2\2\2\u0764\u0762\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u076a\3\2"+
		"\2\2\u0766\u0764\3\2\2\2\u0767\u0769\5\16\b\2\u0768\u0767\3\2\2\2\u0769"+
		"\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u0770\3\2"+
		"\2\2\u076c\u076a\3\2\2\2\u076d\u076f\5\u0096L\2\u076e\u076d\3\2\2\2\u076f"+
		"\u0772\3\2\2\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0773\3\2"+
		"\2\2\u0772\u0770\3\2\2\2\u0773\u0775\bL\1\2\u0774\u073b\3\2\2\2\u0774"+
		"\u0758\3\2\2\2\u0775\u0097\3\2\2\2\u0776\u0777\5\n\6\2\u0777\u0779\7\31"+
		"\2\2\u0778\u077a\5\u009aN\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a"+
		"\u077b\3\2\2\2\u077b\u077d\7\32\2\2\u077c\u077e\79\2\2\u077d\u077c\3\2"+
		"\2\2\u077d\u077e\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0783\7\33\2\2\u0780"+
		"\u0782\79\2\2\u0781\u0780\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2"+
		"\2\2\u0783\u0784\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0786"+
		"\u0788\5(\25\2\u0787\u0786\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u0787\3\2"+
		"\2\2\u0789\u078a\3\2\2\2\u078a\u078e\3\2\2\2\u078b\u078d\79\2\2\u078c"+
		"\u078b\3\2\2\2\u078d\u0790\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078f\3\2"+
		"\2\2\u078f\u0791\3\2\2\2\u0790\u078e\3\2\2\2\u0791\u0795\7\34\2\2\u0792"+
		"\u0794\7\67\2\2\u0793\u0792\3\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793\3"+
		"\2\2\2\u0795\u0796\3\2\2\2\u0796\u0099\3\2\2\2\u0797\u0795\3\2\2\2\u0798"+
		"\u079b\5\4\3\2\u0799\u079a\7\35\2\2\u079a\u079c\7\36\2\2\u079b\u0799\3"+
		"\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\79\2\2\u079e"+
		"\u07a0\5\u0096L\2\u079f\u07a1\5\u009cO\2\u07a0\u079f\3\2\2\2\u07a0\u07a1"+
		"\3\2\2\2\u07a1\u07b3\3\2\2\2\u07a2\u07a4\5\4\3\2\u07a3\u07a2\3\2\2\2\u07a3"+
		"\u07a4\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a6\7\35\2\2\u07a6\u07a8\7"+
		"\36\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa\3\2\2\2\u07a9"+
		"\u07ab\79\2\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac\3\2"+
		"\2\2\u07ac\u07ae\5\u0096L\2\u07ad\u07af\5\u009cO\2\u07ae\u07ad\3\2\2\2"+
		"\u07ae\u07af\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\bN\1\2\u07b1\u07b3"+
		"\3\2\2\2\u07b2\u0798\3\2\2\2\u07b2\u07a3\3\2\2\2\u07b3\u009b\3\2\2\2\u07b4"+
		"\u07b6\7\61\2\2\u07b5\u07b7\79\2\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2"+
		"\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07c2\5\u009aN\2\u07b9\u07bb\79\2\2\u07ba"+
		"\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bc\u07bd\3\2"+
		"\2\2\u07bd\u07be\3\2\2\2\u07be\u07bf\5\u009aN\2\u07bf\u07c0\bO\1\2\u07c0"+
		"\u07c2\3\2\2\2\u07c1\u07b4\3\2\2\2\u07c1\u07ba\3\2\2\2\u07c2\u009d\3\2"+
		"\2\2\u07c3\u07c4\7\13\2\2\u07c4\u07c5\79\2\2\u07c5\u07c6\7\n\2\2\u07c6"+
		"\u07c7\79\2\2\u07c7\u07c8\5\u0098M\2\u07c8\u009f\3\2\2\2\u07c9\u07ca\7"+
		"\13\2\2\u07ca\u07cb\79\2\2\u07cb\u07ce\5\4\3\2\u07cc\u07cd\7\35\2\2\u07cd"+
		"\u07cf\7\36\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\3"+
		"\2\2\2\u07d0\u07d1\79\2\2\u07d1\u07d2\5\u0098M\2\u07d2\u00a1\3\2\2\2\u07d3"+
		"\u07d4\5\u00a4S\2\u07d4\u07d5\5\u0098M\2\u07d5\u00a3\3\2\2\2\u07d6\u07d7"+
		"\7\13\2\2\u07d7\u07d8\79\2\2\u07d8\u07d9\bS\1\2\u07d9\u00a5\3\2\2\2\u07da"+
		"\u07de\7\33\2\2\u07db\u07dd\79\2\2\u07dc\u07db\3\2\2\2\u07dd\u07e0\3\2"+
		"\2\2\u07de\u07dc\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e2\3\2\2\2\u07e0"+
		"\u07de\3\2\2\2\u07e1\u07e3\5(\25\2\u07e2\u07e1\3\2\2\2\u07e3\u07e4\3\2"+
		"\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e9\3\2\2\2\u07e6"+
		"\u07e8\79\2\2\u07e7\u07e6\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07e7\3\2"+
		"\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ec\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec"+
		"\u07ed\7\34\2\2\u07ed\u00a7\3\2\2\2\u07ee\u07ef\5\u00aaV\2\u07ef\u07f0"+
		"\5\u00acW\2\u07f0\u00a9\3\2\2\2\u07f1\u07f2\7\f\2\2\u07f2\u07f3\7\31\2"+
		"\2\u07f3\u07f7\7\32\2\2\u07f4\u07f6\79\2\2\u07f5\u07f4\3\2\2\2\u07f6\u07f9"+
		"\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u0809\3\2\2\2\u07f9"+
		"\u07f7\3\2\2\2\u07fa\u07fc\7\f\2\2\u07fb\u07fd\7\31\2\2\u07fc\u07fb\3"+
		"\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\3\2\2\2\u07fe\u0800\7\32\2\2\u07ff"+
		"\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0804\3\2\2\2\u0801\u0803\79"+
		"\2\2\u0802\u0801\3\2\2\2\u0803\u0806\3\2\2\2\u0804\u0802\3\2\2\2\u0804"+
		"\u0805\3\2\2\2\u0805\u0807\3\2\2\2\u0806\u0804\3\2\2\2\u0807\u0809\bV"+
		"\1\2\u0808\u07f1\3\2\2\2\u0808\u07fa\3\2\2\2\u0809\u00ab\3\2\2\2\u080a"+
		"\u080e\5\u00aeX\2\u080b\u080d\79\2\2\u080c\u080b\3\2\2\2\u080d\u0810\3"+
		"\2\2\2\u080e\u080c\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0812\3\2\2\2\u0810"+
		"\u080e\3\2\2\2\u0811\u0813\5(\25\2\u0812\u0811\3\2\2\2\u0813\u0814\3\2"+
		"\2\2\u0814\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0819\3\2\2\2\u0816"+
		"\u0818\79\2\2\u0817\u0816\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2"+
		"\2\2\u0819\u081a\3\2\2\2\u081a\u081c\3\2\2\2\u081b\u0819\3\2\2\2\u081c"+
		"\u081d\5\u00b0Y\2\u081d\u00ad\3\2\2\2\u081e\u0821\7\33\2\2\u081f\u0821"+
		"\bX\1\2\u0820\u081e\3\2\2\2\u0820\u081f\3\2\2\2\u0821\u00af\3\2\2\2\u0822"+
		"\u0825\7\34\2\2\u0823\u0825\bY\1\2\u0824\u0822\3\2\2\2\u0824\u0823\3\2"+
		"\2\2\u0825\u00b1\3\2\2\2\u0167\u00b4\u00b8\u00bf\u00c4\u00ca\u00d1\u00d7"+
		"\u00e3\u00e5\u00ea\u00ef\u00f5\u00f8\u00fb\u0100\u0102\u0107\u010d\u0112"+
		"\u0118\u011e\u0124\u012b\u0130\u0136\u013c\u0140\u0147\u014d\u0155\u015d"+
		"\u0167\u0177\u017b\u0180\u0186\u018d\u0191\u0196\u019c\u01a4\u01a8\u01ad"+
		"\u01b3\u01ba\u01be\u01c3\u01c9\u01d3\u01d7\u01dc\u01e2\u01e9\u01ed\u01f2"+
		"\u01f8\u0202\u0206\u020b\u0211\u0218\u021c\u0221\u0227\u0230\u0234\u0239"+
		"\u023f\u0247\u024b\u0250\u0256\u025d\u0261\u0266\u026c\u0275\u0279\u027e"+
		"\u0284\u028c\u0290\u0295\u029b\u02a2\u02a6\u02ab\u02b1\u02b7\u02bc\u02c2"+
		"\u02cb\u02d1\u02d7\u02df\u02e3\u02e7\u02ea\u02ee\u02f2\u02f5\u02fb\u02ff"+
		"\u0302\u0306\u030c\u0310\u0315\u031a\u031e\u0324\u0328\u032d\u0338\u033c"+
		"\u0340\u034d\u0351\u0355\u0358\u035c\u0360\u0364\u036a\u036e\u0372\u0375"+
		"\u0379\u037d\u0381\u0389\u038d\u0390\u0395\u0399\u03a5\u03a9\u03ad\u03b5"+
		"\u03b7\u03be\u03c4\u03c8\u03cc\u03d0\u03d5\u03d9\u03dd\u03e1\u03e7\u03eb"+
		"\u03f1\u03fa\u03fe\u0402\u0406\u040a\u0410\u0413\u0419\u041c\u041f\u0424"+
		"\u0429\u042e\u0433\u0439\u043b\u0441\u0450\u045c\u0463\u0469\u046d\u0474"+
		"\u0477\u047b\u0480\u0484\u0488\u048c\u0492\u0498\u049b\u04a0\u04a2\u04ac"+
		"\u04b0\u04b4\u04ba\u04be\u04c4\u04c8\u04cc\u04d2\u04d6\u04dc\u04e0\u04e5"+
		"\u04eb\u04f3\u04f7\u04fa\u04ff\u0503\u0509\u050f\u0513\u051b\u0521\u0524"+
		"\u052a\u052e\u0534\u053a\u053e\u0546\u054c\u054f\u0555\u055a\u0560\u0564"+
		"\u0568\u056c\u0570\u0574\u057a\u0580\u0583\u0588\u058a\u058f\u0593\u0597"+
		"\u059b\u059f\u05a3\u05a7\u05ad\u05b1\u05b5\u05b9\u05c0\u05c3\u05c9\u05cd"+
		"\u05d0\u05d5\u05d9\u05dc\u05df\u05e2\u05e7\u05eb\u05f3\u05f7\u05fc\u0601"+
		"\u0608\u060e\u0613\u061b\u061f\u0624\u062a\u062f\u0633\u0637\u0641\u0645"+
		"\u064b\u0652\u0656\u065a\u0660\u0666\u066c\u0673\u0677\u067d\u0683\u0689"+
		"\u0690\u0694\u0699\u069f\u06a5\u06ab\u06b0\u06b4\u06b8\u06bb\u06be\u06c3"+
		"\u06c7\u06cb\u06d1\u06d5\u06dc\u06e3\u06e9\u06f1\u06f6\u06fb\u06ff\u0703"+
		"\u0708\u0710\u0717\u071d\u0720\u0725\u072a\u0731\u0736\u073b\u0741\u0746"+
		"\u074c\u0752\u0758\u075f\u0764\u076a\u0770\u0774\u0779\u077d\u0783\u0789"+
		"\u078e\u0795\u079b\u07a0\u07a3\u07a7\u07aa\u07ae\u07b2\u07b6\u07bc\u07c1"+
		"\u07ce\u07de\u07e4\u07e9\u07f7\u07fc\u07ff\u0804\u0808\u080e\u0814\u0819"+
		"\u0820\u0824";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}