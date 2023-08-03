package atividades;

import java.util.Scanner;

public class Exercicio09 {
public static void main(String[] args) {
        double rs = media(10,5,7,9,8);
        System.out.println("A soma: "+ rs);
    }
    
    public static int media(double ... valores) {
     int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            double valor = valores[i];
            resultado += valor/valores.length;

            
        }
        return resultado;
    }
}

