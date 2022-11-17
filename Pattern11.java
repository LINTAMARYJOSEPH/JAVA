import java.util.Scanner;

 public class Pattern11
{
    public static void main(String[] args)
    {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = inp.nextInt();
       
        int temp = 1;
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			int temp1 = temp - 1;
			for (int k = 2; k <= i; k++)
			{
				System.out.print(--temp1 + " ");
			}
			System.out.println();
		}
    }
}

 