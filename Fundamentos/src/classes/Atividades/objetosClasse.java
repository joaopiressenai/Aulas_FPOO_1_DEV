/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public class objetosClasse {
    public static void main(String[] args) {
        Sala sala01 = new Sala(32, 32, 1, 32);
        sala01.existeProjetor();
        sala01.ligarProjetor();
        sala01.projetarConteudo();
        System.out.println(sala01);
        
        Sala sala02 = new Sala(24, 24, 2, 24);
        sala02.existeProjetor();
        sala02.ligarProjetor();
        System.out.println(sala02);
        
        Sala sala03 = new Sala(40, 40, 3, 40);
        sala03.existeProjetor();
        sala03.ligarProjetor();
        System.out.println(sala03);
        
        Computador computador01 = new Computador(MemoriaEnum.OITOGB,
                ProcessadorEnum.PROCESSADOR1,
                500,
                sistemaOperacionalEnum.WINDOWS);
        computador01.ligarComputador();
        computador01.memoriaMedia();
        System.out.println("\n" +computador01);
        
        Computador computador02 = new Computador(MemoriaEnum.DEZESSEIS,
                ProcessadorEnum.PROCESSADOR2,
                500,
                sistemaOperacionalEnum.LINUX);
        computador01.memoriaVazia();
        System.out.println(computador02);
        
        Computador computador03 = new Computador(MemoriaEnum.QUATROGB,
                ProcessadorEnum.PROCESSADOR3,
                500,
                sistemaOperacionalEnum.LINUX);
        computador01.memoriaCheia();
        System.out.println(computador03);
        
        Curso curso01 = new Curso("Desemvolvimento de Sistemas",
                "Curso tecnico preparatorio para industria tecnologica",
                CategoriaEnum.MARCENARIA);
        curso01.cadastrarAluno("João", "joao@gmail.com", 123, 9.8, 4.5);
        curso01.trancarCurso();
        System.out.println("\n" + curso01);
        
        Curso curso02 = new Curso("Eletroeletronica",
                "Curso tecnico preparatorio para industria eletronica",
                CategoriaEnum.TI);
        curso02.cadastrarAluno("Gabriel", "gabriel@gmail.com", 124, 7.8, 3.5);
        System.out.println("\n" + curso02);
        
        Curso curso03 = new Curso("Eletromecanica",
                "Curso tecnico preparatorio para industria mecanica",
                CategoriaEnum.TI);
        curso03.cadastrarAluno("Daniel", "daniel@gmail.com", 125, 6.9, 8.5);
        curso03.trancarCurso();
        System.out.println("\n" + curso03);
    }
}
