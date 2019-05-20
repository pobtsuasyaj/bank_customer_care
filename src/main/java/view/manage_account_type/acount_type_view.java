package view.manage_account_type;

import class_controller.account_type_controller;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class acount_type_view extends javax.swing.JFrame {

    account_type_controller cntrl = new account_type_controller();
    ResultSet rs;
    boolean bl = false;

    DefaultTableModel md = new DefaultTableModel();

    public acount_type_view() throws SQLException {
        initComponents();
        refresh();

    }

    void refresh() throws SQLException {
        rs = cntrl.set_accounttype();
        String[] c = {"#", "ລະຫັດປະເພດບັນຊີ", "ຊື່ປະເພດບັນຊີ", "ສ້າງວັນທີເດືອນປີ"};
        md = new DefaultTableModel(c, 0);
        int i = 0;
        while (rs.next()) {
            i++;
            String num = String.valueOf(i);
            String id = rs.getString("account_type_id");
            String name = rs.getString("account_type_name");
            String date = rs.getString("created_date");
            String[] r = {num, id, name, date};
            md.addRow(r);
        }
        this.dgv_account.setModel(md);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dgv_account = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dgv_account.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        dgv_account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dgv_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgv_accountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgv_account);

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel1.setText("ລະຫັດປະເພດບັນຊີ:");

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel2.setText("ຊື່ປະເພດບັນຊີ:");

        txtid.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        txtname.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        jButton1.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        jButton1.setText("ບັນທຶກ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        jButton2.setText("ແກ້ໄຂ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        jButton3.setText("ລຶບ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtsearch.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LocalDateTime date = LocalDateTime.now(Clock.systemDefaultZone());
        bl = cntrl.insert_accounttype(txtid.getText().toUpperCase().trim(), txtname.getText().trim(), date);
        if (bl) {
            JOptionPane.showMessageDialog(this, "Save Success");
            txtid.setText("");
            txtname.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Save fail");
        }
        try {
            refresh();

        } catch (SQLException ex) {
            Logger.getLogger(acount_type_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtid.getText().isEmpty()) {
            return;
        }
        LocalDateTime date = LocalDateTime.now(Clock.systemDefaultZone());
        bl = cntrl.update_accounttype(txtname.getText().trim(), date, txtid.getText());
        if (bl) {
            JOptionPane.showMessageDialog(this, "Update Success");
            txtid.setText("");
            txtname.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Update fail");
        }
        try {
            refresh();

        } catch (SQLException ex) {
            Logger.getLogger(acount_type_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try {
            if (txtid.getText().isEmpty()) {

                return;
            }
            String id = this.dgv_account.getValueAt(this.dgv_account.getSelectedRow(), 1).toString();
            bl = cntrl.delete_accounttype(id);
            if (bl) {
                JOptionPane.showMessageDialog(this, "Delete Success");
            } else {
                JOptionPane.showMessageDialog(this, "Delete fail");
            }
            refresh();
        } catch (SQLException ex) {
            Logger.getLogger(acount_type_view.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void dgv_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgv_accountMouseClicked
        // TODO add your handling code here:
        try {
            String id = this.dgv_account.getValueAt(this.dgv_account.getSelectedRow(), 1).toString();
            String name = this.dgv_account.getValueAt(this.dgv_account.getSelectedRow(), 2).toString();
            this.txtid.setText(id);
            this.txtname.setText(name);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_dgv_accountMouseClicked

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
            java.util.logging.Logger.getLogger(acount_type_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acount_type_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acount_type_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acount_type_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new acount_type_view().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(acount_type_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dgv_account;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
