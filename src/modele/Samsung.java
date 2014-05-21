package modele;

import interfaces.MobileShop;

/**
 * Created by schuma on 21/05/14.
 */
public class Samsung implements MobileShop {
    @Override
    public void displayModelNo() {
        System.out.println(" Galaxy tab 3 ");
    }

    @Override
    public void displayPrice() {
        System.out.println(" € 450.00 ");
    }
}
