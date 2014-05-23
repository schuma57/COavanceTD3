package views;

import controler.MainControler;
import interfaces.IView;
import modele.User;

/**
 * Created by schuma on 23/05/14.
 */
public class MainView implements IView {
    private MainControler controler;

    public MainView(MainControler controler) {
        this.controler = controler;
    }

    @Override
    public void displayUser(User user) {
        System.out.println(user);
    }
}
