/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Estacionamento {
    public static void main(String[] args) {
        Carro gol = new Carro("Gol muito conservado", 1999, "Azul", 
                "G2", "Volkswagem", 13999, false, false, 
                5, CambioEnum.MANUAL, CombustivelEnum.GASOLINA);
        System.out.println(gol);
        System.out.println("------------------------------------------------------------");
        Moto hornet = new Moto("Moto hornet 600 Cilindradas", 2014, "Preta",
                "Hornet", "Honda", 40000, true, true,
                CombustivelEnum.GASOLINA, PartidaEnum.ELETRICA);
        System.out.println(hornet);
        System.out.println("------------------------------------------------------------");
        Scooter scooter = new Scooter(2200, "Scooter elétrica", 2023,
                "Cinza", "ELEKTRA", "Honda", 10000, true, false);
        System.out.println(scooter);
        System.out.println("------------------------------------------------------------");
    }
}
