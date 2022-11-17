import java.util.Scanner;
public class LeapYearOrNot {
	
	public static void main(String[] args)
	{
		int year;
		System.out.println("Enter the year to checked");
		Scanner inp=new Scanner(System.in);
		year=inp.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0))
		{
			System.out.println(year+" ,This is  a leap year");

		}
		else
		{
			System.out.println(year+" ,This is not a leap year");
		}
		
		
	}

}
