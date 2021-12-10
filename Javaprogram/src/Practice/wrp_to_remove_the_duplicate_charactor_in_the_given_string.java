package Practice;

import java.util.LinkedHashSet;

public class wrp_to_remove_the_duplicate_charactor_in_the_given_string {

	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++){
			set.add(s.charAt(i));
			
		}
		//compare each char of set with all the char of given string
		for(Character character:set)
		{
			System.out.print(character);	
		}
				}
		

	}


