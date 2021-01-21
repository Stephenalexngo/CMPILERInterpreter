// Generated from Main.g4 by ANTLR 4.9
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
		LETTER=52, DIGIT=53, LINECOMMENT=54, WHITE_SPACE=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CREATE", "CONSTANT", "RETURN", "PRINT", "SCAN", "VOID", "FUNC", "MAIN", 
			"IF", "ELSE", "ELSE_IF", "THEN", "FOR", "UP_TO", "DOWN_TO", "WHILE", 
			"INT_DEC", "BOOLEAN_DEC", "FLOAT_DEC", "STRING_DEC", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "LESS", 
			"LESSQEUAL", "GREATER", "GREATEREQUAL", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "ANDAND", "OROR", "NOT", "ASSIGN", "EQUAL", "QUESTION", "COLON", 
			"DOT", "SEMICOLON", "COMMA", "UNDERSCORE", "SINGLE_QUOTE", "STRING_TYPE", 
			"INT_NUMBER", "FLOAT_NUMBER", "LABEL", "LETTER", "DIGIT", "LETTERORDIGIT", 
			"LINECOMMENT", "WHITE_SPACE"
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
			"INT_NUMBER", "FLOAT_NUMBER", "LABEL", "LETTER", "DIGIT", "LINECOMMENT", 
			"WHITE_SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\7\61\u0125\n\61\f\61\16\61\u0128\13"+
		"\61\3\61\3\61\3\62\5\62\u012d\n\62\3\62\6\62\u0130\n\62\r\62\16\62\u0131"+
		"\3\63\5\63\u0135\n\63\3\63\6\63\u0138\n\63\r\63\16\63\u0139\3\63\3\63"+
		"\6\63\u013e\n\63\r\63\16\63\u013f\5\63\u0142\n\63\3\63\3\63\3\64\3\64"+
		"\7\64\u0148\n\64\f\64\16\64\u014b\13\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\5\67\u0153\n\67\38\38\38\38\78\u0159\n8\f8\168\u015c\138\39\69\u015f"+
		"\n9\r9\169\u0160\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m\2o8q9\3\2\7\3\2$$\5\2C\\aac|\3\2\62;\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5z\3\2\2\2\7"+
		"\u0083\3\2\2\2\t\u008a\3\2\2\2\13\u0090\3\2\2\2\r\u0095\3\2\2\2\17\u009a"+
		"\3\2\2\2\21\u009f\3\2\2\2\23\u00a4\3\2\2\2\25\u00a7\3\2\2\2\27\u00ac\3"+
		"\2\2\2\31\u00b4\3\2\2\2\33\u00b9\3\2\2\2\35\u00bd\3\2\2\2\37\u00c3\3\2"+
		"\2\2!\u00cb\3\2\2\2#\u00d1\3\2\2\2%\u00d5\3\2\2\2\'\u00da\3\2\2\2)\u00e0"+
		"\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed\3\2\2\2"+
		"\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2\29\u00f5\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fd\3\2\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E"+
		"\u0103\3\2\2\2G\u0105\3\2\2\2I\u0107\3\2\2\2K\u010a\3\2\2\2M\u010d\3\2"+
		"\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011a\3\2\2\2[\u011c\3\2\2\2]\u011e\3\2\2\2_\u0120\3\2\2\2a"+
		"\u0122\3\2\2\2c\u012c\3\2\2\2e\u0134\3\2\2\2g\u0145\3\2\2\2i\u014c\3\2"+
		"\2\2k\u014e\3\2\2\2m\u0152\3\2\2\2o\u0154\3\2\2\2q\u015e\3\2\2\2st\7e"+
		"\2\2tu\7t\2\2uv\7g\2\2vw\7c\2\2wx\7v\2\2xy\7g\2\2y\4\3\2\2\2z{\7e\2\2"+
		"{|\7q\2\2|}\7p\2\2}~\7u\2\2~\177\7v\2\2\177\u0080\7c\2\2\u0080\u0081\7"+
		"p\2\2\u0081\u0082\7v\2\2\u0082\6\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7v\2\2\u0086\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7p\2\2\u0089\b\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\n\3\2\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7e\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2"+
		"\u0094\f\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097\7q\2\2\u0097\u0098\7k"+
		"\2\2\u0098\u0099\7f\2\2\u0099\16\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c"+
		"\7w\2\2\u009c\u009d\7p\2\2\u009d\u009e\7e\2\2\u009e\20\3\2\2\2\u009f\u00a0"+
		"\7o\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\24\3\2\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\26\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7"+
		"u\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7r\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7q\2"+
		"\2\u00c2\36\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7y\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca \3\2\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\"\3\2\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4$\3\2\2\2\u00d5"+
		"\u00d6\7d\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7n\2\2"+
		"\u00d9&\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7q\2"+
		"\2\u00dd\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df(\3\2\2\2\u00e0\u00e1\7"+
		"U\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5"+
		"\7P\2\2\u00e5\u00e6\7I\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8,\3"+
		"\2\2\2\u00e9\u00ea\7+\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7}\2\2\u00ec\60\3"+
		"\2\2\2\u00ed\u00ee\7\177\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0"+
		"\64\3\2\2\2\u00f1\u00f2\7_\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4"+
		"8\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7?\2\2\u00f7:\3\2\2\2\u00f8\u00f9"+
		"\7@\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fc>\3"+
		"\2\2\2\u00fd\u00fe\7-\2\2\u00fe@\3\2\2\2\u00ff\u0100\7/\2\2\u0100B\3\2"+
		"\2\2\u0101\u0102\7,\2\2\u0102D\3\2\2\2\u0103\u0104\7\61\2\2\u0104F\3\2"+
		"\2\2\u0105\u0106\7\'\2\2\u0106H\3\2\2\2\u0107\u0108\7(\2\2\u0108\u0109"+
		"\7(\2\2\u0109J\3\2\2\2\u010a\u010b\7~\2\2\u010b\u010c\7~\2\2\u010cL\3"+
		"\2\2\2\u010d\u010e\7#\2\2\u010eN\3\2\2\2\u010f\u0110\7?\2\2\u0110P\3\2"+
		"\2\2\u0111\u0112\7?\2\2\u0112\u0113\7?\2\2\u0113R\3\2\2\2\u0114\u0115"+
		"\7A\2\2\u0115T\3\2\2\2\u0116\u0117\7<\2\2\u0117V\3\2\2\2\u0118\u0119\7"+
		"\60\2\2\u0119X\3\2\2\2\u011a\u011b\7=\2\2\u011bZ\3\2\2\2\u011c\u011d\7"+
		".\2\2\u011d\\\3\2\2\2\u011e\u011f\7a\2\2\u011f^\3\2\2\2\u0120\u0121\7"+
		")\2\2\u0121`\3\2\2\2\u0122\u0126\7$\2\2\u0123\u0125\n\2\2\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$\2\2\u012ab\3\2\2\2\u012b"+
		"\u012d\5A!\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2"+
		"\2\u012e\u0130\5k\66\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132d\3\2\2\2\u0133\u0135\5A!\2\u0134\u0133"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\5k\66\2\u0137"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u0141\3\2\2\2\u013b\u013d\5W,\2\u013c\u013e\5k\66\2\u013d\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\7h\2\2\u0144f\3\2\2\2\u0145\u0149\5i\65\2\u0146\u0148"+
		"\5m\67\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014ah\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\t\3\2\2"+
		"\u014dj\3\2\2\2\u014e\u014f\t\4\2\2\u014fl\3\2\2\2\u0150\u0153\5k\66\2"+
		"\u0151\u0153\5i\65\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153n\3"+
		"\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156\7\61\2\2\u0156\u015a\3\2\2\2\u0157"+
		"\u0159\n\5\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015bp\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f"+
		"\t\6\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b9\2\2\u0163r\3\2\2\2\16"+
		"\2\u0126\u012c\u0131\u0134\u0139\u013f\u0141\u0149\u0152\u015a\u0160\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}