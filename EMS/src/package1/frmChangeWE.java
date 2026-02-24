
package package1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frmChangeWE extends javax.swing.JFrame {
   //frmExamDetails frm1 = new frmExamDetails(); 
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmChangeWE.class.getName());

   
    public frmChangeWE() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNewDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnChangeWE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnChangeViva = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnChangeSub = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtExamNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1330, 785));

        txtNewDate.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtNewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewDateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Enter New Date");

        btnChangeWE.setBackground(new java.awt.Color(204, 204, 204));
        btnChangeWE.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnChangeWE.setText("Change");
        btnChangeWE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeWEActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Change Written Exam Date");

        btnChangeViva.setBackground(new java.awt.Color(204, 204, 204));
        btnChangeViva.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnChangeViva.setText("Change");
        btnChangeViva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeVivaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setText("Change Viva Date");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setText("Change Submission Date");

        btnChangeSub.setBackground(new java.awt.Color(204, 204, 204));
        btnChangeSub.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnChangeSub.setText("Change");
        btnChangeSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSubActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setText("Examination No.");

        txtExamNo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtExamNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamNoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setPreferredSize(new java.awt.Dimension(101, 42));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setText("Use the Format YYYY-MM-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(86, 86, 86)
                                    .addComponent(btnChangeWE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(txtExamNo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNewDate, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnChangeSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnChangeViva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(319, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExamNo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnChangeWE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnChangeViva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnChangeSub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewDateActionPerformed

    private void txtExamNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamNoActionPerformed

    private void btnChangeWEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeWEActionPerformed
        //variables to get the text from the text fields
        String exno = txtExamNo.getText();
        String WEnewdate = txtNewDate.getText();
        
        //checks if any fields are null
        if (WEnewdate.equals("") || exno.equals(""))
        {
            //error message
             JOptionPane.showMessageDialog(null,"Error: Please Enter All fields","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Creating a written Examintaion Object a
            WrittenExam ex1 = new WrittenExam();
            
            
            //setting exam details
            ex1.setExamDetails(exno);
            ex1.changeDate(WEnewdate);
            
            try {
                
                //Updating the database
                 ex1.updateDBWE();
                  JOptionPane.showMessageDialog(null,"Changed Successfully ","Changed ",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                 Logger.getLogger(frmChangeWE.class.getName()).log(Level.SEVERE, null, ex);
                  JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage() ,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnChangeWEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Goes Back to Admin Page
        frmAdmin f1 = new frmAdmin();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnChangeVivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeVivaActionPerformed
     //variables to get the text from the text fields
        String exno = txtExamNo.getText();
        String Vivanewdate = txtNewDate.getText();
        
         //checks if any fields are null
        if (Vivanewdate.equals("") || exno.equals(""))
        {
             JOptionPane.showMessageDialog(null,"Error: Please Enter All fields","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
             //Creating a coursework object
             Coursework cw1 = new Coursework();
             
             //setting exam details
             cw1.setExamDetails(exno);
             cw1.changeDateviva(Vivanewdate);
        
            try {
                //Updating the database
                cw1.updatevivaDBCW();
                JOptionPane.showMessageDialog(null,"Changed Successfully ","Changed ",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(frmChangeWE.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage() ,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnChangeVivaActionPerformed

    private void btnChangeSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSubActionPerformed
       //variables to get the text from the text fields
        String exno = txtExamNo.getText();
        String Subnewdate = txtNewDate.getText();
        
         if (Subnewdate.equals("") || exno.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Error: Please Enter All fields","Error",JOptionPane.ERROR_MESSAGE);
        }
         else
         {
             //Creating a coursework object
             Coursework cw1 = new Coursework();
             
             //setting exam details
             cw1.setExamDetails(exno);
             cw1.changeDatesub(Subnewdate);
        
        
            try {
                //Updating the database
                cw1.updatesubDBCW();
                JOptionPane.showMessageDialog(null,"Changed Successfully ","Changed ",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                 Logger.getLogger(frmChangeWE.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage() ,"Error",JOptionPane.ERROR_MESSAGE);
        }
         }
    }//GEN-LAST:event_btnChangeSubActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new frmChangeWE().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeSub;
    private javax.swing.JButton btnChangeViva;
    private javax.swing.JButton btnChangeWE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtExamNo;
    private javax.swing.JTextField txtNewDate;
    // End of variables declaration//GEN-END:variables
}
