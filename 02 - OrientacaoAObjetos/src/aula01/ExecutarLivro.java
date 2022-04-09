package aula01;

import java.util.Scanner;
public class ExecutarLivro {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Livro objLivro = new Livro();

        objLivro.titulo= "O milagre da manhã";
        objLivro.autor = "Lucas Book";
        objLivro.edicao = "3o. ed";
        objLivro.preco = 150.0;

        System.out.println("Dados do Livro..");
        System.out.println("Titulo:" + objLivro.titulo);
        System.out.println("Autor:" + objLivro.autor);

        Livro objLivro2 = new Livro();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Titulo:");
        objLivro2.titulo = leitor.nextLine();

        System.out.println("Digite o autor");
        objLivro2.autor = leitor.nextLine();

        System.out.println("Dados do Livro 2..");
        System.out.println("Titulo:" + objLivro2.titulo);
        System.out.println("Autor:" + objLivro2.autor);


    }
}
