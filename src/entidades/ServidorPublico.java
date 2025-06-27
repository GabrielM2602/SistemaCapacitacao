package entidades;

public class ServidorPublico {


    private int matricula;
    private String nome;
    private String foto;
    private String orgao;
    private String vinculo;
    private double salario;
    private int idade;
    private int tempoDeContribuicao;
    private String cargo;
    private String telefone;
    private String celular;
    private String cpf;
    private String lotacao;
    private String email;
    private double horasExtras;


    public ServidorPublico(){}

    public ServidorPublico(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public ServidorPublico(int matricula, String nome, String cargo){
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }

    public ServidorPublico(int matricula, String nome, String orgao, String cargo, String lotacao, String email, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.orgao = orgao;
        this.cargo = cargo;
        this.lotacao = lotacao;
        this.email = email;
        this.salario = salario;
    }

    public ServidorPublico(String cargo, String celular, String cpf, String email, String foto,
     double horasExtras, int idade, String lotacao, int matricula, String nome, String orgao, double salario, String telefone, 
     int tempoDeContribuicao, String vinculo) {
        this.cargo = cargo;
        this.celular = celular;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
        this.horasExtras = horasExtras;
        this.idade = idade;
        this.lotacao = lotacao;
        this.matricula = matricula;
        this.nome = nome;
        this.orgao = orgao;
        this.salario = salario;
        this.telefone = telefone;
        this.tempoDeContribuicao = tempoDeContribuicao;
        this.vinculo = vinculo;
    }

    



    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoDeContribuicao() {
        return tempoDeContribuicao;
    }

    public void setTempoDeContribuicao(int tempoDeContribuicao) {
        this.tempoDeContribuicao = tempoDeContribuicao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public double calcularSalarioHorasExtras (double horasTrabalhas, double valorHora){
       double salarioMensal = salario + (horasTrabalhas*valorHora);
       horasExtras = salarioMensal;
       return (salarioMensal);

    }

    public double calcularNumeros (double... numeros){
        double soma=0;
        for (double numero : numeros){
            soma +=  numero;
        }

        System.out.println("A soma dos argumentos informados: "+soma);
        return soma;
    }
    
    @Override
    public String toString() {
        return "ServidorPublico [matricula=" + matricula + ", nome=" + nome + ", orgao=" + orgao + ", salario="
                + salario + ", cargo=" + cargo + ", lotacao=" + lotacao + "]";
    }
}
