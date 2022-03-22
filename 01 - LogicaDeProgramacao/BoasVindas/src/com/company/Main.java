package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Wolrd");
        Scanner leitor = new Scanner(System.in);
        String nome;
        System.out.println("Boa noite! Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("O nome digitado foi: " + nome);
        leitor.close();
	// write your code here
    }
}
