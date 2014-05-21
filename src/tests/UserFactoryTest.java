package tests;

import designpattern.UserFactory;
import modele.UserMajeur;
import modele.UserMineur;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertTrue;

/** 
* UserFactory Tester. 
* 
* @author <schuma57>
* @since <pre>avr. 23, 2014</pre> 
* @version 1.0 
*/

public class UserFactoryTest {

    @Test
    public void testUserFactory() {
        assertTrue(UserFactory.createUser(12) instanceof UserMineur);
        assertTrue(UserFactory.createUser(18) instanceof UserMajeur);
        assertTrue(UserFactory.createUser(22) instanceof UserMajeur);
    }

} 
