/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.belly.burguer;

/**
 *
 * @author jaime
 */
public class DeluxeBurguer extends Hamburger{
    
    public DeluxeBurguer(String breadType, String meatType, double price,
            Ingredient additions1, Ingredient additions2){
        super(breadType,meatType,price);
        limAdditions=2;
        this.setAdditions(additions1);
        this.setAdditions(additions2);
    }
    
      public DeluxeBurguer(String breadType, String meatType, double price,
            String name1, String name2, int price1, int price2){
        super(breadType,meatType,price);
        limAdditions=2;
        this.setAdditions(name1, price1);
        this.setAdditions(name2, price2);
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a deluxe burger");
        super.getTotal();
    }

    
    
     
    
}
