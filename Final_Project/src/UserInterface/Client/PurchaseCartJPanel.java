/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Client;

import Business.Client.Client;
import Business.Vendor.Vendor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.State.State;
import Business.Order.Order;
import Business.Produce.Produce;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClientOrderWR;
import UserInterface.CallDialog;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author uddhavzambare
 */

public class PurchaseCartJPanel extends javax.swing.JPanel {

    EcoSystem system;
    UserAccount userAccount;
    Client client;

    /**
     * Creates new form BuyTestKitJPanel
     */
    public PurchaseCartJPanel(UserAccount userAccount, EcoSystem system, Client client) {
        this.system = system;
        this.userAccount = userAccount;
        this.client = client;
        
        initComponents();
        
        lblQuantityValidation.setVisible(false);
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);
        populateTable();
        
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblProduce.getModel();
        model.setRowCount(0);
        
        for (State state: system.getStateList()) {
                for (Enterprise enterprise:state.getEnterpriseDirectory().getEnterpriseListArray()) {
                    if (enterprise.getVendorDirectory() != null) {
                        for (Vendor vendor: enterprise.getVendorDirectory().getVendorsArray()) {
                            for (Produce product:vendor.getProduceDirectory().getProduceArray()) {
                                Object[] row = new Object[3];
                                row[0] = product;
                                row[1] = product.getQuantity();
                                row[2] = product.getPrice();

                                model.addRow(row);
                            }
                        }
                    }
                }
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPlaceOrder = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduce = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddToCart = new javax.swing.JButton();
        lblQuantityValidation = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(102, 204, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        mainPanel.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(1165, 106));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 36)); // NOI18N
        jLabel1.setText("Shopping Cart");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnPlaceOrder.setBackground(new java.awt.Color(102, 204, 0));
        btnPlaceOrder.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlaceOrder.setBorderPainted(false);
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblName1.setText("Message:");

        txtMessage.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMessageFocusGained(evt);
            }
        });
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMessageKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel2.setText("Your Cart Items");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Selected Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        jLabel3.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        jLabel3.setText("Total Price :");

        txtTotalPrice.setText("0");
        txtTotalPrice.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtTotalPrice)
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(367, 367, 367)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMessage, txtTotalPrice});

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tblProduce.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        tblProduce.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Available Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduce);

        jLabel4.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        jLabel4.setText("Quantity:");

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtQuantity.setText("1");
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
        });

        btnAddToCart.setBackground(new java.awt.Color(102, 204, 0));
        btnAddToCart.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnAddToCart.setText("Add to cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblQuantityValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblQuantityValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblQuantityValidation.setText("jLabel2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblQuantityValidation))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(lblQuantityValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(621, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed

            
            String message = txtMessage.getText();
        
            Order order = new Order();

            DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
            int noOfRows = model.getRowCount();
            
            if (noOfRows == 0) {
                CallDialog callDialog = new CallDialog(mainPanel, "Your cart is empty. Please add items first", false);
            } else {
                for(int i=0;i<noOfRows;i++){
                
                    Produce product = (Produce) model.getValueAt(i, 0);
                    
                    Vendor vendor = product.getVendor();
                    Integer quant = (Integer) model.getValueAt(i, 1);
                    System.out.println(product.getProdName());
                    product.setQuantity(product.getQuantity() - quant);
                    order.addItem(product, quant);
                    order.setPrice(product.getPrice()*quant);
                    order.setType("Home");
                    ClientOrderWR request = new ClientOrderWR();
                    request.setMessage(message);
                    request.setSender(userAccount);
                    request.setStatus("Client order placed");
                    request.setOrder(order);
                    request.setClient(client);
                    request.setVendor(vendor);
                    vendor.addOrder(order);
                    vendor.getWorkQueue().getWorkRequestListArray().add(request);
                    userAccount.getWorkQueue().getWorkRequestListArray().add(request);


                }
                CallDialog callDialog = new CallDialog(mainPanel, "Your order is successfully placed", true);
                populateTable();
            }
            
        model.setRowCount(0);   

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void txtMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageFocusGained

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMessageKeyTyped

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblProduce.getSelectedRow();
        if(selectedRowIndex<0) {
            CallDialog callDialog = new CallDialog(mainPanel, "Please select a row", false);
            return;
        }
        
        if (checkQuantityValidation()) {
            DefaultTableModel model = (DefaultTableModel) tblProduce.getModel();
            Produce product = (Produce) model.getValueAt(selectedRowIndex, 0);
            DefaultTableModel model1 = (DefaultTableModel) tblOrder.getModel();

            if (product.getQuantity() < Integer.parseInt(txtQuantity.getText())) {
                CallDialog callDialog = new CallDialog(mainPanel, "Produce not available in adequate quantity", false);
                return;
            }

            Object[] row = new Object[3];
            row[0] = product;
            row[1] = Integer.valueOf(txtQuantity.getText());
            row[2] = Integer.parseInt(txtQuantity.getText())*product.getPrice();
            model1.addRow(row);

            double total = Double.parseDouble(txtTotalPrice.getText()) + Integer.parseInt(txtQuantity.getText())*product.getPrice();
            txtTotalPrice.setText(String.valueOf(total));
            txtQuantity.setText("1");
        }
        
        
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        // TODO add your handling code here:
        lblQuantityValidation.setVisible(false);
    }//GEN-LAST:event_txtQuantityFocusGained
    
    private boolean checkQuantityValidation() {
        boolean isValid = true;
        
        if (txtQuantity.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblQuantityValidation, "Please enter quantity");
            
        } else if (Integer.parseInt(txtQuantity.getText()) == 0) {
            isValid = false;
            hideShowValidation(lblQuantityValidation, "Quantity should be greater than 0");
            
        }
        
        return isValid;
    }
    
    // Common function to hide show validation labels
    private void hideShowValidation(JLabel lbl, String errorMessage) {
        if (errorMessage.isEmpty()) {
            lbl.setVisible(false);
        } else {
            lbl.setText(errorMessage);
            lbl.setVisible(true);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblQuantityValidation;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProduce;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
