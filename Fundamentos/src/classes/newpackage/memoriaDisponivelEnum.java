/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.newpackage;

/**
 *
 * @author Aluno
 */
public enum memoriaDisponivelEnum {
    POUCAMEMORIA("Pouca memória disponível"),
    MEDIAMEMORIA("Metada da memoria disponivel"),
    TODAMEMORIA("Toda memoria disponivel");
    
    private String capacidade;

    private memoriaDisponivelEnum(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getCapacidade() {
        return capacidade;
    }
    
}
