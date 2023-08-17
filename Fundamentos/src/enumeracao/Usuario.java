/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String nome;
    private String email;
    private boolean ativo;
    private TipoUsuarioEnum tipo; //0 comum, 1 tecnico, 2 administrador

    public Usuario(String nome, String email, boolean ativo, TipoUsuarioEnum tipo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", ativo=" + ativo + ", tipo=" + tipo + '}';
    }
    
    
    
}
