package aula08;

import java.util.Scanner;

public class FuncaoComRetorno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdProdutos;
        double totalVenda;
        System.out.println("Entre com a quantidade de produtos no carrinho: ");
        qtdProdutos = leitor.nextInt();

        double[] produtos = new double[qtdProdutos];

        for(int i = 0; i<produtos.length; i++){
            System.out.println("Digite o valor do produto: ");
            produtos[i] = leitor.nextDouble();
        }
        // Concender 10% de desconto quando o valor total do carrinho for maior que R$500,00
        totalVenda = somarCarrinho(produtos);
        System.out.println(somarCarrinho(produtos));

        if(totalVenda>500){
            totalVenda = totalVenda-(totalVenda*0.1);

        }

        System.out.println("Valor final: " + totalVenda);


    }

    public static double somarCarrinho(double[] produtos) {
        double soma = 0;
        for(int i=0; i<produtos.length;i++) {
            soma = soma + produtos[i];
        }
        return soma;

    }
}
