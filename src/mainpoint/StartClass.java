package mainpoint;

import designpattern.RondAdapteCarre;
import designpattern.UserFactory;
import designpattern.UserIterator;
import designpattern.UserSingleton;
import modele.Carre;
import modele.Rond;
import modele.User;

/**
 * Created by schuma on 23/04/14.
 */
public class StartClass {

    public static void main(String[] args){
        User user1 = new User();
        User user2 = new User();

        boolean usersAreEquals = (user1 == user2);
        System.out.println("Resultat : " + usersAreEquals);


        User userSingleton = UserSingleton.getInstance();
        User userSingleton2 = UserSingleton.getInstance();

        usersAreEquals = (userSingleton == userSingleton2);
        System.out.println("Resultat : " + usersAreEquals);
        System.out.println("Prenom : " +userSingleton.getPrenom());

        UserFactory userFactory = new UserFactory();
        User user = userFactory.getTrueUser();
        System.out.println(user.toString());

        System.out.println();
        Carre carre = new Carre(5,3);
        carre.dessine();
        Rond rond = new Rond(5,3, 10);
        rond.dessine();
        RondAdapteCarre myNewRond = new RondAdapteCarre(carre);
        myNewRond.dessine();

        System.out.println("/nTest de Iterator");
        UserIterator it = new UserIterator();
        it.display();

    }
}
