package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testvehicle {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		Vehicle ob = new Vehicle();
		List<String> number = Arrays.asList("kl 05 C1234","KL 06 C1234");
		List<String> re =Arrays.asList("Kerala","Kottayam","Thrissur");
		assertEquals(re,ob.vehicleinfo(number) );
		
	}
	

}
