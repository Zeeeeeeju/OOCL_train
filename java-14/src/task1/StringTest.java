package task1;

public class StringTest {

	public static void main(String[] args) {
		String str = "asdhkjashfeugtwigt";
		
		// length
		System.out.println(str.length());
		
		// chatAt
		System.out.println(str.charAt(3));
		
		// subString
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,6));
		
		// equals
		System.out.println(str.equals("asdhkjashfeugtwigt"));
		
		// concat
		System.out.println(str.concat("???"));
		
		// indexOf
		System.out.println(str.indexOf("ash"));
		
		// contains
		System.out.println(str.contains("ash"));
		
		// replace
		System.out.println(str.replace("igt", "????"));
		
		// split
		System.out.println(str.split("a"));
		
	}

}
