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
    
    String url = String.format("jdbc:mysql://%s:%s/%s", host, porta, bd);
    
    public Connection obterConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema de conexão: " + e.toString());
        }
        return conectar;
    }
}
