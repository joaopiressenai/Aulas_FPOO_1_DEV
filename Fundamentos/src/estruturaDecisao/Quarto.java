/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

/**
 *
 * @author Aluno
 */
public class Quarto {
    private int modeloQuarto;
    private boolean cafeManha;
    private boolean almoco;
    private boolean janta;

    public Quarto(int modeloQuarto) {
        this.modeloQuarto = modeloQuarto;
        this.cafeManha = false;
        this.almoco = false;
        this.janta = false;
    }
    
    public boolean adicionarCafeManha () {
        return this.cafeManha = true;
    }
    
    public boolean adicionarAlmoco () {
        return this.almoco = true;
    }
    
    public boolean adicionarJanta () {
        return this.janta = true;
    }

    public boolean isCafeManha() {
        return cafeManha;
    }

    public boolean isAlmoco() {
        return almoco;
    }

    public boolean isJanta() {
        return janta;
    }
    
    
    
}
