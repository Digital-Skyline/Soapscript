// Generated from Soapscript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoapscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, INT=29, FLOAT=30, IF=31, ELSE=32, 
		FOR=33, WHILE=34, BUBBLE=35, CLEAN=36, VAR=37, NEWLINE=38, WS=39, COMMENT=40, 
		LINE_COMMENT=41;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_block = 2, RULE_stmt_list = 3, 
		RULE_stmt = 4, RULE_if_stmt = 5, RULE_for_stmt = 6, RULE_while_stmt = 7, 
		RULE_bubble_stmt = 8, RULE_clean_stmt = 9, RULE_stmt_expr = 10, RULE_expr = 11, 
		RULE_primary = 12, RULE_assignment = 13, RULE_variable = 14, RULE_declarations = 15, 
		RULE_decl_list = 16, RULE_decl = 17, RULE_var_list = 18, RULE_var_id = 19, 
		RULE_type_id = 20, RULE_var_declarator = 21;
	public static final String[] ruleNames = {
		"program", "header", "block", "stmt_list", "stmt", "if_stmt", "for_stmt", 
		"while_stmt", "bubble_stmt", "clean_stmt", "stmt_expr", "expr", "primary", 
		"assignment", "variable", "declarations", "decl_list", "decl", "var_list", 
		"var_id", "type_id", "var_declarator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "';'", "'end'", "'.'", "'['", "']'", "'++'", "'--'", 
		"'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<'", "'='", "'>'", 
		"'=='", "'!='", "'&'", "'^'", "'|'", "'('", "')'", "':'", "','", null, 
		null, null, "'if'", "'else'", "'for'", "'while'", "'bubble'", "'clean'", 
		"'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "INT", "FLOAT", "IF", "ELSE", "FOR", "WHILE", 
		"BUBBLE", "CLEAN", "VAR", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Soapscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SoapscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			header();
			setState(45);
			block();
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(49);
			match(T__1);
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

	public static class BlockContext extends ParserRuleContext {
		public List<Stmt_listContext> stmt_list() {
			return getRuleContexts(Stmt_listContext.class);
		}
		public Stmt_listContext stmt_list(int i) {
			return getRuleContext(Stmt_listContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__23) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BUBBLE) | (1L << CLEAN))) != 0)) {
				{
				{
				setState(51);
				stmt_list();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__2);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			stmt();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(T__1);
					setState(61);
					stmt();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Bubble_stmtContext bubble_stmt() {
			return getRuleContext(Bubble_stmtContext.class,0);
		}
		public Clean_stmtContext clean_stmt() {
			return getRuleContext(Clean_stmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				for_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				while_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				bubble_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				clean_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				assignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				match(T__1);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SoapscriptParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SoapscriptParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IF);
			setState(78);
			expr(0);
			setState(79);
			stmt();
			{
			setState(80);
			match(ELSE);
			setState(81);
			stmt();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SoapscriptParser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FOR);
			setState(84);
			expr(0);
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SoapscriptParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(WHILE);
			setState(87);
			expr(0);
			setState(88);
			stmt();
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

	public static class Bubble_stmtContext extends ParserRuleContext {
		public TerminalNode BUBBLE() { return getToken(SoapscriptParser.BUBBLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bubble_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bubble_stmt; }
	}

	public final Bubble_stmtContext bubble_stmt() throws RecognitionException {
		Bubble_stmtContext _localctx = new Bubble_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bubble_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(BUBBLE);
			setState(91);
			expr(0);
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

	public static class Clean_stmtContext extends ParserRuleContext {
		public TerminalNode CLEAN() { return getToken(SoapscriptParser.CLEAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Clean_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clean_stmt; }
	}

	public final Clean_stmtContext clean_stmt() throws RecognitionException {
		Clean_stmtContext _localctx = new Clean_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clean_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CLEAN);
			setState(94);
			expr(0);
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

	public static class Stmt_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stmt_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_expr; }
	}

	public final Stmt_exprContext stmt_expr() throws RecognitionException {
		Stmt_exprContext _localctx = new Stmt_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case ID:
			case INT:
			case FLOAT:
				{
				setState(99);
				primary();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				{
				setState(100);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				expr(9);
				}
				break;
			case T__10:
			case T__11:
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				expr(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(107);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(110);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(119);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(113);
							match(T__15);
							setState(114);
							match(T__16);
							}
							break;
						case 2:
							{
							setState(115);
							match(T__17);
							setState(116);
							match(T__16);
							}
							break;
						case 3:
							{
							setState(117);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(118);
							match(T__15);
							}
							break;
						}
						setState(121);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						match(T__20);
						setState(127);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						match(T__21);
						setState(130);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(132);
						match(T__22);
						setState(133);
						expr(2);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(135);
						match(T__3);
						setState(136);
						match(ID);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(138);
						match(T__4);
						setState(139);
						expr(0);
						setState(140);
						match(T__5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(143);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
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
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(SoapscriptParser.INT, 0); }
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(SoapscriptParser.FLOAT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__23);
				setState(150);
				expr(0);
				setState(151);
				match(T__24);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(ID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(FLOAT);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			variable();
			setState(159);
			match(T__16);
			setState(160);
			expr(0);
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

	public static class VariableContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				type_id();
				setState(163);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(ID);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SoapscriptParser.VAR, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(VAR);
			setState(169);
			decl_list();
			setState(170);
			match(T__1);
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

	public static class Decl_listContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decl_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			decl();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(T__1);
					setState(174);
					decl();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			var_list();
			setState(181);
			match(T__25);
			setState(182);
			type_id();
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

	public static class Var_listContext extends ParserRuleContext {
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			var_id();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(185);
				match(T__26);
				setState(186);
				var_id();
				}
				}
				setState(191);
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

	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
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

	public static class Type_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
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

	public static class Var_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoapscriptParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declarator; }
	}

	public final Var_declaratorContext var_declarator() throws RecognitionException {
		Var_declaratorContext _localctx = new Var_declaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(197);
				match(T__16);
				setState(198);
				expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rk\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\rz\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0093\n\r\f\r\16"+
		"\r\u0096\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009f\n\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u00b2\n\22\f\22\16\22\u00b5\13\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u00be\n\24\f\24\16\24\u00c1\13\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u00ca\n\27\3\27\2\3\30\30\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,\2\b\3\2\t\f\3\2\r\16\3\2\17\21\3\2\13"+
		"\f\3\2\25\26\3\2\t\n\2\u00d4\2.\3\2\2\2\4\61\3\2\2\2\68\3\2\2\2\b=\3\2"+
		"\2\2\nM\3\2\2\2\fO\3\2\2\2\16U\3\2\2\2\20X\3\2\2\2\22\\\3\2\2\2\24_\3"+
		"\2\2\2\26b\3\2\2\2\30j\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a8"+
		"\3\2\2\2 \u00aa\3\2\2\2\"\u00ae\3\2\2\2$\u00b6\3\2\2\2&\u00ba\3\2\2\2"+
		"(\u00c2\3\2\2\2*\u00c4\3\2\2\2,\u00c6\3\2\2\2./\5\4\3\2/\60\5\6\4\2\60"+
		"\3\3\2\2\2\61\62\7\3\2\2\62\63\7\36\2\2\63\64\7\4\2\2\64\5\3\2\2\2\65"+
		"\67\5\b\5\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2"+
		":8\3\2\2\2;<\7\5\2\2<\7\3\2\2\2=B\5\n\6\2>?\7\4\2\2?A\5\n\6\2@>\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2\2\2EN\5\f\7\2FN\5\16"+
		"\b\2GN\5\20\t\2HN\5\22\n\2IN\5\24\13\2JN\5\34\17\2KN\5\30\r\2LN\7\4\2"+
		"\2ME\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2"+
		"\2ML\3\2\2\2N\13\3\2\2\2OP\7!\2\2PQ\5\30\r\2QR\5\n\6\2RS\7\"\2\2ST\5\n"+
		"\6\2T\r\3\2\2\2UV\7#\2\2VW\5\30\r\2W\17\3\2\2\2XY\7$\2\2YZ\5\30\r\2Z["+
		"\5\n\6\2[\21\3\2\2\2\\]\7%\2\2]^\5\30\r\2^\23\3\2\2\2_`\7&\2\2`a\5\30"+
		"\r\2a\25\3\2\2\2bc\5\30\r\2c\27\3\2\2\2de\b\r\1\2ek\5\32\16\2fg\t\2\2"+
		"\2gk\5\30\r\13hi\t\3\2\2ik\5\30\r\njd\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\u0094"+
		"\3\2\2\2lm\f\t\2\2mn\t\4\2\2n\u0093\5\30\r\nop\f\b\2\2pq\t\5\2\2q\u0093"+
		"\5\30\r\try\f\7\2\2st\7\22\2\2tz\7\23\2\2uv\7\24\2\2vz\7\23\2\2wz\7\24"+
		"\2\2xz\7\22\2\2ys\3\2\2\2yu\3\2\2\2yw\3\2\2\2yx\3\2\2\2z{\3\2\2\2{\u0093"+
		"\5\30\r\b|}\f\6\2\2}~\t\6\2\2~\u0093\5\30\r\7\177\u0080\f\5\2\2\u0080"+
		"\u0081\7\27\2\2\u0081\u0093\5\30\r\6\u0082\u0083\f\4\2\2\u0083\u0084\7"+
		"\30\2\2\u0084\u0093\5\30\r\5\u0085\u0086\f\3\2\2\u0086\u0087\7\31\2\2"+
		"\u0087\u0093\5\30\r\4\u0088\u0089\f\16\2\2\u0089\u008a\7\6\2\2\u008a\u0093"+
		"\7\36\2\2\u008b\u008c\f\r\2\2\u008c\u008d\7\7\2\2\u008d\u008e\5\30\r\2"+
		"\u008e\u008f\7\b\2\2\u008f\u0093\3\2\2\2\u0090\u0091\f\f\2\2\u0091\u0093"+
		"\t\7\2\2\u0092l\3\2\2\2\u0092o\3\2\2\2\u0092r\3\2\2\2\u0092|\3\2\2\2\u0092"+
		"\177\3\2\2\2\u0092\u0082\3\2\2\2\u0092\u0085\3\2\2\2\u0092\u0088\3\2\2"+
		"\2\u0092\u008b\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\31\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\32\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7\33\2\2\u009a\u009f"+
		"\3\2\2\2\u009b\u009f\7\37\2\2\u009c\u009f\7\36\2\2\u009d\u009f\7 \2\2"+
		"\u009e\u0097\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7\23\2\2\u00a2"+
		"\u00a3\5\30\r\2\u00a3\35\3\2\2\2\u00a4\u00a5\5*\26\2\u00a5\u00a6\7\36"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\7\36\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\7\'\2\2\u00ab\u00ac\5\"\22"+
		"\2\u00ac\u00ad\7\4\2\2\u00ad!\3\2\2\2\u00ae\u00b3\5$\23\2\u00af\u00b0"+
		"\7\4\2\2\u00b0\u00b2\5$\23\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4#\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b6\u00b7\5&\24\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\5*\26\2\u00b9%\3"+
		"\2\2\2\u00ba\u00bf\5(\25\2\u00bb\u00bc\7\35\2\2\u00bc\u00be\5(\25\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\'\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\36\2\2\u00c3)\3"+
		"\2\2\2\u00c4\u00c5\7\36\2\2\u00c5+\3\2\2\2\u00c6\u00c9\7\36\2\2\u00c7"+
		"\u00c8\7\23\2\2\u00c8\u00ca\5\30\r\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca-\3\2\2\2\168BMjy\u0092\u0094\u009e\u00a8\u00b3\u00bf\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}