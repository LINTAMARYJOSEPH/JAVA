import java.util.Scanner;
public class Pattern4 {
	 
	public static void main(String[] args)   
	{  
	int row; 
	System.out.println("Enter the limt");
	Scanner inp=new Scanner(System.in);
	row=inp.nextInt();
	
	  
	for (int i = 1; i <= row; i++)   
	{  
	for (int j = 1; j <= i; j++)   
	{   
	System.out.print(j+" ");   
	}   
	System.out.println();   
	}   
	  
	for (int i = row-1; i >= 1; i--)  
	{  
	for (int j = 1; j <= i; j++)  
	{  
	System.out.print(j+" ");  
	}  
	System.out.println();  
	}  
	}  
	  

}
