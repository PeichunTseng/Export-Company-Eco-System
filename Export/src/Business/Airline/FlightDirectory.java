/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class FlightDirectory {
    private ArrayList<Flight> fltList;
    
    public FlightDirectory(){
        fltList=new ArrayList();
    }

    public ArrayList<Flight> getFltList() {
        return fltList;
    }
    
    public Flight createFlight(String cty,double time,double capacity){
        Flight flt=new Flight();
        flt.setCty(cty);
        flt.setTime(time);
        flt.setCapacity(capacity);
        fltList.add(flt);
        return flt;
    }
}
