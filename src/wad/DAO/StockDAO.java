/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.DAO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Statement;
import wad.Connection;
import wad.models.StockM;
import java.sql.ResultSet;
import wad.models.Cartitem;

/**
 *
 * @author Dumidu Kasun
 */
public class StockDAO {
    
    
    public StockDAO() {
        
    }
    
    
    public void addstock(StockM stock){
	    String query="INSERT INTO stock(itemid,qty,unitprice) VALUES ("+stock.getitemid()+","+stock.getquantity()+","+stock.getunitprice()+")";
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
     }
    
    
    public void deletestock(int id){
	    String query="DELETE FROM stock WHERE id = "+id;
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
     }
    
    
    public int getproductid(String name){
         String query="SELECT id FROM product where item_name='"+name+"'";
         int c = 0;
            try{
                Statement stmt = Connection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
	       c = rs.getInt("id");
                rs.close();
	       return c;
            }catch (Exception e){
                e.printStackTrace();
            }
            return c;
    }
    
    public double getprice(int id){
         String query="SELECT unitprice FROM stock where itemid='"+id+"'";
         double c = 0;
            try{
                Statement stmt = Connection.getConnection().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
	       c = rs.getDouble("unitprice");
                rs.close();
	       return c;
            }catch (Exception e){
                e.printStackTrace();
            }
            return c;
    }
    
    public void add(Cartitem item){
        String query="INSERT INTO tempcart(itemid,qty,price) VALUES ("+item.getitemid()+","+item.getqty()+","+item.getunitprice()+")";
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
    }
    
    public void emptycart(){
        String query="TRUNCATE TABLE tempcart";
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
    }
    
    
    public void dosale(double disc,double total){
        String query="INSERT INTO sales(discount,total) VALUES ("+disc+","+total+")";
            try{
                Statement stmt = Connection.getConnection().createStatement();
                stmt.executeUpdate(query);
            }catch (Exception e){
                e.printStackTrace();
            }
          emptycart();
    }
    
    
    
}
