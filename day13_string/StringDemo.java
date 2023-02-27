package day13_string;

public class StringDemo {

	public static void main(String[] args) {
		
//      dataType variableNAme = value;
      String str1 = "A";
      String str2 = "B";
      String str3 = str1+str2;
      System.out.println(str3);
      String str4 = "AB";
      System.out.println(str4);
      
      System.out.println(str3 == str4);
      
      
      String str5 = "ab";
      System.out.println(str5);
      
      System.out.println(str5.toUpperCase());
      
      System.out.println(str5); // ab
      
      
      str5 = str5.toUpperCase();
      System.out.println(str5);
      
      
  

	}

}
