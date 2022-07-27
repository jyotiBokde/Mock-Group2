package String;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "velocity";
		String s2 = "VELOCITY";
		String s3 = "CITY";
		System.out.println(s1.charAt(5));
		System.out.println(s2.replace("V", "J"));
		System.out.println(s2.isEmpty());
		System.out.println(s2.concat(s1));
		System.out.println(s3.substring(1));
		System.out.println(s1.substring(2, 4));
		System.out.println(s2.endsWith("VE"));
		System.out.println(s1.startsWith("ve"));
		System.out.println(s2.lastIndexOf("C"));
		System.out.println(s2.indexOf("C"));
		System.out.println(s2.contains(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.matches(s2));
		System.out.println(s2.replaceAll(s3, s1));
		
	}

}
