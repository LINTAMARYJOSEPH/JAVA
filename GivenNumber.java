import java.util.Scanner;

public class GivenNumber {

  public static void main(String[] args) {

	  int a,a1,i;
	 System.out.println("enter the number of elements you want in array :");
  	Scanner inp =new Scanner(System.in);
  	a=inp.nextInt();
  	int arr1[]=new int[a];
  	System.out.println("enter the array Elements : ");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=inp.nextInt();
		}
	System.out.println("enter the number to be found: ");
	Scanner inp1 =new Scanner(System.in);
  	a1=inp1.nextInt();
    boolean found = false;
    for (int n : arr1) {
      if (n == a1) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(a1 + " is found.");
    else
      System.out.println(a1 + " is not found.");
  }
}
