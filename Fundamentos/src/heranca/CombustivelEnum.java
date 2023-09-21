/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public enum CombustivelEnum {
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    DIESEL("Diesel"),
    GNV("Gás natural veicular");
    
    private String tipoCOmbustivel;

    private CombustivelEnum(String tipoCOmbustivel) {
        this.tipoCOmbustivel = tipoCOmbustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCOmbustivel;
    }
    
}
