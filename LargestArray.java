import java.util.Scanner;
public class LargestArray {
	    public static void main(String[] args) {
	 
	    	int a,i,temp;
	    	System.out.println("enter the number of elements you want in array :");
	    	Scanner inp =new Scanner(System.in);
	    	a=inp.nextInt();
	    	int arr1[]=new int[a];
	    	System.out.println("enter the array Elements : ");
			for(i=0;i<arr1.length;i++)
			{
				arr1[i]=inp.nextInt();
			}
			temp = arr1[0];
			for(i=1;i<arr1.length;i++)
			{
				
				if(arr1[i]>temp)
				{
					temp = arr1[i];
				}
			}
		System.out.println("Largest element is"+temp);
	    }
}
