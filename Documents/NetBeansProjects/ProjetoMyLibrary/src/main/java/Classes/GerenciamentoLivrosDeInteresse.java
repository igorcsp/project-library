package Classes;

import ConnectionFactory.ConnectionFactory;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class GerenciamentoLivrosDeInteresse {
    public void mostrarLivros(JTable paramTableLivrosDeInteresse) {
        ConnectionFactory objetoConexao = new ConnectionFactory();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        
        
        paramTableLivrosDeInteresse.setModel(modelo);
        
        Usuario usuario = new Usuario();
        
        int var = usuario.achaId(usuario.getCpf());
        sql = String.format("SELECT * FROM tb_livrosDeInteresseA where usuario_id = %o;", var);
        
        String [] dados = new String[3];
        
        Statement st;
        
        try {
            st = objetoConexao.obterConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                dados[0] = rs.getString(1);
                dados[1] = rs.getString(3);
                dados[2] = rs.getString(4);
                modelo.addRow(dados);
            }
            
            paramTableLivrosDeInteresse.setModel(modelo);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não mostrou o registro. Erro: " + e.toString());
        }
    }
    
    public void selecionarLivros(JTable paramTableLivros, JTextField paramId, JTextField paramTitulo, JTextField paramAutor) {
        try {
            int linha = paramTableLivros.getSelectedRow();
            
            if (linha >= 0) {
                paramId.setText(paramTableLivros.getValueAt(linha, 0).toString());
                paramTitulo.setText(paramTableLivros.getValueAt(linha, 1).toString());
                paramAutor.setText(paramTableLivros.getValueAt(linha, 2).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Não selecionou o registro. Erro: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
        
    }
    
    public void inserirLivros(JTable paramTableLivros, JTextField paramTitulo, JTextField paramAutor) {
        ConnectionFactory objConexao = new ConnectionFactory();
        Usuario usuario = new Usuario();
        int var = usuario.achaId(usuario.getCpf());
        String inserir = String.format("INSERT INTO tb_livrosDeInteresseA (usuario_id, titulo, autor) VALUES (%o, ?, ?)", var);
        try {
            int linha = paramTableLivros.getSelectedRow();
            CallableStatement cs = objConexao.obterConexao().prepareCall(inserir);
            
            cs.setString(1, paramTableLivros.getValueAt(linha, 1).toString());
            cs.setString(2, paramTableLivros.getValueAt(linha, 2).toString());
            
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Novo registro inserido corretamente!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserir Erro: " + e.toString());
        }
    }
    
    public void excluirLivros(JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String excluir = "DELETE FROM tb_livrosDeInteresseA WHERE id=?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(excluir);
            cs.setInt(1, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Linha excluída com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
    }
    
}
