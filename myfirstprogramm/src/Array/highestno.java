package Array;

import java.util.Arrays;

public class highestno {           //3rd highest no print
	 
	public static void main(String[] args) {
		 int ar[] = {55,45,36,79,49};
		
		 Arrays.sort(ar);
		
		 System.out.println(" sorted array ::"+Arrays.toString(ar));
		 
		 int max = ar[0];     //3rd highest no
		 
		 System.out.println("3rd highest no."+max);
		 
		 
		 
	}

}
