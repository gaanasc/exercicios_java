package com.company;

public class CalculaIdade {
    public static void main(String[] args) {
        //declaração de objeto, atributos e valores
        /* Classe */pessoa pessoa = new pessoa();
        pessoa.idade = 15;
        pessoa.nome = "José";
        pessoa.sexo = "masculino";
        System.out.println(pessoa.nome);
        pessoa.maiorDeIdade(pessoa.idade);

        /* método */ pessoa pessoa2 = new pessoa();
        pessoa2.idade = 24;
        pessoa2.sexo = "feminino";
        pessoa2.nome = "Jéssica";
        System.out.println(pessoa2.nome);
        pessoa.maiorDeIdade(pessoa2.idade);
    }
}
