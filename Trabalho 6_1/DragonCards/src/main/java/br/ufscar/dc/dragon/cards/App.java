package br.ufscar.dc.dragon.cards;

import org.antlr.v4.runtime.CharStreams;

import br.ufscar.dragon.cards.dragonCardsLexer;
import br.ufscar.dragon.cards.dragonCardsParser;
import br.ufscar.dragon.cards.dragonCardsParser.ProgramaContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        GeradorHTML.criaArquivo(args[1]);
       
        // Leitura de characteres por arquivo (arquivo no args[0])
        CharStream cs = CharStreams.fromFileName(args[0]);
        
        // Variável de tratamento do analizador léxico
        dragonCardsLexer lex = new dragonCardsLexer(cs);
            
        // Criação parser
        CommonTokenStream tokens = new CommonTokenStream(lex);
        dragonCardsParser parser = new dragonCardsParser(tokens);
        
        // Registrar o error lister personalizado aqui
        parser.removeErrorListeners();
        MyErrorCustomListener mcel = new MyErrorCustomListener();
        parser.addErrorListener(mcel);
            
        // Criação semântico
        ProgramaContext arvore = parser.programa();
        DragonCardsSemantico as = new DragonCardsSemantico();
        as.visitPrograma(arvore);
            
        parser.programa();
            
        GeradorHTML.gravaArquivo();
    }
}
