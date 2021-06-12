//Gerar e imprimir uma matriz 10x10 com valores aleatórios entra 0-9.
//indicar o maior e o menor valor da linha 7 e qual o maior e menor da coluna 4.

package com.company;

import java.util.Random;

public class exerc2 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[10][10];

        System.out.println("Matriz 10x10:");
        Random numeroRandom = new Random();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);

            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        int maiorline7 = 0;
        int menorline7 = 101;
        int line7 = 7;
        //hardcoded
        for (int i = 0; i < numerosAleatorios[line7].length; i++) {
            if (numerosAleatorios[line7][i] > maiorline7) {
                maiorline7 = numerosAleatorios[line7][i];
            }
            if (numerosAleatorios[line7][i] < menorline7) {
                menorline7 = numerosAleatorios[line7][i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Maior valor da linha 7: " + maiorline7);
        System.out.println("Menor valor da linha 7: " + menorline7);

        int maiorcol4 = 0;
        int menorcol4 = 101;
        int col4 = 4;
        //para iterar cada linha da matriz, utilizar o length
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][col4] > maiorcol4) {
                maiorcol4 = numerosAleatorios[i][col4];
            }
            if (numerosAleatorios[i][col4] < menorcol4) {
                menorcol4 = numerosAleatorios[i][col4];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Maior valor da coluna 4: " + maiorcol4);
        System.out.println("Menor valor da coluna 4: " + menorcol4);

    }
}