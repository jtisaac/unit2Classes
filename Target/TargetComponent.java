import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * This component draws a target shape
 * 
 * @author (your josephname) 
 * @version (a version 1`0 5 15number or a date)
 */
public class TargetComponent extends JComponent
{
   

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target NowsTheTimeHereIsThePlace = new Target(0,0);
        

        //big.draw(g2);
        //medium.draw(g2);
        NowsTheTimeHereIsThePlace.draw(g2);
    }
}
        
        



