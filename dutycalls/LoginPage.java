/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dutycalls;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
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
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
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
        txtfldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtfldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 159, 207, -1));

        pswrdfldPassword.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        pswrdfldPassword.setForeground(new java.awt.Color(0, 102, 153));
        getContentPane().add(pswrdfldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 212, 207, -1));

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
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 379, 136, -1));

        btnLogin.setBackground(new java.awt.Color(0, 102, 153));
        btnLogin.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 311, 136, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dutycalls/Images/mainBG.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //button to go to RegisterPage
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RegisterPage regPage = new RegisterPage();
        regPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    //button to click Login
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        HomePage homePage = new HomePage();
        String username = txtfldUsername.getText();
        char[] passwordArray = pswrdfldPassword.getPassword();
        String password = new String(passwordArray);
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your username.", "Important", JOptionPane.WARNING_MESSAGE);
        }else if(password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your password.", "Important", JOptionPane.WARNING_MESSAGE);
        }else{
            homePage.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtfldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldUsernameActionPerformed
        
    }//GEN-LAST:event_txtfldUsernameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblDutyCallsTag;
    private javax.swing.JLabel lblNameLogIn;
    private javax.swing.JLabel lblPasswordLogIn;
    private javax.swing.JPasswordField pswrdfldPassword;
    private javax.swing.JTextField txtfldUsername;
    // End of variables declaration//GEN-END:variables
}
