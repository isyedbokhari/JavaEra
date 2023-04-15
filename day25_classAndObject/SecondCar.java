package day25_classAndObject;

public class SecondCar {

	/*
    Create a Java class called "Car" with the following properties:

    make (String)
    model (String)
    year (int)
    speed (double)
    
    Create the following methods for the class:

    accelerate(double): increases the speed of the car by the given amount
    brake(double): decreases the speed of the car by the given amount
    getSpeed(): returns the current speed of the car


*/

// instance variables
String make;
String model ;
int year ;
double speed ;

// Create the following methods for the class:

//    accelerate(double): increases the speed of the car by the given amount

public void accelerate(double amount) {
    speed += amount;
}

//    brake(double): decreases the speed of the car by the given amount

public void brake(double amount) {
    speed -= amount;
}


//    getSpeed(): returns the current speed of the car


public double getSpeed() {
    return speed;
}






























}






