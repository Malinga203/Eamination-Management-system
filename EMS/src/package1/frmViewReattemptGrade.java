
package package1;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmViewReattemptGrade extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmViewReattemptGrade.class.getName());

    
    public frmViewReattemptGrade() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtStdID = new javax.swing.JTextField();
        txtExmNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtWEGrade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCWGrade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFinalGrade = new javax.swing.JTextField();
        txtTotalMarks = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGPA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassFail = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1330, 758));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Enter Student ID");

        txtStdID.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtExmNo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Enter ExamNo");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setText("Written Exam Grade ");

        txtWEGrade.setEditable(false);
        txtWEGrade.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtWEGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWEGradeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setText("Coursework Grade");

        txtCWGrade.setEditable(false);
        txtCWGrade.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setText("Final Grade");

        txtFinalGrade.setEditable(false);
        txtFinalGrade.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtTotalMarks.setEditable(false);
        txtTotalMarks.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel6.setText("Total Marks");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel7.setText("GPA");

        txtGPA.setEditable(false);
        txtGPA.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel8.setText("Pass/Fail");

        txtPassFail.setEditable(false);
        txtPassFail.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnView.setText("View");
        btnView.setPreferredSize(new java.awt.Dimension(101, 42));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setPreferredSize(new java.awt.Dimension(101, 42));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExmNo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWEGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCWGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(txtTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassFail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1458, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWEGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtExmNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCWGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassFail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //Going back to the student page
        frmstudent frm = new frmstudent();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        //Variables to get the Text from the TextFieds
          String stdid = txtStdID.getText();
          String exmno = txtExmNo.getText();
          
          //checking if any of the fileds are Empty
          if (stdid.equals("")||exmno.equals(""))
          {
              //error message
             JOptionPane.showMessageDialog(null,"Error: Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);

          }
          else
          {
                     
            //Object to call the methods from the other class
            RepeatStudent rpstd = new RepeatStudent();
            //setting the attributes
            rpstd.setStdDetails(stdid);
            rpstd.setexamID(exmno);

            try {
                //getting the data from the database
                rpstd.getReattemntDetfromDB();
                
        
                
                //Variables to get the returned values from the class
                String CWgrade = rpstd.calcCWGrade();
                String WEgrade = rpstd.calcWEGrade();
                String fGrade = rpstd.calcFinalgrade();
                Double GPA = rpstd.calcGPA();
                String passfail = rpstd.calcPassFail();
                Double tMarks = rpstd.calcTotalmarks();
                
                //setting the text to the Text fields
                txtCWGrade.setText(CWgrade);
                txtWEGrade.setText(WEgrade);
                txtFinalGrade.setText(fGrade);
                txtPassFail.setText(passfail);
                txtGPA.setText(Double.toString(GPA));
                txtTotalMarks.setText(Double.toString(tMarks));
                
            } catch (SQLException ex) {
                System.getLogger(frmViewReattemptGrade.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                 //error message(SQL)
                JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
          }
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtWEGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWEGradeActionPerformed
        
    }//GEN-LAST:event_txtWEGradeActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmViewReattemptGrade().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCWGrade;
    private javax.swing.JTextField txtExmNo;
    private javax.swing.JTextField txtFinalGrade;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtPassFail;
    private javax.swing.JTextField txtStdID;
    private javax.swing.JTextField txtTotalMarks;
    private javax.swing.JTextField txtWEGrade;
    // End of variables declaration//GEN-END:variables
}
