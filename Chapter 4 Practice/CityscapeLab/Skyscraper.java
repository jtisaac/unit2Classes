import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
/**
 * Write a description of class Skyscraper here.
 * This will be a steriotypical skyscraper
 * @JTIsaac  
 * @version (10/5/2015)
 */
public class Skyscraper
{
    
    
    private int amount; //amount of buildings
    /**
     * Default constructor for objects of class Skyscraper
     */
    public Skyscraper(int amount)
    {
        this.amount  = amount;
    }

     /**
     * Make a painting of skyscrapers
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param     
     * @return    description of the return value
     */
    public void makeScrape(Graphics2D g2)
    {
        int rep = 0;
        while (rep <= this.amount){
        Random Rightlen = new Random();
        int len = Rightlen.nextInt(60);
        int up = len*2;
        if (up > 600){
            up = 580
        
        
        }
        
        Rectangle Skyber = new Rectangle(x,y,100,200);
        rep += 1;
    }
}