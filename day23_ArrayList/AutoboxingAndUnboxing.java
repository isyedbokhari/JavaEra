package day23_ArrayList;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		
//      convert primitive to object  int to Integer is autoboxing
//      convert object to primitive unboxing --> Character to char
      
      byte num = 127;
      Byte num2 = num; // autoboxing
      
      System.out.println(num2);
      
      System.out.println(num2);
      byte num3 = num2; // unboxing
      
      
      
      System.out.println(num3);
	}

}
