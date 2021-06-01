package com.company;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infovalidas = false;

        do {
            System.out.println("Entre com o nome do usuário");
            String nomeUser = scan.next();

            System.out.println("Entre com a senha");
            String senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                infovalidas = false;
                System.out.println("Senha não pode ser igual o nome do usuário, tente novamente");
            } else {
                System.out.println("Senha e usuários válidos!");
                infovalidas = true;

                System.out.println("Seu login é: " + nomeUser);
                System.out.println("Sua senha é: " + senha);
            }
        } while (!infovalidas);

    }
}
