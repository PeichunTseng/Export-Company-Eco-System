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
   private String scheduletime;
    private double capacity;
    private int price;

    private int id;
//    private double time;
    private static int count=1;
    
    public Flight(){
        id=count;
        count++;
    }
    
    public Flight(String name, String cty, double capacity,int price){
        id = count++;
        flightnumber = name;
        this.cty = cty;
        this.capacity = capacity;
        this.price = price;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    
    public int getId() {
        return id;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getTime() {
        return scheduletime;
    }

    public void setTime(String time) {
        this.scheduletime = time;
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
