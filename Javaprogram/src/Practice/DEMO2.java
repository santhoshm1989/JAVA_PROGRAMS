package Practice;

public class DEMO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="praKash";
		char[] str = s.toLowerCase().toCharArray();
		for (int i = 0; i < str.length-1; i++) {
			
			int count=1;
			for (int j = i+1; j < str.length; j++) {
			
				if(str[i]!='0' && str[i]==str[j])
				{
					str[j]='0';
					count++;
				}
			}
			
			System.out.println(str[i]+" "+count);
			
		}
		
		

	}

}
