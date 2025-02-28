package com.example;

abstract class Pessoa implements IEntidade{ 
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override 
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}