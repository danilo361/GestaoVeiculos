
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
     private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/DrVeiculos"; // O "meubanco" representa a minha database 
    private final String usuario = "postgres"; // Usuario default
    private final String senha = "danilo";
    public Connection conectar = null;  // Conexao
    
    
     public boolean Conectar() {
        boolean ok = false;
        try {
            Class.forName("org.postgresql.Driver");
            this.conectar = DriverManager.getConnection(url, usuario, senha);
            ok = true;            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERRO Banco de Dados");
        }
        return ok;
    }
}
