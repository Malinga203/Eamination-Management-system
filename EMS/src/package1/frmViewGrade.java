
package package1;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class frmViewGrade extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmViewGrade.class.getName());

  
    public frmViewGrade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExmNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStdID = new javax.swing.JTextField();
        txtWEGrade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCWGrade = new javax.swing.JTextField();
        txtFinalGrade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassFail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnViewGrade = new javax.swing.JButton();
        btnBacktoStudent = new javax.swing.JButton();
        txtGPA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1330, 785));

        txtExmNo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Examination No");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Student ID");

        txtStdID.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtWEGrade.setEditable(false);
        txtWEGrade.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setText("Written Exam Grade");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setText("Coursework Grade");

        txtCWGrade.setEditable(false);
        txtCWGrade.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtCWGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCWGradeActionPerformed(evt);
            }
        });

        txtFinalGrade.setEditable(false);
        txtFinalGrade.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setText("Final Grade");

        txtPassFail.setEditable(false);
        txtPassFail.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel6.setText("Pass/Fail");

        btnViewGrade.setBackground(new java.awt.Color(204, 204, 204));
        btnViewGrade.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnViewGrade.setText("View");
        btnViewGrade.setPreferredSize(new java.awt.Dimension(101, 42));
        btnViewGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewGradeActionPerformed(evt);
            }
        });

        btnBacktoStudent.setBackground(new java.awt.Color(204, 204, 204));
        btnBacktoStudent.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnBacktoStudent.setText("Back");
        btnBacktoStudent.setPreferredSize(new java.awt.Dimension(101, 42));
        btnBacktoStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoStudentActionPerformed(evt);
            }
        });

        txtGPA.setEditable(false);
        txtGPA.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel7.setText("GPA");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel8.setText("Total");

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtExmNo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBacktoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassFail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCWGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWEGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(btnViewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExmNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWEGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCWGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassFail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBacktoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacktoStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoStudentActionPerformed
        //opening the student page and closing this page 
        frmstudent stdpage = new frmstudent();
        stdpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBacktoStudentActionPerformed

    private void btnViewGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewGradeActionPerformed
       
        //Variables to get the text from the text fields
        String stdid = txtStdID.getText();
        String exmid = txtExmNo.getText();
        
        //checks if any fields are empty
        if (stdid.equals("")||exmid.equals(""))
        {
            //error message
             JOptionPane.showMessageDialog(null,"Error: Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);

        }
        else 
        {
            //creating a batch student object
             BatchStudent std1 = new BatchStudent();
             
             //seeting studemt details
            std1.setStdDetails(stdid);
            std1.setexamID(exmid);

            try {
                //Get the grades from the database
                std1.getGradefromDB();
                
                String CWGrade =std1.getCWGrade();
                String WEGrade = std1.getWEGrade();
                String FinalGrade = std1.getFinalGrade();
                String passfail = std1.getPassFail();
                double GPA = std1.getGPA();
                double Total = std1.getTotalMarks();
                //checking if the any of the Attributes are null
                if (CWGrade == null && WEGrade== null && FinalGrade== null && passfail== null && GPA == 0.0 && Total ==0.0)
                {
                   JOptionPane.showMessageDialog(null, "Error: Check the Index and Exam number, No Exam Grade Available", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                //set the text field 
                txtCWGrade.setText(std1.getCWGrade());
                txtWEGrade.setText(std1.getWEGrade());
                txtFinalGrade.setText(std1.getFinalGrade());
                txtGPA.setText(Double.toString(std1.getGPA()));
                txtTotal.setText(Double.toString(std1.getTotalMarks()));
                txtPassFail.setText(std1.getPassFail());
                }

            } catch (SQLException ex) {
                System.getLogger(frmViewGrade.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
           
        }
       }
    }//GEN-LAST:event_btnViewGradeActionPerformed

    private void txtCWGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCWGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCWGradeActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new frmViewGrade().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacktoStudent;
    private javax.swing.JButton btnViewGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCWGrade;
    private javax.swing.JTextField txtExmNo;
    private javax.swing.JTextField txtFinalGrade;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtPassFail;
    private javax.swing.JTextField txtStdID;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtWEGrade;
    // End of variables declaration//GEN-END:variables
}
