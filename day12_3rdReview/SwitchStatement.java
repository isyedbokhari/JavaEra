package day12_3rdReview;

public class SwitchStatement {

	public static void main(String[] args) {
		
		// switch statement
	    // if else (condition) {
	    //    some code
	    // }

	    String role = "";

	    switch (role) {
	      case "guest":
	        System.out.println("You are guest");
	        break;
	      case "vendor":
	        System.out.println("You are vendor");
	        break;
	      case "admin":
	        System.out.println("You are admin");
	        break;
	      default:
	        System.out.println("Invalid role");
	    }
	}

}
