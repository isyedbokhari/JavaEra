package day14_string;

public class Task01 {

	public static void main(String[] args) {
		
		String a = "abc";
		System.out.print(a.charAt(2));
		System.out.print(a.charAt(1));
		System.out.println(a.charAt(0));
		System.out.println("==========================");
//      012
String input = "abc";

String output = "";

output += input.charAt(2);
output += input.charAt(1);
output += input.charAt(0);
System.out.println(output);

output = "";

for (int i = input.length() -1 ; i >= 0 ; i--) {
output+= input.charAt(i);
}


System.out.println(output);
	}

}
