
package atividades;

import java.util.Scanner;
import javax.xml.transform.Source;


public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salario do funcionário:");
        double valorSalario = scanner.nextDouble();
        double aumentoSalario = 0;
        if (valorSalario > 1350) {
            aumentoSalario = valorSalario + (valorSalario * 0.1);
        } else {
            aumentoSalario = valorSalario + (valorSalario * 0.15);
        }
        System.out.println("O salario apos o aumento percentual e R$" + aumentoSalario + ",00");
    }

}
