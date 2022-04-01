package exercicios;

import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int num=0,qtdeNum=-1;
        float media,somat=0;
        do{
            somat+=num;
            qtdeNum++;
            System.out.println("Digite um número inteiro:");
            num=leitor.nextInt();
        }while(num!=9999);

        media=somat/qtdeNum;
        System.out.println("A somatória dos números digitados é: " + somat +
                "\nMédia: " + media);
    }
}