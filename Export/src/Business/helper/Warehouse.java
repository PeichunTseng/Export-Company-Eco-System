/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Supplier.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Warehouse {
    private List<Product> products;
    private static Warehouse warehouse;
    
    private Warehouse(){
        products = new ArrayList<>();
    }
    
    public static Warehouse getInstance(){
        if(warehouse == null){
            return new Warehouse();
        }
        return warehouse;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
}
