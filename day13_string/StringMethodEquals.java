package day13_string;

public class StringMethodEquals {

	public static void main(String[] args) {
		
		String str = "Hello";
        String str2 = "hello";
        
        System.out.println(str.equals(str2));
        
        System.out.println(str.equalsIgnoreCase(str2));
        
        
        System.out.println(str2.equals(str));
        
        System.out.println(str2.equalsIgnoreCase(str));
	}

}
