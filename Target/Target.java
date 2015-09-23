import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;



/**
 * A shooting target
 * @author (Joseph Isaac) 
 * @version (9/23/15)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class TargetClass
     */
    public Target(int x, int y)
    {
        
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the Target.
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    g2 the graphics content
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        //Rectangle body = new Rectangle(xLeft, yTop +10,60,10);
        //Ellipse2D.Double 
        //return x+y;
    }

}
