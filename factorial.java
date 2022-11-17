import java.util.Scanner;
public class factorial {
	public static void main(String[] args)
	{
		int num,fact=1,i;
		System.out.println("Enter the number for which factorial is needed.");
		Scanner inp=new Scanner(System.in);
		num=inp.nextInt();
		for(i=2;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("The factorial of "+num+ " is "+ fact);
	}

}
