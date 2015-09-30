import java.util.Scanner;

/**
 *Prints dimentions of a rectangle based upon user input
 * 
 * @author (Joseph Isaac) 
 * @version (9/30/15)
 */
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print ("Please enter the height of the rectangle: ");
        double height = s.nextDouble();
        System.out.print ("Please enter the width of the rectangle: ");
        double width = s.nextDouble();
        double area = height*width;
        double perimeter = height*2 + width*2;
        double diagonal = Math.pow((Math.pow(height,2)+ Math.pow(width,2)),.5);
        System.out.print ("Area: " + area + "\n" + "Perimeter: " + perimeter + "\n" + "Diagonal: " + diagonal);
        
    }
}
