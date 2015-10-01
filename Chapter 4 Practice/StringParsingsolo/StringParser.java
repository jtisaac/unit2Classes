import java.util.Scanner;

/**
 * Write a description of class StringParser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringParser
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number between 1,000 and 999,999 with a comma: ");
        String str = s.next();
        int index = str.indexOf(",");
        String num1 = str.substring(0, index);
        int len = str.length();
        String num2 = str.substring(index + 1, len);
        System.out.print(num1 + num2);
        
        
        
        
    }

}
