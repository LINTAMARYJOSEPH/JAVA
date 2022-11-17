import java.util.Scanner;
public class Q1PrintNum {
	
     public static void main(String[] args)
     {
    	 int num;
    	 System.out.println("Enter the number to be printed");
    	 Scanner inp=new Scanner(System.in);
    	 num=inp.nextInt();
    	 inp.close();
    	 System.out.println(num);
     }

}
