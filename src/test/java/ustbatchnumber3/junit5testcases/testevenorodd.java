package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testevenorodd {
		@Test
		
		public void testeven()
		{
			int n=10;
			boolean result =Iseven(n);
			assertTrue(result);
		}
		@Test
		public void testodd()
		{
			int n=11;
			boolean result =Isodd(n);
			assertTrue(result);
		}
		public boolean Iseven(int n)
		{
			return n%2==0;
		}
		public boolean Isodd(int n)
		{
			return n%2!=0;
		}

	}

