/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.newpackage;

/**
 *
 * @author Aluno
 */
public class Computador {
    // Declarando os atributos da classe
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int capacidadeDiscoRigido;
    private sistemaOperacionalEnum sistemaOperacional;
    private String statusComputador;
    private memoriaDisponivelEnum memoriaDisponivel;
    
    // Construtor sem argumentos
    public Computador() {
    }
    
    // Construtor com argumentos

    public Computador(MemoriaEnum memoria, ProcessadorEnum processador, int capacidadeDiscoRigido, sistemaOperacionalEnum sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaDisponivel = memoriaDisponivelEnum.TODAMEMORIA;
        this.statusComputador = "Desligado";
    }
        
    // Metodos (ações)
    public void ligarComputador() {
        this.statusComputador = "Ligado";
    }
    
    public void memoriaCheia() {
        this.memoriaDisponivel = memoriaDisponivelEnum.POUCAMEMORIA;
    }
    
    public void memoriaMedia() {
        this.memoriaDisponivel = memoriaDisponivelEnum.MEDIAMEMORIA;
    }
    
    public void memoriaVazia() {
        this.memoriaDisponivel = memoriaDisponivelEnum.TODAMEMORIA;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + ", statusComputador=" + statusComputador + ", memoriaDisponivel=" + memoriaDisponivel + '}';
    }
    
    
    
}
