// Generated from D:/Users/Matu/Documents/NetBeansProjects/ANTLR-Compiler/src/main/antlr\Yalaco.g4 by ANTLR 4.9.1
package antlr;

	import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YalacoParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_assignStatement = 2, RULE_ifStatement = 3, 
		RULE_whileStatement = 4, RULE_printStatement = 5, RULE_printLineStatement = 6, 
		RULE_expression = 7, RULE_truncExpression = 8, RULE_data = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "assignStatement", "ifStatement", "whileStatement", 
			"printStatement", "printLineStatement", "expression", "truncExpression", 
			"data"
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

	@Override
	public String getGrammarFileName() { return "Yalaco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		HashMap<String, Object> tabla;

	public YalacoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << LOGIC) | (1L << PRINT) | (1L << PRINTLN) | (1L << TRUNC) | (1L << ID) | (1L << NUMBER) | (1L << NOT) | (1L << PAR_OPEN))) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
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

	public static class StatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public AssignStatementContext assignStatement;
		public IfStatementContext ifStatement;
		public WhileStatementContext whileStatement;
		public PrintStatementContext printStatement;
		public PrintLineStatementContext printLineStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintLineStatementContext printLineStatement() {
			return getRuleContext(PrintLineStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).expression.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).assignStatement.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).ifStatement.node; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).whileStatement.node; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				((StatementContext)_localctx).printStatement = printStatement();
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).printStatement.node; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				((StatementContext)_localctx).printLineStatement = printLineStatement();
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).printLineStatement.node; 
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

	public static class AssignStatementContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(YalacoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(YalacoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(YalacoParser.EOL, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((AssignStatementContext)_localctx).ID = match(ID);
			setState(47);
			match(ASSIGN);
			setState(48);
			((AssignStatementContext)_localctx).expression = expression(0);
			setState(49);
			match(EOL);
			 ((AssignStatementContext)_localctx).node =  new AssignStatement((((AssignStatementContext)_localctx).ID!=null?((AssignStatementContext)_localctx).ID.getText():null), ((AssignStatementContext)_localctx).expression.node); 
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

	public static class IfStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode IF() { return getToken(YalacoParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(YalacoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(YalacoParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRK_OPEN() { return getTokens(YalacoParser.BRK_OPEN); }
		public TerminalNode BRK_OPEN(int i) {
			return getToken(YalacoParser.BRK_OPEN, i);
		}
		public List<TerminalNode> BRK_CLOSE() { return getTokens(YalacoParser.BRK_CLOSE); }
		public TerminalNode BRK_CLOSE(int i) {
			return getToken(YalacoParser.BRK_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(YalacoParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);

		    ArrayList<ASTNode> ifBlock = new ArrayList<ASTNode>();
			ArrayList<ASTNode> elseBlock = new ArrayList<ASTNode>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IF);
			setState(53);
			match(PAR_OPEN);
			setState(54);
			((IfStatementContext)_localctx).expression = expression(0);
			setState(55);
			match(PAR_CLOSE);
			setState(56);
			match(BRK_OPEN);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				((IfStatementContext)_localctx).s1 = statement();
				 ifBlock.add(((IfStatementContext)_localctx).s1.node); 
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << LOGIC) | (1L << PRINT) | (1L << PRINTLN) | (1L << TRUNC) | (1L << ID) | (1L << NUMBER) | (1L << NOT) | (1L << PAR_OPEN))) != 0) );
			setState(64);
			match(BRK_CLOSE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(65);
				match(ELSE);
				setState(66);
				match(BRK_OPEN);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					((IfStatementContext)_localctx).s2 = statement();
					 elseBlock.add(((IfStatementContext)_localctx).s2.node); 
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << LOGIC) | (1L << PRINT) | (1L << PRINTLN) | (1L << TRUNC) | (1L << ID) | (1L << NUMBER) | (1L << NOT) | (1L << PAR_OPEN))) != 0) );
				setState(74);
				match(BRK_CLOSE);
				}
			}

			 ((IfStatementContext)_localctx).node =  new IfStatement(((IfStatementContext)_localctx).expression.node, ifBlock, elseBlock); 
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public StatementContext s;
		public TerminalNode WHILE() { return getToken(YalacoParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(YalacoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(YalacoParser.PAR_CLOSE, 0); }
		public TerminalNode BRK_OPEN() { return getToken(YalacoParser.BRK_OPEN, 0); }
		public TerminalNode BRK_CLOSE() { return getToken(YalacoParser.BRK_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStatement);
		 ArrayList<ASTNode> statementBlock = new ArrayList<ASTNode>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(WHILE);
			setState(81);
			match(PAR_OPEN);
			setState(82);
			((WhileStatementContext)_localctx).expression = expression(0);
			setState(83);
			match(PAR_CLOSE);
			setState(84);
			match(BRK_OPEN);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				((WhileStatementContext)_localctx).s = statement();
				 statementBlock.add(((WhileStatementContext)_localctx).s.node);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << LOGIC) | (1L << PRINT) | (1L << PRINTLN) | (1L << TRUNC) | (1L << ID) | (1L << NUMBER) | (1L << NOT) | (1L << PAR_OPEN))) != 0) );
			setState(92);
			match(BRK_CLOSE);
			 ((WhileStatementContext)_localctx).node =  new WhileStatement(((WhileStatementContext)_localctx).expression.node, statementBlock); 
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

	public static class PrintStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(YalacoParser.PRINT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(YalacoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(YalacoParser.PAR_CLOSE, 0); }
		public TerminalNode EOL() { return getToken(YalacoParser.EOL, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(PRINT);
			setState(96);
			match(PAR_OPEN);
			setState(97);
			((PrintStatementContext)_localctx).expression = expression(0);
			setState(98);
			match(PAR_CLOSE);
			setState(99);
			match(EOL);
			 ((PrintStatementContext)_localctx).node =  new PrintStatement(((PrintStatementContext)_localctx).expression.node); 
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

	public static class PrintLineStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(YalacoParser.PRINTLN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(YalacoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(YalacoParser.PAR_CLOSE, 0); }
		public TerminalNode EOL() { return getToken(YalacoParser.EOL, 0); }
		public PrintLineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printLineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterPrintLineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitPrintLineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitPrintLineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintLineStatementContext printLineStatement() throws RecognitionException {
		PrintLineStatementContext _localctx = new PrintLineStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printLineStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PRINTLN);
			setState(103);
			match(PAR_OPEN);
			setState(104);
			((PrintLineStatementContext)_localctx).expression = expression(0);
			setState(105);
			match(PAR_CLOSE);
			setState(106);
			match(EOL);
			 ((PrintLineStatementContext)_localctx).node =  new PrintLineStatement(((PrintLineStatementContext)_localctx).expression.node); 
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
		public ASTNode node;
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext expression;
		public TruncExpressionContext truncExpression;
		public DataContext data;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(YalacoParser.NOT, 0); }
		public TruncExpressionContext truncExpression() {
			return getRuleContext(TruncExpressionContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode MUL() { return getToken(YalacoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YalacoParser.DIV, 0); }
		public TerminalNode SUM() { return getToken(YalacoParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(YalacoParser.SUB, 0); }
		public TerminalNode GRE() { return getToken(YalacoParser.GRE, 0); }
		public TerminalNode LES() { return getToken(YalacoParser.LES, 0); }
		public TerminalNode GEQ() { return getToken(YalacoParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(YalacoParser.LEQ, 0); }
		public TerminalNode EQU() { return getToken(YalacoParser.EQU, 0); }
		public TerminalNode NEQ() { return getToken(YalacoParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(YalacoParser.AND, 0); }
		public TerminalNode OR() { return getToken(YalacoParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(110);
				((ExpressionContext)_localctx).op = match(NOT);
				setState(111);
				((ExpressionContext)_localctx).expression = expression(9);

				 		((ExpressionContext)_localctx).node =  new LogicalExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).expression.node, null);
				 	
				}
				break;
			case TRUNC:
				{
				setState(114);
				((ExpressionContext)_localctx).truncExpression = truncExpression();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).truncExpression.node; 
				}
				break;
			case STRING:
			case LOGIC:
			case ID:
			case NUMBER:
			case PAR_OPEN:
				{
				setState(117);
				((ExpressionContext)_localctx).data = data();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).data.node; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(124);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);

						           		((ExpressionContext)_localctx).node =  new ArithmeticExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						           	
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(130);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);

						           		((ExpressionContext)_localctx).node =  new ArithmeticExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						           	
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(136);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRE) | (1L << LES) | (1L << GEQ) | (1L << LEQ))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);

						           		((ExpressionContext)_localctx).node =  new ComparativeExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						           	
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(142);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NEQ || _la==EQU) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);

						                  ((ExpressionContext)_localctx).node =  new ComparativeExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						              
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(148);
						((ExpressionContext)_localctx).op = match(AND);
						setState(149);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(5);

						           		((ExpressionContext)_localctx).node =  new LogicalExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						           	
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(154);
						((ExpressionContext)_localctx).op = match(OR);
						setState(155);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(4);

						           		((ExpressionContext)_localctx).node =  new LogicalExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						           	
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TruncExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode TRUNC() { return getToken(YalacoParser.TRUNC, 0); }
		public TerminalNode PAR_OPEN() { return getToken(YalacoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(YalacoParser.PAR_CLOSE, 0); }
		public TruncExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterTruncExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitTruncExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitTruncExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncExpressionContext truncExpression() throws RecognitionException {
		TruncExpressionContext _localctx = new TruncExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_truncExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TRUNC);
			setState(164);
			match(PAR_OPEN);
			setState(165);
			((TruncExpressionContext)_localctx).expression = expression(0);
			setState(166);
			match(PAR_CLOSE);
			 ((TruncExpressionContext)_localctx).node =  new TruncExpression(((TruncExpressionContext)_localctx).expression.node); 
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

	public static class DataContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public Token LOGIC;
		public Token NUMBER;
		public Token ID;
		public Token STRING;
		public TerminalNode PAR_OPEN() { return getToken(YalacoParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(YalacoParser.PAR_CLOSE, 0); }
		public TerminalNode LOGIC() { return getToken(YalacoParser.LOGIC, 0); }
		public TerminalNode NUMBER() { return getToken(YalacoParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(YalacoParser.ID, 0); }
		public TerminalNode STRING() { return getToken(YalacoParser.STRING, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YalacoListener ) ((YalacoListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YalacoVisitor ) return ((YalacoVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(PAR_OPEN);
				setState(170);
				((DataContext)_localctx).expression = expression(0);
				((DataContext)_localctx).node =  ((DataContext)_localctx).expression.node; 
				setState(172);
				match(PAR_CLOSE);
				}
				break;
			case LOGIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((DataContext)_localctx).LOGIC = match(LOGIC);
				 ((DataContext)_localctx).node =  new Constant(Boolean.parseBoolean((((DataContext)_localctx).LOGIC!=null?((DataContext)_localctx).LOGIC.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				((DataContext)_localctx).NUMBER = match(NUMBER);
				 ((DataContext)_localctx).node =  new Constant(Double.parseDouble((((DataContext)_localctx).NUMBER!=null?((DataContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				((DataContext)_localctx).ID = match(ID);
				 ((DataContext)_localctx).node =  new VariableExpression(String.valueOf((((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getText():null))); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				((DataContext)_localctx).STRING = match(STRING);
				 ((DataContext)_localctx).node =  new Constant(String.format("\"%s\"", (((DataContext)_localctx).STRING!=null?((DataContext)_localctx).STRING.getText():null))); 
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5?\n\5\r\5\16\5@\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\6\5I\n\5\r\5\16\5J\3\5\3\5\5\5O\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\6\6[\n\6\r\6\16\6\\\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00b9\n\13\3\13\2\3\20\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\22\23"+
		"\3\2\20\21\3\2\26\31\3\2\32\33\2\u00c6\2\31\3\2\2\2\4.\3\2\2\2\6\60\3"+
		"\2\2\2\b\66\3\2\2\2\nR\3\2\2\2\fa\3\2\2\2\16h\3\2\2\2\20z\3\2\2\2\22\u00a5"+
		"\3\2\2\2\24\u00b8\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34\35\5\20\t\2\35"+
		"\36\b\3\1\2\36/\3\2\2\2\37 \5\6\4\2 !\b\3\1\2!/\3\2\2\2\"#\5\b\5\2#$\b"+
		"\3\1\2$/\3\2\2\2%&\5\n\6\2&\'\b\3\1\2\'/\3\2\2\2()\5\f\7\2)*\b\3\1\2*"+
		"/\3\2\2\2+,\5\16\b\2,-\b\3\1\2-/\3\2\2\2.\34\3\2\2\2.\37\3\2\2\2.\"\3"+
		"\2\2\2.%\3\2\2\2.(\3\2\2\2.+\3\2\2\2/\5\3\2\2\2\60\61\7\16\2\2\61\62\7"+
		"\f\2\2\62\63\5\20\t\2\63\64\7\r\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67\7"+
		"\3\2\2\678\7\37\2\289\5\20\t\29:\7 \2\2:>\7!\2\2;<\5\4\3\2<=\b\5\1\2="+
		"?\3\2\2\2>;\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BN\7\"\2\2"+
		"CD\7\4\2\2DH\7!\2\2EF\5\4\3\2FG\b\5\1\2GI\3\2\2\2HE\3\2\2\2IJ\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\"\2\2MO\3\2\2\2NC\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PQ\b\5\1\2Q\t\3\2\2\2RS\7\5\2\2ST\7\37\2\2TU\5\20\t\2UV\7 \2"+
		"\2VZ\7!\2\2WX\5\4\3\2XY\b\6\1\2Y[\3\2\2\2ZW\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\"\2\2_`\b\6\1\2`\13\3\2\2\2ab\7\t\2\2bc"+
		"\7\37\2\2cd\5\20\t\2de\7 \2\2ef\7\r\2\2fg\b\7\1\2g\r\3\2\2\2hi\7\n\2\2"+
		"ij\7\37\2\2jk\5\20\t\2kl\7 \2\2lm\7\r\2\2mn\b\b\1\2n\17\3\2\2\2op\b\t"+
		"\1\2pq\7\36\2\2qr\5\20\t\13rs\b\t\1\2s{\3\2\2\2tu\5\22\n\2uv\b\t\1\2v"+
		"{\3\2\2\2wx\5\24\13\2xy\b\t\1\2y{\3\2\2\2zo\3\2\2\2zt\3\2\2\2zw\3\2\2"+
		"\2{\u00a2\3\2\2\2|}\f\n\2\2}~\b\t\1\2~\177\t\2\2\2\177\u0080\5\20\t\13"+
		"\u0080\u0081\b\t\1\2\u0081\u00a1\3\2\2\2\u0082\u0083\f\t\2\2\u0083\u0084"+
		"\b\t\1\2\u0084\u0085\t\3\2\2\u0085\u0086\5\20\t\n\u0086\u0087\b\t\1\2"+
		"\u0087\u00a1\3\2\2\2\u0088\u0089\f\b\2\2\u0089\u008a\b\t\1\2\u008a\u008b"+
		"\t\4\2\2\u008b\u008c\5\20\t\t\u008c\u008d\b\t\1\2\u008d\u00a1\3\2\2\2"+
		"\u008e\u008f\f\7\2\2\u008f\u0090\b\t\1\2\u0090\u0091\t\5\2\2\u0091\u0092"+
		"\5\20\t\b\u0092\u0093\b\t\1\2\u0093\u00a1\3\2\2\2\u0094\u0095\f\6\2\2"+
		"\u0095\u0096\b\t\1\2\u0096\u0097\7\34\2\2\u0097\u0098\5\20\t\7\u0098\u0099"+
		"\b\t\1\2\u0099\u00a1\3\2\2\2\u009a\u009b\f\5\2\2\u009b\u009c\b\t\1\2\u009c"+
		"\u009d\7\35\2\2\u009d\u009e\5\20\t\6\u009e\u009f\b\t\1\2\u009f\u00a1\3"+
		"\2\2\2\u00a0|\3\2\2\2\u00a0\u0082\3\2\2\2\u00a0\u0088\3\2\2\2\u00a0\u008e"+
		"\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a2\3\2\2"+
		"\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\7\37\2\2\u00a7\u00a8\5\20\t\2\u00a8"+
		"\u00a9\7 \2\2\u00a9\u00aa\b\n\1\2\u00aa\23\3\2\2\2\u00ab\u00ac\7\37\2"+
		"\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\b\13\1\2\u00ae\u00af\7 \2\2\u00af"+
		"\u00b9\3\2\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00b9\b\13\1\2\u00b2\u00b3\7"+
		"\17\2\2\u00b3\u00b9\b\13\1\2\u00b4\u00b5\7\16\2\2\u00b5\u00b9\b\13\1\2"+
		"\u00b6\u00b7\7\7\2\2\u00b7\u00b9\b\13\1\2\u00b8\u00ab\3\2\2\2\u00b8\u00b0"+
		"\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\25\3\2\2\2\f\31.@JN\\z\u00a0\u00a2\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}