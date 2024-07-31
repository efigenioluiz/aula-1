package com.efigenioluiz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa que declare variáveis para nome, idade e altura, e imprima
        // essas informações.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque um nome: ");
        String nome = scanner.nextLine();
        int idade = 17;
        double altura = 1.60;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        boolean condicao = true;

        if (condicao) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
