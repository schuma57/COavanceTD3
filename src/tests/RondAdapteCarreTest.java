package tests;

import designpattern.RondAdapteCarre;
import modele.Carre;
import modele.Rond;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;

/** 
* RondAdapteCarre Tester. 
* 
* @author <Schuma57>
* @since <pre>mai 20, 2014</pre> 
* @version 1.0 
*/ 
public class RondAdapteCarreTest { 
    private RondAdapteCarre myAdapter;

    @Before
    public void setUp() {
        Carre carre = new Carre(2,2);
        assertTrue(carre instanceof Carre);
        myAdapter = new RondAdapteCarre(carre);
    }


    /**
    * Method: dessine()
    */
    @Test
    public void testDessine() throws Exception {
    //TODO: Test goes here...
    }

    /**
    * Method: dessine(int rayon)
    */
    @Test
    public void testDessineRayon() throws Exception {
    //TODO: Test goes here...
    }


} 
