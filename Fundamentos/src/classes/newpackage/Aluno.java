/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    // Declarando os atributos da Classe Aluno
    private String nome;
    private String email;
    private int ra;
    private double nota1;
    private double nota2;
    private double media;
    private String resultado;
    private boolean estudar;
    
    // Construtor sem argumentos
    public Aluno() {
    }
    
    // Construtor com argumentos
    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.nota1 = 0;
        this.nota2 = 0;
        this.media = 0;
        this.resultado = "Reprovado";
        this.estudar = false;
    }
    
    // Metodos (ações)

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + ", aprovado=" + resultado + ", estudar=" + estudar + '}';
    }
    
    
    public String aprovado(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (this.nota1 + this.nota2) / 2;
        if (this.media >= 7) {
            this.resultado = "Aprovado";
        }
        return this.resultado;
    }
    
    public boolean estudar() {
        return this.estudar = true;
    }
    
    
    
}
