package interfaceStatic;

public class static2 implements static1{
	public void demo2() {
		System.out.println("prasad mandhare");
	}
	public void demo3() {
		System.out.println("kalyani khotre");
	}
	public static void main(String[] args) {
		static2 j = new static2();
		j.demo2();
		j.demo3();
		static1.Demo1();
		
		
	}
	
}
