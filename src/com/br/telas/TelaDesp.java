/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.telas;

import com.br.entidades.Despesas;
import com.br.entidadesDao.DespesasDao;
import com.br.utils.Msg;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author X
 */
public class TelaDesp extends javax.swing.JDialog {

    MaskFormatter mfData;

    /**
     * Creates new form TelaContas
     */
    public TelaDesp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        /**
         * Aplica uma mascara na formatted fild.
         */
        try {
            mfData = new MaskFormatter("##-##-####");

        } catch (ParseException ex) {
            Msg.errar(null, "Erro ao aplicar mascara de data!");
        }
        initComponents();
        pnAtt.setVisible(false);
        lerDespesas();

    }

    /**
     * Inicia e atualiza a tabela
     */
    protected void lerDespesas() {

        DefaultTableModel model = (DefaultTableModel) TabelaDespesas.getModel();
        DespesasDao dDao = new DespesasDao();

        model.setNumRows(0);

        for (Despesas d : dDao.ler()) {
            model.addRow(new Object[]{
                d.getId(),
                d.getDescricao(),
                d.getTipoDespeca(),
                d.getValor(),
                d.getVencimento(),
                d.getStatus()
            });
        }

    }

    protected void BuscarData(String data) {

        DefaultTableModel model = (DefaultTableModel) TabelaDespesas.getModel();
        DespesasDao dDao = new DespesasDao();

        model.setNumRows(0);

        for (Despesas d : dDao.BuscarData(data)) {
            model.addRow(new Object[]{
                d.getId(),
                d.getDescricao(),
                d.getTipoDespeca(),
                d.getValor(),
                d.getVencimento(),
                d.getStatus()
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDespesas = new javax.swing.JTable();
        pnPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnAtt = new javax.swing.JPanel();
        txAttDesc = new javax.swing.JTextField();
        txAttTipo = new javax.swing.JTextField();
        btSalvarAtt = new javax.swing.JButton();
        btCancelerAtt = new javax.swing.JButton();
        cbAttStatus = new javax.swing.JComboBox<>();
        txAttValor = new javax.swing.JFormattedTextField();
        txAttVen = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txPesquisaData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        TabelaDespesas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        TabelaDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "TIPO DE DESPESA", "VALOR", "VENCIMENTO", "STATUS DO PAGAMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDespesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaDespesas);

        pnPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnPrincipal.add(jButton1);

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnPrincipal.add(jButton2);

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnPrincipal.add(jButton3);

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnPrincipal.add(jButton4);

        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txAttTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAttTipoActionPerformed(evt);
            }
        });

        btSalvarAtt.setText("Salvar");
        btSalvarAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAttActionPerformed(evt);
            }
        });

        btCancelerAtt.setText("Cancelar");
        btCancelerAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelerAttActionPerformed(evt);
            }
        });

        cbAttStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Pago", "A pagar", "Vencida" }));

        txAttValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txAttVen =  new javax.swing.JFormattedTextField(mfData);
        try {
            txAttVen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnAttLayout = new javax.swing.GroupLayout(pnAtt);
        pnAtt.setLayout(pnAttLayout);
        pnAttLayout.setHorizontalGroup(
            pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAttLayout.createSequentialGroup()
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAttLayout.createSequentialGroup()
                        .addComponent(txAttTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAttStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txAttVen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(btSalvarAtt)
                        .addGap(10, 10, 10))
                    .addGroup(pnAttLayout.createSequentialGroup()
                        .addComponent(txAttDesc)
                        .addGap(38, 38, 38)))
                .addGap(5, 5, 5)
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCancelerAtt)
                    .addComponent(txAttValor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnAttLayout.setVerticalGroup(
            pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAttLayout.createSequentialGroup()
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAttDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAttValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAttTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarAtt)
                    .addComponent(btCancelerAtt)
                    .addComponent(cbAttStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAttVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jLabel1.setText("Pesquisa por: data:");

        txPesquisaData =  new javax.swing.JFormattedTextField(mfData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(pnAtt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel1)
                    .addComponent(txPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadDesp desp = new TelaCadDesp(this, true);
        desp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /**
         * Função requisitando a seleção de uma das linhas da tabela.
         */
        if (TabelaDespesas.getSelectedRow() != -1) {
            pnAtt.setVisible(true);
            pnPrincipal.setVisible(false);
        } else {
            Msg.alertar(null, "Selecione alguma linha da tabela para atualizar!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /**
         * Função requisitando a seleção de uma das linhas da tabela.
         */
        if (TabelaDespesas.getSelectedRow() != -1) {
            if (Msg.confirmar(this, "Deseja realmente excluir este inquilino?")) {
                Despesas d = new Despesas();
                DespesasDao dao = new DespesasDao();

                d.setId((int) (TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 0)));

                dao.excluir(d);
                lerDespesas();
            }

        } else {
            Msg.alertar(null, "Selecione alguma linha da tabela para excluir!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txAttTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAttTipoActionPerformed

    }//GEN-LAST:event_txAttTipoActionPerformed

    private void btSalvarAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAttActionPerformed
        /**
         * Função para atualizar os dados do banco.
         */
        if (TabelaDespesas.getSelectedRow() != -1) {
            /**
             * Função para verificar o item selecionado na combo box.
             */
            if (cbAttStatus.getSelectedItem().toString().trim().equals("Selecione")) {
                Msg.alertar(this, "Selecione um status de pagamento");
            } else {
                /**
                 * Função para verificar o preenchimento das caixas de texto.
                 */
                if (txAttDesc.getText().trim().equals("")
                        || txAttTipo.getText().trim().equals("")
                        || txAttValor.getText().trim().equals("")
                        || txAttVen.getText().trim().equals("")) {

                    Msg.alertar(this, "Preencha todos os campos");
                } else {
                    Despesas d = new Despesas();
                    DespesasDao dao = new DespesasDao();
                    d.setDescricao(txAttDesc.getText());
                    d.setTipoDespeca(txAttTipo.getText());
                    d.setValor(Float.parseFloat(txAttValor.getText().replace(",", ".")));
                    d.setVencimento(txAttVen.getText());
                    d.setStatus(cbAttStatus.getSelectedItem().toString());
                    d.setId((int) (TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 0)));

                    dao.att(d);
                    lerDespesas();
                }
            }

        } else {

        }
    }//GEN-LAST:event_btSalvarAttActionPerformed

    private void TabelaDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDespesasMouseClicked
        /**
         * Insere dados da tabela nos campos de texto do pnAtt.
         */
        if (TabelaDespesas.getSelectedRow() != -1) {
            txAttDesc.setText(TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 1).toString());
            txAttTipo.setText(TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 2).toString());
            txAttValor.setText(TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 3).toString());
            txAttVen.setText(TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 4).toString());

            /**
             * Metodo para selecionar itens na combo box.
             */
            if (TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 5).toString().equals("Pago")) {
                cbAttStatus.setSelectedIndex(1);
            } else if (TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 5).toString().equals("A pagar")) {
                cbAttStatus.setSelectedIndex(2);
            } else if (TabelaDespesas.getValueAt(TabelaDespesas.getSelectedRow(), 5).toString().equals("Vencida")) {
                cbAttStatus.setSelectedIndex(3);
            }

        } else {
            Msg.alertar(null, "Selecione alguma linha da tabela para atualizar!");
        }
    }//GEN-LAST:event_TabelaDespesasMouseClicked

    private void btCancelerAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelerAttActionPerformed
        /**
         * Esconde o painel de atualização e revela o painel principal
         */
        pnAtt.setVisible(false);
        pnPrincipal.setVisible(true);
    }//GEN-LAST:event_btCancelerAttActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String dia = txPesquisaData.getText().substring(0, 2);
        String mes = txPesquisaData.getText().substring(3, 5);
        String ano = txPesquisaData.getText().substring(6);
        String dataMYSQL = ano + "-" + mes + "-" + dia;
        BuscarData(dataMYSQL);


    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaDesp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDesp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDesp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDesp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDesp dialog = new TelaDesp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDespesas;
    private javax.swing.JButton btCancelerAtt;
    private javax.swing.JButton btSalvarAtt;
    private javax.swing.JComboBox<String> cbAttStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnAtt;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField txAttDesc;
    private javax.swing.JTextField txAttTipo;
    private javax.swing.JFormattedTextField txAttValor;
    private javax.swing.JFormattedTextField txAttVen;
    private javax.swing.JFormattedTextField txPesquisaData;
    // End of variables declaration//GEN-END:variables

}
