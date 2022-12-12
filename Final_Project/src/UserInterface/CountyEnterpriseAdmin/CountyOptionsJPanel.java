/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CountyEnterpriseAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import UserInterface.MainJFrame;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author tanmayzope
 */
public class CountyOptionsJPanel extends javax.swing.JPanel {

    EcoSystem system;
    Enterprise enterprise;
    
    /**
     * Creates new form CountyOptionsJPanel
     */
    public CountyOptionsJPanel(EcoSystem system, Enterprise enterprise) {
        initComponents();
        
        this.system = system;
        this.enterprise = enterprise;
        
        setLogo();
//        setBackground();
        
    }

    private void setLogo() {
        Image image = null;
        try {
            image = ImageIO.read(getClass().getResource("/UserInterface/logo.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image scaledImg = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        imgLogo.setIcon(icon);
    }
//    
//    private void setBackground() {
//        
//        Image image = null;
//        try {
//                image = ImageIO.read(getClass().getResource("/UserInterface/CountyEnterpriseAdmin/countybg.jpeg"));
//        } catch (IOException ex) {
//            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        Image scaledImg = image.getScaledInstance(1180, 930, Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(scaledImg);
//        System.out.println(icon);
//        bgImage.setIcon(icon);
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        OptionsJPanel = new javax.swing.JPanel();
        btnManageCounty = new javax.swing.JButton();
        btnManageCountyAdmin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        btnManageShippingPartner = new javax.swing.JButton();
        ActivityJPanel = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1440, 925));
        setRequestFocusEnabled(false);

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 5));
        jPanel.setPreferredSize(new java.awt.Dimension(1440, 800));

        jSplitPane.setPreferredSize(new java.awt.Dimension(1153, 800));

        OptionsJPanel.setBackground(new java.awt.Color(0, 0, 0));
        OptionsJPanel.setPreferredSize(new java.awt.Dimension(250, 925));

        btnManageCounty.setBackground(new java.awt.Color(102, 204, 0));
        btnManageCounty.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        btnManageCounty.setText("Agriculture Unit");
        btnManageCounty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCountyActionPerformed(evt);
            }
        });

        btnManageCountyAdmin.setBackground(new java.awt.Color(102, 204, 0));
        btnManageCountyAdmin.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        btnManageCountyAdmin.setText("Farmers");
        btnManageCountyAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCountyAdminActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 204, 0));
        btnLogout.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        imgLogo.setText("jLabel2");
        imgLogo.setMaximumSize(new java.awt.Dimension(60, 60));
        imgLogo.setMinimumSize(new java.awt.Dimension(60, 60));

        btnManageShippingPartner.setBackground(new java.awt.Color(102, 204, 0));
        btnManageShippingPartner.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        btnManageShippingPartner.setText("Shipping Partner");
        btnManageShippingPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageShippingPartnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsJPanelLayout = new javax.swing.GroupLayout(OptionsJPanel);
        OptionsJPanel.setLayout(OptionsJPanelLayout);
        OptionsJPanelLayout.setHorizontalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageCounty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageCountyAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageShippingPartner, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OptionsJPanelLayout.setVerticalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnManageCounty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageCountyAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageShippingPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        jSplitPane.setLeftComponent(OptionsJPanel);

        ActivityJPanel.setBackground(new java.awt.Color(255, 255, 255));
        ActivityJPanel.setPreferredSize(new java.awt.Dimension(997, 800));
        ActivityJPanel.setLayout(new java.awt.CardLayout());
        ActivityJPanel.add(bgImage, "card2");

        jSplitPane.setRightComponent(ActivityJPanel);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCountyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCountyActionPerformed
        // TODO add your handling code here:

        ManageCountyJPanel manageCountyJPanel = new ManageCountyJPanel(enterprise);
        ActivityJPanel.add("ManageCountyJPanel", manageCountyJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnManageCountyActionPerformed

    private void btnManageCountyAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCountyAdminActionPerformed
        // TODO add your handling code here:

        ManageCountyAdminJPanel manageCountyJPanel = new ManageCountyAdminJPanel(enterprise);
        ActivityJPanel.add("ManageCountyAdminJPanel", manageCountyJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);

    }//GEN-LAST:event_btnManageCountyAdminActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.first(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageShippingPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageShippingPartnerActionPerformed
        // TODO add your handling code here:

        ManageShippingPartnerJPanel manageShippingPartnerJPanel = new ManageShippingPartnerJPanel(enterprise);
        ActivityJPanel.add("ManageShippingPartnerJPanel", manageShippingPartnerJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnManageShippingPartnerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel;
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCounty;
    private javax.swing.JButton btnManageCountyAdmin;
    private javax.swing.JButton btnManageShippingPartner;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
