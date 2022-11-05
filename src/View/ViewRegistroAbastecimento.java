package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerAbastecimento;
import Model.Abastecimento;


import Model.PrestadorServico;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class ViewRegistroAbastecimento extends javax.swing.JInternalFrame {

    private String teste;
    PrestadorServico prestador;
    ControllerAbastecimento controllerServico = new ControllerAbastecimento();
    Conexao conexao = new Conexao();
   
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String queryTodas = "SELECT pk_abastecimento, modelo, placa, nome, tipo_combustivel, "
            + "km_atual, forma_pagamento, qtd_litros, valor_litro, valor_total, data "
            + " FROM abastecimento"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora  order by data ASC;";

    public ViewRegistroAbastecimento() {
        initComponents();

        conexao.Conectar();
        this.carregaTableAbastecimento(this.queryTodas);

    }

   

    public void carregaTableAbastecimento(String consulta) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(60);

        try {
            ps = conexao.conectar.prepareStatement(consulta,
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
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11)

                });

            }

        } catch (Exception e) {

        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 97, (d.height - this.getSize().height) / 2);
    }

    public void MostraDadosAbastecimento(){

        int row = jTable1.getSelectedRow();
            tfCodigo.setText(jTable1.getValueAt(row,0).toString());
            tfVeiculo.setText(jTable1.getValueAt(row,1).toString());
            tfPlaca.setText(jTable1.getValueAt(row,2).toString());
            tfPrestadora.setText(jTable1.getValueAt(row,3).toString());
            tfCombustivel.setText(jTable1.getValueAt(row,4).toString());
            tfKmAtual.setText(jTable1.getValueAt(row,5).toString());
            tfPagamento.setText(jTable1.getValueAt(row,6).toString());
            tfQtdLitros.setText(jTable1.getValueAt(row,7).toString());
            tfValorLitro.setText(jTable1.getValueAt(row,8).toString());
            tfValorTotal.setText(jTable1.getValueAt(row,9).toString());
            tfData.setText(jTable1.getValueAt(row,10).toString());
    }

    public Abastecimento deletar() {
        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setPk_Abastecimento(tfCodigo.getText());
        return abastecimento;
    }
    
    public String restringirString() {
   
        String x = (String) jcTodos.getSelectedItem();
         int indexArroba = x.indexOf(":");
       
        String resultado = x.substring(indexArroba+2);
       return resultado;
    }

    public void LimpaCampos() {
        tfCodigo.setText("");
        tfVeiculo.setText("");
        tfPlaca.setText("");
        tfPrestadora.setText("");
        tfCombustivel.setText("");
        tfData.setText("");
        tfQtdLitros.setText("");
        tfKmAtual.setText("");
        tfPagamento.setText("");
        tfValorLitro.setText("");
        tfValorTotal.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCadastrar = new javax.swing.JLabel();
        lblVeiculo = new javax.swing.JLabel();
        lblKmAtual = new javax.swing.JLabel();
        lblPosto = new javax.swing.JLabel();
        lblCombustivel = new javax.swing.JLabel();
        tfVeiculo = new javax.swing.JTextField();
        tfPrestadora = new javax.swing.JTextField();
        lbNome1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lblPagamento = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jcTodos = new javax.swing.JComboBox<>();
        tfKmAtual = new javax.swing.JTextField();
        tfPagamento = new javax.swing.JTextField();
        lblqtdLitros = new javax.swing.JLabel();
        tfQtdLitros = new javax.swing.JTextField();
        lblValorLitro = new javax.swing.JLabel();
        tfCombustivel = new javax.swing.JTextField();
        jcVeiculo = new javax.swing.JRadioButton();
        jcPrestadora = new javax.swing.JRadioButton();
        jcrTodos = new javax.swing.JRadioButton();
        tfValorLitro = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        tfValorTotal = new javax.swing.JTextField();
        tfData = new javax.swing.JTextField();

        setBackground(new java.awt.Color(24, 84, 205));
        setClosable(true);
        setTitle("Custos de abastecimento");
        setMaximumSize(new java.awt.Dimension(1020, 530));
        setMinimumSize(new java.awt.Dimension(1020, 530));
        setPreferredSize(new java.awt.Dimension(1020, 530));
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
        jPanel1.setMaximumSize(new java.awt.Dimension(1020, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 530));

        jScrollPane1.setBackground(new java.awt.Color(24, 84, 205));
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Veículo", "Placa", "Posto", "Tipo de combustível", "Km atual", "Pagamento", "Qtd litros", "Valor litro", "Valor total", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Registro de abastecimentos");

        lblVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblVeiculo.setText("Veículo:");

        lblKmAtual.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblKmAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblKmAtual.setText("Km atual:");

        lblPosto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPosto.setForeground(new java.awt.Color(255, 255, 255));
        lblPosto.setText("Posto:");

        lblCombustivel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustivel.setText("Combustível:");

        tfVeiculo.setEditable(false);
        tfVeiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfVeiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfVeiculo.setMinimumSize(new java.awt.Dimension(7, 18));
        tfVeiculo.setPreferredSize(new java.awt.Dimension(7, 18));

        tfPrestadora.setEditable(false);
        tfPrestadora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPrestadora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPrestadora.setMinimumSize(new java.awt.Dimension(7, 18));
        tfPrestadora.setPreferredSize(new java.awt.Dimension(7, 18));
        tfPrestadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrestadoraActionPerformed(evt);
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

        lblPagamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPagamento.setForeground(new java.awt.Color(255, 255, 255));
        lblPagamento.setText("Pagamento:");

        tfPlaca.setEditable(false);
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPlaca.setMinimumSize(new java.awt.Dimension(7, 18));
        tfPlaca.setPreferredSize(new java.awt.Dimension(7, 18));
        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por:");

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data:");

        jcTodos.setBackground(new java.awt.Color(24, 84, 205));
        jcTodos.setForeground(new java.awt.Color(255, 255, 255));
        jcTodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jcTodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcTodos.setEnabled(false);
        jcTodos.setMinimumSize(new java.awt.Dimension(114, 22));
        jcTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTodosActionPerformed(evt);
            }
        });

        tfKmAtual.setEditable(false);

        tfPagamento.setEditable(false);
        tfPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPagamentoActionPerformed(evt);
            }
        });

        lblqtdLitros.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblqtdLitros.setForeground(new java.awt.Color(255, 255, 255));
        lblqtdLitros.setText("Qtd Litros:");

        tfQtdLitros.setEditable(false);

        lblValorLitro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValorLitro.setForeground(new java.awt.Color(255, 255, 255));
        lblValorLitro.setText("Valor por litro:");

        tfCombustivel.setEditable(false);
        tfCombustivel.setPreferredSize(new java.awt.Dimension(7, 18));
        tfCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCombustivelActionPerformed(evt);
            }
        });

        jcVeiculo.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcVeiculo);
        jcVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jcVeiculo.setText("Veículo");
        jcVeiculo.setFocusPainted(false);
        jcVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcVeiculoActionPerformed(evt);
            }
        });

        jcPrestadora.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcPrestadora);
        jcPrestadora.setForeground(new java.awt.Color(255, 255, 255));
        jcPrestadora.setText("Posto de combustível");
        jcPrestadora.setFocusPainted(false);
        jcPrestadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPrestadoraActionPerformed(evt);
            }
        });

        jcrTodos.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcrTodos);
        jcrTodos.setForeground(new java.awt.Color(255, 255, 255));
        jcrTodos.setSelected(true);
        jcrTodos.setText("Todos");
        jcrTodos.setFocusPainted(false);
        jcrTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcrTodosActionPerformed(evt);
            }
        });

        tfValorLitro.setEditable(false);

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblValorTotal.setText("Valor Total:");

        tfValorTotal.setEditable(false);

        tfData.setEditable(false);
        tfData.setFocusable(false);
        tfData.setMaximumSize(new java.awt.Dimension(81, 18));
        tfData.setMinimumSize(new java.awt.Dimension(81, 18));
        tfData.setPreferredSize(new java.awt.Dimension(81, 18));
        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcrTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcPrestadora)
                        .addGap(18, 18, 18)
                        .addComponent(jcTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbNome1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPlaca)
                                        .addGap(1, 1, 1)
                                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(lblData)
                                        .addGap(1, 1, 1)
                                        .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblVeiculo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPosto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPrestadora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCombustivel)
                                            .addComponent(lblKmAtual)
                                            .addComponent(lblPagamento))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfKmAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                .addComponent(tfPagamento))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblqtdLitros)
                                            .addComponent(lblValorLitro))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfValorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfQtdLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblValorTotal))
                                .addContainerGap(29, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrar)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcVeiculo)
                    .addComponent(jcPrestadora)
                    .addComponent(jcrTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVeiculo)
                            .addComponent(tfVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosto)
                            .addComponent(tfPrestadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCombustivel)
                            .addComponent(tfCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKmAtual)
                            .addComponent(tfKmAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagamento)
                            .addComponent(tfPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblqtdLitros)
                            .addComponent(tfQtdLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorLitro)
                            .addComponent(tfValorLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorTotal)
                            .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened


    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
            this.MostraDadosAbastecimento();
      

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.teste = "true";

        if (tfCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um Registro!");
            return;
        }
        if (this.teste.equals("true")) {
            Object[] options = {"Sim", "Não"};
            int i = JOptionPane.showOptionDialog(null, "Você deseja excuir este registro?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (i == JOptionPane.YES_OPTION) {
                controllerServico.deleteAbastecimento(this.deletar());
                this.carregaTableAbastecimento(this.queryTodas);
                this.LimpaCampos();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tfPrestadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrestadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrestadoraActionPerformed

    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void jcTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTodosActionPerformed
     
        String selecao = jcTodos.getSelectedItem().toString();
        String queryFiltro;
        if (jcrTodos.isSelected()) {
            jcTodos.setEnabled(false);
            jcTodos.setSelectedIndex(0);
            queryFiltro = "SELECT pk_abastecimento, modelo, placa, nome, tipo_combustivel, "
            + "km_atual, forma_pagamento, qtd_litros, valor_litro, valor_total, data "
            + " FROM abastecimento"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora order by data ASC;";
            this.carregaTableAbastecimento(queryFiltro);
        } else if (jcVeiculo.isSelected()) {
               String veiculo = restringirString();
            queryFiltro = "SELECT pk_abastecimento, modelo, placa, nome, tipo_combustivel, "
            + "km_atual, forma_pagamento, qtd_litros, valor_litro, valor_total, data "
            + " FROM abastecimento"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora WHERE placa ='" + veiculo + "';";
            this.carregaTableAbastecimento(queryFiltro);
        } else if (jcPrestadora.isSelected()) {
            queryFiltro = "SELECT pk_abastecimento, modelo, placa, nome, tipo_combustivel, "
            + "km_atual, forma_pagamento, qtd_litros, valor_litro, valor_total, data "
            + " FROM abastecimento"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora WHERE nome ='" + selecao + "';";
            this.carregaTableAbastecimento(queryFiltro);

        } 
        LimpaCampos();
    }//GEN-LAST:event_jcTodosActionPerformed

    private void tfPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPagamentoActionPerformed

    private void tfCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCombustivelActionPerformed

    private void jcVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcVeiculoActionPerformed
        jcTodos.setEnabled(true);
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
        String query = "SELECT modelo, placa FROM veiculo;";

        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pega = rs.getString("modelo")+" - Placa: "+rs.getString("placa");
                strList.add(pega);
                DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
                jcTodos.setModel(defaultComboBox);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcVeiculoActionPerformed

    private void jcPrestadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPrestadoraActionPerformed
        jcTodos.setEnabled(true);
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
        String query = "SELECT nome FROM prestadora WHERE segmento= 'Posto combustível';";

        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pega = rs.getString("nome");
                strList.add(pega);
                DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
                jcTodos.setModel(defaultComboBox);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistraManutencao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcPrestadoraActionPerformed

    private void jcrTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrTodosActionPerformed

        jcTodos.setEnabled(false);
        jcTodos.setSelectedIndex(0);
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
        String queryTodas = "SELECT pk_abastecimento, modelo, placa, nome, tipo_combustivel, "
            + "km_atual, forma_pagamento, qtd_litros, valor_litro, valor_total, data "
            + " FROM abastecimento"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora  order by data ASC;";
        this.carregaTableAbastecimento(queryTodas);

    }//GEN-LAST:event_jcrTodosActionPerformed

    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jcPrestadora;
    private javax.swing.JComboBox<String> jcTodos;
    private javax.swing.JRadioButton jcVeiculo;
    private javax.swing.JRadioButton jcrTodos;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblKmAtual;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPosto;
    private javax.swing.JLabel lblValorLitro;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JLabel lblqtdLitros;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCombustivel;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfKmAtual;
    private javax.swing.JTextField tfPagamento;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPrestadora;
    private javax.swing.JTextField tfQtdLitros;
    private javax.swing.JTextField tfValorLitro;
    private javax.swing.JTextField tfValorTotal;
    private javax.swing.JTextField tfVeiculo;
    // End of variables declaration//GEN-END:variables
}
