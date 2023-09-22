/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Professor p1 = new Professor(true, "Pedro Nóbile", "pedro@gmail.com", 30, true);
        System.out.println(p1);
        System.out.println(p1.verificarDominioEmailGmail(p1.getEmail()));
        System.out.println(p1.verificarDominioEmailYahoo(p1.getEmail()));
        System.out.println(p1.verificarDedicacaoExclusiva(p1.isDedicacaoExclusiva()));
        
        Professor p2 = new Professor(false, "Moisés Olimpio", "moises@yahoo.com", 26, false);
        System.out.println(p2);
        System.out.println(p2.verificarDominioEmailGmail(p2.getEmail()));
        System.out.println(p2.verificarDominioEmailYahoo(p2.getEmail()));
        System.out.println(p2.verificarDedicacaoExclusiva(p2.isDedicacaoExclusiva()));
        
        Aluno a1 = new Aluno("a001", "Gabriel", "gabriel@gmail.com", 16, true);
        System.out.println(a1);
        System.out.println(a1.verificarDominioEmailGmail(a1.getEmail()));
        System.out.println(a1.verificarDominioEmailYahoo(a1.getEmail()));
        System.out.println("Tamanho ra: " + a1.verificarTamanhoRa(a1.getRa()));
        
        Aluno a2 = new Aluno("a002", "Gustavo", "gustavo@gmail.com", 17, true);
        System.out.println(a2);
        System.out.println(a2.verificarDominioEmailGmail(a2.getEmail()));
        System.out.println(a2.verificarDominioEmailYahoo(a2.getEmail()));
        System.out.println("Tamanho ra: " + a2.verificarTamanhoRa(a1.getRa()));
        
        Aluno a3 = new Aluno("a003", "João Mendes", "joao@yahoo.com", 18, true);
        System.out.println(a3);
        System.out.println(a3.verificarDominioEmailGmail(a3.getEmail()));
        System.out.println(a3.verificarDominioEmailYahoo(a3.getEmail()));
        System.out.println("Tamanho ra: " + a3.verificarTamanhoRa(a1.getRa()));
    }
    
}
