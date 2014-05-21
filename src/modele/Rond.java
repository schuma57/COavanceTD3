package modele;

import interfaces.IRond;

/**
 * Created by schuma on 23/04/14.
 */
public class Rond implements IRond{
    private int x;
    private int y;
    private int rayon;

    public Rond(int i, int j, int r) {
        x =i;
        y=j;
        rayon = r;
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

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public void dessine() {
        System.out.println("Je suis un rond");
    }

    @Override
    public void dessine(int rayon) {
        System.out.println("Je suis un rond de rayon " +getRayon());
    }
}
