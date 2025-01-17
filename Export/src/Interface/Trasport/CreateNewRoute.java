/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Trasport;

import Business.Airline.Airline;
import Business.Airline.Flight;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

//import UserInterface.AdminstrativeRole.ManageSuppliers;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author peichun
 */
public class CreateNewRoute extends javax.swing.JPanel {
    
    Airline airline;
    Flight flight;
    JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;

    /**
     * Creates new form CreateNewFlight
     */
//    public CreateNewFlight(JPanel userProcessContainer, Airline air, User user, Enterprise enterprise){
//        initComponents();
//        airline = air;
//        this.userProcessContainer = userProcessContainer;
//        this.enterprise = enterprise;
//        this.user = user;
//    }
    
    public CreateNewRoute(JPanel userProcessContainer, Enterprise enterprise, Network network){
       initComponents();
       this.network = network;
       this.userProcessContainer = userProcessContainer;
       this.enterprise = enterprise;
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FlightnumberField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        DestinationField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add ");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Shipping Number:");

        FlightnumberField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FlightnumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightnumberFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Shipping");

        DestinationField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Destination:");

        PriceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("     Price(/kg) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FlightnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton1)
                    .addComponent(createButton))
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        Flight flight = new Flight();
        //airline.getFltList().addFlight(flight);
        //        try{
            //            int price =Integer.parseInt(PriceField.getText());
            //            flight.setPrice(price);
            //        }catch(NumberFormatException e){
            //
            //            JOptionPane.showMessageDialog(null, "number only");
            //            return;
            //
            //        }

        try{
            double cap =Double.parseDouble(PriceField.getText());
            flight.setShippingFee(cap);
        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null, "number only");
            return;

        }
        flight.setFlightnumber(FlightnumberField.getText());
        //flight.setCapacity(Capacity.getText());
        flight.setCty(DestinationField.getText());
        //flight.setTime(DepartureTimeField.getText());
        flight.setEnterpriseName(enterprise.getName());

        //enterprise.getFltList().addFlight(flight);
        enterprise.getDatastore().getFliList().add(flight);
        network.getNetworkDataStore().getFliList().add(flight);

        JOptionPane.showMessageDialog(null, "New Shipping successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);

        List<String> ctyname = new ArrayList<>();

        //        if(!ctyname.contains(DestinationField.getText()))
        //        {
            //            ctyname.add(DestinationField.getText());
            //            enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
            //        }
        /*先注掉
        for(CtyDetail cty:enterprise.getDatastore().getCountryList()){
            if(!ctyname.contains(cty.getCtyName()))
            ctyname.add(cty.getCtyName());
        }

        if(!ctyname.contains(DestinationField.getText())){
            enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
            network.getNetworkDataStore().getCountryList().add(new CtyDetail(DestinationField.getText()));
        }
        */

        //        List<String> airlineName = new ArrayList<>();
        //
        //        for(Airline cty:enterprise.getDatastore().getAirList()){
            //            if(!airlineName.contains(cty.getAlName()))
            //                airlineName.add(cty.getAlName());
            //         }
        //
        //        if(!airlineName.contains(airline.getAlName())){
            //            enterprise.getDatastore().getAirList().add(airline);
            //        }

        //enterprise.getDatastore().getAirList().add(airline);

        //        for(CtyDetail cty:enterprise.getDatastore().getCountryList())
        //        {
            //            if(!ctyname.contains(cty.getCtyName()))
            //            {
                //                ctyname.add(cty.getCtyName());
                //                enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
                //            }
            //
            //        }

        // enterprise.getDatastore().getCountryList().add(new CtyDetail(DestinationField.getText()));
    }//GEN-LAST:event_createButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void FlightnumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightnumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightnumberFieldActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRoute chooseAirplaneModelToSchedule = (ManageRoute) component;
        chooseAirplaneModelToSchedule.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DestinationField;
    private javax.swing.JTextField FlightnumberField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
