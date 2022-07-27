package constructor;

public class const1 {
	int a;
	int b;
	int c;
	const1(){
		a=12;
		b=13;
	}
	const1(int d){
		a=d;
		
		
	}
	const1(int d,int e,int f){
		a=d;
		b=e;
		c=f;
				
	}
	public  void addition() {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		const1 x = new const1();
		x.addition();
		const1 y = new const1(20);
		y.addition();
		const1 z = new const1(15,01,17);
		z.addition();
	}

}
