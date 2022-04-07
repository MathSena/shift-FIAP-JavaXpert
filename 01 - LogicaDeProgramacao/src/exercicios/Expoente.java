package exercicios;

import java.util.Scanner;

public class Expoente {
    public static void main(String[] args) {
        double base, expoente;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de uma base: ");
        base = leitor.nextDouble();
        System.out.println("Digite o valor de um expoente: ");
        expoente = leitor.nextDouble();

        System.out.println(Exponencial(base, expoente));


    }

    public static double Exponencial(double base, double expoente){
        double repeticoes = 0;
        double potencia =1;

        while(repeticoes<expoente){
            potencia = potencia*base;
            repeticoes++;
        }

        return potencia;

    }

}
