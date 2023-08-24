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
    private CorEnum cor;
    private int ano;
    private boolean temFreio;
    private int qtdeRodas;
    private String situacao;
    private int velocidade;
    private int marcha;
    
    // construtor sem argumentos
    public Carro() {
    }

    // construtor com argumentos
    public Carro(String marca, String modelo, CorEnum cor, int ano, boolean temFreio, int qtdeRodas, int marcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.temFreio = temFreio;
        this.qtdeRodas = qtdeRodas;
        this.situacao = "Parado";
        this.velocidade = 0;
        this.marcha = marcha;
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
    
    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }
        
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", temFreio=" + temFreio + ", qtdeRodas=" + qtdeRodas + ", marcha=" + marcha + '}';
    }

    
    
    
}
