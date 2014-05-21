package tests;

import designpattern.UserSingleton;
import modele.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;

/** 
* UserSingleton Tester. 
* 
* @author <schuma57>
* @since <pre>avr. 23, 2014</pre> 
* @version 1.0 
*/

public class UserSingletonTest {
    private User userTest;

    @Before
    public void setUp() {
        userTest = UserSingleton.getInstance();
    }

    @After
    public void after() throws Exception {
    }

    /**
    * Method: getInstance()
    */
    @Test
    public void testUserIsSingleton() {
        assertEquals(UserSingleton.getInstance(), this.userTest);
    }

} 
