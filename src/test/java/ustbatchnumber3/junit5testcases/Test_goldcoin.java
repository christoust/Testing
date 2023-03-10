package ustbatchnumber3.junit5testcases;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
//import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.junit.Test;

public class Test_goldcoin {
	@Test
	public void isgoldcoin()
	{
		
		
		@SuppressWarnings("unused")
		Getgoldcoins find= new Getgoldcoins();
		
		assertEquals(" ",find.findgold(LocalDate.of(2022,12,31)));
		LocalDate dateBefore=LocalDate.of(2023, Month.JANUARY, 1);
		LocalDate dateAfter=LocalDate.of(2023, Month.MARCH, 22);;
		long result = ChronoUnit.DAYS.between(from, to);
		int days = age.getDays();
		String s =null;
		if (days>81)
		{
			 s ="*****";
		}
//		
		String expected = "*****";
		assertEquals(s, expected);
//		
		
	}

}
