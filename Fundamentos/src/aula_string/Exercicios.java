/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_string;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicios {
    public static void main(String[] args) {
        String decoracao = "---------------------";
        String endereco = "Rua arealva";
        int numeroCasa = 76;
        String bairro = "Artemis";
        String mensagem = String.format("Eu moro na %s, %d, no bairro de %s",endereco, numeroCasa, bairro);
        System.out.println(mensagem);
        
        System.out.println(decoracao);
        
        String primeiroCaractere = String.valueOf(endereco.charAt(0));
        String[] vetor = endereco.split(" ");
        String vetor1Endereco = String.valueOf(vetor[0].charAt(0));      
        String vetor2Endereco = String.valueOf(vetor[1].charAt(0));        
        System.out.println(vetor1Endereco+vetor2Endereco);
        
        System.out.println(decoracao);
        
        String cidade = "Piracicaba";
        System.out.println(cidade.toUpperCase());
        
        System.out.println(decoracao);
        
        String comidaFavorita = "TUDO";
        System.out.println(comidaFavorita.toLowerCase());
        
        System.out.println(decoracao);
        
        String bairroAlterado = endereco.replace("a", "z");
        System.out.println(bairroAlterado);
        
        System.out.println(decoracao);
        
        String palavra = "atenciosamente".replaceFirst("a", "Z");
        System.out.println(palavra);
        
        System.out.println(decoracao);
        
        String texto = "Ola, seja bem-vindo ao Senai";
        boolean contemSenai = texto.contains("Senai");
        System.out.println(contemSenai);
        
        System.out.println(decoracao);
        
        String frase = "Sou desenvolvedor de sistemas";
        boolean fraseInicio = frase.startsWith("senai");
        boolean fraseFinal = frase.endsWith("sistemas");
        System.out.println(String.format("%b\n%b", fraseInicio, fraseFinal));
        
        System.out.println(decoracao);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String nome = scanner.next();
        System.out.println("Insira o seu email: ");
        String email = scanner.next();
        
        String primeirasLetrasNome = nome.substring(0,3);
        String primeirasLetrasEmail = email.substring(0,5);
        
        String senhaVelha = primeirasLetrasNome+primeirasLetrasEmail;    
        String senha = "";
        
        Random random = new Random();
        int letraSorteada = 0;
        String caractere = "";
        
        for (int i = 0; i < senhaVelha.length(); i++) {
            letraSorteada = random.nextInt(senhaVelha.length());
            caractere = String.valueOf(senhaVelha.charAt(letraSorteada));
            senha += caractere;
        }
        
        System.out.println(senha);      
        
        
    } 
}
