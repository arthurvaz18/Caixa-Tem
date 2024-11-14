package org.example;
import entities.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Insira o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Informe o seu nome: ");
        sc.nextLine();  // Consumir a quebra de linha
        String nome = sc.nextLine();

        System.out.println("Fazer um depósito inicial (y/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.println("Qual o valor a ser depositado?");
            double inicialDeposito = sc.nextDouble();
            conta = new Conta(numero, nome, inicialDeposito);
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Insira um valor de saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);




        sc.close();
    }
}
