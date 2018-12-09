/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Supplier.Product;
import Business.Supplier.ProductDirectory;
import Interface.Manufacture.SortProList;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class SummaryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private ProductDirectory revenueProList;
    private ProductDirectory uniqueProList;
    /**
     * Creates new form SummaryJPanel
     */
    public SummaryJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        revenueProList=new ProductDirectory();
        uniqueProList=new ProductDirectory();
        populateTable();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) productTbl.getModel();

        model.setRowCount(0);
        //Get the newlist contains unrepeated product and its total revenue
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEntList().getEnterpriseList()) {
                if("Export".equals(enterprise.getEntType().getValue())){
                for (Order order : enterprise.getDatastore().getOrderList().getOrders()) {
                    for(Product p:order.getProducts()){
                        System.out.println("productName:"+p.getName()+"  ");
                        System.out.print("SName:"+p.getSupplierName()+"  ");
                        System.out.print("net:"+network+"  ");
                        System.out.print("enter"+enterprise+"  ");
                        double proRevenue=p.getSellPrice()-p.getShippingCost()*p.getSize()-p.getOriginPrice();
                        if(uniqueProList.getProList().isEmpty()){
                            double sumReveue=proRevenue;
                            Product tmpProduct =new Product();
                            tmpProduct.setName(p.getName());
                            tmpProduct.setSellPrice(sumReveue);
                            tmpProduct.setSupplierName(p.getSupplierName());
                            revenueProList.addProduct(tmpProduct);
                            
                        }
                        
                        else{
                            for(Product pro:uniqueProList.getProList()){
                                if(pro.getName().equals(p.getName())&&pro.getSupplierName().equals(p.getSupplierName())){
                                     
                                    double sumReveue=pro.getSellPrice()+proRevenue;
                                    pro.setSellPrice(sumReveue);
                                }
                                else{
                                    double sumReveue=proRevenue;
                                    Product tmpProduct =new Product();
                                    tmpProduct.setName(p.getName());
                                    tmpProduct.setSellPrice(sumReveue);
                                    tmpProduct.setSupplierName(p.getSupplierName());
                                    revenueProList.addProduct(tmpProduct);
                                }
                            }
                        }
                             
                    }
                }
            
            }
        }
        }
//        SortProList sortResult=new SortProList();
//        Collections.sort(revenueProList,sortResult);
//        System.out.println("Before");
//        for(Product p : revenueProList.getProList()){
//            System.out.println(p.getName());
//        }
//        Collections.sort(revenueProList.getProList(), new Comparator<Product>(){
//            @Override
//            public int compare(Product o1, Product o2) {
//                return Double.compare(o1.getSellPrice(), o2.getSellPrice());
//            }
//        });
//        System.out.println("After");
//        for(Product p : revenueProList.getProList()){
//            System.out.println(p.getName());
//        }
        int i=0;
        for(Product prod:revenueProList.getProList()){
            if(i>=5){
                break;
            }
            else{
            Object[] row = new Object[4];
                row[0] = prod.getId();
                row[1] = prod.getName();
                row[2] = prod.getSupplierName();
                row[3] = prod.getSellPrice();
                model.addRow(row);
                i++;
            }
            
            
        }
    }
    
//    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map)
//    {
//        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<K, V>>()
//        {
//            @Override
//            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2)
//            {
//                int compare = (o1.getValue()).compareTo(o2.getValue());
//                return -compare;
//            }
//        });
//
//        Map<K, V> result = new LinkedHashMap<K, V>();
//        for (Map.Entry<K, V> entry : list) {
//            result.put(entry.getKey(), entry.getValue());
//        }
//        return result;
//    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Overall Top 5 Profitable Products");

        productTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Supplier", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTbl);

        jButton1.setText("<<  Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTbl;
    // End of variables declaration//GEN-END:variables
}
