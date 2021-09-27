/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.Product;

/**
 *
 * @author Amulya
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    
    Product product;
    
    public DisplayJPanel(Product product) {
        initComponents();
        this.product = product;
        
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtFnumber = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblGdata = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTnumber = new javax.swing.JLabel();
        lblFnumber = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGdata = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTnumber = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        lblUnique = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedical = new javax.swing.JTextField();
        txtHealth = new javax.swing.JTextField();
        txtBank = new javax.swing.JTextField();
        txtLicense = new javax.swing.JTextField();
        txtVehicle = new javax.swing.JTextField();
        txtDevice = new javax.swing.JTextField();
        txtLinkedin = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        lblMedical = new javax.swing.JLabel();
        lblHealth = new javax.swing.JLabel();
        lblBank = new javax.swing.JLabel();
        txtUnique = new javax.swing.JTextField();
        lblLicense = new javax.swing.JLabel();
        lblVehicle = new javax.swing.JLabel();
        lblDevice = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Display profile");

        lblName.setText("Name:");

        lblGdata.setText("Geographic data:");

        lblDOB.setText("DOB:");

        lblTnumber.setText("Telephone number:");

        lblFnumber.setText("Fax number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblimage.setText("Image:");

        lblUnique.setText("NU Id:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setText("Email address:");

        lblSSN.setText("SSN:");

        lblMedical.setText("Medical record number:");

        lblHealth.setText("Health plan beneficiary number:");

        lblBank.setText("Bank account number:");

        lblLicense.setText("License/Certificate number:");

        lblVehicle.setText("Vehicle number:");

        lblDevice.setText("Device number:");

        lblLinkedin.setText("LinkedIn:");

        lblIP.setText("IP address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGdata)
                            .addComponent(lblName)
                            .addComponent(lblDOB)
                            .addComponent(lblTnumber)
                            .addComponent(lblFnumber)
                            .addComponent(lblEmail)
                            .addComponent(lblSSN)
                            .addComponent(lblMedical)
                            .addComponent(lblBank)
                            .addComponent(lblLicense)
                            .addComponent(lblVehicle)
                            .addComponent(lblDevice)
                            .addComponent(lblLinkedin)
                            .addComponent(lblIP)
                            .addComponent(lblimage)
                            .addComponent(lblUnique)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHealth)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGdata, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnique, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGdata)
                    .addComponent(txtGdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTnumber)
                    .addComponent(txtTnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFnumber)
                    .addComponent(txtFnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedical)
                    .addComponent(txtMedical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealth))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBank)
                    .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicense))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicle)
                    .addComponent(txtVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDevice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIP)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lblimage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnique)
                    .addComponent(txtUnique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lblTitle)
                    .addContainerGap(668, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFnumber;
    private javax.swing.JLabel lblGdata;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMedical;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTnumber;
    private javax.swing.JLabel lblUnique;
    private javax.swing.JLabel lblVehicle;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txtBank;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDevice;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFnumber;
    private javax.swing.JTextField txtGdata;
    private javax.swing.JTextField txtHealth;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedical;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTnumber;
    private javax.swing.JTextField txtUnique;
    private javax.swing.JTextField txtVehicle;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        
        txtName.setText(product.getName());
        txtGdata.setText(product.getGdata());
        txtDOB.setText(product.getDOB());
        txtTnumber.setText(Long.toString((product.getTnumber())));
        txtFnumber.setText(Long.toString((product.getFnumber())));
        txtEmail.setText(product.getEmail());
        txtSSN.setText(Long.toString((product.getSSN())));
        txtMedical.setText(Long.toString((product.getMedical())));
        txtHealth.setText(Long.toString((product.getHealth())));
        txtBank.setText(Long.toString((product.getBank())));
        txtVehicle.setText(product.getVehicle());
        txtLicense.setText(product.getLicense());
        txtDevice.setText(product.getDevice());
        txtLinkedin.setText(product.getLinkedin());
        txtIP.setText(product.getIP());
        ImageIcon icon = new ImageIcon(product.getImage());
        System.out.println(icon);
        Image image1;
        //ImageIcon icon = new ImageIcon(filename);
        image1 = icon.getImage().getScaledInstance(120, 200, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(image1);
        lblimage.setIcon(imageIcon);
        //txtImage.setText(product.getImage());
        txtUnique.setText(product.getUnique());
    }
    
}
