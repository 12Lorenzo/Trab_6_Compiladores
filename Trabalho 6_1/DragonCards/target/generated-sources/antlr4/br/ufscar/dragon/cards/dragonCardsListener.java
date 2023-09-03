// Generated from br/ufscar/dragon/cards/dragonCards.g4 by ANTLR 4.13.0
package br.ufscar.dragon.cards;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dragonCardsParser}.
 */
public interface dragonCardsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(dragonCardsParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(dragonCardsParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(dragonCardsParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(dragonCardsParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#declaracao_equipe}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_equipe(dragonCardsParser.Declaracao_equipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#declaracao_equipe}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_equipe(dragonCardsParser.Declaracao_equipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#declaracao_chefe}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_chefe(dragonCardsParser.Declaracao_chefeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#declaracao_chefe}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_chefe(dragonCardsParser.Declaracao_chefeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(dragonCardsParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(dragonCardsParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#cmdLutar}.
	 * @param ctx the parse tree
	 */
	void enterCmdLutar(dragonCardsParser.CmdLutarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#cmdLutar}.
	 * @param ctx the parse tree
	 */
	void exitCmdLutar(dragonCardsParser.CmdLutarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dragonCardsParser#cmdProxima}.
	 * @param ctx the parse tree
	 */
	void enterCmdProxima(dragonCardsParser.CmdProximaContext ctx);
	/**
	 * Exit a parse tree produced by {@link dragonCardsParser#cmdProxima}.
	 * @param ctx the parse tree
	 */
	void exitCmdProxima(dragonCardsParser.CmdProximaContext ctx);
}