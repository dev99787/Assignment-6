import java.util.Scanner;

public class program2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Square Side = ");
		int side = sc.nextInt();
		
		System.out.println("Printing Hollow Square Star Pattern");
		int j, i = 0; 
		while (i < side ) 
		{
			j = 0 ;
			while ( j < side ) 
			{
				if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}