//4. Criar um vetor A com 15 elementos inteiros. Construir um vetror B de mesmo tamanho,
// sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo
// elemento de A, ou seja: B[i] = sqrt(A[i]);

package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class array4 {
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for(int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat decimal = new DecimalFormat("###,###.###");
        // Utilizar a vígurla para separar decimal caso esteja em inglês.

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(decimal.format(vetorB[i]) + " ");
        }

    }
}
