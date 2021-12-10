package Practice;

public class ReversTheGivenStringWord {

	public static void main(String[] args) {
		
		String s="Welcome to Banglore";
		String[] str=s.split(" ");
		
		for(String word:str)
		{
			
			String sa=word+" ";
			for(int i=sa.length()-1; i>=0; i--)
			{
				//char ltr=sa.charAt(i);
				
				System.out.print(sa.charAt(i));	
			}
			
		}

	}

}
