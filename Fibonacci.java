import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args)
	{
		int limit,c;
		int a=0,b=1;
		System.out.println("Enter the limit upto which you need the series");
		Scanner inp=new Scanner(System.in);
		limit=inp.nextInt();
		System.out.print(a+","+b);
		for(int i=3;i<=limit;i++)
		{
		    c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
		}
	}

}
