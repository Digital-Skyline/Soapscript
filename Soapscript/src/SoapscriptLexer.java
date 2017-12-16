// Generated from Soapscript.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoapscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, INTEGER=17, 
		FLOAT=18, ADDOP=19, SUBOP=20, MULOP=21, DIVOP=22, MODOP=23, LEOP=24, GEOP=25, 
		GTOP=26, LTOP=27, NEOP=28, ETOP=29, NOTOP=30, TNOTOP=31, NEGOP=32, NEWLINE=33, 
		WS=34, COMMENT=35, LINE_COMMENT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "INTEGER", 
		"FLOAT", "ADDOP", "SUBOP", "MULOP", "DIVOP", "MODOP", "LEOP", "GEOP", 
		"GTOP", "LTOP", "NEOP", "ETOP", "NOTOP", "TNOTOP", "NEGOP", "NEWLINE", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "';'", "'end'", "'='", "'if'", "'('", "')'", "'else'", 
		"'for'", "'{'", "'}'", "'++'", "'--'", "'.'", "'var'", null, null, null, 
		"'+'", null, "'*'", "'/'", "'%'", "'<='", "'>='", "'>'", "'<'", "'!='", 
		"'=='", "'!'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "INTEGER", "FLOAT", "ADDOP", "SUBOP", "MULOP", 
		"DIVOP", "MODOP", "LEOP", "GEOP", "GTOP", "LTOP", "NEOP", "ETOP", "NOTOP", 
		"TNOTOP", "NEGOP", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
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


	public SoapscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Soapscript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\7\21~\n\21\f\21\16\21\u0081\13\21\3"+
		"\22\6\22\u0084\n\22\r\22\16\22\u0085\3\23\6\23\u0089\n\23\r\23\16\23\u008a"+
		"\3\23\3\23\6\23\u008f\n\23\r\23\16\23\u0090\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\5\"\u00b4"+
		"\n\"\3\"\3\"\3\"\3\"\3#\6#\u00bb\n#\r#\16#\u00bc\3#\3#\3$\3$\3$\3$\7$"+
		"\u00c5\n$\f$\16$\u00c8\13$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u00d3\n%\f%\16"+
		"%\u00d6\13%\3%\5%\u00d9\n%\3%\3%\3%\3%\3\u00c6\2&\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\7"+
		"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\2\u00e6\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\3K\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r^\3"+
		"\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23g\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31"+
		"o\3\2\2\2\33r\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!{\3\2\2\2#\u0083\3\2\2\2"+
		"%\u0088\3\2\2\2\'\u0092\3\2\2\2)\u0094\3\2\2\2+\u0096\3\2\2\2-\u0098\3"+
		"\2\2\2/\u009a\3\2\2\2\61\u009c\3\2\2\2\63\u009f\3\2\2\2\65\u00a2\3\2\2"+
		"\2\67\u00a4\3\2\2\29\u00a6\3\2\2\2;\u00a9\3\2\2\2=\u00ac\3\2\2\2?\u00ae"+
		"\3\2\2\2A\u00b0\3\2\2\2C\u00b3\3\2\2\2E\u00ba\3\2\2\2G\u00c0\3\2\2\2I"+
		"\u00ce\3\2\2\2KL\7R\2\2LM\7T\2\2MN\7Q\2\2NO\7I\2\2OP\7T\2\2PQ\7C\2\2Q"+
		"R\7O\2\2R\4\3\2\2\2ST\7=\2\2T\6\3\2\2\2UV\7g\2\2VW\7p\2\2WX\7f\2\2X\b"+
		"\3\2\2\2YZ\7?\2\2Z\n\3\2\2\2[\\\7k\2\2\\]\7h\2\2]\f\3\2\2\2^_\7*\2\2_"+
		"\16\3\2\2\2`a\7+\2\2a\20\3\2\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f"+
		"\22\3\2\2\2gh\7h\2\2hi\7q\2\2ij\7t\2\2j\24\3\2\2\2kl\7}\2\2l\26\3\2\2"+
		"\2mn\7\177\2\2n\30\3\2\2\2op\7-\2\2pq\7-\2\2q\32\3\2\2\2rs\7/\2\2st\7"+
		"/\2\2t\34\3\2\2\2uv\7\60\2\2v\36\3\2\2\2wx\7x\2\2xy\7c\2\2yz\7t\2\2z "+
		"\3\2\2\2{\177\t\2\2\2|~\t\3\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\t\4\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086$\3\2\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\7\60\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091&\3\2\2\2"+
		"\u0092\u0093\7-\2\2\u0093(\3\2\2\2\u0094\u0095\7/\2\2\u0095*\3\2\2\2\u0096"+
		"\u0097\7,\2\2\u0097,\3\2\2\2\u0098\u0099\7\61\2\2\u0099.\3\2\2\2\u009a"+
		"\u009b\7\'\2\2\u009b\60\3\2\2\2\u009c\u009d\7>\2\2\u009d\u009e\7?\2\2"+
		"\u009e\62\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7?\2\2\u00a1\64\3\2\2"+
		"\2\u00a2\u00a3\7@\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7>\2\2\u00a58\3\2\2"+
		"\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7?\2\2\u00a8:\3\2\2\2\u00a9\u00aa\7"+
		"?\2\2\u00aa\u00ab\7?\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad>\3\2"+
		"\2\2\u00ae\u00af\7\u0080\2\2\u00af@\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1B"+
		"\3\2\2\2\u00b2\u00b4\7\17\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\b\"\2\2\u00b8D\3\2\2\2\u00b9\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\b#\2\2\u00bfF\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2"+
		"\7,\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\7\61\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\b$\3\2\u00cdH\3\2\2\2\u00ce\u00cf\7\61\2\2"+
		"\u00cf\u00d0\7\61\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\n\6\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\f\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\b%\3\2\u00ddJ\3\2\2\2\f\2\177\u0085\u008a\u0090"+
		"\u00b3\u00bc\u00c6\u00d4\u00d8\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}