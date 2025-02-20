package com.example;

import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("Ana");
nomes.add("Bruno");
nomes.add("Carlos");
System.out.println("Primeiro Nome: " + nomes.get(0));


//+---------------------------------------------------+
import java.util.List;
import java.util.stream.Collectors;

List<String> nomesMaiusculos = nomes.stream().map(String::toString)
    .map(String::toUpperCase)
    .collect(Collectors.toList());

nomesMaiusculos.ForEach(System.out::println);


//+---------------------------------------------------+
//filter(): Filtragem de elementos
List<String> nomesComA = nomes.stream()
    .filter(nome -> nome.startsWith("A"))
    .collect(Collectors.toList());


//+---------------------------------------------------+
//sorted(): Ordenação de elementos
List<String> nomesOrdenados = nomes.stream()
    .sorted()
    .collect(Collectors.toList());

//+---------------------------------------------------+
//reduce(): Redução para um único valor
String concatenado = nomes.stream()
    .reduce("",(subtotal, elemento) -> subtotal + elemento + ", ");
    System.out.println(concatenado);

//+---------------------------------------------------+
//flatMap(): Transforma listas aninhadas em uma única lista
import java.util.Arrays;
List<List<String>> listaDeListas = Arrays.asList(
 Arrays.asList("A", "B"),
 Arrays.asList("C", "D")
);
List<String> listaUnica = listaDeListas.stream()
 .flatMap(List::stream)
 .collect(Collectors.toList());
System.out.println(listaUnica);

//+---------------------------------------------------+
//collect(): Coleta os elementos da stream para uma estrutura específica
import java.util.Set;
Set<String> nomesUnicos = nomes.stream()
.collect(Collectors.toSet());

//+---------------------------------------------------+
//peek(): Executa uma operação intermediária para depuração
nomes.stream().peek(System.out::println)
.collect(Collectors.toList());


//+---------------------------------------------------+
