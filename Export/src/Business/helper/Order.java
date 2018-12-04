/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Customer.Customer;



/**
 *
 * @author raoyuhuizi
 */
public class Order {
    private int id;
    private Customer cus;
    private Item item;
    private String country;
    private static int count;
    
    public Order(int id, Customer cus, Item item,String country){
        id=count;
        count++;
        this.id = id;
        this.cus = cus;
        this.country = country;
        this.item = item;
    }
   
    public int getId() {
        return id;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    
    
}
