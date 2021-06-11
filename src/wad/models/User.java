/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.models;

/**
 *
 * @author Dumidu Kasun
 */
public class User {
    private String username;
    private int usertype;
    private int id;
    
    public User(int id,int usertype,String username){
        this.id=id;
        this.username=username;
        this.usertype=usertype;
    }

    
    
    public String getUsername(){
        return this.username;
    }
    
    public int getUsertype(){
        return this.usertype;
    }
    
    
}
