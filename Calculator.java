import java.util.Scanner;
public class Calculator {
public static void main(String[]args) {
	
	int choice,n1,n2,res;
	char ch;
	System.out.println("Enter the operand 1");
	Scanner inp=new Scanner(System.in);
	n1=inp.nextInt();
	System.out.println("Enter the operand 2");
	n2=inp.nextInt();
	
	do
	{
		System.out.println("choose from the below Operator Choices");
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.*");
		System.out.println("4./");
		choice=inp.nextInt();
		
	switch(choice)
	{
	case 1: res=n1+n2;
	        System.out.println("Sum is "+res);
	       	break;
	        
	case 2: res=n1-n2;
	        System.out.println("Difference is "+res);
	        break;
	case 3: res=n1*n2;
	        System.out.println("product is "+res);
	        break;
	case 4: res=n1/n2;
	        System.out.println("quotient is "+res);
	        break;
	default: System.out.println("No more operation available");
		
	}
	System.out.println("Do you want to continue Y/N");
	ch=inp.next().charAt(0);
	}
	while(ch=='y'||ch=='Y');
	
	
	
}

}
