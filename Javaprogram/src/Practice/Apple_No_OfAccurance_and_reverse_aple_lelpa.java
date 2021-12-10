package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Apple_No_OfAccurance_and_reverse_aple_lelpa {

	public static void main(String[] args) {
		
		String s="ApPlEL";
		String s1=s.toLowerCase();
		System.out.println(s1);
		//String s2="";
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for (int i=0; i<s1.length(); i++)
		{
			hs.add(s1.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		for (Character ch:hs)
		{
			sb.append(ch);
			int count=0;
			//s2=""+ch;
			for (int i=0; i<s1.length(); i++)
			{
				if (ch==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" "+count);	
		}
		String s2=sb.toString();
		//System.out.println(s2);
		for (int i=s2.length()-1; i>=0; i--)
		{
			System.out.print(s2.charAt(i));
		}

	}

}
