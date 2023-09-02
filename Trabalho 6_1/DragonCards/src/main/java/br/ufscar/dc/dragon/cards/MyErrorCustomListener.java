package br.ufscar.dc.dragon.cards;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.atn.ATNConfigSet;


import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import br.ufscar.dragon.cards.dragonCardsLexer;

public class MyErrorCustomListener implements ANTLRErrorListener{
    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }
    
    // Verifica os erros, se é sintático ou semântico e grava no arquivo de saída a mensagem correspondente
    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Verifica o token que ocorreu o erro
        Token t = (Token) offendingSymbol;
         
        switch(dragonCardsLexer.VOCABULARY.getDisplayName(t.getType())) {
            // Verifica erros gerais que não são especificados por nenhuma outra regra léxica
            case "ERRO":
              GeradorHTML.AdicionaString("                    <div id=\"erros\">" + "Erro sintático próximo à " + t.getText() + "</div>\n");
              return;
            default:
                if(!t.getText().equals("<EOF>")){
                     // Mostra mensagem de erro sintático e salva no arquivo de saída
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + "Erro sintático próximo à " + t.getText() + "</div>\n");
                }
        }
    }
}
