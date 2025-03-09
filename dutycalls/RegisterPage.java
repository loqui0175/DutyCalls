/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dutycalls;

import javax.swing.JOptionPane;

/**
 *
 * @author loqui
 */
public class RegisterPage extends javax.swing.JFrame {

    public RegisterPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDutyCallsTag = new javax.swing.JLabel();
        lblNameLogIn = new javax.swing.JLabel();
        lblPasswordLogIn = new javax.swing.JLabel();
        txtfldUsername = new javax.swing.JTextField();
        pswrdfldPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblPasswordLogIn1 = new javax.swing.JLabel();
        pswrdfldPassword1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDutyCallsTag.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        lblDutyCallsTag.setForeground(new java.awt.Color(255, 255, 255));
        lblDutyCallsTag.setText("Duty Calls");
        getContentPane().add(lblDutyCallsTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 89, -1, -1));

        lblNameLogIn.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lblNameLogIn.setForeground(new java.awt.Color(255, 255, 255));
        lblNameLogIn.setText("Username:");
        getContentPane().add(lblNameLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 162, -1, -1));

        lblPasswordLogIn.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lblPasswordLogIn.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordLogIn.setText("Password:");
        getContentPane().add(lblPasswordLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 111, 25));

        txtfldUsername.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        txtfldUsername.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(txtfldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 159, 207, -1));

        pswrdfldPassword.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        pswrdfldPassword.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(pswrdfldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 212, 207, -1));

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 136, -1));

        btnRegister.setBackground(new java.awt.Color(0, 102, 153));
        btnRegister.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 136, -1));

        lblPasswordLogIn1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lblPasswordLogIn1.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordLogIn1.setText("Password:");
        getContentPane().add(lblPasswordLogIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 273, 111, 25));

        pswrdfldPassword1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        pswrdfldPassword1.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(pswrdfldPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 265, 207, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dutycalls/Images/mainBG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //button to go back to LoginPage after Registry
    //Rejects the button if text fields are empty
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        LoginPage logPage = new LoginPage();
        String username = txtfldUsername.getText();
        char[] passwordArray = pswrdfldPassword.getPassword();
        char[] passwordArray1 = pswrdfldPassword1.getPassword();
        String password = new String(passwordArray);
        String password1 = new String(passwordArray1);

        if(username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your username.", "Important", JOptionPane.WARNING_MESSAGE);
        }else if(password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your password.", "Important", JOptionPane.WARNING_MESSAGE);
        }else if(password1.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your password.", "Important", JOptionPane.WARNING_MESSAGE);
        }else if(!password.equals(password1)){
            JOptionPane.showMessageDialog(null, "Password doesn't match.", "Important", JOptionPane.WARNING_MESSAGE);
        }else{
            logPage.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LoginPage login = new LoginPage();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDutyCallsTag;
    private javax.swing.JLabel lblNameLogIn;
    private javax.swing.JLabel lblPasswordLogIn;
    private javax.swing.JLabel lblPasswordLogIn1;
    private javax.swing.JPasswordField pswrdfldPassword;
    private javax.swing.JPasswordField pswrdfldPassword1;
    private javax.swing.JTextField txtfldUsername;
    // End of variables declaration//GEN-END:variables
}
