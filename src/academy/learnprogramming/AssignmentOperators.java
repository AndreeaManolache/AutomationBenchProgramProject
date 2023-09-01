package academy.learnprogramming;

public class AssignmentOperators {
    public static void main(String[] args) {

        int x = 12;
        x *= 34;
        System.out.println(x);

        int y = 12;
        y = y * 34;
        System.out.println(y);

        int z = y -= 8;
        System.out.printf("y is %s, z is %s %n", y, z);
    }
}
