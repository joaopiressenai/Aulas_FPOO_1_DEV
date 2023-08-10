
package aulaEstruturaDecisao;

import java.util.Scanner;


public class atividade5 {
    public static void main(String[] args) {
//        5) Crie um programa para calcular o valor do aluguel de veículos, conforme a tabela abaixo:
//
//          Veículo       Valor diária   Valor por km rodado
//          Fiat Argo         R$ 98,00               R$ 2,39
//          Fiat Mobi         R$ 79,00               R$ 1,99
//          Hyundai Hb20     R$ 102,00              R$  2,99
//        Declaracao vairaveis
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um dos carros para alugar:"
                + "\n[1]Fiat Argo    R$98,00"
                + "\n[2]Fiat Mobi    R$79,00"
                + "\n[3]Hyundai Hb20 R$102,00");
        int carro = scanner.nextInt();
        System.out.println("Insira os kms rodados: ");
        int kmsRodados = scanner.nextInt();
        System.out.println("Insira os dias alugados: ");
        int dias = scanner.nextInt();
        double valorDiaria = 0;
        double valorKmRodado = 0;
//        Aplicacao da logica
        if (carro == 1) {
            valorDiaria = 98;    
            valorKmRodado = 2.39;
        } else if (carro == 2) {
            valorDiaria = 79;
            valorKmRodado = 1.99;
        } else if (carro == 3) {
            valorDiaria = 102;
            valorKmRodado = 2.99;
        }
        double valorAluguel = valorDiaria * dias + valorKmRodado * kmsRodados;
        System.out.println("O valor do aluguel e: " + valorAluguel);
    }

}
