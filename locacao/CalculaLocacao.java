package com.company;

public class CalculaLocacao {

    public static void main(String[] args) {
        //Criar objeto (uno)
        //
        Veiculos uno = new Veiculos();
        uno.ano = 1995;
        uno.marca = "Fiat";
        uno.modelo = "passeio";
        uno.quantDias = 3;
        uno.valorLocacao = 100;

        System.out.println("A marca do carro é: " + uno.marca);
        System.out.println("O ano do carro é: " + uno.ano);
        System.out.println("Optou pela quantidade de " + uno.quantDias + " dias");
        System.out.println("O modelo do carro é de " + uno.modelo);
        System.out.println("O valor para passeio seria: R$" + uno.passeio(uno.quantDias, uno.valorLocacao));
        System.out.println("O valor para utilitário seria: R$" + uno.util(uno.quantDias, uno.valorLocacao));


        // objeto.metodo (uno.passeIo)
    }
}
