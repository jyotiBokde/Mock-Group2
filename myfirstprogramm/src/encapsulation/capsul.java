package encapsulation;

public class capsul {
	private int a = 55;
	static private int b=87;
	
	
	
	public static void demo1 (int d) {
		b=d;    //static variable for static method
		System.out.println(b);
		
}
	
	public int demo2 () {
		
		return a;
		
		
	}
	

}
