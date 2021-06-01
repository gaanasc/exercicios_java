package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class practice3 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        boolean infovalida = false;
        String nome, genero, estCivil;
        int idade;
        double salario;


        do{
            System.out.println("Entre com o nome: ");
            nome = scan.next();

            if(nome.length() > 3){
                infovalida = true;
            } else {
                System.out.println("Nome precisa de no mínimo 3 caracteres.");
            }
        } while (!infovalida);


        infovalida = false;
        do{
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            if(idade >= 0 && idade <=100){
                infovalida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 à 100.");
            }
        } while (!infovalida);

        infovalida = false;
        do{
            System.out.println("Entre com o salário:");
            salario = scan.nextDouble();

            if(salario > 0){
                infovalida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infovalida);

        infovalida = false;
        do{
            System.out.println("Entre com o genero:");
            genero = scan.next();

            if(genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")){
                infovalida = true;
            } else {
                System.out.println("Gênero precisa ser 'F' ou 'M'.");
            }
        } while (!infovalida);

        infovalida = false;
        do{
            System.out.println("Informe seu estado civil:");
            estCivil = scan.next();

            if(estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") ||
                    estCivil.equalsIgnoreCase("v") ||
                    estCivil.equalsIgnoreCase("d")){
                infovalida = true;
            } else {
                System.out.println("Estado civil precisar ser: 'S' para Solteiro," +
                        "'C' para Casado, 'V' para Viúvo e 'D' para Divorciado.");
            }
        } while (!infovalida);

        System.out.println("Abaixo suas informações");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Estado Civil: " + estCivil);
        System.out.println("Gênero: " + genero);

    }
}
