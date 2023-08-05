public class Program3 
{
    public static void main(String args[]) 
    {
        int row = 6; 
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < row - i; j++) 
            {
                System.out.print("  ");
            }

            int val = 1;
            for (int j = 0; j <= i; j++) 
            {
                System.out.printf("%4d", val);
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
