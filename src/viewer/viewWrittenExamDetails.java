/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lasitha Ranawaka
 */
public class viewWrittenExamDetails extends javax.swing.JDialog {

    /**
     * Creates new form template
     */
    public viewWrittenExamDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadtbl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWrittenExamDetails = new javax.swing.JTable();
        txtFindByAdmissionNo = new javax.swing.JTextField();
        txtFindByNic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Written Exam Details");
        jLabel1.setOpaque(true);

        tblWrittenExamDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Admission No", "NIC", "Exam Date", "Result", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWrittenExamDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblWrittenExamDetails);
        if (tblWrittenExamDetails.getColumnModel().getColumnCount() > 0) {
            tblWrittenExamDetails.getColumnModel().getColumn(0).setMinWidth(50);
            tblWrittenExamDetails.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        txtFindByAdmissionNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindByAdmissionNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFindByAdmissionNoKeyTyped(evt);
            }
        });

        txtFindByNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindByNicKeyReleased(evt);
            }
        });

        jLabel2.setText("Find by Admission No");

        jLabel3.setText("Find by NIC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtFindByAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtFindByNic, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindByAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFindByNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindByAdmissionNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindByAdmissionNoKeyTyped

    }//GEN-LAST:event_txtFindByAdmissionNoKeyTyped

    private void txtFindByAdmissionNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindByAdmissionNoKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tblWrittenExamDetails.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"
                    + "customer_register.admission_no,\n"
                    + "customer_register.nic,\n"
                    + "writtenexamresult.examDate,\n"
                    + "writtenexamresult.writtenResult,\n"
                    + "writtenexamresult.passOrFail\n"
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register\n"
                    + "WHERE\n"
                    + "writtenexamresult.customer_register_id = customer_register.id AND\n"
                    + "customer_register.admission_no LIKE '" + txtFindByAdmissionNo.getText() + "%'" 
                    + "ORDER BY\n"
                    + "customer_register.admission_no ASC");

            while (rs.next()) {
           //     txtFindByAdmissionNo.setText(rs.getString(2));
                String id = rs.getString(1);
                String admno = rs.getString(2);
                String nic = rs.getString(3);
                String date = rs.getString(4);
                String result = rs.getString(5);
                String status = rs.getString(6);
                Object arr[] = {id, admno, nic, date, result, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFindByAdmissionNoKeyReleased

    private void txtFindByNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindByNicKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tblWrittenExamDetails.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"
                    + "customer_register.admission_no,\n"
                    + "customer_register.nic,\n"
                    + "writtenexamresult.examDate,\n"
                    + "writtenexamresult.writtenResult,\n"
                    + "writtenexamresult.passOrFail\n"
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register\n"
                    + "WHERE\n"
                    + "writtenexamresult.customer_register_id = customer_register.id AND\n"
                    + "customer_register.nic LIKE '" + txtFindByNic.getText() + "%'\n"
                    + "ORDER BY\n"
                    + "customer_register.admission_no ASC");

            while (rs.next()) {
           //     txtFindByAdmissionNo.setText(rs.getString(2));
                String id = rs.getString(1);
                String admno = rs.getString(2);
                String nic = rs.getString(3);
                String date = rs.getString(4);
                String result = rs.getString(5);
                String status = rs.getString(6);
                Object arr[] = {id, admno, nic, date, result, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFindByNicKeyReleased

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
            java.util.logging.Logger.getLogger(viewWrittenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewWrittenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewWrittenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewWrittenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewWrittenExamDetails dialog = new viewWrittenExamDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWrittenExamDetails;
    private javax.swing.JTextField txtFindByAdmissionNo;
    private javax.swing.JTextField txtFindByNic;
    // End of variables declaration//GEN-END:variables

    private void loadtbl() {
        DefaultTableModel dtm = (DefaultTableModel) tblWrittenExamDetails.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"
                    + "customer_register.admission_no,\n"
                    + "customer_register.nic,\n"
                    + "writtenexamresult.examDate,\n"
                    + "writtenexamresult.writtenResult,\n"
                    + "writtenexamresult.passOrFail\n"
                    + "\n"
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register\n"
                    + "WHERE\n"
                    + "writtenexamresult.customer_register_id = customer_register.id\n"
                    + "ORDER BY\n"
                    + "customer_register.admission_no ASC");

            while (rs.next()) {
                String id = rs.getString(1);
                String admno = rs.getString(2);
                String nic = rs.getString(3);
                String date = rs.getString(4);
                String result = rs.getString(5);
                String status = rs.getString(6);
                Object arr[] = {id, admno, nic, date, result, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}