import java.util.Scanner;

public class program5
{
    public static void main(String[] args)
    {

        int n,
        sqr = 1,
        sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        sqr = n * n;
        while (sqr > 0)
        {
            r = sqr % 10;
            sum = sum + r;
            sqr = sqr / 10;
        }
        if (n == sum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}