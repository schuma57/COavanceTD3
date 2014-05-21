package modele;

import interfaces.ICarre;

/**
 * Created by schuma on 23/04/14.
 */
public class Carre implements ICarre{
    private int x;
    private int y;

    public Carre(int i, int j) {
        x =i;
        y=j;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void dessine() {
        System.out.println("Je suis un carré");
    }
}
