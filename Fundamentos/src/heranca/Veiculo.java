/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Veiculo {
    private String descriacao;
    private int ano;
    private String cor;
    private String modelo;
    private String marca;
    private double valor;
    private boolean zerokm;
    private boolean freioAbs;

    public Veiculo(String descriacao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioAbs) {
        this.descriacao = descriacao;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.zerokm = zerokm;
        this.freioAbs = freioAbs;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "descriacao=" + descriacao + ", ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + ", valor=" + valor + ", zerokm=" + zerokm + ", freioAbs=" + freioAbs + '}';
    }
    
    
    
}
