package Classes;

import ConnectionFactory.ConnectionFactory;
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
        modelo.addColumn("Reservado");
        modelo.addColumn("Emprestado para");
        
        
        paramTableLivros.setModel(modelo);
        
        sql = "SELECT * FROM tb_livrosA;";
        
        String [] dados = new String[6];
        
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
                modelo.addRow(dados);
            }
            
            paramTableLivros.setModel(modelo);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não mostrou o registro. Erro: " + e.toString());
        }
    }
    
    public void selecionarLivros(JTable paramTableLivros, JTextField paramId, JTextField paramTitulo, JTextField paramAutor, JTextField paramDisponivel, JTextField paramReservado, JTextField paramEmprestadoPara) {
        try {
            int linha = paramTableLivros.getSelectedRow();
            
            if (linha >= 0) {
                paramId.setText(paramTableLivros.getValueAt(linha, 0).toString());
                paramTitulo.setText(paramTableLivros.getValueAt(linha, 1).toString());
                paramAutor.setText(paramTableLivros.getValueAt(linha, 2).toString());
                paramDisponivel.setText(paramTableLivros.getValueAt(linha, 3).toString());
                paramReservado.setText(paramTableLivros.getValueAt(linha, 4).toString());
                paramEmprestadoPara.setText(paramTableLivros.getValueAt(linha, 5).toString());
                

            } else {
                JOptionPane.showMessageDialog(null, "Não selecionou o registro. Erro: ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select Error: " + e.toString());
        }
        
    }
    
    public void inserirLivros(JTextField paramTitulo, JTextField paramAutor) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String inserir = "INSERT INTO tb_livrosA (titulo, autor, disponivel, reservado, emprestado_para) VALUES (?, ?, 1, 0, '')";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(inserir);
            cs.setString(1, paramTitulo.getText());
            cs.setString(2, paramAutor.getText());
            
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Novo registro inserido corretamente!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inserir Erro: " + e.toString());
        }
    }
    
    public void modificarLivros(JTextField paramTitulo, JTextField paramAutor, JTextField paramDisponivel, JTextField paramReservado, JTextField paramEmprestado, JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String modificar = "UPDATE tb_livrosA SET titulo=?, autor=?, disponivel =?, reservado=?, emprestado_para=? WHERE id = ?;";
        try {
            CallableStatement cs = objConexao.obterConexao().prepareCall(modificar);
            cs.setString(1, paramTitulo.getText());
            cs.setString(2, paramAutor.getText());
            cs.setInt(3, Integer.parseInt(paramDisponivel.getText()));
            cs.setInt(4, Integer.parseInt(paramReservado.getText()));
            cs.setString(5, paramEmprestado.getText());
            cs.setInt(6, Integer.parseInt(paramId.getText()));

            cs.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alterar Erro: " + e.toString());
        }
    }
    
    public void excluirLivros(JTextField paramId) {
        ConnectionFactory objConexao = new ConnectionFactory();
        String excluir = "DELETE FROM tb_livrosA WHERE id=?;";
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
