/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjetos;

/**
 *
 * @author Aluno
 */
public class Post implements ClassificacaoPost{
    private String tituloPost;
    private String conteudoPost;
    private boolean temImagem;
    private boolean temComentario;
    private int like;
    private String estrela;

    public Post(String tituloPost, String conteudoPost) {
        this.tituloPost = tituloPost;
        this.conteudoPost = conteudoPost;
        this.temImagem = false;
        this.temComentario = temComentario;
        this.like = 0;
    }

    @Override
    public String toString() {
        return "Post{" + "tituloPost=" + tituloPost + ", conteudoPost=" + conteudoPost + ", temImagem=" + temImagem + ", temComentario=" + temComentario + ", like=" + like + '}';
    }
    
    public boolean habilitarImagem () {
        return this.temImagem = true;
    }
    
    public boolean habilitarComentario() {
        return this.temComentario = true;
    }
    
    public int darLike() {
        return this.like += 1;
    }

    @Override
    public int comum(int qtdeEstrelas) {
        System.out.println("O post obeteve " + qtdeEstrelas + " e foi classificado como comum");
        return UMA_ESTRELA;
    }

    @Override
    public int legal(int qtdeEstrelas) {
        System.out.println("O post obeteve " + qtdeEstrelas + " e foi classificado como comum");
        return TRES_ESTRELAS;
    }

    @Override
    public int superLegal(int qtdeEstrelas) {
        System.out.println("O post obeteve " + qtdeEstrelas + " e foi classificado como comum");
        return CINCO_ESTRELAS;
    }

    
        
}
