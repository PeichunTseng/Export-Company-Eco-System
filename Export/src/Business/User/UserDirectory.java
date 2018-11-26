/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class UserDirectory {
    private ArrayList<User> userList;
    
    public UserDirectory(){
        userList=new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public User authenticateUser(String username,String password){
        for(User u:userList){
            if(u.getUsername().equals(username))
                return u;
        }
        return null;
    }
    
    public User createUser(String username,String password,Employee employee,Role role){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmployee(employee);
        user.setRole(role);
        userList.add(user);
        return user;
    }
    //check if name is unique
    public boolean checkUsername(String username){
        for(User u:userList){
            if(u.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
