package polymorphism;

public class poly1 {
	public void substraction(int a, int b) {
		System.out.println("substraction = "+(a-b));
		
	}
	public void substraction(int a, int b, int c) {    // same method name
		System.out.println("substraction = "+(a-b-c));
		
	}
	public static void main (String[]args) {
		poly1 x = new poly1();
		x.substraction(200, 100);
		x.substraction(300, 400, 500);
		
	
		
	} 

}
