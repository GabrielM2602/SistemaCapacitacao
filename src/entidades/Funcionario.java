package entidades;

public class Funcionario {
    private String nome;
    private double salarioB;
    private double taxa;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioB() {
        return salarioB;
    }
    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void nSalario(double porcentagem){
        salarioB += salarioB * (porcentagem/100);
    }

    public double lSalario(){
        double lSalario = salarioB - taxa;
        return lSalario;
    }

    public String toString(){
        return nome
            + " $"
            + String.format("%.2f", lSalario());
    }
}
