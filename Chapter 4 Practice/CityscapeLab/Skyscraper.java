import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Color;
import java.util.Scanner;
/**
 * Write a description of class Skyscraper here.
 * This will be a steriotypical skyscraper
 * @JTIsaac  
 * @version (10/5/2015)
 */
public class Skyscraper
{
    private int number; //amount of buildings

    /**
     * Default constructor for objects of class Skyscraper
     */
    public Skyscraper(int amount)
    {

       number  = amount;
    }




     /**
     * Make a painting of skyscrapers
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param   vandrew   
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Scanner ajsouhrada = new Scanner(System.in);
        int rep = 0;

        int right_adjust = 0;
        Random Rightlen = new Random(2);
        while (rep <= number){
        
       
        int right = Rightlen.nextInt(50);
        right += 50;
        
        int up = right*2;
        if (rep == 0){
        Rectangle skyber = new Rectangle(0,up,right,800); 
        
       }
      Rectangle skyber = new Rectangle(right_adjust,up,right,800); 
      g2.draw(skyber);
      g2.setColor(Color.BLUE);
      g2.fill(skyber);
      right_adjust += right;
      rep += 1;
    }
   }

}
