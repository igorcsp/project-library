package Classes;

import Telas.AdmTelaMenuAdministrador;
import Telas.LoginTela;
import Telas.UserTelaMenuUsuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class ContadorRegistros {
    
    public static int contarRegistros(String nomeTabela) {
        String url = "jdbc:mysql://localhost:3306/db_mylibrary";
        String usuario = "root";
        String senha = "1234";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             Statement statement = conexao.createStatement()) {

            String sql = "SELECT COUNT(*) AS total FROM " + nomeTabela;
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                return resultSet.getInt("total");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
