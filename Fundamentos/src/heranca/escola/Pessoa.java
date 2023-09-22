/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Pessoa implements ValidadaPessoa{
    private String nome;
    private String email;
    private int idade;
    private boolean documento;

    public Pessoa(String nome, String email, int idade, boolean documento) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.documento = documento;
    }

    public boolean verificarMaiorIdade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", idade=" + idade + ", documento=" + documento + '}';
    }

    @Override
    public String verificarDominioEmailGmail(String email) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.email.contains("@gmail.com")) {
            return "O email de " + nome + " e do dominio gmail";
        } else {
            return "O email de " + nome + " nao e do dominio gmail";
        }
    }
    
    @Override
    public String verificarDominioEmailYahoo(String email) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.email.contains("@yahoo.com")) {
            return "O email de " + nome + " e do dominio yahoo";
        } else {
            return "O email de " + nome + " nao e do dominio yahoo";
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isDocumento() {
        return documento;
    }  

    
    
    
}
