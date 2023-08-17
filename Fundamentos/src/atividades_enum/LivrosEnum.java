/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;

/**
 *
 * @author Aluno
 */
public enum LivrosEnum {
    CONTO_FADAS("Conto de Fadas"),
    TERROR("Terror"),
    FANTASIA("Fantasia"),
    DRAMA("Drama"),
    ROMANCE("Romance");
    
    private String categorias;
    
    private LivrosEnum(String categorias) {
        this.categorias = this.categorias;
    }
    
    public String getCategorias() {
        return this.categorias;
    }
}
