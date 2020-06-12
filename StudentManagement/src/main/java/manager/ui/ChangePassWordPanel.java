/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui;

import java.awt.Color;
import manager.control.ChangePassWordControl;

/**
 *
 * @author Dell
 */
public class ChangePassWordPanel extends javax.swing.JPanel {
    private ChangePassWordControl changePassWordControl;
    /**
     * Creates new form ChangePassWord
     */
    public ChangePassWordPanel() {
        initComponents();
    }
    
    public ChangePassWordPanel(String userName) {
        changePassWordControl = new ChangePassWordControl(userName);
        initComponents();
        userNameField.setText(userName);
    }
    
    public void reset() {
        changePassStatus.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JLabel();
        oldPassLabel = new javax.swing.JLabel();
        oldPasswordField = new javax.swing.JPasswordField();
        newPassLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPassLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        changePassButton = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        changePassStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        hintLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 565));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(4, 2, 0, 30));

        usernameLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(54, 33, 89));
        usernameLabel.setText("Tài khoản:");
        jPanel7.add(usernameLabel);

        userNameField.setBackground(new java.awt.Color(243, 251, 244));
        userNameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        userNameField.setForeground(new java.awt.Color(54, 33, 89));
        userNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        userNameField.setOpaque(true);
        jPanel7.add(userNameField);

        oldPassLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        oldPassLabel.setForeground(new java.awt.Color(54, 33, 89));
        oldPassLabel.setText("Mật khẩu cũ:");
        jPanel7.add(oldPassLabel);

        oldPasswordField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        oldPasswordField.setForeground(new java.awt.Color(54, 33, 89));
        jPanel7.add(oldPasswordField);

        newPassLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        newPassLabel.setForeground(new java.awt.Color(54, 33, 89));
        newPassLabel.setText("Mật khẩu mới:");
        jPanel7.add(newPassLabel);

        newPasswordField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        newPasswordField.setForeground(new java.awt.Color(54, 33, 89));
        jPanel7.add(newPasswordField);

        confirmPassLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        confirmPassLabel.setForeground(new java.awt.Color(54, 33, 89));
        confirmPassLabel.setText("Xác nhận mật khẩu:");
        jPanel7.add(confirmPassLabel);

        confirmPasswordField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(54, 33, 89));
        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });
        jPanel7.add(confirmPasswordField);

        changePassButton.setBackground(new java.awt.Color(64, 43, 100));
        changePassButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        changePassButton.setForeground(new java.awt.Color(255, 255, 255));
        changePassButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassButton.setText("Thay đổi");
        changePassButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changePassButton.setOpaque(true);
        changePassButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                changePassButtonMousePressed(evt);
            }
        });

        changePassStatus.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        changePassStatus.setForeground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        textLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        textLabel.setForeground(new java.awt.Color(64, 43, 100));
        textLabel.setText("Thay đổi mật khẩu");
        jPanel1.add(textLabel);

        hintLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        hintLabel.setForeground(new java.awt.Color(54, 33, 89));
        hintLabel.setText("Thay đổi mật khẩu. Mật khẩu mới phải đạt tối thiểu 8 ký tự.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hintLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changePassStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(changePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(changePassStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(changePassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void changePassButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassButtonMousePressed
        String newPass = LoginUI.getHash(LoginUI.getHash(newPasswordField.getText(), "MD5")
            , "SHA-256");
        String oldPass = LoginUI.getHash(LoginUI.getHash(oldPasswordField.getText(), "MD5")
            , "SHA-256");
        if(newPasswordField.getText().equals(confirmPasswordField.getText())) {
            changePassStatus.setText("");
            if(changePassWordControl.changePassword(oldPass, newPass)) {
                changePassStatus.setForeground(Color.green);
                changePassStatus.setText("Your password has been updated successfully");
            } else {
                changePassStatus.setForeground(Color.red);
                changePassStatus.setText("Current password is incorrect.");
            }
        } else {
            changePassStatus.setForeground(Color.red);
            changePassStatus.setText("Your new password and confirmation don't match.");
        }
    }//GEN-LAST:event_changePassButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changePassButton;
    private javax.swing.JLabel changePassStatus;
    private javax.swing.JLabel confirmPassLabel;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel oldPassLabel;
    private javax.swing.JPasswordField oldPasswordField;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel userNameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}