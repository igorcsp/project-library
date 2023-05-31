package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionFactory {
    Connection conectar;
    private static String usuario = "root";
    private static String senha = "1234";
    private static String bd = "db_mylibrary";
    private static String host = "localhost";
    private static String porta = "3306";
    
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
