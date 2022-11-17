package OOPS;
import java.util.Scanner;
public class Area {
	public int setDim(int len,int brdth)
	{
		int length=len;
		int breadth=brdth;
		int res=length*breadth;
		return (res);
	}
	public void getArea(int result)
	{
		int res=result;
		System.out.println("Area is "+res );
	}
	public static void main(String[] args)
	  {
	     int l,b;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter length"); 
	     l=s.nextInt();
	     System.out.println("Enter breadth");
	     b=s.nextInt();
	     Area a=new Area();
	   
	    a.getArea((a.setDim(l, b)));
	  }
	 
	

}
