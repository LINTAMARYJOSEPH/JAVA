import java.util.Scanner;
public class SumofTwoNumbers {
	public static void main(String[]args)
	{
		int n1,n2,sum=0;
		System.out.println("Enter the first number to be added");
		Scanner inp=new Scanner(System.in);
		n1=inp.nextInt();
		System.out.println("Enter the second number to be added");
		n2=inp.nextInt();
		sum=n1+n2;
		System.out.println("The sum is "+sum);
	}

}
