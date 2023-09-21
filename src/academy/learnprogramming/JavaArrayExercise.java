package academy.learnprogramming;

public class JavaArrayExercise {
    public static void main(String[] args) {
//        int a = 1;
//        int[] ia = new int[10];
//        int b = ia[a];
//        int c = b + a;
//        System.out.println(b = c);

        /* Exercise 1
        Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
         */

        int [] firstLast6= new int[] {1,2,6};   //declararea si initializarea unui array
        if(firstLast6[0] == 6 || firstLast6[firstLast6.length-1]==6)
            System.out.println(true);
        else System.out.println(false);

    }
}
