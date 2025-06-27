package entidades;

public class Produto {


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

    public double totalValorStock (){
        return preco * quantidade;
    }

    public void addQuantidadestock(int ad){
        this.quantidade += ad;
    }

    public void removeQuantidadeStock(int sub){
        this.quantidade -= sub;
    }
    @Override
    public String toString(){
        return nome
            + " - $"
            + String.format("%.2f", preco)
            + " - "
            + quantidade
            + " unidades. \nTotal: $ "
            + String.format("%.2f", totalValorStock());
    }
}
