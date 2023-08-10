
package aulaEstruturaDecisao;

import java.util.Scanner;


public class ifelse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura: ");
        int temperatura = scanner.nextInt();
        
        if (temperatura <= 15) {
            System.out.println("Esta ficando frio");
        } else if (temperatura >= 16) {
            System.out.println("Esta ficando agradavel");
        } else if (temperatura >= 30) {
            System.out.println("Esta ficando calor");
        }
        
        switch (temperatura) {
            case 15:
                System.out.println("Esta frio");
                break;
            case 20:
                System.out.println("Esta agradavel");
                break;
            case 30: 
                System.out.println("Esta calor");
            default:
                System.out.println("Temperatura não identificada");
                break;
        }
    }

}
