import java.util.Scanner;
public class SwapNumWithoutTemp {
	public static void main(String[] args)
	{
		int n1,n2;
		System.out.println("Enter the first Number");
		Scanner inp=new Scanner(System.in);
		n1=inp.nextInt();
		System.out.println("Enter the second Number");
		n2=inp.nextInt();
		System.out.println("Before Swapping..");
		System.out.println("n1="+ n1);
		System.out.println("n2="+ n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After Swapping..");
		System.out.println("n1="+ n1);
		System.out.println("n2="+ n2);




		}
	}


