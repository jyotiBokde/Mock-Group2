package constructor;

public class basic {
	int a;  // variable declaration
	int b;
	 basic() {      // initialized variable inside constructor body only
	a = 100;
	b =20;
	System.out.println("initialized of variable");
	}
	 public void areaofcircle () {      // usage of that information
		 double x= a*a*3.14;
		 System.out.println(x);
		 
	 }
	 public void areaofsquare () {
		 double x = b*b;
		 System.out.println(x);
		 
		  }
	 public static void main(String[] args) {
		 basic j = new basic();
		 j.areaofcircle();
		 j.areaofsquare();
	 }

}

