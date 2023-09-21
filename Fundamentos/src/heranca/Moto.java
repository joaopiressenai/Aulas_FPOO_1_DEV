/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Moto extends Veiculo{
    private String combustivel;
    private String tipoPartida;

    public Moto(String descriacao, int ano, String cor, String modelo, String marca, 
            double valor, boolean zerokm, boolean freioAbs, CombustivelEnum combustivelEnum, PartidaEnum partidaEnum) {
        super(descriacao, ano, cor, modelo, marca, valor, zerokm, freioAbs);
        this.combustivel = combustivelEnum.getTipoCombustivel();
        this.tipoPartida = partidaEnum.getTipoPartida();
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "combustivel=" + combustivel + ", tipoPartida=" + tipoPartida + '}';
    }
    
    
    
    
}
