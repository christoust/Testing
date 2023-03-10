package ustbatchnumber3.junit5testcases;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class Testcountwords {
	 @Test
	 public void Counttesting() {
		 List<String> places = Arrays.asList("Kottayam", "Ernakulam", "Thiruvalla");
		 String s = "Kottayam";
		 int expected =1;
		 int actual = Countwords.count(places,s);
		 assertEquals(expected,actual);
		 
	 }
	 @Test
	 public void Counttesting1() {
		 List<String> places = Arrays.asList("Kottayam", "Ernakulam", "Thiruvalla","Kottayam");
		 String s = "Kottayam";
		 int expected =2;
		 int actual = Countwords.count(places,s);
		 assertEquals(expected,actual);
		 
	 }
	 

}
