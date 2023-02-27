package day15_stringTasks;

public class RemovingLetters {

	public static void main(String[] args) {
		
		/*
        How to remove specific characters in the String? 
        To remove specific characters in the String .For example,
        
        
        If the original string is "Alive is awesome"   
        and the user inputs string to remove "alwsr"  
        then it should print  "ive i eome" as output .
        
        If the original string is "Learning never stops"  
         and the user inputs string to remove "estp"  
         then the it should print   "Larning nvr o" as output .
        
        
       */
		String sentence = "alive is awesome";
		sentence = sentence.replace("a", "");
		sentence = sentence.replace("l", "");
		sentence = sentence.replace("w", "");
		sentence = sentence.replace("s", "");
		sentence = sentence.replace("r", "");
		System.out.println(sentence);
		
		String strToRemove = "estp";
		System.out.println("=====================");
		String str = "Learning never stops";
		for (int i = 0 ; i < strToRemove.length() ; i++) {
            //System.out.println(strToRemove.charAt(i));
            
            str = str.replace(strToRemove.charAt(i), '%' );
        }
        
        System.out.println(str);
        
        str = str.replace("%", "");
        System.out.println(str);
	}

}
