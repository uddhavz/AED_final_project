/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.County.County;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FNS.FNS;
import Business.FitnessCenter.FitnessCenter;
import Business.Organization.Organization;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.Vendor.Vendor;
import UserInterface.Admin.AdminHomeJPanel;
import UserInterface.Client.ClientHomeJPanel;
import UserInterface.Client.RegistrationJPanel;
import UserInterface.CountyAdmin.CountyAdminOptionJPanel;
import UserInterface.CountyEnterpriseAdmin.CountyOptionsJPanel;
import UserInterface.DeliveryPartner.DeliveryPartnerHomeJPanel;
import UserInterface.Dietitian.DietitianHomeJPanel;
import UserInterface.FNS.FNSAdminJPanel;
import UserInterface.FNSEnterpriseAdmin.FNSEnterpriseManageJPanel;
import UserInterface.FitnessCenter.FitnessCenterEnterpriseAdminHomeJPanel;
import UserInterface.InventoryManager.InventoryManagerHomeJpanel;
import UserInterface.Pathologist.PathologistHomeJPanel;
import UserInterface.Shipping.ShippingHomeJPanel;
import UserInterface.VendorEnterpriseAdmin.VendorEnterpriseAdminOptionsJPanel;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author uddhavzambare
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public static JPanel mainPanel;
    
    public MainJFrame() {
        initComponents();
        
        system = dB4OUtil.retrieveSystem();
        
        
        btnSignup.setOpaque(false);
        btnSignup.setContentAreaFilled(false);
        btnSignup.setBorderPainted(false);
        
        this.mainPanel = mainJPanel;
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    DB4OUtil.getInstance().storeSystem(system);
                e.getWindow().dispose();
            }
        });
        
        setLogo();
        setBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSignup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainJPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSignup.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(0, 100, 255));
        btnSignup.setText("Sign up here!");
        btnSignup.setBorder(null);
        btnSignup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSignup.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSignup.setOpaque(true);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 0)));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setText("Username:");

        btnLogin.setBackground(new java.awt.Color(102, 204, 0));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Don't have an account? ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        bgImage.setForeground(new java.awt.Color(102, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(988, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bgImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bgImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );

        mainJPanel.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:

        RegistrationJPanel registrationPanel = new RegistrationJPanel(system);
        mainJPanel.add("RegistrationJPanel", registrationPanel);
        CardLayout layout = (CardLayout)mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if(txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please enter Username and Password");
            return;
        }
        
        UserAccount userAccount = system.getUserAccountDirectory().authentication(txtUsername.getText(), txtPassword.getText());
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        County county = null;
        String userName = txtUsername.getText();
        String password = txtPassword.getText();

        if(userAccount==null){
            //Step 2: Go inside each state and check each enterprise
            for(State state:system.getStateList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:state.getEnterpriseDirectory().getEnterpriseListArray()){
                    userAccount=enterprise.getUserAccountDirectory().authentication(userName, password);
                    System.out.println("#"+userAccount);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authentication(userName, password);
                            System.out.println("##"+userAccount);
                            System.out.println("inOrganization - > "+ inOrganization);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        System.out.println("inEnterprise - > "+inEnterprise);
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }

                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            for(State state:system.getStateList()){
                System.out.println("State -> "+ state);
                for(Enterprise enterprise:state.getEnterpriseDirectory().getEnterpriseListArray()){
                    System.out.println("Enterprise - >"+ enterprise);
                    if(enterprise.getFitnesscenterDirectory()!=null){
                        for(FitnessCenter fitnesscenter: enterprise.getFitnesscenterDirectory().getFitnessCentersArray()){
                            userAccount = fitnesscenter.getUserAccountDirectory().authentication(userName, password);
                            System.out.println("1 **"+enterprise.getName());
                            System.out.println("1 userAccount **"+userAccount);
                            if(userAccount!=null){
                                System.out.println(userAccount+": FitnessCenter");
                                inEnterprise=enterprise;
                                inOrganization=null;
                                break;
                            }
                        }
                        
                    }
                    if(enterprise.getCountyDirectory()!=null){
                        for(County c: enterprise.getCountyDirectory().getCountyDirectoryArray()){
                            userAccount = c.getUserAccountDirectory().authentication(userName, password);
                            System.out.println("2 **"+enterprise.getName());
                            System.out.println("2 userAccount **"+userAccount);
                            
                            if(userAccount!=null){
                                System.out.println(userAccount+": County");
                                inEnterprise=enterprise;
                                inOrganization=null;
                                county = c;
                                break;
                            }
                        }
                        if(userAccount!=null){
                            break;
                        }
                    }
                    if(enterprise.getVendorDirectory()!=null){
                        for(Vendor vendor: enterprise.getVendorDirectory().getVendorsArray()){
                            userAccount = vendor.getUserAccountDirectory().authentication(userName, password);
                            System.out.println("3 **"+enterprise.getName());
                            System.out.println("3 userAccount **"+userAccount);
                            if(userAccount!=null){
                                System.out.println(userAccount+": Vendor");
                                inEnterprise=enterprise;
                                inOrganization=null;
                                break;
                            }
                        }
                    }
                    if(enterprise.getFnsDirectory()!=null){
                        for(FNS fns: enterprise.getFnsDirectory().getFNS()){
                            userAccount = fns.getUserAccountDirectory().authentication(userName, password);
                            System.out.println("4 **"+enterprise.getName());
                            System.out.println("4 userAccount **"+userAccount);
                            if(userAccount!=null){
                                System.out.println(userAccount+": Food and Nutrition Service");
                                inEnterprise=enterprise;
                                inOrganization=null;
                                break;
                            }
                        }
                    }
                    
                    
                    
                }
            }
        }
        System.out.println("Final User  - >" + userAccount );
        if (userAccount != null) {
            navigateAfterLogin(userAccount, inEnterprise, county);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid UserName or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }

        reset();
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void navigateAfterLogin(UserAccount userAccount, Enterprise enterprise, County county) {
        
        switch (userAccount.getRole().toString()) {
            case "Business.Role.SystemAdminRole":
                AdminHomeJPanel adminHomeJPanel = new AdminHomeJPanel(system);
                mainJPanel.add("AdminHomeJPanel", adminHomeJPanel);
                break;
                
            case "Client":
                ClientHomeJPanel clientHomeJPanel = new ClientHomeJPanel(userAccount, system);
                mainJPanel.add("ClientHomeJPanel", clientHomeJPanel);
                break;
                
            case "Fitness Center Enterprise Admin":
                FitnessCenterEnterpriseAdminHomeJPanel FCHomeJPanel = new FitnessCenterEnterpriseAdminHomeJPanel(system, enterprise);
                mainJPanel.add("FitnessCenterEnterpriseAdminHomeJPanel", FCHomeJPanel);
                break;
                
            case "Agriculture Enterprise Admin":
                CountyOptionsJPanel CountyHomeJPanel = new CountyOptionsJPanel(system, enterprise);
                mainJPanel.add("CountyOptionsJPanel", CountyHomeJPanel);
                break;
                
            case "Delivery Person":
                DeliveryPartnerHomeJPanel DeliveryHomeJPanel = new DeliveryPartnerHomeJPanel(system,userAccount, enterprise);
                mainJPanel.add("DeliveryPartnerHomeJPanel", DeliveryHomeJPanel);
                break;
                
            case "Dietitian":
                DietitianHomeJPanel DietitianHomeJPanel = new DietitianHomeJPanel(system,userAccount, enterprise);
                mainJPanel.add("DietitianHomeJPanel", DietitianHomeJPanel);
                break;
                
            case "FNS Admin":
                FNSAdminJPanel FNSAdminJPanel = new FNSAdminJPanel(system, enterprise, userAccount);
                mainJPanel.add("FNSAdminJPanel", FNSAdminJPanel);
                break;
                
            case "FNS Enterprise Admin":
                FNSEnterpriseManageJPanel FNSEnterpriseAdminJPanel = new FNSEnterpriseManageJPanel(system, enterprise);
                mainJPanel.add("FNSEnterpriseManageJPanel", FNSEnterpriseAdminJPanel);
                break;
                
            case "Farmer":
                CountyAdminOptionJPanel CountyAdminJPanel = new CountyAdminOptionJPanel(userAccount,county,system);
                mainJPanel.add("CountyAdminOptionJPanel", CountyAdminJPanel);
                break;
                
            case "Inventory Manager":
                InventoryManagerHomeJpanel InventoryManagerHJPanel = new InventoryManagerHomeJpanel(system, enterprise, userAccount);
                mainJPanel.add("InventoryManagerHomeJPanel", InventoryManagerHJPanel);
                break;
            
//           case "Nutrtion Analyst":
//                InventoryManagerHomeJpanel InventoryManagerHJPanel = new InventoryManagerHomeJpanel(system, enterprise, userAccount);
//                mainJPanel.add("InventoryManagerHomeJPanel", InventoryManagerHJPanel);
//                break;
                
            case "Pathologist":
                 PathologistHomeJPanel pathologistHomeJPanel = new PathologistHomeJPanel(system,  userAccount,enterprise);
                mainJPanel.add("PathologistHomeJPanel", pathologistHomeJPanel);
                break; 
                
//             case "Quality Approver":
//                InventoryManagerHomeJpanel InventoryManagerHJPanel = new InventoryManagerHomeJpanel(system, enterprise, userAccount);
//                mainJPanel.add("InventoryManagerHomeJPanel", InventoryManagerHJPanel);
//                break;
                
                case "Shipping Manager":
                ShippingHomeJPanel ShippingHJPanel = new ShippingHomeJPanel(system,userAccount,county);
                mainJPanel.add("ShippingHomeJpanel", ShippingHJPanel);
                break;
                
                case "Vendor Enterprise Admin":
                VendorEnterpriseAdminOptionsJPanel VendorHJPanel = new VendorEnterpriseAdminOptionsJPanel(system,enterprise);
                mainJPanel.add("VendorEnterpriseAdminOptionsJPanel", VendorHJPanel);
                break;
                
                
        }
        
        CardLayout layout = (CardLayout)mainJPanel.getLayout();
        layout.next(mainJPanel);
        
    }
    
    public void reset() {
        txtUsername.setText("");
        txtPassword.setText("");
    }
    
    private void setBackground() {
        
        Image image = null;
        try {
            image = ImageIO.read(getClass().getResource("/UserInterface/organicbg.jpeg"));
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image scaledImg = image.getScaledInstance(1400, 900, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        System.out.println(icon);
        bgImage.setIcon(icon);
    }
    
    private void setLogo() {
        Image image = null;
        try {
            image = ImageIO.read(getClass().getResource("/UserInterface/logo.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image scaledImg = image.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        imgLogo.setIcon(icon);
    }
}
