package modele;

import interfaces.MobileShop;

/**
 * Created by schuma on 21/05/14.
 */
public class Nokia implements MobileShop {
    @Override
    public void displayModelNo() {
        System.out.println(" Lumia 800 ");
    }
    @Override
    public void displayPrice() {
        System.out.println(" € 500.00 ");
    }
}
