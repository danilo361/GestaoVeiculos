
package Conexao;

import View.Home;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danil
 */
public class Sessao {

    private PreparedStatement ps = null;
    private ResultSet rs = null;
 String teste;
    Conexao conexao = new Conexao();

    public Sessao() {
       
        
        
    }
public String sessao()  {
        try {
            conexao.Conectar();
             String teste;
             String query = "SELECT tipo, status FROM usuario;";
             ps = conexao.conectar.prepareStatement(query,
                     ResultSet.TYPE_SCROLL_SENSITIVE,
                     ResultSet.CONCUR_UPDATABLE);
             rs = ps.executeQuery();
             
             while(rs.next()){
                 String verif = rs.getString("tipo");
                 String verif2 = rs.getString("status");
                 if(verif.equals("Administrador") && verif2.equals("true")){
                     this.teste = "true";
                     rs.close();
                     ps.close();
                     break;
                 }else{
                     this.teste = "false";
                 }
             }
         } catch (SQLException ex) {
             
         }
       return this.teste;
    }
    

    public void logout() throws SQLException {

                conexao.Conectar();
            String query2 = "UPDATE usuario SET status = 'false' WHERE status='true';";
                conexao.conectar.createStatement().execute(query2);

    }

    /**
     * @return the administrador
     */
   

}
