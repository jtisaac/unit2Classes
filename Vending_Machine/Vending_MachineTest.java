

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class Vending_MachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_MachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testfillUp()
    {
        Vending_Machine andrew = new Vending_Machine();
        andrew.fillUp(10);
        assertEquals(20, andrew.getTokenCount());
    }
}
