
package atividades;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        // Declaração de variáveis
        double pi = Math.PI;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do raio: ");
        double raio = scanner.nextDouble();

        // Aplicação da lógica
        double area_circulo = pi * raio * raio;

        // Printando o resultado
        System.out.println("A area do circulo e: " + area_circulo);
    }

}
