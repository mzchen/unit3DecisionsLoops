import java.util.Scanner;

public class compareAdjacent
{

    public static void main(String[] args)
    {
        final double EPSILON = 1e-7;
        String first = "";
        String second = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers(Type a letter to quit) ");
        double prevValue = in.nextDouble();
        while( in.hasNextDouble())
        {
            double value = in.nextDouble();
            if( Math.abs(value - prevValue) < EPSILON )
            {
                System.out.println( "Duplicate number" );
            }
            prevValue = value;
        }
    }

}
