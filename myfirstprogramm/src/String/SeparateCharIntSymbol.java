package String;

public class SeparateCharIntSymbol {
	
	public static void main(String[] args) {
		
		String s = "ABab123@cdC$*123";
		
		String alpha = s.replaceAll("[0-9 @ $ *]","");      //no space in double inverted comma
		System.out.println(alpha);
		
		String num = s.replaceAll("[A-Z a-z @ $ *]","");
		System.out.println(num);
		
		
	}

}
