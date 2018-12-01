/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;

/**
 *
 * @author Administrator
 */
public class AllDataStore {
    private AllDataStore datastore;
    private CustomerDirectory customerdirectory;
    private AllDataStore(){
        customerdirectory = new CustomerDirectory();
    }
    public AllDataStore getInstance(){
        if(datastore == null){
            return new AllDataStore();
        }else{
            return datastore;
        }
    }

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }
    
}
