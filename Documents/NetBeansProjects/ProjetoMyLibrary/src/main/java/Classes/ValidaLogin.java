package Classes;

import TelasLoginECadastro.TelaLogin;
import TelasAdministrador.TelaMenuAdministrador;
import TelasAluno.TelaMenuAluno;
import TelasProfessor.TelaMenuProfessor;
import TelasUsuario.TelaMenuUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ValidaLogin {
    public void validaUsuario(JTextField usuario, JPasswordField senhaChar, JTextField tipoUsuarioString) {
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            Classes.ConnectionFactory objetoConexao = new Classes.ConnectionFactory();
            String consulta = "select * from tb_usuarios where cpf = ? and senha = ? and tipoUsuario=?";
            ps = objetoConexao.obterConexao().prepareStatement(consulta);
            
            String senha = String.valueOf(senhaChar.getPassword());
            int tipoUsuario = Integer.parseInt(tipoUsuarioString.getText());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, senha);
            ps.setInt(3, tipoUsuario);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                TelaLogin tl = new TelaLogin();
                switch (tipoUsuario) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Bem vindo, administrador!");
                        TelaMenuAdministrador tma = new TelaMenuAdministrador();
                        tma.setVisible(true);
                        tl.dispose();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Bem vindo!");
                        TelaMenuUsuario tmu = new TelaMenuUsuario();
                        tmu.setVisible(true);
                        tl.dispose();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Bem vindo, aluno!");
                        TelaMenuAluno tmal = new TelaMenuAluno();
                        tmal.setVisible(true);
                        tl.dispose();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Bem vindo, professor!");
                        TelaMenuProfessor tmp = new TelaMenuProfessor();
                        tmp.setVisible(true);
                        tl.dispose();
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
}
