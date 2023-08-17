/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;

/**
 *
 * @author Aluno
 */
public enum ProdutosEnum {
    COXINHA("Coxinha"),
    SALGADO_SALSICHA("Salsicha"),
    CACHORRO_QUENTE("Cachorro Quente"),
    x_TUDO("X-Tudo"),
    COCA_COLA("Coca cola"),
    SPRITE("Sprite"),
    GUARANA("Guaraná"),
    SONHO_VALSA("Sonho de valsa");
    
    private String produtos;
    
    private ProdutosEnum(String produtos) {
        this.produtos = this.produtos;
    }
    
    public String getProdutos () {
        return this.produtos;
    }
}
