/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Supplier.ProductDirectory;
import Business.User.UserDirectory;

/**
 *
 * @author Administrator
 */
public class AllDataStore {
    private AllDataStore datastore;
    private ProductDirectory productDirectory;
    private UserDirectory userDirectory;
    public AllDataStore(){
        productDirectory = new ProductDirectory();
        userDirectory = new UserDirectory();
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

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }
    
    
    
}
