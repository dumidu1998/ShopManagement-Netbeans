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
public class StockM {
    private int id;
    private int itemid;
    private double quantity;
    private double unitprice;
    
    public StockM(int itemid,double qty,double uprice){
        this.itemid=itemid;
        this.quantity=qty;
        this.unitprice=uprice;
    }
    
    public void setqty(double qty){
        this.quantity=qty;
    }
    
    public void setuprice(double uprice){
        this.unitprice=uprice;
    }
    
    public int getitemid(){
        return this.itemid;
    }
    
    public double getquantity(){
        return this.quantity;
    }
    
    public double getunitprice(){
        return this.unitprice;
    }
    
}
