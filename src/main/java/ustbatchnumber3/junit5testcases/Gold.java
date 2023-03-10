package ustbatchnumber3.junit5testcases;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Gold {
	public String goldcount(LocalDate date) {
		
	
	LocalDate dateBefore=LocalDate.of(2023, Month.JANUARY, 1);
	LocalDate dateAfter=date;
	long result = ChronoUnit.DAYS.between(dateBefore, date);
//	System.out.println(result);
	
//	String s =null;
	if (result<81)
	{
		 return"*****";
		 
	}
	else if(result>81&&result<172)
	{
		return "***";
				
	}
	else if(result>172&&result<266)
	{
		return "*";
				
	}
	else if(result>266 && result<365)
	{
		return "";
	}
	return "0";
	
	

}
}
