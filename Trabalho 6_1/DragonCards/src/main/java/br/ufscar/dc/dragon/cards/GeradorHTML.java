package br.ufscar.dc.dragon.cards;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GeradorHTML {
    public static StringBuffer arquivo = new StringBuffer();
    public static String caminhoArquivo;
    public static List<String> divDragon = new ArrayList<String>();
    public static int poderEquipe;
    public static int poderChefe;
    public static String comando;
    
    public static void AdicionaString(String texto) {
        arquivo.append(texto).append("\n");
    }
    
    public static String getTexto() {
        return arquivo.toString();
    }
    
    public static void AddPoderEquipe(int poder){
        poderEquipe = poder;
    }
    
    public static void AddPoderChefe(int poder){
        poderChefe = poder;
    }
    
    public static void AddComando(String acao){
        comando = acao;
    }
    
    // O arquivo é criado com toda a estrutura de início do HTML e CSS
    public static void criaArquivo(String caminho) {
        caminhoArquivo = caminho;
        arquivo.append("<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "        <title>Batalha Chefe!!</title>\n" +
                "        <style type=\"text/css\">\n" +
                "            body {\n" +
                "                background-image: url('https://img.freepik.com/fotos-gratis/fundo-feito-de-tijolos_23-2148742475.jpg?w=1380&t=st=1693687298~exp=1693687898~hmac=50e23d7030ed11327149eaa70f09cf560f52ef074d04757ecceaad324bca584f');\n" +
                "            }\n" +
                "            td {\n" +
                "                vertical-align: top;\n" +
                "            }\n" +
                "            .box {" +
                            "    text-align: center; " +
                            "    color: #74e72e; " +
                            "    font-family: Courier New; " +
                            "    font-weight: bold; " +
                            "    background-image: url('https://a-static.mlcdn.com.br/450x450/moldura-30x40-em-madeira-laqueada-preta-puig-frames/olistplus/opmtds8qxfzl4xco/75bb3500bfb1df39dfa5c1436e91803f.jpeg');" +
                            "    background-size: cover; " +
                            "    padding: 10px;" +
                            "    border: thin solid #A0522D;" +
                            "    border-radius: 10px;" +
                            "    margin: 10px;" +
                            "    width: 400px;" +
                            "   }" +
                            "   .box img {" +
                            "    width: 250px;" +
                            "    height: 250px;" +
                            "   }" +
                            ".box p {" +
                            "    margin: 0;" +
                            "}" +
                            ".name {" +
                            "    font-size: 20px;" +
                            "}\n" +
                "\n" +
                "            #erros {\n" +
                "                margin: 0 auto;\n" +
                "                border-style: solid;\n" +
                "                border-color: #69ff2d;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #74e72e;\n" +
                "                font-family: Courier New;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #000000;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip {\n" +
                "                position: relative;\n" +
                "                display: inline-block;\n" +
                "                cursor: help;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip .tooltiptext {\n" +
                "                visibility: hidden;\n" +
                "                width: 120px;\n" +
                "                text-align: center;\n" +
                "                border-radius: 6px;\n" +
                "                padding: 5px 0;\n" +
                "                position: absolute;\n" +
                "                z-index: 1;\n" +
                "                top: -5px;\n" +
                "                left: 105%;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip:hover .tooltiptext {\n" +
                "                visibility: visible;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "         \n" +
                "    <body>\n" +
                "        <table>\n" +
                "            <tr>\n");    
    }
    

    public static void adicionaDiv(String info) {
        divDragon.add(info);
    }
    
    
    public static void appendDiv(int codigo, String infoNova) {
        String infoAnterior = divDragon.get(codigo);
        String infoConcat = infoAnterior.concat(infoNova);
        divDragon.set(codigo, infoConcat);
    }
    
     // Grava o texto gerado no arquivo de saída
    public static void gravaArquivo() {
        for(int i = 0; i < divDragon.size(); i++) {
            appendDiv(i, "                </td></div>\n\n");
            arquivo.append(divDragon.get(i));
        }
        //comando = "Lutar";
        //System.out.println(comando);
        if("Lutar".equals(comando)){
                if(poderEquipe>poderChefe){
                    arquivo.append("<td><div id=\"erros\">"
                    + "<h1><font color=\"#FFFFFF\" font-family: 'Courier New'>"
                    + "Você venceu! \n <br><br>");
                }
                else{
                    if(poderEquipe != 0){
                        arquivo.append("<td><div id=\"erros\">"
                        + "<h1><font color=\"#FFFFFF\" 	font-family: 'Courier New'>" 
                        + "Você perdeu! \n <br><br>" );
                    }
                }
        }
        else{
            if("Proxima".equals(comando)){
                arquivo.append("<td><div id=\"erros\">"
                        + "<h1><font color=\"#FFFFFF\" 	font-family: 'Courier New'>" 
                        + "Você Trocou o card! \n <br><br>" );
            }
            else{
                if(comando != "Erro"){
                    arquivo.append("<td><div id=\"erros\">"
                        + "<h1><font color=\"#FFFFFF\" 	font-family: 'Courier New'>" 
                        + "Erro na geração! \n <br><br>" );
                }
            }
                
        }       
        
        arquivo.append("            </tr>\n" +
                "    </body>\n" +
                "</html>");

        try {
            Files.writeString(Paths.get(caminhoArquivo), getTexto());
        } catch (IOException e) {
        }

        System.exit(0);

    }
}
