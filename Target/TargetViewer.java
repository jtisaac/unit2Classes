import javax.swing.JFrame;

/**
 * Write a description of class TargetViewer here.
 * Displays the Target
 * @author (Joseph Isaac) 
 * @version (10 5 15)
 */
public class TargetViewer
{

    /**
     * This method displays the Target
     *

     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}
