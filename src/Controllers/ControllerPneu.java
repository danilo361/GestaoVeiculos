package Controllers;

import Conexao.Conexao;
import Model.Pneu;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerPneu {


    private ArrayList<Pneu> listaPneus;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;       
    
    public ControllerPneu() {
   listaPneus = new ArrayList();
    indice = -1;
    }
    

    public void atualizaPneus() {
        String query = "select * from pneu order by nome";
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listaPneus.clear();
            while (rs.next()) {
                Pneu aux = new Pneu();
                aux.setPk_pneu(rs.getString("pk_pneu"));
                aux.setModelo(rs.getString("modelo"));
                aux.setDimensoes(rs.getString("dimensoes"));
                aux.setDot(rs.getString("dot"));
                aux.setData_compra(rs.getString("data_compra"));
                aux.setN_fogo(rs.getString("n_fogo"));
                aux.setIndice_carga(rs.getString("indice_carga"));
                listaPneus.add(aux);
            }
            this.indice=listaPneus.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

  

    public void insertPneus(Pneu pneu) throws SQLException {
       
             conexao.Conectar();
             if(pneu!=null){
            conexao.conectar.createStatement().execute(pneu.preparaInsert());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Pneu cadastrado",1);
             }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Aviso",1);
                     }
        
    }

    public void updatePneu(Pneu pneu) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(pneu.preparaUpdate());
          
        } catch (SQLException ex) {
            
        }
    }

    public void deletePneu(Pneu pneu) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(pneu.preparaDelte());
        } catch (SQLException ex) {

        }
    }

}
