
package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerServicos;
import Controllers.ControllerVeiculo;
import Model.Servicos;
import Model.Veiculo;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;


/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class RegistraManutencao extends javax.swing.JInternalFrame {

    Veiculo veiculo;
    ControllerVeiculo veicTemp = new ControllerVeiculo();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    Sessao section = new Sessao();
    String teste;

    public RegistraManutencao() {
        initComponents();

        conexao.Conectar();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }

    public void carregaComboVeiculos() throws SQLException {
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
                jcVeiculos.setModel(defaultComboBox);
        }
             ps.close();
    }
  public String restringirString() {
   
        String x = (String) jcVeiculos.getSelectedItem();
         int indexArroba = x.indexOf(":");
       
        String resultado = x.substring(indexArroba+2);
       return resultado;
    }
    public void carregaComboPrestadora() {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
        String query = "SELECT * FROM prestadora;";

        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pega = rs.getString("nome");
                strList.add(pega);
                DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
                jcEmpresa.setModel(defaultComboBox);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Servicos RecolheDadosServico() {

        Servicos servicos = new Servicos();
        if (((JTextField) tfData.getDateEditor().getUiComponent()).getText().isEmpty() || jcVeiculos.getSelectedItem().equals("Selecionar") || jcEmpresa.getSelectedItem().equals("Selecionar")
                || jcTipoManutencao.getSelectedItem().equals("Selecionar") || tfNomePeca.getText().isEmpty()
                || tfValorpeca.getText().isEmpty() || tfmaoobra.getText().isEmpty() || txDescricao.getText().isEmpty()) {
            return null;
        } else {
            servicos.setNome(jcTipoManutencao.getSelectedItem().toString());
            servicos.setDescricao(txDescricao.getText());
            servicos.setValor_maobra(tfmaoobra.getText());
            servicos.setData(tfData.getDate().toString());
            servicos.setNome_peca(tfNomePeca.getText());
            servicos.setValor_peca(tfValorpeca.getText());
            servicos.setValor_total(tfTotal.getText());
            servicos.setFk_veiculo(restringirString());
            servicos.setFk_prestadora(jcEmpresa.getSelectedItem().toString());

            return servicos;
        }
    }


    public void limpar() {
        jcTipoManutencao.setSelectedIndex(0);
        txDescricao.setText("");
        tfmaoobra.setText("");
        tfNomePeca.setText("");
        tfValorpeca.setText("");
        tfTotal.setText("");
        jcVeiculos.setSelectedIndex(0);
        jcEmpresa.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastrar = new javax.swing.JLabel();
        lblEmpresaResponsavel = new javax.swing.JLabel();
        jcTipoManutencao = new javax.swing.JComboBox<>();
        lblNomePeca = new javax.swing.JLabel();
        jcEmpresa = new javax.swing.JComboBox<>();
        lblTipoManutencao1 = new javax.swing.JLabel();
        lblNomePeca1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblNomePeca2 = new javax.swing.JLabel();
        lblEmpresaResponsavel1 = new javax.swing.JLabel();
        jcVeiculos = new javax.swing.JComboBox<>();
        lblNomePeca3 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextArea();
        lblNomePeca4 = new javax.swing.JLabel();
        tfNomePeca = new javax.swing.JTextField();
        tfData = new com.toedter.calendar.JDateChooser();
        tfmaoobra = new javax.swing.JFormattedTextField();
        tfValorpeca = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(24, 84, 205));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 153)));
        setClosable(true);
        setTitle("Registrar Manutenção");
        setMaximumSize(new java.awt.Dimension(625, 507));
        setMinimumSize(new java.awt.Dimension(625, 507));
        setPreferredSize(new java.awt.Dimension(625, 507));
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
        lblCadastrar.setText("Registrar");
        getContentPane().add(lblCadastrar);
        lblCadastrar.setBounds(260, 10, 123, 32);

        lblEmpresaResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresaResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresaResponsavel.setText("Empresa responsável:");
        getContentPane().add(lblEmpresaResponsavel);
        lblEmpresaResponsavel.setBounds(20, 110, 140, 20);

        jcTipoManutencao.setBackground(new java.awt.Color(24, 84, 205));
        jcTipoManutencao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jcTipoManutencao.setForeground(new java.awt.Color(255, 255, 255));
        jcTipoManutencao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Substituição de peça", "Restauração de peça", "Revisão de rotina", "Troca de pneu", "Rodizio de pneu", "Conserto de pneu", "Recapagem de pneu", "Troca de óleo (Sem filtro)", "Troca de óleo e filtro", "Outros" }));
        jcTipoManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoManutencaoActionPerformed(evt);
            }
        });
        getContentPane().add(jcTipoManutencao);
        jcTipoManutencao.setBounds(460, 70, 150, 21);

        lblNomePeca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomePeca.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePeca.setText("Nome da peça:");
        getContentPane().add(lblNomePeca);
        lblNomePeca.setBounds(320, 110, 100, 20);

        jcEmpresa.setBackground(new java.awt.Color(24, 84, 205));
        jcEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jcEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jcEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", " " }));
        jcEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jcEmpresa);
        jcEmpresa.setBounds(160, 110, 150, 21);

        lblTipoManutencao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoManutencao1.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoManutencao1.setText("Tipo de manutenção:");
        getContentPane().add(lblTipoManutencao1);
        lblTipoManutencao1.setBounds(323, 68, 130, 20);

        lblNomePeca1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomePeca1.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePeca1.setText("Descrição:");
        getContentPane().add(lblNomePeca1);
        lblNomePeca1.setBounds(280, 230, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 190, 40, 20);

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
        btnSalvar.setBounds(240, 410, 150, 47);

        lblNomePeca2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomePeca2.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePeca2.setText("Valor da mão de obra:  R$");
        getContentPane().add(lblNomePeca2);
        lblNomePeca2.setBounds(20, 150, 160, 20);

        lblEmpresaResponsavel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresaResponsavel1.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresaResponsavel1.setText("Veiculo:");
        getContentPane().add(lblEmpresaResponsavel1);
        lblEmpresaResponsavel1.setBounds(20, 70, 60, 20);

        jcVeiculos.setBackground(new java.awt.Color(24, 84, 205));
        jcVeiculos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jcVeiculos.setForeground(new java.awt.Color(255, 255, 255));
        jcVeiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", " " }));
        jcVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcVeiculosActionPerformed(evt);
            }
        });
        getContentPane().add(jcVeiculos);
        jcVeiculos.setBounds(70, 70, 190, 21);

        lblNomePeca3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomePeca3.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePeca3.setText("Valor Total:  R$");
        getContentPane().add(lblNomePeca3);
        lblNomePeca3.setBounds(420, 370, 100, 20);

        tfTotal.setEditable(false);
        tfTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        tfTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTotalFocusGained(evt);
            }
        });
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });
        getContentPane().add(tfTotal);
        tfTotal.setBounds(517, 370, 80, 22);

        txDescricao.setColumns(20);
        txDescricao.setRows(5);
        jScrollPane1.setViewportView(txDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 250, 280, 100);

        lblNomePeca4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomePeca4.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePeca4.setText("Valor da peça:  R$");
        getContentPane().add(lblNomePeca4);
        lblNomePeca4.setBounds(320, 150, 110, 20);

        tfNomePeca.setEditable(false);
        tfNomePeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomePecaActionPerformed(evt);
            }
        });
        tfNomePeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomePecaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomePecaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomePecaKeyTyped(evt);
            }
        });
        getContentPane().add(tfNomePeca);
        tfNomePeca.setBounds(420, 110, 160, 22);
        getContentPane().add(tfData);
        tfData.setBounds(60, 190, 140, 20);

        tfmaoobra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfmaoobra.setPreferredSize(new java.awt.Dimension(105, 20));
        tfmaoobra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfmaoobraFocusGained(evt);
            }
        });
        tfmaoobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmaoobraActionPerformed(evt);
            }
        });
        tfmaoobra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfmaoobraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfmaoobraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfmaoobraKeyTyped(evt);
            }
        });
        getContentPane().add(tfmaoobra);
        tfmaoobra.setBounds(180, 150, 105, 22);

        tfValorpeca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfValorpeca.setPreferredSize(new java.awt.Dimension(105, 20));
        tfValorpeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorpecaActionPerformed(evt);
            }
        });
        tfValorpeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfValorpecaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorpecaKeyTyped(evt);
            }
        });
        getContentPane().add(tfValorpeca);
        tfValorpeca.setBounds(430, 150, 105, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcTipoManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoManutencaoActionPerformed
        if(jcTipoManutencao.getSelectedItem().equals("Substituição de peça") || jcTipoManutencao.getSelectedItem().equals(
"Restauração de peça")){
            tfNomePeca.setEditable(true);
        }else{
            tfNomePeca.setEditable(false);
            tfNomePeca.setText("Sem alterações");
        }
    }//GEN-LAST:event_jcTipoManutencaoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        carregaComboPrestadora();
        try {
            carregaComboVeiculos();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jcEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEmpresaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        ControllerServicos controllerServicos = new ControllerServicos();
        Servicos servico = this.RecolheDadosServico();

        try {
            controllerServicos.insertServico(servico);
            this.limpar();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jcVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcVeiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcVeiculosActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed

    }//GEN-LAST:event_tfTotalActionPerformed

    private void tfTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTotalFocusGained

    }//GEN-LAST:event_tfTotalFocusGained

    private void tfmaoobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmaoobraActionPerformed

    }//GEN-LAST:event_tfmaoobraActionPerformed

    private void tfmaoobraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfmaoobraKeyReleased

        double maoObra;
        double peca;
        double total;
        if (tfValorpeca.getText().equals("")) {

            peca = 0.00;
            tfTotal.setText(tfmaoobra.getText());
        } else if (tfmaoobra.getText().equals("")) {

            maoObra = 0.00;
            peca = Double.parseDouble(tfValorpeca.getText().replaceAll(",", "."));
            total = peca + maoObra;
            tfTotal.setText(Double.toString(total));
        } else {

            peca = Double.parseDouble(tfValorpeca.getText().replaceAll(",", "."));
            maoObra = Double.parseDouble(tfmaoobra.getText().replaceAll(",", "."));
            total = peca + maoObra;
            tfTotal.setText(Double.toString(total));

        }
    }//GEN-LAST:event_tfmaoobraKeyReleased

    private void tfValorpecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorpecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorpecaActionPerformed

    private void tfValorpecaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorpecaKeyReleased
        double maoObra;
        double peca;
        double total;
        if (tfmaoobra.getText().equals("")) {

            maoObra = 0.00;
            tfTotal.setText(tfValorpeca.getText());
        } else if (tfValorpeca.getText().equals("")) {

            peca = 0.00;
            maoObra = Double.parseDouble(tfmaoobra.getText().replaceAll(",", "."));
            total = peca + maoObra;
            tfTotal.setText(Double.toString(total));
        } else {

            peca = Double.parseDouble(tfValorpeca.getText().replaceAll(",", "."));
            maoObra = Double.parseDouble(tfmaoobra.getText().replaceAll(",", "."));
            total = peca + maoObra;
            tfTotal.setText(Double.toString(total));
        }
    }//GEN-LAST:event_tfValorpecaKeyReleased

    private void tfmaoobraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfmaoobraKeyPressed


    }//GEN-LAST:event_tfmaoobraKeyPressed

    private void tfmaoobraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfmaoobraKeyTyped
        String caracteres = "0987654321,";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfmaoobraKeyTyped

    private void tfValorpecaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorpecaKeyTyped
        String caracteres = "0987654321,";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfValorpecaKeyTyped

    private void tfNomePecaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomePecaKeyPressed

    }//GEN-LAST:event_tfNomePecaKeyPressed

    private void tfNomePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomePecaActionPerformed
     
    }//GEN-LAST:event_tfNomePecaActionPerformed

    private void tfNomePecaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomePecaKeyReleased
        tfNomePeca.setText(tfNomePeca.getText().toUpperCase());
    }//GEN-LAST:event_tfNomePecaKeyReleased

    private void tfmaoobraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmaoobraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmaoobraFocusGained

    private void tfNomePecaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomePecaKeyTyped
         String caracteres = "0987654321";// lista de caracters que não devem ser aceitos
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNomePecaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcEmpresa;
    private javax.swing.JComboBox<String> jcTipoManutencao;
    private javax.swing.JComboBox<String> jcVeiculos;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblEmpresaResponsavel;
    private javax.swing.JLabel lblEmpresaResponsavel1;
    private javax.swing.JLabel lblNomePeca;
    private javax.swing.JLabel lblNomePeca1;
    private javax.swing.JLabel lblNomePeca2;
    private javax.swing.JLabel lblNomePeca3;
    private javax.swing.JLabel lblNomePeca4;
    private javax.swing.JLabel lblTipoManutencao1;
    private com.toedter.calendar.JDateChooser tfData;
    private javax.swing.JTextField tfNomePeca;
    private javax.swing.JFormattedTextField tfTotal;
    private javax.swing.JFormattedTextField tfValorpeca;
    private javax.swing.JFormattedTextField tfmaoobra;
    private javax.swing.JTextArea txDescricao;
    // End of variables declaration//GEN-END:variables
}
