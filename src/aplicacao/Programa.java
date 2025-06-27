package aplicacao;

// import entidades.Curso;
import entidades.ServidorPublico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Programa {

    static List<ServidorPublico> servidores = new ArrayList<>();
    // static List<Curso> cursos = new ArrayList<>();

        public static void adicionarServidorPublico(){

            int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula: "));
            String nome = JOptionPane.showInputDialog("Informe o nome do servidor: ");
            String orgao = JOptionPane.showInputDialog("Informe o orgão: ");
            String cargo = JOptionPane.showInputDialog("Informe o cargo do servidor: ");
            String lotacao = JOptionPane.showInputDialog("Informe a lotação do servidor: ");
            String email= JOptionPane.showInputDialog("Informe o email do servidor: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do servidor: "));

            ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);

            servidores.add(servidor);
        }
        public static void listaServidorPublico(){


            for (ServidorPublico servidor : servidores) {
                System.out.println(servidor);
                
            }
        }
        public static void listarServidores(int matricula){
            boolean encontrou = false;

            
            for (ServidorPublico servidor : servidores) {
                if( servidor.getMatricula() == matricula){
                    encontrou = true;
                    JOptionPane.showMessageDialog(null, "Encontrado!"+" Servidor: "+servidor.getNome());
                    break;
                }
            }
            if(encontrou == false){
                JOptionPane.showMessageDialog(null, "Servidor não encontrado! ");
            }
        }
        public static void listarServidores(String nome){
            boolean encontrou = false;

            
            for (ServidorPublico servidor : servidores) {
                if( servidor.getNome().equals(nome)){
                    encontrou = true;
                    JOptionPane.showMessageDialog(null, "Encontrado!"+" Servidor: "+servidor.getNome());
                    break;
                }
            }
            if(encontrou == false){
                JOptionPane.showMessageDialog(null, "Servidor não encontrado! ");
            }
        }

    public static void main(String[] args) {

        adicionarServidorPublico();
        adicionarServidorPublico();
        listaServidorPublico();

        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula que deseja encontrar: "));
        listarServidores(matricula);

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do servidor que deseja encontrar: ");
        listarServidores(nome);


    }
}

