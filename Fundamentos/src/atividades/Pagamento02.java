package atividades;

import java.util.Scanner;



public class Pagamento02 {
    public static void main(String[] args) {
        // Usando scanner para receber informações do terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do produto:");
        String nomeProduto = scanner.next();
        System.out.println("Valor do produto:");
        double valorProduto = scanner.nextDouble();
        System.out.println("Quantidade do produto:");
        int quantidadeProduto = scanner.nextInt();
        System.out.println("Insira a forma de pagamento: (Debito = D, Credito = C");
        String formaPagamento = scanner.next();
        
        // Aplicando metodos da classe Cliente para fazer a lógica necessária
        Produto02 cliente1 = new Produto02(nomeProduto, valorProduto, quantidadeProduto);
        double valorTotal = cliente1.ValorTotal();
        double valorFinal = 0;
        if (formaPagamento == "D") {
            if (valorTotal <= 100) {
                 valorFinal = valorTotal - (valorTotal*5/100);
            }
            else {
               valorFinal = valorTotal;
            }
        } else {
            valorFinal = valorTotal;
        }
        System.out.println("Deseja parcelar a compra: (Sim = S, Nao = N)");
        char parcelamento = scanner.next().charAt(0);
        if (parcelamento == 'S') {
            System.out.println("Numero de parcelas:");
            int numeroParcelas = scanner.nextInt();
            double valorParcelamento = valorFinal / numeroParcelas;  
            System.out.println("Produto:" + cliente1.getNomeProduto());
            System.out.println("Valor:" + cliente1.getValorProduto());
            System.out.println("Quantidade:"+ cliente1.getQuantidadeProduto());
            System.out.println("Valor a pagar:" + valorFinal);
            System.out.println("Forma de pagamento:" + formaPagamento);
            System.out.println("Numero de parcelas:" + numeroParcelas);
            System.out.println("Valor por parcela:" + valorParcelamento);
        }  else {
            System.out.println("Produto:" + cliente1.getNomeProduto());
            System.out.println("Valor:" + cliente1.getValorProduto());
            System.out.println("Quantidade:"+ cliente1.getQuantidadeProduto());
            System.out.println("Valor a pagar:" + valorFinal);
            System.out.println("Forma de pagamento:" + formaPagamento);            
        }
    }

}
