
package aulaEstruturaDecisao;

import java.util.Scanner;


public class atividade1 {
    public static void main(String[] args) {
        //  1) Crie um programa que calcule o salario do funcionário conforme 
        //  a tabela abaixo, o programa deve perguntar o cargo do funcionário:
        //
        //  Fórmula para cálculo: Salário - Descontos, onde:
        //  desconto INSS = salario * (INSS / 100)
        //
        //  Cargo           Salário            INSS     Convênio
        //  Gerente        R$ 5590,00      8%      R$ 289,00
        //  Supervisor   R$ 4128,00      7%      R$ 239,00
        //  Técnico        R$ 3789,00      4%      R$ 189,00
        //  Auxiliar        R$ 2345,00       2%      R$ 156,00
        
        //  Declaração de variáveis
        int salario = 0;
        double inss = 0;
        int convenio = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu cargo: ");
        String cargo = scanner.next();
        
        // Aplicação da Lógica
        if (cargo == "Gerente") {
            salario = 5590;
            inss = 0.08;
            convenio = 289;
        } else if (cargo == "Supervisor") {
            salario = 4128;
            inss = 0.07;
            convenio = 239;
        } else if (cargo == "Tecnico") {
            salario = 3789;
            inss = 0.04;
            convenio = 189;
        } else if (cargo == "Auxiliar") {
            salario = 2345;
            inss = 0.02;
            convenio = 156;
        }
        
        double descontoInss = salario * inss;
        double salarioFinal = (salario - descontoInss) - convenio;
        System.out.println("O salario e: " + salarioFinal);
    }

}
