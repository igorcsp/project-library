package Classes;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class GerenciamentoLivros {
    public void mostrarLivros(JTable paramTableLivros) {
        ConnectionFactory objetoConexao = new ConnectionFactory();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Disponível");
        
        
        paramTableLivros.setModel(modelo);
        
        sql = "SELECT * FROM tb_livros;";
        
        String [] dados = new String[4];
        
        Statement st;
        
        try {
            st = objetoConexao.obterConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                dados[0] = rs.getString(1);
                dados[1] = rs.getString(2);
                dados[2] = rs.getString(3);
                dados[3] = rs.getString(4);
                modelo.addRow(dados);
            }
            
            paramTableLivros.setModel(modelo);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não mostrou o registro. Erro: " + e.toString());
        }
    }
    public void selecionarLivros(JTable paramTableLivros, JTextField paramId, JTextField paramTitulo, JTextField paramAutor, JTextField paramDisponivel) {
        try {
            int linha = paramTableLivros.getSelectedRow();
            
            if (linha >= 0) {
                paramId.setText(paramTableLivros.getValueAt(linha, 0).toString());
                paramTitulo.setText(paramTableLivros.getValueAt(linha, 1).toString());
                paramAutor.setText(paramTableLivros.getValueAt(linha, 2).toString());
                paramDisponivel.setText(paramTableLivros.getValueAt(linha, 3).toString());

            } else {
                JOptionPane.showMessageDialog(null, "Não selecionou o registro. Erro: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
        
    }
    
    public void inserirLivros(JTextField paramTitulo, JTextField paramAutor, JTextField paramDisponivel) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String inserir = "INSERT INTO tb_livros (titulo, autor, disponivel) VALUES (?, ?, ?)";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(inserir);
            cs.setString(1, paramTitulo.getText());
            cs.setString(2, paramAutor.getText());
            cs.setInt(3, Integer.parseInt(paramDisponivel.getText()));
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Novo registro inserido corretamente!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
    }
    public void modificarLivros(JTextField paramTitulo, JTextField paramAutor, JTextField paramDisponivel, JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String modificar = "UPDATE tb_livros SET titulo=?, autor=?, disponivel =? WHERE id = ?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(modificar);
            cs.setString(1, paramTitulo.getText());
            cs.setString(2, paramAutor.getText());
            cs.setInt(3, Integer.parseInt(paramDisponivel.getText()));
            cs.setInt(4, Integer.parseInt(paramId.getText()));

            cs.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
    }
    
    public void excluirLivros(JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String excluir = "DELETE FROM tb_livros WHERE id=?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(excluir);
            cs.setInt(1, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Linha excluída com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
        
    }
    
    public void devolverLivro(JTextField paramDisponivel, JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String alterar = "UPDATE tb_livros SET disponivel =? WHERE id = ?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(alterar);
            if (paramDisponivel.equals(1)) {
                cs.setInt(1, 0);
                cs.setInt(2, Integer.parseInt(paramId.getText()));
            } else {
                cs.setInt(1, 1);
                cs.setInt(2, Integer.parseInt(paramId.getText()));
            }
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
    }
    public void retirarLivro(JTextField paramDisponivel, JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String alterar = "UPDATE tb_livros SET disponivel =? WHERE id = ?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(alterar);
            if (paramDisponivel.equals(0)) {
                cs.setInt(1, 1);
                cs.setInt(2, Integer.parseInt(paramId.getText()));
            } else {
                cs.setInt(1, 0);
                cs.setInt(2, Integer.parseInt(paramId.getText()));
            }
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.toString());
        }
    }
    
}
