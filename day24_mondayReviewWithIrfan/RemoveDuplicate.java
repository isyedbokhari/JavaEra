package day24_mondayReviewWithIrfan;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
	}
	//removes the duplicates from the given string, returns a new string

	public static String removeDuplicates(String str) {
	    String str2 = "";

	    for (int i = 0; i < str.length(); i++) {

	        char currentChar = str.charAt(i);

	        if (!str2.contains(Character.toString(currentChar))) {
	            str2 += currentChar;
	        }

	    }

	    return str2;

	}

	public static String removeDuplicates2(String str4) {
	    // String str4 = "AAABBBBCCC";
	    String str5 = "";

	    while (str4.length() > 0) {
	        str5 += str4.substring(0, 1);
	        str4 = str4.replace(str4.substring(0, 1), "");
	    }

	    return str5;

	}

	public static String removeDuplicates3(String str4) {
        // String str4 = "AAABBBBCCC";
        String str5 = "";

        while (str4.length() > 0) {
            str5 += str4.charAt(0);
            str4 = str4.replace(Character.toString(str4.charAt(0)), "");
        }

        return str5;

    }
}








