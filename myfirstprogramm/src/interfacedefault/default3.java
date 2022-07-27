package interfacedefault;

public class default3 implements default1{
	public void demo1() {
		System.out.println("abhishek Patil");
	}
	public static void main(String[] args) {
		default3 p = new default3();
		p.demo1();
		p.demo2();
		default2 s = new default2();
		s.demo1();
		s.demo2();
	}

}
