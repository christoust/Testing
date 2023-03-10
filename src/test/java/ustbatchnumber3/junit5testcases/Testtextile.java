package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testtextile {

	@Test
	public void textiletest()
	{
		Textile ob = new Textile();
		List<String> l1 = Arrays.asList("100","Shirt","150000");
		assertEquals(l1,ob.textile_data(LocalDate.of(2022, 10, 10)));
	}
	@Test
	public void textiletest1()
	{
		Textile ob = new Textile();
		List<String> l1 = Arrays.asList("50", "Tshirt", "50000");
		assertEquals(l1,ob.textile_data(LocalDate.of(2022, 12, 31)));
	}
}
