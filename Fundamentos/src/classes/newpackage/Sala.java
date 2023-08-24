/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.newpackage;

/**
 *
 * @author Aluno
 */
public class Sala {
    // Declarando os atributos da classe
    private int qtdeCadeiras;
    private int qtdeCarteiras;
    private int numeroSala;
    private boolean temProjetor;
    private int qtdeComputadores;
    private String statusProjetor;
    
    // Construtor sem argumentos
    public Sala() {
    }
    
    // Construtor com argumentos
    public Sala(int qtdeCadeiras, int qtdeCarteiras, int numeroSala, int qtdeComputadores) {
        this.qtdeCadeiras = qtdeCadeiras;
        this.qtdeCarteiras = qtdeCarteiras;
        this.numeroSala = numeroSala;
        this.temProjetor = false;
        this.qtdeComputadores = qtdeComputadores;
        this.statusProjetor = "Desligado";
    }
    
    // Metodos (ações)
    public void existeProjetor() {
        this.temProjetor = true;
    }    
    
    public void ligarProjetor() {
        if (this.temProjetor == true) {
            this.statusProjetor= "Ligado";
        }
    }
    
    public void projetarConteudo() {
        if (this.statusProjetor == "Ligado") {
            this.statusProjetor= "Projetando conteudo na lousa";
        } 
    }

    @Override
    public String toString() {
        return "Sala{" + "qtdeCadeiras=" + qtdeCadeiras + ", qtdeCarteiras=" + qtdeCarteiras + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", qtdeComputadores=" + qtdeComputadores + ", statusProjetor=" + statusProjetor + '}';
    }
    
    
    
}
