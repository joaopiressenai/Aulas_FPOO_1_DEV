/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;

/**
 *
 * @author Aluno
 */
public class Livros {
    private String nome;
    private String categorias;
    private double valor;

    public Livros(String nome, String categorias, double valor) {
        this.nome = nome;
        this.categorias = categorias;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livros{" + "nome=" + nome + ", categorias=" + categorias + ", valor=" + valor + '}';
    }
    
    
}
