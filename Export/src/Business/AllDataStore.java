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
    public AllDataStore(){
        customerdirectory = new CustomerDirectory();
    }
    

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }
    
}
