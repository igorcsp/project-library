package Classes;

import TelasLoginECadastro.TelaLogin;
import TelasAdministrador.TelaMenuAdministrador;

import TelasUsuario.TelaMenuUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ValidaLogin {
    public void validaUsuario(JTextField usuario, JPasswordField senhaChar) {
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            ConnectionFactory.ConnectionFactory objetoConexao = new ConnectionFactory.ConnectionFactory();
            String consulta = "select * from tb_usuarios where cpf = ? and senha = ?";
            ps = objetoConexao.obterConexao().prepareStatement(consulta);
            
            String senha = String.valueOf(senhaChar.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, senha);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                TelaLogin tl = new TelaLogin();
                if(senha.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Bem vindo, administrador!");
                    TelaMenuAdministrador tma = new TelaMenuAdministrador();
                    tma.setVisible(true);
                    tl.dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Bem vindo!");
                    TelaMenuUsuario tmu = new TelaMenuUsuario();
                    tmu.setVisible(true);
                    tl.dispose();
                }
                

            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}
