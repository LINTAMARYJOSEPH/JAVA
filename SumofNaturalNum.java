import java.util.Scanner;
public class SumofNaturalNum {
	public static void main(String[] args)
	{
		int limit,i,sum=0;
		System.out.println("Enter the limit upto which the sum of natural numbers needed.");
		Scanner inp=new Scanner(System.in);
		limit=inp.nextInt();
		for(i=1;i<=limit;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of the first "+limit+ " natural number "+"is " +sum);
	}

}
