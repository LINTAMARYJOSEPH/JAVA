package OOPS;
import java.util.Scanner;
class Area1 
{
	   int length,breadth;
	  public Area1(int l,int b)
	  {
	       length=l;
	       breadth=b;
	   }
	  public int returnArea()
	  {
	        return length*breadth;
	  }
	  
	  public static void main(String[] args)
	  {
	     int l,b;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter length"); 
	     l=s.nextInt();
	     System.out.println("Enter breadth");
	     b=s.nextInt();
	     Area1 a=new Area1(l,b);
	    System.out.println("Area is :"+a.returnArea());
	  }
	 

}
