

/**
 * Write a description of class Car here.
 * 
 * @author (Isaac) 
 * @version (10 September 2015)
 */
public class Car
{
    /** specifies the fuel efficiency of the car in units of miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** specifies the amount of fuel in the gas tank in units of gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency of the car.
     */
    public Car(double fuelEfficiency)
    {
        // initialise instance variables
        fuelInTank = 0.0;
        fuelEfficiency = fuelEfficiency;
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the amouunt of fuel in the car's tank.
     *
     * @pre        the specified distance cannot consume more than the fuel available in the tank
     *            (what the method assumes about the method's parameters and class's state)
     *
     * @param     distance the specified distance to drive in miles
     * @return    description of the return value
     */
    public void drive( double distance )
    {
        fuelInTank -= distance / fuelEfficiency;
    }
    
    /**
     * Returns the # of gallons of gas in the car's tank.
     *  
     * @return  the # of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        // put your code here
        return fuelInTank;
    }
    
    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons.
     *
     * @pre     gallonsOfGas must be positive
     *          (what the method assumes about the method's parameters and class's state)
     * 
     * @param   gallonsOfGas amount in gallons to increment the fuel in the car's tank
     * @return  description of the return value
     */
    public void addGas( double gallonsOfGas)
    {
        // put your code here
        fuelInTank += gallonsOfGas;
    }



}
