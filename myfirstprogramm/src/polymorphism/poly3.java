package polymorphism;

public class poly3 extends poly2 {
	public void JB() {
		System.out.println("automation notes");
	}
	public static void main(String[] args) {
		poly3 j = new poly3();
		j.JB();
		poly2 b = new poly2();
		b.JB();
	}

}
