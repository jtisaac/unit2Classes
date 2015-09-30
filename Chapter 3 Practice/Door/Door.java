

/**
 * Write a description of class Door here.
 * a door
 * @author (your Isaac) 
 * @version 9/17/15
 */
public class Door
{
    //These are the insance variables
    private String name; // name of door
    private String state; // open or closed

    public Door(String name,String state)
    {
        // initialise instance variables (Constructor)
        //THIS IS THE CONSTRUCTOR!!!>>!>
        this.state = state;
        this.name = name;
    }

    /**
     * Opens the door
     *
     * @pre        door has a state (No pre)
     *             
     *            
     * @post       the door will have a closed state
     * 
     */
    public void open()
    {
        // put your code here
        this.state = "Open";
        //do not return
    }


    /**
     * Closes the door
     *
     * @pre     door has a state
     * 
     * @post the door will be closed
     */
    public void close()
    {
        // put your code here
        this.state = "Closed";
        //return Door.state;
    }
    

    /**
     * retrieves the state of the door
     *
     * @pre     the door has a state
     * @post    
     * 
     * @return  this.state
     */
    public String getState()
    {
        // put your code here
        return this.state;
    }
    

    /**
     * Gets the name of the object
     *
     * @pre     the object has a name
     * 
     * 
     * @return  this.name
     */
    public String getName()
    {
        // put your code here
        return this.name;
    }
    

    /**
     * Takes in a new name
     *
     * @pre     the object has a name
     * 
     * @post    the object will have the new name
     * @param   the string that the person enters for the new name
     * 
     */
    public void setName(String newName)
    {
        // put your code here
        this.name = newName;
    }
    

    /**
     * Sets the state of the object
     *
     * @pre     the class has a state
     * @post    the state of the door will be changed to the param
     *          
     * @param   string of new state
     * 
     */
    public void setState(String newState)
    {
        // put your code here
        this.state = newState;
    }
    
}
