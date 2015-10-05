import java.util.Scanner;

/**
 * Write a description of class formatter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formatterpseudocode1 
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String num = s.next();
        String first = num.substring(0,4);
        String second = num.substring(3,7);
        String third = num.substring(6,10);
        String tot = "(" + first + ")" + second + "-" + third;
        System.out.println(tot);
    }

}
