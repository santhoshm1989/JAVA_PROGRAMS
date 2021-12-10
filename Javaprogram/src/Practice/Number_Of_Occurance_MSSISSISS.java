package Practice;

public class Number_Of_Occurance_MSSISSISS {

	public static void main(String[] args) {
		
		String s1="jssjbvdvsssssnsdjhvssssva";
		 char[] ch = s1.toCharArray();
		 char ns='s';
		 int count=0;
		 for(char a:ch){
			 
			 if(a==ns){
				 count++;
			 }
		 }
		System.out.println(ns+"="+count);
	}

}
