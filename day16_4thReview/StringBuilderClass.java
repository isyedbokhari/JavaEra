package day16_4thReview;

public class StringBuilderClass {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("myString");
	    sb.append(" !!");
	    sb.append(120);
	    System.out.println(sb);

	    sb.reverse();
	    System.out.println(sb);

	    sb.delete(2, 4);
	    System.out.println(sb);
	}

}
