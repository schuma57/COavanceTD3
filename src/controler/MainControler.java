package controler;

import interfaces.IView;
import modele.User;

/**
 * Created by schuma on 23/05/14.
 */
public class MainControler {
    private User modele;
    private IView vue;

    public MainControler() {
        this.modele = new User();
    }

    public void addVue(IView vue) {
        this.vue = vue;
    }

    public IView getVue() {
        return this.vue;
    }

    public void displayListUser(){
        vue.displayUser(modele);
    }

}
