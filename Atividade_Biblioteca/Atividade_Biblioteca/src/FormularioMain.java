import javax.swing.*;
import java.awt.*;

public class FormularioMain extends JFrame{
    JTextField txtNome = new JTextField(null, 20);
    JButton btnPesquisar = new JButton("Pesquisar");
    JLabel lblNome = new JLabel("Nome:");
    JTextField txtID = new JTextField(null, 10);
    JLabel lblID = new JLabel("ID:");
    JButton alterarButton = new JButton("Alterar");
    JButton novoButton = new JButton("Novo");
    JButton cadastrarButton = new JButton("Cadastrar");
    JTextField txtExemplar = new JTextField(null, 20);
    JTextField txtAutor = new JTextField(null, 20);
    JTextField txtEdicao = new JTextField(null, 20);
    JTextField txtAno = new JTextField(null, 20);
    JTextField txtDisponibilidade = new JTextField(null, 20);
    JButton sairButton = new JButton("Sair");
    JLabel lblExemplar = new JLabel("Exemplar:");
    JLabel lblAutor = new JLabel("Autor:");
    JLabel lblEdicao = new JLabel("Edição:");
    JLabel lblAno = new JLabel("Ano:");
    JLabel lblDisponibilidade = new JLabel("Disponibilidade");
    JTable tblCliente = new JTable();
    JButton excluirButton = new JButton("Excluir");

    public FormularioMain(){
        setLayout(new FlowLayout());//posiciona os componentes um após o outro

        getContentPane().add(lblNome);
        getContentPane().add(txtNome);
        getContentPane().add(btnPesquisar);
        getContentPane().add(tblCliente);
        getContentPane().add(lblID);
        getContentPane().add(txtID);
        getContentPane().add();
        getContentPane().add();
        getContentPane().add();
        getContentPane().add();
        getContentPane().add();
        getContentPane().add();
        getContentPane().add();

    }
}
