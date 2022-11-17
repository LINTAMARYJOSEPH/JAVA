import java.util.Scanner;
public class MultTable {
	public static void main(String[] args)
   {
		int limit,choice,prod;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the limit for the table");
		limit=inp.nextInt();
		System.out.println("For which number you need the table");
		choice=inp.nextInt();
		for(int i=1;i<=limit;i++)
		{
			prod=choice*i;
			System.out.println(choice+"*"+i+"="+prod);
		}
		
		
	
    }

}
