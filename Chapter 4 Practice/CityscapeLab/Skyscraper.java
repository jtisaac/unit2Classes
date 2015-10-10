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
    private int x;
    private int y;
    /**
     * Default constructor for objects of class Skyscraper
     */
    public Skyscraper(int amount)
    {
       x = 800;
       y = 600;
       number = amount;
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
        System.out.println("Please enter a random integer: ");
        int boi = ajsouhrada.nextInt();
        int rep = 0;
     
        int right_adjust = 0;
        Random Rightlen = new Random(boi);
        while (rep <= number){
         int right = Rightlen.nextInt(50);
         right += 50;
  
         int up = right*2;
         if (up > 700){
            up = 700;
         }
        
         if (rep == 0){
           Rectangle skyber = new Rectangle(0,up,right,y); 
        
         }
         Rectangle skyber = new Rectangle(right_adjust,up,right,y); 
         g2.draw(skyber);
         if ( rep%2 == 0){
             g2.setColor(Color.BLUE);
            }
         else{
             g2.setColor(Color.BLACK);
            }
            g2.fill(skyber);
         right_adjust += right;
         rep += 1;
       
   

    }
   }
}