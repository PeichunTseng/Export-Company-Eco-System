/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.Department.DataDepartment;
import Business.Department.Department;
import Business.Department.SellDepartment;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ManufacturingEnterprise;
import Business.Network.Network;
import Business.User.User;
import Interface.Shipping.ShippingWorkAreaJPanel;
import Interface.Manufacture.ProductManage;
import Interface.Sell.SellWorkAreaJPanel;
import javax.swing.JPanel;



/**
 *
 * @author raoyuhuizi
 */
public class ManufacturingRole extends Role {
    @Override 
    public JPanel createWorkArea(JPanel userProcessContainer, Customer customer, User user, Department dep, Enterprise enterprise, Network network, EcoSystem business){
        return new ProductManage(userProcessContainer, (ManufacturingEnterprise)enterprise,network);
    }
}
/**
 *
 * @author peichun
 */

