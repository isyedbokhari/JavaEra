package day21_Method;

public class TestMethod {

	
	
	public static void displayFullName(String firstName , String lastName ) {
	      //String firstName = "TechCircle";
	      //String lastName = "School";
	      
	      String fullName = firstName+ " "+lastName;
	      
	      System.out.println(fullName);
	  }
	
	      
	      
	  
	
	public static void main(String[] args) {
		
//	    public static void displayFullName() {
//      String firstName = "TechCircle";
//      String lastName = "School";
//      
//      String fullName = firstName+ " "+lastName;
//      
//      System.out.println(fullName);
//  }
  
		Method.displayHello10Times();
	      
	      displayFullName("Syed", "Bokari") ;
	      
	      displayFullName("TechCircle", "School") ;
	      
	      
  
  
  
  
  
		
		
	}

}
