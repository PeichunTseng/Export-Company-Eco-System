/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Data;

import Business.Airline.Flight;
import Business.Airline.Airline;
import Business.Enterprise.Enterprise;
import Business.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peichun
 */
public class ManageFlight extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Airline airline;  
    Flight flight;
    private Enterprise enterprise;
    private User user;

    /**
     * Creates new form ManageFlight
     */
    public ManageFlight(JPanel upc, Airline s, User user, Enterprise enterprise) {
        initComponents();
        userProcessContainer = upc;
        airline = s;
        this.enterprise = enterprise;
        this.user = user;
        sNameTextField.setText(airline.getAlName());
        refreshTable();
    }
    
    
    public void refreshTable() {
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Flight p : airline.getFltList().getFltList()) {
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getCty();
            row[2] = p.getTime();
            row[3] = p.getPrice();
            row[4] = p.getCapacity();
            model.addRow(row);
            //flight=p;
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

        jLabel1 = new javax.swing.JLabel();
        createPButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sNameTextField = new javax.swing.JTextField();
        delButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Flight Catalog");

        createPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createPButton.setText("Create New Flight >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airliner:");

        sNameTextField.setEditable(false);
        sNameTextField.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        sNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTextFieldActionPerformed(evt);
            }
        });

        delButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton5.setText("Delete Flight");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });

        productCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight number", "City", "Time", "Price", "Capacity"
            }
        ));
        productCatalog.setPreferredSize(new java.awt.Dimension(525, 100));
        productCatalog.setRowHeight(25);
        jScrollPane1.setViewportView(productCatalog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(delButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(createPButton))
                                .addComponent(backButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 249, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(sNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2))
                    .addGap(230, 230, 230)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(delButton5)
                        .addComponent(createPButton))
                    .addGap(20, 20, 20)
                    .addComponent(backButton4)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        //flight = new Flight();
        CreateNewFlight cnfjp = new CreateNewFlight(userProcessContainer, airline, user, enterprise);
        userProcessContainer.add("CreateNewFlightJPanel",cnfjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void sNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTextFieldActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight p = (Flight)productCatalog.getValueAt(row, 0);
        airline.getFltList().removeFlight(p);
        refreshTable();
    }//GEN-LAST:event_delButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JTextField sNameTextField;
    // End of variables declaration//GEN-END:variables
}
