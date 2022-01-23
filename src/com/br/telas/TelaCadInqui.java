/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.telas;

import com.br.entidades.Inquilinos;
import com.br.entidadesDao.InquilinosDao;
import com.br.utils.Msg;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author X
 */
public class TelaCadInqui extends javax.swing.JDialog {

    private TelaInqui pai;
    MaskFormatter mfTel;

    public TelaCadInqui(java.awt.Frame parent, boolean modal) {
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
         * Faz com que os componentes lbSex e txSex iniciem ocultos.
         */
    }

    public TelaCadInqui(TelaInqui parent, boolean modal) {
        super(parent, modal);
        
        try {
            mfTel = new MaskFormatter("(##)#####-####");

        } catch (ParseException ex) {
            Msg.errar(null, "Erro ao aplicar mascara de telefone!");
        }

        initComponents();
        pai = parent;

    }

    /**
     * Metodo para esconder a caixa de texto.
     */
    protected void bloquearSexo() {
        txSex.setEditable(false);
        txSex.setVisible(false);
        lbSex.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSalvarInq = new javax.swing.JButton();
        btCancelarConta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txNomeInq = new javax.swing.JTextField();
        txIdade = new javax.swing.JTextField();
        cbSex = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        txSex = new javax.swing.JTextField();
        lbSex = new javax.swing.JLabel();
        txTel = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de inquilinos");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        btSalvarInq.setText("Salvar");
        btSalvarInq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarInqActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvarInq);

        btCancelarConta.setText("Cancelar");
        btCancelarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarContaActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelarConta);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Sexo");

        cbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        cbSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone:");

        txSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSexActionPerformed(evt);
            }
        });

        lbSex.setText("Informe:");

        txTel = new javax.swing.JFormattedTextField(mfTel);
        txTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNomeInq, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbSex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbSex)
                                .addGap(18, 18, 18)
                                .addComponent(txSex))
                            .addComponent(txEmail)
                            .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNomeInq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSex))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarInqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarInqActionPerformed
        /**
         * Função para verificar o item selecionaod na combo box.
         */
        if (cbSex.getSelectedItem().toString().equals("Selecione")) {
            Msg.alertar(null, "Selecione um sexo");
        } else {
            /**
             * Função para verificar o preenchimento das caixas de texto.
             */
            if (txNomeInq.getText().trim().equals("")
                    || txIdade.getText().trim().equals("")
                    || txEmail.getText().trim().equals("")
                    || txTel.getText().trim().equals("")) {

                Msg.alertar(null, "Preencha todos os campos!");

            } else {
                Inquilinos i = new Inquilinos();
                InquilinosDao dao = new InquilinosDao();
                i.setNome(txNomeInq.getText());
                i.setIdade(Integer.parseInt(txIdade.getText()));
                i.setEmail(txEmail.getText());
                i.setTelefone(txTel.getText());

                if (cbSex.getSelectedItem().toString().equals("Outro")) {
                    i.setSexo(txSex.getText());
                } else {
                    i.setSexo(cbSex.getSelectedItem().toString());
                }
                dao.criar(i);
                pai.lerInquilinos();
            }
        }


    }//GEN-LAST:event_btSalvarInqActionPerformed

    private void cbSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexActionPerformed

        /**
         * Torna os componentes lbSex e txSex visívesis, caso a opção outro
         * esteja selecionada na combo box.
         */
        if (!cbSex.getSelectedItem().toString().equals("Outro")) {
            lbSex.setVisible(false);
            txSex.setVisible(false);

        } else {
            lbSex.setVisible(true);
            txSex.setVisible(true);

        }

    }//GEN-LAST:event_cbSexActionPerformed

    private void txSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSexActionPerformed

    }//GEN-LAST:event_txSexActionPerformed

    private void btCancelarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarContaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarContaActionPerformed

    private void txTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTelActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadInqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadInqui dialog = new TelaCadInqui(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCancelarConta;
    private javax.swing.JButton btSalvarInq;
    private javax.swing.JComboBox<String> cbSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbSex;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txNomeInq;
    private javax.swing.JTextField txSex;
    private javax.swing.JFormattedTextField txTel;
    // End of variables declaration//GEN-END:variables

}
