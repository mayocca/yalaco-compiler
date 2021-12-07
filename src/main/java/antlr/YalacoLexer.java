// Generated from D:/Users/Matu/Documents/NetBeansProjects/ANTLR-Compiler/src/main/antlr\Yalaco.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YalacoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FOR=4, STRING=5, LOGIC=6, PRINT=7, PRINTLN=8, TRUNC=9, 
		ASSIGN=10, EOL=11, ID=12, NUMBER=13, SUM=14, SUB=15, MUL=16, DIV=17, EXP=18, 
		MOD=19, GRE=20, LES=21, GEQ=22, LEQ=23, NEQ=24, EQU=25, AND=26, OR=27, 
		NOT=28, PAR_OPEN=29, PAR_CLOSE=30, BRK_OPEN=31, BRK_CLOSE=32, INC=33, 
		DEC=34, WS=35, NL=36, BC=37, LC=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "FOR", "STRING", "LOGIC", "PRINT", "PRINTLN", 
			"TRUNC", "ASSIGN", "EOL", "ID", "NUMBER", "SUM", "SUB", "MUL", "DIV", 
			"EXP", "MOD", "GRE", "LES", "GEQ", "LEQ", "NEQ", "EQU", "AND", "OR", 
			"NOT", "PAR_OPEN", "PAR_CLOSE", "BRK_OPEN", "BRK_CLOSE", "INC", "DEC", 
			"WS", "NL", "BC", "LC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", null, null, "'print'", "'printline'", 
			"'trunc'", "'='", "';'", null, null, "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'%'", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'!'", "'('", "')'", "'{'", "'}'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FOR", "STRING", "LOGIC", "PRINT", "PRINTLN", 
			"TRUNC", "ASSIGN", "EOL", "ID", "NUMBER", "SUM", "SUB", "MUL", "DIV", 
			"EXP", "MOD", "GRE", "LES", "GEQ", "LEQ", "NEQ", "EQU", "AND", "OR", 
			"NOT", "PAR_OPEN", "PAR_CLOSE", "BRK_OPEN", "BRK_CLOSE", "INC", "DEC", 
			"WS", "NL", "BC", "LC"
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


	public YalacoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Yalaco.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6d\n\6\f\6\16"+
		"\6g\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r"+
		"\3\16\5\16\u0098\n\16\3\16\6\16\u009b\n\16\r\16\16\16\u009c\3\16\3\16"+
		"\6\16\u00a1\n\16\r\16\16\16\u00a2\5\16\u00a5\n\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\6$\u00da\n$\r$\16$\u00db\3$\3$\3%\3%\5%\u00e2\n%\3%\5%\u00e5\n"+
		"%\3%\3%\3&\3&\3&\3&\7&\u00ed\n&\f&\16&\u00f0\13&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\7\'\u00fb\n\'\f\'\16\'\u00fe\13\'\3\'\3\'\3\u00ee\2(\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(\3\2\n\3\2$$\b\2\"\"//\62;C\\aac|\4\2C\\c|\5\2\62;C\\"+
		"c|\3\2\62;\3\2\60\60\4\2\13\13\"\"\4\2\f\f\17\17\2\u010c\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7W\3\2\2\2\t]\3\2\2\2\13a\3"+
		"\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21{\3\2\2\2\23\u0085\3\2\2\2\25\u008b\3"+
		"\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0097\3\2\2\2\35\u00a6\3\2"+
		"\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b0"+
		"\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\u00bc\3\2\2\2\63\u00bf\3\2\2\2\65\u00c2\3\2\2\2\67\u00c5\3\2\2\29\u00c8"+
		"\3\2\2\2;\u00ca\3\2\2\2=\u00cc\3\2\2\2?\u00ce\3\2\2\2A\u00d0\3\2\2\2C"+
		"\u00d2\3\2\2\2E\u00d5\3\2\2\2G\u00d9\3\2\2\2I\u00e4\3\2\2\2K\u00e8\3\2"+
		"\2\2M\u00f6\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\4\3\2\2\2RS\7g\2\2ST\7n\2\2TU\7"+
		"u\2\2UV\7g\2\2V\6\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2"+
		"\2\\\b\3\2\2\2]^\7h\2\2^_\7q\2\2_`\7t\2\2`\n\3\2\2\2ae\t\2\2\2bd\t\3\2"+
		"\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\t\2\2"+
		"\2i\f\3\2\2\2jk\7v\2\2kl\7t\2\2lm\7w\2\2mt\7g\2\2no\7h\2\2op\7c\2\2pq"+
		"\7n\2\2qr\7u\2\2rt\7g\2\2sj\3\2\2\2sn\3\2\2\2t\16\3\2\2\2uv\7r\2\2vw\7"+
		"t\2\2wx\7k\2\2xy\7p\2\2yz\7v\2\2z\20\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2"+
		"\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7n\2\2\u0081\u0082\7k\2\2"+
		"\u0082\u0083\7p\2\2\u0083\u0084\7g\2\2\u0084\22\3\2\2\2\u0085\u0086\7"+
		"v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7e\2\2\u008a\24\3\2\2\2\u008b\u008c\7?\2\2\u008c\26\3\2\2\2\u008d\u008e"+
		"\7=\2\2\u008e\30\3\2\2\2\u008f\u0093\t\4\2\2\u0090\u0092\t\5\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\32\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7/\2\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\t\6\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a4\3\2\2\2\u009e\u00a0\t\7\2\2\u009f\u00a1\t\6\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\34\3\2\2\2\u00a6\u00a7\7-\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9"+
		" \3\2\2\2\u00aa\u00ab\7,\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad"+
		"$\3\2\2\2\u00ae\u00af\7`\2\2\u00af&\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1"+
		"(\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5,"+
		"\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8\7?\2\2\u00b8.\3\2\2\2\u00b9\u00ba"+
		"\7>\2\2\u00ba\u00bb\7?\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be"+
		"\7?\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1\64"+
		"\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7(\2\2\u00c4\66\3\2\2\2\u00c5"+
		"\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c78\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9"+
		":\3\2\2\2\u00ca\u00cb\7*\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7+\2\2\u00cd>"+
		"\3\2\2\2\u00ce\u00cf\7}\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7\177\2\2\u00d1"+
		"B\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3\u00d4\7-\2\2\u00d4D\3\2\2\2\u00d5\u00d6"+
		"\7/\2\2\u00d6\u00d7\7/\2\2\u00d7F\3\2\2\2\u00d8\u00da\t\b\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\b$\2\2\u00deH\3\2\2\2\u00df\u00e1\7\17\2\2"+
		"\u00e0\u00e2\7\f\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e5\7\f\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b%\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7\61\2\2"+
		"\u00e9\u00ea\7,\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f3\7\61"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b&\2\2\u00f5L\3\2\2\2\u00f6\u00f7"+
		"\7\61\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\n\t\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\b\'\2\2\u0100"+
		"N\3\2\2\2\20\2ces\u0093\u0097\u009c\u00a2\u00a4\u00db\u00e1\u00e4\u00ee"+
		"\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}