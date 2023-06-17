package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionFactory {

    Connection conectar;
    private static final String usuario = "root";
    private static final String senha = "1234";
    private static final String bd = "db_library";
    private static final String host = "localhost";
    private static final String porta = "3306";
    private static final String url = "jdbc:mysql://" + host + ":" + porta + "/" + bd;
    
    
    public Connection obterConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(getUrl(), getUsuario(), getSenha());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema de conexão: " + e.toString());
        }
        return conectar;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getSenha() {
        return senha;
    }
    public static String getUrl() {
        return url;
    }
}
