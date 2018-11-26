/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import java.util.ArrayList;

;

/**
 *
 * @author raoyuhuizi
 * This List shows all the order from one particular country.
 * It can be displayed in the sellRole's interface;
 */
public class CtyOrderList {
    private ArrayList<Order> ctyOrderList;
    //private String country;
    private MasterOrderList mol;
    public CtyOrderList(String country){
        
        ctyOrderList=new ArrayList();
        mol=new MasterOrderList();
        for(Order order:mol.getOrders()){
            if(order.getCountry().equals(country)){
                ctyOrderList.add(order);
            }
        }
    }
}
