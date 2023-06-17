package Classes;

import ConnectionFactory.ConnectionFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Usuario {

    private static String cpf;
    private static int id;
    private static int contador;
    
    public static int achaId(String paramCpf) {
        ConnectionFactory conn = new ConnectionFactory();

        try (Connection conexao = DriverManager.getConnection(conn.getUrl(), conn.getUsuario(), conn.getSenha());
             Statement statement = conexao.createStatement()) {
            
            String achaId = "SELECT id FROM tb_usuariosA WHERE cpf = " + paramCpf;
            ResultSet resultSet = statement.executeQuery(achaId);

            if (resultSet.next()) {
                return resultSet.getInt("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
    
//    public void pegaIdFromCpf() {
//        ConnectionFactory objConexao = new ConnectionFactory();
//        Usuario usuario = new Usuario();
//        String var = usuario.getCpf();
//        String achaId = String.format("SELECT id FROM tb_usuariosA WHERE cpf = %s", var);
//        try {
//            CallableStatement cs = objConexao.obterConexao().prepareCall(achaId);
//            cs.execute();
//        } catch(Exception e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
//    }
    
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
   
    
    
}
