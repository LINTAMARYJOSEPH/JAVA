import java.util.*;
public class ArrayAvg {
 
    public static void main(String[] args) {
 
    	int a,i,sum=0,length;
    	System.out.println("enter the number of elements you want in array :");
    	Scanner inp =new Scanner(System.in);
    	a=inp.nextInt();
    	int arr1[]=new int[a];
    	System.out.println("enter the array Elements : ");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=inp.nextInt();
		}
	     length = arr1.length;
        for (i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
 
        float average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
 
}