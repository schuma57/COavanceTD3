package tests;

import designpattern.GpsObserver;
import modele.Gps;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/** 
* GpsObserver Tester. 
* 
* @author <Schuma>
* @since <pre>mai 23, 2014</pre> 
* @version 1.0 
*/ 
public class GpsObserverTest {
    private GpsObserver myObserver;

    @Before
    public void setUp(){
        myObserver = new GpsObserver();
    }

    @Test
    public void testObserverIsNotNull() {
        assertNotNull(myObserver);
    }

    @Test
    public void testUpdate() throws Exception {
        Gps gps = new Gps();
        gps.addObserver(myObserver);
        gps.setMesures("N 39°59°993 / W 123°00°000", 4);

        assertEquals("N 39°59°993 / W 123°00°000", gps.getPosition());
        assertEquals(4, gps.getPrecision());
    }

} 
