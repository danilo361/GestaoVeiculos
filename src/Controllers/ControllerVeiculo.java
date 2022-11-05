package Controllers;

import Conexao.Conexao;
import Model.Veiculo;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerVeiculo {


    private ArrayList<Veiculo> listaveiculos;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;      
    
    public ControllerVeiculo() {
   listaveiculos = new ArrayList();
    indice = -1;
    }
    
    
    
    

    public void atualizaVeiculo() {
        String query = "select * from veiculo order by nome";
        try {
            conexao.Conectar();
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listaveiculos.clear();
            while (rs.next()) {
                Veiculo aux = new Veiculo();
                aux.setPk_veiculo(rs.getString("pk_veiculo"));
                aux.setModelo(rs.getString("modelo"));
                aux.setPlaca(rs.getString("placa"));
                aux.setAno(rs.getString("ano"));
                aux.setLicenciamento(rs.getString("licenciamento"));
                aux.setTipo(rs.getString("tipo"));
                aux.setQtdEixos(rs.getString("qtdEixos"));
                listaveiculos.add(aux);
            }
            this.indice=listaveiculos.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

 
    public void insertVeiculo(Veiculo veiculo) {
        try {
             conexao.Conectar();
            
            conexao.conectar.createStatement().execute(veiculo.preparaInsertVeiculo());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Veiculo cadastrado",1);
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha no cadastro!", "Usuário cadastrado",1);
        }
    }

    public void updateVeiculo(Veiculo veiculo) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(veiculo.preparaUpdate());
        } catch (SQLException ex) {

        }
    }

    public void deleteVeiculo(Veiculo veiculo) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(veiculo.preparaDelte());
        } catch (SQLException ex) {

        }
    }

    
}
