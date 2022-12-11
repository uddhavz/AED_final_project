/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CountyAdmin;

import Business.County.County;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
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
public class CountyAdminOptionJPanel extends javax.swing.JPanel {

    
    private UserAccount userAccount;
    private County county;
    EcoSystem system;
    /**
     * Creates new form CountyAdminOptionJPanel
     */
    public CountyAdminOptionJPanel(UserAccount userAccount,County county, EcoSystem system) {
        initComponents();
        
        this.userAccount = userAccount;
        this.county = county;
        this.system = system;
        
//        setLogo();
//        setBackground();
    }
    
//    private void setLogo() {
//        Image image = null;
//        try {
//            image = ImageIO.read(getClass().getResource("/UserInterface/filename.png"));
//        } catch (IOException ex) {
//            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        Image scaledImg = image.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
//        ImageIcon icon = new ImageIcon(scaledImg);
//        imgLogo.setIcon(icon);
//    }
//    
//    private void setBackground() {
//        
//        Image image = null;
//        try {
//                image = ImageIO.read(getClass().getResource("/UserInterface/CountyEnterpriseAdmin/filenamebg.jpeg"));
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
        jPanel3 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        OptionsJPanel = new javax.swing.JPanel();
        btnCreateProduct = new javax.swing.JButton();
        btnAssignOrder = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        ActivityJPanel = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 173, 177), 5));
        jPanel.setPreferredSize(new java.awt.Dimension(1440, 800));

        jSplitPane.setPreferredSize(new java.awt.Dimension(1153, 800));

        OptionsJPanel.setBackground(new java.awt.Color(0, 0, 0));
        OptionsJPanel.setPreferredSize(new java.awt.Dimension(250, 925));

        btnCreateProduct.setBackground(new java.awt.Color(153, 204, 0));
        btnCreateProduct.setText("Create Produce");
        btnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProductActionPerformed(evt);
            }
        });

        btnAssignOrder.setBackground(new java.awt.Color(153, 204, 0));
        btnAssignOrder.setText("Assign Order");
        btnAssignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrderActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(153, 204, 0));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        imgLogo.setText("jLabel2");
        imgLogo.setMaximumSize(new java.awt.Dimension(60, 60));
        imgLogo.setMinimumSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout OptionsJPanelLayout = new javax.swing.GroupLayout(OptionsJPanel);
        OptionsJPanel.setLayout(OptionsJPanelLayout);
        OptionsJPanelLayout.setHorizontalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssignOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OptionsJPanelLayout.setVerticalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
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
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProductActionPerformed
        // TODO add your handling code here:

        CountyAdminCreateProduceJPanel countyAdminCreateProduceJPanel = new CountyAdminCreateProduceJPanel(userAccount, county);
        ActivityJPanel.add("CountyAdminCreateProduceJPanel", countyAdminCreateProduceJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnCreateProductActionPerformed

    private void btnAssignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrderActionPerformed
        // TODO add your handling code here:

        CountyAdminAssignOrderJPanel countyAdminAssignOrderJPanel = new CountyAdminAssignOrderJPanel(userAccount, county);
        ActivityJPanel.add("CountyAdminAssignOrderJPanel", countyAdminAssignOrderJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnAssignOrderActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.first(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel;
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnAssignOrder;
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
