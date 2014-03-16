// Generated from C:\Users\Tarcisio\Desktop\aaaaaaaa\new\MonitoringDSL.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonitoringDSLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GIVEN=1, WHEN=2, OR=3, RESOURCE=4, OF=5, RESOURCES=6, IS=7, THEN=8, ITS=9, 
		COMMA=10, LPAREN=11, RPAREN=12, EQ=13, GT=14, LT=15, NEQ=16, ID=17, STRING=18, 
		INT=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Given'", "'When'", "'or'", "'resource'", "'of'", "'resource's'", "'is'", 
		"'Then'", "'its'", "','", "'('", "')'", "'equals to'", "'greater than'", 
		"'less than'", "NEQ", "ID", "STRING", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"GIVEN", "WHEN", "OR", "RESOURCE", "OF", "RESOURCES", "IS", "THEN", "ITS", 
		"COMMA", "LPAREN", "RPAREN", "EQ", "GT", "LT", "NEQ", "ID", "STRING", 
		"INT", "WS", "HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};


	public MonitoringDSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MonitoringDSL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\7\22\u00aa"+
		"\n\22\f\22\16\22\u00ad\13\22\3\23\3\23\3\23\7\23\u00b2\n\23\f\23\16\23"+
		"\u00b5\13\23\3\23\3\23\3\24\6\24\u00ba\n\24\r\24\16\24\u00bb\3\25\6\25"+
		"\u00bf\n\25\r\25\16\25\u00c0\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5"+
		"\27\u00cb\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d6"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2\32\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\2+\2\1-\2\1/\2\1\61\2\1\3\2\t"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\3\2\62;\5\2\13\f\17\17\"\"\5\2\62;"+
		"CHch\n\2$$))^^ddhhppttvv\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3"+
		"\63\3\2\2\2\59\3\2\2\2\7>\3\2\2\2\tA\3\2\2\2\13J\3\2\2\2\rM\3\2\2\2\17"+
		"X\3\2\2\2\21[\3\2\2\2\23`\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2"+
		"\33j\3\2\2\2\35t\3\2\2\2\37\u0081\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2"+
		"\2%\u00ae\3\2\2\2\'\u00b9\3\2\2\2)\u00be\3\2\2\2+\u00c4\3\2\2\2-\u00ca"+
		"\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\64\7I\2\2\64\65\7k\2\2\65"+
		"\66\7x\2\2\66\67\7g\2\2\678\7p\2\28\4\3\2\2\29:\7Y\2\2:;\7j\2\2;<\7g\2"+
		"\2<=\7p\2\2=\6\3\2\2\2>?\7q\2\2?@\7t\2\2@\b\3\2\2\2AB\7t\2\2BC\7g\2\2"+
		"CD\7u\2\2DE\7q\2\2EF\7w\2\2FG\7t\2\2GH\7e\2\2HI\7g\2\2I\n\3\2\2\2JK\7"+
		"q\2\2KL\7h\2\2L\f\3\2\2\2MN\7t\2\2NO\7g\2\2OP\7u\2\2PQ\7q\2\2QR\7w\2\2"+
		"RS\7t\2\2ST\7e\2\2TU\7g\2\2UV\7)\2\2VW\7u\2\2W\16\3\2\2\2XY\7k\2\2YZ\7"+
		"u\2\2Z\20\3\2\2\2[\\\7V\2\2\\]\7j\2\2]^\7g\2\2^_\7p\2\2_\22\3\2\2\2`a"+
		"\7k\2\2ab\7v\2\2bc\7u\2\2c\24\3\2\2\2de\7.\2\2e\26\3\2\2\2fg\7*\2\2g\30"+
		"\3\2\2\2hi\7+\2\2i\32\3\2\2\2jk\7g\2\2kl\7s\2\2lm\7w\2\2mn\7c\2\2no\7"+
		"n\2\2op\7u\2\2pq\7\"\2\2qr\7v\2\2rs\7q\2\2s\34\3\2\2\2tu\7i\2\2uv\7t\2"+
		"\2vw\7g\2\2wx\7c\2\2xy\7v\2\2yz\7g\2\2z{\7t\2\2{|\7\"\2\2|}\7v\2\2}~\7"+
		"j\2\2~\177\7c\2\2\177\u0080\7p\2\2\u0080\36\3\2\2\2\u0081\u0082\7n\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7u\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7\"\2\2\u0086\u0087\7v\2\2\u0087\u0088\7j\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7p\2\2\u008a \3\2\2\2\u008b\u008c\7p\2\2\u008c\u008d\7q\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7g\2\2\u0090\u0091\7s\2"+
		"\2\u0091\u0092\7w\2\2\u0092\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095"+
		"\7\"\2\2\u0095\u0096\7v\2\2\u0096\u00a6\7q\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\u009b\7h\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\u00a0"+
		"\7v\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a6\7p\2\2\u00a5\u008b\3\2\2\2\u00a5\u0097\3\2\2"+
		"\2\u00a6\"\3\2\2\2\u00a7\u00ab\t\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"$\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\7$\2\2\u00af\u00b2\5-\27\2\u00b0"+
		"\u00b2\n\4\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7&\3\2\2\2\u00b8\u00ba\t\5\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc(\3\2\2\2\u00bd\u00bf\t\6\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\b\25\2\2\u00c3*\3\2\2\2\u00c4\u00c5\t\7\2\2\u00c5,\3\2\2\2\u00c6"+
		"\u00c7\7^\2\2\u00c7\u00cb\t\b\2\2\u00c8\u00cb\5\61\31\2\u00c9\u00cb\5"+
		"/\30\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		".\3\2\2\2\u00cc\u00cd\7^\2\2\u00cd\u00ce\4\62\65\2\u00ce\u00cf\4\629\2"+
		"\u00cf\u00d6\4\629\2\u00d0\u00d1\7^\2\2\u00d1\u00d2\4\629\2\u00d2\u00d6"+
		"\4\629\2\u00d3\u00d4\7^\2\2\u00d4\u00d6\4\629\2\u00d5\u00cc\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7^\2\2"+
		"\u00d8\u00d9\7w\2\2\u00d9\u00da\5+\26\2\u00da\u00db\5+\26\2\u00db\u00dc"+
		"\5+\26\2\u00dc\u00dd\5+\26\2\u00dd\62\3\2\2\2\13\2\u00a5\u00ab\u00b1\u00b3"+
		"\u00bb\u00c0\u00ca\u00d5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}