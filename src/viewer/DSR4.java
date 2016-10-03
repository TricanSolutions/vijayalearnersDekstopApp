/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.Format;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lasitha Ranawaka
 */
public class DSR4 extends javax.swing.JDialog {

    /**
     * Creates new form template
     */
    public DSR4(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtdate.grabFocus();
        txtdate.selectAll();

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
        jLabel2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pass_numbers = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_pass_average = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_fail_numbers = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_fail_average = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DSR4 ");
        jLabel1.setOpaque(true);

        tblWrittenExamDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Admission No", "Barcode", "Name", "Pass", "Fail", "Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jLabel2.setText("Find by Date");

        try {
            txtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdate.setText("2016-08-08");
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Summery of Result");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No of Passed");

        jLabel5.setText("Numbers");

        jLabel6.setText("Average");

        txt_pass_average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pass_averageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("No of Failed");

        jLabel8.setText("Numbers");

        jLabel9.setText("Average");

        txt_fail_average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fail_averageActionPerformed(evt);
            }
        });

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pass_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_pass_average, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(68, 68, 68)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_fail_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_fail_average, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pass_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pass_average, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fail_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fail_average, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        find();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        find();
    }//GEN-LAST:event_txtdateActionPerformed

    private void txt_pass_averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pass_averageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pass_averageActionPerformed

    private void txt_fail_averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fail_averageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fail_averageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            JRTableModelDataSource dataSource;
             dataSource = new JRTableModelDataSource(tblWrittenExamDetails.getModel());
            //String reportSource = "c:\\reports\\viewInvoice.jrxml";
            String reportSource = "src/reports/dsr4.jrxml";
            Map<String, Object> params = new HashMap<String, Object>();

            params.put("date", String.valueOf(txtdate.getText()));
            params.put("numbers_of_pass", String.valueOf(txt_pass_numbers.getText()));
            params.put("pass_average", String.valueOf(txt_pass_average.getText()));
            params.put("numbers_of_fails", String.valueOf(txt_fail_numbers.getText()));
            params.put("fail_average", String.valueOf(txt_fail_average.getText()));
            params.put("total", String.valueOf(txtTotal.getText()));
            

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params,dataSource);

            // JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.viewReport(jasperPrint, false);
//            JasperPrintManager.printReport(jasperPrint, true);

            // JasperPrintManager.printReport(jasperPrint, false);
            // this.dispose();
//            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
//            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DSR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DSR4 dialog = new DSR4(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWrittenExamDetails;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txt_fail_average;
    private javax.swing.JTextField txt_fail_numbers;
    private javax.swing.JTextField txt_pass_average;
    private javax.swing.JTextField txt_pass_numbers;
    private javax.swing.JFormattedTextField txtdate;
    // End of variables declaration//GEN-END:variables

    private void loadtbl() {
//        DefaultTableModel dtm = (DefaultTableModel) tblWrittenExamDetails.getModel();
//        dtm.setRowCount(0);
//        try {
//            ResultSet rs = model.db.getData("SELECT\n"
//                    + "writtenexamresult.id,\n"
//                    + "customer_register.admission_no,\n"
//                    + "customer_register.nic,\n"
//                    + "writtenexamresult.examDate,\n"
//                    + "writtenexamresult.writtenResult,\n"
//                    + "writtenexamresult.passOrFail\n"
//                    + "\n"
//                    + "FROM\n"
//                    + "writtenexamresult ,\n"
//                    + "customer_register\n"
//                    + "WHERE\n"
//                    + "writtenexamresult.customer_register_id = customer_register.id\n"
//                    + "ORDER BY\n"
//                    + "customer_register.admission_no ASC");
//
//            while (rs.next()) {
//                String id = rs.getString(1);
//                String admno = rs.getString(2);
//                String nic = rs.getString(3);
//                String date = rs.getString(4);
//                String result = rs.getString(5);
//                String status = rs.getString(6);
//                Object arr[] = {id, admno, nic, date, result, status};
//                dtm.addRow(arr);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void find() {
        DefaultTableModel dtm = (DefaultTableModel) tblWrittenExamDetails.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"//1
                    + "writtenexamresult.customer_register_id,\n"//2
                    + "writtenexamresult.examDate,\n"//3
                    + "writtenexamresult.writtenResult,\n"//4
                    + "writtenexamresult.passOrFail,\n"//5
                    + "customer_register.admission_no,\n"//6
                    + "customer_register.barcode,\n"//7
                    + "uniquecustomerdetails.namewithinitial\n"//8
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register ,\n"
                    + "uniquecustomerdetails\n"
                    + "WHERE\n"
                    + "writtenexamresult.examDate = '" + txtdate.getText() + "' AND\n"
                    + "writtenexamresult.customer_register_id = customer_register.id AND\n"
                    + "customer_register.uniqueCustomerDetails_id = uniquecustomerdetails.id\n"
                    + "ORDER BY\n"
                    + "customer_register.admission_no ASC");
            int a = 1;
            
            while (rs.next()) {
                String pass = "";
                String fail = "";
                String absent = "";

                String admno = rs.getString(6);
                String barcode = rs.getString(7);
                String name = rs.getString(8);
                if (rs.getString(5).equals("Pass")) {
                    pass = rs.getString(5);
                } else if (rs.getString(5).equals("Fail")) {
                    fail = rs.getString(5);
                } else if (rs.getString(5).equals("Absent")) {
                    absent = rs.getString(5);

                }
//                String absent = rs.getString(6);
                Object arr[] = {a, admno, barcode, name, pass, fail, absent};
                dtm.addRow(arr);
                a++;

            }
           
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        /////////////////////////pass//////////////////////////////////////////
        double b=0;
         for (int i = 0; i < tblWrittenExamDetails.getRowCount(); i++) {
                if (dtm.getValueAt(i, 4).toString().equals("Pass")) {   
                    b++;
                    
                }
                
            }
         txt_pass_numbers.setText(""+b);
         
         double tot=tblWrittenExamDetails.getRowCount();
      
         
//         double finalvalue=((b/(b+c))*100);
//        
//         txt_pass_average.setText(""+Format.nf2d.format(finalvalue));
         ///////////////////pass end//////////////////////////////////////////
         //////////////////////fail start///////////////////////////////
        double c=0;
        for (int i = 0; i < tblWrittenExamDetails.getRowCount(); i++) {
                if (dtm.getValueAt(i, 5).toString().equals("Fail")) {   
                    c++;
                    
                }
                
            }
         txt_fail_numbers.setText(""+c);
         double failtot=tblWrittenExamDetails.getRowCount();
      
         
         double finalvaluefail=((c/(b+c))*100);
        
         txt_fail_average.setText(""+Format.nf2d.format(finalvaluefail));
         
         //////////////////////fail ends///////////////////////////////
         
         double finalvalue=((b/(b+c))*100);
        
         txt_pass_average.setText(""+Format.nf2d.format(finalvalue));
         
         int total=(int) (b+c);
         txtTotal.setText(""+total);
        
    }
}