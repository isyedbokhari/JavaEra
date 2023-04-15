package day34_Collections;

import java.util.HashSet;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		
		 //    Write a program to print frequency of each character from a string
//      input: apple
//      output:
//          a 1
//          p 2
//          l 1 
//          e 1
      
      
      String input = "apple";
//      char targetChar = 'p';
//      int count = 0;
//      
//      for (int i = 0 ; i < input.length() ; i++) {
//          System.out.println(input.charAt(i));
//          
//          if (input.charAt(i) == targetChar) {
//              count++;
//          }
//          
//      }
//      
//      System.out.println(targetChar +" occured "+ count +" times");
      
      Set<Character> set = new HashSet<>();
      for (int i = 0 ; i < input.length() ; i++) {
          set.add(input.charAt(i));
      }
      
      System.out.println(set);
      System.out.println("--------------------------------");
      for (Character c : set) {
          System.out.println(c +" "+charCount(input, c));
      }
      
      
  }
  
  public static int charCount (String input , char targetChar) {
      int count = 0;
      
      for (int i = 0 ; i < input.length() ; i++) {
          //System.out.println(input.charAt(i));
          
          if (input.charAt(i) == targetChar) {
              count++;
          }
          
      }
      
      //System.out.println(targetChar +" occured "+ count +" times");
      return count;
  }

}
