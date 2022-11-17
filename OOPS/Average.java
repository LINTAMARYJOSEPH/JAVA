package OOPS;
import java.util.Scanner;
public class Average {
	public void calcAvg(int a,int b,int c)
	{
		int num1=a,num2=b,num3=c;
		float avg=(num1+num2+num3)/3;
		 System.out.println("Average is "+ avg);
	}
   public static void main(String[] args)
   {
	   Scanner inp=new Scanner(System.in);
	   int a,b,c;
	   System.out.println("Enter the numbers");
	   a=inp.nextInt();
	   b=inp.nextInt();
	   c=inp.nextInt();
	   Average av=new Average();
	   av.calcAvg(a, b, c);
	   
   }
}
