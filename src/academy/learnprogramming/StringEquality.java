package academy.learnprogramming;

public class StringEquality {
    public static void main(String[] args) {

        String first = "This is a String";
      //  String second = "This is a String";
        String second = "THIS IS A STRING";

        System.out.println(first == second);
        System.out.println(second == first);
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(second.equalsIgnoreCase(first));
    }
}
