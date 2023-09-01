package academy.learnprogramming;

public class StringValueAndReferenceTypes {
    public static void main(String[] args) {

//---------String are immutable

//        int x = 5;
//        int y = x;
//        System.out.printf("x = %d, y = %d %n", x, y);
//        System.out.printf("x is the same as y: %s %n", x == y);
//
//        String first = "This is a String";
//        String second = first;
//
//        System.out.printf("first: %s %n", first);
//        System.out.printf("second: %s %n", second);
//        System.out.printf("first is the same as second: %s %n", first == second);
//---------------------

       //------The stringBuilder class
        StringBuilder first = new StringBuilder("This is a String");
        StringBuilder second = new StringBuilder("This is a String");

        System.out.printf("first: %s %n", first);
        System.out.printf("second: %s %n", second);
        System.out.printf("first is the same as second: %s %n", first == second);

        System.out.println();

        first = first.replace(4, 5, "_");
//        first = first.replace("_"," ");
        System.out.printf("first: %s %n", first);
        System.out.printf("second: %s %n", second);
        System.out.printf("first is the same as second: %s %n", first == second);
        System.out.printf("first.equals(second): %s %n", first.equals(second));
    }
}
