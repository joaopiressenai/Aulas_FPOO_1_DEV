package orientacaoObjetos;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
           this.email = "";
        }
        return "Cliente{" + "nome=" + nome + ", email=" + email + '}';     
    }
    
    /**
     * Calcula o valor total da locação do filme
     * Regra para filme comuns
     * @param qtdeDias
     * @return 
     */
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * 3.99;
    }
    
    /**
     * Calcula o valor total da locação do filme
     * Regra para filmes novos
     * @param qtdeDias
     * @param lancamento
     * @return 
     */
    public double calcularLocacao(int qtdeDias, boolean lancamento) {
        return qtdeDias * 6.99;
    }
}
