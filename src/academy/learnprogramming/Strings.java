package academy.learnprogramming;

public class Strings {

    public static void main(String[] args) {
        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";


        String fullMessage = message + courseName;
        System.out.println(fullMessage);

        String fullMessage2 = String.format("%s%s", message, courseName);
        System.out.println(fullMessage2);

        System.out.printf("Hello, and %sthe %s.%n", message, courseName);

//        for (int i = 0; i < 37; i++) {
//            char character = courseName.charAt(i);
//            System.out.println(character);
//        }
    }
}
