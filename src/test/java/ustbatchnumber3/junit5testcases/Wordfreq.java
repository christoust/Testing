package ustbatchnumber3.junit5testcases;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Wordfreq {
{
	public static Map<String,Long>each()  {
			List<String> arr=new ArrayList<String>();
			arr.add("apple");
			arr.add("orange");
			arr.add("grapes");
			arr.add("apple");
			arr.add("grapes");
			Map<String, Long> a=arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			return a;
			
		}
	    public static void main(String args[])
	    {
	    	System.out.println(each());
	    }
	}


