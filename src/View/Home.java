
package View;

import Conexao.Sessao;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class Home extends javax.swing.JFrame {
private PreparedStatement ps, ps2 = null;
    private ResultSet rs = null;
    Sessao logout = new Sessao();
String UsuarioLogado;
    
    
    public Home() {
        initComponents();
       setLocationRelativeTo(null);
        
         
    }
    public void recebeUsuario(String recebe){
        
        MenuLogin.setText(recebe+"        ");
        this.UsuarioLogado = recebe;
      
    }

    public String getUsuarioLogado() {
        return this.UsuarioLogado;
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btUsuario = new javax.swing.JButton();
        btVeiculos = new javax.swing.JButton();
        btPneus = new javax.swing.JButton();
        btManual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEmpresas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        MenuLogin = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        subUsuario = new javax.swing.JMenuItem();
        subVeiculo = new javax.swing.JMenuItem();
        subPneu = new javax.swing.JMenuItem();
        subOficina = new javax.swing.JMenuItem();
        jMenuManutencao = new javax.swing.JMenu();
        subRegistrarManunt = new javax.swing.JMenuItem();
        subCustoManunt = new javax.swing.JMenuItem();
        jMenuMovPneus = new javax.swing.JMenu();
        subMovimentar = new javax.swing.JMenuItem();
        jMenuAbastecimento = new javax.swing.JMenu();
        subRegistraAbast = new javax.swing.JMenuItem();
        subCustoAbast = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        subSobre = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenu();
        subSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DR Gestão de Veículos");
        setBackground(new java.awt.Color(24, 119, 242));
        setFocusable(false);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1230, 650));
        setName("Home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1230, 650));
        setSize(new java.awt.Dimension(1230, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktop.setBackground(new java.awt.Color(24, 119, 242));
        jDesktop.setPreferredSize(new java.awt.Dimension(1230, 650));

        Menu.setBackground(new java.awt.Color(24, 119, 242));
        Menu.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/menu.png"))); // NOI18N
        jLabel3.setText(" Menu   ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btUsuario.setBackground(new java.awt.Color(24, 119, 242));
        btUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/Usuario.png"))); // NOI18N
        btUsuario.setText("Usuários    ");
        btUsuario.setBorder(null);
        btUsuario.setFocusPainted(false);
        btUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btUsuario.setIconTextGap(10);
        btUsuario.setMargin(new java.awt.Insets(10, 10, 10, 200));
        btUsuario.setRolloverEnabled(false);
        btUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btUsuarioMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btUsuarioMouseMoved(evt);
            }
        });
        btUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btUsuarioMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btUsuarioMouseReleased(evt);
            }
        });
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });

        btVeiculos.setBackground(new java.awt.Color(24, 119, 242));
        btVeiculos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btVeiculos.setForeground(new java.awt.Color(255, 255, 255));
        btVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/CadastroCaminhao.png"))); // NOI18N
        btVeiculos.setText("Veículos     ");
        btVeiculos.setBorder(null);
        btVeiculos.setFocusPainted(false);
        btVeiculos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btVeiculos.setIconTextGap(10);
        btVeiculos.setMargin(new java.awt.Insets(2, 10, 2, 200));
        btVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVeiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btVeiculosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btVeiculosMouseReleased(evt);
            }
        });
        btVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculosActionPerformed(evt);
            }
        });

        btPneus.setBackground(new java.awt.Color(24, 119, 242));
        btPneus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btPneus.setForeground(new java.awt.Color(255, 255, 255));
        btPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/pneus.png"))); // NOI18N
        btPneus.setText("  Pneus        ");
        btPneus.setBorder(null);
        btPneus.setFocusPainted(false);
        btPneus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btPneus.setIconTextGap(10);
        btPneus.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btPneus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPneusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPneusMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btPneusMouseReleased(evt);
            }
        });
        btPneus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPneusActionPerformed(evt);
            }
        });

        btManual.setBackground(new java.awt.Color(24, 119, 242));
        btManual.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btManual.setForeground(new java.awt.Color(255, 255, 255));
        btManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/help.png"))); // NOI18N
        btManual.setText("  Manual       ");
        btManual.setBorder(null);
        btManual.setFocusPainted(false);
        btManual.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btManual.setIconTextGap(7);
        btManual.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btManualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btManualMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btManualMouseReleased(evt);
            }
        });
        btManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManualActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/logo.png"))); // NOI18N

        btEmpresas.setBackground(new java.awt.Color(24, 119, 242));
        btEmpresas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        btEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/Empresas.png"))); // NOI18N
        btEmpresas.setText("Empresas   ");
        btEmpresas.setBorder(null);
        btEmpresas.setFocusPainted(false);
        btEmpresas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEmpresas.setIconTextGap(10);
        btEmpresas.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEmpresasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEmpresasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btEmpresasMouseReleased(evt);
            }
        });
        btEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btPneus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(btEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPneus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btManual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btUsuario.getAccessibleContext().setAccessibleName("jButton");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setBackground(new java.awt.Color(24, 119, 242));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/DR22.png"))); // NOI18N

        jDesktop.setLayer(Menu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenuBar.setForeground(new java.awt.Color(0, 174, 254));
        jMenuBar.setPreferredSize(new java.awt.Dimension(64, 50));

        MenuLogin.setBackground(new java.awt.Color(255, 255, 255));
        MenuLogin.setBorder(null);
        MenuLogin.setForeground(new java.awt.Color(0, 174, 254));
        MenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/LogUsuario.png"))); // NOI18N
        MenuLogin.setText("  ");
        MenuLogin.setEnabled(false);
        MenuLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuLogin.setMargin(new java.awt.Insets(2, 10, 2, 2));
        MenuLogin.setPreferredSize(new java.awt.Dimension(240, 32));
        MenuLogin.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                MenuLoginMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        MenuLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuLoginMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuLoginMouseReleased(evt);
            }
        });
        MenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLoginActionPerformed(evt);
            }
        });
        MenuLogin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                MenuLoginPropertyChange(evt);
            }
        });
        jMenuBar.add(MenuLogin);

        jMenuCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jMenuCadastro.setForeground(new java.awt.Color(24, 119, 242));
        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/Cadastro1.png"))); // NOI18N
        jMenuCadastro.setText("Cadastro              ");
        jMenuCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuCadastro.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuCadastroMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuCadastroMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuCadastroMouseReleased(evt);
            }
        });
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });
        jMenuCadastro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuCadastroPropertyChange(evt);
            }
        });

        subUsuario.setBackground(new java.awt.Color(255, 255, 255));
        subUsuario.setForeground(new java.awt.Color(0, 174, 254));
        subUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/novo-usuario.png"))); // NOI18N
        subUsuario.setText("Usuário");
        subUsuario.setIconTextGap(2);
        subUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(subUsuario);

        subVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        subVeiculo.setForeground(new java.awt.Color(0, 174, 254));
        subVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/cadCaminha.png"))); // NOI18N
        subVeiculo.setText("Veículo");
        subVeiculo.setToolTipText("");
        subVeiculo.setIconTextGap(2);
        subVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(subVeiculo);

        subPneu.setBackground(new java.awt.Color(255, 255, 255));
        subPneu.setForeground(new java.awt.Color(0, 174, 254));
        subPneu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/Pneu.png"))); // NOI18N
        subPneu.setText(" Pneu");
        subPneu.setIconTextGap(2);
        subPneu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subPneuActionPerformed(evt);
            }
        });
        jMenuCadastro.add(subPneu);

        subOficina.setBackground(new java.awt.Color(255, 255, 255));
        subOficina.setForeground(new java.awt.Color(0, 174, 254));
        subOficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/oficina.png"))); // NOI18N
        subOficina.setText("Prestador/Serviços");
        subOficina.setActionCommand("");
        subOficina.setHideActionText(true);
        subOficina.setIconTextGap(2);
        subOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOficinaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(subOficina);
        subOficina.getAccessibleContext().setAccessibleDescription("Prestador/Serviço");

        jMenuBar.add(jMenuCadastro);

        jMenuManutencao.setBackground(new java.awt.Color(255, 255, 255));
        jMenuManutencao.setBorder(null);
        jMenuManutencao.setForeground(new java.awt.Color(24, 119, 242));
        jMenuManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/manutencao.png"))); // NOI18N
        jMenuManutencao.setText("Manutenções Gerais            ");
        jMenuManutencao.setActionCommand("Manutenções Gerais     ");
        jMenuManutencao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuManutencao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuManutencao.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jMenuManutencao.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuManutencaoMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuManutencaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuManutencaoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuManutencaoMouseReleased(evt);
            }
        });
        jMenuManutencao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuManutencaoPropertyChange(evt);
            }
        });

        subRegistrarManunt.setBackground(new java.awt.Color(255, 255, 255));
        subRegistrarManunt.setForeground(new java.awt.Color(0, 174, 254));
        subRegistrarManunt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/RegistraManutencao.png"))); // NOI18N
        subRegistrarManunt.setText("Registrar");
        subRegistrarManunt.setIconTextGap(3);
        subRegistrarManunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistrarManuntActionPerformed(evt);
            }
        });
        jMenuManutencao.add(subRegistrarManunt);

        subCustoManunt.setBackground(new java.awt.Color(255, 255, 255));
        subCustoManunt.setForeground(new java.awt.Color(0, 174, 254));
        subCustoManunt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/custo.png"))); // NOI18N
        subCustoManunt.setText("Custos");
        subCustoManunt.setIconTextGap(3);
        subCustoManunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCustoManuntActionPerformed(evt);
            }
        });
        jMenuManutencao.add(subCustoManunt);

        jMenuBar.add(jMenuManutencao);

        jMenuMovPneus.setBackground(new java.awt.Color(255, 255, 255));
        jMenuMovPneus.setBorder(null);
        jMenuMovPneus.setForeground(new java.awt.Color(24, 119, 242));
        jMenuMovPneus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/movPneus.png"))); // NOI18N
        jMenuMovPneus.setText("Movimentações Pneus              ");
        jMenuMovPneus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuMovPneus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuMovPneus.setIconTextGap(8);
        jMenuMovPneus.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jMenuMovPneus.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuMovPneusMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuMovPneus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMovPneusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuMovPneusMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuMovPneusMouseReleased(evt);
            }
        });
        jMenuMovPneus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuMovPneusPropertyChange(evt);
            }
        });

        subMovimentar.setBackground(new java.awt.Color(255, 255, 255));
        subMovimentar.setForeground(new java.awt.Color(0, 174, 254));
        subMovimentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/subMovPneus.png"))); // NOI18N
        subMovimentar.setText("Movimentar");
        subMovimentar.setIconTextGap(5);
        subMovimentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMovimentarActionPerformed(evt);
            }
        });
        jMenuMovPneus.add(subMovimentar);

        jMenuBar.add(jMenuMovPneus);
        jMenuMovPneus.getAccessibleContext().setAccessibleName("Movimentações Pneus");

        jMenuAbastecimento.setBackground(new java.awt.Color(255, 255, 255));
        jMenuAbastecimento.setBorder(null);
        jMenuAbastecimento.setForeground(new java.awt.Color(24, 119, 242));
        jMenuAbastecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/Abastecimento.png"))); // NOI18N
        jMenuAbastecimento.setText("Abastecimento             ");
        jMenuAbastecimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuAbastecimento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuAbastecimento.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jMenuAbastecimento.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuAbastecimentoMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuAbastecimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAbastecimentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuAbastecimentoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuAbastecimentoMouseReleased(evt);
            }
        });
        jMenuAbastecimento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuAbastecimentoPropertyChange(evt);
            }
        });

        subRegistraAbast.setBackground(new java.awt.Color(255, 255, 255));
        subRegistraAbast.setForeground(new java.awt.Color(0, 174, 254));
        subRegistraAbast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/RegistraCombustive.png"))); // NOI18N
        subRegistraAbast.setText("Registrar");
        subRegistraAbast.setIconTextGap(3);
        subRegistraAbast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistraAbastActionPerformed(evt);
            }
        });
        jMenuAbastecimento.add(subRegistraAbast);

        subCustoAbast.setBackground(new java.awt.Color(255, 255, 255));
        subCustoAbast.setForeground(new java.awt.Color(0, 174, 254));
        subCustoAbast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/custo.png"))); // NOI18N
        subCustoAbast.setText("Custos");
        subCustoAbast.setIconTextGap(3);
        subCustoAbast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCustoAbastActionPerformed(evt);
            }
        });
        jMenuAbastecimento.add(subCustoAbast);

        jMenuBar.add(jMenuAbastecimento);

        jMenuSobre.setBackground(new java.awt.Color(255, 255, 255));
        jMenuSobre.setBorder(null);
        jMenuSobre.setForeground(new java.awt.Color(24, 119, 242));
        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/sobre.png"))); // NOI18N
        jMenuSobre.setText("Sobre                  ");
        jMenuSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSobre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuSobre.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jMenuSobre.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuSobreMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseReleased(evt);
            }
        });
        jMenuSobre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuSobrePropertyChange(evt);
            }
        });

        subSobre.setBackground(new java.awt.Color(255, 255, 255));
        subSobre.setForeground(new java.awt.Color(0, 174, 254));
        subSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/SobreNos.png"))); // NOI18N
        subSobre.setText("Sobre o software");
        subSobre.setIconTextGap(3);
        subSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subSobreActionPerformed(evt);
            }
        });
        jMenuSobre.add(subSobre);

        jMenuBar.add(jMenuSobre);

        jMenuLogout.setBackground(new java.awt.Color(255, 255, 255));
        jMenuLogout.setBorder(null);
        jMenuLogout.setForeground(new java.awt.Color(0, 174, 254));
        jMenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/check-out.png"))); // NOI18N
        jMenuLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuLogout.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jMenuLogout.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuLogoutMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseReleased(evt);
            }
        });
        jMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogoutActionPerformed(evt);
            }
        });
        jMenuLogout.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMenuLogoutPropertyChange(evt);
            }
        });

        subSair.setBackground(new java.awt.Color(255, 255, 255));
        subSair.setForeground(new java.awt.Color(0, 174, 254));
        subSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons_menus/exit.png"))); // NOI18N
        subSair.setText("Sair");
        subSair.setIconTextGap(3);
        subSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        subSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subSairActionPerformed(evt);
            }
        });
        jMenuLogout.add(subSair);

        jMenuBar.add(jMenuLogout);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Home");
        getAccessibleContext().setAccessibleParent(jMenuLogout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
      
      
        
    }//GEN-LAST:event_formWindowOpened

    private void btPneusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPneusActionPerformed
                ViewPneu cad = new ViewPneu();
          jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
        
    }//GEN-LAST:event_btPneusActionPerformed

    private void btPneusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPneusMouseReleased
       
    }//GEN-LAST:event_btPneusMouseReleased

    private void btPneusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPneusMouseExited
         Color mycolor = new Color(24,119,242);
        btPneus.setBackground(mycolor);
    }//GEN-LAST:event_btPneusMouseExited

    private void btPneusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPneusMouseEntered
        Color mycolor = new Color(24,147,247);
        btPneus.setBackground(mycolor);
    }//GEN-LAST:event_btPneusMouseEntered

    private void btVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculosActionPerformed
         ViewVeiculos cad = new ViewVeiculos();
          jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
       
    }//GEN-LAST:event_btVeiculosActionPerformed

    private void btVeiculosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVeiculosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btVeiculosMouseReleased

    private void btVeiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVeiculosMouseExited
         Color mycolor = new Color(24,119,242);
        btVeiculos.setBackground(mycolor);
    }//GEN-LAST:event_btVeiculosMouseExited

    private void btVeiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVeiculosMouseEntered
                                    
        Color mycolor = new Color(24,147,247);
        btVeiculos.setBackground(mycolor);
    }//GEN-LAST:event_btVeiculosMouseEntered

    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
          ViewUsuarios cad = new ViewUsuarios();
          jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
        
       
                
    }//GEN-LAST:event_btUsuarioActionPerformed

    private void btUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseReleased

    }//GEN-LAST:event_btUsuarioMouseReleased

    private void btUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseExited

        Color mycolor = new Color(24,119,242);
        btUsuario.setBackground(mycolor);
    }//GEN-LAST:event_btUsuarioMouseExited

    private void btUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseEntered
        Color mycolor = new Color(24,147,247);
        btUsuario.setBackground(mycolor);
    }//GEN-LAST:event_btUsuarioMouseEntered

    private void btUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseMoved

    }//GEN-LAST:event_btUsuarioMouseMoved

    private void btUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUsuarioMouseDragged
              
        
    }//GEN-LAST:event_btUsuarioMouseDragged

    private void MenuLoginMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_MenuLoginMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuLoginMenuDragMouseEntered

    private void MenuLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuLoginMouseClicked

    private void MenuLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLoginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuLoginMouseEntered

    private void MenuLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLoginMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuLoginMouseReleased

    private void MenuLoginPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_MenuLoginPropertyChange
      
    }//GEN-LAST:event_MenuLoginPropertyChange

    private void subUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuarioActionPerformed
         CadastrarUsuario cad = new CadastrarUsuario();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subUsuarioActionPerformed

   

    private void jMenuCadastroMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuCadastroMenuDragMouseEntered
        
    }//GEN-LAST:event_jMenuCadastroMenuDragMouseEntered

    private void jMenuCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroMouseClicked

    private void jMenuCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastroMouseEntered
jMenuCadastro.setBackground(Color.red);       
    }//GEN-LAST:event_jMenuCadastroMouseEntered

    private void jMenuCadastroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastroMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroMouseReleased

    private void jMenuCadastroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuCadastroPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroPropertyChange

    private void jMenuManutencaoMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuManutencaoMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuManutencaoMenuDragMouseEntered

    private void jMenuManutencaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuManutencaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuManutencaoMouseClicked

    private void jMenuManutencaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuManutencaoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuManutencaoMouseEntered

    private void jMenuManutencaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuManutencaoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuManutencaoMouseReleased

    private void jMenuManutencaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuManutencaoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuManutencaoPropertyChange

    private void jMenuMovPneusMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuMovPneusMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMovPneusMenuDragMouseEntered

    private void jMenuMovPneusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMovPneusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMovPneusMouseClicked

    private void jMenuMovPneusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMovPneusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMovPneusMouseEntered

    private void jMenuMovPneusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMovPneusMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMovPneusMouseReleased

    private void jMenuMovPneusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuMovPneusPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMovPneusPropertyChange

    private void jMenuAbastecimentoMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuAbastecimentoMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbastecimentoMenuDragMouseEntered

    private void jMenuAbastecimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAbastecimentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbastecimentoMouseClicked

    private void jMenuAbastecimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAbastecimentoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbastecimentoMouseEntered

    private void jMenuAbastecimentoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAbastecimentoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbastecimentoMouseReleased

    private void jMenuAbastecimentoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuAbastecimentoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbastecimentoPropertyChange

    private void jMenuSobreMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuSobreMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreMenuDragMouseEntered

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreMouseClicked

    private void jMenuSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreMouseEntered

    private void jMenuSobreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreMouseReleased

    private void jMenuSobrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuSobrePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobrePropertyChange

    private void jMenuLogoutMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMenuDragMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLogoutMenuDragMouseEntered

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
      
    }//GEN-LAST:event_jMenuLogoutMouseClicked

    private void jMenuLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLogoutMouseEntered

    private void jMenuLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLogoutMouseReleased

    private void jMenuLogoutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMenuLogoutPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLogoutPropertyChange

    private void MenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLoginActionPerformed
         
    }//GEN-LAST:event_MenuLoginActionPerformed

    private void subVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subVeiculoActionPerformed
        CadastrarVeiculo cad = new CadastrarVeiculo();
        jDesktop.add(cad);
       cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subVeiculoActionPerformed

    private void subPneuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subPneuActionPerformed
        CadastrarPneu cad = new CadastrarPneu();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subPneuActionPerformed

    private void jMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogoutActionPerformed
         
               
    }//GEN-LAST:event_jMenuLogoutActionPerformed

    private void subRegistrarManuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistrarManuntActionPerformed
         RegistraManutencao cad = new RegistraManutencao();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subRegistrarManuntActionPerformed

    private void subMovimentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMovimentarActionPerformed
         MovimentarPneus cad = new MovimentarPneus();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subMovimentarActionPerformed

    private void subCustoManuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCustoManuntActionPerformed
        ViewRegistroManutencoes cad = new ViewRegistroManutencoes();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subCustoManuntActionPerformed

    private void subCustoAbastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCustoAbastActionPerformed
                                            
        ViewRegistroAbastecimento cad = new ViewRegistroAbastecimento();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subCustoAbastActionPerformed

    private void subRegistraAbastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistraAbastActionPerformed
         RegistrarAbastecimento cad = new RegistrarAbastecimento();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subRegistraAbastActionPerformed

    private void subSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subSobreActionPerformed
       ViewSobre cad = new ViewSobre();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subSobreActionPerformed

    private void subSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subSairActionPerformed
   try {
        logout.logout();
    } catch (SQLException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.dispose();
           Login login = new Login();
             login.setVisible(true);
    }//GEN-LAST:event_subSairActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void subOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOficinaActionPerformed
          CadastroPrestadora_Servico cad = new CadastroPrestadora_Servico();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_subOficinaActionPerformed

    private void btManualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btManualMouseEntered
        Color mycolor = new Color(24,147,247);
        btManual.setBackground(mycolor);
    }//GEN-LAST:event_btManualMouseEntered

    private void btManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btManualMouseExited
       Color mycolor = new Color(24,119,242);
        btManual.setBackground(mycolor);
    }//GEN-LAST:event_btManualMouseExited

    private void btManualMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btManualMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btManualMouseReleased

    private void btManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManualActionPerformed
         ViewManual cad = new ViewManual();
        jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_btManualActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            try {
        logout.logout();
    } catch (SQLException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowClosing

    private void btEmpresasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmpresasMouseEntered
                                          
        Color mycolor = new Color(24,147,247);
        btEmpresas.setBackground(mycolor);
    }//GEN-LAST:event_btEmpresasMouseEntered

    private void btEmpresasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmpresasMouseExited
        Color mycolor = new Color(24,119,242);
        btEmpresas.setBackground(mycolor);
    }//GEN-LAST:event_btEmpresasMouseExited

    private void btEmpresasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEmpresasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btEmpresasMouseReleased

    private void btEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpresasActionPerformed
         ViewEmpresas cad = new ViewEmpresas();
          jDesktop.add(cad);
        cad.setPosicao();
        cad.setVisible(true);
    }//GEN-LAST:event_btEmpresasActionPerformed
    
   
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JMenu MenuLogin;
    private javax.swing.JButton btEmpresas;
    private javax.swing.JButton btManual;
    private javax.swing.JButton btPneus;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton btVeiculos;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenuAbastecimento;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JMenu jMenuManutencao;
    private javax.swing.JMenu jMenuMovPneus;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem subCustoAbast;
    private javax.swing.JMenuItem subCustoManunt;
    private javax.swing.JMenuItem subMovimentar;
    private javax.swing.JMenuItem subOficina;
    private javax.swing.JMenuItem subPneu;
    private javax.swing.JMenuItem subRegistraAbast;
    private javax.swing.JMenuItem subRegistrarManunt;
    private javax.swing.JMenuItem subSair;
    private javax.swing.JMenuItem subSobre;
    private javax.swing.JMenuItem subUsuario;
    private javax.swing.JMenuItem subVeiculo;
    // End of variables declaration//GEN-END:variables
}
