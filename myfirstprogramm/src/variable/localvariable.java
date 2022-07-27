package variable;

public class localvariable {
	public void local1() {       // nonstatic method
		int a = 45;              // local variable
		System.out.println(a);
	}
	public static void local2() {   // static method
		int a = 50;             // local variable
		System.out.println(a);
	}
	public static void main(String[] args) {    // we can not use same local variable within method
		localvariable b = new localvariable();
		b.local1();
		local2();
	}

}
