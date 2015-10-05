import java.util.Scanner;

/**
 * Write a description of class formatter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formatter
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

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
    public static void main(String[] args)
    {
        Scanner bob = new Scanner(System.in);
        System.out.print("Please enter the cost of the product(in pennies): ");
        int cost = bob.nextInt();
        System.out.print("Please enter the amount paid by the customer: ");
        int paid = bob.nextInt();
        int diff = paid - cost;
        int dollars = diff/100;
        diff = diff % 100;
        int quarters = diff / 25;
        diff = diff %25;
        int dimes = diff/10;
        diff = diff %10;
        int nickles = diff/5;
        diff = diff % 5;
        int pennies = diff;
        System.out.println("Dollars: " + dollars + " Quarters: " + quarters + " Dimes: " + dimes + " Nickles: " + nickles + " Pennies: " + pennies); 
        
    }

}
