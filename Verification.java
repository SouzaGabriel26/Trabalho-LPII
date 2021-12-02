package ProjetoAcademia;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class Verification {

    Horario horario = new Horario();
    public int opt;
    public int primeiroHorario = 0, segundoHorario = 0, terceiroHorario = 0, quartoHorario = 0, quintoHorario = 0, sextoHorario = 0;
    public String print;

    public void verificaHorarios() {

        opt = horario.perguntaHorario();

        int num1, num2, num3, num4, num5, num6;
        String arq = "numPessoas.txt";

            switch (opt) {
                case 1:
                    if(primeiroHorario < 5) {
                        primeiroHorario++;
                    }
                    break;
                case 2:
                    if(segundoHorario < 5) {
                        segundoHorario++;
                    }
                    break;
                case 3:
                    if(terceiroHorario < 5) {
                        terceiroHorario++;
                    }
                    break;
                case 4:
                    if(quartoHorario < 5) {
                        quartoHorario++;
                    }
                    break;
                case 5:
                    if(quintoHorario < 5) {
                        quintoHorario++;
                    }

                    break;
                case 6:
                    if(sextoHorario < 5) {
                        sextoHorario++;
                    }
                    break;


            }

            num1 = primeiroHorario;
            num2 = segundoHorario;
            num3 = terceiroHorario;
            num4 = quartoHorario;
            num5 = quintoHorario;
            num6 = sextoHorario;

            print =  num1 + " pessoas no primeiro horário;\n" + num2 +
                    " pessoas no segundo horário;\n" + num3 +
                    " pessoas no terceiro horário;\n" + num4 + " pessoas no quarto horário;\n"
                    + num5 + " pessoas no quinto horário;\n" + num6 + " pessoas no sexto horário;";


            Arquivo.Write(arq, print);

            String conteudo = Arquivo.Read(arq);
            String c1 = conteudo.split(";")[0];
            String c2 = conteudo.split(";")[1];
            String c3 = conteudo.split(";")[2];
            String c4 = conteudo.split(";")[3];
            String c5 = conteudo.split(";")[4];
            String c6 = conteudo.split(";")[5];

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
            System.out.println(c5);
            System.out.println(c6);




    }

    }



