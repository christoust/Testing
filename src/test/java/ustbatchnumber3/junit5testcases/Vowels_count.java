package ustbatchnumber3.junit5testcases;

public class Vowels_count {

	
		public static int vowelscount(String b)
		{
		int count =0;
		for(int i=0;i<b.length();i++)
		{
			char a = b.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				count+=1;
			}
		}
		return count;

	}
		public static void main(String[] args) {
			System.out.println(vowelscount("swetha"));
		}
	}


