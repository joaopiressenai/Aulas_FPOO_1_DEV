/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Hotel {
    public static void main(String[] args) {
        // Bem vindo ao Hotel
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o modelo de quarto para sua viagem: "
                + "\n[1] Básico"
                + "\n[2] Superflex"
                + "\n[3] Premium"
                + "\n[4] Master");
        int modeloQuarto = scanner.nextInt();
        
        Quarto quarto = new Quarto(modeloQuarto);
        
        double totalDiaria = 0;
        
        if (modeloQuarto == 1) {
            quarto.adicionarJanta();
            totalDiaria = 89.9 * 3 + 109.9 * 2;
            System.out.println("Deseja café da manhã? [1]Sim [2]Não");
            int incluirCafe = scanner.nextInt();
            if (incluirCafe == 1) {
                totalDiaria += 29.9; 
            }
            System.out.println("Deseja almoço? [1]Sim [2]Não");
            int incluirAlmoco = scanner.nextInt();
            if (incluirAlmoco == 1) {
                totalDiaria += 29.9; 
            }
        } else if (modeloQuarto == 2) {
            quarto.adicionarCafeManha();
            quarto.adicionarJanta();
            totalDiaria = 109.9 * 3 + 139.9 * 2;
            System.out.println("Deseja almoço? [1]Sim [2]Não");
            int incluirAlmoco = scanner.nextInt();
            if (incluirAlmoco == 1) {
                totalDiaria += 29.9; 
            }
        } else if (modeloQuarto == 3) {
            quarto.adicionarCafeManha();
            quarto.adicionarAlmoco();
            totalDiaria = 199.9 * 3 + 229.9 * 2;
            System.out.println("Deseja janta? [1]Sim [2]Não");
            int incluirJanta = scanner.nextInt();
            if (incluirJanta == 1) {
                totalDiaria += 29.9; 
            }
        } else if (modeloQuarto == 4) {
            quarto.adicionarCafeManha();
            quarto.adicionarAlmoco();
            quarto.adicionarJanta();
            totalDiaria = 259.9 * 3 + 299.9 * 2;
        }
        
        System.out.println("O custo da viagem é de R$" + totalDiaria);
    }
}
