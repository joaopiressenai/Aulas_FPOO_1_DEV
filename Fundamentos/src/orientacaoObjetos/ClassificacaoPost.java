/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package orientacaoObjetos;

/**
 *
 * @author Aluno
 */
public interface ClassificacaoPost {   
    int UMA_ESTRELA = 1;
    int TRES_ESTRELAS = 3;
    int CINCO_ESTRELAS = 5;
    
    public int comum(int qtdeEstrelas);
    public int legal(int qtdeEstrelas);
    public int superLegal(int qtdeEstrelas);
}
