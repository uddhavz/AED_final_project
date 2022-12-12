/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CountyEnterpriseAdmin;

import Business.County.County;
import Business.Employee.Emp;
import Business.Enterprise.Enterprise;
import Business.Role.ShippingManagerRole;
import Business.UserAccount.UserAccount;
import UserInterface.CallDialog;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanmayzope
 */
public class ManageShippingPartnerJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    
    /**
     * Creates new form ManageShippingPartnerJPanel
     */
    public ManageShippingPartnerJPanel(Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        populatePicker();
        lblUsernameValidation.setVisible(false);
        lblShippingPartnerNameValidation.setVisible(false);
        lblPasswordValidation.setVisible(false);
        
    }
    
    private void populatePicker() {
        CountyPicker.removeAllItems();
        int i = 0;
        for (County county : enterprise.getCountyDirectory().getCountyDirectoryArray()) {
            if (i == 0) {
                populateTable(county);
                i++;
            }
            CountyPicker.addItem(county);
        }
    }
    
    private void populateTable(County county) {
        DefaultTableModel model = (DefaultTableModel) tblShippingPartners.getModel();
        model.setRowCount(0);

        String dm = "Shipping Manager";

        for (UserAccount us : county.getUserAccountDirectory().getUserAccountList()) {
            if (us.getRole().toString().equals(dm)) {
                Object[] row = new Object[2];
                row[0] = us;
                row[1] = us.getEmp().getName();
                model.addRow(row);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShippingPartners = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblPharmacyName = new javax.swing.JLabel();
        CountyPicker = new javax.swing.JComboBox();
        lblAdminName = new javax.swing.JLabel();
        txtShippingPartnerName = new javax.swing.JTextField();
        lblShippingPartnerNameValidation = new javax.swing.JLabel();
        lblPharmacyUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsernameValidation = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPasswordValidation = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(79, 173, 177));

        jPanel3.setBackground(new java.awt.Color(102, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setMaximumSize(new java.awt.Dimension(1350, 1200));
        jPanel3.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setText("Shipping Partner Details");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnModify.setBackground(new java.awt.Color(102, 204, 0));
        btnModify.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 204, 0));
        btnDelete.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblShippingPartners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Shipping Partner Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblShippingPartners);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel2.setText("Add Shipping Partner Details");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        lblPharmacyName.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblPharmacyName.setText("County Name:");

        CountyPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CountyPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountyPickerActionPerformed(evt);
            }
        });

        lblAdminName.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblAdminName.setText("Shipping Partner Name:");

        txtShippingPartnerName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtShippingPartnerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtShippingPartnerNameFocusGained(evt);
            }
        });
        txtShippingPartnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShippingPartnerNameActionPerformed(evt);
            }
        });
        txtShippingPartnerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtShippingPartnerNameKeyTyped(evt);
            }
        });

        lblShippingPartnerNameValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblShippingPartnerNameValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblShippingPartnerNameValidation.setText("jLabel2");

        lblPharmacyUsername.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblPharmacyUsername.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        lblUsernameValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblUsernameValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblUsernameValidation.setText("jLabel2");

        lblPassword.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblPassword.setText("Password");

        lblPasswordValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPasswordValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblPasswordValidation.setText("jLabel2");

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(102, 204, 0));
        btnSubmit.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblPasswordValidation)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lblPharmacyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsernameValidation)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdminName)
                            .addComponent(lblPharmacyName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShippingPartnerNameValidation)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CountyPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtShippingPartnerName)))))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtShippingPartnerName, txtUsername});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPharmacyName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountyPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShippingPartnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblShippingPartnerNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPharmacyUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblUsernameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblPasswordValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtShippingPartnerName, txtUsername});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1638, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1638, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        County county = (County) CountyPicker.getSelectedItem();
        int selectedRowIndex = tblShippingPartners.getSelectedRow();

        if(selectedRowIndex<0){
            CallDialog callDialog = new CallDialog(mainPanel, "Please select a row to modify", false);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblShippingPartners.getModel();
        UserAccount us = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        txtUsername.setText(us.getUsername());
        txtPassword.setText(us.getPassword());
        txtShippingPartnerName.setText(us.getEmp().getName());
        county.getUserAccountDirectory().removeUser(us);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        County county = (County) CountyPicker.getSelectedItem();

        int selectedRow = tblShippingPartners.getSelectedRow();
        if (selectedRow < 0) {
            CallDialog callDialog = new CallDialog(mainPanel, "Please select a row to delete", false);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblShippingPartners.getModel();

        UserAccount us = (UserAccount) model.getValueAt(selectedRow, 0);

        county.getEmpDirectory().deleteEmp(us.getEmp());
        county.getUserAccountDirectory().removeUser(us);

        populateTable(county);

        CallDialog callDialog = new CallDialog(mainPanel, "Shipping partner deleted successfully", true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void CountyPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountyPickerActionPerformed

        County county = (County) CountyPicker.getSelectedItem();
        if (county != null) {
            populateTable(county);
        }
    }//GEN-LAST:event_CountyPickerActionPerformed

    private void txtShippingPartnerNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtShippingPartnerNameFocusGained
        // TODO add your handling code here:
        lblShippingPartnerNameValidation.setVisible(false);
    }//GEN-LAST:event_txtShippingPartnerNameFocusGained

    private void txtShippingPartnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShippingPartnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShippingPartnerNameActionPerformed

    private void txtShippingPartnerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtShippingPartnerNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShippingPartnerNameKeyTyped

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        lblUsernameValidation.setVisible(false);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        lblPasswordValidation.setVisible(false);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        lblPasswordValidation.setVisible(false);
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String name = txtShippingPartnerName.getText();

        if (isValidData()) {
            County county = (County) CountyPicker.getSelectedItem();

            Emp employee = county.getEmpDirectory().createEmp(name);
            UserAccount ua = county.getUserAccountDirectory().createUserAccount(username, password, employee, new ShippingManagerRole());

            populateTable(county);

            txtUsername.setText("");
            txtPassword.setText("");
            txtShippingPartnerName.setText("");
            btnDelete.setEnabled(true);
            btnModify.setEnabled(true);

            CallDialog callDialog = new CallDialog(mainPanel, "Shipping partner added successfully", true);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private boolean isValidData() {
        boolean isValid = true;
        boolean isValidName = txtShippingPartnerName.getText().matches("^[a-zA-Z]+$");
        boolean isValidUsername = txtUsername.getText().matches("^[a-zA-Z0-9]+$");

        if (txtShippingPartnerName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblShippingPartnerNameValidation, "Please enter name");

        } 
//        else if (!isValidName) {
//            isValid = false;
//            hideShowValidation(lblShippingPartnerNameValidation, "Please enter name in correct format");
//
//        }
        if (txtUsername.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblUsernameValidation, "Please enter username");

        } else if (!isValidUsername) {
            isValid = false;
            hideShowValidation(lblUsernameValidation, "Please enter username in correct format");
        }
        if (txtPassword.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblPasswordValidation, "Please enter password");
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
    private javax.swing.JComboBox CountyPicker;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordValidation;
    private javax.swing.JLabel lblPharmacyName;
    private javax.swing.JLabel lblPharmacyUsername;
    private javax.swing.JLabel lblShippingPartnerNameValidation;
    private javax.swing.JLabel lblUsernameValidation;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblShippingPartners;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtShippingPartnerName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
