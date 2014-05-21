package designpattern;

import modele.User;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by schuma on 13/05/14.
 */
public class UserIterator {
    private ArrayList<User> users;

    public UserIterator(){
        users = new ArrayList<User>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        users.add(new User());
    }

    public void display(){
        Iterator itr = users.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }

}
