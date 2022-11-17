import java.util.Scanner;
public class LargestNumofThree {

	public static void main(String[] args)
	{
		int n1,n2,n3;
		System.out.println("Enter the first Number");
		Scanner inp=new Scanner(System.in);
		n1=inp.nextInt();
		System.out.println("Enter the second Number");
		n2=inp.nextInt();
		System.out.println("Enter the third Number");
		n3=inp.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1 + " is the largest ");
		}
		else
		{
			
			if(n2>n3)
			{
				System.out.println(n2 + " is the largest ");
			}
			else
			{
				System.out.println(n3 + " is the largest ");
			}
		}
		

	}


}
