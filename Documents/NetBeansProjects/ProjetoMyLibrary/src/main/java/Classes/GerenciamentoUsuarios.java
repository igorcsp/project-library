package Classes;

import ConnectionFactory.ConnectionFactory;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class GerenciamentoUsuarios {
    public void mostrarUsuarios(JTable paramTableUsuarios) {
        ConnectionFactory objetoConexao = new ConnectionFactory();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("ID");
        modelo.addColumn("CPF");
        modelo.addColumn("Nome");
        modelo.addColumn("Senha");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");
        modelo.addColumn("Endereço");
        modelo.addColumn("Complemento");
        
        paramTableUsuarios.setModel(modelo);
        
        sql = "SELECT * FROM tb_usuariosA;";
        
        String [] dados = new String[8];
        
        Statement st;
        
        try {
            st = objetoConexao.obterConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                dados[0] = rs.getString(1);
                dados[1] = rs.getString(2);
                dados[2] = rs.getString(3);
                dados[3] = rs.getString(4);
                dados[4] = rs.getString(5);
                dados[5] = rs.getString(6);
                dados[6] = rs.getString(7);
                dados[7] = rs.getString(8);
                
                modelo.addRow(dados);
            }
            
            paramTableUsuarios.setModel(modelo);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não mostrou o registro. Erro: " + e.toString());
        }
    }
    
    public void selecionarUsuarios(JTable paramTableUsuarios, JTextField paramId, JTextField paramCpf, JTextField paramNome, JPasswordField paramSenha, JTextField paramTelefone, JTextField paramEmail, JTextField paramEndereco, JTextField paramComplemento) {
        try {
            int linha = paramTableUsuarios.getSelectedRow();
            
            if (linha >= 0) {
                paramId.setText(paramTableUsuarios.getValueAt(linha, 0).toString());
                paramCpf.setText(paramTableUsuarios.getValueAt(linha, 1).toString());
                paramNome.setText(paramTableUsuarios.getValueAt(linha, 2).toString());
                paramSenha.setText(paramTableUsuarios.getValueAt(linha, 3).toString());
                paramTelefone.setText(paramTableUsuarios.getValueAt(linha, 4).toString());
                paramEmail.setText(paramTableUsuarios.getValueAt(linha, 5).toString());
                paramEndereco.setText(paramTableUsuarios.getValueAt(linha, 6).toString());
                paramComplemento.setText(paramTableUsuarios.getValueAt(linha, 7).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Não selecionou o registro. Erro: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select Erro: " + e.toString());
        }
        
    }
    
    public void modificarUsuarios(JTextField paramCpf, JTextField paramNome, JPasswordField paramSenha, JTextField paramTelefone, JTextField paramEmail, JTextField paramEndereco, JTextField paramComplemento, JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String modificar = "UPDATE tb_usuariosA SET cpf = ?, nome = ?, senha=?, telefone=?, email=?, endereco=?, complemento=? WHERE id = ?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(modificar);
            cs.setString(1, paramCpf.getText());
            cs.setString(2, paramNome.getText());
            cs.setString(3, paramSenha.getText());
            cs.setString(4, paramTelefone.getText());
            cs.setString(5, paramEmail.getText());
            cs.setString(6, paramEndereco.getText());
            cs.setString(7, paramComplemento.getText());
            cs.setString(8, paramId.getText());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alterar Erro: " + e.toString());
        }
    }
    
    public void excluirUsuarios(JTextField paramId, JTextField paramCpf) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String excluir = "DELETE FROM tb_usuariosA WHERE id=?;";
        
        PreparedStatement ss = null;
        
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(excluir);
            cs.setInt(1, Integer.parseInt(paramId.getText()));
            cs.execute();
        
            JOptionPane.showMessageDialog(null, "Linha excluída com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Excluir Erro: " + e.toString());
        }
        
    }
}
