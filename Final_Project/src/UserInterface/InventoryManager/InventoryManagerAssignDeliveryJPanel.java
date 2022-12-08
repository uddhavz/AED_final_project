/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.InventoryManager;

import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import Business.Vendor.Vendor;
import Business.WorkQueue.ClientOrderWR;
import Business.WorkQueue.WorkRequest;
import UserInterface.CallDialog;
import static UserInterface.MainJFrame.mainPanel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajsarode
 */
public class InventoryManagerAssignDeliveryJPanel extends javax.swing.JPanel {
    
    private UserAccount userAccount;
    private ArrayList<Enterprise> countyEnterpriseArray;
    private Vendor vendor;
    
    /**
     * Creates new form InventoryManagerAssignDeliveryJPanel
     */
    public InventoryManagerAssignDeliveryJPanel(UserAccount userAccount, ArrayList<Enterprise> countyEnterpriseArray, Vendor vendor) {
        initComponents();
        
        this.userAccount = userAccount;
        this.countyEnterpriseArray = countyEnterpriseArray;
        this.vendor = vendor;
        
        populateTable();
        populateDeliveryPicker();
        
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
        model.setRowCount(0);
        
        ArrayList<WorkRequest> workReq = vendor.getWorkQueue().getWorkRequestListArray();
        
        for (int i=workReq.size()-1; i>=0; i--) {
            
            ClientOrderWR req = (ClientOrderWR)workReq.get(i);
            Order order = req.getOrder();
                Object[] row = new Object[5];
                row[0] = req;
                row[1] = order.getId();
                row[2] = order.getQuantity();
                row[3] = order.getPrice();
                row[4] = req.getStatus();
                
                model.addRow(row);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblOrders = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        panelSendToDoctor1 = new javax.swing.JPanel();
        btnAssignDelivery = new javax.swing.JButton();
        lblAssignHomeDeliveryPartner = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deliveryPicker = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 36)); // NOI18N
        jLabel1.setText("Process Order & Assign Delivery Man");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblOrders.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        lblOrders.setText("Orders");
        lblOrders.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOrders.setIconTextGap(0);

        btnAccept.setBackground(new java.awt.Color(255, 153, 153));
        btnAccept.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(255, 153, 153));
        btnReject.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        tblOrders.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Order ID", "Quantity", "Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelSendToDoctor1.setBackground(new java.awt.Color(255, 255, 255));
        panelSendToDoctor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnAssignDelivery.setBackground(new java.awt.Color(255, 153, 153));
        btnAssignDelivery.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnAssignDelivery.setText("Assign");
        btnAssignDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryActionPerformed(evt);
            }
        });

        lblAssignHomeDeliveryPartner.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        lblAssignHomeDeliveryPartner.setText("Assign Delivery Partner");
        lblAssignHomeDeliveryPartner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAssignHomeDeliveryPartner.setIconTextGap(0);

        jLabel7.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        jLabel7.setText("Select Home Delivery Partner:");

        deliveryPicker.setBackground(new java.awt.Color(79, 173, 177));
        deliveryPicker.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        deliveryPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelSendToDoctor1Layout = new javax.swing.GroupLayout(panelSendToDoctor1);
        panelSendToDoctor1.setLayout(panelSendToDoctor1Layout);
        panelSendToDoctor1Layout.setHorizontalGroup(
            panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSendToDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAssignHomeDeliveryPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSendToDoctor1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliveryPicker, 0, 325, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSendToDoctor1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAssignDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelSendToDoctor1Layout.setVerticalGroup(
            panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSendToDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAssignHomeDeliveryPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(panelSendToDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSendToDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0){
            CallDialog calldialog = new CallDialog(mainPanel, "Please select a row to accept", false);
            return;
        }

        WorkRequest request = (WorkRequest) tblOrders.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Customer order placed")){
            request.setStatus("Customer Order Accepted");
            CallDialog calldialog = new CallDialog(mainPanel, "Order accepted successfully", true);

        } else if (request.getStatus().equals("Retail Order placed")){
            request.setStatus("Retail Order Accepted");
            CallDialog calldialog = new CallDialog(mainPanel, "Order accepted successfully", true);

        } else {
            CallDialog calldialog = new CallDialog(mainPanel, "Order cannot be accepted/rejected", false);
        }
        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0) {
            CallDialog calldialog = new CallDialog(mainPanel, "Please select a row to reject", false);
            return;
        }

        WorkRequest request = (WorkRequest) tblOrders.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Customer order placed")){
            request.setStatus("Rejected");
            CallDialog calldialog = new CallDialog(mainPanel, "Order rejected successfully", true);

        } else if (request.getStatus().equals("Retail Order placed")){
            request.setStatus("Rejected");
            CallDialog calldialog = new CallDialog(mainPanel, "Order rejected successfully", true);

        } else {
            CallDialog calldialog = new CallDialog(mainPanel, "Order cannot be accepted/rejected", false);
        }
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAssignDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0) {
            CallDialog calldialog = new CallDialog(mainPanel, "Please select a row to assign", false);
            return;
        }

        String value = tblOrders.getModel().getValueAt(selectedRow, 4).toString();

        if (value.contains("Retail")) {
            CallDialog calldialog = new CallDialog(mainPanel, "Please assign this order to pharmacy delivery partner", false);

        } else {
            ClientOrderWR request = (ClientOrderWR) tblOrders.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Customer Order Accepted")) {

                UserAccount ua = (UserAccount)deliveryPicker.getSelectedItem();
                request.setReceiver(ua);
                request.setStatus("On the way");
                populateTable();

                CallDialog calldialog = new CallDialog(mainPanel, "Order assigned successfully", true);

            } else if (request.getStatus().equals("Customer order placed")) {
                CallDialog calldialog = new CallDialog(mainPanel, "Please accept the order first", false);

            } else {
                CallDialog calldialog = new CallDialog(mainPanel, "Order cannot be assigned", false);

            }
        }

    }//GEN-LAST:event_btnAssignDeliveryActionPerformed
    
    private void populateDeliveryPicker(){
        deliveryPicker.removeAllItems();
        
        String role = "Delivery Man";
        
        for (UserAccount ua: vendor.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().toString().equals(role)) {
                deliveryPicker.addItem(ua);
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssignDelivery;
    private javax.swing.JButton btnReject;
    private javax.swing.JComboBox deliveryPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignHomeDeliveryPartner;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JPanel panelSendToDoctor1;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
