package designpattern;

import interfaces.MobileShop;
import modele.Iphone;
import modele.Nokia;
import modele.Samsung;

/**
 * Created by schuma on 21/05/14.
 */
public class ShopFacade {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop nokia;

    public ShopFacade(){
        iphone= new Iphone();
        samsung=new Samsung();
        nokia =new Nokia();
    }
    public void iphoneSale(){
        iphone.displayModelNo();
        iphone.displayPrice();
    }
    public void samsungSale(){
        samsung.displayModelNo();
        samsung.displayPrice();
    }
    public void nokiaSale(){
        nokia.displayModelNo();
        nokia.displayPrice();
    }
}
