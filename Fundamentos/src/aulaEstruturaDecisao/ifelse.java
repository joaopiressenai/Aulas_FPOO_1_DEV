
package aulaEstruturaDecisao;

import java.util.Scanner;


public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >=18) {
            System.out.println("Você pode entrar na festa");
        } else {
            System.out.println("Você nao pode entrar na festa, por ser menor de idade");
        }
    }

}
