package exercicios;

import java.util.Scanner;

public class Cotacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor recebido em Dólar: ");
        double valorEmDolar = leitor.nextDouble();
        double cotacao = 4.91;
        double valorEmReais = valorEmDolar*cotacao;

        System.out.println("Você recebeu R$: " + String.format("% .2f",valorEmReais) + " em reais!" );

    }
}
