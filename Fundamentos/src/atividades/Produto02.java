
package atividades;


public class Produto02 {
    private String nomeProduto;
    private double valorProduto;
    private int quantidadeProduto;
    private double valorTotal;

    public Produto02(String nomeProduto, double valorProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public double ValorTotal() {
        this.valorTotal = (this.valorProduto * this.quantidadeProduto);
        return valorTotal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }
     

}
