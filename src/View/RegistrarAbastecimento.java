
package View;

import Conexao.Conexao;
import Controllers.ControllerAbastecimento;
import Model.Abastecimento;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class RegistrarAbastecimento extends javax.swing.JInternalFrame {

    ControllerAbastecimento controllerAbastecimento = new ControllerAbastecimento();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
   
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }

    public RegistrarAbastecimento() {
        initComponents();
       
        conexao.Conectar();

    }

    public Abastecimento RecolheDadosAbastecimento() {
       Abastecimento abastecimento = new Abastecimento();
        while (tfKmatual.getText().isEmpty() || tfQtdLitros.getText().isEmpty() || tfValorLitro.getText().isEmpty()
              || jcFormaPagamento.getSelectedItem().equals("Selecionar")  || tfValorTotal.getText().isEmpty() || jcPosto.getSelectedItem().equals("Selecionar") || jcTipoCombustivel.getSelectedItem().equals("Selecionar")) {
                return null;
        } 
          abastecimento.setData(tfData.getDate().toString());
          abastecimento.setForma_pagamento((String) jcFormaPagamento.getSelectedItem());
          abastecimento.setKm_atual(tfKmatual.getText());
          abastecimento.setQtd_litros(tfQtdLitros.getText());
          abastecimento.setTipo_Combustivel((String) jcTipoCombustivel.getSelectedItem());
          abastecimento.setValor_litro("R$ "+tfValorLitro.getText());
          abastecimento.setValor_total("R$ "+tfValorTotal.getText());
          abastecimento.setFk_prestadora((String) jcPosto.getSelectedItem());
          abastecimento.setFk_veiculo(restringirString());
        
        return abastecimento;
    }
    public void carregaComboPrestadora() {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
        String query = "SELECT * FROM prestadora WHERE segmento = 'Posto combustível';";

        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pega = rs.getString("nome");
                strList.add(pega);
                DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
                jcPosto.setModel(defaultComboBox);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String restringirString() {
   
        String x = (String) jcVeiculo.getSelectedItem();
         int indexArroba = x.indexOf(":");
       
        String resultado = x.substring(indexArroba+2);
       return resultado;
    }

 public void carregaVeiculo() throws SQLException{
      ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
      String query = "SELECT modelo, placa FROM veiculo;";
        
        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            rs = ps.executeQuery();
            
        } catch (Exception e) {
        }
            while (rs.next()) {
            String combo = rs.getString("modelo")+" - placa: "+rs.getString("placa");
                strList.add(combo);
                DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
                jcVeiculo.setModel(defaultComboBox);
        }
             ps.close();
           
 }
    public void LimpaCampos() {
tfKmatual.setText("");
tfQtdLitros.setText("");
tfValorLitro.setText("");
tfValorTotal.setText("");
jcFormaPagamento.setSelectedIndex(0);
jcPosto.setSelectedIndex(0);
jcTipoCombustivel.setSelectedIndex(0);
jcVeiculo.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoUsuario = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcPosto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcTipoCombustivel = new javax.swing.JComboBox<>();
        jcFormaPagamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfKmatual = new javax.swing.JFormattedTextField();
        tfQtdLitros = new javax.swing.JFormattedTextField();
        tfValorTotal = new javax.swing.JFormattedTextField();
        tfValorLitro = new javax.swing.JFormattedTextField();
        tfData = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcVeiculo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(24, 84, 205));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 153)));
        setClosable(true);
        setTitle("Registrar Abastecimento");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Abastecimento");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Km atual:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Posto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade em litros:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Total:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(24, 84, 205));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_internalFrame/salvar.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcPosto.setBackground(new java.awt.Color(24, 84, 205));
        jcPosto.setForeground(new java.awt.Color(255, 255, 255));
        jcPosto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPostoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de combustível:");

        jcTipoCombustivel.setBackground(new java.awt.Color(24, 84, 205));
        jcTipoCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        jcTipoCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Gasolina comum", "Gasolina aditivada", "Gasolina Premium", "Etanol", "Etanol aditivado", "Diesel", "Diesel S10", "Diesel S 500" }));
        jcTipoCombustivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcTipoCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoCombustivelActionPerformed(evt);
            }
        });

        jcFormaPagamento.setBackground(new java.awt.Color(24, 84, 205));
        jcFormaPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jcFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Á vista", "Á prazo" }));
        jcFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFormaPagamentoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Forma de pagamento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor por litro:");

        tfKmatual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        tfKmatual.setPreferredSize(new java.awt.Dimension(105, 20));
        tfKmatual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKmatualActionPerformed(evt);
            }
        });
        tfKmatual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKmatualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfKmatualKeyTyped(evt);
            }
        });

        tfQtdLitros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfQtdLitros.setPreferredSize(new java.awt.Dimension(105, 20));
        tfQtdLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtdLitrosActionPerformed(evt);
            }
        });
        tfQtdLitros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQtdLitrosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQtdLitrosKeyTyped(evt);
            }
        });

        tfValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfValorTotal.setPreferredSize(new java.awt.Dimension(105, 20));
        tfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorTotalActionPerformed(evt);
            }
        });
        tfValorTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfValorTotalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorTotalKeyTyped(evt);
            }
        });

        tfValorLitro.setEditable(false);
        tfValorLitro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfValorLitro.setPreferredSize(new java.awt.Dimension(105, 20));
        tfValorLitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorLitroActionPerformed(evt);
            }
        });
        tfValorLitro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfValorLitroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorLitroKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Veiculo:");

        jcVeiculo.setBackground(new java.awt.Color(24, 84, 205));
        jcVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jcVeiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcPosto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfQtdLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfKmatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcPosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQtdLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKmatual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfValorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Abastecimento abastecimento = this.RecolheDadosAbastecimento();
        try {
            controllerAbastecimento.insertAbastecimento(abastecimento);
             this.LimpaCampos();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarAbastecimento.class.getName()).log(Level.SEVERE, null, ex);
        }
       


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcPostoActionPerformed

    private void jcTipoCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoCombustivelActionPerformed

    private void jcFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcFormaPagamentoActionPerformed

    private void tfKmatualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKmatualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKmatualActionPerformed

    private void tfKmatualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKmatualKeyReleased
      
    }//GEN-LAST:event_tfKmatualKeyReleased

    private void tfKmatualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKmatualKeyTyped
        String caracteres = "0987654321,";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfKmatualKeyTyped

    private void tfQtdLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtdLitrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQtdLitrosActionPerformed

    private void tfQtdLitrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQtdLitrosKeyReleased
          double qtdLitro;
        double valorLitro;
        double total;
        if (tfValorTotal.getText().equals("")) {

            valorLitro = 0.00;
            tfValorLitro.setText("");
        } else if (tfQtdLitros.getText().equals("")) {

           
            tfValorLitro.setText("");
        } else {

          qtdLitro   = Double.parseDouble(tfQtdLitros.getText().replaceAll(",", "."));
          valorLitro   = Double.parseDouble(tfValorTotal.getText().replaceAll(",", "."));
            total = valorLitro / qtdLitro;
            tfValorLitro.setText(Double.toString(total));
        }
    }//GEN-LAST:event_tfQtdLitrosKeyReleased

    private void tfQtdLitrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQtdLitrosKeyTyped
        String caracteres = "0987654321,";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfQtdLitrosKeyTyped

    private void tfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorTotalActionPerformed

    private void tfValorTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorTotalKeyReleased
       double qtdLitro;
        double valorLitro;
        double total;
        if (tfValorTotal.getText().equals("")) {

            valorLitro = 0.00;
            tfValorLitro.setText("");
        } else if (tfQtdLitros.getText().equals("")) {

           
            tfValorLitro.setText("");
        } else {

          qtdLitro   = Double.parseDouble(tfQtdLitros.getText().replaceAll(",", "."));
          valorLitro   = Double.parseDouble(tfValorTotal.getText().replaceAll(",", "."));
            total = valorLitro / qtdLitro;
            tfValorLitro.setText(Double.toString(total));
        }
                                         
    }//GEN-LAST:event_tfValorTotalKeyReleased

    private void tfValorTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorTotalKeyTyped
        String caracteres = "0987654321,";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfValorTotalKeyTyped

    private void tfValorLitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorLitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorLitroActionPerformed

    private void tfValorLitroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorLitroKeyReleased
       
    }//GEN-LAST:event_tfValorLitroKeyReleased

    private void tfValorLitroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorLitroKeyTyped
        String caracteres = "0987654321,";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfValorLitroKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
          carregaComboPrestadora();
        try {
            carregaVeiculo();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarAbastecimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jcVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcVeiculoActionPerformed
        
    }//GEN-LAST:event_jcVeiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcFormaPagamento;
    private javax.swing.JComboBox<String> jcPosto;
    private javax.swing.JComboBox<String> jcTipoCombustivel;
    private javax.swing.JComboBox<String> jcVeiculo;
    private com.toedter.calendar.JDateChooser tfData;
    private javax.swing.JFormattedTextField tfKmatual;
    private javax.swing.JFormattedTextField tfQtdLitros;
    private javax.swing.JFormattedTextField tfValorLitro;
    private javax.swing.JFormattedTextField tfValorTotal;
    // End of variables declaration//GEN-END:variables
}
