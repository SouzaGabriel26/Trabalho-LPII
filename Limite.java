package ProjetoAcademia;

public class Limite {
    Verification verifica = new Verification();
    public void limitHorario() {
        while((verifica.primeiroHorario == 5) && (verifica.opt == 1)) {
            System.out.println("Limite máximo do primeiro horário atingido");
            System.out.println("");

            verifica.verificaHorarios();

        }
    }
}
