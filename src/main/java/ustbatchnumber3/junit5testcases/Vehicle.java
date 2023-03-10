package ustbatchnumber3.junit5testcases;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vehicle {

	public List<String> vehicleinfo(List<String> s)
	{
		HashMap<String,String>state= new HashMap<String,String>();
		HashMap<String,String>district= new HashMap<String,String>();
//		HashMap<String,HashMap<String><String>> a = 
//		state.put("KL", "Kerala");
//		state.put("TN", "Tamil Nadu");
//		state.put("TS", "Telangana");
		district.put("05", "Kottayam");
		district.put("07", "Ernakulam");
		district.put("06", "Thrissur");
		Stream<String> n = s.stream(). map(t->t.toUpperCase()).
				filter(name -> name.startsWith("KL"));
		List<String> a =  n.collect(Collectors.toList());
		String ab ="";
		List<String> result = new ArrayList<String>();
		result.add("Kerala");
		for(int i =0;i<a.size();i++)
		{
			ab="";
			String[] info = {};
			ab=a.get(i).toString();
			info =ab.split("\\s");
			result.add(district.get(info[1]));
		}
		
//		System.out.println(result);
//		
//		
//		String b =a.toString();
//		System.out.println(b);
//		String[] info =b.split("\\s");
//		String[] res = {"Kerala",district.get(info[1])};
//		for(String z:res)
//		{
//			System.out.println(z);
//		}
		return result;
		
		
		
		
//		System.out.println(n);
//		
////		String[] info =s.split("\\s");
//		String[] res = {state.get(info[0]),district.get(info[1])};
//		return n;


		
		

	}
	public static void main(String[] args) {
		Vehicle ob = new Vehicle();
		List<String> number = Arrays.asList("kl 05 C1234","Kl 06 C1234");
		ob.vehicleinfo(number);
	}
}
