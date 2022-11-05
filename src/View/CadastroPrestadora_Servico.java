package View;

import Controllers.ControllerInputNumber;
import Controllers.ControllerInputText;
import Controllers.ControllerPServico;
import Model.PrestadorServico;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class CadastroPrestadora_Servico extends javax.swing.JInternalFrame {
ControllerPServico controllerServico = new ControllerPServico();
    public CadastroPrestadora_Servico() {
        initComponents();
        tfNumero.setDocument(new ControllerInputNumber() );
        tfNome.setDocument(new ControllerInputText());
        
        
      
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }

    public PrestadorServico RecolheDadosPrestadora() {
        PrestadorServico prestador = new PrestadorServico();
        while (tfNome.getText().isEmpty() || tfCNPJ.getText().isEmpty() || tfCep.getText().isEmpty()
                || tfFone.getText().isEmpty() || tfNumero.getText().isEmpty() || tfRua.getText().isEmpty()
                || jcSegmento.getSelectedIndex() == -1 || jcSegmento.getSelectedItem().equals("Selecionar")) {
            return null;
        }
        prestador.setNome(tfNome.getText());
        prestador.setCnpj(tfCNPJ.getText());
        prestador.setEndereco(tfRua.getText());
        prestador.setTelefone(tfFone.getText());
        prestador.setNumero(tfNumero.getText());
        prestador.setCep(tfCep.getText());
        String segmento = (String) jcSegmento.getSelectedItem();
         prestador.setSegmento(segmento);
           this.LimpaCampos();    
        return prestador;
    }

    public void LimpaCampos() {

        tfNome.setText("");
        tfFone.setText("");
        tfCNPJ.setText("");
        tfRua.setText("");
        tfNumero.setText("");
        tfCep.setText("");
        jcSegmento.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblEndereco = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        tfCep = new javax.swing.JFormattedTextField();
        tfCNPJ = new javax.swing.JFormattedTextField();
        tfNome = new javax.swing.JTextField();
        tfFone = new javax.swing.JFormattedTextField();
        tfNumero = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        jcSegmento = new javax.swing.JComboBox<>();
        lblNome1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 84, 205));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 153)));
        setClosable(true);
        setTitle("Prestador/Serviço");
        setMaximumSize(new java.awt.Dimension(582, 400));
        setMinimumSize(new java.awt.Dimension(582, 400));
        setPreferredSize(new java.awt.Dimension(582, 400));
        getContentPane().setLayout(null);

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Cadastrar");
        getContentPane().add(lblCadastrar);
        lblCadastrar.setBounds(250, 10, 123, 32);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Telefone celular:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 130, 100, 20);

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Numero:");
        getContentPane().add(lblNumero);
        lblNumero.setBounds(340, 217, 60, 20);

        lblCNPJ.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        lblCNPJ.setText("CNPJ:");
        getContentPane().add(lblCNPJ);
        lblCNPJ.setBounds(350, 130, 40, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 172, 570, 10);

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço:");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(220, 180, 80, 20);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Segmento:");
        getContentPane().add(lblNome);
        lblNome.setBounds(350, 82, 70, 20);

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setText("Cep:");
        getContentPane().add(lblCep);
        lblCep.setBounds(50, 256, 30, 20);

        lblRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 255, 255));
        lblRua.setText("Rua:");
        getContentPane().add(lblRua);
        lblRua.setBounds(50, 217, 30, 20);

        tfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRuaActionPerformed(evt);
            }
        });
        getContentPane().add(tfRua);
        tfRua.setBounds(80, 215, 250, 26);

        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setMaximumSize(null);
        tfCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCepMouseClicked(evt);
            }
        });
        getContentPane().add(tfCep);
        tfCep.setBounds(80, 255, 110, 26);

        try {
            tfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfCNPJ);
        tfCNPJ.setBounds(390, 128, 140, 26);

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome);
        tfNome.setBounds(90, 80, 240, 26);

        try {
            tfFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFone.setMaximumSize(null);
        tfFone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFoneMouseClicked(evt);
            }
        });
        getContentPane().add(tfFone);
        tfFone.setBounds(140, 127, 120, 26);

        tfNumero.setMaximumSize(null);
        tfNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNumeroMouseClicked(evt);
            }
        });
        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });
        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(tfNumero);
        tfNumero.setBounds(400, 215, 70, 26);

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
        btnSalvar.setBounds(230, 310, 150, 48);

        jcSegmento.setBackground(new java.awt.Color(24, 84, 205));
        jcSegmento.setForeground(new java.awt.Color(255, 255, 255));
        jcSegmento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Mecânica", "Borracharia", "Posto combustível", "Auto elétrica", "Chapeação", "Auto peças" }));
        jcSegmento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSegmentoActionPerformed(evt);
            }
        });
        getContentPane().add(jcSegmento);
        jcSegmento.setBounds(420, 83, 140, 24);

        lblNome1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(255, 255, 255));
        lblNome1.setText("Nome:");
        getContentPane().add(lblNome1);
        lblNome1.setBounds(40, 80, 50, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRuaActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void jcSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSegmentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSegmentoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         PrestadorServico prestador = this.RecolheDadosPrestadora();
        try {
          controllerServico.insertPservico(prestador);
          
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPrestadora_Servico.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
   
    }//GEN-LAST:event_tfNumeroActionPerformed

    private void tfNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNumeroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroMouseClicked

    private void tfFoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfFoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFoneMouseClicked

    private void tfCepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCepMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCepMouseClicked

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void tfNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyPressed
      
    }//GEN-LAST:event_tfNumeroKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcSegmento;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JFormattedTextField tfFone;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfNumero;
    private javax.swing.JTextField tfRua;
    // End of variables declaration//GEN-END:variables
}
