package academy.learnprogramming;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        System.out.println("Hello world!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");

        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

//        int secondTopScore = 60;
//        if(topScore > secondTopScore && topScore < 100) {
//            System.out.println("Greater than second top score and less than 100");
//        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true) {
            System.out.println("This is not supported to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "this car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myFirstValue = 20.00;
        double mySecondValue= 80.00;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder= myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNotRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNotRemainder = " + isNotRemainder);
        if(!isNotRemainder) {
            System.out.println("Got some remainder");
        }

        //Java Type Casting

        //Example1
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //Example2
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble;     // Manual casting: double to int

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9
    }
}