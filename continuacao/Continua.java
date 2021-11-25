package ProjetoAcademia.continuacao;

import ProjetoAcademia.Verification;

import java.util.Scanner;

public class Continua {
    Scanner input = new Scanner(System.in);

    public int continua(){
        // recebe um numero int (1 ou 0)
        int continua;
        System.out.println("Deseja continuar? [0] não | [1] sim");
        continua = input.nextInt();

        return continua;
    }


}
