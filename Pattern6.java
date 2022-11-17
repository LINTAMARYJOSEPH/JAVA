import java.util.Scanner;
public class Pattern6 {
		 
		public static void main(String[] args)   
		{  
		int i, j, rows;
		 
		System.out.println("Enter the limt");
		Scanner inp=new Scanner(System.in);
		rows=inp.nextInt();
		
		for (i = rows; i >=1; i--)   
		{  
		for (j = i; j >= 1; j--)  
		{  
		System.out.print(j+" ");  
		}  
		System.out.println();  
		}  
		
		for (i =2; i<=rows; i++)   
		{  
		for (j = i; j>=1; j--)  
		{  
		System.out.print(j+" ");  
		}  
		System.out.println();  
		}  
		}  

}
