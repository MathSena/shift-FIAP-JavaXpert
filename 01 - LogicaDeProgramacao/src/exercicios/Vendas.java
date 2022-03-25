package exercicios;

import java.util.Scanner;

    public class Vendas {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            final float pix= (float) 0.05;
            final float credito=(float) 1.1;

            float valorVenda,valorFinal=0;
            String formaPgto;

            System.out.println("Digite o valor da venda:");
            valorVenda=leitor.nextFloat();
            System.out.println("Digite a forma de Pagamento:\nPix\nDébito\nCrédito");
            formaPgto=leitor.next();
            if(formaPgto.equalsIgnoreCase("Pix")){
                valorFinal= (float) (valorVenda-(valorVenda*pix));
            }
            else if(formaPgto.equalsIgnoreCase("débito")||formaPgto.equalsIgnoreCase("debito")){
                valorFinal=valorVenda;
            }
            else if(formaPgto.equalsIgnoreCase("Crédito")||formaPgto.equalsIgnoreCase("credito")){
                valorFinal= (float) (valorVenda*credito);
            }
            else{
                System.out.println("Forma de pagamento inválida!");
            }
            System.out.println("O valor final de sua compra é: R$" + valorFinal);
            leitor.close();
        }
    }

