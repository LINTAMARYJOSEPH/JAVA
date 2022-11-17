package OOPS;

class student
{
	String name;
	int roll_no;
}


public class Ques1 {
	public static void main(String[] args)
	{
		student obj=new student();
		obj.name="Jhon";
		obj.roll_no=2;
		System.out.println("Name is "+obj.name+" and roll_no is "+ obj.roll_no);
	}

}
