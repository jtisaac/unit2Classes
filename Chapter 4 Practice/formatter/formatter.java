import java.util.Scanner;

/**
 * Write a description of class formatter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class formatter
{

    public void main()
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int first = num.substring(0,4);
        int second = num.substring(3,7);
        int third = num.substring(6,10);
        String tot = "(" + first + ")" + second + "-" + third;
        System.out.println(tot);
    }

}
