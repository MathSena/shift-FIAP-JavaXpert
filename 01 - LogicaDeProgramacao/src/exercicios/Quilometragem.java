package exercicios;

import java.util.Scanner;

public class Quilometragem {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quilometragem atual do painel: ");
        double kmAtual = leitor.nextDouble();
        System.out.println("Digite a quilometragem ao fim da sua viagem: ");
        double kmAposViagem = leitor.nextDouble();
        System.out.println("Quantos litros foram reabastecidos: ");
        double litros = leitor.nextDouble();

        double litroPorKm = (kmAposViagem - kmAtual)/litros;

        System.out.println("O carro gastou aproximadamente: " + litroPorKm + " litros por quilometro");

        leitor.close();
    }
}
