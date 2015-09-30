

/**
 * Write a description of class Vending_Machine here.
 * 
 * @author (Joseph Isaac) 
 * @version (9/21/15)
 */
public class Vending_Machine
{
    /** description of instance variable x (add comment for each instance variable) */
    
    private int stock;
    private int tokens;
    /**
     * Default constructor for objects of class Vending_Machine
     */
    public Vending_Machine()
    {
        this.stock = 10;// initialise instance variables
        this.tokens = 0;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter ™
     * @return    description of the return value
     */
    public void fillUp(int add)
    {
        this.stock = add + this.stock;
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void insertToken(int number)
    {
        this.tokens = tokens + number;// put your code here
        this.stock -= number;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value™
     */
    public int getCanCount()
    {
        // put your code here
        return stock;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getTokenCount()
    {
        
        return tokens;
    }


}
