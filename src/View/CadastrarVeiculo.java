
package View;

import Controllers.ControllerVeiculo;
import Model.Veiculo;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class CadastrarVeiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarVeiculo
     */
 
    ControllerVeiculo controler = new ControllerVeiculo();
    public CadastrarVeiculo() {
        initComponents();
       
        
    }
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width)/2 + 100 , (d.height - this.getSize().height) / 2);
    }

   
     public Veiculo RecolheDadosVeiculo() {
        Veiculo veiculo = new Veiculo();
       veiculo.setModelo(tfModelo.getText());
        veiculo.setPlaca(ftPlaca.getText());
        veiculo.setAno(ftAno.getText());
        veiculo.setLicenciamento(ftAno1.getText());
      
        if (radioAutomovel.isSelected()) {
            veiculo.setTipo("Automovel");
            veiculo.setQtdEixos("Dois Eixos");
        }else if(radioMotocicleta.isSelected()){
            veiculo.setTipo("Motocicleta");
            veiculo.setQtdEixos("Dois Eixos");
        }else{
            veiculo.setTipo("Caminhao");
            veiculo.setQtdEixos(jComboEixos.getSelectedItem().toString());
        }

        return veiculo;
    }
       public void LimpaCampos() {
       
        tfModelo.setText("");
        ftAno.setText("");
        ftAno1.setText("");
        ftPlaca.setText("");
        jComboEixos.setSelectedIndex(-1);
        radioAutomovel.setSelected(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupVeiculos = new javax.swing.ButtonGroup();
        lblCadastrar = new javax.swing.JLabel();
        radioCaminhao = new javax.swing.JRadioButton();
        radioAutomovel = new javax.swing.JRadioButton();
        radioMotocicleta = new javax.swing.JRadioButton();
        lblTipoVeiculo = new javax.swing.JLabel();
        jComboEixos = new javax.swing.JComboBox<>();
        lblEixos = new javax.swing.JLabel();
        lblAutomovel = new javax.swing.JLabel();
        lblMoto = new javax.swing.JLabel();
        lblCaminhao = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        ftPlaca = new javax.swing.JFormattedTextField();
        lblPlaca = new javax.swing.JLabel();
        ftAno = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        lblAno1 = new javax.swing.JLabel();
        ftAno1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 84, 205));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 153)));
        setClosable(true);
        setTitle("Cadastrar Veículo");
        setMaximumSize(new java.awt.Dimension(590, 450));
        setMinimumSize(new java.awt.Dimension(590, 450));
        setPreferredSize(new java.awt.Dimension(590, 450));
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
        getContentPane().setLayout(null);

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Cadastrar");
        getContentPane().add(lblCadastrar);
        lblCadastrar.setBounds(223, 10, 123, 32);

        radioCaminhao.setBackground(new java.awt.Color(24, 84, 205));
        GroupVeiculos.add(radioCaminhao);
        radioCaminhao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioCaminhao.setForeground(new java.awt.Color(255, 255, 255));
        radioCaminhao.setText("Caminhão");
        radioCaminhao.setFocusPainted(false);
        radioCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCaminhaoActionPerformed(evt);
            }
        });
        getContentPane().add(radioCaminhao);
        radioCaminhao.setBounds(312, 59, 100, 30);

        radioAutomovel.setBackground(new java.awt.Color(24, 84, 205));
        GroupVeiculos.add(radioAutomovel);
        radioAutomovel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioAutomovel.setForeground(new java.awt.Color(255, 255, 255));
        radioAutomovel.setSelected(true);
        radioAutomovel.setText("Automóvel");
        radioAutomovel.setFocusPainted(false);
        radioAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAutomovelActionPerformed(evt);
            }
        });
        getContentPane().add(radioAutomovel);
        radioAutomovel.setBounds(133, 59, 80, 30);

        radioMotocicleta.setBackground(new java.awt.Color(24, 84, 205));
        GroupVeiculos.add(radioMotocicleta);
        radioMotocicleta.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioMotocicleta.setForeground(new java.awt.Color(255, 255, 255));
        radioMotocicleta.setText("Motocicleta");
        radioMotocicleta.setFocusPainted(false);
        radioMotocicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMotocicletaActionPerformed(evt);
            }
        });
        getContentPane().add(radioMotocicleta);
        radioMotocicleta.setBounds(217, 59, 100, 30);

        lblTipoVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoVeiculo.setText("Tipo de veículo:");
        getContentPane().add(lblTipoVeiculo);
        lblTipoVeiculo.setBounds(37, 57, 94, 30);

        jComboEixos.setBackground(new java.awt.Color(24, 84, 205));
        jComboEixos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jComboEixos.setForeground(new java.awt.Color(255, 255, 255));
        jComboEixos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dois eixos", "Três eixos", "Quatro eixos" }));
        jComboEixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEixosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboEixos);
        jComboEixos.setBounds(450, 89, 101, 25);

        lblEixos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEixos.setForeground(new java.awt.Color(255, 255, 255));
        lblEixos.setText("Quantidade de eixos:");
        getContentPane().add(lblEixos);
        lblEixos.setBounds(317, 91, 128, 20);

        lblAutomovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_internalFrame/carro-ecologico.png"))); // NOI18N
        getContentPane().add(lblAutomovel);
        lblAutomovel.setBounds(154, 89, 52, 32);

        lblMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_internalFrame/motocicleta.png"))); // NOI18N
        lblMoto.setLabelFor(radioMotocicleta);
        getContentPane().add(lblMoto);
        lblMoto.setBounds(233, 87, 52, 32);
        getContentPane().add(lblCaminhao);
        lblCaminhao.setBounds(327, 114, 93, 45);

        lblModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo:");
        getContentPane().add(lblModelo);
        lblModelo.setBounds(37, 178, 50, 20);
        getContentPane().add(tfModelo);
        tfModelo.setBounds(98, 177, 213, 26);

        lblAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAno.setForeground(new java.awt.Color(255, 255, 255));
        lblAno.setText("Ano de fabricação do veículo:");
        getContentPane().add(lblAno);
        lblAno.setBounds(37, 225, 190, 26);

        try {
            ftPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***-#*##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ftPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(ftPlaca);
        ftPlaca.setBounds(408, 177, 90, 26);

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa:");
        getContentPane().add(lblPlaca);
        lblPlaca.setBounds(362, 177, 34, 26);

        try {
            ftAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftAnoActionPerformed(evt);
            }
        });
        getContentPane().add(ftAno);
        ftAno.setBounds(224, 228, 80, 26);

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(220, 345, 150, 47);

        lblAno1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAno1.setForeground(new java.awt.Color(255, 255, 255));
        lblAno1.setText("Ultimo licenciamento pago/Ipva:");
        getContentPane().add(lblAno1);
        lblAno1.setBounds(37, 264, 200, 26);

        try {
            ftAno1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftAno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftAno1ActionPerformed(evt);
            }
        });
        getContentPane().add(ftAno1);
        ftAno1.setBounds(240, 266, 65, 26);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ano");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 294, 30, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCaminhaoActionPerformed
          if(radioCaminhao.isSelected()){
           lblMoto.setVisible(false);
           lblAutomovel.setVisible(false);
           lblEixos.setVisible(true);
           lblCaminhao.setVisible(false);
           jComboEixos.setVisible(true);
       }
    }//GEN-LAST:event_radioCaminhaoActionPerformed

    private void radioAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAutomovelActionPerformed
         if(radioAutomovel.isSelected()){
           lblMoto.setVisible(false);
           lblAutomovel.setVisible(true);
           lblCaminhao.setVisible(false);
           lblEixos.setVisible(false);
           jComboEixos.setVisible(false);
           
           
       }
    }//GEN-LAST:event_radioAutomovelActionPerformed

    private void radioMotocicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMotocicletaActionPerformed
       if(radioMotocicleta.isSelected()){
           lblMoto.setVisible(true);
           lblAutomovel.setVisible(false);
            lblCaminhao.setVisible(false);
            lblEixos.setVisible(false);
           jComboEixos.setVisible(false);
       }
    }//GEN-LAST:event_radioMotocicletaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        lblMoto.setVisible(false);
        lblCaminhao.setVisible(false);
        jComboEixos.setVisible(false);
        lblEixos.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboEixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEixosActionPerformed
    ImageIcon icon = new ImageIcon();
     if(jComboEixos.getSelectedIndex()==0){
         lblCaminhao.setVisible(false);
         }else
        if(jComboEixos.getSelectedIndex()==1){
          icon = new ImageIcon("src/assets/img/icons_internalFrame/doiseixos.png");
           lblCaminhao.setVisible(true);
            lblCaminhao.setIcon(icon);
         }else
        if(jComboEixos.getSelectedIndex()==2){
          icon = new ImageIcon("src/assets/img/icons_internalFrame/treseixos.png");
           lblCaminhao.setIcon(icon);
           lblCaminhao.setVisible(true);
         }else
        if(jComboEixos.getSelectedIndex()==3){
         icon = new ImageIcon("src/assets/img/icons_internalFrame/quatroeixos.png");
           lblCaminhao.setIcon(icon);
           lblCaminhao.setVisible(true);
         }
    }//GEN-LAST:event_jComboEixosActionPerformed

    private void ftPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftPlacaActionPerformed

    private void ftAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftAnoActionPerformed

    private void ftAno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftAno1ActionPerformed
      
    }//GEN-LAST:event_ftAno1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
          Veiculo veiculo  = this.RecolheDadosVeiculo();
              controler.insertVeiculo(veiculo);
               this.LimpaCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupVeiculos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftAno;
    private javax.swing.JFormattedTextField ftAno1;
    private javax.swing.JFormattedTextField ftPlaca;
    private javax.swing.JComboBox<String> jComboEixos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAno1;
    private javax.swing.JLabel lblAutomovel;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCaminhao;
    private javax.swing.JLabel lblEixos;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMoto;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipoVeiculo;
    private javax.swing.JRadioButton radioAutomovel;
    private javax.swing.JRadioButton radioCaminhao;
    private javax.swing.JRadioButton radioMotocicleta;
    private javax.swing.JTextField tfModelo;
    // End of variables declaration//GEN-END:variables
}
