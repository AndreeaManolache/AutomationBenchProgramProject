package academy.learnprogramming;

public class ShortCircuitEvaluation {

    public static void main(String[] args) {
        int a = 12;
//        int b = 6;
        int b = 0;
//        int c = divideTwoNumbers(a,b);
//
//        if (b != 0) {
//            int c = divideTwoNumbers(a, b);
//
//            if (c == 2) {
//                System.out.println("We've found a 2.");
//            }
//        }
//    }
        if (b != 0 && divideTwoNumbers(a, b) == 2) {
            System.out.println("We've found a 2.");
        }

        if (b == 0 || divideTwoNumbers(a, b) == 2) {
            System.out.println("We've found a 2.");
        }

  }

    private static int divideTwoNumbers(int x, int y) {
        return x / y;
    }
}

