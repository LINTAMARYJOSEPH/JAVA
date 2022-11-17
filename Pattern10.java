import java.util.Scanner;

public class Pattern10
{
	public static void main(String[] args)
	{
		
		Scanner inp = new Scanner(System.in);
	
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = inp.nextInt();
		
		System.out.println("0");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = i; j <= rows; j++) { System.out.print(j); } System.out.print("0"); for (int k = rows; k >= i; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

