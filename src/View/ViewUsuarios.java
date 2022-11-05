package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerUsuario;
import Model.Usuario;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class ViewUsuarios extends javax.swing.JInternalFrame {
     Usuario user;
     ControllerUsuario userTemp = new ControllerUsuario();
     Conexao conexao = new Conexao();
    private PreparedStatement ps = null; 
    private ResultSet rs = null;
    Sessao section = new Sessao();
    String teste;
   
     

    public ViewUsuarios() {
        initComponents();
        conexao.Conectar();
        this.carregaTable();

    }

  
    
    public void carregaTable() {
      
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        
               

       
        String query = "SELECT * FROM usuario order by nome ASC;";
     
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
           
            
           while (rs.next()) {
               modelo.addRow(new Object[]{
                  
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                   rs.getString(4),
                  rs.getString(5),
                
                });

            }

        } catch (Exception e) {

        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }

   public void MostraSenha(){
       String codigo = tfCodigo.getText();
            String query = "SELECT * FROM usuario  WHERE pk_usuario =" +codigo+" ;";
     
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
           
        while(rs.next()){
            tfSenha.setText(rs.getString("senha"));

            }

        } catch (Exception e) {

        }
   }

    public void MostraDadosUsuario() {
       
        int row = jTable1.getSelectedRow();
       tfCodigo.setText(jTable1.getValueAt(row,0).toString());
        tfNome.setText(jTable1.getValueAt(row, 1).toString());
        tfSobrenome.setText(jTable1.getValueAt(row, 2).toString());
        tfEmail.setText(jTable1.getValueAt(row, 3).toString());
        String status = jTable1.getValueAt(row, 4).toString();
        if(status.equals("Administrador")){
            rButtonAdm.setSelected(true);
        }else{
            rButtonUser.setSelected(true);
        
        }
    }
 public Usuario RecolheDadosUsuario() {
        Usuario usuario = new Usuario();

        usuario.setPk_usuario(tfCodigo.getText());
        usuario.setNome(tfNome.getText());
        usuario.setSobrenome(tfSobrenome.getText());
        usuario.setEmail(tfEmail.getText());
        String senha =new String(tfSenha.getPassword() );
        usuario.setSenha(senha);
        if (rButtonAdm.isSelected()) {
            usuario.setTipo("Administrador");
        } else {
            usuario.setTipo("Usuário");
        }

        return usuario;
    }
  public void LimpaCampos() {
        tfCodigo.setText("");
        tfEmail.setText("");
        tfNome.setText("");
        tfSenha.setText("");
        tfSobrenome.setText("");
        tfNome.setText("");
        rButtonAdm.setSelected(false);
        rButtonUser.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCadastrar = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbSobrenome = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSobrenome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        rButtonAdm = new javax.swing.JRadioButton();
        rButtonUser = new javax.swing.JRadioButton();
        btnAtualizar = new javax.swing.JButton();
        lbNome1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfSenha = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(24, 84, 205));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(910, 430));
        setMinimumSize(new java.awt.Dimension(910, 430));
        setPreferredSize(new java.awt.Dimension(910, 430));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(24, 84, 205));
        jPanel1.setMaximumSize(new java.awt.Dimension(910, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 430));

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Usuários");

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome:");

        lbSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        lbSobrenome.setText("Sobrenome:");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email:");

        lbSenha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha.setText("Senha:");

        tfNome.setEditable(false);
        tfNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNome.setMinimumSize(new java.awt.Dimension(7, 18));
        tfNome.setPreferredSize(new java.awt.Dimension(7, 18));

        tfSobrenome.setEditable(false);
        tfSobrenome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfSobrenome.setMinimumSize(new java.awt.Dimension(7, 18));
        tfSobrenome.setPreferredSize(new java.awt.Dimension(7, 18));

        tfEmail.setEditable(false);
        tfEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfEmail.setMinimumSize(new java.awt.Dimension(7, 18));
        tfEmail.setPreferredSize(new java.awt.Dimension(7, 18));

        rButtonAdm.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(rButtonAdm);
        rButtonAdm.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rButtonAdm.setForeground(new java.awt.Color(255, 255, 255));
        rButtonAdm.setText("Administrador");
        rButtonAdm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rButtonAdm.setBorderPainted(true);
        rButtonAdm.setFocusPainted(false);
        rButtonAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonAdmActionPerformed(evt);
            }
        });

        rButtonUser.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(rButtonUser);
        rButtonUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rButtonUser.setForeground(new java.awt.Color(255, 255, 255));
        rButtonUser.setText("Usuário");
        rButtonUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rButtonUser.setBorderPainted(true);
        rButtonUser.setFocusPainted(false);

        btnAtualizar.setText("Editar");
        btnAtualizar.setToolTipText("");
        btnAtualizar.setFocusPainted(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lbNome1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNome1.setForeground(new java.awt.Color(255, 255, 255));
        lbNome1.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfCodigo.setMinimumSize(new java.awt.Dimension(7, 18));
        tfCodigo.setPreferredSize(new java.awt.Dimension(7, 18));

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("");
        btnExcluir.setFocusPainted(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(24, 84, 205));
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sobrenome", "E-mail", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 253));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfSenha.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbSobrenome)
                            .addGap(8, 8, 8)
                            .addComponent(tfSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbNome)
                                    .addGap(37, 37, 37))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbNome1)
                                    .addGap(29, 29, 29)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail)
                            .addComponent(lbSenha))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rButtonAdm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrar)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSobrenome)
                            .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSenha)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rButtonAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened


    }//GEN-LAST:event_formInternalFrameOpened

    private void rButtonAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButtonAdmActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.teste = section.sessao();

        
        if(tfCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um usuário!");
            return;
        }
        if(this.teste.equals("true")){
               Object[] options = {"Sim", "Não"};
                int i=JOptionPane.showOptionDialog(null,"Você deseja excuir este usuário?","Excluir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (i==JOptionPane.YES_OPTION){
            userTemp.deleteUsuario(this.RecolheDadosUsuario());
              this.carregaTable();
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                }
        }else{
             JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
       
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        
        this.teste = section.sessao();

        
        if(tfCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um usuário!");
            return;
        }
        if(this.teste.equals("true")){
            if(btnAtualizar.getText().equals("Editar")){
                tfNome.setEditable(true);
                tfEmail.setEditable(true);
                tfSobrenome.setEditable(true);
                tfSenha.setEditable(true);
                btnAtualizar.setText("Atualizar");
            } else{
                Object[] options = {"Sim", "Não"};
                int i=JOptionPane.showOptionDialog(null,"Confirmar as alterações","Atualizar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (i==JOptionPane.YES_OPTION){
                    
                    userTemp.updatetUsuario(this.RecolheDadosUsuario());
                    this.carregaTable();
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    tfNome.setEditable(false);
                    tfEmail.setEditable(false);
                    tfSobrenome.setEditable(false);
                    tfSenha.setEditable(false);
                    btnAtualizar.setText("Editar");
                    this.LimpaCampos();
                }else{
                    tfNome.setEditable(false);
                    tfEmail.setEditable(false);
                    tfSobrenome.setEditable(false);
                    tfSenha.setEditable(false);
                    btnAtualizar.setText("Editar");
                }
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
        }
        
      
       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
MostraDadosUsuario();
MostraSenha();

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSobrenome;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JRadioButton rButtonAdm;
    private javax.swing.JRadioButton rButtonUser;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfSobrenome;
    // End of variables declaration//GEN-END:variables
}
