
package atividades;

import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a velocidade do veículo:");
        int velocidadeVeiculo = scanner.nextInt();
        if (velocidadeVeiculo > 80) {
            System.out.println("O motorista foi multado");
            double valorMulta = (velocidadeVeiculo - 80) * 5;
            System.out.println("O valor da multa a ser pago e R$" + valorMulta + ",00");
        }
    }

}
