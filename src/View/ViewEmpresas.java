package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerInputNumber;
import Controllers.ControllerInputText;
import Controllers.ControllerPServico;
import Model.PrestadorServico;
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
public class ViewEmpresas extends javax.swing.JInternalFrame {

    private String teste;
    PrestadorServico prestador;
    ControllerPServico controllerServico = new ControllerPServico();
    Conexao conexao = new Conexao();
  
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String queryTodas = "SELECT * FROM prestadora  order by nome ASC;";

    public ViewEmpresas() {
        initComponents();
        tfNumero.setDocument(new ControllerInputNumber());
       
        tfFone.setDocument(new ControllerInputNumber());
        tfCep.setDocument(new ControllerInputNumber());
        tfNome.setDocument(new ControllerInputText());
        tfEndereco.setDocument(new ControllerInputText());

        conexao.Conectar();
        this.carregaTableEmpresas(this.queryTodas);

    }

  

    public void carregaTableEmpresas(String consulta) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(140);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(32);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);

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

    public void MostraDadosPrestadoras() {

        int row = jTable1.getSelectedRow();
        tfCodigo.setText(jTable1.getValueAt(row, 0).toString());
        tfNome.setText(jTable1.getValueAt(row, 1).toString());
        jcSegmento.setSelectedItem(jTable1.getValueAt(row, 6).toString());
        tfEndereco.setText(jTable1.getValueAt(row, 4).toString());
        tfCep.setText(jTable1.getValueAt(row, 3).toString());
        tfCnpj.setText(jTable1.getValueAt(row, 7).toString());
        tfFone.setText(jTable1.getValueAt(row, 2).toString());
        tfNumero.setText(jTable1.getValueAt(row, 5).toString());
    }

    public PrestadorServico RecolheDadosPrestador() {
        PrestadorServico prestador = new PrestadorServico();
        prestador.setPk_prestadora(tfCodigo.getText());
        prestador.setNome(tfNome.getText());
        prestador.setTelefone(tfFone.getText());
        prestador.setCnpj(tfCnpj.getText());
        prestador.setCep(tfCep.getText());
        prestador.setSegmento(jcSegmento.getSelectedItem().toString());
        prestador.setEndereco(tfEndereco.getText());
        prestador.setNumero(tfNumero.getText());

        return prestador;
    }
public PrestadorServico delete(){
    PrestadorServico servico = new PrestadorServico();
    servico.setPk_prestadora(tfCodigo.getText());
    return servico;
}
    public void LimpaCampos() {
        tfCodigo.setText("");
        tfEndereco.setText("");
        tfNome.setText("");
        tfCep.setText("");
        tfNumero.setText("");
        tfCnpj.setText("");
        tfFone.setText("");
        jcSegmento.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCadastrar = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSegmento = new javax.swing.JLabel();
        lblendereco = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfCep = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        lbNome1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lblCnpj = new javax.swing.JLabel();
        tfFone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        jcSegmento = new javax.swing.JComboBox<>();
        jcSegmentoFiltro = new javax.swing.JComboBox<>();
        tfCnpj = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(24, 84, 205));
        setClosable(true);
        setTitle("Prestadoras de serviços");
        setMaximumSize(new java.awt.Dimension(1005, 430));
        setMinimumSize(new java.awt.Dimension(1005, 430));
        setPreferredSize(new java.awt.Dimension(1005, 430));
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
        jPanel1.setMaximumSize(new java.awt.Dimension(1005, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(1005, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(1005, 430));

        jScrollPane1.setBackground(new java.awt.Color(24, 84, 205));
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Telefone", "Cep", "Endereço", "N°", "Segmento", "Cnpj"
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
        lblCadastrar.setText("Prestadoras de serviços");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblSegmento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblSegmento.setForeground(new java.awt.Color(255, 255, 255));
        lblSegmento.setText("Segmento:");

        lblendereco.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblendereco.setForeground(new java.awt.Color(255, 255, 255));
        lblendereco.setText("Endereço:");

        lblCep.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setText("Cep:");

        tfNome.setEditable(false);
        tfNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNome.setMinimumSize(new java.awt.Dimension(7, 18));
        tfNome.setPreferredSize(new java.awt.Dimension(7, 18));

        tfEndereco.setEditable(false);
        tfEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfEndereco.setMinimumSize(new java.awt.Dimension(7, 18));
        tfEndereco.setPreferredSize(new java.awt.Dimension(7, 18));
        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        tfCep.setEditable(false);
        tfCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfCep.setMinimumSize(new java.awt.Dimension(7, 18));
        tfCep.setPreferredSize(new java.awt.Dimension(7, 18));

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

        lblCnpj.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCnpj.setForeground(new java.awt.Color(255, 255, 255));
        lblCnpj.setText("Cnpj:");

        tfFone.setEditable(false);
        tfFone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfFone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfFone.setMinimumSize(new java.awt.Dimension(7, 18));
        tfFone.setPreferredSize(new java.awt.Dimension(7, 18));
        tfFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFoneActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar:");

        lblTelefone1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblTelefone1.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone1.setText("Número:");

        tfNumero.setEditable(false);
        tfNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNumero.setMinimumSize(new java.awt.Dimension(7, 18));
        tfNumero.setPreferredSize(new java.awt.Dimension(7, 18));
        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });

        jcSegmento.setBackground(new java.awt.Color(24, 84, 205));
        jcSegmento.setForeground(new java.awt.Color(255, 255, 255));
        jcSegmento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Mecânica", "Borracharia", "Posto combustível", "Auto elétrica", "Chapeação" }));
        jcSegmento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcSegmento.setEnabled(false);
        jcSegmento.setPreferredSize(new java.awt.Dimension(114, 22));
        jcSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSegmentoActionPerformed(evt);
            }
        });

        jcSegmentoFiltro.setBackground(new java.awt.Color(24, 84, 205));
        jcSegmentoFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jcSegmentoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Mecânica", "Borracharia", "Posto combustível", "Auto elétrica", "Chapeação", "Auto peças" }));
        jcSegmentoFiltro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238), new java.awt.Color(24, 122, 238)));
        jcSegmentoFiltro.setMinimumSize(new java.awt.Dimension(114, 22));
        jcSegmentoFiltro.setPreferredSize(new java.awt.Dimension(114, 22));
        jcSegmentoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSegmentoFiltroActionPerformed(evt);
            }
        });

        tfCnpj.setEditable(false);
        try {
            tfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcSegmentoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNome1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblTelefone1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblendereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCnpj)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblSegmento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jcSegmento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jcSegmentoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblendereco))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCep)
                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone1)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSegmento)
                            .addComponent(jcSegmento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCnpj)
                            .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened


    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        this.MostraDadosPrestadoras();

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.teste = "true";

        if (tfCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma empresa!");
            return;
        }
        if (this.teste.equals("true")) {
            Object[] options = {"Sim", "Não"};
            int i = JOptionPane.showOptionDialog(null, "Você deseja excuir esta empresa?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (i == JOptionPane.YES_OPTION) {
                controllerServico.deletePrestador(this.delete());
                this.carregaTableEmpresas(this.queryTodas);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        this.teste = "true";

        if (tfCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma empresa!");
            return;
        }
        if (this.teste.equals("true")) {
            if (btnAtualizar.getText().equals("Editar")) {
                tfNome.setEditable(true);
                tfEndereco.setEditable(true);
                tfNumero.setEditable(true);
                tfCep.setEditable(true);
                tfCnpj.setEditable(true);
                tfFone.setEditable(true);
                jcSegmento.setEnabled(true);
                btnAtualizar.setText("Atualizar");
            } else {
                Object[] options = {"Sim", "Não"};
                int i = JOptionPane.showOptionDialog(null, "Confirmar as alterações", "Atualizar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (i == JOptionPane.YES_OPTION) {

                    controllerServico.updatePServico(this.RecolheDadosPrestador());
                    this.carregaTableEmpresas(this.queryTodas);

                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    tfNome.setEditable(false);
                    tfEndereco.setEditable(false);
                    tfNumero.setEditable(false);
                    tfCep.setEditable(false);
                    tfCnpj.setEditable(false);
                    tfFone.setEditable(false);
                    jcSegmento.setEnabled(false);
                    btnAtualizar.setText("Editar");
                    this.LimpaCampos();
                } else {
                    tfNome.setEditable(false);
                    tfEndereco.setEditable(false);
                    tfNumero.setEditable(false);
                    tfCep.setEditable(false);
                    tfCnpj.setEditable(false);
                    tfFone.setEditable(false);
                    jcSegmento.setEnabled(false);
                    btnAtualizar.setText("Editar");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
        }


    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFoneActionPerformed

    private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroActionPerformed

    private void jcSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSegmentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSegmentoActionPerformed

    private void jcSegmentoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSegmentoFiltroActionPerformed

        String selecao = jcSegmentoFiltro.getSelectedItem().toString();
        String queryFiltro;
        switch (selecao) {
            case "Selecionar":
                queryFiltro = "SELECT * FROM prestadora  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;
            case "Mecânica":
                queryFiltro = "SELECT * FROM prestadora where segmento = 'Mecânica'  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;
            case "Borracharia":
                queryFiltro = "SELECT * FROM prestadora where segmento = 'Borracharia'  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;
            case "Posto combustível":
                queryFiltro = "SELECT * FROM prestadora where segmento = 'Posto combustível'  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;
            case "Auto elétrica":
                queryFiltro = "SELECT * FROM prestadora where segmento = 'Auto elétrica'  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;
            case "Chapeação":
                queryFiltro = "SELECT * FROM prestadora where segmento = 'Chapeação'  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;
             case "Auto peças":
                queryFiltro = "SELECT * FROM prestadora where segmento = 'Auto peças'  order by nome ASC;";
                this.carregaTableEmpresas(queryFiltro);
                break;  
                
        }
LimpaCampos();
    }//GEN-LAST:event_jcSegmentoFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcSegmento;
    private javax.swing.JComboBox<String> jcSegmentoFiltro;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSegmento;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JTextField tfCep;
    private javax.swing.JFormattedTextField tfCnpj;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfFone;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
