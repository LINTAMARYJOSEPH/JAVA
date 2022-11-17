import java.util.Scanner;
public class pattern7 {
   
		public static void main(String args[])   
			{    
				int i, j, row;    
				System.out.println("enter the number of rows of pyramid :");
				Scanner inp =new Scanner(System.in);
				row=inp.nextInt();
				for (i=1; i<=row; i++)   
				 {    
					    for (j=row-i; j>=1; j--)   
					   {  
					     System.out.print(" ");   
					   }   
					
					   for (j=1; j<=i; j++ )   
					     {   
					       System.out.print(j+ " ");   
					     }    
					    System.out.println();   
				 }   
			}   
	} 


