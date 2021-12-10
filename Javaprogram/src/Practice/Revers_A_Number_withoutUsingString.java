package Practice;

public class Revers_A_Number_withoutUsingString {

	public static void main(String[] args) {
		int a=345;
		int rev=0;
		
		while(a>0){
			int r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		System.out.println(rev);
	}

}
