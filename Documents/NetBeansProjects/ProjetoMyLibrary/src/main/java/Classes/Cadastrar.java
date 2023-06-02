package Classes;

import Telas.CadastroTelaUsuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Cadastrar {
    public void inserirCadastroComum(JTextField cpf, JTextField nome, JPasswordField senhaChar, JTextField telefone, JTextField email, JTextField endereco, JTextField complemento) {
        PreparedStatement ps = null;
        //
        PreparedStatement ss = null;
        //
        try {
        ConnectionFactory.ConnectionFactory objetoConexao = new ConnectionFactory.ConnectionFactory();
        
        String inserir = "insert into tb_usuarios (cpf, nome, senha, telefone, email, endereco, complemento)values (?, ?, ?, ?, ?, ?, ?);";
        ps = objetoConexao.obterConexao().prepareStatement(inserir);
        
        //
        String var = cpf.getText();
        String tabelaNova = String.format("create table tb_livrosDeInteresse%s (`id` int not null auto_increment, `titulo` varchar(45) not null, PRIMARY KEY(id));", var);
        ss = objetoConexao.obterConexao().prepareStatement(tabelaNova);
        ss.execute();
        //
        
        String senha = String.valueOf(senhaChar.getPassword());
        
        ps.setString(1, cpf.getText());
        ps.setString(2, nome.getText());
        ps.setString(3, senha);
        ps.setString(4, telefone.getText());
        ps.setString(5, email.getText());
        ps.setString(6, endereco.getText());
        ps.setString(7, complemento.getText());
     
        
        ps.execute();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
        CadastroTelaUsuario tcu = new CadastroTelaUsuario();
        tcu.dispose();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dado já existe em sistema, segue erro: " + e.toString());
        }
    }
}
