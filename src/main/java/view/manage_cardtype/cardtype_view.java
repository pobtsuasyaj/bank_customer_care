package view.manage_cardtype;

import class_controller.card_type_conrtroller;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.Clock;
import java.time.LocalDateTime;
import module_controller.card_type_module;
import javax.swing.table.DefaultTableModel;

public class cardtype_view extends javax.swing.JFrame {

    card_type_module mdl = new card_type_module("", "", "");
    card_type_conrtroller cntrl = new card_type_conrtroller();
    DefaultTableModel md = new DefaultTableModel();

    public cardtype_view() {
        initComponents();
        show_cardtype();
    }

    void show_cardtype() {
        ResultSet rs;
        try {
            rs = cntrl.set_cardtype();
            String[] col = {"#", "ລະຫັດປະເພດບັດ", "ຊື່ປະເພດບັດ", "ວັນທີ່"};
            md = new DefaultTableModel(col, 0);
            int i = 0;
            while (rs.next()) {
                i++;
                String num = String.valueOf(i);
                String id = rs.getString("card_type_id");
                String name = rs.getString("card_type_name");
                String create = rs.getString("created_date");
                String[] row = {num, id, name, create};
                md.addRow(row);
            }
        } catch (Exception e) {
        }
        this.dgv_card.setModel(md);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgv_card = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btsave = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        btdel = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel1.setText("ຊື່ປະເພດບັດ:");

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel2.setText("ລະຫັດປະເພດບັດ:");

        dgv_card.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        dgv_card.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dgv_card.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgv_cardMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgv_card);

        txtid.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        txtname.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btsave.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        btsave.setText("ບັນທຶກ");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        btedit.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        btedit.setText("ແກ່້ໄຂ");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });

        btdel.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        btdel.setText("ລຶບ");
        btdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdelActionPerformed(evt);
            }
        });

        txtsearch.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtid))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btsave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btedit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btdel))
                                    .addComponent(txtname))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsave)
                    .addComponent(btedit)
                    .addComponent(btdel)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:

        boolean bl;
        LocalDateTime d = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println("time:" + d);
        bl = cntrl.insert_cardtype(txtid.getText(), txtname.getText().trim(), d);
        if (bl) {
            JOptionPane.showMessageDialog(this, "Save Success");
        } else {
            JOptionPane.showMessageDialog(this, "Save Fail");
        }
        show_cardtype();

    }//GEN-LAST:event_btsaveActionPerformed

    private void dgv_cardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgv_cardMouseClicked
        // TODO add your handling code here:
        try {
            String id = this.dgv_card.getValueAt(this.dgv_card.getSelectedRow(), 1).toString();
            String name = this.dgv_card.getValueAt(this.dgv_card.getSelectedRow(), 2).toString();
//            String create = this.dgv_card.getValueAt(this.dgv_card.getSelectedRow(), 3).toString();
            this.txtid.setText(id);
            this.txtname.setText(name);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_dgv_cardMouseClicked

    private void btdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdelActionPerformed
        // TODO add your handling code here:
        boolean bl = false;
        if (txtid.getText().isEmpty() || txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select Your Item");
            return;
        }
        String id = this.dgv_card.getValueAt(this.dgv_card.getSelectedRow(), 1).toString();
        bl = cntrl.delete_cardtype(id);
        if (bl) {
            JOptionPane.showMessageDialog(this, "Delete Success");
        } else {
            JOptionPane.showMessageDialog(this, "Delete Fail");
        }
        show_cardtype();
    }//GEN-LAST:event_btdelActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
        boolean bl = false;
        if (txtid.getText().isEmpty() || txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select Your Item");
            return;
        }
        bl = cntrl.update_cardtype(txtname.getText(), txtid.getText());
        if (bl) {
            JOptionPane.showMessageDialog(this, "Update Success");
        } else {
            JOptionPane.showMessageDialog(this, "Update Fail");
        }
        show_cardtype();
    }//GEN-LAST:event_bteditActionPerformed

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
            java.util.logging.Logger.getLogger(cardtype_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardtype_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardtype_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardtype_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardtype_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdel;
    private javax.swing.JButton btedit;
    private javax.swing.JButton btsave;
    private javax.swing.JTable dgv_card;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    private Date convert(java.util.Date utilDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
