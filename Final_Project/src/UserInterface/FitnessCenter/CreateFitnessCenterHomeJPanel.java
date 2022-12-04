/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FitnessCenter;

import Business.Employee.Emp;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.FitnessCenter.FitnessCenter;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajsarode
 */
public class CreateFitnessCenterHomeJPanel extends javax.swing.JPanel {
    private Enterprise enterprise;
    private FitnessCenter fitnesscenter;
    /**
     * Creates new form CreateFitnessCenterJPanel
     */
    public CreateFitnessCenterHomeJPanel() {
        initComponents();
        this.enterprise = enterprise;
        populateTable();
        btnSubmit.setEnabled(false);
        lblFitnessCenterNameValidation.setVisible(false);
        lblAddressValidation.setVisible(false);
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFitnessCenter.getModel();
        model.setRowCount(0);

        for (FitnessCenter fitnesscenter : enterprise.getFitnesscenterDirectory().getFitnessCentersArray()) {
            Object[] row = new Object[2];
            row[0] = fitnesscenter;
            row[1] = fitnesscenter.getFitnessCenterAddress();
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

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFitnessCenter = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblFitnessCenterName = new javax.swing.JLabel();
        txtFitnessCenterName = new javax.swing.JTextField();
        lblFitnessCenterNameValidation = new javax.swing.JLabel();
        lblFitnesssCenterUsername = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddressValidation = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 40)); // NOI18N
        jLabel1.setText("Create Fitness Center");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tblFitnessCenter.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        tblFitnessCenter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fitness Center Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFitnessCenter);

        btnModify.setBackground(new java.awt.Color(79, 173, 177));
        btnModify.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(79, 173, 177));
        btnDelete.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(633, 633, 633)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        jLabel2.setText("Create Fitness Center");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        lblFitnessCenterName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblFitnessCenterName.setText("Fitness Center Name:");

        txtFitnessCenterName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        txtFitnessCenterName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFitnessCenterNameFocusGained(evt);
            }
        });
        txtFitnessCenterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFitnessCenterNameActionPerformed(evt);
            }
        });
        txtFitnessCenterName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFitnessCenterNameKeyTyped(evt);
            }
        });

        lblFitnessCenterNameValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblFitnessCenterNameValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblFitnessCenterNameValidation.setText("jLabel2");

        lblFitnesssCenterUsername.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblFitnesssCenterUsername.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });

        lblAddressValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblAddressValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblAddressValidation.setText("jLabel2");

        btnSubmit.setBackground(new java.awt.Color(79, 173, 177));
        btnSubmit.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(79, 173, 177));
        btnCreate.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblFitnessCenterName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFitnesssCenterUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddressValidation)
                                    .addComponent(lblFitnessCenterNameValidation)
                                    .addComponent(txtFitnessCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFitnessCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFitnessCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblFitnessCenterNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFitnesssCenterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblAddressValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(915, 915, 915))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(272, 272, 272))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblFitnessCenter.getSelectedRow();

        if (selectedRowIndex < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to modify", false);
            btnModify.setEnabled(true);
            return;
        }

        btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
        btnSubmit.setEnabled(true);

        DefaultTableModel model = (DefaultTableModel) tblFitnessCenter.getModel();
        FitnessCenter fitnesscenter = (FitnessCenter) model.getValueAt(selectedRowIndex, 0);
        txtFitnessCenterName.setText(fitnesscenter.getFitnessCenterName());
        txtAddress.setText(fitnesscenter.getFitnessCenterAddress());
        fitnesscenter = fitnesscenter;
        this.enterprise.getFitnesscenterDirectory().deleteFitnessCenter(txtFitnessCenterName.getText());
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRowIndex = tblFitnessCenter.getSelectedRow();

        if (selectedRowIndex < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to delete", false);
            return;
        }

        // DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        FitnessCenter fitnesscenter = (FitnessCenter) tblFitnessCenter.getValueAt(selectedRowIndex, 0);

        String name = fitnesscenter.getFitnessCenterName();
        this.enterprise.getFitnesscenterDirectory().deleteFitnessCenter(name);
        populateTable();

        Toast toast = new Toast(mainPanel, "FitnessCenter deleted successfully", true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtFitnessCenterNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFitnessCenterNameFocusGained
        // TODO add your handling code here:
        lblFitnessCenterNameValidation.setVisible(false);
    }//GEN-LAST:event_txtFitnessCenterNameFocusGained

    private void txtFitnessCenterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFitnessCenterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFitnessCenterNameActionPerformed

    private void txtFitnessCenterNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFitnessCenterNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFitnessCenterNameKeyTyped

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
        lblAddressValidation.setVisible(false);
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void hideShowValidation(JLabel lbl, String errorMessage) {
        if (errorMessage.isEmpty()) {
            lbl.setVisible(false);
        } else {
            lbl.setText(errorMessage);
            lbl.setVisible(true);
        }
    }
    
    private boolean isValidData() {
        boolean isValid = true;

        if (txtFitnessCenterName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblFitnessCenterNameValidation, "Please enter name");

        }
        if (txtAddress.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblAddressValidation, "Please enter address");
        }

        return isValid;
    }
    
    private void saveData() {

        String fitnesscenterName = txtFitnessCenterName.getText();
        String fitnesscenterAddr = txtAddress.getText();

//        Employee employee = pharmacy.getEmployeeDirectory().createEmployee(name);
//        UserAccount ua = pharmacy.getUserAccountDirectory().createUserAccount(username, password, employee, new PharmacyAdminRole());
        
        FitnessCenter fitnesscenter = this.enterprise.createFitnessCenter(fitnesscenterName);
        fitnesscenter.setFitnessCenterAddress(fitnesscenterAddr);
        populateTable();

        btnSubmit.setEnabled(false);
        btnModify.setEnabled(true);
        btnCreate.setEnabled(true);
        btnDelete.setEnabled(true);
        txtFitnessCenterName.setText("");
        txtAddress.setText("");

        populateTable();
        
        Toast toast = new Toast(mainPanel, "Hospital updated successfully", true);
    }
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        if (isValidData()) {
            saveData();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (isValidData()){

            String fitnesscenterName = txtFitnessCenterName.getText();
            String fitnesscenterAddress = txtAddress.getText();

            FitnessCenter fitnesscenter = this.enterprise.createFitnessCenter(fitnesscenterName);
            fitnesscenter.setFitnessCenterAddress(fitnesscenterAddress);
            txtFitnessCenterName.setText("");
            txtAddress.setText("");
            populateTable();

            Toast toast = new Toast(mainPanel, "FitnessCenter added successfully", true);
        }
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddressValidation;
    private javax.swing.JLabel lblFitnessCenterName;
    private javax.swing.JLabel lblFitnessCenterNameValidation;
    private javax.swing.JLabel lblFitnesssCenterUsername;
    private javax.swing.JTable tblFitnessCenter;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFitnessCenterName;
    // End of variables declaration//GEN-END:variables
}
