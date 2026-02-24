
package package1;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class frmExamDetails extends javax.swing.JFrame {
    
   
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmExamDetails.class.getName());

    
    public frmExamDetails() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        txtExamName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtExamDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddDetails = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtExamNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtVivaDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSubDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtExamName.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtExamName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtExamName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExamNameMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Examination Name");

        txtExamDate.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtExamDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExamDateMouseClicked(evt);
            }
        });
        txtExamDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamDateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Written Exam Date");

        btnAddDetails.setBackground(new java.awt.Color(204, 204, 204));
        btnAddDetails.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnAddDetails.setText("ADD");
        btnAddDetails.setPreferredSize(new java.awt.Dimension(101, 42));
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setText("Examination No.");

        txtExamNo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtExamNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtExamNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExamNoMouseClicked(evt);
            }
        });
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
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setText("YYYY-MM-DD Follow this Format");

        txtVivaDate.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtVivaDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVivaDateMouseClicked(evt);
            }
        });
        txtVivaDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVivaDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setText("Viva Date");

        jLabel6.setText("YYYY-MM-DD Follow this Format");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel7.setText("Report Submission Date");

        txtSubDate.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtSubDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSubDateMouseClicked(evt);
            }
        });
        txtSubDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubDateActionPerformed(evt);
            }
        });

        jLabel8.setText("YYYY-MM-DD Follow this Format");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtExamNo)
                            .addComponent(txtExamName)
                            .addComponent(txtExamDate)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVivaDate)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubDate)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExamNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExamName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExamDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVivaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExamNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExamNameMouseClicked
       
    }//GEN-LAST:event_txtExamNameMouseClicked

    private void txtExamDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExamDateMouseClicked
        
    }//GEN-LAST:event_txtExamDateMouseClicked

    
    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed
   
       //Variables to get the text from the textFields
       String exName = txtExamName.getText();
       String exNo = txtExamNo.getText();
       String WEDate = txtExamDate.getText();
       String VivaDate = txtVivaDate.getText();
       String SubDate = txtVivaDate.getText();
       //Condition to check if any of the fields are blank
       if (exName.equals("") || exNo.equals("") || WEDate.equals("") || VivaDate.equals("") || SubDate.equals(""))
       {
           //Error Message
           JOptionPane.showMessageDialog(null,"Error: Please fill All the fields ","Error",JOptionPane.ERROR_MESSAGE);
       }
       else 
       {
           //Creating Written exam object to access the methods
            WrittenExam we1 = new WrittenExam();
           Coursework cw1= new Coursework();
           //Set exam Details using setter
           
            we1.setExamDetails(exName,exNo);
            cw1.setExamDetails(exNo);
            cw1.setDateCW(VivaDate,SubDate);
            we1.setDateWE(WEDate);
       
       
        try {
            //adding the data to the Database
            we1.addToDBWE();
            cw1.addToDBCW();
             JOptionPane.showMessageDialog(null,"Added Sucessfully ","Added",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(frmExamDetails.class.getName()).log(Level.SEVERE, null, ex);
            //Error message if data wasnt added succesfully
            JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
       }
        
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    private void txtExamNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExamNoMouseClicked
     
    }//GEN-LAST:event_txtExamNoMouseClicked

    private void txtExamNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Going back to the Admin Page
        frmAdmin ad1 = new frmAdmin();
        ad1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtExamDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamDateActionPerformed

    private void txtVivaDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVivaDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVivaDateMouseClicked

    private void txtVivaDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVivaDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVivaDateActionPerformed

    private void txtSubDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubDateMouseClicked

    private void txtSubDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubDateActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new frmExamDetails().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField txtExamDate;
    private javax.swing.JTextField txtExamName;
    private javax.swing.JTextField txtExamNo;
    private javax.swing.JTextField txtSubDate;
    private javax.swing.JTextField txtVivaDate;
    // End of variables declaration//GEN-END:variables
}

