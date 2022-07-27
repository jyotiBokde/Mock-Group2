package staticNonstaticMethod;

public class BothstaticNonstatic {
	public static void demo1() {
		System.out.println("demo1 is static method");
	}
	public void demo2() {
		System.out.println("demo2 is nonstatic method");
	}
	public static void main(String[] args) {
		demo1();
		BothstaticNonstatic j = new BothstaticNonstatic();
		j.demo2();
		
		
	}

}
