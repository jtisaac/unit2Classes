import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;



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
        
        xLeft = x;//top left
        yTop = y;//top left
    }

    /**
     * Draws the Target.

     * @param    g2- the graphics content

     */
    public void draw(Graphics2D g2)
    {
        
        Ellipse2D.Double big = new Ellipse2D.Double(xLeft,yTop,100,100);
        g2.draw(big);
        Ellipse2D.Double medium = new Ellipse2D.Double(xLeft+25,yTop+25,50,50);
        g2.draw(medium);
        Ellipse2D.Double small = new Ellipse2D.Double(xLeft+40,yTop+40,20,20);
        g2.draw(small);
        //Rectangle body = new Rectangle(xLeft, yTop +10,60,10);
        //Ellipse2D.Double 
        //return x+y;
    }

}
