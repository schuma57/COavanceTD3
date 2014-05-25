package tests;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertNotNull;

/** 
* ComputerFacade Tester. 
* 
* @author <Schuma>
* @since <pre>mai 23, 2014</pre> 
* @version 1.0 
*/ 
public class ComputerFacadeTest {
    private ComputerFacadeTest myPcFacade;

    @Before
    public void setUp(){
        myPcFacade = new ComputerFacadeTest();
    }

    @Test
    public void testFacadeIsNotNull() {
        assertNotNull(myPcFacade);
    }

    @Test
    public void testStart() throws Exception {
        //TODO
    }

} 
