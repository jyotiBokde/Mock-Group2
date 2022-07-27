package Practice;

public class SumOfArray {


	
	public static void main(String[] args) {
		String str= "jyoti is good is jyoti";
		String[] ar=str.split(" ");
		int count;
		for(int i=0;i<=ar.length-1;i++){
		count=1;
		for(int j=i+1;j<=ar.length-1;j++){
		if(ar[i].equals(ar[j])){
		count=count+1;
		ar[j]="0";
		}
		}
		if(ar[i]!="0"){
		System.out.println(ar[i]+" "+count);
		}
		}
	}	

}


