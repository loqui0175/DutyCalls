
package dutycalls;

import javax.swing.*;
import java.awt.*;


public class HomePage extends javax.swing.JFrame {

    
    public HomePage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDutyCallsTag = new javax.swing.JLabel();
        btnPVP = new javax.swing.JButton();
        btnPVC = new javax.swing.JButton();
        btnLeaderBoards = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDutyCallsTag.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        lblDutyCallsTag.setForeground(new java.awt.Color(255, 255, 255));
        lblDutyCallsTag.setText("Duty Calls");
        getContentPane().add(lblDutyCallsTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 87, -1, -1));

        btnPVP.setBackground(new java.awt.Color(0, 102, 153));
        btnPVP.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnPVP.setForeground(new java.awt.Color(255, 255, 255));
        btnPVP.setText("Player VS Player");
        btnPVP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPVPActionPerformed(evt);
            }
        });
        getContentPane().add(btnPVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 157, -1, -1));

        btnPVC.setBackground(new java.awt.Color(0, 102, 153));
        btnPVC.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnPVC.setForeground(new java.awt.Color(255, 255, 255));
        btnPVC.setText("Player VS Computer");
        btnPVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPVCActionPerformed(evt);
            }
        });
        getContentPane().add(btnPVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 211, -1, -1));

        btnLeaderBoards.setBackground(new java.awt.Color(0, 102, 153));
        btnLeaderBoards.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnLeaderBoards.setForeground(new java.awt.Color(255, 255, 255));
        btnLeaderBoards.setText("Leaderboards");
        btnLeaderBoards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaderBoardsActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeaderBoards, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 265, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 102, 153));
        btnExit.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit Game");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 319, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dutycalls/Images/mainBG.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //button to play to PVP game mode
    private void btnPVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPVPActionPerformed

        ChooseCharacter pvp = new ChooseCharacter();
        pvp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPVPActionPerformed
    
    //button to View LeaderBoards
    private void btnLeaderBoardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaderBoardsActionPerformed
        // TODO add your handling code here:
        LeaderBoards leaderBoards = new LeaderBoards();
        leaderBoards.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLeaderBoardsActionPerformed

    //button to go back to the LoginPage
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        LoginPage login = new LoginPage();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    //button to play PVC game mode
    private void btnPVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPVCActionPerformed
        PlayerVsComputer pvc = new PlayerVsComputer();
        pvc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPVCActionPerformed
  
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(() -> new HomePage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLeaderBoards;
    private javax.swing.JButton btnPVC;
    private javax.swing.JButton btnPVP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDutyCallsTag;
    // End of variables declaration//GEN-END:variables
}
