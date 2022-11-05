
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
        jTextArea1.setText("RF.1: Cadastro do usuário\nDescrição: Somente o moderador do sistema poderá cadastrar outros usuários.\nEntrada: Nome e sobrenome do usuário, E-mail e senha.\nProcesso: O cadastro será incluído no banco de dados.\nSaída: Mensagem de confirmação bem-sucedido do cadastro caso tenha sido efetuado com  sucesso, senão, mensagem de erro.\n\nRF.2: Modificação de Cadastrado de Usuário:\nDescrição: Somente o moderador do sistema poderá modificar dados de usuários.\nEntrada: Campo desejado e o novo dado.\nProcesso: Atualização do banco de dados.\nSaída: Mensagem de confirmação bem-sucedido da modificação do cadastro caso tenha sido efetuado com sucesso, senão, mensagem de erro.\n\nRF.3: Exclusão do Cadastro de Usuário:\nDescrição: O moderador do sistema poderá excluir o cadastro dos usuários.\nEntrada: Nome de usuário.\nProcesso: O sistema verifica se o usuário é cadastrado e se for o usuário é excluído.\nSaída:  Mensagem de confirmação bem-sucedido da exclusão do cadastro caso tenha sido efetuado com sucesso, senão, mensagem de erro.\n\nRF.4: Menu usuário:\nDescrição: Retorna os dados de todos os usuários.\nEntrada: Somente haverá entrada de dados caso o administrador deseje realizar alguma alteração nos cadastros.\nProcesso: O sistema retorna os dados dos usuários individualmente através de uma seleção filtrada.\nSaída: Através de uma consulta filtrada nos usuários, o programa retorna todos os dados dos usuários cadastrados, permitindo que \nsomente o administrador possa realizar alterações caso necessário.\n\nRF.5: Inserção de dados dos veículos:\nDescrição: Os usuários cadastrados podem inserir as informações necessárias.\nEntrada: O usuário informa o modelo, ano, quantidade de eixos, e último licenciamento quitado\nProcesso: O sistema insere todos esses dados no banco de dados.\n\nRF.6: Modificação de dados dos veículos:\nDescrição: O usuário pode alterar informações já existentes.\nEntrada: O usuário escolhe o campo desejado e insere o novo dado.\nProcesso: O sistema atualiza os dados alterados do veículo no banco de dados.\nSaída: Mensagem de confirmação bem-sucedido da modificação caso tenha sido efetuado com sucesso, senão, mensagem de erro.\n\nRF.7: Exclusão de dados dos veículos:\nDescrição: O usuário pode efetuar a exclusão dos dados.\nEntrada: Marca do veículo.\nProcesso: O sistema busca a marca do veículo no banco de dados, caso ele encontre será excluído.\nSaída: Mensagem de confirmação bem-sucedido da exclusão dos dados caso tenha sido efetuado com sucesso, senão, mensagem de erro.\n\nRF.8: Consulta de veículos:\nDescrição: O usuário pode buscar um determinado veículo de sua escolha através de um campo específico.\nEntrada: Campo veículo, o usuário realiza a busca através do nome do veículo.\nProcesso: O sistema busca o veículo no banco de dados e retorna ao usuário.\nSaída: Todas as informações que foram inseridas para aquele determinado veículo.\n\n\nRF.9: Registro de manutenção:\nDescrição: O usuário informa a manutenção realizada no veículo, custo da manutenção, empresa que realizou o serviço e a data.\nEntrada:  Dados da manutenção realizada, empresa responsável, valor gasto e data.\nProcesso: O sistema realiza a persistência dos dados no banco.\nSaída: Através de uma consulta filtrada por veículo, o programa retorna as manutenções realizadas no mesmo, valores gastos, data da \nmanutenção e empresa responsável pela manutenção.\n\nRF.10: Registro de Pneus:\nDescrição: O usuário informa a marca, o tamanho,código, data da compra, dot e o índice de carga do pneu a ser cadastrado.\nEntrada:   Marca, tamanho, código, data da compra, dot e o índice de carga.\nProcesso: O sistema realiza a persistência dos dados no banco.\nSaída: No menu pneu, o sistema retorna todos os pneus cadastrados no sistema.\n\nRF.11: Registro de empresas prestadoras de serviços:\nDescrição: O usuário informa o nome, cnpj, telefone, endereço da empresa e o segmento da empresa a ser cadastrada.\nEntrada:    Nome, cnpj, telefone, endereço da empresa e o segmento da empresa.\nProcesso: O sistema realiza a persistência dos dados no banco.\nSaída: Todos os dados da empresa cadastrada.");
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 760, 300);

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Informações sobre a utilização do sistema");
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
