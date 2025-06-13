package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class ProgFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario fc = new Funcionario();

        System.out.println(" Entre com os dados do funcionário: ");
        System.out.print("Nome: ");
        fc.setNome(sc.nextLine());
        System.out.print("Salário: ");
        fc.setSalarioB(sc.nextDouble());
        System.out.print("Taxa: ");
        fc.setTaxa(sc.nextDouble());
        System.out.println(fc);

        System.out.print("Qual a porcetagem de aumento: ");
        double porcentagem = sc.nextDouble();
        fc.nSalario(porcentagem);
        System.out.println("Novos dados: "+ fc);

        sc.close();
    }
}
