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

       public static void main(String[] args) {


        int speed = 60;
        boolean isBirthday = false;
        if (!(isBirthday)) {
            if (speed <= 60)
                System.out.println(0);
            if (speed > 60 && speed <= 80)
                System.out.println(1);
            else
                System.out.println(2);
        } else if (speed <= 65)
            System.out.println(0);
        else if (speed > 65 && speed <= 85)
            System.out.println(0);
        else
            System.out.println(2);
    }

    /*Exercise 3

    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.
    Note: the function Math.abs(num) computes the absolute value of a number.
        love6(6, 4) → true
        love6(4, 5) → false
        love6(1, 5) → true
     */
//    public static void main(String[] args) {
//        int a = 6;
//        int b = 4;
//        if (a == 6 || b == 6)
//            System.out.println(true);
//        int sum = a + b;
//        int diff = Math.abs(a - b);
//        if (sum == 6 || diff == 6)
//            System.out.println(true);
//        else
//            System.out.println(false);
//    }

    /* Exercise 4
     Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
        more20(20) → false
        more20(21) → true
        more20(22) → true
     */
//    public static void main(String[] args) {
//        int more=20;
//        if((more % 20) == 1 || (more % 20) == 2)
//            System.out.println(true);
//        else
//            System.out.println(false);
//    }

    /* Exercise 5
    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true
     */

//    public static void main(String[] args) {
//        int nearTen=12;
//        if(nearTen % 10 < 3 || nearTen % 10 >=8)
//            System.out.println(true);
//        else
//            System.out.println(false);
//    }

   /* Exercise 6
    We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
    A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one,
     the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

    teaParty(6, 8) → 1
    teaParty(3, 8) → 0
    teaParty(20, 6) → 2
    */

//    public static void main(String[] args) {
//        int tea=6;
//        int candy=8;
//        if (tea < 5 || candy < 5)
//            System.out.println(0);
//        if ((tea >= 2 * candy) || (candy >= 2 * tea))
//            System.out.println(2);
//         else
//            System.out.println(1);
//    }

    /*Exercise 7
//    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
//    twoAsOne(1, 2, 3) → true
//    twoAsOne(3, 1, 2) → true
//    twoAsOne(3, 2, 2) → false
     */

//        public static void main(String[] args) {
//            int a=1;
//            int b=2;
//            int c=3;
//            if ( a + b == c || c + b == a || c + a == b)
//                System.out.println(true);
//            else
//                System.out.println(false);
//        }

    /* Exercise 8
    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
     Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true
     */
//    public static void main(String[] args) {
//        int a = 23;
//        int b = 19;
//        int c = 13;
//        int modA = a % 10;
//        int modB = b % 10;
//        int modC = c % 10;
//        if (modA == modB || modA == modC || modB == modC)
//            System.out.println(true);
//        else
//            System.out.println(false);
//    }

    /* Exercise 9
    Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However,
     in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
    maxMod5(2, 3) → 3
    maxMod5(6, 2) → 6
    maxMod5(3, 2) → 3
 */
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        if (a == b)
//            System.out.println(0);
//        if (a % 5 == b % 5)
//            System.out.println(Math.min(a, b));
//        System.out.println(Math.max(a, b));
//
//    }

    /* Exercise 10
        You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac.
         Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is
         exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

        blueTicket(9, 1, 0) → 10
        blueTicket(9, 2, 0) → 0
        blueTicket(6, 1, 4) → 10
     */

//    public static void main(String[] args) {
//        int a = 9;
//        int b = 1;
//        int c = 0;
//        int ab = a + b;
//        int bc = b + c;
//        int ac = a + c;
//        if (ab == 10 || bc == 10 || ac == 10)
//            System.out.println(10);
//        if (ab - bc == 10 || ab - ac == 10)
//            System.out.println(5);
//        else
//            System.out.println(0);
//    }

    /* Exercise 11
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10,
     and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
      If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less,
       then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
     */

//    public static void main(String[] args) {
//        int you=5;
//        int date=10;
//        if ((you >= 8 && date > 2) || (date >= 8 && you > 2))
//            System.out.println(2);
//        if (you <= 2 || date <= 2)
//            System.out.println(0);
//        else
//            System.out.println(1);
//    }

    /* Exercise 12
        Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
        sortaSum(3, 4) → 7
        sortaSum(9, 4) → 20
        sortaSum(10, 11) → 21
     */
//    public static void main(String[] args) {
//        int a=9;
//        int b=4;
//        int sum=a+b;
//        if(sum >=10 && sum<=19)
//            System.out.println(20);
//        else
//            System.out.println(sum);
//    }

    /*Exercise 13
     Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if
      the number is less or equal to 1, or greater or equal to 10.
        in1To10(5, false) → true
        in1To10(11, false) → false
        in1To10(11, true) → true
     */
//    public static void main(String[] args) {
//        int n = 11;
//        boolean outsideMode = false;
//        if (!outsideMode)
//            if (n >= 1 && n <= 10) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        else {
//            if (n <= 1 || n >= 10) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }
//    }

    /*Exercise 14
    Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
        old35(3) → true
        old35(10) → true
        old35(15) → false
     */
//        public static void main(String[] args) {
//            int n=3;
//            if(n%3==0 || n%5==0)
//                System.out.println(true);
//            else
//                System.out.println(false);
//        }
}