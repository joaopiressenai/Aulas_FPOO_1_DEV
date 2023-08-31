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
    
    public String comum() {
        System.out.println(UMA_ESTRELA);
        return UMA_ESTRELA;
    }
    
    public String legal() {
        System.out.println(TRES_ESTRELAS);
        return TRES_ESTRELAS;
    }
    
    public String superLegal() {
        System.out.println(CINCO_ESTRELAS);
        return CINCO_ESTRELAS;
    }
        
}
