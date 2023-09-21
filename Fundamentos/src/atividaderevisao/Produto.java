/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividaderevisao;

/**
 *
 * @author Aluno
 */
public class Produto {
    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;

    public Produto(String nome, String descricao, int quantidade, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    public double calcularValor () {
        double total = this.quantidade * this.valor;
        return total;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", descricao=" + descricao + ", quantidade=" + quantidade + ", valor=" + valor + '}';
    }

    
    
    
}
