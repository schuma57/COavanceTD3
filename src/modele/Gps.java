package modele;

import java.util.Observable;

/**
 * Created by schuma on 23/05/14.
 */
public class Gps extends Observable {
    private String position;
    private int precision;

    public Gps(){
        position="inconnue";
        precision=0;
    }

    public void notifierObservateurs(){
        setChanged();
        notifyObservers();
    }

    public void setMesures(String position, int precision){
        this.position=position;
        this.precision=precision;
        notifierObservateurs();
    }

    public String getPosition(){
        return position;
    }

    public int getPrecision(){
        return precision;
    }
}
