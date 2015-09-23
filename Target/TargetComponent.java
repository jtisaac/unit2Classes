import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * This component draws a target shape
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class TargetComponent
     */
    public TargetComponent()
    {
        // initialise instance variables
        
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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target andrew = new Target(0,0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Target tony = new Target(x,y);
        
        andrew.draw(g2);
        tony.draw(g2);
    }
}
        
        



