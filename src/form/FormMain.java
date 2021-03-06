/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import controller.Controller;
import domain.User;
import javax.swing.JDialog;
import session.Session;

/**
 *
 * @author Korisnik
 */
public class FormMain extends javax.swing.JFrame {
    

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        adjustCurrentUser(Session.getInstance().getCurrentUser());
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCurrentUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenuNew = new javax.swing.JMenuItem();
        jmenuSearch = new javax.swing.JMenuItem();
        jmenuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 0, 51));

        lblCurrentUser.setText("Current user: ");

        jMenu1.setText("Product");

        jmenuNew.setText("New");
        jmenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuNewActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuNew);

        jmenuSearch.setText("Search");
        jmenuSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSearchActionPerformed(evt);
            }
        });
        jMenu1.add(jmenuSearch);

        jMenuBar1.add(jMenu1);

        jmenuAbout.setText("About");
        jMenuBar1.add(jmenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCurrentUser)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuNewActionPerformed
        Session.getInstance().setFormMode(FormMode.NEW);
        JDialog formNewProduct = new FormNewProduct(this, true);
        formNewProduct.setVisible(true);
    }//GEN-LAST:event_jmenuNewActionPerformed

    private void jmenuSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSearchActionPerformed
        JDialog formSearch = new FormProductSearch(this, true);
        formSearch.setVisible(true);
        
    }//GEN-LAST:event_jmenuSearchActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmenuAbout;
    private javax.swing.JMenuItem jmenuNew;
    private javax.swing.JMenuItem jmenuSearch;
    private javax.swing.JLabel lblCurrentUser;
    // End of variables declaration//GEN-END:variables

    private void adjustCurrentUser(User currentUser) {
        lblCurrentUser.setText(lblCurrentUser.getText() + currentUser.getFirstName() + " " + currentUser.getLastName());
    }
}
