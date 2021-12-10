package Practice;

public class SeparateAlphabetsNumberSpecialCharecter {

	public static void main(String[] args) {
		String s="a567$B%6d";
		String alph="";
		String num="";
		String sp="";
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				alph=alph+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			
				
		   else
		     {
			sp=sp+s.charAt(i);
		     }
			
	}
		System.out.println("alph"+" = "+alph);
		System.out.println("num"+" = "+num);
		System.out.println("sp"+" = "+sp);	

}
}