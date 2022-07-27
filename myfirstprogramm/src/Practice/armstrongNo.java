package Practice;

import java.util.Scanner;

public class armstrongNo {
	public static void main(String[] args) {
	  Scanner S = new Scanner(System.in);
	  
		//int a = 153;     //1*1*1+5*5*5+3*3*3 = 1+125+27 = 153
		int a = S.nextInt();
	  int c = a;
		int sum = 0;
		while (a>0) {
			int b = a%10;
			sum = sum+(b*b*b);   ///3*3*3+5*5*5
			 a = a/10;
			 
			
		}
		
		
		if (c == sum) {
			System.out.println("no is armstrong");
		}
		
	else {
			System.out.println("no. is not armstorng");
		}
	}

}
