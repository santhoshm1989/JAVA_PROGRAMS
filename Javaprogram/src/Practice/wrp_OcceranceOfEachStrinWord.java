package Practice;

import java.util.HashSet;

public class wrp_OcceranceOfEachStrinWord {

	public static void main(String[] args) {
		String s="Welcome to tyss Welcome";
		String [] str=s.split(" ");
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}
		
	//step 1: create any set collection and add all string array values into set
		HashSet<String> set=new HashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);			
		}
	//step 2: compare each value of set with all the value of string array	
		for(String word:set)
		{
			int count=0;
			
			for(int i=0; i<str.length; i++)
			{
				if(word.equals(str[i])){
				
				count++;
				}
			}
 //step 3: print both word and count			
			System.out.println(word+"="+count);
		}
		
	}

}
