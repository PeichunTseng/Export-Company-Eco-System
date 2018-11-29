/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Airline.AirlineDirectory;
import Business.Supplier.Product;

import Business.Supplier.ProductDirectory;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author raoyuhuizi
 */

public class DataStore {
    private static DataStore dataStore;
    private List<CtyDetail> countryList;
    private List<Product> proList;
    
    private DataStore(){
        countryList = new ArrayList<>();
        proList = new ArrayList<>();
    }
    public static DataStore getInstance(){
        if(dataStore==null)
            dataStore=new DataStore();
        return dataStore;
    }

    public List<CtyDetail> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<CtyDetail> countryList) {
        this.countryList = countryList;
    }

    public List<Product> getProList() {
        return proList;
    }

    public void setProList(List<Product> proList) {
        this.proList = proList;
    }
}
