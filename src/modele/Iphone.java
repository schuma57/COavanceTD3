package modele;

import interfaces.MobileShop;

/**
 * Created by schuma on 21/05/14.
 */
public class Iphone implements MobileShop {
    @Override
    public void displayModelNo() {
        System.out.println(" Iphone 6 ");
    }

    @Override
    public void displayPrice() {
        System.out.println(" € 650.00 ");
    }
}
