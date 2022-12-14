/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FitnessCenter;


import Business.Employee.Emp;
import Business.Enterprise.Enterprise;
import Business.FitnessCenter.FitnessCenter;
import Business.Role.DietitianRole;
import Business.UserAccount.UserAccount;
import UserInterface.CallDialog;
import static UserInterface.MainJFrame.mainPanel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajsarode
 */
public class CreateDietitianJPanel extends javax.swing.JPanel {
    
    private Enterprise enterprise;
   
    /**
     * Creates new form CreateDietitianJPanel
     */
    public CreateDietitianJPanel(Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        
        populateJComboBox();
        
        
        lblDietitianNameValidation.setVisible(false);
        lblUsernameValidation.setVisible(false);
        lblPasswordValidation.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        lblFitnessCenterName = new javax.swing.JLabel();
        fitnesscenterNamePicker = new javax.swing.JComboBox();
        lblAdminName = new javax.swing.JLabel();
        txtDietitianInputName = new javax.swing.JTextField();
        lblDietitianNameValidation = new javax.swing.JLabel();
        lblDietitianUsername = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUsernameValidation = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPasswordValidation = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDietitian = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        jLabel2.setText("Add Dietitian Details");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        lblFitnessCenterName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblFitnessCenterName.setText("Fitness Center Name:");

        fitnesscenterNamePicker.setBackground(new java.awt.Color(102, 204, 0));
        fitnesscenterNamePicker.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        fitnesscenterNamePicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fitnesscenterNamePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitnesscenterNamePickerActionPerformed(evt);
            }
        });

        lblAdminName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblAdminName.setText("Dietitian's Name:");

        txtDietitianInputName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        txtDietitianInputName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDietitianInputNameFocusGained(evt);
            }
        });
        txtDietitianInputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDietitianInputNameActionPerformed(evt);
            }
        });
        txtDietitianInputName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDietitianInputNameKeyTyped(evt);
            }
        });

        lblDietitianNameValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblDietitianNameValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblDietitianNameValidation.setText("jLabel2");

        lblDietitianUsername.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblDietitianUsername.setText("Dietitian Username:");

        txtUserName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        lblUsernameValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblUsernameValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblUsernameValidation.setText("jLabel2");

        lblPassword.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        lblPasswordValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblPasswordValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblPasswordValidation.setText("jLabel2");

        txtPassword.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFitnessCenterName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDietitianNameValidation)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDietitianInputName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fitnesscenterNamePicker, javax.swing.GroupLayout.Alignment.TRAILING, 0, 388, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDietitianUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(lblUsernameValidation)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtUserName)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(lblPasswordValidation)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtPassword))))))
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
                    .addComponent(fitnesscenterNamePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDietitianInputName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblDietitianNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDietitianUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblUsernameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswordValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tblDietitian.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        tblDietitian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dietitian Username", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDietitian);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 36)); // NOI18N
        jLabel1.setText("Create Dietitian");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fitnesscenterNamePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitnesscenterNamePickerActionPerformed
      FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();
        if (fitnesscenter != null) {
            populateTable(fitnesscenter);
        }
    }//GEN-LAST:event_fitnesscenterNamePickerActionPerformed
   
    
    private void txtDietitianInputNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDietitianInputNameFocusGained
        // TODO add your handling code here:
        lblDietitianNameValidation.setVisible(false);
    }//GEN-LAST:event_txtDietitianInputNameFocusGained

    private void txtDietitianInputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDietitianInputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDietitianInputNameActionPerformed

    private void txtDietitianInputNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDietitianInputNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDietitianInputNameKeyTyped

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        lblUsernameValidation.setVisible(false);
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        lblPasswordValidation.setVisible(false);
    }//GEN-LAST:event_txtPasswordFocusGained
    
    private boolean isValidData() {
        boolean isValid = true;
        boolean isValidName = txtDietitianInputName.getText().matches("^[a-zA-Z]+$");
        boolean isValidUsername = txtUserName.getText().matches("^[a-zA-Z0-9]+$");

        if (txtDietitianInputName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblDietitianNameValidation, "Please enter name");

        } 
        if (txtUserName.getText().isEmpty()) {
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
    
    private void hideShowValidation(JLabel lbl, String errorMessage) {
        if (errorMessage.isEmpty()) {
            lbl.setVisible(false);
        } else {
            lbl.setText(errorMessage);
            lbl.setVisible(true);
        }
        
    }
    
    private void saveData() {
        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();

        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String name = txtDietitianInputName.getText();
        String type = "Dietitian";

        populateTable(fitnesscenter);
        
        Emp emp = fitnesscenter.getEmpDirectory().createEmp(name);
        UserAccount ua = fitnesscenter.getUserAccountDirectory().createUserAccount(username, password, emp, new DietitianRole());

        txtUserName.setText("");
        txtPassword.setText("");
        txtDietitianInputName.setText("");
        btnDelete.setEnabled(true);
        btnModify.setEnabled(true);
        
        CallDialog calldialog = new CallDialog(mainPanel, "Dietitian added successfully", true);
    }
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (isValidData()) {
            saveData();
            populateJComboBox();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDietitian.getSelectedRow();

        if (selectedRowIndex < 0) {
            CallDialog calldialog = new CallDialog(mainPanel, "Please select a row to modify", false);
            return;
        }

        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();

        DefaultTableModel model = (DefaultTableModel) tblDietitian.getModel();
        UserAccount userAcc = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        txtUserName.setText(userAcc.getUsername());
        txtPassword.setText(userAcc.getPassword());
        txtDietitianInputName.setText(userAcc.getEmp().getName());
        fitnesscenter.getUserAccountDirectory().removeUser(userAcc);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = tblDietitian.getSelectedRow();
        if (selectedRow < 0) {
            CallDialog calldialog = new CallDialog(mainPanel, "Please select a row to delete", false);
            return;
        }

        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();

        DefaultTableModel model = (DefaultTableModel) tblDietitian.getModel();

        UserAccount userAcc = (UserAccount) model.getValueAt(selectedRow, 0);

        fitnesscenter.getEmpDirectory().deleteEmp(userAcc.getEmp());
        fitnesscenter.getUserAccountDirectory().removeUser(userAcc);
        populateTable(fitnesscenter);

        CallDialog calldialog = new CallDialog(mainPanel, "Dietitian deleted successfully", true);
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void populateJComboBox() {
         fitnesscenterNamePicker.removeAllItems();
        int i=0;
        for(FitnessCenter fitnesscenter :enterprise.getFitnesscenterDirectory().getFitnessCentersArray()){
            if(i==0){
                populateTable(fitnesscenter);
                i++;
                System.out.println(fitnesscenter.getFitnessCenterName());
            }
            fitnesscenterNamePicker.addItem(fitnesscenter);
        }
    }
    
    private void populateTable(FitnessCenter fitnesscenter) {
        DefaultTableModel model = (DefaultTableModel) tblDietitian.getModel();
        model.setRowCount(0);
        String d = "Dietitian";
        for (UserAccount userAcc : fitnesscenter.getUserAccountDirectory().getUserAccountList()) {
            if (userAcc.getRole().toString().equals(d)) {
                //System.out.println(us.getUsername()+"----"+us.getPassword()+"---"+hospital.getUserAccountDirectory().authenticateUser(us.getUsername(), us.getPassword()));
                Object[] row = new Object[3];
                row[0] = userAcc;
                row[1] = userAcc.getEmp().getName();
                model.addRow(row);
                System.out.println(row);
                
            }

        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox fitnesscenterNamePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblDietitianNameValidation;
    private javax.swing.JLabel lblDietitianUsername;
    private javax.swing.JLabel lblFitnessCenterName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordValidation;
    private javax.swing.JLabel lblUsernameValidation;
    private javax.swing.JTable tblDietitian;
    private javax.swing.JTextField txtDietitianInputName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
