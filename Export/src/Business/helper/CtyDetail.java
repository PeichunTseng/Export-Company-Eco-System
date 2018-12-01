/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.helper;

import Business.Employee.Employee;
import Business.Supplier.CtyProductDirectory;
import java.util.ArrayList;

;

/**
 *
 * @author raoyuhuizi
 * This class stores a country's assignment situation.
 */
public class CtyDetail {
    private String ctyName;
    //If this coutry has been assigned
    private String status; 
    private Employee employee;
    //Store the sell price in different coutries
    private CtyProductDirectory ctyProList; 
    public CtyDetail(String ctyName){
        this.ctyName = ctyName;
    }
    public CtyDetail(){
        ctyProList=new CtyProductDirectory();
    }

    public String getCtyName() {
        return ctyName;
    }

    public void setCtyName(String ctyName) {
        this.ctyName = ctyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public CtyProductDirectory getCtyProList() {
        return ctyProList;
    }

    public void setCtyProList(CtyProductDirectory ctyProList) {
        this.ctyProList = ctyProList;
    }

    @Override
    public String toString() {
        return ctyName;
    }
    
    
    
}
