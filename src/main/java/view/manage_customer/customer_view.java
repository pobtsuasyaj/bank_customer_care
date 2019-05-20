
package view.manage_customer;
import class_controller.customer_controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
public class customer_view extends javax.swing.JFrame {

    customer_controller cntrl = new customer_controller();
    boolean bl;
    ResultSet rs;
    public customer_view() throws SQLException {
        initComponents();
        refresh();
    }

    void refresh() throws SQLException{
       rs= cntrl.get_province();
        while(rs.next()){
            cbprovince.addItem(rs.getString("province_name"));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        cbgender = new javax.swing.JComboBox<>();
        dtpDob = new javax.swing.JFormattedTextField();
        txtvillage = new javax.swing.JTextField();
        cbprovince = new javax.swing.JComboBox<>();
        cbdistrict = new javax.swing.JComboBox<>();
        btsave = new javax.swing.JButton();
        btupdate = new javax.swing.JButton();
        txtpath = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel1.setText("ລະຫັດລູກຄ້າ:");

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel2.setText("ຊື່ ແລະ ນາມສະກຸນ:");

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel3.setText("ເພດ:");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel4.setText("ວັນເດືອນປີເກີດ:");

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel5.setText("ບ້ານ:");

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel6.setText("ແຂວງ:");

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N
        jLabel7.setText("ເມືອງ:");

        txtid.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        txtname.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        cbgender.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ຍິງ", "ຊາຍ", "ອື່ນໆ" }));

        txtvillage.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        cbprovince.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        cbprovince.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbprovinceItemStateChanged(evt);
            }
        });

        cbdistrict.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        btsave.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        btsave.setText("ບັນທຶກ");

        btupdate.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N
        btupdate.setText("ແກ້ໄຂ");

        txtpath.setFont(new java.awt.Font("Saysettha OT", 0, 13)); // NOI18N

        jButton3.setText("...");

        jButton4.setText("x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btupdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtname)
                            .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpDob)
                            .addComponent(txtvillage)
                            .addComponent(cbprovince, 0, 280, Short.MAX_VALUE)
                            .addComponent(cbdistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpath)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 124, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dtpDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtvillage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbprovince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsave)
                    .addComponent(btupdate))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbprovinceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbprovinceItemStateChanged
        // TODO add your handling code here:
//        try {
//            rs = cntrl.check_distric((String) cbprovince.getSelectedItem());
//             DefaultComboBoxModel cbmd = new DefaultComboBoxModel();
//             
//             while();
//                 crs.next()){
//                 String dis = rs.getString("district_id");
//                 cbmd.addElement(dis);
//                 cbprovince.setModel(cbmd);
//                 System.out.println(dis);
//             }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_cbprovinceItemStateChanged

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
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new customer_view().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(customer_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsave;
    private javax.swing.JButton btupdate;
    private javax.swing.JComboBox<String> cbdistrict;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JComboBox<String> cbprovince;
    private javax.swing.JFormattedTextField dtpDob;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txtvillage;
    // End of variables declaration//GEN-END:variables
}
