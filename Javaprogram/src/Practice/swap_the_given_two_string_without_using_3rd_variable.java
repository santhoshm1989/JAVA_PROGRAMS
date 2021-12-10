package Practice;

public class swap_the_given_two_string_without_using_3rd_variable {

	public static void main(String[] args) {
		String s1="JAVA"; //java
		String s2="TYSS"; //tyss
		s1=s1+s2;// JAVATYSS=JAVA+TYSS(01234567)
		s2=s1.substring(0,s1.length()-s2.length());
		                   //JAVATYSS-TYSS=JAVA(8-4=4)
		System.out.println("s2="+s2); //java
		s1=s1.substring(s2.length());
		System.out.println("s1="+s1); //tyss
		

	}

}
