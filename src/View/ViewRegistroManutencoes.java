package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerServicos;
import Model.PrestadorServico;
import Model.Servicos;
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
public class ViewRegistroManutencoes extends javax.swing.JInternalFrame {

    private String teste;
    PrestadorServico prestador;
    ControllerServicos controllerServico = new ControllerServicos();
    Conexao conexao = new Conexao();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String queryTodas = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_total "
            + " FROM servicos"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora  order by data ASC;";

    public ViewRegistroManutencoes() {
        initComponents();
      
        conexao.Conectar();
        this.carregaTableServicos(this.queryTodas);

    }

  
    public void carregaTableServicos(String consulta) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(140);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(32);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);

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
                    rs.getString(8)

                });

            }

        } catch (Exception e) {

        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }

    public void MostraDadosServicos(String CodServico) throws SQLException {

        String consultar = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_peca, valor_maobra, nome_peca, valor_total"
                + " FROM servicos"
                + " JOIN veiculo"
                + " ON fk_veiculo = pk_veiculo"
                + " JOIN prestadora"
                + " on fk_prestadora = pk_prestadora  WHERE pk_servico =" + CodServico + ";";
        try {
            ps = conexao.conectar.prepareStatement(consultar,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        while (rs.next()) {
            tfCodigo.setText(rs.getString("pk_servico"));
            tfVeiculo.setText(rs.getString("modelo"));
            tfPlaca.setText(rs.getString("placa"));
            tfPrestadora.setText(rs.getString("nome"));
            tfNome_servico.setText(rs.getString("nome_servico"));
            txDescricao.setText(rs.getString("descricao"));
            tfData.setText(rs.getString("data"));
            tfValorPeca.setText(rs.getString("valor_peca"));
            tfMaoObra.setText(rs.getString("valor_maobra"));
            tfNomepeca.setText(rs.getString("nome_peca"));
            tfValorTotal.setText(rs.getString("valor_total"));
         
           
        }
    }
    
    
    public Servicos deletar(){
    Servicos servico = new Servicos();
    servico.setPk_servico(tfCodigo.getText());
   return servico;
}
    
    public void LimpaCampos() {
  tfCodigo.setText("");
            tfVeiculo.setText("");
            tfPlaca.setText("");
            tfPrestadora.setText("");
            tfNome_servico.setText("");
            txDescricao.setText("");
            tfData.setText("");
            tfValorPeca.setText("");
            tfMaoObra.setText("");
            tfNomepeca.setText("");
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
        lblMaoObra = new javax.swing.JLabel();
        lblendereco = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        tfVeiculo = new javax.swing.JTextField();
        tfPrestadora = new javax.swing.JTextField();
        lbNome1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lblCnpj = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jcTodos = new javax.swing.JComboBox<>();
        tfMaoObra = new javax.swing.JTextField();
        tfNomepeca = new javax.swing.JTextField();
        lblValorPeca = new javax.swing.JLabel();
        tfValorPeca = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        tfValorTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txDescricao = new javax.swing.JTextArea();
        lblPlaca1 = new javax.swing.JLabel();
        tfNome_servico = new javax.swing.JTextField();
        jcVeiculo = new javax.swing.JRadioButton();
        jcPrestadora = new javax.swing.JRadioButton();
        jcTipoServiço = new javax.swing.JRadioButton();
        jcrTodos = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(24, 84, 205));
        setClosable(true);
        setTitle("Registro de manutenções");
        setMaximumSize(new java.awt.Dimension(1005, 530));
        setMinimumSize(new java.awt.Dimension(1005, 530));
        setPreferredSize(new java.awt.Dimension(1005, 530));
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
        jPanel1.setMaximumSize(new java.awt.Dimension(1005, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(1005, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(1005, 530));

        jScrollPane1.setBackground(new java.awt.Color(24, 84, 205));
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Veículo", "Placa", "Realizado em:", "Tipo de serviço", "Descrição", "Data", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        lblCadastrar.setText("Registro de Manutenções");

        lblVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblVeiculo.setText("Veículo:");

        lblMaoObra.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMaoObra.setForeground(new java.awt.Color(255, 255, 255));
        lblMaoObra.setText("Valor da mão de obra:  R$");

        lblendereco.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblendereco.setForeground(new java.awt.Color(255, 255, 255));
        lblendereco.setText("Realizado em:");

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setText("Tipo de serviço:");

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

        lblCnpj.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCnpj.setForeground(new java.awt.Color(255, 255, 255));
        lblCnpj.setText("Peça substituida:");

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

        tfData.setEditable(false);
        tfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfData.setMinimumSize(new java.awt.Dimension(7, 18));
        tfData.setPreferredSize(new java.awt.Dimension(7, 18));
        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });

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

        tfNomepeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomepecaActionPerformed(evt);
            }
        });

        lblValorPeca.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValorPeca.setForeground(new java.awt.Color(255, 255, 255));
        lblValorPeca.setText("Valor da peça:   R$:");

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblValorTotal.setText("Valor Total:   R$:");

        txDescricao.setEditable(false);
        txDescricao.setColumns(20);
        txDescricao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txDescricao.setRows(5);
        jScrollPane2.setViewportView(txDescricao);

        lblPlaca1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPlaca1.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca1.setText("Descrição:");

        tfNome_servico.setPreferredSize(new java.awt.Dimension(7, 18));
        tfNome_servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNome_servicoActionPerformed(evt);
            }
        });

        jcVeiculo.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcVeiculo);
        jcVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jcVeiculo.setText("Veículo");
        jcVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcVeiculoActionPerformed(evt);
            }
        });

        jcPrestadora.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcPrestadora);
        jcPrestadora.setForeground(new java.awt.Color(255, 255, 255));
        jcPrestadora.setText("Prestadora de serviço");
        jcPrestadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPrestadoraActionPerformed(evt);
            }
        });

        jcTipoServiço.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcTipoServiço);
        jcTipoServiço.setForeground(new java.awt.Color(255, 255, 255));
        jcTipoServiço.setText("Tipo de serviço");
        jcTipoServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoServiçoActionPerformed(evt);
            }
        });

        jcrTodos.setBackground(new java.awt.Color(24, 84, 205));
        GrupoTipo.add(jcrTodos);
        jcrTodos.setForeground(new java.awt.Color(255, 255, 255));
        jcrTodos.setSelected(true);
        jcrTodos.setText("Todos");
        jcrTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcrTodosActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcTipoServiço)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbNome1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblVeiculo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCnpj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNomepeca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblValorPeca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlaca1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblValorTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblPlaca)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(lblData)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblendereco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfPrestadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblMaoObra)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfMaoObra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblCep)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfNome_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))))
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
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcVeiculo)
                    .addComponent(jcPrestadora)
                    .addComponent(jcTipoServiço)
                    .addComponent(jcrTodos))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVeiculo)
                            .addComponent(tfVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblendereco)
                            .addComponent(tfPrestadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCep)
                            .addComponent(tfNome_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaoObra)
                            .addComponent(tfMaoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCnpj)
                            .addComponent(tfNomepeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorPeca)
                            .addComponent(tfValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorTotal)
                            .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPlaca1)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
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
        int row = jTable1.getSelectedRow();
        String codigoTable = jTable1.getValueAt(row, 0).toString();
        try {
            this.MostraDadosServicos(codigoTable);
        } catch (SQLException ex) {
            Logger.getLogger(ViewRegistroManutencoes.class.getName()).log(Level.SEVERE, null, ex);
        }

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
                controllerServico.deleteServico(this.deletar());
                this.carregaTableServicos(this.queryTodas);
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

    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataActionPerformed

    private void jcTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTodosActionPerformed

        String selecao = jcTodos.getSelectedItem().toString();
        String queryFiltro;
       if(jcrTodos.isSelected()){
           jcTodos.setEnabled(false);
           jcTodos.setSelectedIndex(0);
                queryFiltro = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_total "
                        + " FROM servicos"
                        + " JOIN veiculo"
                        + " ON fk_veiculo = pk_veiculo"
                        + " JOIN prestadora"
                        + " on fk_prestadora = pk_prestadora  order by nome ASC;";
                this.carregaTableServicos(queryFiltro);
       }else if(jcVeiculo.isSelected()){
                queryFiltro = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_total "
            + " FROM servicos"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora WHERE placa ='"+selecao+"';";
                this.carregaTableServicos(queryFiltro);
       }else if(jcPrestadora.isSelected()){
                queryFiltro = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_total "
            + " FROM servicos"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora WHERE nome ='"+selecao+"';";
                this.carregaTableServicos(queryFiltro);
           
       }else{
           queryFiltro = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_total "
            + " FROM servicos"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora WHERE nome_servico ='"+selecao+"';";
                this.carregaTableServicos(queryFiltro);
       }
        LimpaCampos();
    }//GEN-LAST:event_jcTodosActionPerformed

    private void tfNomepecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomepecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomepecaActionPerformed

    private void tfNome_servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNome_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNome_servicoActionPerformed

    private void jcVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcVeiculoActionPerformed
          jcTodos.setEnabled(true);
          
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
        String query = "SELECT placa FROM veiculo;";

        try {
            ps = conexao.conectar.prepareStatement(query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();
            while (rs.next()) {
                String pega = rs.getString("placa");
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
        String query = "SELECT nome FROM prestadora;";

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

    private void jcTipoServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoServiçoActionPerformed
         jcTodos.setEnabled(true);
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
 strList.add("Substituição de peça"); 
 strList.add("Restauração de peça");
 strList.add("Revisão de rotina");
 strList.add("Troca de pneu");
 strList.add("Rodizio de pneu");
 strList.add("Conserto de pneu");
 strList.add("Recapagem de pneu");
 strList.add("Troca de óleo (Sem filtro)");
 strList.add("Troca de óleo e filtro");
 strList.add("Outros"); 
 DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
  jcTodos.setModel(defaultComboBox);
      
    }//GEN-LAST:event_jcTipoServiçoActionPerformed

    private void jcrTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrTodosActionPerformed
      
         jcTodos.setEnabled(false);
           jcTodos.setSelectedIndex(0);
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Selecionar");
       String queryTodas = "SELECT pk_servico, modelo, placa, nome, nome_servico, descricao, data, valor_total "
            + " FROM servicos"
            + " JOIN veiculo"
            + " ON fk_veiculo = pk_veiculo"
            + " JOIN prestadora"
            + " on fk_prestadora = pk_prestadora  order by data ASC;";
           this.carregaTableServicos(queryTodas);
    
    }//GEN-LAST:event_jcrTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jcPrestadora;
    private javax.swing.JRadioButton jcTipoServiço;
    private javax.swing.JComboBox<String> jcTodos;
    private javax.swing.JRadioButton jcVeiculo;
    private javax.swing.JRadioButton jcrTodos;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMaoObra;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPlaca1;
    private javax.swing.JLabel lblValorPeca;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfMaoObra;
    private javax.swing.JTextField tfNome_servico;
    private javax.swing.JTextField tfNomepeca;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPrestadora;
    private javax.swing.JTextField tfValorPeca;
    private javax.swing.JTextField tfValorTotal;
    private javax.swing.JTextField tfVeiculo;
    private javax.swing.JTextArea txDescricao;
    // End of variables declaration//GEN-END:variables
}
