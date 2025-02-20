package com.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String palavra;
        String [] teste;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine();

    
        System.out.println("Tamanho da palavra"+ palavra.length());

        System.out.println("Tamanho da palavra"+ palavra.charAt(0));

        teste = palavra.split("");
        for (String teste2 : teste) {
            System.out.println(teste2);
    }
}
}
