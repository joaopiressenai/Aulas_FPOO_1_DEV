
package aulaEstruturaDecisao;

import java.util.Scanner;


public class atividade3 {
    public static void main(String[] args) {
//        3) Crie um programa que calcule o preço para o almoço 
//           com seus colegas de classe, o programa deve perguntar 
//           ao usuário qual prato ele deseja e a quantidade, neste 
//           exemplo vamos considerar que todos vão comer o mesmo prato.
//
//        Prato                                Opção             Valor
//        Arroz, feijão, bife acebolado            1             R$ 19,99
//        Arroz, feijão, filé de frango            2             R$ 18,99
//        Arroz, feijão, brajola                   3             R$ 23,99
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um dos pratos abaixo:"
                + "\n[1]Arroz, feijão e bife acebolado R$19,99"
                + "\n[2]Arroz, feijão e file de frango R$18,99"
                + "\n[3]Arroz, feijão e brajola        R$23,99");
        int opcao = scanner.nextInt();
        System.out.println("Insira a quantidade de pratos: ");
        int quantidade = scanner.nextInt();
        double preco = 0;
        if (opcao == 1) {
            preco = 19.99;
        } else if (opcao == 2) {
            preco = 18.99;
        } else if (opcao == 3) {
            preco = 23.99;
        }
        double valorPagar = quantidade * preco;
        System.out.println("O valor a pagar e: " + valorPagar);
                
    }

}
