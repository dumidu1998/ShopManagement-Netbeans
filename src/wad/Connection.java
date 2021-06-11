/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dumidu Kasun
 */
public class Connection {
     private static Connection instance = new Connection();

    private static java.sql.Connection con;
    
    private Connection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mayasuper?zeroDateTimeBehavior=convertToNull","root","");
            System.out.println("Connected to DB");
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("DB error");
//            
        }
    }
    
    public static java.sql.Connection getConnection() {
        return con;
    }
}
