//Gerar e imprimir uma matriz 4x4 com valores aleatórios entra 0-9.
//determinar o maior valor e exibir sua posição (linha, coluna).

package com.company;

import java.util.Random;

public class exerc1 {
    public static void main (String[] args){

        int[][] numerosAleatorios = new int [4][4];

        Random numeroRandom = new Random();
        //iterar a matriz
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                // definir o limite de número aleatórios que serão gerados numeroRandom.nextInt(valor);
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        //como sei que o valor máximo é 100, posso usar : int maior = 0;
        // em outros casos Integer.MIN_VALUE e o MAX_VALUE posso utilizar para calcular o menor e o maior valor.
        int maior = 0;
        int linha = 0;
        int col = 0;
        //iterar novamente a matriz
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                if(numerosAleatorios [i][j] > maior){
                    maior = numerosAleatorios [i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        //imprimir a matriz para conferência
        System.out.println("Matriz:");
        for (int i=0; i<numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Representação de valores:");
        System.out.println("Maior valor = " + maior);
        System.out.println("Maior linha = " + linha);
        System.out.println("Maior coluna = " + col);
    }
}
