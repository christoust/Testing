package ustbatchnumber3.junit5testcases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.*;
//import java.util.List;


public class Countwords {
//	public static <String> Map<String, Long>  frequencyMap(Stream<String> elements) {
//        return elements.collect(
//            Collectors.groupingBy(
//            Function.identity(),
//            HashMap::new, // can be skipped
//            Collectors.counting()
//            )
//        );
	public static Map<String,Long> count(List<String> a)
	{
		
		Map<String, Long> frequencyMap = a.stream()
				  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return frequencyMap;
		
	}
//	public static void main(String[] args) {
//		
		  List<String> places = Arrays.asList("Kottayam", "Ernakulam", "Thiruvalla");
//		  Map<String, Long> frequencyMap = places.stream()
//				  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		
		  HashMap<String,long> map=count(places);
//		  
//	}
}

