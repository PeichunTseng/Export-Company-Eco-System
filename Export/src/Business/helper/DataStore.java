/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Airline.AirlineDirectory;
import Business.Airline.Airline;

import Business.Supplier.Product;
import Business.Supplier.ProductDirectory;

import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author raoyuhuizi
 */

public class DataStore {
    private List<CtyDetail> countryList;
    private List<Product> proList;
    private ArrayList<Airline> airList;
    private ArrayList<Supplier> supList;
    
    public DataStore(){
        countryList = new ArrayList<>();
        proList = new ArrayList<>();
        airList=new ArrayList<>();
        supList= new ArrayList<>();
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

    public ArrayList<Airline> getAirList() {
        return airList;
    }

    public void setAirList(ArrayList<Airline> airList) {
        this.airList = airList;
    }

    public ArrayList<Supplier> getSupList() {
        return supList;
    }

    public void setSupList(ArrayList<Supplier> supList) {
        this.supList = supList;
    }
    
    
    
}
