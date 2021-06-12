/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.DAO;

import java.sql.Statement;
import wad.Connection;

/**
 *
 * @author Dumidu Kasun
 */
public class UserDAO {
    
    public void deleteuser(String uname){
	    String query="DELETE FROM users WHERE username = '"+uname+"'";
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
    }
    
    public void adduser(String uname,String pwd,int utype){
	    String query="INSERT INTO users(username,password,type) VALUES ('"+uname+"','"+pwd+"',"+utype+")";
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
    }
    
    
    
    
    
    
}
