package Array;

public class SwappingArray {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	
		
		for (int i=0;i<(a.length/2);i++) {
			int z;
			z = a[i];
		a[i] = a[(a.length-1)-i];
			a[(a.length-1)-i] = z;
			
			
		}
		
		
		System.out.println();
		System.out.println(a[1]);
		for (int i = 0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}

}
