package designpattern;

import modele.User;
import modele.UserMajeur;
import modele.UserMineur;

/**
 * Created by schuma on 23/04/14.
 */
public class UserFactory {
    private User user;

    public UserFactory(){
        //fabrique l'objet User
        user = UserSingleton.getInstance();
    }

    public static User createUser(int age) {
        if (age < 0) throw new IllegalArgumentException("L'âge doit être positif");
        if(age < 18)
            return new UserMineur();
        else
            return new UserMajeur();
    }

    public User getTrueUser(){
        user.setNom("Fou");
        user.setPrenom("Karima");
        user.setAge(32);

        return user;
    }
}
