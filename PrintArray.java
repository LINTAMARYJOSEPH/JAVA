import java.util.Scanner;
public class PrintArray {

	    public static void main(String[] args) {
	 
	    	int a,i;
	    	System.out.println("enter the number of elements you want in array :");
	    	Scanner inp =new Scanner(System.in);
	    	a=inp.nextInt();
	    	int arr1[]=new int[a];
	    	System.out.println("enter the array Elements : ");
			for(i=0;i<arr1.length;i++)
			{
				arr1[i]=inp.nextInt();
			}
			System.out.println("The array Elements : ");
			System.out.print("{");
			for(i=0;i<arr1.length;i++)
			{
				System.out.print(arr1[i]+" ");
			}
			System.out.print("}");
}
}
