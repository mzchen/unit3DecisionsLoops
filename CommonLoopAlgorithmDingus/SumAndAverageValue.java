import java.util.Scanner;
public class SumAndAverageValue
{

    public static void main (String [] args)
    {
        double total = 0;
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter multiple numbers or \"Q\" to quit");
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            total += value;
            count ++;
        }
        double average = 0;
        if (count > 0)
        {
            average = total/count;
        }
        System.out.println("Total: " + total + " Average: " + average );
    }

}
