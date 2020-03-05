/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import controller.Controller;
import domain.Manufacturer;
import domain.MeasurementUnit;
import domain.Product;
import domain.User;
import java.util.List;
import javax.swing.JOptionPane;
import session.Session;

/**
 *
 * @author Korisnik
 */
public class FormNewProduct extends javax.swing.JDialog {
    private Controller controller;
    /**
     * Creates new form FormNewProduct
     */
    public FormNewProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        
        fill();
        adjustUser(Session.getInstance().getCurrentUser());
        adjustMode(Session.getInstance().getFormMode());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        cbMeasurementUnit = new javax.swing.JComboBox<>();
        txtPriceWithoutVAT = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblCurrentUser = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbManufacturer = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Product");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/form/pozadina.png"))), "New product", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setText("Quantity:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel4.setText("MeasurementUnit:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel5.setText("Manufacturer: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel6.setText("Price without VAT:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, -1));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 120, -1));
        jPanel2.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 60, -1));

        jPanel2.add(cbMeasurementUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 60, -1));
        jPanel2.add(txtPriceWithoutVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 80, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 70, 30));

        lblCurrentUser.setText("Current user: ");
        jPanel2.add(lblCurrentUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 280, -1));

        btnEdit.setText("Edit");
        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, 30));

        btnUpdate.setText("Update");
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, 30));

        btnDelete.setText("Delete");
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, 30));

        cmbManufacturer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        int id = Integer.parseInt(txtID.getText());
        String name = txtName.getText().trim();
        int quantity = Integer.parseInt(txtQuantity.getText());
        MeasurementUnit measurementUnit = (MeasurementUnit) cbMeasurementUnit.getSelectedItem();
        Manufacturer manufacturer = (Manufacturer) cmbManufacturer.getSelectedItem();
        double priceWithoutVAT = Double.parseDouble(txtPriceWithoutVAT.getText());
        
        
        
        Product product = new Product(id, name, quantity, measurementUnit, manufacturer, priceWithoutVAT);
        Controller.getInstance().saveProduct(product);
        JOptionPane.showMessageDialog(this, "Product saved!");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<MeasurementUnit> cbMeasurementUnit;
    private javax.swing.JComboBox cmbManufacturer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCurrentUser;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPriceWithoutVAT;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void fill() {
        
        fillComboMeasurementUnit();
        
        fillManufacturer();
    }

    private void adjustMode(FormMode formMode) {
        switch(formMode){
            case VIEW: 
                
                
                btnDelete.setVisible(true);
                btnEdit.setVisible(true);

                btnUpdate.setVisible(false);
                btnSave.setVisible(false);
                break;
                
            case DELETE:
                JOptionPane.showConfirmDialog(this,"Are you sure?", "Delete product",1);
               break;
               
            case UPDATE:
                btnUpdate.setVisible(true);
                btnDelete.setVisible(true);
                btnEdit.setVisible(false);
                btnSave.setVisible(false);
                 break;
                 
            case NEW:
                btnSave.setVisible(true);
                btnDelete.setVisible(false);
                btnEdit.setVisible(false);
                btnUpdate.setVisible(false);
                break;
        }
    }

    private void adjustUser(User currentUser) {
        lblCurrentUser.setText(lblCurrentUser.getText() + currentUser.getFirstName() + " " + currentUser.getLastName());
    }

    private void fillComboMeasurementUnit() {
        cbMeasurementUnit.removeAllItems();
        cbMeasurementUnit.addItem(MeasurementUnit.KG);
        cbMeasurementUnit.addItem(MeasurementUnit.L);
        cbMeasurementUnit.addItem(MeasurementUnit.PCS);
    }

    private void fillManufacturer() {
        cmbManufacturer.removeAllItems();
        List<Manufacturer> manufacturers = Controller.getInstance().getAllManufacturer();
        for(Manufacturer manufacturer:manufacturers){
            cmbManufacturer.addItem(manufacturer);
        }
    }
}
