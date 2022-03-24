package aula02;

import java.util.Scanner;

public class podeVotar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idadeEleitor;
        System.out.println("Qual a idade do eleitor?: ");
        idadeEleitor = leitor.nextInt();


        if(idadeEleitor<16){
            System.out.println("Você não pode votar e nem embarcar");

        }else if(idadeEleitor>=16 && idadeEleitor<18){
            System.out.println("Você pode optar em embarcar ou votar");
        }else{
            System.out.println("Você é obrigado a votar");
        }
        leitor.close();
    }
}
