package com.mycompany.bancoapp;

public class ContaBancaria {
    private final Usuario usuario;
    private double saldo;

    public ContaBancaria(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
