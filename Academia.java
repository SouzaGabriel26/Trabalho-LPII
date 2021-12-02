package ProjetoAcademia;

import ProjetoAcademia.boasVindas.BemVindos;
import ProjetoAcademia.continuacao.Continua;


public class Academia {


    public static void main(String[] args) {
        BemVindos msg = new BemVindos(); // cria um objeto "msg" referenciando a classe "BemVindos"
        Nome name = new Nome(); // cria um objeto "name" referenciando a classe "Nome"
        Continua opt = new Continua(); // cria um objeto "opt" referenciando a classe "Continua"
        Verification verifica = new Verification(); // cria um objeto "verifica" referenciando a classe "Verification"

        int continua = opt.continua();

        while(continua != 0) {

            msg.welcome(); // mensagem de boas vindas
            name.getNome(); // recebe o nome do cliente


            verifica.verificaHorarios(); // pergunta e verifica o horario, adiciona mais 1 no escolhido (*)

            // não conseguimos fazer de outra forma

            while((verifica.primeiroHorario == 5) && (verifica.opt == 1)) {
                System.out.println("Limite máximo do primeiro horário atingido");
                System.out.println("");

                verifica.verificaHorarios();

            }

            while((verifica.segundoHorario == 5) && (verifica.opt == 2)) {
                System.out.println("Limite máximo do segundo horário atingido");
                System.out.println("");

                verifica.verificaHorarios();

            }

            while((verifica.terceiroHorario == 5) && (verifica.opt == 3)) {
                System.out.println("Limite máximo do primeiro horário atingido");
                System.out.println("");

                verifica.verificaHorarios();

            }

            while((verifica.quartoHorario == 5) && (verifica.opt == 4)) {
                System.out.println("Limite máximo do primeiro horário atingido");
                System.out.println("");

                verifica.verificaHorarios();

            }

            while((verifica.quintoHorario == 5) && (verifica.opt == 5)) {
                System.out.println("Limite máximo do primeiro horário atingido");
                System.out.println("");

                verifica.verificaHorarios();

            }

            while((verifica.sextoHorario == 5) && (verifica.opt == 6)) {
                System.out.println("Limite máximo do primeiro horário atingido");
                System.out.println("");

                verifica.verificaHorarios();

            }


            continua = opt.continua(); // pergunta se quer continuar rodando o programa


        }


    }

}
