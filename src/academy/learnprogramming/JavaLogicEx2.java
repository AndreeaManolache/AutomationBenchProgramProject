package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class JavaLogicEx2 {

      /*Exercise 2
    You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
     your speed can be 5 higher in all cases.
    caughtSpeeding(60, false) → 0
    caughtSpeeding(65, false) → 1
    caughtSpeeding(65, true) → 0
     */

 //   public static void main(String[] args) {

//
//        int speed = 60;
//        boolean isBirthday = false;
//        if (!(isBirthday)) {
//            if (speed <= 60)
//                System.out.println(0);
//            if (speed > 60 && speed <= 80)
//                System.out.println(1);
//            else
//                System.out.println(2);
//        } else if (speed <= 65)
//            System.out.println(0);
//        else if (speed > 65 && speed <= 85)
//            System.out.println(0);
//        else
//            System.out.println(2);
//    }

    /*exercise 3

    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.
    Note: the function Math.abs(num) computes the absolute value of a number.
        love6(6, 4) → true
        love6(4, 5) → false
        love6(1, 5) → true
     */
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        if (a == 6 || b == 6)
            System.out.println(true);
        int sum = a + b;
        int diff = Math.abs(a - b);
        if (sum == 6 || diff == 6)
            System.out.println(true);
        else
            System.out.println(false);
    }
}