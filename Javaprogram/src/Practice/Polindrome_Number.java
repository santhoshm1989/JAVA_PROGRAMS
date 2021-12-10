package Practice;

public class Polindrome_Number {

	public static void main(String[] args) {
		
		int r,sum=0,n=322;
		int temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+ "It is a polimdrom number");
		}
		else{
			System.out.println(temp+ "It is not a polimdrom number");
		}
		}
		
	}


