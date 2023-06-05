package Classes;

import Telas.LoginTela;
import Telas.AdmTelaMenuAdministrador;
import Telas.UserTelaMenuUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ValidaLogin {
    public void validaUsuario(JTextField cpf, JPasswordField senhaChar) {
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            ConnectionFactory.ConnectionFactory objetoConexao = new ConnectionFactory.ConnectionFactory();
            String consulta = "select * from tb_usuarios where cpf = ? and senha = ?";
            ps = objetoConexao.obterConexao().prepareStatement(consulta);
            
            String senha = String.valueOf(senhaChar.getPassword());
            
            ps.setString(1, cpf.getText());
            ps.setString(2, senha);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                LoginTela tl = new LoginTela();
                if(senha.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Bem vindo, administrador!");
                    AdmTelaMenuAdministrador tma = new AdmTelaMenuAdministrador();
                    tma.setVisible(true);
                    tl.dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Bem vindo!");
                    UserTelaMenuUsuario tmu = new UserTelaMenuUsuario();
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
