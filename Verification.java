package ProjetoAcademia;


public class Verification {
    Horario horario = new Horario();
    public int opt;
    public int primeiroHorario = 0, segundoHorario = 0, terceiroHorario = 0, quartoHorario = 0, quintoHorario = 0, sextoHorario = 0;

    public void verificaHorarios() {

        opt = horario.perguntaHorario();

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

        System.out.println("-------------------");
        System.out.println(primeiroHorario + " pessoas o primeiro horário");
        System.out.println(segundoHorario + " pessoas o segundo horário");
        System.out.println(terceiroHorario + " pessoas o terceiro horário");
        System.out.println(quartoHorario + " pessoas o quarto horário");
        System.out.println(quintoHorario + " pessoas o quinto horário");
        System.out.println(sextoHorario + " pessoas o sexto horário");
        System.out.println("-------------------");


    }


}
