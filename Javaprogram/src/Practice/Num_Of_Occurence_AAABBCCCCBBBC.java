package Practice;

public class Num_Of_Occurence_AAABBCCCCBBBC {

	public static void main(String[] args) {
		
		int count = 1;
		String s = "AAABBCCCCAABBBC";
		//String s = "ApPlEL"
		//char[] c = s.toCharArray();
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
			{
				System.out.println(count+""+s.charAt(i));
				count=1;
			}
			else
				
				count++;
					
		}
		System.out.println(count+""+s.charAt(s.length()-1));

	}

}
