package mainpoint;

import designpattern.*;
import modele.Carre;
import modele.Gps;
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

        System.out.println("/nTest de Facade");
        ComputerFacade computer = new ComputerFacade();
        computer.start();

        System.out.println("/nTest de Observer");
        Gps g = new Gps();
        GpsObserver ac = new GpsObserver();

        g.addObserver(ac);
        g.setMesures("N 39°59°993 / W 123°00°000", 4); //on se deplace
        g.setMesures("N 37°48°898 / W 124°12°011", 5); //on se deplace
    }
}
