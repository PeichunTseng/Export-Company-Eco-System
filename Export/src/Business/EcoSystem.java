/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Department.Department;
import java.util.ArrayList;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SysAdmRole;


/**
 *
 * @author raoyuhuizi
 */
public class EcoSystem extends Department{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private AllDataStore datastore;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    public Network createNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roleList =new ArrayList<Role>();
        roleList.add(new SysAdmRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        datastore=new AllDataStore();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    public boolean checkUser(String userName){
        
        for(Network network:networkList){
           if(!this.getUserList().checkUsername(userName)){
            return false;
        } 
        }
        return true;
    }
}
