/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String ra, String nome, String email, int idade, boolean documento) {
        super(nome, email, idade, documento);
        this.ra = ra;
    }

    @Override
    public boolean verificarMaiorIdade() {
        return super.verificarMaiorIdade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String toString() {
        return super.toString() + "Aluno{" + "ra=" + ra + '}';
    }

    public String getRa() {
        return ra;
    }
    
    public int verificarTamanhoRa(String ra) {
        return ra.length();
    }
    
}
