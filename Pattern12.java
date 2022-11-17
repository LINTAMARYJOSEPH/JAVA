import java.util.Scanner;
public class Pattern12 {
	public static void main(String[] args)
    {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = inp.nextInt();
	    for (int i = 1; i <= rows; i++)
	   {
		   for (int j = 1; j <= i; j++)
		  {
			  System.out.print((int) Math.pow(j, i) + " ");
		   }
		 System.out.println();
	   }
     }

}
