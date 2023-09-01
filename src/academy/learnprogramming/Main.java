package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    //int answer= 7 + 3 + 4;
        //int answer= 7 + 3 * 4;
        int answer= (7 + 3) * 4;
        System.out.println(answer);

        double radius = 12.0;
        double area = Math.PI * radius * radius;


        int x = 3;
        int y = x++;
        System.out.printf("Using x++, x is %s and y is %s.%n", x, y);

        x = 3;
        y = ++x;
        System.out.printf("Using ++x, x is %s and y is %s.%n", x, y);

        System.out.println("Don't do this!");
        x = 3;
        y = ++x - x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);

        x = 3;
        y = x++ - ++x;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);

//        double a = 12 * 3 / 4.0;
//        double b = (12 * 3) / 4.0;
//        double c = 12 * (3 / 4.0);
//        System.out.printf("%s %s %s %n" , a , b, c);

        double a = 12 * 3 / 4;
        double b = (12 * 3) / 4;
        double c = 12 * (3 / 4);
        System.out.printf("%s %s %s %n" , a , b, c);
        System.out.println();

        double d = 12.0 / 3.0 / 4.0;
        double e = (12.0 / 3.0) / 4.0;
        double f = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n" , d , e, f);
        System.out.println();

        int x1 = 12 + 3 - 4;
        int y1 = (12 + 3) - 4;
        int z1 = 12 + (3 - 4);
        System.out.printf("%s %s %s %n" , x1, y1, z1);

    }
}
