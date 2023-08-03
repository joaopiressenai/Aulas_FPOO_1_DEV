package atividades;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da casa a comprar: R$");
        double ValorCasa = scanner.nextDouble();
        
        System.out.println("Digite o salario da pessoa: R$");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de anos a pagar: ");
        int quantidadeAnos = scanner.nextInt();

        int quantidadeMeses = quantidadeAnos * 12;
        double prestacaoMensal = ValorCasa / quantidadeMeses;

        double percentualMaxPrestacao = 0.30; 

        if (prestacaoMensal <= salario * percentualMaxPrestacao) {
            System.out.println("Emprestimo aprovado!");
            System.out.printf("Prestacao mensal: R$ %.2f", prestacaoMensal);
        } else {
            System.out.println("Emprestimo não aprovado. Prestacao mensal excede 30% do salario.");
        }

        scanner.close();
    }
}