package designpattern;

import interfaces.ICarre;
import interfaces.IRond;
import modele.Rond;

/**
 * Created by schuma on 23/04/14.
 */
public class RondAdapteCarre implements IRond{
    private ICarre myCarre;

    public RondAdapteCarre(ICarre myCarre) {
        System.out.println("au depart je suis un carre");
        this.myCarre = myCarre;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public int getRayon() {
        return 0;
    }

    @Override
    public void dessine() {
        Rond rond = new Rond(myCarre.getX(), myCarre.getY(), 100);
        System.out.println("et finalement je deviens un rond");
    }

    @Override
    public void dessine(int rayon) {

    }
}
