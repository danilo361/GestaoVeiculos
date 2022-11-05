
package View;

import Conexao.Conexao;
import Controllers.ControllerPneu;
import Controllers.ControllerRoda;
import Controllers.ControllerVeiculo;
import Model.Pneu;
import Model.Roda;
import Model.Veiculo;
import java.awt.Dimension;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class MovimentarPneus extends javax.swing.JInternalFrame {
    Conexao conexao = new Conexao();
      private PreparedStatement ps = null;
    private ResultSet rs = null;
    ControllerRoda controllerRoda = new ControllerRoda();
    ControllerPneu controllerPneu = new ControllerPneu();
    ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
    Roda roda = new Roda();
    Pneu pneu = new Pneu();
    Veiculo veiculo = new Veiculo();
     public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2 + 100 , (d.height - this.getSize().height) / 2);
    }
    public MovimentarPneus() {
        initComponents();
    conexao.Conectar();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JcVeiculo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ListAlocados = new java.awt.List();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ListDisponiveis = new java.awt.List();
        lblVeiculo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 84, 205));
        setClosable(true);
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

        JcVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Dois Eixos", "Três Eixos", "Quatro Eixos" }));
        JcVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcVeiculoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecionar Veiculo:");

        ListAlocados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListAlocadosMouseClicked(evt);
            }
        });
        ListAlocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListAlocadosActionPerformed(evt);
            }
        });

        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/images/Selecionar.png"))); // NOI18N
        lblVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alocados no veículo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Almoxarifado");

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Movimentação de pneus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JcVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ListAlocados, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(ListDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListAlocados, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ListDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JcVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcVeiculoActionPerformed
        ImageIcon imagem = new ImageIcon();
        if(JcVeiculo.getSelectedItem().equals("Selecionar")){
            imagem = new ImageIcon("src/assets/img/images/Selecionar.png");
            lblVeiculo.setIcon(imagem);
           
        }
        if(JcVeiculo.getSelectedItem().equals("Dois Eixos")){
            imagem = new ImageIcon("src/assets/img/images/2Eixos.png");
            lblVeiculo.setIcon(imagem);
        }   
        if(JcVeiculo.getSelectedItem().equals("Três Eixos")){
            imagem = new ImageIcon("src/assets/img/images/3Eixos.png");
            lblVeiculo.setIcon(imagem);
           
        }
        if(JcVeiculo.getSelectedItem().equals("Quatro Eixos")){
            imagem = new ImageIcon("src/assets/img/images/4Eixos.png");
            lblVeiculo.setIcon(imagem);
        }
    }//GEN-LAST:event_JcVeiculoActionPerformed
     public void carregaComboAlmoxarifado() {
       
       
        String query = "SELECT * FROM pneu;";

        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pega = rs.getString("modelo")+" - "+(rs.getString("dimensoes"));
               
                ListAlocados.add(pega);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ListAlocadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListAlocadosMouseClicked
 
    }//GEN-LAST:event_ListAlocadosMouseClicked

    private void ListAlocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListAlocadosActionPerformed
        
    }//GEN-LAST:event_ListAlocadosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ListAlocadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListAlocadosMouseReleased
     
    }//GEN-LAST:event_ListAlocadosMouseReleased

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
//      btSelecionaLista(bt);
        
   
        
    }//GEN-LAST:event_btActionPerformed

    private void btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMouseClicked
        
    }//GEN-LAST:event_btMouseClicked

    private void btPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btPropertyChange
      
        
      
    }//GEN-LAST:event_btPropertyChange

    private void bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseClicked
          
    }//GEN-LAST:event_bt1MouseClicked

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
//        btSelecionaLista(bt1);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bt1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1PropertyChange

    private void bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt2MouseClicked

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
//        btSelecionaLista(bt2);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bt2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_bt2PropertyChange

    private void bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt3MouseClicked

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed

    }//GEN-LAST:event_bt3ActionPerformed

    private void bt3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bt3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_bt3PropertyChange

    private void btStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btStateChanged
      
    }//GEN-LAST:event_btStateChanged

    private void btComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btComponentShown
         
    }//GEN-LAST:event_btComponentShown

    private void btItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btItemStateChanged
        
    }//GEN-LAST:event_btItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        carregaComboAlmoxarifado();
    }//GEN-LAST:event_formInternalFrameOpened

   

  

    public List getListAlocados() {
        return ListAlocados;
    }

    public void setListAlocados(List ListAlocados) {
        this.ListAlocados = ListAlocados;
    }

    public List getListDisponiveis() {
        return ListDisponiveis;
    }

    public void setListDisponiveis(List ListDisponiveis) {
        this.ListDisponiveis = ListDisponiveis;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcVeiculo;
    private java.awt.List ListAlocados;
    private java.awt.List ListDisponiveis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblVeiculo;
    // End of variables declaration//GEN-END:variables
}
