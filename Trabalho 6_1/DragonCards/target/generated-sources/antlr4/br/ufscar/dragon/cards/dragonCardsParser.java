// Generated from br/ufscar/dragon/cards/dragonCards.g4 by ANTLR 4.13.0
package br.ufscar.dragon.cards;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dragonCardsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PalavrasChave=11, VIRGULA=12, DOISPONTOS=13, Abre=14, Fecha=15, 
		Tipo=16, Nome=17, Poder=18, COMENTARIO=19, WS=20, ERRO=21;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracao_equipe = 2, RULE_declaracao_chefe = 3, 
		RULE_acao = 4, RULE_cmdLutar = 5, RULE_cmdProxima = 6, RULE_cmdDesistir = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declaracao_equipe", "declaracao_chefe", "acao", 
			"cmdLutar", "cmdProxima", "cmdDesistir"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dragao equipe'", "'nome'", "'tipo'", "'poder'", "'fim equipe'", 
			"'dragao chefe'", "'fim chefe'", "'Lutar'", "'Proxima'", "'Desistir'", 
			null, "','", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PalavrasChave", 
			"VIRGULA", "DOISPONTOS", "Abre", "Fecha", "Tipo", "Nome", "Poder", "COMENTARIO", 
			"WS", "ERRO"
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
	public String getGrammarFileName() { return "dragonCards.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dragonCardsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			corpo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public Declaracao_chefeContext declaracao_chefe() {
			return getRuleContext(Declaracao_chefeContext.class,0);
		}
		public List<Declaracao_equipeContext> declaracao_equipe() {
			return getRuleContexts(Declaracao_equipeContext.class);
		}
		public Declaracao_equipeContext declaracao_equipe(int i) {
			return getRuleContext(Declaracao_equipeContext.class,i);
		}
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				declaracao_equipe();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(23);
			declaracao_chefe();
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				acao();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_equipeContext extends ParserRuleContext {
		public List<TerminalNode> DOISPONTOS() { return getTokens(dragonCardsParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(dragonCardsParser.DOISPONTOS, i);
		}
		public TerminalNode Nome() { return getToken(dragonCardsParser.Nome, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(dragonCardsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(dragonCardsParser.VIRGULA, i);
		}
		public TerminalNode Tipo() { return getToken(dragonCardsParser.Tipo, 0); }
		public TerminalNode Poder() { return getToken(dragonCardsParser.Poder, 0); }
		public Declaracao_equipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_equipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterDeclaracao_equipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitDeclaracao_equipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitDeclaracao_equipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_equipeContext declaracao_equipe() throws RecognitionException {
		Declaracao_equipeContext _localctx = new Declaracao_equipeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_equipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(T__1);
			setState(31);
			match(DOISPONTOS);
			setState(32);
			match(Nome);
			setState(33);
			match(VIRGULA);
			setState(34);
			match(T__2);
			setState(35);
			match(DOISPONTOS);
			setState(36);
			match(Tipo);
			setState(37);
			match(VIRGULA);
			setState(38);
			match(T__3);
			setState(39);
			match(DOISPONTOS);
			setState(40);
			match(Poder);
			setState(41);
			match(VIRGULA);
			setState(42);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_chefeContext extends ParserRuleContext {
		public List<TerminalNode> DOISPONTOS() { return getTokens(dragonCardsParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(dragonCardsParser.DOISPONTOS, i);
		}
		public TerminalNode Nome() { return getToken(dragonCardsParser.Nome, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(dragonCardsParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(dragonCardsParser.VIRGULA, i);
		}
		public TerminalNode Tipo() { return getToken(dragonCardsParser.Tipo, 0); }
		public TerminalNode Poder() { return getToken(dragonCardsParser.Poder, 0); }
		public Declaracao_chefeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_chefe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterDeclaracao_chefe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitDeclaracao_chefe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitDeclaracao_chefe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_chefeContext declaracao_chefe() throws RecognitionException {
		Declaracao_chefeContext _localctx = new Declaracao_chefeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_chefe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__5);
			setState(45);
			match(T__1);
			setState(46);
			match(DOISPONTOS);
			setState(47);
			match(Nome);
			setState(48);
			match(VIRGULA);
			setState(49);
			match(T__2);
			setState(50);
			match(DOISPONTOS);
			setState(51);
			match(Tipo);
			setState(52);
			match(VIRGULA);
			setState(53);
			match(T__3);
			setState(54);
			match(DOISPONTOS);
			setState(55);
			match(Poder);
			setState(56);
			match(VIRGULA);
			setState(57);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AcaoContext extends ParserRuleContext {
		public CmdLutarContext cmdLutar() {
			return getRuleContext(CmdLutarContext.class,0);
		}
		public CmdDesistirContext cmdDesistir() {
			return getRuleContext(CmdDesistirContext.class,0);
		}
		public CmdProximaContext cmdProxima() {
			return getRuleContext(CmdProximaContext.class,0);
		}
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitAcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_acao);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				cmdLutar();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				cmdDesistir();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				cmdProxima();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLutarContext extends ParserRuleContext {
		public TerminalNode Abre() { return getToken(dragonCardsParser.Abre, 0); }
		public TerminalNode Nome() { return getToken(dragonCardsParser.Nome, 0); }
		public TerminalNode Fecha() { return getToken(dragonCardsParser.Fecha, 0); }
		public CmdLutarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLutar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterCmdLutar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitCmdLutar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitCmdLutar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLutarContext cmdLutar() throws RecognitionException {
		CmdLutarContext _localctx = new CmdLutarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdLutar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__7);
			setState(65);
			match(Abre);
			setState(66);
			match(Nome);
			setState(67);
			match(Fecha);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdProximaContext extends ParserRuleContext {
		public TerminalNode Abre() { return getToken(dragonCardsParser.Abre, 0); }
		public TerminalNode Nome() { return getToken(dragonCardsParser.Nome, 0); }
		public TerminalNode Fecha() { return getToken(dragonCardsParser.Fecha, 0); }
		public CmdProximaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdProxima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterCmdProxima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitCmdProxima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitCmdProxima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdProximaContext cmdProxima() throws RecognitionException {
		CmdProximaContext _localctx = new CmdProximaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdProxima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__8);
			setState(70);
			match(Abre);
			setState(71);
			match(Nome);
			setState(72);
			match(Fecha);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdDesistirContext extends ParserRuleContext {
		public CmdDesistirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDesistir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).enterCmdDesistir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dragonCardsListener ) ((dragonCardsListener)listener).exitCmdDesistir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dragonCardsVisitor ) return ((dragonCardsVisitor<? extends T>)visitor).visitCmdDesistir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdDesistirContext cmdDesistir() throws RecognitionException {
		CmdDesistirContext _localctx = new CmdDesistirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdDesistir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__9);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001\f"+
		"\u0001\u0015\u0001\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001"+
		"\f\u0001\u001b\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004?\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000"+
		"H\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000"+
		"\u0004\u001d\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		">\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000"+
		"\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000"+
		"\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000"+
		"\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0003\u0006\u0003\u0000"+
		"\u0018\u001a\u0003\b\u0004\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f"+
		" \u0005\r\u0000\u0000 !\u0005\u0011\u0000\u0000!\"\u0005\f\u0000\u0000"+
		"\"#\u0005\u0003\u0000\u0000#$\u0005\r\u0000\u0000$%\u0005\u0010\u0000"+
		"\u0000%&\u0005\f\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\r\u0000"+
		"\u0000()\u0005\u0012\u0000\u0000)*\u0005\f\u0000\u0000*+\u0005\u0005\u0000"+
		"\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000-.\u0005"+
		"\u0002\u0000\u0000./\u0005\r\u0000\u0000/0\u0005\u0011\u0000\u000001\u0005"+
		"\f\u0000\u000012\u0005\u0003\u0000\u000023\u0005\r\u0000\u000034\u0005"+
		"\u0010\u0000\u000045\u0005\f\u0000\u000056\u0005\u0004\u0000\u000067\u0005"+
		"\r\u0000\u000078\u0005\u0012\u0000\u000089\u0005\f\u0000\u00009:\u0005"+
		"\u0007\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;?\u0003\n\u0005\u0000"+
		"<?\u0003\u000e\u0007\u0000=?\u0003\f\u0006\u0000>;\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000"+
		"\u0000@A\u0005\b\u0000\u0000AB\u0005\u000e\u0000\u0000BC\u0005\u0011\u0000"+
		"\u0000CD\u0005\u000f\u0000\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0005"+
		"\t\u0000\u0000FG\u0005\u000e\u0000\u0000GH\u0005\u0011\u0000\u0000HI\u0005"+
		"\u000f\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0005\n\u0000\u0000K\u000f"+
		"\u0001\u0000\u0000\u0000\u0003\u0015\u001b>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}