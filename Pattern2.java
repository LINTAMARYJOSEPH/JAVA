import java.util.Scanner;
public class Pattern2 {
	  
	public static void main(String args[])   
	{   
	
	int i, j, row;  
	
	System.out.println("Enter the limt");
	Scanner inp=new Scanner(System.in);
	row=inp.nextInt();
	
	for(i=1; i<=row; i++)   
	{   
	  
	for(j=1; j<=i; j++)   
	{   
	
	System.out.print(j+ " " );   
	}   
	  
	System.out.println( );   
	}   
	}   
}  


