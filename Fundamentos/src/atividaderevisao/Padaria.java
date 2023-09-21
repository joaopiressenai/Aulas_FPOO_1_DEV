/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividaderevisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Padaria {
    public static void main(String[] args) {
        // Bem vindo a Padaria   
        Scanner scanner = new Scanner(System.in);        
        
        // Aplicação da Lógica       
        // Declaração das variáveis
        System.out.println("Escolha um dos item abaixos:"
                + "\n[1]Pão - R$0,7"
                + "\n[2] Manteiga - R$5,98"
                + "\n[3] Bala - R$0,20"
                + "\n[4] Bolo de Chocolate - R$25,60"
                + "\n[5] Sonho - R$4,99");
        int itemEscolhido = scanner.nextInt();
        System.out.println("Insira a quantidade do produto desejado:");
        int quantidadeItemEscolhido = scanner.nextInt();
        boolean vale = false;
        double total = 0;
        
        // Itens da padaria
        Produto produto1 = new Produto("Pão", "O melhor pão já vendido", quantidadeItemEscolhido, 0.7);
        Produto produto2 = new Produto("Manteiga", "Recheio cremoso para o pão", quantidadeItemEscolhido, 5.98);
        Produto produto3 = new Produto("Bala", "Doce para adoçar a vida",quantidadeItemEscolhido, 0.2);
        Produto produto4 = new Produto("Bolo de Chocolate", "Um bolinho para açucarar a vida",quantidadeItemEscolhido, 27.6);
        Produto produto5 = new Produto("Sonho", "A esperança é a última que morre",quantidadeItemEscolhido, 4.99);
        
        if (itemEscolhido == 1) {
            total = produto1.calcularValor();
        } else if (itemEscolhido == 2) {
            total = produto2.calcularValor();
        } else if (itemEscolhido == 3) {
            total = produto3.calcularValor();
        } else if (itemEscolhido == 4) {
            total = produto4.calcularValor();
        } else if (itemEscolhido == 5) {
            total = produto5.calcularValor();
        }
        
        System.out.println("O valor final da compra foi de R$" + total);
        
        if (total > 50) {
            vale = true;
            System.out.println("Na próxima compra você ganhou um vale de 5 pães grátis na próxima compra");
        }
        System.out.println("Volte sempre");
    }
    
}
