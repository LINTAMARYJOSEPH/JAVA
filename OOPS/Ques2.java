package OOPS;
class Student1
{
	String name1="sam",name2="Jhon";
	int roll_no1,roll_no2;
	String Address1,Address2;
	int phone1,phone2;
}



public class Ques2 {
	public static void main(String[] args)
	{
		Student1 obj1=new Student1();
		Student1 obj2=new Student1();
		obj1.Address1="56 A, MUMBAI";
		obj1.roll_no1=2;
		obj1.phone1=123657;
		obj2.Address2="66 A, KOREA";
		obj2.roll_no2=4;
		obj2.phone2=7654321;
		System.out.println("Details of "+obj1.name1+" is "+"Address is "+obj1.Address1+","+"Roll no is "+obj1.roll_no1+","+"Phone number is "+obj1.phone1);
		System.out.println("Details of "+obj2.name2+" is "+"Address is "+obj2.Address2+","+"Roll no is "+obj2.roll_no2+","+"Phone number is "+obj2.phone2);
	}

}
