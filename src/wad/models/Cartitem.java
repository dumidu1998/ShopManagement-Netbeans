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
public class Cartitem {
    int itemid;
    double qty;
    double unitprice;
    double total;
    
    public Cartitem(int itemid,double qty, double unitprice){
        this.itemid=itemid;
        this.qty=qty;
        this.unitprice=unitprice;
        this.total = qty*unitprice;
    }
    
    public int getitemid(){
        return this.itemid;
    }
    
    public double getqty(){
        return this.qty;
    }
    
    public double getunitprice(){
        return this.unitprice;
    }
    
    public double gettotal(){
        return this.total;
    }
}
