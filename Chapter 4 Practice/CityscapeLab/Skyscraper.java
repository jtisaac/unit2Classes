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
    
    private int x; //x int
    private int y; // y int
    private int width; // width in x length
    private int height; // length of the height
    private int amount; //amount of buildings
    /**
     * Default constructor for objects of class Skyscraper
     */
    public Skyscraper(int topx , int topy , int botx , int boty)
    {
        x = topx;
        y = topy;
        width = botx;
        height = boty;
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
        while (rep <= amount){
        Random Rightlen = new Random();
        int right = Rightlen.nextInt(60);
        int up = right*2;
        Rectangle Skyber = new Rectangle();
        rep += 1;
        
    }

}
}
