/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Pedido {
    private String descricao;
    private double valor;
    private String status;

    public Pedido(String descricao, double valor, String status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "descricao=" + descricao + ", valor=" + valor + ", status=" + status + '}';
    }
    
    
}
