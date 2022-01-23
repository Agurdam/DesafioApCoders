/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.telas;

import com.br.bancoDeDados.Conexao;
import com.br.entidades.Despesas;
import com.br.entidades.Inquilinos;
import com.br.entidades.Unidades;
import com.br.entidadesDao.DespesasDao;
import com.br.entidadesDao.InquilinosDao;
import com.br.entidadesDao.UnidadesDao;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conectar = Conexao.conector();
        lerTudo();
       
    }

    protected void lerTudo() {
        lerInquilinos();
        lerUnidades();
        lerDespesas();
    }

    protected void lerInquilinos() {

        DefaultTableModel model = (DefaultTableModel) TabelaInqP.getModel();
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

    protected void lerUnidades() {

        DefaultTableModel model = (DefaultTableModel) TabelaUniP.getModel();
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

    protected void lerDespesas() {

        DefaultTableModel model = (DefaultTableModel) TabelaDespP.getModel();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btInquilinos = new javax.swing.JButton();
        btUnidades = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUniP = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaInqP = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaDespP = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desafio Pub Future");
        setExtendedState(MAXIMIZED_BOTH
        );
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(0, 0));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btInquilinos.setText("Inquilinos");
        btInquilinos.setFocusable(false);
        btInquilinos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInquilinos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInquilinosActionPerformed(evt);
            }
        });
        jToolBar1.add(btInquilinos);

        btUnidades.setText("Unidades");
        btUnidades.setFocusable(false);
        btUnidades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUnidades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnidadesActionPerformed(evt);
            }
        });
        jToolBar1.add(btUnidades);

        jButton3.setText("Despesas");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel7.setText("Inquilinos:");

        TabelaUniP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "PROPRIETÁRIO", "CONDOMÍNIO", "ENDEREÇO", "SITUAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaUniP);

        jLabel8.setText("Unidades:");

        TabelaInqP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "IDADE", "SEXO", "E-MAIL", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TabelaInqP);

        jLabel9.setText("Despesas:");

        TabelaDespP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "TIPO", "VALOR", "VENCIMENTO", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelaDespP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInquilinosActionPerformed
        new TelaInqui(this, true).setVisible(true);
    }//GEN-LAST:event_btInquilinosActionPerformed

    private void btUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUnidadesActionPerformed
        new TelaUni(this, true).setVisible(true);
    }//GEN-LAST:event_btUnidadesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new TelaDesp(this, true).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDespP;
    private javax.swing.JTable TabelaInqP;
    private javax.swing.JTable TabelaUniP;
    private javax.swing.JButton btInquilinos;
    private javax.swing.JButton btUnidades;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
