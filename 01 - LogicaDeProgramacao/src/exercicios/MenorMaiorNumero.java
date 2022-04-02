package exercicios;
import java.util.Scanner;
public class MenorMaiorNumero {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int somaPositivo=0,qtdeNegativo=0;
        int numero;
        String opcao="S";

        do {
            somaPositivo = 0;
            qtdeNegativo = 0;
            for(int i=1;i<=10;i++){
                System.out.println("Digite o " + i + "º número");
                numero = leitor.nextInt();
                if (numero >= 0) {
                    somaPositivo += numero; //somaPositivo=somaPositivo+numero;
                } else {
                    qtdeNegativo++;//qtdeNegativo=qtdeNegativo+1;
                }
            }
            System.out.println("A soma dos positivos é: " + somaPositivo);
            System.out.println("A qtde de negativos é: " + qtdeNegativo);
            System.out.println("Deseja continuar(S/N)?");
            opcao=leitor.next();
        } while (opcao.equalsIgnoreCase("s")) ;
    }
}