
package aulaEstruturaDecisao;

import java.util.Scanner;


public class atividade2 {
    public static void main(String[] args) {
//      2) Crie um programa para calcular o valor a ser pago para 
//         construção de uma planta de um imóvel, o programa deve 
//         receber as informações de largura e comprimento do terreno, 
//         utilize a tabela abaixo para calcular o valor final:
//
//      Área total                 Valor por m²
//      até 250m²                R$ 8,50
//      até 350m²                R$ 9,50
//      acima de 350m²     R$ 11,50
        
        // Declaração de variaveis
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a largura do terreno: ");
        double largura = scanner.nextDouble();
        System.out.println("Insira o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();
        double area = largura * comprimento;
        double valorMetro = 0;
            
        if (0 < area && area < 250) {
            valorMetro = 8.5;
        } else if (250 <= area && area < 350) {
            valorMetro = 9.5;
        } else if (350 <= area) {
            valorMetro = 11.5;
        }
        double valorTerreno = valorMetro * area;
        System.out.println(valorTerreno);
    }

}
