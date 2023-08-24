/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    // Declaração dos atributos da Classe, são as característicass da bicicleta
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private boolean temFreio;
    private int qtdeRodas;
    private String situacao;
    private int velocidade;
    
    // construtor sem argumentos
    public Carro() {
    }

    // construtor com argumentos
    public Carro(String marca, String modelo, String cor, int ano, boolean temFreio, int qtdeRodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.temFreio = temFreio;
        this.qtdeRodas = qtdeRodas;
        this.situacao = "Parado";
        this.velocidade = 0;
    }
    
    // metodos (ações)
    public void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void freiar(int velocidade) {
        this.situacao = "Freiando";
        this.velocidade = velocidade;
    }
    
    public boolean vericarTemFreio() {
        return this.temFreio;
    }  

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", temFreio=" + temFreio + ", qtdeRodas=" + qtdeRodas + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
    
}
