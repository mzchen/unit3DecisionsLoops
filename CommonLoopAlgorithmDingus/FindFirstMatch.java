import java.util.Scanner;
public class FindFirstMatch
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter a String" );
        String str = in.nextLine();
        int index = 0;
        char ch = '♫';
        while (index < str.length())
        {
            ch = str.charAt( index );
            if( ch == ' ')
            {
                break;
            }
            index++;
        }
        if( ch == ' ' )
        {
            System.out.println("Index of the first space: "+index);
        }
    }

}
