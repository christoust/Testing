package ustbatchnumber3.junit5testcases;

//import java.security.KeyStore.Entry;
import java.util.Map.Entry;
import java.time.LocalDate;
import java.util.*;


public class Textile {
	public List<String> textile_data(LocalDate date) {
//		System.out.println(date);
		List<String> l1 = Arrays.asList("50", "Tshirt", "50000");
		List<String> l2 = Arrays.asList("100", "Shirt", "150000");
		List<String> l3 = Arrays.asList("150", "Pants", "100000");
		HashMap<LocalDate, List<String>> map = new HashMap<LocalDate, List<String>>();
		map.put(LocalDate.of(2022, 12, 31), l1);
		map.put(LocalDate.of(2022, 10, 10), l2);
		map.put(LocalDate.of(2022, 9, 1), l3);
//		System.out.println(map.get(date));
		for (Entry<LocalDate, List<String>> entry : map.entrySet()) {
			if (entry.getKey().equals(date)) {
//		        System.out.println("The  value for " + date + " is " + entry.getValue());
				return entry.getValue();
			}

		}
		return null;

	}

	
}
