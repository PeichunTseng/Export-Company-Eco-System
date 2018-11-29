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
public class WareHouse {
    private List<Product> products;
    
    public WareHouse(){
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
}
