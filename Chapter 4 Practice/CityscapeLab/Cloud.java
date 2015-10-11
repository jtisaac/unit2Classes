import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Cloud here.
 * 
 * @author (Joseph Isaac) 
 * @version (oct 10)
 */
public class Cloud
{
    
    private int number; // number of clouds
    private int xstart; // x top left starting coordinate
    private int ystart; // y top left start coord
    private int xend; // x bot right coord
    private int yend; // y bot right coord
    private int currentx;// current x coord
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
        currentx = 100;
    }
    Ellipse2D.Double maxymilian = new Ellipse2D.Double(xstart,ystart, xend, yend);
    /**
     * draws the cloud
     * @param    graphics2D g2
    
     */
    public void draw(Graphics2D g2)
    {
        
         
         g2.setColor(Color.GRAY);
         g2.fill(maxymilian);
       

       }
    
    /**
    this method moves the cloud object
     */
    public void moveandupdate()
    {
        double theX = maxymilian.getX();
        currentx = (int) theX;
        maxymilian.setFrame(currentx+5,ystart, currentx+205, yend);
    }
}

