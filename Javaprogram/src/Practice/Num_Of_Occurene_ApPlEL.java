package Practice;

public class Num_Of_Occurene_ApPlEL {

	public static void main(String[] args) {
		
		String s="ApPlEL";
		char[] ch=s.toLowerCase().toCharArray();
		String temp="";
		
		for(int i=0; i<ch.length; i++){
			int count=1;
			for(int j=i+1; j<ch.length; j++){
				
				if(ch[i]==ch[j]){
					ch[j]=' ';
					count++;
				}
				
			}
			if(ch[i]!=' ')
			{
				temp=ch[i]+temp;
				System.out.println(ch[i]+" "+count);
			}
		}
		
        System.out.println(temp);
	}

}
