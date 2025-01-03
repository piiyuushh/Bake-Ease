package com.bakeease.views;

/**
 *
 * @author piyushkarn
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public homePage() {
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

        homePageBackgroundPanel = new javax.swing.JPanel();
        orderPageButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        adminPageButton = new javax.swing.JButton();
        viewProductsButton = new javax.swing.JButton();
        homePageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        homePageBackgroundPanel.setMaximumSize(new java.awt.Dimension(1400, 900));
        homePageBackgroundPanel.setMinimumSize(new java.awt.Dimension(1400, 900));
        homePageBackgroundPanel.setLayout(null);

        orderPageButton.setBackground(new java.awt.Color(172, 108, 83));
        orderPageButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        orderPageButton.setForeground(new java.awt.Color(255, 255, 255));
        orderPageButton.setText("Order");
        orderPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderPageButtonActionPerformed(evt);
            }
        });
        homePageBackgroundPanel.add(orderPageButton);
        orderPageButton.setBounds(630, 520, 240, 90);

        exitButton.setBackground(new java.awt.Color(244, 94, 78));
        exitButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        homePageBackgroundPanel.add(exitButton);
        exitButton.setBounds(630, 630, 240, 90);

        adminPageButton.setBackground(new java.awt.Color(172, 108, 83));
        adminPageButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        adminPageButton.setForeground(new java.awt.Color(255, 255, 255));
        adminPageButton.setText("Admin");
        adminPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPageButtonActionPerformed(evt);
            }
        });
        homePageBackgroundPanel.add(adminPageButton);
        adminPageButton.setBounds(890, 520, 240, 90);

        viewProductsButton.setBackground(new java.awt.Color(172, 108, 83));
        viewProductsButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        viewProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewProductsButton.setText("View Products");
        viewProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductsButtonActionPerformed(evt);
            }
        });
        homePageBackgroundPanel.add(viewProductsButton);
        viewProductsButton.setBounds(370, 520, 240, 90);

        homePageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/homePageBackground.png"))); // NOI18N
        homePageBackgroundPanel.add(homePageBackground);
        homePageBackground.setBounds(-10, -60, 1420, 1010);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePageBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePageBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPageButtonActionPerformed
        // creating object of order page
        orderPage order = new orderPage();
        // Set the homePage visible
        order.setVisible(true);

        // set current page visible as false
        setVisible(false);
    }//GEN-LAST:event_orderPageButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
        // terminates the whole program
    }//GEN-LAST:event_exitButtonActionPerformed

    private void adminPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPageButtonActionPerformed
        // TODO add your handling code here:
        // creating object of login page
        AdminPage admin = new AdminPage();
        // setting set visible as True
        admin.setVisible(true);
        // set home page visible as false
        setVisible(false);
    }//GEN-LAST:event_adminPageButtonActionPerformed

    private void viewProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductsButtonActionPerformed
        // TODO add your handling code here:
        viewProductPage product = new viewProductPage();
        // setting the product page frame set visible as TRUE
        product.setVisible(true);
        // set current page visible as false
        setVisible(false);
    }//GEN-LAST:event_viewProductsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminPageButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel homePageBackground;
    private javax.swing.JPanel homePageBackgroundPanel;
    private javax.swing.JButton orderPageButton;
    private javax.swing.JButton viewProductsButton;
    // End of variables declaration//GEN-END:variables
}
