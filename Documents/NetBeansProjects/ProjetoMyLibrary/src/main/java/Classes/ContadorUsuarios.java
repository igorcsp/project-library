package Classes;

import Telas.AdmTelaMenuAdministrador;
import Telas.LoginTela;
import Telas.UserTelaMenuUsuario;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class ContadorUsuarios {
    public void contaUsuarios(JTextField quantidadeUsuarios) throws Exception {
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            ConnectionFactory.ConnectionFactory objetoConexao = new ConnectionFactory.ConnectionFactory();
            String sql = "select count(*) from tb_usuarios;";
            CallableStatement cs = objetoConexao.obterConexao().prepareCall(sql);            
            
            //ps.setString(1, cpf.getText());
            //paramEmprestadoPara.setText(paramTableLivros.getValueAt(linha, 5).toString());
            cs.getString(quantidadeUsuarios.getText());
            
            rs = cs.executeQuery();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        
    }
}
