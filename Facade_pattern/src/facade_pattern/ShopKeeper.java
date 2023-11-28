/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_pattern;

/**
 *
 * @author fa20-bse-127
 */
public class ShopKeeper {
private MobileShop iphone;  
private MobileShop samsung;  
private Blackberry blackberry;

public ShopKeeper(){  
iphone= new IPhone();  
samsung= new Samsung();   
blackberry = new Blackberry();
}  
public void sellIPhone(){  
iphone.modelNo();  
iphone.price();  
}  
public void sellSamsung(){  
samsung.modelNo();  
samsung.price();
}   
public void sellBlackberry(){  
blackberry.modelNo();  
blackberry.price();
} 
}  
