package exercicios;

import java.util.Scanner;

// F=C*1,8+32
public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double celsius;
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = leitor.nextDouble();


        System.out.println("O resultado da temperatura em graus Fahrenheit é: " + conversorDeTemperatura(celsius));

    }

    public static double conversorDeTemperatura(double celsius){
        double fahrenheit = 0;
        fahrenheit = celsius *1.8+32;
        return fahrenheit;
    }
}
