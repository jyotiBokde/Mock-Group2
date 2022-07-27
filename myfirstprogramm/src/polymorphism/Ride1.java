package polymorphism;

public class Ride1 extends Ride {  // super class method is hide
	
	public  void M1() {
		System.out.println("M1 is not running");    // change implementation
	}
	
	
	public static void main(String[] args) {
		Ride1 x = new Ride1();
		x.M1();
	
	}
	

}
