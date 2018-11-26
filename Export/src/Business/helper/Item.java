/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

;

/**
 *
 * @author raoyuhuizi
 */
public class Item {
    String productName;
    int productId;
    int sellPrice;
    int quantity;
    public Item(String productName,int productId, int sellPrice, int quantity) {
        this.productName=productName;
        this.productId = productId;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}

