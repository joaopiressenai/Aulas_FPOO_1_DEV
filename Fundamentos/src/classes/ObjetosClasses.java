/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.Atividades.Aluno;

/**
 *
 * @author Aluno
 */
public class ObjetosClasses {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true,
                18, "Caloi Cross", true, "Azul");
        System.out.println(caloiCross);
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        System.out.println(caloiCross);
        
        Aluno aluno01 = new Aluno("João", "joao@gmail.com", 123);
        aluno01.aprovado(9.8, 7.3);
        aluno01.estudar();
        System.out.println(aluno01);
        
        Aluno aluno02 = new Aluno("Gabriel", "gabriel@gmail.com", 124);
        aluno02.aprovado(3.8, 5.4);
        aluno02.estudar();
        System.out.println(aluno02);
        
        Carro carro01 = new Carro("Toyota", "Prius", CorEnum.PRETO, 2022, true, 4, 0);
        carro01.andar(95);
        carro01.freiar(70);
        carro01.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        carro01.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        
        System.out.println(carro01);
        
        Carro carro02 = new Carro("Toyota", "Corola", CorEnum.PRETO, 2022, true, 4, 0);
        carro02.andar(110);
        carro02.freiar(90);
        System.out.println(carro02);
    }
    
}
