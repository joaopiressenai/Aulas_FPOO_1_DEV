/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Scooter extends Veiculo{
    private int potenciaBateria;

    public Scooter(int potenciaBateria, String descriacao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioAbs) {
        super(descriacao, ano, cor, modelo, marca, valor, zerokm, freioAbs);
        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "Scooter{" + "potenciaBateria=" + potenciaBateria + '}';
    }
    
    
}
