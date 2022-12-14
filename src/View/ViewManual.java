
package View;

import java.awt.Dimension;




/**
 *
 * @author danil
 */
@SuppressWarnings("serial")
public class ViewManual extends javax.swing.JInternalFrame {


    public ViewManual() {
        initComponents();

       
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2 + 100, (d.height - this.getSize().height) / 2);
    }

   

   


   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblCadastrar = new javax.swing.JLabel();
        lblCadastrar1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 84, 205));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 153, 153)));
        setClosable(true);
        setTitle("Manual");
        setMaximumSize(new java.awt.Dimension(778, 429));
        setMinimumSize(new java.awt.Dimension(778, 429));
        setPreferredSize(new java.awt.Dimension(778, 429));
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

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(24, 84, 205));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("RF.1: Cadastro do usu??rio\nDescri????o: Somente o moderador do sistema poder?? cadastrar outros usu??rios.\nEntrada: Nome e sobrenome do usu??rio, E-mail e senha.\nProcesso: O cadastro ser?? inclu??do no banco de dados.\nSa??da: Mensagem de confirma????o bem-sucedido do cadastro caso tenha sido efetuado com  sucesso, sen??o, mensagem de erro.\n\nRF.2: Modifica????o de Cadastrado de Usu??rio:\nDescri????o: Somente o moderador do sistema poder?? modificar dados de usu??rios.\nEntrada: Campo desejado e o novo dado.\nProcesso: Atualiza????o do banco de dados.\nSa??da: Mensagem de confirma????o bem-sucedido da modifica????o do cadastro caso tenha sido efetuado com sucesso, sen??o, mensagem de erro.\n\nRF.3: Exclus??o do Cadastro de Usu??rio:\nDescri????o: O moderador do sistema poder?? excluir o cadastro dos usu??rios.\nEntrada: Nome de usu??rio.\nProcesso: O sistema verifica se o usu??rio ?? cadastrado e se for o usu??rio ?? exclu??do.\nSa??da:  Mensagem de confirma????o bem-sucedido da exclus??o do cadastro caso tenha sido efetuado com sucesso, sen??o, mensagem de erro.\n\nRF.4: Menu usu??rio:\nDescri????o: Retorna os dados de todos os usu??rios.\nEntrada: Somente haver?? entrada de dados caso o administrador deseje realizar alguma altera????o nos cadastros.\nProcesso: O sistema retorna os dados dos usu??rios individualmente atrav??s de uma sele????o filtrada.\nSa??da: Atrav??s de uma consulta filtrada nos usu??rios, o programa retorna todos os dados dos usu??rios cadastrados, permitindo que \nsomente o administrador possa realizar altera????es caso necess??rio.\n\nRF.5: Inser????o de dados dos ve??culos:\nDescri????o: Os usu??rios cadastrados podem inserir as informa????es necess??rias.\nEntrada: O usu??rio informa o modelo, ano, quantidade de eixos, e ??ltimo licenciamento quitado\nProcesso: O sistema insere todos esses dados no banco de dados.\n\nRF.6: Modifica????o de dados dos ve??culos:\nDescri????o: O usu??rio pode alterar informa????es j?? existentes.\nEntrada: O usu??rio escolhe o campo desejado e insere o novo dado.\nProcesso: O sistema atualiza os dados alterados do ve??culo no banco de dados.\nSa??da: Mensagem de confirma????o bem-sucedido da modifica????o caso tenha sido efetuado com sucesso, sen??o, mensagem de erro.\n\nRF.7: Exclus??o de dados dos ve??culos:\nDescri????o: O usu??rio pode efetuar a exclus??o dos dados.\nEntrada: Marca do ve??culo.\nProcesso: O sistema busca a marca do ve??culo no banco de dados, caso ele encontre ser?? exclu??do.\nSa??da: Mensagem de confirma????o bem-sucedido da exclus??o dos dados caso tenha sido efetuado com sucesso, sen??o, mensagem de erro.\n\nRF.8: Consulta de ve??culos:\nDescri????o: O usu??rio pode buscar um determinado ve??culo de sua escolha atrav??s de um campo espec??fico.\nEntrada: Campo ve??culo, o usu??rio realiza a busca atrav??s do nome do ve??culo.\nProcesso: O sistema busca o ve??culo no banco de dados e retorna ao usu??rio.\nSa??da: Todas as informa????es que foram inseridas para aquele determinado ve??culo.\n\n\nRF.9: Registro de manuten????o:\nDescri????o: O usu??rio informa a manuten????o realizada no ve??culo, custo da manuten????o, empresa que realizou o servi??o e a data.\nEntrada:  Dados da manuten????o realizada, empresa respons??vel, valor gasto e data.\nProcesso: O sistema realiza a persist??ncia dos dados no banco.\nSa??da: Atrav??s de uma consulta filtrada por ve??culo, o programa retorna as manuten????es realizadas no mesmo, valores gastos, data da \nmanuten????o e empresa respons??vel pela manuten????o.\n\nRF.10: Registro de Pneus:\nDescri????o: O usu??rio informa a marca, o tamanho,c??digo, data da compra, dot e o ??ndice de carga do pneu a ser cadastrado.\nEntrada:   Marca, tamanho, c??digo, data da compra, dot e o ??ndice de carga.\nProcesso: O sistema realiza a persist??ncia dos dados no banco.\nSa??da: No menu pneu, o sistema retorna todos os pneus cadastrados no sistema.\n\nRF.11: Registro de empresas prestadoras de servi??os:\nDescri????o: O usu??rio informa o nome, cnpj, telefone, endere??o da empresa e o segmento da empresa a ser cadastrada.\nEntrada:    Nome, cnpj, telefone, endere??o da empresa e o segmento da empresa.\nProcesso: O sistema realiza a persist??ncia dos dados no banco.\nSa??da: Todos os dados da empresa cadastrada.");
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 760, 300);

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Informa????es sobre a utiliza????o do sistema");
        getContentPane().add(lblCadastrar);
        lblCadastrar.setBounds(290, 40, 250, 16);

        lblCadastrar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar1.setText("Manual");
        getContentPane().add(lblCadastrar1);
        lblCadastrar1.setBounds(360, 10, 80, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCadastrar1;
    // End of variables declaration//GEN-END:variables
}
