package com.company;

public class TesteAluno {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        aluno1.nome = "Gabriel Nascimento Rocha";
        aluno1.matricula = 21344661;
        aluno1.setCpf("451.088.018-90");
        aluno1.email = "gabriel.rocha1301@gmail.com";

        System.out.println("Aluno: " + aluno1.nome);
        System.out.println("Matrícula N°: " + aluno1.matricula);
        System.out.println("CPF: " + aluno1.getCpf());
        System.out.println("E-mail: " + aluno1.email);

        System.out.println("===================================");
        Alunos aluno2 = new Alunos();
        aluno2.nome = "Julia Nascimento Rocha";
        aluno2.matricula = 21556112;
        aluno2.setCpf("142.852.838-59");
        aluno2.email = "julianasc@gmail.com";

        System.out.println("Aluno: " + aluno2.nome);
        System.out.println("Matrícula N°: " + aluno2.matricula);
        System.out.println("CPF: " + aluno2.getCpf());
        System.out.println("E-mail: " + aluno2.email);
    }
}
