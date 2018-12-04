/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.DataDepartment;
import Business.Department.Department;
import Business.Department.SellDepartment;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.User.User;
import Interface.Data.DataWorkAreaJPanel;
import Interface.Data.ProductManage;
import Interface.Data.SupplierJPanel;
import Interface.Sell.SellWorkAreaJPanel;
import javax.swing.JPanel;



/**
 *
 * @author raoyuhuizi
 */
public class ManufacturingRole extends Role {
    @Override 
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Department dep, Enterprise enterprise, EcoSystem business){
        return new ProductManage(userProcessContainer, enterprise,business);
    }
}
/**
 *
 * @author peichun
 */

