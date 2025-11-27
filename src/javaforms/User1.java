/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaforms;

/**
 *
 * @author DEVANSHU DANGI
 */
class User1 {
      private int IId;
    private String IName;
    private String IPrice;
    private String IType;
  
    
    
    public User1(int ID,String Name,String Price, String type){
        this.IId = ID;
        this.IName = Name;
        this.IPrice = Price;
        this.IType= type;
       
        
    }
    
    public int getIId(){
        return this.IId;
    }
    
    public String getIName(){
        return this.IName;
    }
    
    public String getIPrice(){
    return this.IPrice;
    }
     public String getIType(){
    return this.IType;
    }
}
