/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.telas;

import com.br.entidades.Inquilinos;
import com.br.entidadesDao.InquilinosDao;
import com.br.utils.Msg;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author X
 */
public class TelaInqui extends javax.swing.JDialog {
    MaskFormatter mfTel;

    public TelaInqui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
         /**
         * Aplica uma mascara na formatted fild.
         */
        try {
            mfTel = new MaskFormatter("(##)#####-####");

        } catch (ParseException ex) {
            Msg.errar(null, "Erro ao aplicar mascara de telefone!");
        }
        initComponents();
        /**
         * Deixa o painel de atualização invisivel
         */
        pnAtt.setVisible(false);

        lerInquilinos();

    }

    /**
     * Metodo para atualizar a tabela.
     */
    protected void lerInquilinos() {

        DefaultTableModel model = (DefaultTableModel) TabelaInqui.getModel();
        InquilinosDao iDao = new InquilinosDao();

        model.setNumRows(0);

        for (Inquilinos i : iDao.ler()) {
            model.addRow(new Object[]{
                i.getId(),
                i.getNome(),
                i.getIdade(),
                i.getSexo(),
                i.getEmail(),
                i.getTelefone()
            });
        }

    }

    protected void BuscarN(String nome) {

        DefaultTableModel model = (DefaultTableModel) TabelaInqui.getModel();
        InquilinosDao dDao = new InquilinosDao();

        model.setNumRows(0);

        for (Inquilinos i : dDao.BuscarN(nome)) {
            model.addRow(new Object[]{
                i.getId(),
                i.getNome(),
                i.getIdade(),
                i.getSexo(),
                i.getEmail(),});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaInqui = new javax.swing.JTable();
        pnPrincipal = new javax.swing.JPanel();
        btIn = new javax.swing.JButton();
        btAtt = new javax.swing.JButton();
        btEx = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        txPesquisarN = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        pnAtt = new javax.swing.JPanel();
        txAttNome = new javax.swing.JTextField();
        txAttIdade = new javax.swing.JTextField();
        txAttEmail = new javax.swing.JTextField();
        btCancelarAtt = new javax.swing.JButton();
        btSalvarAtt = new javax.swing.JButton();
        txAttSex = new javax.swing.JTextField();
        txAttTel = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inquilinos");

        TabelaInqui.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        TabelaInqui.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "IDADE", "SEXO", "EMAIL", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaInqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaInquiMouseClicked(evt);
            }
        });
        TabelaInqui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaInquiKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaInqui);

        pnPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        btIn.setText("Inserir");
        btIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInActionPerformed(evt);
            }
        });
        pnPrincipal.add(btIn);

        btAtt.setText("Atualizar");
        btAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAttActionPerformed(evt);
            }
        });
        pnPrincipal.add(btAtt);

        btEx.setText("Excluir");
        btEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExActionPerformed(evt);
            }
        });
        pnPrincipal.add(btEx);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        pnPrincipal.add(btSair);

        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txAttNome.setText("Nome");
        txAttNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAttNomeActionPerformed(evt);
            }
        });

        txAttIdade.setText("Idade");

        txAttEmail.setText("E-mail");

        btCancelarAtt.setText("Cancelar");
        btCancelarAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarAttActionPerformed(evt);
            }
        });

        btSalvarAtt.setText("Salvar");
        btSalvarAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAttActionPerformed(evt);
            }
        });

        txAttSex.setText("Sexo");

        txAttTel = new javax.swing.JFormattedTextField(mfTel);

        javax.swing.GroupLayout pnAttLayout = new javax.swing.GroupLayout(pnAtt);
        pnAtt.setLayout(pnAttLayout);
        pnAttLayout.setHorizontalGroup(
            pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAttLayout.createSequentialGroup()
                .addComponent(txAttSex, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txAttEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txAttTel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarAtt)
                .addGap(18, 18, 18)
                .addComponent(btCancelarAtt))
            .addGroup(pnAttLayout.createSequentialGroup()
                .addComponent(txAttNome, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(txAttIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnAttLayout.setVerticalGroup(
            pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAttLayout.createSequentialGroup()
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAttNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAttIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAttEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAttSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarAtt)
                    .addComponent(btCancelarAtt)
                    .addComponent(txAttTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Pesquisar nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(pnPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txPesquisarN)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(pnAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPesquisarN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInActionPerformed
        /**
         * Torna a tela de cadastro visivel
         */
        TelaCadInqui inq = new TelaCadInqui(this, true);
        inq.bloquearSexo();

        inq.setVisible(true);

//new TelaCadInqui(this, true).setVisible(true); 
    }//GEN-LAST:event_btInActionPerformed

    private void btAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAttActionPerformed
        /**
         * Função requisitando a seleção de uma das linhas da tabela.
         */
        if (TabelaInqui.getSelectedRow() != -1) {
            pnAtt.setVisible(true);
            pnPrincipal.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha da tabela para atualizar!", null, JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btAttActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        BuscarN(txPesquisarN.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExActionPerformed
        /**
         * Função requisitando a seleção de uma das linhas da tabela.
         */
        if (TabelaInqui.getSelectedRow() != -1) {
            if (Msg.confirmar(this, "Deseja realmente excluir este inquilino?")) {
                Inquilinos i = new Inquilinos();
                InquilinosDao dao = new InquilinosDao();

                i.setId((int) (TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 0)));

                dao.excluir(i);
                lerInquilinos();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha da tabela para excluir!", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btExActionPerformed

    private void txAttNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAttNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txAttNomeActionPerformed

    private void TabelaInquiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaInquiKeyReleased


    }//GEN-LAST:event_TabelaInquiKeyReleased

    private void TabelaInquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaInquiMouseClicked
        /**
         * Insere dados da tabela nos campos de texto do pnAtt.
         */
        if (TabelaInqui.getSelectedRow() != -1) {
            txAttNome.setText(TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 1).toString());
            txAttIdade.setText(TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 2).toString());
            txAttSex.setText(TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 3).toString());
            txAttEmail.setText(TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 4).toString());
            txAttTel.setText(TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 5).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha da tabela para atualizar!", null, JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_TabelaInquiMouseClicked

    private void btSalvarAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAttActionPerformed
        /**
         * Função para atualizar os dados do banco.
         */
        if (TabelaInqui.getSelectedRow() != -1) {
            if (txAttNome.getText().trim().equals("")
                    || txAttIdade.getText().trim().equals("")
                    || txAttSex.getText().trim().equals("")
                    || txAttEmail.getText().trim().equals("")
                    || txAttTel.getText().trim().equals("")) {

                Msg.alertar(this, "Preencha todos os campos");
            } else {
                Inquilinos i = new Inquilinos();
                InquilinosDao dao = new InquilinosDao();
                i.setNome(txAttNome.getText());
                i.setIdade(Integer.parseInt(txAttIdade.getText()));
                i.setEmail(txAttEmail.getText());
                i.setTelefone(txAttTel.getText());
                i.setSexo(txAttSex.getText());
                i.setId((int) (TabelaInqui.getValueAt(TabelaInqui.getSelectedRow(), 0)));

                dao.att(i);
                lerInquilinos();
                TabelaInqui.getSelectedRow();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha da tabela para atualizar!", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarAttActionPerformed

    private void btCancelarAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarAttActionPerformed
        /**
         * Esconde o painel de atualização e revela o painel principal
         */
        pnAtt.setVisible(false);
        pnPrincipal.setVisible(true);
    }//GEN-LAST:event_btCancelarAttActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInqui dialog = new TelaInqui(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TabelaInqui;
    private javax.swing.JButton btAtt;
    private javax.swing.JButton btCancelarAtt;
    private javax.swing.JButton btEx;
    private javax.swing.JButton btIn;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvarAtt;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnAtt;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField txAttEmail;
    private javax.swing.JTextField txAttIdade;
    private javax.swing.JTextField txAttNome;
    private javax.swing.JTextField txAttSex;
    private javax.swing.JFormattedTextField txAttTel;
    private javax.swing.JTextField txPesquisarN;
    // End of variables declaration//GEN-END:variables

}
