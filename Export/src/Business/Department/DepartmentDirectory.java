/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Department.Department.Type;
import Business.Supplier.WareHouse;
import java.util.ArrayList;



/**
 *
 * @author raoyuhuizi
 */
public class DepartmentDirectory {
    private ArrayList<Department> depList;
    private WareHouse wareHouse;
    public DepartmentDirectory(){
        depList=new ArrayList();
        wareHouse=new WareHouse();
        
    }

    public ArrayList<Department> getDepList() {
        return depList;
    }
    public Department createDepartment(Type type){
        Department dep=null;
        if(type.getValue().equals(Type.DataRole.getValue())){
            dep=new DataDepartment();
            depList.add(dep);
        }
        if(type.getValue().equals(Type.SellRole.getValue())){
            dep=new SellDepartment(wareHouse);
            depList.add(dep);
        }
        else if(type.getValue().equals(Type.BuyRole.getValue())){
            dep=new BuyDepartment();
            depList.add(dep);
        }
        return dep;
    }
}
