package Practice;

public class Prime_number {

	public static void main(String[] args) {
		int n=13;
		for(int i=2; i<=n; i++)
		{
			if(n/i==0)
			{
				break;
				
			}
			if(i==n)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not a prime number");
			}
		}
	}

}
