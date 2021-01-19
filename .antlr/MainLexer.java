// Generated from c:\Users\Lenard\Documents\CMPILERParser\Main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "DIGIT", "NEWLINE", "BLOCKCOMMENT", "LINECOMMENT", 
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


	public MainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u018c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u0082\n\5\3\5\5\5\u0085\n\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab\13\b\3\b\3\b\3\t\5\t\u00b0\n\t\3"+
		"\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\t\3\t\6\t\u00ba\n\t\r\t\16\t\u00bb"+
		"\3\t\5\t\u00bf\n\t\3\t\5\t\u00c2\n\t\3\t\6\t\u00c5\n\t\r\t\16\t\u00c6"+
		"\5\t\u00c9\n\t\3\n\3\n\3\n\6\n\u00ce\n\n\r\n\16\n\u00cf\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\r\5\r\u00dd\n\r\3\16\3\16\5\16\u00e1"+
		"\n\16\3\17\3\17\5\17\u00e5\n\17\3\20\3\20\3\20\3\20\5\20\u00eb\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"\u008e\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=\3\2\7\3\2c|\3\2C|\3\2\62;\4\2\f\f\17\17\5\2\13\f"+
		"\17\17\"\"\2\u01a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\u0084\3\2\2\2\13\u0088\3\2\2\2"+
		"\r\u0096\3\2\2\2\17\u00a1\3\2\2\2\21\u00c8\3\2\2\2\23\u00cd\3\2\2\2\25"+
		"\u00d1\3\2\2\2\27\u00d7\3\2\2\2\31\u00dc\3\2\2\2\33\u00e0\3\2\2\2\35\u00e4"+
		"\3\2\2\2\37\u00ea\3\2\2\2!\u00ec\3\2\2\2#\u00f3\3\2\2\2%\u00fc\3\2\2\2"+
		"\'\u0103\3\2\2\2)\u0109\3\2\2\2+\u010e\3\2\2\2-\u0111\3\2\2\2/\u0116\3"+
		"\2\2\2\61\u011e\3\2\2\2\63\u0122\3\2\2\2\65\u0128\3\2\2\2\67\u0130\3\2"+
		"\2\29\u0136\3\2\2\2;\u013b\3\2\2\2=\u013f\3\2\2\2?\u0144\3\2\2\2A\u014a"+
		"\3\2\2\2C\u0151\3\2\2\2E\u0153\3\2\2\2G\u0155\3\2\2\2I\u0157\3\2\2\2K"+
		"\u0159\3\2\2\2M\u015b\3\2\2\2O\u015d\3\2\2\2Q\u015f\3\2\2\2S\u0162\3\2"+
		"\2\2U\u0164\3\2\2\2W\u0167\3\2\2\2Y\u0169\3\2\2\2[\u016b\3\2\2\2]\u016d"+
		"\3\2\2\2_\u016f\3\2\2\2a\u0171\3\2\2\2c\u0173\3\2\2\2e\u0175\3\2\2\2g"+
		"\u0178\3\2\2\2i\u017b\3\2\2\2k\u017d\3\2\2\2m\u017f\3\2\2\2o\u0182\3\2"+
		"\2\2q\u0184\3\2\2\2s\u0186\3\2\2\2u\u0188\3\2\2\2w\u018a\3\2\2\2yz\t\2"+
		"\2\2z\4\3\2\2\2{|\t\3\2\2|\6\3\2\2\2}~\t\4\2\2~\b\3\2\2\2\177\u0081\7"+
		"\17\2\2\u0080\u0082\7\f\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0085\7\f\2\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0087\b\5\2\2\u0087\n\3\2\2\2\u0088\u0089"+
		"\7\61\2\2\u0089\u008a\7,\2\2\u008a\u008e\3\2\2\2\u008b\u008d\13\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7,\2\2\u0092"+
		"\u0093\7\61\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\6\2\2\u0095\f\3\2\2"+
		"\2\u0096\u0097\7\61\2\2\u0097\u0098\7\61\2\2\u0098\u009c\3\2\2\2\u0099"+
		"\u009b\n\5\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\b\7\2\2\u00a0\16\3\2\2\2\u00a1\u00a9\7$\2\2\u00a2\u00a8\5\3\2\2"+
		"\u00a3\u00a8\5\5\3\2\u00a4\u00a8\5\7\4\2\u00a5\u00a8\5\25\13\2\u00a6\u00a8"+
		"\5\37\20\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7$\2\2\u00ad\20\3\2\2\2\u00ae\u00b0\7/\2\2\u00af\u00ae\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\t"+
		"\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\7h\2\2\u00be\u00bd\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c9\3\2\2\2\u00c0\u00c2\7/\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\t\4"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00af\3\2\2\2\u00c8\u00c1\3\2"+
		"\2\2\u00c9\22\3\2\2\2\u00ca\u00ce\5\3\2\2\u00cb\u00ce\5\5\3\2\u00cc\u00ce"+
		"\7a\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\24\3\2\2"+
		"\2\u00d1\u00d2\t\6\2\2\u00d2\26\3\2\2\2\u00d3\u00d8\5;\36\2\u00d4\u00d8"+
		"\5=\37\2\u00d5\u00d8\5? \2\u00d6\u00d8\5A!\2\u00d7\u00d3\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\30\3\2\2"+
		"\2\u00d9\u00dd\5[.\2\u00da\u00dd\5]/\2\u00db\u00dd\5_\60\2\u00dc\u00d9"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\32\3\2\2\2\u00de"+
		"\u00e1\5W,\2\u00df\u00e1\5Y-\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\34\3\2\2\2\u00e2\u00e5\5\31\r\2\u00e3\u00e5\5\33\16\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\36\3\2\2\2\u00e6\u00eb\5s:\2\u00e7"+
		"\u00eb\5w<\2\u00e8\u00eb\5i\65\2\u00e9\u00eb\5o8\2\u00ea\u00e6\3\2\2\2"+
		"\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb \3"+
		"\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\"\3\2\2\2\u00f3"+
		"\u00f4\7e\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7u\2\2"+
		"\u00f7\u00f8\7v\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7v\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7t\2\2\u0101\u0102\7p\2\2\u0102"+
		"&\3\2\2\2\u0103\u0104\7r\2\2\u0104\u0105\7t\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108(\3\2\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7e\2\2\u010b\u010c\7c\2\2\u010c\u010d\7p\2\2\u010d*\3\2\2\2\u010e"+
		"\u010f\7k\2\2\u010f\u0110\7h\2\2\u0110,\3\2\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7n\2\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115.\3\2\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7n\2\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2"+
		"\u011a\u011b\7\"\2\2\u011b\u011c\7k\2\2\u011c\u011d\7h\2\2\u011d\60\3"+
		"\2\2\2\u011e\u011f\7h\2\2\u011f\u0120\7q\2\2\u0120\u0121\7t\2\2\u0121"+
		"\62\3\2\2\2\u0122\u0123\7w\2\2\u0123\u0124\7r\2\2\u0124\u0125\7\"\2\2"+
		"\u0125\u0126\7v\2\2\u0126\u0127\7q\2\2\u0127\64\3\2\2\2\u0128\u0129\7"+
		"f\2\2\u0129\u012a\7q\2\2\u012a\u012b\7y\2\2\u012b\u012c\7p\2\2\u012c\u012d"+
		"\7\"\2\2\u012d\u012e\7v\2\2\u012e\u012f\7q\2\2\u012f\66\3\2\2\2\u0130"+
		"\u0131\7y\2\2\u0131\u0132\7j\2\2\u0132\u0133\7k\2\2\u0133\u0134\7n\2\2"+
		"\u0134\u0135\7g\2\2\u01358\3\2\2\2\u0136\u0137\7x\2\2\u0137\u0138\7q\2"+
		"\2\u0138\u0139\7k\2\2\u0139\u013a\7f\2\2\u013a:\3\2\2\2\u013b\u013c\7"+
		"k\2\2\u013c\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e<\3\2\2\2\u013f\u0140"+
		"\7d\2\2\u0140\u0141\7q\2\2\u0141\u0142\7q\2\2\u0142\u0143\7n\2\2\u0143"+
		">\3\2\2\2\u0144\u0145\7h\2\2\u0145\u0146\7n\2\2\u0146\u0147\7q\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7v\2\2\u0149@\3\2\2\2\u014a\u014b\7U\2\2\u014b"+
		"\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2"+
		"\u014f\u0150\7i\2\2\u0150B\3\2\2\2\u0151\u0152\7*\2\2\u0152D\3\2\2\2\u0153"+
		"\u0154\7+\2\2\u0154F\3\2\2\2\u0155\u0156\7}\2\2\u0156H\3\2\2\2\u0157\u0158"+
		"\7\177\2\2\u0158J\3\2\2\2\u0159\u015a\7]\2\2\u015aL\3\2\2\2\u015b\u015c"+
		"\7_\2\2\u015cN\3\2\2\2\u015d\u015e\7>\2\2\u015eP\3\2\2\2\u015f\u0160\7"+
		">\2\2\u0160\u0161\7?\2\2\u0161R\3\2\2\2\u0162\u0163\7@\2\2\u0163T\3\2"+
		"\2\2\u0164\u0165\7@\2\2\u0165\u0166\7?\2\2\u0166V\3\2\2\2\u0167\u0168"+
		"\7-\2\2\u0168X\3\2\2\2\u0169\u016a\7/\2\2\u016aZ\3\2\2\2\u016b\u016c\7"+
		",\2\2\u016c\\\3\2\2\2\u016d\u016e\7\61\2\2\u016e^\3\2\2\2\u016f\u0170"+
		"\7\'\2\2\u0170`\3\2\2\2\u0171\u0172\7(\2\2\u0172b\3\2\2\2\u0173\u0174"+
		"\7~\2\2\u0174d\3\2\2\2\u0175\u0176\7(\2\2\u0176\u0177\7(\2\2\u0177f\3"+
		"\2\2\2\u0178\u0179\7~\2\2\u0179\u017a\7~\2\2\u017ah\3\2\2\2\u017b\u017c"+
		"\7#\2\2\u017cj\3\2\2\2\u017d\u017e\7?\2\2\u017el\3\2\2\2\u017f\u0180\7"+
		"?\2\2\u0180\u0181\7?\2\2\u0181n\3\2\2\2\u0182\u0183\7A\2\2\u0183p\3\2"+
		"\2\2\u0184\u0185\7<\2\2\u0185r\3\2\2\2\u0186\u0187\7\60\2\2\u0187t\3\2"+
		"\2\2\u0188\u0189\7=\2\2\u0189v\3\2\2\2\u018a\u018b\7.\2\2\u018bx\3\2\2"+
		"\2\27\2\u0081\u0084\u008e\u009c\u00a7\u00a9\u00af\u00b4\u00bb\u00be\u00c1"+
		"\u00c6\u00c8\u00cd\u00cf\u00d7\u00dc\u00e0\u00e4\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}