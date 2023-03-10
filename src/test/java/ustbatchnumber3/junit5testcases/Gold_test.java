package ustbatchnumber3.junit5testcases;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Gold_test {

	@Test
	public void isgoldcoin()
	{
		
		
		@SuppressWarnings("unused")
		Gold find= new Gold();
		
		assertEquals("*****",find.goldcount(LocalDate.of(2022,1,13)));
//		LocalDate dateBefore=LocalDate.of(2023, Month.JANUARY, 1);
	
}
	@Test
	public void isgoldcoin1()
	{
		
		
		@SuppressWarnings("unused")
		Gold find= new Gold();
		
		assertEquals("",find.goldcount(LocalDate.of(2023,12,23)));
//		LocalDate dateBefore=LocalDate.of(2023, Month.JANUARY, 1);
	
}
}