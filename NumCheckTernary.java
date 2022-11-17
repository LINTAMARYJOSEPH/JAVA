import java.util.Scanner;
public class NumCheckTernary {
	
	public static void main(String[]args)
	{
		int num;
		System.out.println("Enter the number to be checked ");
		Scanner inp=new Scanner(System.in);
		num=inp.nextInt();
		String result;
		result= (num%2==0)? "Even Number":"Odd Number";
		System.out.println(num+" is "+result);
	}

}
