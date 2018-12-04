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
import Business.Enterprise.TransportEnterprise;

import Business.Enterprise.Enterprise;
import Business.Network.Network;


import Business.User.User;
//import Interface.Data.AirlinePanel;
import Interface.Data.DataWorkAreaJPanel;
import Interface.Data.ManageFlight;
import Interface.Data.SupplierJPanel;
import Interface.Sell.SellWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author peichun
 */
public class TransportRole extends Role {
    @Override 
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Department dep, Enterprise enterprise, Network network, EcoSystem business){
        return new ManageFlight(userProcessContainer, (TransportEnterprise)enterprise, network);
    }
}
