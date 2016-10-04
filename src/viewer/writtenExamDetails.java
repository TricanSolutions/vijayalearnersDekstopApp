/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.Messages;
import com.userstatus;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lasitha Ranawaka
 */
public class writtenExamDetails extends javax.swing.JDialog {

    /**
     * Creates new form template
     */
    public writtenExamDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadtabl();
        txtadmissiono.grabFocus();

    }

    writtenExamDetails(String adno, String name, int id, boolean b) {
        initComponents();
        txtBarcode.grabFocus();
        txtadmissiono.setText(adno);
        txtname.setText(name);
        cusid = id;
        System.out.println(cusid);
        loadtabl();

    }
    int cusid;
    int writtenexamid;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtadmissiono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtexamdate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtresult = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbpassorfail = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Written Exam Details");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel3.setText("By Admission No");

        txtadmissiono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadmissionoActionPerformed(evt);
            }
        });
        txtadmissiono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadmissionoKeyPressed(evt);
            }
        });

        jLabel4.setText("Name");

        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtadmissiono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(168, 168, 168)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtname)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtadmissiono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Result", "Pass or Fail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.getTableHeader().setReorderingAllowed(false);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Details"));

        jLabel5.setText("ID");

        txtid.setEditable(false);

        jLabel6.setText("Exam Date");

        try {
            txtexamdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtexamdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtexamdateKeyPressed(evt);
            }
        });

        jLabel7.setText("Result");

        txtresult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtresultKeyPressed(evt);
            }
        });

        jLabel8.setText("Pass or Fail");

        cmbpassorfail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Waiting", "Pass", "Fail", "Absent", "Cancel" }));
        cmbpassorfail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbpassorfailKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Barcode");

        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtexamdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(cmbpassorfail, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtexamdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbpassorfail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        submit();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadtabl();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        writtenexamid = Integer.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 0).toString());

        txtid.setText(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 0)));
        txtexamdate.setText(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 1)));
        txtresult.setText(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 2)));
        cmbpassorfail.setSelectedItem(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 3)));
    }//GEN-LAST:event_tblMouseClicked

    private void txtadmissionoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadmissionoActionPerformed

    }//GEN-LAST:event_txtadmissionoActionPerformed

    private void txtadmissionoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadmissionoKeyPressed
        if (evt.getKeyCode() == 10) {
            loadtabl();

        }
    }//GEN-LAST:event_txtadmissionoKeyPressed

    private void txtexamdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexamdateKeyPressed
        if (evt.getKeyCode() == 10) {
            txtresult.grabFocus();

        }
    }//GEN-LAST:event_txtexamdateKeyPressed

    private void txtresultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresultKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbpassorfail.grabFocus();

        }
    }//GEN-LAST:event_txtresultKeyPressed

    private void cmbpassorfailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbpassorfailKeyPressed
        if (evt.getKeyCode() == 10) {
            submit();
            txtadmissiono.grabFocus();

        }
    }//GEN-LAST:event_cmbpassorfailKeyPressed

    private void txtBarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyPressed
        if (evt.getKeyCode() == 10) {
            txtexamdate.grabFocus();
        }
    }//GEN-LAST:event_txtBarcodeKeyPressed

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
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                writtenExamDetails dialog = new writtenExamDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbpassorfail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtadmissiono;
    private javax.swing.JFormattedTextField txtexamdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtresult;
    // End of variables declaration//GEN-END:variables

    private void loadtabl() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"
                    + "writtenexamresult.customer_register_id,\n"
                    + "writtenexamresult.examDate,\n"
                    + "writtenexamresult.writtenResult,\n"
                    + "writtenexamresult.passOrFail,\n"
                    + "uniquecustomerdetails.`name`\n"
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register ,\n"
                    + "uniquecustomerdetails\n"
                    + "WHERE\n"
                    + "writtenexamresult.customer_register_id = customer_register.id AND\n"
                    + "customer_register.admission_no = '" + txtadmissiono.getText() + "' AND\n"
                    + "customer_register.nic = uniquecustomerdetails.nic");
            while (rs.next()) {
                txtname.setText(rs.getString(6));
                int id = rs.getInt(1);
                String date = rs.getString(3);
                String result = rs.getString(4);
                String pass = rs.getString(5);
                Object o[] = {id, date, result, pass};
                dtm.addRow(o);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "customer_register.id,\n"
                    + "uniquecustomerdetails.`name`\n"
                    + "FROM\n"
                    + "customer_register\n"
                    + "INNER JOIN uniquecustomerdetails ON customer_register.uniqueCustomerDetails_id = uniquecustomerdetails.id\n"
                    + "WHERE\n"
                    + "customer_register.admission_no = '" + txtadmissiono.getText().trim() + "'");
            while (rs.next()) {
                txtname.setText(rs.getString(2));
                cusid = rs.getInt(1);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        //  txtexamdate.grabFocus();
    }

    private void clear() {
        txtid.setText("");
        // txtexamdate.setText("");
        txtresult.setText("");
        cmbpassorfail.setSelectedIndex(0);
        txtBarcode.setText("");
    }

    private void submit() {
        
        if (isDateExist()) {
            com.Messages.errorjoption("You entered date is already exist!");
        }else{
           save();
        }
        
       
    }

    private boolean isNotIDAlreadyExistInDB() {
        boolean bol = true;

//        try {
//            
//        } catch (Exception e) {
//        }
        try {

            ResultSet rs = model.db.getData("SELECT\n"
                    + "customer_register.barcode\n"
                    + "FROM\n"
                    + "customer_register\n"
                    + "WHERE\n"
                    + "customer_register.admission_no = '" + txtadmissiono.getText().trim() + "'");
            if (rs.next()) {
                bol = false;
                Messages.warningjoption("Barcode Already exist! ");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bol;
    }

    private boolean isDateExist() {
    
        boolean bol=false;
        String selectDate=txtexamdate.getText();
        
        for (int i = 0; i < tbl.getRowCount(); i++) {
           
            String tblDate=tbl.getValueAt(i, 1).toString();
            
            if (selectDate.equals(tblDate)) {
                //System.out.println("ok "+tblDate);
                bol=true;
                break;
            }
            
        }
        
       
        return bol;
    
    }

    private void save() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
//        boolean bol = true;

        if (cmbpassorfail.getSelectedIndex() == 0) {
            com.Messages.errorjoption("Select Pass or Fail!");
            cmbpassorfail.grabFocus();

        } else {
            if (txtid.getText().isEmpty()) {
               
                   
                        
                          try {
                            model.db.putData("INSERT INTO writtenexamresult(customer_register_id,examDate,writtenResult,passOrFail)"
                                    + "values('" + cusid + "','" + txtexamdate.getText() + "','" + txtresult.getText() + "','" + cmbpassorfail.getSelectedItem() + "')");
                            if (!txtBarcode.getText().isEmpty()) {
                                model.db.putData("UPDATE customer_register set barcode='" + txtBarcode.getText().trim() + "' where id='" + cusid + "'  ");
                                System.out.println("barcode id " + cusid);

                            } else {
                                com.Messages.warningjoption("Barcode is already exist");

                            }

                            model.db.putData("INSERT INTO log(date,description,username)values(NOW(),'" + "written exam add" + "',"
                                    + "'" + userstatus.LodUser + "')");
                            com.Messages.normaljoption("Data Saved!");
                            loadtabl();
                           
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
                
            } else {
                try {
                    model.db.putData("UPDATE writtenexamresult set examDate='" + txtexamdate.getText() + "',"
                            + "writtenResult='" + txtresult.getText() + "',passOrFail='" + cmbpassorfail.getSelectedItem() + "' "
                            + "WHERE id='" + txtid.getText() + "' ");

                    model.db.putData("INSERT INTO log(date,description,username)values(NOW(),'" + "written exam updated" + "',"
                            + "'" + userstatus.LodUser + "')");
                    com.Messages.normaljoption("Data Updated!");
                    loadtabl();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }

        }
        clear();
    }
}
