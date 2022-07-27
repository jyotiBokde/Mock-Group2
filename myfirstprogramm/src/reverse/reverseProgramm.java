package reverse;

import java.util.Scanner;

public class reverseProgramm {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String a =S.next();
		
		
		
		//String a = "jyoti";
		String b = ""; //itoyj
		for (int x=a.length()-1;x>=0;x--) {
			b = b+a.charAt(x);
			
			}
		System.out.println(b);
		
			}

}
