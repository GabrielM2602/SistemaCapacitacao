package aplicacao;

import entidades.ServidorPublico;
import javax.swing.*;

public class Programa {


        public static void main(String[] args) {
            ServidorPublico servidorPublico  = new ServidorPublico();

            servidorPublico.adicionarServidorPublico();
            servidorPublico.adicionarServidorPublico();
            servidorPublico.adicionarServidorPublico();
            servidorPublico.listarServidores();

            servidorPublico.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula que deseja pesquisar")));
            servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula do servidor que deseja excluir: ")));
            servidorPublico.listarServidores();
    }


}