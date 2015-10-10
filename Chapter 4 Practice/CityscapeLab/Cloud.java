import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud
{
    /** description of instance variable x (add comment for each instance variable) */
    private int number;
    private int xstart;
    private int ystart;
    private int xend;
    private int yend;

    /**
     * Default constructor for objects of class Clouds
     */
    public Cloud(int amount)
    {
        number = amount;
        xstart = 100;
        ystart = 100;
        xend = 300;
        yend = 150;// initialise instance variables
    }

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
    public void draw(Graphics2D g2)
    {
        int rep = 0;
        while(rep <= number){// put 
        int iteration = 0;
         while (iteration < 8){
         Ellipse2D.Double maxymilian = new Ellipse2D.Double(xstart,ystart, xend, yend);
         g2.setColor(Color.GRAY);
         g2.fill(maxymilian);
       
         iteration += 1;
        }
        rep += 1;
       }
    }
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
    public void move()
    {
        Ellipse2D.Double maxymilian = new Ellipse2D.Double(xstart+5,ystart-2.5, xend+5, yend+2.5);
    }
}

