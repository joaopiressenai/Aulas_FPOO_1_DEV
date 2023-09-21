/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public enum PartidaEnum {
    ELETRICA("Partida Elétrica"),
    PEDAL("Partida Pedal");
    
    private String tipoPartida;

    private PartidaEnum(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }
    
    
}
