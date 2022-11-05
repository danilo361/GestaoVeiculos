package Controllers;

import Conexao.Conexao;

import Model.Roda;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerRoda {


    private ArrayList<Roda> listaRoda;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;       
    
    public ControllerRoda() {
   listaRoda = new ArrayList();
    indice = -1;
    }
    

    public void atualizaRoda() {
        String query = "select * from roda order by nome";
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listaRoda.clear();
            while (rs.next()) {
                Roda aux = new Roda();
                aux.setPk_roda(rs.getString("pk_roda"));
                aux.setPosicao(rs.getString("posicao"));
                aux.setFk_veiculo(rs.getString("fk_veiculo"));
                aux.setFk_pneu(rs.getString("fk_pneu"));
               
                listaRoda.add(aux);
            }
            this.indice=listaRoda.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

 

    public void insertRoda(Roda roda) throws SQLException {
       
             conexao.Conectar();
             if(roda!=null){
            conexao.conectar.createStatement().execute(roda.preparaInsert());
           
             }else{
            JOptionPane.showMessageDialog(null, "Falha no registro!", "Aviso",1);
                     }
        
    }

    public void updateRoda(Roda roda) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(roda.preparaUpdate());
          
        } catch (SQLException ex) {
            
        }
    }

    public void deleteRoda(Roda roda) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(roda.preparaDelte());
        } catch (SQLException ex) {

        }
    }

}
