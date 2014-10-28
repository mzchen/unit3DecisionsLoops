import java.util.Scanner;
public class Leapyear
{

    public static void main(String[] args)
    {
        Scanner dingus = new Scanner(System.in);
        System.out.println("What is the year you are checking?");
        int year = dingus.nextInt();
        if (year % 400 == 0 || (year %4 == 0 &&(year % 100 != 0)))
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }

    }
}
