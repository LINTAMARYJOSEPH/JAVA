import java.util.Scanner;
public class PowerOfNum {
	public static void main(String[] args)
	{
		int num,exp,i,res;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=inp.nextInt();
		System.out.println("Enter the exponential");
		exp=inp.nextInt();
		res=num*num;
		for(i=2;i<exp;i++)
		{
	       res=res*num;
		}
		System.out.println(num+"^"+exp+"="+res);
	}

}
