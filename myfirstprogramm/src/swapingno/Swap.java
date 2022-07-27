package swapingno;

public class Swap {
	public static void main (String[]args) {
		int a = 10, b = 20;
		System.out.println("before swapping values are.."+a+" "+b);
		
		//Logic 1 USING THIRD VARIABLE
	/*	int t = a;  t = 10;
	     a = b;
		b = t;      */
	//	System.out.println("after swapping values are.."+a+" "+b);
	
		//Logic 2  USE + AND - WITHOUT USING THIRD VARIABLE
	/*	 a = a+b;
		b = a-b;
		a = a-b;      */
	//	System.out.println("after swapping values are.."+a+" "+b);
		
		//Logic 3   USE * AND / WITHOUT USING THIRD VARIABLE
	/*	a = a*b;
		b = a/b;
		a = a/b;       */
	//	System.out.println("after swapping values are.."+a+" "+b);
		
	//	Logic 4 single statement
		b = a+b-(a=b);   // 10+20-(20)
		System.out.println("after swapping values are.."+a+" "+b);
		
		
	}
}

