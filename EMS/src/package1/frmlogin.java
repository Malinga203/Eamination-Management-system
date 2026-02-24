
package package1;


import java.sql.*;
import javax.swing.JOptionPane;


public class frmlogin extends javax.swing.JFrame {
    
    //Creating a Static Connection Variable to get the SQL Database Connection
    static Connection conn;
    
    //SQL URL
    String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    //SQL username
    String user = "root";
    //sql PAssword
    String pswd = "1234";
                
                
                
    

 
    public frmlogin() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgDBconnection = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Database was not Connected Successfully");

        javax.swing.GroupLayout dlgDBconnectionLayout = new javax.swing.GroupLayout(dlgDBconnection.getContentPane());
        dlgDBconnection.getContentPane().setLayout(dlgDBconnectionLayout);
        dlgDBconnectionLayout.setHorizontalGroup(
            dlgDBconnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDBconnectionLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        dlgDBconnectionLayout.setVerticalGroup(
            dlgDBconnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDBconnectionLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1330, 785));

        lblUsername.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        lblUsername.setText("Username");
        lblUsername.setName("lblUsername"); // NOI18N

        txtUsername.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        lblPassword.setText("Password");
        lblPassword.setName("lblusername"); // NOI18N

        txtPassword.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        txtPassword.setToolTipText("");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setPreferredSize(new java.awt.Dimension(101, 42));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(101, 42));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/geometric-gradient-futuristic-background_23-2149116406.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(txtPassword)))
                        .addGap(39, 39, 39)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(lblUsername)
                .addGap(27, 27, 27)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblPassword)
                .addGap(27, 27, 27)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       //Variables to Getthe text from the textfields
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        
        //Conditions checked to connect
        if (username.equals("Admin")&& password.equals("1234"))
        {

            try {
                //Connecting the database
                Class.forName("com.mysql.cj.jdbc.Driver");
                 conn = DriverManager.getConnection(url,user,pswd);
                 //Message to show if LOgin was Sucessfull
                 JOptionPane.showMessageDialog(null,"Login Sucessfull","Login",JOptionPane.INFORMATION_MESSAGE);
                 //Opening Admin page 
                frmAdmin admin = new frmAdmin();
                admin.setVisible(true);
                //closing the current page
                this.dispose();
                 
            } catch (ClassNotFoundException | SQLException ex) {
                
                System.getLogger(frmlogin.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                JOptionPane.showMessageDialog(null,"Database not COnnected Succefully","Login",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (username.equals("Student")&& password.equals("5678"))
        {

            try{
                //Connecting the Database
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url,user,pswd);
                
                //message to show if connetion successful and login is also successful
                JOptionPane.showMessageDialog(null,"Login Sucessfull","Login",JOptionPane.INFORMATION_MESSAGE);
                //Opening a New Student page
                frmstudent std1 = new frmstudent();
                std1.setVisible(true);
                //closing the current page
                this.dispose();
                 
            } catch (ClassNotFoundException | SQLException ex) {
                System.getLogger(frmlogin.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                JOptionPane.showMessageDialog(null,"Database not COnnected Succefully","Login",JOptionPane.ERROR_MESSAGE);
            }

        }
        else if (username.equals("Admin")||username.equals("Student"))
        {
            //error message
            JOptionPane.showMessageDialog(null,"Wrong Password","Login",JOptionPane.ERROR_MESSAGE);
        }
        else if (password.equals("1234") || password.equals("5678"))
        {
           //error message
            JOptionPane.showMessageDialog(null,"Wrong Username","Login",JOptionPane.ERROR_MESSAGE);
        }
        else if (password.equals("")&& username.equals("") )
        {
          //error message
            JOptionPane.showMessageDialog(null,"Please Enter Username and Password","Login",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
          //error message
            JOptionPane.showMessageDialog(null,"Check Username and Password ","Login",JOptionPane.ERROR_MESSAGE);
        }
        

       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //set Text bos to empty when clicked on cancel
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        
    }//GEN-LAST:event_txtUsernameMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(() -> new frmlogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JDialog dlgDBconnection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
