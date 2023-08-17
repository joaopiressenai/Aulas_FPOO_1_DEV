/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;

/**
 *
 * @author Aluno
 */
public enum RedesEnum {
    INSTAGRAM("Instagram"),
    TWITTER("Twitter"),
    FACEBOOK("Facebook");
    
    private String redes;
    
    private RedesEnum(String redes) {
        this.redes = this.redes;

    }
    
    public String getRedes () {
        return this.redes;
    }
}

