package com.bakeease.views;

import javax.swing.JOptionPane;

/**
 *
 * @author piyushkarn
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBackgroundPanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        chkBoxShowPassword = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        loginBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(1000, 600));

        loginBackgroundPanel.setMaximumSize(new java.awt.Dimension(1400, 900));
        loginBackgroundPanel.setMinimumSize(new java.awt.Dimension(1400, 900));
        loginBackgroundPanel.setPreferredSize(new java.awt.Dimension(1400, 900));
        loginBackgroundPanel.setLayout(null);

        usernameTextField.setBackground(new java.awt.Color(193, 126, 112));
        usernameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        usernameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        loginBackgroundPanel.add(usernameTextField);
        usernameTextField.setBounds(470, 350, 460, 80);

        passwordTextField.setBackground(new java.awt.Color(193, 126, 112));
        passwordTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passwordTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        loginBackgroundPanel.add(passwordTextField);
        passwordTextField.setBounds(470, 450, 460, 70);

        chkBoxShowPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        chkBoxShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        chkBoxShowPassword.setText("Show password");
        chkBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxShowPasswordActionPerformed(evt);
            }
        });
        loginBackgroundPanel.add(chkBoxShowPassword);
        chkBoxShowPassword.setBounds(770, 530, 160, 30);

        loginButton.setBackground(new java.awt.Color(195, 121, 96));
        loginButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginBackgroundPanel.add(loginButton);
        loginButton.setBounds(480, 580, 450, 50);

        loginBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/login page.png"))); // NOI18N
        loginBackgroundPanel.add(loginBackgroundImage);
        loginBackgroundImage.setBounds(0, -130, 1400, 1150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // method to login to the system
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // validating empty fields
        if (usernameTextField.getText().equals("") || passwordTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter credentials.");
        } else if (usernameTextField.getText().equals("admin") && passwordTextField.getText().equals("admin")) {
            setVisible(false);
            // creating object of home page
            homePage home = new homePage();
            // Set the homePage visible
            home.setVisible(true);
        } else {
            // instruction to enter credentials correctly
            usernameTextField.setText("");
            passwordTextField.setText("");
            JOptionPane.showMessageDialog(null, "Enter credentials correctly.");
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    // method to enable check box to show and hide password
    private void chkBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxShowPasswordActionPerformed
        // checkbox to show password
        if (chkBoxShowPassword.isSelected()) {
            passwordTextField.setEchoChar((char) 0); // Show password
        } else {
            // hide password again
            passwordTextField.setEchoChar('*'); // Mask password
        }
    }//GEN-LAST:event_chkBoxShowPasswordActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBoxShowPassword;
    private javax.swing.JLabel loginBackgroundImage;
    private javax.swing.JPanel loginBackgroundPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
