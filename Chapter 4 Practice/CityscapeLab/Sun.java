import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Sun here.
 * This is a sun
 * @author (Joseph Isaac) 
 * @version (oct 10)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int radius; //the radius of the Sun

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int radius)
    {
        this.radius = radius;// initialise instance variables
        
    }

    /**
     * Draws the sun
     *
     * 
     * @param    Graphics2D g2
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sunchers = new Ellipse2D.Double(0,0,radius*2,radius*2);
        g2.setColor(Color.YELLOW);
        g2.fill(sunchers);
    }

}
