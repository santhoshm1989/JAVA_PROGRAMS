package Practice;

import java.util.LinkedHashSet;

public class wrp_to_removeTheDuplicateWordsInGivenStringStmnt {

	public static void main(String[] args) {
	
		String s="Welcome to tyss Welcome";
		String [] str=s.split(" ");
		//step 1: create any set collection and add all string array values into set
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);			
		}
		for(String word:set)
		{
			
			System.out.println(word+" ");
		}

	}

}
