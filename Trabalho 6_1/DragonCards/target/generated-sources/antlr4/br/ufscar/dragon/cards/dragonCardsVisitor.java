// Generated from br/ufscar/dragon/cards/dragonCards.g4 by ANTLR 4.13.0
package br.ufscar.dragon.cards;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dragonCardsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dragonCardsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(dragonCardsParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(dragonCardsParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#declaracao_equipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_equipe(dragonCardsParser.Declaracao_equipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#declaracao_chefe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_chefe(dragonCardsParser.Declaracao_chefeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(dragonCardsParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#cmdLutar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLutar(dragonCardsParser.CmdLutarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#cmdProxima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdProxima(dragonCardsParser.CmdProximaContext ctx);
	/**
	 * Visit a parse tree produced by {@link dragonCardsParser#cmdDesistir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdDesistir(dragonCardsParser.CmdDesistirContext ctx);
}