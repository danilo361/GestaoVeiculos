package Controllers;

import Conexao.Conexao;
import Model.Servicos;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerServicos {


    private ArrayList<Servicos> listaServicos;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;      
    
    public ControllerServicos() {
   listaServicos = new ArrayList();
    indice = -1;
    }
    
    
    
    

    public void atualizaServicos() {
        String query = "select * from servicos order by nome";
        try {
            conexao.Conectar();
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listaServicos.clear();
            while (rs.next()) {
                Servicos aux = new Servicos();
                aux.setPk_servico(rs.getString("pk_servico"));
                aux.setFk_prestadora(rs.getString("fk_prestadora"));
                aux.setFk_veiculo(rs.getString("fk_veiculo"));
                aux.setNome(rs.getString("nome"));
                aux.setValor_total(rs.getString("valor_total"));
                aux.setData(rs.getString("data"));
                aux.setDescricao(rs.getString("descricao"));
                aux.setValor_peca("valor_peca");
                aux.setNome_peca("nome_peca");
                listaServicos.add(aux);
            }
            this.indice=listaServicos.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

  

    public void insertServico(Servicos servico) throws SQLException {
         conexao.Conectar();
            if(servico!=null){
            conexao.conectar.createStatement().execute(servico.preparaInsertServicos());
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!", "Serviço registrado",1);
           }else{
             JOptionPane.showMessageDialog(null, "Todos os dados devem ser informados!", "Serviço não cadastrado",1);
            }
    }

    public void updateServico(Servicos servico) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(servico.preparaUpdate());
        } catch (SQLException ex) {

        }
    }

    public void deleteServico(Servicos servico) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(servico.preparaDelte());
        } catch (SQLException ex) {

        }
    }

    
    
}
