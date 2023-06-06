package Classes;

import javax.swing.JOptionPane;


public class Teste {
    public static void main(String[] args) {
        ContadorRegistros contUsuarios = new ContadorRegistros();
        int olha = contUsuarios.contarRegistros("tb_usuarios");
        
        JOptionPane.showMessageDialog(null, olha);
    }
}
