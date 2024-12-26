package com.bakeease.views;

import com.bakeease.model.adminModel;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author piyushkarn
 */
public class adminPage extends javax.swing.JFrame {

    /**
     * Creates new form adminPage
     */
    public adminPage() {
        initComponents();
    }

    // Create an linked list to store product data
    LinkedList<adminModel> productList = new LinkedList<>();

    // method to add bakery Items to table row
    public void addBakeryItems(adminModel bakeryItems) {
        productList.add(bakeryItems);
        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
        Object[] data = new Object[]{
            bakeryItems.getProductName(), bakeryItems.getQuantity(), bakeryItems.getPrice()
        };
        model.addRow(data);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdminBackground = new javax.swing.JPanel();
        btnDeleteRow = new javax.swing.JButton();
        lblEnterDetails = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        lblAdminText = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtFldProductName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtFldQuantity = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtFldPrice = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblProductId = new javax.swing.JLabel();
        txtFldProductId = new javax.swing.JTextField();
        lblAdminTable = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        lblAdminBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(null);

        pnlAdminBackground.setMaximumSize(new java.awt.Dimension(1400, 900));
        pnlAdminBackground.setMinimumSize(new java.awt.Dimension(1400, 900));
        pnlAdminBackground.setSize(new java.awt.Dimension(1400, 900));
        pnlAdminBackground.setLayout(null);

        btnDeleteRow.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteRow.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDeleteRow.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRow.setText("Delete Records");
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(btnDeleteRow);
        btnDeleteRow.setBounds(950, 580, 170, 50);

        lblEnterDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblEnterDetails.setText("Enter Details");
        pnlAdminBackground.add(lblEnterDetails);
        lblEnterDetails.setBounds(140, 210, 240, 40);

        btnReturn.setBackground(new java.awt.Color(255, 51, 51));
        btnReturn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/return icon.png"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(btnReturn);
        btnReturn.setBounds(10, 10, 80, 56);

        lblAdminText.setFont(new java.awt.Font("Helvetica Neue", 2, 48)); // NOI18N
        lblAdminText.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminText.setText("Admin");
        pnlAdminBackground.add(lblAdminText);
        lblAdminText.setBounds(1180, 30, 140, 50);

        lblProductName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblProductName.setText("Enter Product Name:");
        pnlAdminBackground.add(lblProductName);
        lblProductName.setBounds(30, 350, 180, 40);

        txtFldProductName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtFldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldProductNameActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(txtFldProductName);
        txtFldProductName.setBounds(260, 350, 210, 40);

        lblQuantity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblQuantity.setText("Enter Quantity:");
        pnlAdminBackground.add(lblQuantity);
        lblQuantity.setBounds(30, 420, 180, 40);

        txtFldQuantity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        pnlAdminBackground.add(txtFldQuantity);
        txtFldQuantity.setBounds(260, 420, 210, 40);

        lblPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPrice.setText("Enter price:");
        pnlAdminBackground.add(lblPrice);
        lblPrice.setBounds(30, 490, 180, 40);

        txtFldPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        pnlAdminBackground.add(txtFldPrice);
        txtFldPrice.setBounds(260, 490, 210, 40);

        btnClear.setBackground(new java.awt.Color(255, 102, 102));
        btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(btnClear);
        btnClear.setBounds(300, 570, 130, 50);

        btnSubmit.setBackground(new java.awt.Color(102, 255, 102));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(btnSubmit);
        btnSubmit.setBounds(60, 570, 130, 50);

        lblProductId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblProductId.setText("Enter Product Id:");
        pnlAdminBackground.add(lblProductId);
        lblProductId.setBounds(30, 290, 180, 40);

        txtFldProductId.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtFldProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldProductIdActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(txtFldProductId);
        txtFldProductId.setBounds(260, 290, 210, 40);

        lblAdminTable.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblAdminTable.setText("Admin Table");
        pnlAdminBackground.add(lblAdminTable);
        lblAdminTable.setBounds(930, 180, 230, 30);

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Price"
            }
        ));
        scrollPaneTable.setViewportView(adminTable);

        pnlAdminBackground.add(scrollPaneTable);
        scrollPaneTable.setBounds(630, 250, 740, 300);

        lblAdminBackground.setForeground(new java.awt.Color(255, 102, 102));
        lblAdminBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/admin.png"))); // NOI18N
        pnlAdminBackground.add(lblAdminBackground);
        lblAdminBackground.setBounds(0, 0, 1400, 900);

        getContentPane().add(pnlAdminBackground);
        pnlAdminBackground.setBounds(0, 0, 1400, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        // creating object of home page
        homePage home = new homePage();
        // Set the homePage visible
        home.setVisible(true);
        // set current page visible as false
        setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed
    
    /*
    method that checks for duplicate product
    Ensures that same products are not added
     */
    private boolean checkDuplicateProduct(adminModel bakeryItems) {
        for (adminModel existingBakeryItem : productList) {
            if (existingBakeryItem.getProductId() == bakeryItems.getProductId()) {
                return true;
            }
        }
        return false;
    }

    /*
    Method to add data to table.
    A part of CRUD operations.
     */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // validate empty fields
        if (txtFldProductName.getText().equals("") || txtFldQuantity.getText().equals("") || txtFldPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Fields Detected!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // parsing the supposed strings values into integer
                int quantityInt = Integer.parseInt(txtFldQuantity.getText());
                int priceInt = Integer.parseInt(txtFldPrice.getText());

                // Get input values
                String productName = txtFldProductName.getText();
                int quantity = Integer.parseInt(txtFldQuantity.getText());
                int price = Integer.parseInt(txtFldPrice.getText());
                int productId = Integer.parseInt(txtFldProductId.getText());

                // stating a valid condition as TRUE initially
                boolean isCorrect = true;

                if (isCorrect) {
                    // creating object of adminModel class to pass values in parameters
                    adminModel newBakeryItem = new adminModel(productName, quantity, price, productId);
                    if (checkDuplicateProduct(newBakeryItem)) {
                        JOptionPane.showMessageDialog(null, "Same product already exists. \nPlease change the product information and try again.", "Same products found", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        addBakeryItems(newBakeryItem);
                        JOptionPane.showMessageDialog(null, "Product added succesfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Product Id, Quantity and Price must be in numeric form!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    /* method to remove selected row
    A part of CRUD operations
     */
    private void txtFldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldProductNameActionPerformed

    private void txtFldProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldProductIdActionPerformed
  
    // using a private method to delete data from table row
    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
        int selectedRow = adminTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Select a row to be deleted.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Row deleted succesfully!", "Row Deleted", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    // method to clear text fields
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtFldProductName.setText("");
        txtFldProductId.setText("");
        txtFldQuantity.setText("");
        txtFldPrice.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAdminBackground;
    private javax.swing.JLabel lblAdminTable;
    private javax.swing.JLabel lblAdminText;
    private javax.swing.JLabel lblEnterDetails;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JPanel pnlAdminBackground;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTextField txtFldPrice;
    private javax.swing.JTextField txtFldProductId;
    private javax.swing.JTextField txtFldProductName;
    private javax.swing.JTextField txtFldQuantity;
    // End of variables declaration//GEN-END:variables
}
