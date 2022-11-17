import java.util.Scanner;

public class NumCheck {

	public static void main(String[]args)
	{
		int num;
		System.out.println("enter the number to check odd or even");
		Scanner inp= new Scanner(System.in);
		num=inp.nextInt();
		if(num%2==0)
		{
			System.out.println("The number"+ num+" is Even");
			
		}
		else
		{
			System.out.println("The number"+ num+" is odd");

		}
	}
	
}
