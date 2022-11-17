import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {

    public static void main(String[] args) {
       
        int a,b,sum=0;
    	System.out.println("enter the number of elements you want in 1 st array :");
    	Scanner inp =new Scanner(System.in);
    	a=inp.nextInt();
    	int arr1[]=new int[a];
    	System.out.println("enter the array Elements : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=inp.nextInt();
		}
		System.out.println("enter the number of elements you want in 2 nd array :");
    	
    	b=inp.nextInt();
    	int arr2[]=new int[a];
    	System.out.println("enter the array Elements : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=inp.nextInt();
		}


        int length = arr1.length + arr2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int i=0;i<arr1.length;i++) {
            result[pos] = arr1[i];
            pos++;
        }

        for (int i=0;i<arr2.length;i++) {
            result[pos] = arr2[i];
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}
 