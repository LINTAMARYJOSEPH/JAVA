import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]){  
		  int r,sum=0,temp,num;    
		  Scanner inp=new Scanner(System.in);
		   System.out.println("Enter the number to be checked");    
		  num=inp.nextInt();
		  temp=num;    
		  while(num>0){    
		   r=num%10; 
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

}
