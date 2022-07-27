package Practice;

public class fibonacii {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
	//int	count = 8;
	System.out.print(a+" "+b);
	 for(int i=1;i<=8;i++) {
		int c = a+b;
		 System.out.print(" "+c);
		 a=b;
		 b=c;
		 
	 }
		
	}

}
