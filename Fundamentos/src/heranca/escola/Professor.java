/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, boolean documento) {
        super(nome, email, idade, documento);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public boolean verificarMaiorIdade() {
        return super.verificarMaiorIdade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String toString() {
        return super.toString() + "Professor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }

    public boolean isDedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }

    
    public String verificarDedicacaoExclusiva(boolean dedicacaoExlusiva) {
        if (dedicacaoExlusiva == true) {
            return "Professor tem dedicacao exlusiva";
        } else {
            return "Professor nao tem dedicacao exlusiva";
        }
    }
}
