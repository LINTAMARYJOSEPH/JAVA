import java.util.Scanner;
public class InvLeftTring {
		public static void main(String[] args) {
			int num;
			System.out.println("Enter the limt");
			Scanner inp=new Scanner(System.in);
			num=inp.nextInt();
			for(int i=num; i>0 ;i--){
				for(int j=0; j < i; j++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}


