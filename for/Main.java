package com.company;

public class Main {

    public static void main(String[] args) {

        int i;
        for(i = 1; i<=100; i++){
            // if(i % 3 == 1){ para impar
            // if(i % 3 == 0){ para mult de 3
            if(i % 2 == 0){
                System.out.println(i);
            }
         }
    }
}
