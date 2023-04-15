package day26_constructors;

public class Dog {
	
	
	    
//	    Update Dog class by creating couple of constructors 
//	    and create 4 dog object
	//    
	    // instance Variables
	    String breed;
	    String name;
	    int age;
	    String size;
	    String color;
	    
	  
	    public Dog (String breed1, String name1, int age1, String size1, String color1) {
	    	breed = breed1;
	    	name = name1;
	    	age = age1;
	    	size = size1;
	    	color = color1;
	    }
	    
	  
	    public void eat() {
	        System.out.println(name + " is eating ");
	    }
	    
	    
	    public void sit() {
	        System.out.println(name + " is sitting ");
	    }
	    
	    public void bark() {
	        System.out.println(name + " is barking ");
	    }
	    
	    public void play() {
	        System.out.println(name + " is playing ");
	    }
	    
	    public void wagTail() {
	        System.out.println(name + " is wagging its tails");
	    }
	    
	    public void introduce() {
	        System.out.println("Hi  wooff wwoof");
	        System.out.println("My name is "+ name+".");
	        System.out.println("I'm am a "+ breed+" I'm "+age +" years old");
	    }
	     public static void main(String[] args) {
	    	Dog dog1 = new Dog("Alaskan Husky", "Aurora", 3, "Medium", "Black and White");
	  	    Dog dog2 = new Dog("German Shepherd", "Nayla", 2, "Large", "Brown");
	  	    Dog dog3 = new Dog("Pitbull", "Max", 2, "Small", "White");
	  	    Dog dog4 = new Dog("Golden Retriever","Daisy", 3, "Medium", "Golden");
	  	    
	  	   dog1.introduce();
	  	   dog2.introduce();
	  	   Dog dogs[] = new Dog[2];
	  	   dogs[1] = dog1;
	  	   dogs[2] = dog2;
	  	   
		}
}
