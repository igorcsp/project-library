package Classes;

import Telas.CadastroTelaUsuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Cadastrar {
    public void inserirCadastro(JTextField cpf, JTextField nome, JPasswordField senhaChar, JTextField telefone, JTextField email, JTextField endereco, JTextField complemento) {
        PreparedStatement ps = null;
        PreparedStatement ss = null;
        
        try {
            ConnectionFactory.ConnectionFactory objetoConexao = new ConnectionFactory.ConnectionFactory();

            String inserir = "insert into tb_usuariosA (cpf, nome, senha, telefone, email, endereco, complemento)values (?, ?, ?, ?, ?, ?, ?);";
            ps = objetoConexao.obterConexao().prepareStatement(inserir);

            String senha = String.valueOf(senhaChar.getPassword());

            ps.setString(1, cpf.getText());
            ps.setString(2, nome.getText());
            ps.setString(3, senha);
            ps.setString(4, telefone.getText());
            ps.setString(5, email.getText());
            ps.setString(6, endereco.getText());
            ps.setString(7, complemento.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
            CadastroTelaUsuario tcu = new CadastroTelaUsuario();
            tcu.dispose();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! Favor informe com informações corretas os campos obrigatórios. Segue erro: " + e.toString());
        }
    }
}
