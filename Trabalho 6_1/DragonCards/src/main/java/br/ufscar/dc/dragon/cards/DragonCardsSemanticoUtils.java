package br.ufscar.dc.dragon.cards;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.ufscar.dragon.cards.dragonCardsParser;

public class DragonCardsSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    // adiciona erro semântico na lista de erros
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    // Verifica se o tipo existe, se não classifica como inválido
    public static TabelaSimbolos.Tipo verificarTipo(TabelaSimbolos tabela, dragonCardsParser.Declaracao_equipeContext ctx) {
        String tipo = ctx.Tipo().getText();

        switch (tipo) {
            //Classico, Oriental, Wyvern, Drake, Lindwrum, Amphiptere;
            case "classico":
                return TabelaSimbolos.Tipo.CLASSICO;

            case "oriental":
                return TabelaSimbolos.Tipo.ORIENTAL;

            case "wyvern":
                return TabelaSimbolos.Tipo.WYVERN;

            case "drake":
                return TabelaSimbolos.Tipo.DRAKE;

            case "lindwrum":
                return TabelaSimbolos.Tipo.LINDWRUM;

            case "amphiptere":
                return TabelaSimbolos.Tipo.AMPHIPTERE;

            default:
                return TabelaSimbolos.Tipo.INVALIDO;
        }
    }
    
    public static TabelaSimbolos.Tipo verificarTipo(TabelaSimbolos tabela, dragonCardsParser.Declaracao_chefeContext ctx) {
        String tipo = ctx.Tipo().getText();

        switch (tipo) {
            case "classico":
                return TabelaSimbolos.Tipo.CLASSICO;

            case "oriental":
                return TabelaSimbolos.Tipo.ORIENTAL;

            case "wyvern":
                return TabelaSimbolos.Tipo.WYVERN;

            case "drake":
                return TabelaSimbolos.Tipo.DRAKE;

            case "lindwrum":
                return TabelaSimbolos.Tipo.LINDWRUM;

            case "amphiptere":
                return TabelaSimbolos.Tipo.AMPHIPTERE;

            default:
                return TabelaSimbolos.Tipo.INVALIDO;
        }
    }
}
