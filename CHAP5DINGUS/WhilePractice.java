public class WhilePractice
{
    public static void main(String[] args)
    {
        double x = 1;
        double y = 1;
        int i = 0;
        while (y <= 1.5)
        {
            x = x/2;
            y = x+y;
            i++;
        }
        System.out.println(i);
    }
}
    