package com.company;

public class GeraFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = "001";
        fatura.descricao  = "Mouse";
        fatura.preco = 25.00;
        fatura.quantComprada = 5;

        System.out.println("Produto: " + fatura.descricao);
        System.out.println("Quantidade comprada: " + fatura.quantComprada);
        System.out.println("Preço unitário: R$" + fatura.preco);
        System.out.println("Total da fatura = R$" + fatura.valorFatura());
    }
}
