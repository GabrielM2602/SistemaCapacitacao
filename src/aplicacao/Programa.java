package aplicacao;

import entidades.Produto;
import entidades.ServidorPublico;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//        isabela.setNome("João");;
//
//        ServidorPublico joao = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123, "Maria");
//        System.out.println(maria.getNome());
//        ServidorPublico jose = new ServidorPublico(4,"José","Médico");
//        System.out.println(jose.getNome());
//        System.out.println(jose.getCargo());
//
//
//        isabela.calcularSalarioHorasExtras(10,5.60);
//
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.printf("Horas extras R$ %.2f: ",isabela.getHorasExtras());
//        isabela.calcularNumeros(4,6,20,56);

        Produto compra = new Produto();

        Scanner leia = new Scanner(System.in);

        System.out.println("Produto selecionado: ");
        int escolha = 0;

        while (escolha == 0){
            System.out.println("Nome -> 1"+"\n"+ "Preco -> 2"+"\n" + "Quantidade -> 3"+"\n" + "Finalizar -> 4"+"\n");
            System.out.println("Escolha: ");
            escolha = leia.nextInt();
            compra.escolha(escolha);

        }



    }
}
