package day11_nestedForLoop;

public class Task04 {

	public static void main(String[] args) {
		
//      Task3
//      Write a program that generates the following pattern using nested for loops:
//
//             

//             1
//             22
//             333
//             4444
//             55555
//             
      
      for(int i = 1; i <= 5; i++) {
          
          for (int j = i-1  ; j >= 0; j--) {
              System.out.print(i);
          }
          System.out.println();
      }
      
	}

}
