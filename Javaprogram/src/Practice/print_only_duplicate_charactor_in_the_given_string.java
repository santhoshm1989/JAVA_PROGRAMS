package Practice;

import java.util.HashSet;

public class print_only_duplicate_charactor_in_the_given_string {

	public static void main(String[] args) {
		String s="india";
		
		HashSet<Character> set=new HashSet<Character>();
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
			if(count>1)
			System.out.println(ch+"="+count);	
		}
	}		
			

	}

