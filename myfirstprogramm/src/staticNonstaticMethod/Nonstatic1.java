package staticNonstaticMethod;

public class Nonstatic1 {
	public void demo1() {
		System.out.println("demo1 is nonstatic method");
	}
	public static void main(String[] args) {
		Nonstatic1 j = new Nonstatic1();
		j.demo1();
		
	}
	

}
