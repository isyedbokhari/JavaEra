package day11_nestedForLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		
int timer = 15;
        
        System.out.println(timer +" minutes timer starts now!");
        
        System.out.println(timer +":00");
    
        for (int minute = timer - 1  ; minute >= 0 ; minute--) {
            //System.out.println(minute);
            for (int second = 59 ; second >= 0 ; second--) {
                System.out.println(minute+":"+second);
                
                Thread.sleep(1);
                
            }
        }
        
        System.err.println("Time is up!!");
	}

	
	
	//        for (int hour = 2 ; hour >= 0 ; hour--) {
//      for (int minute = 59 ; minute >= 0 ; minute--) {
//          //System.out.println(minute);
//          for (int second = 59 ; second >= 0 ; second--) {
//              System.out.println(hour +":"+minute+":"+second);
//              
//              Thread.sleep(1);
//              
//          }
//      }
//  }
  
  
//  for (int day = 0 ; day >= 0 ; day--) {
//      for (int hour = 23 ; hour >= 0 ; hour--) {
//          for (int minute = 59 ; minute >= 0 ; minute--) {
//              //System.out.println(minute);
//              for (int second = 59 ; second >= 0 ; second--) {
//                  System.out.println(day+":"+hour +":"+minute+":"+second);
//                  
//                  //Thread.sleep(1000);
//                  
//              }
//          }
//      }
//  }
}
