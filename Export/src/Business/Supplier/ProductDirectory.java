/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class ProductDirectory {
    private ArrayList<Product> proList;
    public ProductDirectory(){
        proList=new ArrayList();
    }

    public ArrayList<Product> getProList() {
        return proList;
    }
    public Product createProduct(String name,Double originPrice,int num,double size ){
        Product pro=new Product();
        pro.setName(name);
        pro.setOriginPrice(originPrice);
        pro.setNum(num);
        pro.setSize(size);
        proList.add(pro);
        return pro;
        
    }
}
