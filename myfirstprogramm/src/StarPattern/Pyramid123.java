package StarPattern;

public class Pyramid123 {
	public static void main(String[]args) {
		int space =3;
		int count =1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				}
			for(int j=1;j<=count;j++) {
				System.out.print("1");
				
				}
			System.out.println();
		
		
		space--;
		count = count+2;
		
			
		}
	}

}
