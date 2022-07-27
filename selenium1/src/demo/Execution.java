package demo;

public class Execution {
	
	public static void main(String[] args) {
		
		Gamma a = new Gamma();
		
		Betta b = a.memo();   //gamma method call
		Alpha c = b.demo();   //betta method call
		c.test();
	    a.memo().demo().test();
		
	}

}
