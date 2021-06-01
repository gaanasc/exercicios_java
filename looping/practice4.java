package com.company;

public class practice4 {
    public static void main (String [] args){

        // Programa que calcula e escreva o número de anos necessários para que a
        // população do país A ultrapasse ou iguale a população B.

        int populacaoA = 80000;
        int populacaoB = 500000;
        int cont = 0;

        while   (populacaoA < populacaoB){

            populacaoA += (populacaoA/100) * 3;
            populacaoB += (populacaoB/100) * 1.5;
            cont++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quatidades de anos: " + cont);

    }
}
