/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    public Enterprise createEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise ent=null;
        if(type==Enterprise.EnterpriseType.Export){
            ent=new ExportEnterprise(name);
            enterpriseList.add(ent);
            
        }
        return ent;
    }
}
