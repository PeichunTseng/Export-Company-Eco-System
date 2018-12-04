/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Supplier.Product;
import Business.helper.CtyDetail;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author raoyuhuizi
 */
public class Employee {
    private String name;
    private int id;
    private static int count=1;
    private List<Product> products;
    private CtyDetail country;
    
    public Employee(){
        products = new ArrayList<>();
        id=count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    @Override 
    public String toString(){
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public CtyDetail getCountry() {
        return country;
    }

    public void setCountry(CtyDetail country) {
        this.country = country;
    }
}
