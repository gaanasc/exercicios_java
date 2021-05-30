package com.company;

public class Veiculos {
    String modelo;
    String marca;
    int ano;
    double valorLocacao;
    int quantDias;

    public double passeio(int quantDias,double valorLocacao){
        double total = (quantDias * valorLocacao) - 20;
        // quantDias * (valorLocacao-20) desconto de 20 em cada diária
        // (quantDias * valorLocacao) - 20 desconto de 20 no total, valor fora dos parentes
        return total;
    }

    public double util(int quantDias,double valorLocacao){
        double total = quantDias * (valorLocacao+40);
        return total;
    }
}
