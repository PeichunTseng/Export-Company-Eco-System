/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Airline.AirlineDirectory;

import Business.Supplier.ProductDirectory;



/**
 *
 * @author raoyuhuizi
 */

public class DataStore {
    private static DataStore dataStore;
    private AirlineDirectory alList;
    private ProductDirectory proList;
    
    private DataStore(){
        alList=new AirlineDirectory();
        proList=new ProductDirectory();
    }
    public static DataStore getInstance(){
        if(dataStore==null)
            dataStore=new DataStore();
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public AirlineDirectory getAlList() {
        return alList;
    }

    public void setAlList(AirlineDirectory alList) {
        this.alList = alList;
    }

   

    public ProductDirectory getProList() {
        return proList;
    }

    public void setProList(ProductDirectory proList) {
        this.proList = proList;
    }
    
}
