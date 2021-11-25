package ProjetoAcademia;

import java.util.Scanner;

public class Horario {
    Scanner input = new Scanner(System.in);
    public int option;

    public int perguntaHorario() {
        System.out.println("Escolha uma opção de horário, por favor!! lembrando que nosso funcionamento mudou por conta da pandemia... ");
        System.out.println("OBS: meia hora de intervalo entre os horários para higienização dos aparelhos!");
        System.out.println("LIMITE MÁXIMO 5 PESSOAS");
        System.out.println("");
        System.out.println("[1] - 9:00 até 10:30 \n" +
                "[2] - 11:00 até 12:30 \n" +
                "[3] - 13:00 até 14:30 \n" +
                "[4] - 15:00 até 16:30 \n" +
                "[5] - 17:00 até 18:30 \n" +
                "[6] - 19:00 até 20:30");

        option = input.nextInt();

        return option;
    }
}
