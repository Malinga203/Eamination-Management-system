
package package1;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class frmReattemptMarks extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmReattemptMarks.class.getName());

    
    public frmReattemptMarks() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtStdID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtExNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVmarks = new javax.swing.JTextField();
        txtRepMarks = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtWEMarks = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1330, 785));

        txtStdID.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Enter Student ID");

        txtExNo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel2.setText("Enter Exam No");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setText("Enter VivaMarks");

        txtVmarks.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        txtRepMarks.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtRepMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepMarksActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setText("Enter ReportMarks");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setText("Enter Written Exam Marks");

        txtWEMarks.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(101, 42));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExNo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWEMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtExNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtWEMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       //Going back to Admin Page
        frmAdmin frm1 = new frmAdmin();
        frm1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      //getting the text from the textfields
      //variables to get the text from the TextFields 
       String stdID = txtStdID.getText();
       String exmNO = txtExNo.getText();
       
       //variables only to check conditions
       String VImarks = txtVmarks.getText();
       String REmarks  = txtRepMarks.getText();
       String WrEmarks = txtWEMarks.getText();
       
       
       
       //Condition to check if any of the fields are blank
       if (VImarks.equals("") || REmarks.equals("") || WrEmarks.equals(""))
       {
           //Error Message
           JOptionPane.showMessageDialog(null,"Error: Please fill All the fields ","Error",JOptionPane.ERROR_MESSAGE);
       }
       
       else
       {
            //variables to set the data to the objects
            double Vmarks =Double.parseDouble( txtVmarks.getText());
           double Rmarks =Double.parseDouble( txtRepMarks.getText());
            double WEmarks =Double.parseDouble( txtWEMarks.getText());
           //Checking if the marks are within 0 and 100
            if (( Vmarks > 100.0) ||Vmarks < 0.0 || Rmarks > 100.0 || Rmarks <0.0 || WEmarks > 100.0 || WEmarks<0.0 )
            {
                JOptionPane.showMessageDialog(null,"Error: Invalid Marks", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //creating object to access the methods
                 RepeatStudent rpstd =new RepeatStudent();
                //setting values for the Variables
                rpstd.setStdDetails(stdID);
                rpstd.setexamID(exmNO);
                rpstd.setCWMarks(Vmarks, Rmarks);
                rpstd.setWEMarks(WEmarks);
       
                try {
                    //adding these to the database
                    rpstd.AdminsetReattemptDetailstoDB();
                    //message to diaplay if data inserted Successfully
                    JOptionPane.showMessageDialog(null,"Added Successfully","Added",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    System.getLogger(frmReattemptMarks.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                    //message to display SQL error
                    JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
       }
       
       }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtRepMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepMarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepMarksActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new frmReattemptMarks().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtExNo;
    private javax.swing.JTextField txtRepMarks;
    private javax.swing.JTextField txtStdID;
    private javax.swing.JTextField txtVmarks;
    private javax.swing.JTextField txtWEMarks;
    // End of variables declaration//GEN-END:variables
}
