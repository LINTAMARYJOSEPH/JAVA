import java.text.SimpleDateFormat;  
import java.util.Date;

public class StringToDate {
	
	public static void main(String[] args)throws Exception { 
	    String sDate1="31/12/1998";  
	    String sDate2 = "31-Dec-1998";  
	    String sDate3 = "12 31, 1998";  
	    String sDate4 = "Thu, Dec 31 1998";  
	    
	    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
	    SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
	    SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
	    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
	      
	    Date date1=formatter1.parse(sDate1);  
	    Date date2=formatter2.parse(sDate2);  
	    Date date3=formatter3.parse(sDate3);  
	    Date date4=formatter4.parse(sDate4);  
	    
	    System.out.println(sDate1+"="+"\t"+date1);  
	    System.out.println(sDate2+"="+"\t"+date2);  
	    System.out.println(sDate3+"="+"\t"+date3);  
	    System.out.println(sDate4+"="+"\t"+date4);  
	      
	}  
}  
