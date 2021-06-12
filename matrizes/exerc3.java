//receber valores para preenchimento de uma matriz 3X3
//imprimir a matriz e encontrar a quantidade de números pares e ímpares.

package com.company;

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {

                System.out.println("Entre com um valor da posição[" + i + "," + j + "]");
                numeros[i][j] = scan.nextInt();
            }
        }
        int qtdPares = 0;
        int qtdImpares = 0;
        for (int j = 0; j < numeros.length; j++) {

            if (numeros[0][j] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
            }
            System.out.println();
        }

        System.out.println("Pares = " + qtdPares);
        System.out.println("Ímpares = " + qtdImpares);
        for (int j = 0; j < numeros.length; j++) {

            if (numeros[1][j] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
            }
            System.out.println();
        }

        System.out.println("Pares = " + qtdPares);
        System.out.println("Ímpares = " + qtdImpares);
        for (int j = 0; j < numeros.length; j++) {

            if (numeros[2][j] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
            }
            System.out.println();
        }

        System.out.println("Pares = " + qtdPares);
        System.out.println("Ímpares = " + qtdImpares);
    }
}