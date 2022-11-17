import java.util.Scanner;
public class PrimeOrNot {
		  public static void main(String[] args) {

		    int num;
		    boolean flag = false;
		    Scanner inp=new Scanner(System.in);
		    System.out.println("Enter the number to be checked");
		    num=inp.nextInt();
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		
}
