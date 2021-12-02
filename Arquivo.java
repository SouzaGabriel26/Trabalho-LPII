package ProjetoAcademia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {
    public static String Read(String caminho) {
        String conteudo = "";
        try{
            FileReader arq = new FileReader(caminho); //cria um FileReader
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                // lê uma linha e grava no conteúdo, caso a linha não estiver vazia
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;

            } catch (Exception e) {
                System.out.println(e);
                return "";
            }
        }catch(Exception e) {
            System.out.println(e);
            return "";
        }
    }

    public static boolean Write(String caminho, String texto) {
        try {
            // cria o arquivo
            FileWriter arq = new FileWriter(caminho);
            // escreve no arquivo
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
