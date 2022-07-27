package reverse;

public class reverse2 {
	public static void main(String[] args) {
		String a = "12321";
		String rev = "";
		for (int i=a.length()-1;i>=0;i--) {
			rev = rev +a.charAt(i);
				}
		System.out.println(rev);
		if (a.equals(rev)) {
			System.out.println("given string is pallindrom");
		}
		else {
			System.out.println("given string is not pallindrom");
		}
	}

}
