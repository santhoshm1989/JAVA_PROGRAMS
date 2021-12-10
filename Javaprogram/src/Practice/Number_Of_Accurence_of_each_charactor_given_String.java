package Practice;

import java.util.HashSet;

public class Number_Of_Accurence_of_each_charactor_given_String {

	public static void main(String[] args) {
	String s="india";
	
	//step 1: create any set collection and add all character of given string into set
	HashSet<Character> set=new HashSet<Character>();
	for(int i=0; i<s.length(); i++){
		
		
			set.add(s.charAt(i));
		//	System.out.print(set);
		}
	
	//step 2 :compare each char of set with all the char of given string
	
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
		System.out.println(ch+"="+count);	
	}
			}
	
		
	}
	

