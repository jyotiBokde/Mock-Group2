package interface1;

public class bothinterfac implements inter12, inter21 {
	public void M1() {
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		System.out.println(c);
		
		
	}
	public void M2() {
		System.out.println(c);
		System.out.println(d);
		int e= c+d;
		System.out.println(e);
	}
	public static void main (String[]args) {
		bothinterfac j = new bothinterfac();
		System.out.println(j.a);
		j.M1();
		j.M2();
	}


}
