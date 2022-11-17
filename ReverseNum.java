import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args)
	{
		int num,d,rev=0,n;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		num=inp.nextInt();
		n=num;
		while(num>0)
		{
			d=num%10;
			rev=rev*10+d;
			num=num/10;
			
		}
		System.out.println("The reverse of "+n+" is "+rev);
	}

}
