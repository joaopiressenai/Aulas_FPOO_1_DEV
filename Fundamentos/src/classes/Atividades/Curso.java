/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

import classes.Atividades.Aluno;

/**
 *
 * @author Aluno
 */
public class Curso {
    // Declarando os atributos da classe
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private Aluno alunos;
    private String statusCurso;
    
    // Construtor sem atributo
    public Curso() {
    }
    
    // Construtor com atributo

    public Curso(String nome, String descricao, CategoriaEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.alunos = alunos;
        this.statusCurso = "Em andamento";
    }
    
    
    // Metodos (ações)
    public void cadastrarAluno (String nome, String email, int ra, double nota1, double nota2) {
        Aluno aluno = new Aluno(nome, email, ra);
        aluno.aprovado(nota1, nota2);
        this.alunos = aluno;
    }
    
    public void trancarCurso() {
        this.statusCurso = "Finalizado";
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", status do curso=" + statusCurso + ", \nAlunos do curso=" + "\n" + alunos + '}';
    }

    
    
    
    
}
