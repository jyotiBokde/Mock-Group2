package Exception;

public class ExceptionHandle {
	

	public static void main(String[] args) {
		int a=40;
		int b=0;
		int c=0;
		int []d= {10,20,30,40,50};
		System.out.println("START");
		try {  /// risky code
		c=a/b;
		System.out.println(d[6]);
		}
		catch(ArithmeticException e ) {
			b=5;
			c=a/b;
			System.out.println("Alternative Code");
			System.out.println("Catch block excuted");
		}
		
		finally {
			System.out.println("execution of finally block");
		}
		System.out.println(c);
		System.out.println(d[2]);
		System.out.println("end");
			
		}
		
	

}
