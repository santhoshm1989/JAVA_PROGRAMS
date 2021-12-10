package Practice;

public class OddNumber {

	public static void main(String[] args) {
		int[] a={2,5,6,9};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0){
				System.out.println("even="+a[i]);
			}
			else
				System.out.println("odd="+a[i]);
		}
	}

}
