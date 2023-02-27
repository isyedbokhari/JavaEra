package day04_1stReview;

public class StringConcat {

	public static void main(String[] args) {
		String cat = "Spark" + " is not a normal cat.";
	    String cat2 = new String("Spark"); // this is the old syntax
	    System.out.println(cat + 
	        " is sick." + 
	        " so, I " + 
	        " take him to the vet." + cat2);

	}

}
