
package View;

import Controllers.ControllerPneu;
import Model.Pneu;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class CadastrarPneu extends javax.swing.JInternalFrame {

    public CadastrarPneu() {
        initComponents();
       
    }
 public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2 + 100 , (d.height - this.getSize().height) / 2);
    }
    
     public Pneu RecolheDadosPneu() {
        Pneu pneu = new Pneu();
        while (tfMarca.getText().isEmpty() || tfDimensoes.getText().isEmpty() || tfCarga.getText().isEmpty()
               || tfNFogo.getText().isEmpty() || ((JTextField) tfData.getDateEditor().getUiComponent()).getText().isEmpty() || tfDot.toString().isEmpty() ) {
                return null;
        } 
        if(!rbAutomovel.isSelected() && !rbCaminhao.isSelected() && !rbMoto.isSelected()){
            return null;
        }else{
            pneu.setModelo(tfMarca.getText());
            pneu.setDimensoes(tfDimensoes.getText());
            pneu.setDot(tfDot.getText());
            pneu.setData_compra(tfData.getDate().toString());
            pneu.setIndice_carga(tfCarga.getText());
            pneu.setN_fogo(tfNFogo.getText());
            pneu.setFk_status("1");
            if(rbAutomovel.isSelected()){
                pneu.setSegmento_pneu("Automóvel");
            }else if(rbCaminhao.isSelected()){
                pneu.setSegmento_pneu("Caminhão");
            }else{
                pneu.setSegmento_pneu("Motocicleta");
            }
        }
        return pneu;
    }
 
      public void LimpaCampos() {

       tfCarga.setText("");
       tfDimensoes.setText("");
       tfDot.setText("");
       tfMarca.setText("");
       tfNFogo.setText("");
       rbAutomovel.setSelected(true);
       }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblCadastrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        tfDimensoes = new javax.swing.JTextField();
        tfDot = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfCarga = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNFogo = new javax.swing.JTextField();
        tfData = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        rbAutomovel = new javax.swing.JRadioButton();
        rbMoto = new javax.swing.JRadioButton();
        rbCaminhao = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(24, 84, 205));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 153)));
        setClosable(true);
        setTitle("Cadastrar Pneu");
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

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Cadastrar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca/Modelo:");

        tfMarca.setEditable(false);
        tfMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfMarca.setForeground(new java.awt.Color(153, 153, 153));
        tfMarca.setText("EX: Firestone");
        tfMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMarcaMouseClicked(evt);
            }
        });
        tfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaActionPerformed(evt);
            }
        });
        tfMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMarcaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMarcaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dimensões:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data da compra:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dot:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_internalFrame/info.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Código alfanumérico de treze digitos usado para indicar diversas");

        lblInfo2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblInfo2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo2.setText(" informações sobre o componente, incluindo sua data de validade.");

        tfDimensoes.setEditable(false);
        tfDimensoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfDimensoes.setForeground(new java.awt.Color(153, 153, 153));
        tfDimensoes.setText("EX: 185/55R16");
        tfDimensoes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfDimensoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDimensoesMouseClicked(evt);
            }
        });
        tfDimensoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDimensoesActionPerformed(evt);
            }
        });
        tfDimensoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDimensoesKeyPressed(evt);
            }
        });

        try {
            tfDot.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***-******-****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDot.setToolTipText("");
        tfDot.setMaximumSize(new java.awt.Dimension(54, 25));
        tfDot.setMinimumSize(new java.awt.Dimension(54, 25));
        tfDot.setPreferredSize(new java.awt.Dimension(54, 25));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(24, 84, 205));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_internalFrame/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setFocusPainted(false);
        btnSalvar.setIconTextGap(9);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Indice de carga:");

        tfCarga.setEditable(false);
        tfCarga.setForeground(new java.awt.Color(153, 153, 153));
        tfCarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCarga.setText("94Y");
        tfCarga.setPreferredSize(new java.awt.Dimension(25, 26));
        tfCarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCargaMouseClicked(evt);
            }
        });
        tfCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCargaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nº de fogo:");

        tfNFogo.setEditable(false);
        tfNFogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNFogoMouseClicked(evt);
            }
        });
        tfNFogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNFogoActionPerformed(evt);
            }
        });

        tfData.setPreferredSize(new java.awt.Dimension(108, 23));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Para:");

        rbAutomovel.setBackground(new java.awt.Color(24, 84, 205));
        buttonGroup1.add(rbAutomovel);
        rbAutomovel.setForeground(new java.awt.Color(255, 255, 255));
        rbAutomovel.setSelected(true);
        rbAutomovel.setText("Automóvel");
        rbAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutomovelActionPerformed(evt);
            }
        });

        rbMoto.setBackground(new java.awt.Color(24, 84, 205));
        buttonGroup1.add(rbMoto);
        rbMoto.setForeground(new java.awt.Color(255, 255, 255));
        rbMoto.setText("Motocicleta");
        rbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotoActionPerformed(evt);
            }
        });

        rbCaminhao.setBackground(new java.awt.Color(24, 84, 205));
        buttonGroup1.add(rbCaminhao);
        rbCaminhao.setForeground(new java.awt.Color(255, 255, 255));
        rbCaminhao.setText("Caminhão");
        rbCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCaminhaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAutomovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCaminhao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDot, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfNFogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lblInfo)
                            .addComponent(lblInfo2))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrar)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfNFogo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbAutomovel)
                    .addComponent(rbMoto)
                    .addComponent(rbCaminhao))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo)
                .addGap(1, 1, 1)
                .addComponent(lblInfo2)
                .addGap(19, 19, 19)
                .addComponent(btnSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMarcaMouseClicked
       tfMarca.setText("");
       tfMarca.setEditable(true);
       tfMarca.setForeground(Color.black);
        tfDimensoes.setText(tfDimensoes.getText().toUpperCase());
    }//GEN-LAST:event_tfMarcaMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        lblInfo.setVisible(true);
        lblInfo2.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         lblInfo.setVisible(false);
        lblInfo2.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void tfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaActionPerformed

    private void tfDimensoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDimensoesMouseClicked
       tfDimensoes.setText("");
       tfDimensoes.setEditable(true);
       tfDimensoes.setForeground(Color.black);
    }//GEN-LAST:event_tfDimensoesMouseClicked

    private void tfDimensoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDimensoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDimensoesActionPerformed

    private void tfDimensoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDimensoesKeyPressed
      
    }//GEN-LAST:event_tfDimensoesKeyPressed

    private void tfMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMarcaKeyReleased
        tfMarca.setText(tfMarca.getText().toUpperCase());
    }//GEN-LAST:event_tfMarcaKeyReleased

    private void tfMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMarcaKeyTyped
         
    }//GEN-LAST:event_tfMarcaKeyTyped

    private void tfMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMarcaKeyPressed
    
    }//GEN-LAST:event_tfMarcaKeyPressed

    private void tfCargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCargaMouseClicked
       tfCarga.setText("");
       tfCarga.setEditable(true);
       tfCarga.setForeground(Color.black);
    }//GEN-LAST:event_tfCargaMouseClicked

    private void tfCargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCargaKeyReleased
        tfCarga.setText(tfCarga.getText().toUpperCase());
    }//GEN-LAST:event_tfCargaKeyReleased

    private void tfNFogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNFogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNFogoActionPerformed

    private void tfNFogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNFogoMouseClicked
        tfNFogo.setText("");
       tfNFogo.setEditable(true);
       tfNFogo.setForeground(Color.black);
        tfNFogo.setText(tfNFogo.getText().toUpperCase());
    }//GEN-LAST:event_tfNFogoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       ControllerPneu controllerpneu = new ControllerPneu();
        Pneu pneu = this.RecolheDadosPneu();
        try {
          controllerpneu.insertPneus(pneu);
          if(pneu!=null)
           this.LimpaCampos();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rbAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutomovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAutomovelActionPerformed

    private void rbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMotoActionPerformed

    private void rbCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCaminhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCaminhaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JRadioButton rbAutomovel;
    private javax.swing.JRadioButton rbCaminhao;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JFormattedTextField tfCarga;
    private com.toedter.calendar.JDateChooser tfData;
    private javax.swing.JTextField tfDimensoes;
    private javax.swing.JFormattedTextField tfDot;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNFogo;
    // End of variables declaration//GEN-END:variables
}
