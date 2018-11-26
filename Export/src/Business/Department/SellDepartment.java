/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Role.SellRole;
import Business.Role.Role;
import Business.Supplier.WareHouse;
import Business.helper.CtyDetailDirectory;
import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class SellDepartment extends Department {
    //Warehouse cantains products buyer already bought.
    private WareHouse wareHouse;
    //ctyDetailList show all countries details which contains product sell price.
    private CtyDetailDirectory ctyDetailList;
    public SellDepartment(WareHouse wareHouse){
        super(Department.Type.SellRole.getValue());
        this.wareHouse=wareHouse;
        ctyDetailList=new CtyDetailDirectory();
    }
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles=new ArrayList();
        roles.add(new SellRole());
        return roles;
    }
}
