package com.bakeease.views;

import com.bakeease.controller.algorithms.BinarySearch;
import com.bakeease.controller.algorithms.InsertionSort;
import com.bakeease.controller.algorithms.MergeSort;
import com.bakeease.controller.algorithms.SelectionSort;
import com.bakeease.model.adminModel;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author piyushkarn
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        dislayPreLoadedItems();

    }
    // Create an linked list to store product data
    LinkedList<adminModel> productList = new LinkedList<>();

    // method to add bakery Items to table row
    /*
    @param ProductId the product ID
    @param ProductName the product name
    @param Quantity the Quantity
    @param Price the Price
     */
    public void addBakeryItems(adminModel bakeryItems) {
        productList.add(bakeryItems);
        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
        Object[] bakeryData = new Object[]{
            bakeryItems.getProductId(), bakeryItems.getProductName(), bakeryItems.getQuantity(), bakeryItems.getPrice()
        };
        model.addRow(bakeryData);
    }

    /*
    method to display pre loaded bakery items
    validates the data into table row
    @param item1, item2, item3, item4, item5, item6, item7, item8
     */
    public void dislayPreLoadedItems() {
        /*
        creating object of model class
        calling method addBakeryItems() to add bakery items to table row
        passing item object in the method
         */
        adminModel item1 = new adminModel(1, "Crossiant", 22, 420);
        addBakeryItems(item1);

        adminModel item2 = new adminModel(2, "Cake", 12, 300);
        addBakeryItems(item2);

        adminModel item3 = new adminModel(3, "Pastry", 10, 200);
        addBakeryItems(item3);

        adminModel item4 = new adminModel(4, "Cheese Cake", 14, 69);
        addBakeryItems(item4);

        adminModel item5 = new adminModel(5, "Rumballs", 7, 690);
        addBakeryItems(item5);

        adminModel item6 = new adminModel(6, "Whole wheat bread", 4, 120);
        addBakeryItems(item6);

        adminModel item7 = new adminModel(7, "Doughnuts", 5, 60);
        addBakeryItems(item7);

        adminModel item8 = new adminModel(8, "Muffins", 7, 70);
        addBakeryItems(item8);
    }

    // method to check duplicate data in the data
    private boolean checkDuplicateProduct(adminModel bakeryItems) {
        for (adminModel existingBakeryItem : productList) {
            if (existingBakeryItem.getProductId() == bakeryItems.getProductId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdminDashboard = new javax.swing.JPanel();
        lblAdminHeading = new javax.swing.JLabel();
        lblEnterProductId = new javax.swing.JLabel();
        txtFldProductId = new javax.swing.JTextField();
        lblEnterProductId1 = new javax.swing.JLabel();
        lblEnterProductQuantity = new javax.swing.JLabel();
        lblEnterProductName = new javax.swing.JLabel();
        txtFldProductName = new javax.swing.JTextField();
        txtFldPrice = new javax.swing.JTextField();
        txtFldQuantity = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblAdminDashboard = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        btnSortPrice = new javax.swing.JButton();
        txtFldSearchBar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnSortQuantity = new javax.swing.JButton();
        btnSortName = new javax.swing.JButton();
        lblAdminBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setMinimumSize(new java.awt.Dimension(1400, 900));

        pnlAdminDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdminDashboard.setMaximumSize(new java.awt.Dimension(1400, 900));
        pnlAdminDashboard.setMinimumSize(new java.awt.Dimension(1400, 900));
        pnlAdminDashboard.setSize(new java.awt.Dimension(1400, 900));
        pnlAdminDashboard.setLayout(null);

        lblAdminHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblAdminHeading.setText("Enter Details");
        pnlAdminDashboard.add(lblAdminHeading);
        lblAdminHeading.setBounds(170, 200, 230, 70);

        lblEnterProductId.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblEnterProductId.setText("Enter product ID:");
        pnlAdminDashboard.add(lblEnterProductId);
        lblEnterProductId.setBounds(40, 340, 200, 30);

        txtFldProductId.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtFldProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldProductIdActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(txtFldProductId);
        txtFldProductId.setBounds(300, 340, 200, 40);

        lblEnterProductId1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblEnterProductId1.setText("Enter Price:");
        pnlAdminDashboard.add(lblEnterProductId1);
        lblEnterProductId1.setBounds(40, 600, 200, 30);

        lblEnterProductQuantity.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblEnterProductQuantity.setText("Enter Quantity:");
        pnlAdminDashboard.add(lblEnterProductQuantity);
        lblEnterProductQuantity.setBounds(40, 520, 200, 30);

        lblEnterProductName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblEnterProductName.setText("Enter product Name:");
        pnlAdminDashboard.add(lblEnterProductName);
        lblEnterProductName.setBounds(40, 430, 240, 30);

        txtFldProductName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtFldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldProductNameActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(txtFldProductName);
        txtFldProductName.setBounds(300, 430, 200, 40);

        txtFldPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtFldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldPriceActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(txtFldPrice);
        txtFldPrice.setBounds(300, 600, 200, 40);

        txtFldQuantity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtFldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldQuantityActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(txtFldQuantity);
        txtFldQuantity.setBounds(300, 510, 200, 40);

        btnSubmit.setBackground(new java.awt.Color(102, 204, 0));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnSubmit);
        btnSubmit.setBounds(60, 690, 120, 50);

        btnUpdate.setBackground(new java.awt.Color(193, 126, 112));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnUpdate);
        btnUpdate.setBounds(210, 690, 110, 50);

        btnClear.setBackground(new java.awt.Color(255, 102, 102));
        btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnClear);
        btnClear.setBounds(360, 690, 110, 50);

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnDelete);
        btnDelete.setBounds(690, 710, 140, 50);

        lblAdminDashboard.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblAdminDashboard.setText("Admin Dashboard");
        pnlAdminDashboard.add(lblAdminDashboard);
        lblAdminDashboard.setBounds(860, 200, 320, 60);

        adminTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminTable.setRowHeight(30);
        jScrollPane1.setViewportView(adminTable);

        pnlAdminDashboard.add(jScrollPane1);
        jScrollPane1.setBounds(650, 300, 720, 400);

        btnReturn.setBackground(new java.awt.Color(255, 51, 51));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/return icon.png"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnReturn);
        btnReturn.setBounds(20, 20, 110, 60);

        btnSortPrice.setBackground(new java.awt.Color(193, 126, 112));
        btnSortPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSortPrice.setForeground(new java.awt.Color(255, 255, 255));
        btnSortPrice.setText("Sort by Price");
        btnSortPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortPriceActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnSortPrice);
        btnSortPrice.setBounds(1210, 710, 140, 50);

        txtFldSearchBar.setBackground(new java.awt.Color(246, 243, 238));
        txtFldSearchBar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtFldSearchBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 14))); // NOI18N
        pnlAdminDashboard.add(txtFldSearchBar);
        txtFldSearchBar.setBounds(460, 30, 370, 60);

        btnSearch.setBackground(new java.awt.Color(246, 243, 238));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnSearch);
        btnSearch.setBounds(840, 30, 70, 60);

        btnSortQuantity.setBackground(new java.awt.Color(193, 126, 112));
        btnSortQuantity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSortQuantity.setForeground(new java.awt.Color(255, 255, 255));
        btnSortQuantity.setText("Sort by Quantity");
        btnSortQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortQuantityActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnSortQuantity);
        btnSortQuantity.setBounds(850, 710, 168, 50);

        btnSortName.setBackground(new java.awt.Color(193, 126, 112));
        btnSortName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSortName.setForeground(new java.awt.Color(255, 255, 255));
        btnSortName.setText("Sort by Name");
        btnSortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortNameActionPerformed(evt);
            }
        });
        pnlAdminDashboard.add(btnSortName);
        btnSortName.setBounds(1040, 710, 150, 50);

        lblAdminBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bakeease/resource/admin.png"))); // NOI18N
        pnlAdminDashboard.add(lblAdminBackground);
        lblAdminBackground.setBounds(0, 0, 1400, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1394, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdminDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldProductIdActionPerformed

    private void txtFldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldProductNameActionPerformed

    private void txtFldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldPriceActionPerformed

    private void txtFldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldQuantityActionPerformed

    /*
    method to submit data to table row
    @param txtFldProductName for product name
    @param txtFldProductId for product Id
    @param txtFldQuantity for product quantity
    @param txtFldprice for product price
    
    validates empty fields,
    validates integer manipulation
     */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (txtFldProductId.getText().equals("") || txtFldProductName.getText().equals("") || txtFldQuantity.getText().equals("") || txtFldPrice.getText().equals("")) {
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
                    // creating object of AdminModel class to pass values in parameters
                    adminModel newBakeryItem = new adminModel(productId, productName, quantity, price);
                    if (checkDuplicateProduct(newBakeryItem)) {
                        JOptionPane.showMessageDialog(null, "Same product already exists. \nPlease change the product information or try updating product information.", "Same products found", JOptionPane.INFORMATION_MESSAGE);

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

    /*
    method to delete table row records
    @param adminTable for admin table variable name
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
        int selectedRow = adminTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Select a row to be deleted.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Row deleted succesfully!", "Row Deleted", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /*
    method to return back to home page
    creates object of Home frame
     */
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
    method to update table item
    @param product id
    @param product name
    @param product quantity
    @param price
     */
    private void updateItems() {
        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
        // Clear the table before loading new data
        // set model row count to 0 to locate to exact updation location
        model.setRowCount(0);
        // add row for every fields
        for (adminModel products : productList) {
            model.addRow(new Object[]{
                products.getProductId(),
                products.getProductName(),
                products.getQuantity(),
                products.getPrice()

            });

        }
    }

    /*
    update button method
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int Id = Integer.parseInt(txtFldProductId.getText());
        String Name = txtFldProductName.getText();
        int price = Integer.parseInt(txtFldPrice.getText());
        int quantity = Integer.parseInt(txtFldQuantity.getText());

        boolean isValid = true;

        if (isValid) {
            for (adminModel menu : productList) {
                // Matching product id
                if (menu.getProductId() == Id) {
                    menu.setProductName(Name);
                    menu.setQuantity(quantity);
                    menu.setPrice(price);
                    menu.setProductId(Id);

                    // updates product details
                    // calling above update method
                    updateItems();
                    JOptionPane.showMessageDialog(null, "Product information updated succesfully.", "Updated", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /*
    clear text button
    clears all the text fields
    @param txtFldProductName
    @param txtFldProductId
    @param txtFldQuantity
    @param txtFldPrice
     */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (txtFldProductName.getText().equals("") && txtFldProductId.getText().equals("") && txtFldQuantity.getText().equals("") && txtFldPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nothing to clear.", "Not Cleared", JOptionPane.WARNING_MESSAGE);
        } else {
            txtFldProductName.setText("");
            txtFldProductId.setText("");
            txtFldQuantity.setText("");
            txtFldPrice.setText("");
        }
    }//GEN-LAST:event_btnClearActionPerformed

    /*
    method to perform selection sort
    sorts the data in the table according to "price"
     */
    private void loadSortedProductData(List<adminModel> sortedData) {
        DefaultTableModel model = (DefaultTableModel) adminTable.getModel();

        // Clear the table before loading new data
        model.setRowCount(0);

        // Iterate through the LinkedList and add each member to the table
        for (adminModel products : sortedData) {
            model.addRow(new Object[]{
                products.getProductId(),
                products.getProductName(),
                products.getQuantity(),
                products.getPrice()
            });
        }
    }

    /*
    method to execute selection sort for price
    Arranges item price ranging from high to low
    @param adminModel for model
    creates a object sort and handles sorting
    Adds data to list
     */
    private void btnSortPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortPriceActionPerformed
        // TODO add your handling code here:
        SelectionSort sort = new SelectionSort();
        List<adminModel> sortedList = sort.sortByPrice(productList, true);
        loadSortedProductData(sortedList);
    }//GEN-LAST:event_btnSortPriceActionPerformed

    /*
    insertion sort for sort by quantity
    @param adminModel for model
    creates object sortQuantity to handle sorting
    Adds data to list
     */
    private void btnSortQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortQuantityActionPerformed
        // Create an instance of the InsertionSort class
        InsertionSort sortQuantity = new InsertionSort();

        // Ensure productList is properly populated with product data
        // Sort the product list by quantity (descending order in this case)
        List<adminModel> sortedList = sortQuantity.sortByQuantity(productList, true);

        // Load the sorted data into the table
        loadSortedProductData(sortedList);
    }//GEN-LAST:event_btnSortQuantityActionPerformed

    /*
    method to sort by name
    @param adminModel for model
    creates object merge to handle sorting
    adds data to list
     */
    private void btnSortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortNameActionPerformed
        MergeSort sort = new MergeSort();
        List<adminModel> merge = sort.sortByName(productList, true);
        loadSortedProductData(merge);
    }//GEN-LAST:event_btnSortNameActionPerformed

    /*
    button to execute search feature
    instructs user to provide proper details in case product is not found
    Else shows success message
    Also prints message in console
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        MergeSort selectionSort = new MergeSort();
        List<adminModel> sortedList = selectionSort.sortByName(productList, false);
        BinarySearch search = new BinarySearch();
        adminModel searchedData = search.searchByProductName(txtFldSearchBar.getText().trim().toLowerCase(), sortedList, 0, sortedList.size() - 1);
        if (searchedData != null) {
            System.out.println(searchedData.getProductName());
            JOptionPane.showMessageDialog(null, searchedData.getProductName() + " is found.", "Item Found", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Product not found.");
            JOptionPane.showMessageDialog(null, "Item not found. Please check the table or try changing keywords.", "Product Not Found", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSortName;
    private javax.swing.JButton btnSortPrice;
    private javax.swing.JButton btnSortQuantity;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminBackground;
    private javax.swing.JLabel lblAdminDashboard;
    private javax.swing.JLabel lblAdminHeading;
    private javax.swing.JLabel lblEnterProductId;
    private javax.swing.JLabel lblEnterProductId1;
    private javax.swing.JLabel lblEnterProductName;
    private javax.swing.JLabel lblEnterProductQuantity;
    private javax.swing.JPanel pnlAdminDashboard;
    private javax.swing.JTextField txtFldPrice;
    private javax.swing.JTextField txtFldProductId;
    private javax.swing.JTextField txtFldProductName;
    private javax.swing.JTextField txtFldQuantity;
    private javax.swing.JTextField txtFldSearchBar;
    // End of variables declaration//GEN-END:variables
}
