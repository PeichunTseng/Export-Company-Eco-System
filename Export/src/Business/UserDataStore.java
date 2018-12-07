/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.User;
import Business.User.UserDirectory;
import java.util.ArrayList;



/**
 *
 * @author raoyuhuizi
 */
public class UserDataStore {
    private ArrayList<User> userList;
    private UserDataStore datastore;
    public UserDataStore(){
        
        userList = new ArrayList<>();
        
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public User createUser(String username){
        User user=new User();
        user.setUsername(username); 
        userList.add(user);
        return user;
    }

    public UserDataStore getDatastore() {
        return datastore;
    }

    public void setDatastore(UserDataStore datastore) {
        this.datastore = datastore;
    }
    public boolean checkUsername(String username){
        for(User u:userList){
            if(u.getUsername().equals(username))
                return false;
        }
        return true;
    }
     public void deleteUser(User user){
        
        userList.remove(user);
        
    }
}
