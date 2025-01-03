/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.bakeease.views;

/**
 *
 * @author piyushkarn
 */
public class LoadingScreen extends javax.swing.JFrame {

    /** Creates new form loadingScreen */
    public LoadingScreen() {
        initComponents();
        loadingProgressScreen();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLoadingScreenBackground = new javax.swing.JPanel();
        progressBarLoadingScreen = new javax.swing.JProgressBar();
        lblLoadingScreenBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1450, 950));

        pnlLoadingScreenBackground.setMaximumSize(new java.awt.Dimension(1450, 950));
        pnlLoadingScreenBackground.setMinimumSize(new java.awt.Dimension(1450, 950));
        pnlLoadingScreenBackground.setPreferredSize(new java.awt.Dimension(1450, 950));
        pnlLoadingScreenBackground.setLayout(null);
        pnlLoadingScreenBackground.add(progressBarLoadingScreen);
        progressBarLoadingScreen.setBounds(180, 720, 1060, 50);

        lblLoadingScreenBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/loading screen.png"))); // NOI18N
        pnlLoadingScreenBackground.add(lblLoadingScreenBackground);
        lblLoadingScreenBackground.setBounds(0, 0, 1450, 950);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLoadingScreenBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLoadingScreenBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // method to load the loading screen
    private void loadingProgressScreen(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // using for loop to adjust the delay of the loading screen
                    for (int i = 0; i <= 100; i++) {
                        progressBarLoadingScreen.setValue(i); // Update progress bar value
                        Thread.sleep(50); // Add a delay of 50ms
                    }
                    // setting the login Page as set visible TRUE
                    new LoginPage().setVisible(true);
                    // to dispose the loading screen
                    dispose();
                } 
                catch (Exception e) {
                    e.printStackTrace(); // Print exception details
                }
            }
        }).start();
    }
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
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLoadingScreenBackground;
    private javax.swing.JPanel pnlLoadingScreenBackground;
    private javax.swing.JProgressBar progressBarLoadingScreen;
    // End of variables declaration//GEN-END:variables

}