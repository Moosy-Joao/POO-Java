package com.example;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João", 28));
        clientes.add(new Cliente("Maria", 35));
        clientes.add(new Cliente("Pedro", 40));
        clientes.add(new Cliente("Ana", 25));
        clientes.add(new Cliente("Carlos", 32));

        // Filtrando a lista de clientes com Stream API para idades > 30
        List<Cliente> clientesFiltrados = clientes.stream()
            .filter(cliente -> cliente.getIdade() > 30)
            .collect(Collectors.toList());

        // Exibindo os clientes filtrados
        System.out.println("Clientes com idade superior a 30 anos:");
         clientesFiltrados.forEach(cliente ->
            System.out.println(cliente.getNome() + " - " + cliente.getIdade() + " anos"));
        }
    }
