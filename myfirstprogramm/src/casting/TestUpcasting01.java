package casting;

public class TestUpcasting01 {
	public static void main(String[]args) {
		 System.out.println("*****super class object*****");
		
		upcasting x = new upcasting();
		x.demo();
		x.set();
		x.staticTest();
		
		System.out.println("*****sub class object*****");
		
		upcsting1 y = new upcsting1();
		y.demo();
		y.set();
		y.sub();
		y.staticTest();   //non override
		
		System.out.println("*****up casting*****");
		
		upcasting z = new upcsting1();
		z.demo();
		z.set();
		z.staticTest();
		
	}

}
