package br.ufscar.dc.dragon.cards;
 
import br.ufscar.dragon.cards.dragonCardsBaseVisitor;
import br.ufscar.dragon.cards.dragonCardsParser;

import br.ufscar.dc.dragon.cards.TabelaSimbolos.Tipo;

public class DragonCardsSemantico extends dragonCardsBaseVisitor<Void>{
    TabelaSimbolos tabela;

    int tamEquipe = 0;

    String acao;

    @Override
    public Void visitPrograma(dragonCardsParser.ProgramaContext ctx) {
        tabela = new TabelaSimbolos();

        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_equipe(dragonCardsParser.Declaracao_equipeContext ctx){
        
        if (ctx.Nome() != null) {
            Tipo tipo = DragonCardsSemanticoUtils.verificarTipo(tabela, ctx);
            String tipoDiv;
            String nomeCard = ctx.Nome().getText();
            
            if (tamEquipe>3) {
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "Número máximo de cards é 3!</div>\n");
            }
            else{
                // Tratamento para inserir o nome do tipo no arquivo de saída
                switch (tipo) {
                    case CLASSICO:
                        tipoDiv = "<img src = \'https://img.freepik.com/vetores-gratis/ilustracao-de-silhueta-de-dragao-de-design-plano_23-2149455624.jpg?w=826&t=st=1693687866~exp=1693688466~hmac=fcc6d40e4b60279115f94ad9f2f2ead3894d8c9403b7c8aa51382bfd2dddb435'width=\"250\" height=\"250\">\n";
                        break;

                    case ORIENTAL:
                        tipoDiv = "<img src = \'https://img.freepik.com/vetores-gratis/ano-do-simbolo-do-zodiaco-do-vetor-preto-e-branco-do-dragao-isolado-em-um-fundo-branco_8130-2589.jpg?w=900&t=st=1693688259~exp=1693688859~hmac=5f0dccc6cda8b9c278672318d515622160136ffcee36f58bb282a2a24cbb790a'width=\"250\" height=\"250\">\n";
                        break;

                    case WYVERN:
                        tipoDiv = "<img src = \'https://as2.ftcdn.net/v2/jpg/04/43/64/91/1000_F_443649119_7UriZ4ZI5aIGuxNvP8NT8GgeQC2aq0Lp.jpg'width=\"250\" height=\"250\">\n";
                        break;

                    case DRAKE:
                        tipoDiv = "<img src = \'https://i.pinimg.com/736x/e3/e2/14/e3e214979a131c440b0a2dd32c230602.jpg'width=\"250\" height=\"250\">\n";
                        break;

                    case LINDWRUM:
                        tipoDiv = "<img src = \'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/f5f236c1-684d-4e21-a29f-03922867cb38/d5i0wj4-61a1b842-80c2-4b66-9b7b-26532281b206.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2Y1ZjIzNmMxLTY4NGQtNGUyMS1hMjlmLTAzOTIyODY3Y2IzOFwvZDVpMHdqNC02MWExYjg0Mi04MGMyLTRiNjYtOWI3Yi0yNjUzMjI4MWIyMDYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.c9v5PLKbGwRgORqErH03mZ64y5TdBdV07QPNZ8v7od4'width=\"250\" height=\"250\">\n";
                        break;

                    case AMPHIPTERE:
                        tipoDiv = "<img src = \'https://upload.wikimedia.org/wikipedia/commons/7/7b/Amphiptere.jpg'width=\"250\" height=\"250\">\n";
                        break;

                    default:
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/e9d0327e72bfa3daa733ac06b5fb4d25/tumblr_mmi88btyBi1spn836o1_400.png'width=\"250\" height=\"250\">\n";
                        GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                            "O tipo do " + nomeCard + " é invalido</div>\n");
                        break;
                }
                
                tamEquipe++;
                String poder = ctx.Poder().getText();
                
                tabela.adicionar(nomeCard, tipo, Integer.parseInt(poder), tamEquipe);
                
                if(tamEquipe == 1){
                    String div = "                <td><div id=\"box\">\n"
                            + "                    <br><h1><font color=\\\"#FFFFFF\\\" style=\\\"font-size: 24px;\\\">Seu Card!</font></h1><br>"
                            + "<h1><font color=\"#74e72e\" 	font-family: 'Courier New'>" + nomeCard + "     " + tipoDiv+ "</font></h1>\n"
                            + "                    <font color=\"#ffffff\">PODER "  + poder + "</font> <p><p><p>\n";
                    GeradorHTML.adicionaDiv(div);
                    GeradorHTML.AddPoderEquipe(Integer.parseInt(poder));
                }
            }
            
        }
        return super.visitDeclaracao_equipe(ctx);
        
        
    }
    
    @Override
    public Void visitDeclaracao_chefe(dragonCardsParser.Declaracao_chefeContext ctx){
        //@TODO
        if (ctx.Nome() != null) {
            Tipo tipo = DragonCardsSemanticoUtils.verificarTipo(tabela, ctx);
            String tipoDiv;
            String nomeCard = ctx.Nome().getText();

            if (tamEquipe==0){
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "Não foi adicionado nenhum card!</div>\n");
            }
            else{
                if(tamEquipe > 3){
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                        "O chefe esta preparado para batalhar!</div>\n");
                }
                else{
                    // Tratamento para inserir o nome do tipo no arquivo de saída
                    switch (tipo) {
                    case CLASSICO:
                        tipoDiv = "<img src = \'https://img.freepik.com/vetores-gratis/ilustracao-de-silhueta-de-dragao-de-design-plano_23-2149455624.jpg?w=826&t=st=1693687866~exp=1693688466~hmac=fcc6d40e4b60279115f94ad9f2f2ead3894d8c9403b7c8aa51382bfd2dddb435'width=\"300\" height=\"300\">\n";
                        break;

                    case ORIENTAL:
                        tipoDiv = "<img src = \'https://img.freepik.com/vetores-gratis/ano-do-simbolo-do-zodiaco-do-vetor-preto-e-branco-do-dragao-isolado-em-um-fundo-branco_8130-2589.jpg?w=900&t=st=1693688259~exp=1693688859~hmac=5f0dccc6cda8b9c278672318d515622160136ffcee36f58bb282a2a24cbb790a'width=\"300\" height=\"300\">\n";
                        break;

                    case WYVERN:
                        tipoDiv = "<img src = \'https://as2.ftcdn.net/v2/jpg/04/43/64/91/1000_F_443649119_7UriZ4ZI5aIGuxNvP8NT8GgeQC2aq0Lp.jpg'width=\"300\" height=\"300\">\n";
                        break;

                    case DRAKE:
                        tipoDiv = "<img src = \'https://i.pinimg.com/736x/e3/e2/14/e3e214979a131c440b0a2dd32c230602.jpg'width=\"300\" height=\"300\">\n";
                        break;

                    case LINDWRUM:
                        tipoDiv = "<img src = \'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/f5f236c1-684d-4e21-a29f-03922867cb38/d5i0wj4-61a1b842-80c2-4b66-9b7b-26532281b206.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2Y1ZjIzNmMxLTY4NGQtNGUyMS1hMjlmLTAzOTIyODY3Y2IzOFwvZDVpMHdqNC02MWExYjg0Mi04MGMyLTRiNjYtOWI3Yi0yNjUzMjI4MWIyMDYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.c9v5PLKbGwRgORqErH03mZ64y5TdBdV07QPNZ8v7od4'width=\"300\" height=\"300\">\n";
                        break;

                    case AMPHIPTERE:
                        tipoDiv = "<img src = \'https://upload.wikimedia.org/wikipedia/commons/7/7b/Amphiptere.jpg'width=\"300\" height=\"300\">\n";
                        break;
                    default:
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/e9d0327e72bfa3daa733ac06b5fb4d25/tumblr_mmi88btyBi1spn836o1_400.png'width=\"300\" height=\"300\">\n";
                        GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                            "A especie de dragao " + nomeCard + " é invalido</div>\n");
                        break;
                    }
                    tamEquipe = 4;
                    String poder = ctx.Poder().getText();

                    tabela.adicionar(nomeCard, tipo, Integer.parseInt(poder), tamEquipe);
                    
                    String div = "                <td><div id=\"box\">\n"
                            + "                    <br><h1><font color=\\\"#FFFFFF\\\" style=\\\"font-size: 25px;\\\">CHEFE!</font></h1><br>"
                            + "<h1><font color=\"#74e72e\" 	font-family: 'Courier New'>" + nomeCard + "     " + tipoDiv+ "</font></h1>\n"
                            + "                    <font color=\"#ffffff\">PODER: "  + poder + "</font> <p><p><p>\n";
                    GeradorHTML.adicionaDiv(div);
                    GeradorHTML.AddPoderChefe(Integer.parseInt(poder));                    
                }
            }      
        }
        
        return super.visitDeclaracao_chefe(ctx);
       
    }
    
    @Override
    public Void visitCmdLutar(dragonCardsParser.CmdLutarContext ctx){
        //@TODO
        String nomeCard = ctx.Nome().getText();
        //System.out.println("Entrei no visitCmdLutar. " + acao);
        if(tabela.existe(nomeCard)){
            int codigo = tabela.verificarCodigo(nomeCard);
            //System.out.println("O codigo: " + codigo);
            if(codigo != 1){
                acao = "Erro";
                GeradorHTML.AddComando(acao);
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "O card " + nomeCard + " não esta no campo de batalha!</div>\n");
            }
            else{ 
                int poder = tabela.verificarPoder(nomeCard);
                
                if(poder <= 0){
                    acao = "Erro";
                    GeradorHTML.AddComando(acao);
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                        "O card " + nomeCard + " foi removido!</div>\n");
                }
                else{
                    acao = "Lutar";
                    GeradorHTML.AddComando(acao);
                }
            }
        }
        else{
            acao = "Erro";
            GeradorHTML.AddComando(acao);
            GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                "O card " + nomeCard + " não está mais disponivel!</div>\n");
        }
        
        return super.visitCmdLutar(ctx);
    }

    @Override
    public Void visitCmdProxima(dragonCardsParser.CmdProximaContext ctx) {
        String nome = ctx.Nome().getText();
        //System.out.println("Entrei no visitCmdProxima. " + acao);
        if(tabela.existe(nome)){
            int codigo = tabela.verificarCodigo(nome);
            if(codigo == 1){
                acao = "Erro";
                GeradorHTML.AddComando(acao);
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "O " + nome + " já esta no campo!</div>\n");
            }
            else{ 
                int poder = tabela.verificarPoder(nome);
                
                if(poder <= 0){
                    acao = "Erro";
                    GeradorHTML.AddComando(acao);
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                        "O " + nome + " não pode ser o proximo!</div>\n");
                }
                else{
                    acao = "Proxima";
                    GeradorHTML.AddComando(acao);
                }
            }
        }
        else{
            acao = "Erro";
            GeradorHTML.AddComando(acao);
            GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                "O card " + nome + " não esta na equipe!</div>\n");
        }
        return super.visitCmdProxima(ctx);
    }

    

    /* 
    @Override
    public Void visitCmdDesistir(dragonCardsParser.CmdDesistirContext ctx){

    }*/
}
