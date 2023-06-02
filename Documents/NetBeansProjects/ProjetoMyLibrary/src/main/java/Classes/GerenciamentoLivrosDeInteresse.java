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
        
        paramTableLivrosDeInteresse.setModel(modelo);
        
        sql = "SELECT * FROM tb_livrosDeInteresse;";
        
        String [] dados = new String[2];
        
        Statement st;
        
        try {
            st = objetoConexao.obterConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                dados[0] = rs.getString(1);
                dados[1] = rs.getString(2);
                modelo.addRow(dados);
            }
            
            paramTableLivrosDeInteresse.setModel(modelo);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não mostrou o registro. Erro: " + e.toString());
        }
    }
    public void selecionarLivros(JTable paramTableLivros, JTextField paramId, JTextField paramTitulo) {
        try {
            int linha = paramTableLivros.getSelectedRow();
            
            if (linha >= 0) {
                paramId.setText(paramTableLivros.getValueAt(linha, 0).toString());
                paramTitulo.setText(paramTableLivros.getValueAt(linha, 1).toString());
                

            } else {
                JOptionPane.showMessageDialog(null, "Não selecionou o registro. Erro: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
        
    }
    
    public void inserirLivros(JTextField paramTitulo, JTextField paramAutor) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String inserir = "INSERT INTO tb_livrosDeInteresse (titulo) VALUES (?)";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(inserir);
            cs.setString(1, paramTitulo.getText());
            
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Novo registro inserido corretamente!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserir Erro: " + e.toString());
        }
    }
    
    public void excluirLivros(JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String excluir = "DELETE FROM tb_livrosDeInteresse WHERE id=?;";
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
