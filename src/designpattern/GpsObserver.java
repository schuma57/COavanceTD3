package designpattern;

import modele.Gps;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by schuma on 22/05/14.
 */
public class GpsObserver implements Observer {

    @Override
    public void update(Observable o, Object obj){
        if(o instanceof Gps){
            Gps g = (Gps) o;
            System.out.println("Position : "+g.getPosition()+"  Précision : "+g.getPrecision()+"/10");
        }
    }
}
