package br.ufscar.dc.dragon.cards;

import java.util.HashMap;
import java.util.Map;

public class TabelaSimbolos {
    public enum Tipo{
        CLASSICO, ORIENTAL, WYVERN, DRAKE, LINDWRUM, AMPHIPTERE, INVALIDO;
    }

    class EntradaTabelaDeSimbolos {
        String nome;
        Tipo tipo;
        int poder;
        int codigo;

        private EntradaTabelaDeSimbolos(String nome, Tipo tipo,  int poder, int codigo) {
            this.nome = nome;
            this.tipo = tipo;
            this.poder = poder;
            this.codigo = codigo;
        }
    }
    
    private Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, Tipo tipo, int poder, int codigo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, poder, codigo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public Tipo verificar(String nome) {
        return tabela.get(nome).tipo;
    }
      
    public int verificarPoder(String nome) {
        return tabela.get(nome).poder;
    }
     
    public int verificarCodigo(String nome) {
        return tabela.get(nome).codigo;
    }
}
