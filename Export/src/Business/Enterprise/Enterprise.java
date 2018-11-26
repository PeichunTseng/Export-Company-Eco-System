/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Department.Department;
import Business.Department.DepartmentDirectory;


/**
 *
 * @author raoyuhuizi
 */
public abstract class Enterprise extends Department{
    private EnterpriseType entType;
    private DepartmentDirectory depList;

    public DepartmentDirectory getDepartmentList() {
        return depList;
    }
    public enum EnterpriseType{
        Export("Export");
        private String value;
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
        @Override 
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEntType() {
        return entType;
    }

    public void setEntType(EnterpriseType entType) {
        this.entType = entType;
    }
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.entType=type;
        depList=new DepartmentDirectory();
    }
    
}
