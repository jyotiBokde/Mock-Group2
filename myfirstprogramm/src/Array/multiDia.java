package Array;

public class multiDia {
	public static void main(String[] args) {
	//	 int ar [][] = {{10,20,30},{40,50,60}};
		//int a = ar.length-1;
		int ar [] [] = new int [2][2];
		ar [0][0] = 10;
		ar [0][1] = 20;
		ar [1][0] = 30;
		ar [1][1] = 40;
		System.out.println(ar[0][1]);
		
		for (int i=0;i<=1;i++) {
			for (int j=0;j<=1;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
