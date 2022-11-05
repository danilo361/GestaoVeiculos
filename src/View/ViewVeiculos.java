package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerVeiculo;
import Model.Veiculo;
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
public class ViewVeiculos extends javax.swing.JInternalFrame {
     Veiculo veiculo;
     ControllerVeiculo veicTemp = new ControllerVeiculo();
     Conexao conexao = new Conexao();
    private PreparedStatement ps = null; 
    private ResultSet rs = null;
    String teste;
   
     

    public ViewVeiculos() {
        initComponents();
        conexao.Conectar();
        this.carregaTable();

    }

  
    
    public void carregaTable() {
      
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
          jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        
        
        
         

       
        String query = "SELECT * FROM veiculo order by modelo ASC;";
     
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
                   rs.getString(6),
                    rs.getString(7)
                    
                 

                });

            }

        } catch (Exception e) {

        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }


    public void MostraDadosVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            //   tfCodigo.setText(usuario.getPk_usuario());
            tfModelo.setText(veiculo.getModelo());
            tfAno.setText(veiculo.getPlaca());
            tfPlaca.setText(veiculo.getTipo());
            tfLicenciamento.setText(veiculo.getAno());
            tfTipo.setText(veiculo.getTipo());
        }
    }
 public Veiculo RecolheDadosVeiculo() {
        Veiculo veiculo = new Veiculo();

        veiculo.setPk_veiculo(tfCodigo.getText());
        veiculo.setModelo(tfModelo.getText());
        veiculo.setPlaca(tfPlaca.getText());
        veiculo.setTipo(tfTipo.getText());
        veiculo.setAno(tfAno.getText());
        veiculo.setLicenciamento(tfLicenciamento.getText());
        veiculo.setQtdEixos(tfQtdEixos.getText());
        
        return veiculo;
    }
  public void LimpaCampos() {
        tfCodigo.setText("");
        tfAno.setText("");
        tfModelo.setText("");
        tfLicenciamento.setText("");
        tfPlaca.setText("");
        tfQtdEixos.setText("");
        tfTipo.setText("");
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCadastrar = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblLicenciamento = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        tfPlaca = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        tfLicenciamento = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        lbNome1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        tfQtdEixos = new javax.swing.JTextField();
        lblQTDEixos = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();

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

        jScrollPane1.setBackground(new java.awt.Color(24, 84, 205));
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "placa", "ano", "licenciamento", "QTD Eixos", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Veiculos");

        lbModelo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbModelo.setForeground(new java.awt.Color(255, 255, 255));
        lbModelo.setText("Modelo");

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa:");

        lblAno.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAno.setForeground(new java.awt.Color(255, 255, 255));
        lblAno.setText("Ano:");

        lblLicenciamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblLicenciamento.setForeground(new java.awt.Color(255, 255, 255));
        lblLicenciamento.setText("Licenciamento:");

        tfModelo.setEditable(false);
        tfModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfModelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfModelo.setMinimumSize(new java.awt.Dimension(7, 18));
        tfModelo.setPreferredSize(new java.awt.Dimension(7, 18));

        tfPlaca.setEditable(false);
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPlaca.setMinimumSize(new java.awt.Dimension(7, 18));
        tfPlaca.setPreferredSize(new java.awt.Dimension(7, 18));

        tfAno.setEditable(false);
        tfAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfAno.setMinimumSize(new java.awt.Dimension(7, 18));
        tfAno.setPreferredSize(new java.awt.Dimension(7, 18));
        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });

        tfLicenciamento.setEditable(false);
        tfLicenciamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLicenciamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfLicenciamento.setMinimumSize(new java.awt.Dimension(7, 18));
        tfLicenciamento.setPreferredSize(new java.awt.Dimension(7, 18));

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

        tfQtdEixos.setEditable(false);
        tfQtdEixos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQtdEixos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfQtdEixos.setMinimumSize(new java.awt.Dimension(7, 18));
        tfQtdEixos.setPreferredSize(new java.awt.Dimension(7, 18));

        lblQTDEixos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblQTDEixos.setForeground(new java.awt.Color(255, 255, 255));
        lblQTDEixos.setText("QTD Eixos:");

        tfTipo.setEditable(false);
        tfTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfTipo.setMinimumSize(new java.awt.Dimension(7, 18));
        tfTipo.setPreferredSize(new java.awt.Dimension(7, 18));
        tfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNome1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLicenciamento)
                                    .addComponent(lblQTDEixos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLicenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(tfQtdEixos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addGap(22, 22, 22)
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlaca)
                                .addGap(18, 18, 18)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(22, 22, 22)
                        .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrar)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModelo)
                            .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca)
                            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicenciamento)
                            .addComponent(tfLicenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQTDEixos)
                            .addComponent(tfQtdEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
       tfCodigo.setText(jTable1.getValueAt(row,0).toString());
        tfModelo.setText(jTable1.getValueAt(row, 1).toString());
        tfPlaca.setText(jTable1.getValueAt(row, 2).toString());
        tfAno.setText(jTable1.getValueAt(row, 3).toString());
        tfLicenciamento.setText(jTable1.getValueAt(row, 4).toString());
        tfQtdEixos.setText(jTable1.getValueAt(row, 5).toString());
        tfTipo.setText(jTable1.getValueAt(row, 6).toString());
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.teste = "true";

        
        if(tfCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Veículo!");
            return;
        }
        if(this.teste.equals("true")){
               Object[] options = {"Sim", "Não"};
                int i=JOptionPane.showOptionDialog(null,"Você deseja excuir este usuário?","Excluir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (i==JOptionPane.YES_OPTION){
            veicTemp.deleteVeiculo(this.RecolheDadosVeiculo());
              this.carregaTable();
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                }
        }else{
             JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
       
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        
        this.teste = "true";

        
        if(tfCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Veículo!");
            return;
        }
        if(this.teste.equals("true")){
            if(btnAtualizar.getText().equals("Editar")){
                tfModelo.setEditable(true);
                tfAno.setEditable(true);
                tfPlaca.setEditable(true);
                tfLicenciamento.setEditable(true);
                tfQtdEixos.setEditable(true);
                tfTipo.setEditable(true);
                btnAtualizar.setText("Atualizar");
            } else{
                Object[] options = {"Sim", "Não"};
                int i=JOptionPane.showOptionDialog(null,"Confirmar as alterações","Atualizar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (i==JOptionPane.YES_OPTION){
                    
                    veicTemp.updateVeiculo(this.RecolheDadosVeiculo());
                    this.carregaTable();
                    
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    tfModelo.setEditable(false);
                    tfAno.setEditable(false);
                    tfPlaca.setEditable(false);
                    tfLicenciamento.setEditable(false);
                    tfQtdEixos.setEditable(false);
                      tfTipo.setEditable(false);
                    btnAtualizar.setText("Editar");
                    this.LimpaCampos();
                }else{
                    tfModelo.setEditable(false);
                    tfAno.setEditable(false);
                    tfPlaca.setEditable(false);
                    tfLicenciamento.setEditable(false);
                    btnAtualizar.setText("Editar");
                }
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
        }
        
      
       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void tfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblLicenciamento;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQTDEixos;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfLicenciamento;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfQtdEixos;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables
}
