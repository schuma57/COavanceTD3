package designpattern;

import modele.User;

/**
 * Created by schuma on 23/04/14.
 */
public class UserSingleton {
    private static User userInstance = null;

    public static User getInstance() {
        if(userInstance == null)
            userInstance = new User();

        return userInstance;
    }

    private UserSingleton() {
    }
}
