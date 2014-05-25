package tests;

import designpattern.UserIterator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserIterator Tester. 
* 
* @author <Authors name> 
* @since <pre>mai 20, 2014</pre> 
* @version 1.0 
*/ 
public class UserIteratorTest {
    private UserIterator iter;

    @Before
    public void setUp() throws Exception {
        iter = new UserIterator();
    }

    @Test
    public void testDisplay() throws Exception {
        iter.display();
    }


}