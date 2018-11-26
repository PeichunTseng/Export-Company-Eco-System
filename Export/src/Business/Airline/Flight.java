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
    private String cty;
    private int id;
    private double time;
    private double capacity;
    private static int count=1;
    public Flight(){
        id=count;
        count++;
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

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString(){
        return cty;
    }
}
