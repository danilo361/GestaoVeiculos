package View;

import Conexao.Conexao;
import Conexao.Sessao;
import Controllers.ControllerPneu;
import Model.Pneu;
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
public class ViewPneu extends javax.swing.JInternalFrame {
     Pneu pneu;
     ControllerPneu pneuTemp = new ControllerPneu();
     Conexao conexao = new Conexao();
    private PreparedStatement ps = null; 
    private ResultSet rs = null;
  
    String teste;
   
     

    public ViewPneu() {
        initComponents();
        conexao.Conectar();
        this.carregaTablePneusTodos();

    }

    
    public void carregaTablePneusDisponiveis() {
      
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

      modelo.setNumRows(0);
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
          jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
      String query = "SELECT * FROM pneu where fk_status = 1 order by modelo ASC;";
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
     public void carregaTablePneusIndisponiveis() {
      
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

       
        modelo.setNumRows(0);
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
          jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
      String query = "SELECT * FROM pneu where fk_status = 2 order by modelo ASC;";
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
      public void carregaTablePneusTodos() {
      
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
          jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
      String query = "SELECT * FROM pneu  order by modelo ASC;";
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
        public void carregaTablePneusVeiculo(String sql) {
      
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setNumRows(0);
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
          jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
      String query =sql;
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

    

    public void MostraDadosPneus(Pneu pneu) {
        if (pneu != null) {
            //   tfCodigo.setText(usuario.getPk_usuario());
            tfMarca.setText(pneu.getModelo());
            
        }
    }
 public Pneu RecolheDadosPneu() {
        Pneu pneu = new Pneu();
            pneu.setPk_pneu(tfCodigo.getText());
            pneu.setModelo(tfMarca.getText());
            pneu.setDimensoes(tfDimensoes.getText());
            pneu.setDot(tfDot.getText());
            pneu.setData_compra(tfData.getText());
            pneu.setIndice_carga(tfCarga.getText());
            pneu.setN_fogo(tfNFogo.getText());
            
           
        
        return pneu;
    }
  public void LimpaCampos() {
        tfCodigo.setText("");
        tfNFogo.setText("");
        tfMarca.setText("");
        tfData.setText("");
        tfCarga.setText("");
        tfDot.setText("");
        tfDimensoes.setText("");
      
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
        lbModelo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblLicenciamento = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfCarga = new javax.swing.JTextField();
        tfNFogo = new javax.swing.JTextField();
        tfData = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        lbNome1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        tfDot = new javax.swing.JTextField();
        lblQTDEixos = new javax.swing.JLabel();
        tfDimensoes = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tfautomovel = new javax.swing.JToggleButton();
        tfmotocicleta = new javax.swing.JToggleButton();
        tfcaminhao = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(24, 84, 205));
        setClosable(true);
        setTitle("Pneus");
        setMaximumSize(new java.awt.Dimension(915, 430));
        setMinimumSize(new java.awt.Dimension(915, 430));
        setPreferredSize(new java.awt.Dimension(915, 430));
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
        jPanel1.setPreferredSize(new java.awt.Dimension(915, 430));

        jScrollPane1.setBackground(new java.awt.Color(24, 84, 205));
        jScrollPane1.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "Dimensões", "Data da compra", "DOT", "N° de fogo", "Indice carga"
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

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Pneus");

        lbModelo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbModelo.setForeground(new java.awt.Color(255, 255, 255));
        lbModelo.setText("Modelo");

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Indice de carga:");

        lblAno.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAno.setForeground(new java.awt.Color(255, 255, 255));
        lblAno.setText("N° de fogo:");

        lblLicenciamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblLicenciamento.setForeground(new java.awt.Color(255, 255, 255));
        lblLicenciamento.setText("Data da compra:");

        tfMarca.setEditable(false);
        tfMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfMarca.setMinimumSize(new java.awt.Dimension(7, 18));
        tfMarca.setPreferredSize(new java.awt.Dimension(7, 18));

        tfCarga.setEditable(false);
        tfCarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfCarga.setMaximumSize(new java.awt.Dimension(41, 18));
        tfCarga.setMinimumSize(new java.awt.Dimension(41, 18));
        tfCarga.setPreferredSize(new java.awt.Dimension(41, 18));

        tfNFogo.setEditable(false);
        tfNFogo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNFogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfNFogo.setMinimumSize(new java.awt.Dimension(7, 18));
        tfNFogo.setPreferredSize(new java.awt.Dimension(7, 18));
        tfNFogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNFogoActionPerformed(evt);
            }
        });

        tfData.setEditable(false);
        tfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfData.setMinimumSize(new java.awt.Dimension(7, 18));
        tfData.setPreferredSize(new java.awt.Dimension(7, 18));

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

        tfDot.setEditable(false);
        tfDot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfDot.setMinimumSize(new java.awt.Dimension(7, 18));
        tfDot.setPreferredSize(new java.awt.Dimension(7, 18));

        lblQTDEixos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblQTDEixos.setForeground(new java.awt.Color(255, 255, 255));
        lblQTDEixos.setText("DOT:");

        tfDimensoes.setEditable(false);
        tfDimensoes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDimensoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfDimensoes.setMinimumSize(new java.awt.Dimension(7, 18));
        tfDimensoes.setPreferredSize(new java.awt.Dimension(7, 18));
        tfDimensoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDimensoesActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Dimensões:");

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Todos");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setPreferredSize(new java.awt.Dimension(61, 20));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Disponíveis");
        jToggleButton2.setFocusable(false);
        jToggleButton2.setPreferredSize(new java.awt.Dimension(85, 20));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Em uso");
        jToggleButton3.setFocusable(false);
        jToggleButton3.setPreferredSize(new java.awt.Dimension(67, 20));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar:");

        buttonGroup1.add(tfautomovel);
        tfautomovel.setText("Automóvel");
        tfautomovel.setFocusable(false);
        tfautomovel.setPreferredSize(new java.awt.Dimension(67, 20));
        tfautomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfautomovelActionPerformed(evt);
            }
        });

        buttonGroup1.add(tfmotocicleta);
        tfmotocicleta.setText("Motocicleta");
        tfmotocicleta.setFocusable(false);
        tfmotocicleta.setPreferredSize(new java.awt.Dimension(67, 20));
        tfmotocicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmotocicletaActionPerformed(evt);
            }
        });

        buttonGroup1.add(tfcaminhao);
        tfcaminhao.setText("Caminhão");
        tfcaminhao.setFocusable(false);
        tfcaminhao.setPreferredSize(new java.awt.Dimension(67, 20));
        tfcaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcaminhaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNFogo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNome1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLicenciamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblQTDEixos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDot, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfautomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tfmotocicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tfcaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblCadastrar)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfautomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfmotocicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModelo)
                            .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(tfDimensoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca)
                            .addComponent(tfCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(tfNFogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicenciamento)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQTDEixos)
                            .addComponent(tfDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
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
        tfMarca.setText(jTable1.getValueAt(row, 1).toString());
        tfCarga.setText(jTable1.getValueAt(row, 6).toString());
        tfNFogo.setText(jTable1.getValueAt(row, 5).toString());
        tfData.setText(jTable1.getValueAt(row, 3).toString());
        tfDot.setText(jTable1.getValueAt(row, 4).toString());
        tfDimensoes.setText(jTable1.getValueAt(row, 2).toString());
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.teste = "true";

        
        if(tfCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Pneu!");
            return;
        }
        if(this.teste.equals("true")){
               Object[] options = {"Sim", "Não"};
                int i=JOptionPane.showOptionDialog(null,"Você deseja excuir este pneu?","Excluir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (i==JOptionPane.YES_OPTION){
            pneuTemp.deletePneu(this.RecolheDadosPneu());
              this.carregaTablePneusTodos();
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                }
        }else{
             JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
       
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        
        this.teste = "true";

        
        if(tfCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Pneu!");
            return;
        }
        if(this.teste.equals("true")){
            if(btnAtualizar.getText().equals("Editar")){
                tfMarca.setEditable(true);
                tfNFogo.setEditable(true);
                tfCarga.setEditable(true);
                tfData.setEditable(true);
                tfDot.setEditable(true);
                tfDimensoes.setEditable(true);
                btnAtualizar.setText("Atualizar");
            } else{
                Object[] options = {"Sim", "Não"};
                int i=JOptionPane.showOptionDialog(null,"Confirmar as alterações","Atualizar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                if (i==JOptionPane.YES_OPTION){
                    
                    pneuTemp.updatePneu(this.RecolheDadosPneu());
                    this.carregaTablePneusTodos();
                    
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                    tfMarca.setEditable(false);
                    tfNFogo.setEditable(false);
                    tfCarga.setEditable(false);
                    tfData.setEditable(false);
                    tfDot.setEditable(false);
                      tfDimensoes.setEditable(false);
                    btnAtualizar.setText("Editar");
                    this.LimpaCampos();
                }else{
                    tfMarca.setEditable(false);
                    tfNFogo.setEditable(false);
                    tfCarga.setEditable(false);
                    tfData.setEditable(false);
                      tfDot.setEditable(false);
                      tfDimensoes.setEditable(false);
                    btnAtualizar.setText("Editar");
                }
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "                     Você não é um administrador!\nVocê não tem autorização para realizar esta operação!");
        }
        
      
       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tfNFogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNFogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNFogoActionPerformed

    private void tfDimensoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDimensoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDimensoesActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        carregaTablePneusTodos();
         this.LimpaCampos();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        carregaTablePneusDisponiveis();
         this.LimpaCampos();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        carregaTablePneusIndisponiveis();
         this.LimpaCampos();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void tfautomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfautomovelActionPerformed
       String sql =  "SELECT * FROM pneu where segmento_pneu = 'Automóvel' order by modelo ASC;";
        carregaTablePneusVeiculo(sql);
    }//GEN-LAST:event_tfautomovelActionPerformed

    private void tfmotocicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmotocicletaActionPerformed
       String sql =  "SELECT * FROM pneu where segmento_pneu = 'Motocicleta' order by modelo ASC;";
        carregaTablePneusVeiculo(sql);
    }//GEN-LAST:event_tfmotocicletaActionPerformed

    private void tfcaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcaminhaoActionPerformed
String sql =  "SELECT * FROM pneu where segmento_pneu = 'Caminhão' order by modelo ASC;";
        carregaTablePneusVeiculo(sql);    }//GEN-LAST:event_tfcaminhaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoTipo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblLicenciamento;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQTDEixos;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField tfCarga;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfDimensoes;
    private javax.swing.JTextField tfDot;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNFogo;
    private javax.swing.JToggleButton tfautomovel;
    private javax.swing.JToggleButton tfcaminhao;
    private javax.swing.JToggleButton tfmotocicleta;
    // End of variables declaration//GEN-END:variables
}
