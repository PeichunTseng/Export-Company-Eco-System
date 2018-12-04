/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;



/**
 *
 * @author raoyuhuizi
 */
public class Flight {
    private String flightnumber;
    private String cty;
    private String enterpriseName;
    private double capacity;
    private int price;
    
    public Flight(){}
    
    public Flight(String name, String cty, double capacity,int price, String enterpriseName){
        flightnumber = name;
        this.cty = cty;
        this.capacity = capacity;
        this.price = price;
        this.enterpriseName = enterpriseName;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return cty;
    }
}
