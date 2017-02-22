/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.belly.burguer;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class Hamburger {
    private String breadType;
    private String meatType;
    private double price;
    protected int limAdditions;
    private ArrayList<Ingredient> additions = new ArrayList<Ingredient>();
    

    public Hamburger(String breadType, String meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        this.limAdditions = 4;
        
    }
    
   public boolean setAdditions(Ingredient additions){
       if(this.additions.size()<this.limAdditions){
           return this.additions.add(additions);
       }else{
           System.out.println("Limit excede");
           return false;
       }
       } 
   
   public boolean setAdditions(String name, int price){
       if (this.additions.size()<this.limAdditions){
           return this.additions.add(new Ingredient(name,price));
       }else{
           System.out.println("Limited excede");
           return false;
       }
       
   }
   
   public void getTotal(){
       double total = 0;
       System.out.println(this.meatType + "burguer "
        + "in" + this.breadType + " with a base price of " + this.price);
       
       total +=this.price;
       
       for (Ingredient tempIngredient : this.additions){
           System.out.println("Plus " + tempIngredient.getName() + "at " + 
                   tempIngredient.getPrice());
           total += tempIngredient.getPrice();
       }
       System.out.println("With a grand total at " + total);
   }

   
    
}
