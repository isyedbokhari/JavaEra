package day14_string;

public class GetDomainName {

	public static void main(String[] args) {
		
		String email = "first.lastname@gmail.com";
		System.out.println(email.length());
		System.out.println(email.indexOf("g"));
		System.out.println(email.lastIndexOf("l"));
		System.out.println(email.substring(15,20));
		
	    
        String email1 = "john.smith@github.com";
//        System.out.println(email.length());
//        System.out.println(email.substring(15,20));
        
        int indexOfAt = email1.indexOf('@') +1;
        int indexOfDot = email1.lastIndexOf('.');
        
        System.out.println(email1.substring(indexOfAt,indexOfDot));
        
	}

}
