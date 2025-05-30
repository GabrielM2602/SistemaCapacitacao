package entidades;

import java.util.Scanner;

public class Produto {
    Scanner leia = new Scanner(System.in);


    private String nome;
    private double preco;

    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void escolha(int escolha){
        String nome;
        int quantidade;
        double preco;

        if(escolha == 1){
            System.out.println("Nome: ");
            nome = leia.next();
            this.nome = nome;
        }
        if (escolha == 2){
            System.out.println("Preço: ");
            preco = leia.nextDouble();
            this.preco = preco;
        }

        if (escolha == 3){
            System.out.println("Quantidade: ");
            quantidade = leia.nextInt();
            this.quantidade = quantidade;
        }
        if(escolha == 4){
            System.out.println("OK");
            escolha = 4;
        }

    }
    public void totalValorStock (){}

    public void addQuantidadestock(){}

    public void removeQuantidadeStock(){}
}
