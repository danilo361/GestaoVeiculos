package Controllers;

import Conexao.Conexao;
import Model.Abastecimento;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerAbastecimento {


    private ArrayList<Abastecimento> listaAbastecimento;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;      
    
    public ControllerAbastecimento() {
   listaAbastecimento = new ArrayList();
    indice = -1;
    }
    
    
    
    

    public void atualizaAbastecimento() {
        String query = "select * from abastecimento order by nome";
        try {
            conexao.Conectar();
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listaAbastecimento.clear();
            while (rs.next()) {
                Abastecimento aux = new Abastecimento();
                aux.setPk_Abastecimento(rs.getString("pk_abastecimento"));
                aux.setFk_prestadora(rs.getString("fk_prestadora"));
                aux.setFk_veiculo(rs.getString("fk_veiculo"));
                aux.setForma_pagamento(rs.getString("forma_pagamento"));
                aux.setValor_total(rs.getString("valor_total"));
                aux.setData(rs.getString("data"));
                aux.setKm_atual(rs.getString("km_atual"));
                aux.setQtd_litros("qtd_litros");
                aux.setValor_litro("valor_litro");
                aux.setTipo_Combustivel("tipo_combustivel");
                listaAbastecimento.add(aux);
            }
            this.indice=listaAbastecimento.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

   

    public void insertAbastecimento(Abastecimento abastecimento) throws SQLException {
         conexao.Conectar();
            if(abastecimento!=null){
            conexao.conectar.createStatement().execute(abastecimento.preparaInsertAbastecimento());
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!", "Serviço registrado",1);
           }else{
             JOptionPane.showMessageDialog(null, "Todos os dados devem ser informados!", "Serviço não cadastrado",1);
            }
    }

    public void updateAbastecimento(Abastecimento abastecimento) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(abastecimento.preparaUpdate());
        } catch (SQLException ex) {

        }
    }

    public void deleteAbastecimento(Abastecimento abastecimento) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(abastecimento.preparaDelte());
        } catch (SQLException ex) {

        }
    }

   

    
    
}
