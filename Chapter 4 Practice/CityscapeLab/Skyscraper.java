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
    private int x; // the start x
    private int y; // the start y
    private int boi; // the random number (parameter)
    /**
     * Default constructor for objects of class Skyscraper
     */
    public Skyscraper(int amount,int randnum, int xlength, int ylength)
    {
       x = xlength;
       y = ylength;
       number = amount;
       boi = randnum;
    }

     /**
     * Make a drawing of skyscrapers

     * @param   Graphics2D g2

     */
    public void draw(Graphics2D g2)
    {
        int rep = 0;
        int right_adjust = 0;
        Random Rightlen = new Random(boi);
        while (rep <= number){
         int right = Rightlen.nextInt(50);
         right += 50;
  
         int up = right*2;
         if (up > y-100){
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
    rep = 0;
    right_adjust = 0;
    while (rep <= number){
         int right = Rightlen.nextInt(50);
         right += 10;
  
         int up = right*2;
         right+= 30;
         if (up > y-100){
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