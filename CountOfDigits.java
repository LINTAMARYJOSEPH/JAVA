import java.util.Scanner;
public class CountOfDigits {
	public static void main(String[] args)
	{
		int num,d,count=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number");
		num=inp.nextInt();
		
		while(num>0)
		{
			d=num%10;
			count=count+1;
			num=num/10;
			
		}
		System.out.println("count of digits in the number is "+ count);
		
	}

}
