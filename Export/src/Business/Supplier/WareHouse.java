/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;



/**
 *
 * @author raoyuhuizi
 */
public class WareHouse {
    private ArrayList<Supplier> wareHouse;
    public WareHouse(){
        wareHouse =new ArrayList();
    }
    public ArrayList<Supplier> getWareHouse() {
        return wareHouse;
    }
    public Supplier createSupplier(String spName){
        Supplier sp=new Supplier();
        sp.setSpName(spName);
       
        wareHouse.add(sp);
        return sp;
        
    }
}
