/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.List;

;

/**
 *
 * @author raoyuhuizi
 */
public class MasterOrderList {
     private ArrayList<Order> orders;
    
    public MasterOrderList(){
        orders = new ArrayList<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    

    public Order add(int id, Customer cus, Item item,String country){
        Order order = new Order(id,cus,item,country);
        orders.add(order);
        return order;
    }
   
}
