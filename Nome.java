package ProjetoAcademia;

import java.util.Scanner;

public class Nome {
    NomeMolde aluno = new NomeMolde(); // cria objeto "aluno" referenciando a classe "Perfil" (aluno.nome)
    Scanner input = new Scanner(System.in);

    public String getNome() {
        System.out.println("Informe o seu nome: ");
        aluno.nome = input.nextLine();

        return aluno.nome;
    }
}
