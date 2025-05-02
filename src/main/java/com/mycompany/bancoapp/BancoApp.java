package com.mycompany.bancoapp;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        // Cadastro
        try (Scanner sc = new Scanner(System.in)) {
            // Cadastro
            System.out.println("Bem-vindo ao Banco!");
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.print("Digite seu CPF: ");
            String cpf = sc.nextLine();
            
            Usuario usuario = new Usuario(nome, sobrenome, cpf);
            ContaBancaria conta = new ContaBancaria(usuario);
            
            int opcao;
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                
                switch (opcao) {
                    case 1:
                        conta.consultarSaldo();
                        break;
                    case 2:
                        System.out.print("Valor para depósito: ");
                        double deposito = sc.nextDouble();
                        conta.depositar(deposito);
                        break;
                    case 3:
                        System.out.print("Valor para saque: ");
                        double saque = sc.nextDouble();
                        conta.sacar(saque);
                        break;
                    case 4:
                        System.out.println("\nObrigado por usar nosso sistema, " + usuario.getNomeCompleto() + "!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 4);
        }
    }
}
