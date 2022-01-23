/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.telas;

import com.br.entidades.Unidades;
import com.br.entidadesDao.UnidadesDao;
import com.br.utils.Msg;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaUni extends javax.swing.JDialog {

    /**
     * Inicia e atualiza a tabela
     */
    private List<Unidades> lista = new ArrayList<>();

    public TelaUni(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        /**
         * Deixa o painel de atualização invisivel
         */
        pnAtt.setVisible(false);

        DefaultTableModel model = (DefaultTableModel) TabelaUni.getModel();
        TabelaUni.setRowSorter(new TableRowSorter(model));
        bloquearPesquisa();

        lerUnidades();

    }

    public TelaUni(TelaUni parent, boolean modal) {
        super(parent, modal);

        initComponents();
        /**
         * Deixa o painel de atualização invisivel
         */
        pnAtt.setVisible(false);

        DefaultTableModel model = (DefaultTableModel) TabelaUni.getModel();
        TabelaUni.setRowSorter(new TableRowSorter(model));
        bloquearPesquisa();

        lerUnidades();

    }

    protected void lerUnidades() {

        DefaultTableModel model = (DefaultTableModel) TabelaUni.getModel();
        UnidadesDao iDao = new UnidadesDao();

        model.setNumRows(0);

        for (Unidades u : iDao.ler()) {
            model.addRow(new Object[]{
                u.getId(),
                u.getDescricao(),
                u.getProprietario(),
                u.getCondominio(),
                u.getEndereco(),
                u.getCondicao()
            });
        }

    }

    protected void buscarP(String proprietario) {

        DefaultTableModel model = (DefaultTableModel) TabelaUni.getModel();
        UnidadesDao iDao = new UnidadesDao();

        model.setNumRows(0);

        for (Unidades u : iDao.BuscarP(proprietario)) {
            model.addRow(new Object[]{
                u.getId(),
                u.getDescricao(),
                u.getProprietario(),
                u.getCondominio(),
                u.getEndereco(),
                u.getCondicao()
            });
        }

    }

    protected void buscarCondominio(String condominio) {

        DefaultTableModel model = (DefaultTableModel) TabelaUni.getModel();
        UnidadesDao iDao = new UnidadesDao();

        model.setNumRows(0);

        for (Unidades u : iDao.BuscarCondominio(condominio)) {
            model.addRow(new Object[]{
                u.getId(),
                u.getDescricao(),
                u.getProprietario(),
                u.getCondominio(),
                u.getEndereco(),
                u.getCondicao()
            });
        }

    }

    protected void buscarCondicao(String condicao) {

        DefaultTableModel model = (DefaultTableModel) TabelaUni.getModel();
        UnidadesDao iDao = new UnidadesDao();

        model.setNumRows(0);

        for (Unidades u : iDao.BuscarCondicao(condicao)) {
            model.addRow(new Object[]{
                u.getId(),
                u.getDescricao(),
                u.getProprietario(),
                u.getCondominio(),
                u.getEndereco(),
                u.getCondicao()
            });
        }

    }

    protected void bloquearPesquisa() {
        txPesqCond.setEnabled(false);
        txPesqPro.setEnabled(false);
        cbPesqCondicao.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUni = new javax.swing.JTable();
        pnPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txPesqPro = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        pnAtt = new javax.swing.JPanel();
        txAttDes = new javax.swing.JTextField();
        txAttEnd = new javax.swing.JTextField();
        txAttcond = new javax.swing.JTextField();
        btSalvarAtt = new javax.swing.JButton();
        btCancelarAtt = new javax.swing.JButton();
        txAttPro = new javax.swing.JTextField();
        cbAttCon = new javax.swing.JComboBox<>();
        txPesqCond = new javax.swing.JTextField();
        cbPesqCondicao = new javax.swing.JComboBox<>();
        cxP = new javax.swing.JCheckBox();
        cxCondominio = new javax.swing.JCheckBox();
        cxCondicao = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unidades");

        TabelaUni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        TabelaUni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "PROPRIETÁIO", "CONDOMÍNIO", "ENDEREÇO", "CONDIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaUni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaUniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaUni);

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

        txAttDes.setText("Descrição");

        txAttEnd.setText("Endereço");

        txAttcond.setText("Condomínio");

        btSalvarAtt.setText("Salvar");
        btSalvarAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAttActionPerformed(evt);
            }
        });

        btCancelarAtt.setText("Cancelar");
        btCancelarAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarAttActionPerformed(evt);
            }
        });

        txAttPro.setText("Proprietário");

        cbAttCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ocupado", "Desocupado", "Em reforma" }));

        javax.swing.GroupLayout pnAttLayout = new javax.swing.GroupLayout(pnAtt);
        pnAtt.setLayout(pnAttLayout);
        pnAttLayout.setHorizontalGroup(
            pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAttLayout.createSequentialGroup()
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAttLayout.createSequentialGroup()
                        .addComponent(txAttPro, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cbAttCon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnAttLayout.createSequentialGroup()
                        .addComponent(txAttDes, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txAttEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnAttLayout.createSequentialGroup()
                        .addComponent(btSalvarAtt)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelarAtt))
                    .addComponent(txAttcond)))
        );
        pnAttLayout.setVerticalGroup(
            pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAttLayout.createSequentialGroup()
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAttDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAttcond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAttEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarAtt)
                    .addComponent(btCancelarAtt)
                    .addComponent(txAttPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAttCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cbPesqCondicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ocupado", "Desocupado", "Em reforma" }));

        cxP.setText("Proprietário:");
        cxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPActionPerformed(evt);
            }
        });

        cxCondominio.setText("Condomínio:");
        cxCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCondominioActionPerformed(evt);
            }
        });

        cxCondicao.setText("Condição:");
        cxCondicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCondicaoActionPerformed(evt);
            }
        });

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
                        .addComponent(cxP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txPesqPro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cxCondominio)
                        .addGap(18, 18, 18)
                        .addComponent(txPesqCond, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cxCondicao)
                        .addGap(18, 18, 18)
                        .addComponent(cbPesqCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(pnAtt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesqCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txPesqCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txPesqPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(cxP)
                    .addComponent(cxCondominio)
                    .addComponent(cxCondicao))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /**
         * Chama a tela de cadastro.
         */
        TelaCadUni uni = new TelaCadUni(this, true);
        uni.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /**
         * Função requisitando a seleção de uma das linhas da tabela.
         */
        if (TabelaUni.getSelectedRow() != -1) {
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
        if (TabelaUni.getSelectedRow() != -1) {
            if (Msg.confirmar(this, "Deseja realmente excluir este inquilino?")) {
                Unidades u = new Unidades();
                UnidadesDao dao = new UnidadesDao();

                u.setId((int) (TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 0)));

                dao.excluir(u);
                lerUnidades();
            }

        } else {
            Msg.alertar(null, "Selecione alguma linha da tabela para excluir!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btCancelarAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarAttActionPerformed
        /**
         * Esconde o painel de atualização e revela o painel principal
         */
        pnAtt.setVisible(false);
        pnPrincipal.setVisible(true);
    }//GEN-LAST:event_btCancelarAttActionPerformed

    private void btSalvarAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAttActionPerformed
        /**
         * Função para atualizar os dados do banco.
         */
        if (TabelaUni.getSelectedRow() != -1) {
            if (cbAttCon.getSelectedItem().toString().equals("Selecione")) {
                Msg.alertar(null, "Selecione uma condição!");
            } else {
                if (txAttDes.getText().trim().equals("")
                        || txAttEnd.getText().trim().equals("")
                        || txAttPro.getText().trim().equals("")
                        || txAttcond.getText().trim().equals("")) {

                    Msg.alertar(null, "Preencha todos os campos!");
                } else {
                    Unidades u = new Unidades();
                    UnidadesDao dao = new UnidadesDao();
                    u.setDescricao(txAttDes.getText());
                    u.setProprietario(txAttPro.getText());
                    u.setEndereco(txAttEnd.getText());
                    u.setCondominio(txAttcond.getText());
                    u.setCondicao(cbAttCon.getSelectedItem().toString());
                    u.setId((int) (TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 0)));

                    dao.att(u);
                    lerUnidades();                    
                }
            }

        } else {
            Msg.alertar(null, "Selecione alguma linha da tabela para atualizar!");
        }
    }//GEN-LAST:event_btSalvarAttActionPerformed

    private void TabelaUniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaUniMouseClicked
        /**
         * Insere dados da tabela nos campos de texto do pnAtt.
         */
        if (TabelaUni.getSelectedRow() != -1) {
            txAttDes.setText(TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 1).toString());
            txAttPro.setText(TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 2).toString());
            txAttcond.setText(TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 3).toString());
            txAttEnd.setText(TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 4).toString());
            /**
             * Metodo para selecionar itens na combo box.
             */
            if (TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 5).toString().equals("Ocupado")) {
                cbAttCon.setSelectedIndex(1);
            } else if (TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 5).toString().equals("Desocupado")) {
                cbAttCon.setSelectedIndex(2);
            } else if (TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 5).toString().equals("Em reforma")) {
                cbAttCon.setSelectedIndex(3);
            }
            cbAttCon.setSelectedItem(TabelaUni.getValueAt(TabelaUni.getSelectedRow(), 5));

        } else {
            Msg.alertar(null, "Selecione alguma linha da tabela para atualizar!");
        }
    }//GEN-LAST:event_TabelaUniMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!txPesqPro.getText().trim().equals("")) {
            buscarP(txPesqPro.getText());
        } else if (!txPesqCond.getText().trim().equals("")) {
            buscarCondominio(txPesqCond.getText());
        } else if (!cbPesqCondicao.getSelectedItem().toString().equals("Selecione")) {
            buscarCondicao(cbPesqCondicao.getSelectedItem().toString());
        } else {
            Msg.alertar(null, "Informe algum elemento para pesquisa");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPActionPerformed
        cxCondominio.setSelected(false);
        cxCondicao.setSelected(false);
        txPesqPro.setEnabled(true);
        txPesqCond.setEnabled(false);
        cbPesqCondicao.setEnabled(false);
    }//GEN-LAST:event_cxPActionPerformed

    private void cxCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCondominioActionPerformed
        cxP.setSelected(false);
        cxCondicao.setSelected(false);
        txPesqPro.setEnabled(false);
        txPesqCond.setEnabled(true);
        cbPesqCondicao.setEnabled(false);
    }//GEN-LAST:event_cxCondominioActionPerformed

    private void cxCondicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCondicaoActionPerformed
        cxCondominio.setSelected(false);
        cxP.setSelected(false);
        txPesqPro.setEnabled(false);
        txPesqCond.setEnabled(false);
        cbPesqCondicao.setEnabled(true);
    }//GEN-LAST:event_cxCondicaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                TelaUni dialog = new TelaUni(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TabelaUni;
    private javax.swing.JButton btCancelarAtt;
    private javax.swing.JButton btSalvarAtt;
    private javax.swing.JComboBox<String> cbAttCon;
    private javax.swing.JComboBox<String> cbPesqCondicao;
    private javax.swing.JCheckBox cxCondicao;
    private javax.swing.JCheckBox cxCondominio;
    private javax.swing.JCheckBox cxP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnAtt;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField txAttDes;
    private javax.swing.JTextField txAttEnd;
    private javax.swing.JTextField txAttPro;
    private javax.swing.JTextField txAttcond;
    private javax.swing.JTextField txPesqCond;
    private javax.swing.JTextField txPesqPro;
    // End of variables declaration//GEN-END:variables

}
