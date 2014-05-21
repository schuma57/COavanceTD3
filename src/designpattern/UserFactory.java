package designpattern;

import modele.User;

/**
 * Created by schuma on 23/04/14.
 */
public class UserFactory {
    private User user;

    public UserFactory(){
        //fabrique l'objet User
        user = UserSingleton.getInstance();
    }

    public User getTrueUser(){
        user.setNom("Fou");
        user.setPrenom("Karima");
        user.setAge(32);

        return user;
    }
}
