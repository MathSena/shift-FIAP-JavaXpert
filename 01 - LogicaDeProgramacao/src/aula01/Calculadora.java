package aula01;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        int res;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Esse programa simula uma calculadora");
        System.out.println("Digite o primeiro número");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        valor2 = leitor.nextInt();
        res = valor1+valor2;

        System.out.println("O resultado é: " + res);

	// write your code here
    }
}
