/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.Supplier.ProductDirectory;
import Business.Supplier.Product;

/**
 *
 * @author Administrator
 */
public class AllDataStore {
    private AllDataStore datastore;
    private CustomerDirectory customerdirectory;
    private ProductDirectory productDirectory;
    public AllDataStore(){
        customerdirectory = new CustomerDirectory();
        productDirectory = new ProductDirectory();
    }
    

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public AllDataStore getDatastore() {
        return datastore;
    }

    public void setDatastore(AllDataStore datastore) {
        this.datastore = datastore;
    }
    
    
    
}
