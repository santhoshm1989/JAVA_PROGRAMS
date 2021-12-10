package Java_Programs;

public class SeparateNumbersAndChracters {

	public static void main(String[] args) {
		String s="sam123sung456";
		String num="";
		String alph="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				num=num+s.charAt(i);		
				
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
			    alph=alph+s.charAt(i);		         
			}	
		}
		
		System.out.println("num"+" = "+num);
		for(int i=num.length()-1; i>=0; i--)
		{
			System.out.print(num.charAt(i));
			
		}
		System.out.println("");
		
		System.out.println("alph"+" = "+alph);
		for(int i=alph.length()-1; i>=0; i--)
		{
			System.out.print(alph.charAt(i));
		}
	}

}
