package Controllers;

import Conexao.Conexao;
import Model.PrestadorServico;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerPServico {


    private ArrayList<PrestadorServico> listaPrestador;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;       
    
    public ControllerPServico() {
   listaPrestador = new ArrayList();
    indice = -1;
    }
    

    public void atualizaPServico() {
        String query = "select * from prestadora order by nome";
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listaPrestador.clear();
            while (rs.next()) {
                PrestadorServico aux = new PrestadorServico();
                aux.setPk_prestadora(rs.getString("pk_prestadora"));
                aux.setNome(rs.getString("nome"));
                aux.setTelefone(rs.getString("telefone"));
                aux.setEndereco(rs.getString("endereco"));
                aux.setCnpj(rs.getString("cnpj"));
                aux.setCep(rs.getString("cep"));
                aux.setSegmento(rs.getString("segmento"));
                listaPrestador.add(aux);
            }
            this.indice=listaPrestador.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

   

    public void insertPservico(PrestadorServico prestador) throws SQLException {
       
             conexao.Conectar();
             if(prestador!=null){
            conexao.conectar.createStatement().execute(prestador.preparaInsert());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Empresa cadastrado",1);
            
             }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Aviso",1);
                     }
        
    }

    public void updatePServico(PrestadorServico prestador) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(prestador.preparaUpdate());
          
        } catch (SQLException ex) {
            
        }
    }

    public void deletePrestador(PrestadorServico prestador) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(prestador.preparaDelte());
        } catch (SQLException ex) {

        }
    }

   
}
