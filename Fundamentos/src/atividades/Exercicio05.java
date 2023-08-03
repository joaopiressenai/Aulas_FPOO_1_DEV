
package atividades;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a distancia que deseja percorrer:");
        double distancia = scanner.nextDouble();
        double valorPagarKm = 0;
        if (distancia < 200) {
            valorPagarKm = distancia * 0.5;
        } else {
            valorPagarKm = distancia * 0.45;
        }
        System.out.println("O valor a pagar pela passagem e R$" + valorPagarKm + ",00");
    }

}
