package com.mycompany.bancoapp;

public class Usuario {
    private final String nome;
    private final String sobrenome;
    private final String cpf;

    public Usuario(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
}
