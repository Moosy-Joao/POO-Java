package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_Clientes {
    public static void main(String[] args ){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João", 28));
        clientes.add(new Cliente("Maria", 35));
        clientes.add(new Cliente("Pedro", 40));
        clientes.add(new Cliente("Ana", 25));
            List<Cliente> clienteAcimaDe30 = clientes.stream()
            .filter(cliente -> cliente.getIdade() > 30)
            .collect(Collectors.toList());

            clienteAcimaDe30.forEach(cliente -> System.out.println(cliente.getNome() + " " + cliente.getIdade()));
    }
    }

