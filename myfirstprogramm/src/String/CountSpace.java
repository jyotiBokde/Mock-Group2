package String;

public class CountSpace {
	public static void main(String[] args) {
		
	
	String a = " velocity  is the best  training  centre  jyoti bokde  ";
		//String a = "jyoti  bokde";   just for practise
		
	int count = 0;
	for (int i= 0;i<=a.length()-1;i++) {
		char b= a.charAt(i);
		if (b==' ') {
			count++;
		}
		}
		System.out.println(count);
		
	}

}
