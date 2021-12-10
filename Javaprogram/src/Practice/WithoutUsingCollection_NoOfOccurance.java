package Practice;

public class WithoutUsingCollection_NoOfOccurance {

	public static void main(String[] args) {
		int count=1;
		String s="prakPasha";
		String s1=s.toLowerCase();
		System.out.println(s1);
		
		char[] c=s1.toCharArray();
		int i;
		for (i=0; i<c.length-1; i++)
		{
			if(s1.charAt(i)!=s1.charAt(i+1))
			{
				System.out.println(s1.charAt(i)+" "+count);
				count=1;
				
			}
			else
				count++;
			
		}
		
		System.out.println(s1.charAt(s.length()-1)+" "+count);
		//System.out.println(s1.charAt(i)+""+s1.charAt(s.length()-1));
	}

}
