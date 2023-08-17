/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;

/**
 *
 * @author Aluno
 */
public class ProdutosCantina {
    private String produto;
    private double valor;

    public ProdutosCantina(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ProdutosCantina{" + "produto=" + produto + ", valor=" + valor + '}';
    }
    
}
