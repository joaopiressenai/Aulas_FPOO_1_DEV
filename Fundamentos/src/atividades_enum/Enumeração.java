/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades_enum;


/**
 *
 * @author Aluno
 */
public class Enumeração {
    public static void main(String[] args) {
        Data data = new Data(17, MesesEnum.AGOSTO.getMeses(), 2023);
        System.out.println(data);
        
        Livros livro = new Livros("Senhor dos Anéis", LivrosEnum.FANTASIA.getCategorias(), 100.00);
        System.out.println(livro);
        
        ProdutosCantina produto = new ProdutosCantina(ProdutosEnum.SONHO_VALSA.getProdutos(), 2.00);
        System.out.println(produto);
        
        RedesSociais redes = new RedesSociais(RedesEnum.FACEBOOK.getRedes());
        System.out.println(redes);
    }
   
}
