package variable;

public class globalvariable {
	int a= 20;     // global variable
	int b= 4;
	public void substraction() {
		int d = a-b;     // local variable
		System.out.println(d);
	}
	public void division() {
		int e = a/b;
		System.out.println(e);
	}
	public static void main(String[] args) {
		globalvariable j = new globalvariable();
		j.substraction();
		j.division();
	}
}
