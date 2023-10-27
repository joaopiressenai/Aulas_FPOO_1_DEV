/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_string;

/**
 *
 * @author Aluno
 */
public class Aulas {
    public static void main(String[] args) {
    String decoracao = "---------------------------------------------------------";
    System.out.println(decoracao);
        
//    Criar variavel para nome, cidade e atribuir o tamanho da string, fazendo print de ambos
    
    String nome = "Shifu";
    int comprimentoNome = nome.length();
    String cidade = "Piracicaba";
    int comprimentoCidade = cidade.length();
    System.out.println(
            "Variavel: " + nome  
            + "\nComprimento: " + comprimentoNome 
            + "\nVariavel: " + cidade 
            + "\nComprimento: " + comprimentoCidade
    );
    System.out.println(decoracao);
    
//    Minha cidade Piracicaba é muita linda
    String frase = "Minha cidade ".concat(cidade).concat(" e muito linda :)");
    System.out.println(frase);
    System.out.println(decoracao);
    
//    Imprimir o nome do aluno e sua média
    String aluno = "Valdemar";
    double nota1 = 9.8;
    double nota2 = 3.4;
    double media = (nota1 + nota2) /2;
    String mensagem = "";
    if (media > 7) {
        mensagem = "aprovado";
    } else {
        mensagem = "reprovado";
    }
    
    String fraseAluno = String.format("O aluno %s tem media %.2f, portanto, esta %s", aluno, media, mensagem);
    
    System.out.println(fraseAluno);
    System.out.println(decoracao);
    
//    Declare uma string com a idade de Piracicaba
//    Converta para inteiro
//    Faça o print da idade e da cidade com String format
    String idadePiracicabaString = "256";
    int idadePiracicabaInt = Integer.parseInt(idadePiracicabaString);
    String oracao = String.format("A cidade %s tem %d anos", cidade, idadePiracicabaInt);
    
    System.out.println(oracao);
    System.out.println(decoracao);
    
//    Declare uma variavel inteira com sua idade
//    Transforme em string essa variavel
//    Utilize o string format para imprimir seu nome
//    Com sua idade
    
    int idadeInt = 17;
    String idadeString = Integer.toString(idadeInt);
    String oracao1 = String.format("O(A) %s tem %s anos", nome, idadeString);
    
    System.out.println(oracao1);
    System.out.println(decoracao);

//    Pesquise sobre o metodo split em Java
//    Declare uma string com seu nome e sobrenome
//    Armazene em outra String as iniciais do nomee sobrenome
    String nomeSobrenome = "João Vitor";
    String vetor[] = nomeSobrenome.split(" ");
    String iniciais = 
            String.format("As iniciais do nome são: %s%s",
            vetor[0].charAt(0), vetor[1].charAt(0));
    
    System.out.println(iniciais);
    
//    Utilize o nome da ciade e pegue os 4 primeiros caracteres, depois pegue os 4 ultimos
    System.out.println(cidade);
    String primeiras4letras = cidade.substring(0,4);
    String ultimas4letras = cidade.substring(cidade.length()-4);
    System.out.println(primeiras4letras + "\n" + ultimas4letras);
    
//    Feliz aniversario, muitas felicidades e muita saude
//    Converta a frase acima para
//    FELIZ aniversario, muitas FELICIDADES e muita SAUDE
    
    String niver = "Feliz".toUpperCase()
            .concat(" aniversario, muitas")
            .concat(" felicidades".toUpperCase()
            .concat(" e muita ")
            .concat("saude".toUpperCase()));
        System.out.println(niver);
    }
    
}
