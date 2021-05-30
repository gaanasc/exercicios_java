package com.company;

public class pessoa {
        String nome;
        String sexo;
        int idade;

        public void maiorDeIdade(int idade){
            if(idade>=18) {
                System.out.println("Maior de idade.");
            }else {
                System.out.println("Menor de idade.");
            }
        }
    }

