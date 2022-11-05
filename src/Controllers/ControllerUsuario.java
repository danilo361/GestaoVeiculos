package Controllers;

import Conexao.Conexao;
import Model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
@SuppressWarnings("serial")
public class ControllerUsuario {


    private ArrayList<Usuario> listausuarios;
    private int indice;
    //private JTable jTable1 = new JTable();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null; // Operação
    private ResultSet rs = null;       
    
    public ControllerUsuario() {
   listausuarios = new ArrayList();
    indice = -1;
    }
    

    public void atualizaUsuario() {
        String query = "select * from usuario order by nome";
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            listausuarios.clear();
            while (rs.next()) {
                Usuario aux = new Usuario();
                aux.setPk_usuario(rs.getString("pk_usuario"));
                aux.setNome(rs.getString("nome"));
                aux.setSobrenome(rs.getString("sobrenome"));
                aux.setEmail(rs.getString("email"));
                aux.setTipo(rs.getString("tipo"));
                aux.setSenha(rs.getString("senha"));
                listausuarios.add(aux);
            }
            this.indice=listausuarios.size()-1;
        } catch (SQLException ex) {
            System.out.println("Erro Banco de Dados - LISTAR");
        }

    }

 

    public void insertUsuario(Usuario usuario) throws SQLException {
       
             conexao.Conectar();
             if(usuario!=null){
            conexao.conectar.createStatement().execute(usuario.preparaInsert());
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Usuário cadastrado",1);
             }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Aviso",1);
                     }
        
    }

    public void updatetUsuario(Usuario usuario) {
        try {
        conexao.Conectar();
        conexao.conectar.createStatement().execute(usuario.preparaUpdate());
        } catch (SQLException ex) {

        }
    }

    public void deleteUsuario(Usuario usuario) {
        try {
            conexao.Conectar();
            conexao.conectar.createStatement().execute(usuario.preparaDelte());
        } catch (SQLException ex) {

        }
    }

  
}
