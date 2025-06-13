package aplicacao;

import entidades.Produto;
// import entidades.ServidorPublico;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha = 0, ad, sub;
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

        System.out.println("\nColoque os dados do produto: \n");
        System.out.print("Nome: ");
        compra.setNome(leia.nextLine());
        System.out.print("Quantidade: ");
        compra.setQuantidade(leia.nextInt());
        System.out.print("Preço: ");
        compra.setPreco(leia.nextDouble());
        System.out.println("\n"+compra.toString()+"\n");
        
        while (escolha != 3) {
            System.out.print("\nEscolha se deseja adicionar ou retirar uma unidade do stock: \n"+"\n1 -- Adicionar"+"\n2 -- Retirar"+"\n3 -- sair\n"+"\nEscolha: ");
            escolha = leia.nextInt();

            if(escolha == 1){
                System.out.print("\nDigite a quantidade de produtos a adicionar: ");
                ad = leia.nextInt();
                compra.addQuantidadestock(ad);
            }
            if(escolha == 2){
                System.out.print("\nDigite a quantidade de produtos a retirar: ");
                sub = leia.nextInt();
                compra.removeQuantidadeStock(sub);
            }
            if (escolha == 3) {
                System.out.println("\nTchau!\n");
                break;
            }
            System.out.println("\n"+compra.toString()+"\n");

            if (escolha == 0 || escolha > 3){
                System.out.println("\nOpção invalida!\n");
            }

        }






        leia.close();
    }
}
