/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        int qtdeEstrelas = 0;
        
        Post post1 = new Post("Vaga DEV junior", "Procura-se jovem com conhecimento java e API");
        post1.habilitarComentario();
        post1.darLike();
        System.out.println(post1);
        post1.superLegal(5);
        
        System.out.println("\n");
        
        Post post2 = new Post("Ajuda com o codigo python", "Preciso de ajuda com o codigo abaixo");
        post2.habilitarComentario();
        post2.habilitarImagem();
        System.out.println(post2);
        post2.legal(3);  
        
        System.out.println("\n");
        
        Post post3 = new Post("X1 no chess", "Procuro oponente no xadrez");
        post3.habilitarImagem();
        System.out.println(post3);
        post3.comum(1);  
        
    }
    
}
