package View;

import Conexao.Conexao;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame {

   Conexao conexao = new Conexao();
    private PreparedStatement ps, ps2 = null;
    private ResultSet rs = null;
   

    

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        conexao.Conectar();

    }

    public void login() {
        //Verifica no banco de dados se email e senha são correspondentes
        //Chamando tela principal
        
      //  Update Produto SET Permite_venda = 'true' WHERE id = <id do produto>
        Home home = new Home();
        this.dispose();
        home.setVisible(true);
        home.recebeUsuario(tfUsuario.getText());

    }


    public void verificaLogin() throws SQLException {
       
        String query = "SELECT nome, sobrenome, tipo, senha, status FROM usuario;";
        
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            rs = ps.executeQuery();
            
        } catch (Exception e) {
        }

        while (rs.next()) {
            String Login = tfUsuario.getText().trim();
            String Senha = new String(tfSenha.getPassword());
            String verif = rs.getString("nome");
            String verifSobrenome = rs.getString("sobrenome");
            String login = rs.getString("nome")+" "+rs.getString("sobrenome");
            String senha = rs.getString("senha");
           
         
            
            if (login.equals(Login) && senha.equals(Senha)) {
                 String query2 =  "UPDATE  usuario SET status ='true' WHERE nome='"+verif+"' and sobrenome='"+verifSobrenome+"';";
                        conexao.conectar.createStatement().execute(query2);
               
                this.login();
                ps.close();
                rs.close();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario ou senha inválida");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DR Gestão de Veículos");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(24, 119, 242));
        setMaximumSize(new java.awt.Dimension(355, 400));
        setMinimumSize(new java.awt.Dimension(355, 400));
        setName("jfLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(355, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(355, 400));

        jpLogin.setBackground(new java.awt.Color(24, 119, 242));
        jpLogin.setMaximumSize(new java.awt.Dimension(400, 400));
        jpLogin.setMinimumSize(new java.awt.Dimension(400, 400));

        lblLogin.setBackground(new java.awt.Color(0, 174, 254));
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        tfUsuario.setEditable(false);
        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tfUsuario.setForeground(new java.awt.Color(153, 153, 153));
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.setText("Nome e Ultimo Sobrenome");
        tfUsuario.setActionCommand("<Not Set>");
        tfUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfUsuario.setPreferredSize(new java.awt.Dimension(7, 28));
        tfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUsuarioFocusLost(evt);
            }
        });
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsuarioMouseClicked(evt);
            }
        });
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        tfSenha.setEditable(false);
        tfSenha.setForeground(new java.awt.Color(153, 153, 153));
        tfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSenha.setText("Senha12345");
        tfSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfSenha.setPreferredSize(new java.awt.Dimension(7, 28));
        tfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSenhaFocusLost(evt);
            }
        });
        tfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSenhaMouseClicked(evt);
            }
        });
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 174, 254));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Senha");
        jLabel2.setAutoscrolls(true);

        jLabel3.setBackground(new java.awt.Color(0, 174, 254));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Usuário");
        jLabel3.setAutoscrolls(true);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(24, 119, 242));
        jButton1.setText("Entrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 356, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("jfLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.verificaLogin();

            //Conecta no banco de dados e verifica se o email e senha são correspondentes;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void tfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMouseClicked
        tfUsuario.setText("");
        tfUsuario.setForeground(Color.black);
        tfUsuario.setEditable(true);
        tfUsuario.setHorizontalAlignment(HEIGHT);
    }//GEN-LAST:event_tfUsuarioMouseClicked

    private void tfUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsuarioFocusGained


    }//GEN-LAST:event_tfUsuarioFocusGained

    private void tfUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsuarioFocusLost


    }//GEN-LAST:event_tfUsuarioFocusLost

    private void tfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSenhaMouseClicked

        tfSenha.setText("");
        tfSenha.setForeground(Color.black);
        tfSenha.setEditable(true);
        tfSenha.setHorizontalAlignment(HEIGHT);
    }//GEN-LAST:event_tfSenhaMouseClicked

    private void tfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSenhaFocusLost

    }//GEN-LAST:event_tfSenhaFocusLost

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the sessao
     */
   

    /**
     * @param sessao the sessao to set
     */
   
}
