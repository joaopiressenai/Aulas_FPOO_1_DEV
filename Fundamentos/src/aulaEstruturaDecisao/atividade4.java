
package aulaEstruturaDecisao;

import java.util.Scanner;


public class atividade4 {
    public static void main(String[] args) {
//4) Crie um programa para calcular o valor a ser economizado por mês e a quantidade de meses para você comprar os itens abaixo:
//
//Item                Valor total    Percentual a economizar                        
//Notebook Lenovo      R$ 3299,00              5%
//Celular MotoG22      R$ 1789,00              10%
//Carro Hb20           R$ 68000,0              2%
//Apartamento          R$ 180000,00            1%
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escola o item que deseja comprar:"
                + "\n[1]Notebook Lenovo R$3299,00"
                + "\n[2]Celular MotoG22 R$1789,00"
                + "\n[3]Carro Hb20      R$68000,00"
                + "\n[4]Apartamento     R$180000,00");
        int produto = scanner.nextInt();
        int valor = 0;
        double percentualEconomizar = 0;
        
        
        if (produto == 1) {
            valor = 3299;
            percentualEconomizar = 0.05;
        } else if (produto == 2) {
            valor = 1780;
            percentualEconomizar = 0.10;
        } else if (produto == 3) {
            valor = 68000;
            percentualEconomizar = 0.02;
        } else if (produto == 4) {
            valor = 180000;
            percentualEconomizar = 0.01;
        }
        double valorParcela = valor * percentualEconomizar;
        double mesesEconomizar = valor / valorParcela;
        System.out.println("Voce tera que economizar R$" 
                + valorParcela + " por " + mesesEconomizar 
                + " meses para comprar o produto");
    }

}
