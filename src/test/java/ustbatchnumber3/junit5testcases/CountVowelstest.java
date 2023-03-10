package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountVowelstest {

	 

	 @Test

	 public void counttesting() {

	 

	 String input ="sharath";

	 

	 int expected=2;

	 int actual=Vowels_count.vowelscount(input);

	 assertEquals(expected,actual);
	 }
	 @Test
	 public void counttesting1() {

		 

		 String input ="sharath";

		 

		 int expected=2;

		 int actual=Vowels_count.vowelscount(input);

		 assertEquals(expected,actual);
	 

	 }
}