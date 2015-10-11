import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @Jisaac @gcschmit
 * @version 10 2 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    Sun land_of_the_rising_sun; 
    Cloud gavriles; 
    Skyscraper skyWord;// comes from the other class!!!! how do i do this?
    //Graphics2D g2 = (Graphics2D) g;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(int random, int xlength, int ylength)
    {
     land_of_the_rising_sun = new Sun(60);
     gavriles = new Cloud(1);
     skyWord = new Skyscraper(10,random, xlength, ylength);// comes from the other class!!!! how do i do this?
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
    
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
        land_of_the_rising_sun.draw(g2);
        skyWord.draw(g2);
        gavriles.draw(g2);

    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
            
        gavriles.moveandupdate();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
