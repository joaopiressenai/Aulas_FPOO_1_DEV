/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;

/**
 *
 * @author Aluno
 */
public class Data {
    private int dia;
    private String meses;
    private int ano;

    public Data(int dia, String meses, int ano) {
        this.dia = dia;
        this.meses = meses;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", meses=" + meses + ", ano=" + ano + '}';
    }
    
    
}
