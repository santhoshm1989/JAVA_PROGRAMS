package Practice;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharactor {

	public static void main(String[] args) {
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++){
			set.add(s.charAt(i));
			
		}
		//compare each char of set with all the char of given string
		for(Character ch:set)
		{
     System.out.print(ch);
	}
	}
}
