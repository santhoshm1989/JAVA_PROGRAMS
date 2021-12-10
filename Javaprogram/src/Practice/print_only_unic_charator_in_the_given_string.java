package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class print_only_unic_charator_in_the_given_string {

	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++){
			set.add(s.charAt(i));
			
		}
		//compare each char of set with all the char of given string
		for(Character ch:set)
		{
			int count=0;
		//	compare with each char & increse the count
			for (int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
		//step 3: print both char of set and count
				count++;	
					}
				}
			if(count==1)
			System.out.print(ch);	
		}
	}
}


