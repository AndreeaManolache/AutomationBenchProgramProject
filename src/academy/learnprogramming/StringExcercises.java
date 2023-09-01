package academy.learnprogramming;

//Exercise 1
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//        helloName("Bob") → "Hello Bob!"
//        helloName("Alice") → "Hello Alice!"
//        helloName("X") → "Hello X!"


import javax.swing.*;

public class StringExcercises {

    public static void main(String[] args) {
        String name = "Bob";
        System.out.println("Hello " + name + "!");


        //Exercise 2
        //  Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is
        //  the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String
        //  starting at index i and going up to but not including index j.

        String out = "<<>>";
        String word = "cuvant";
        System.out.println(out.substring(0, 2) + word + out.substring(2, 4));

        //Exercise 3
        //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

        String word2 = "WooHoo";
        int half = word2.length() / 2;
        System.out.println(word2.substring(0, half));


        //Exercise 4
        /*
        Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


        nonStart("Hello", "There") → "ellohere"
        nonStart("java", "code") → "avaode"
        nonStart("shotl", "java") → "hotlava" */

        String hello = "Hello";
        String there = "There";
        System.out.println(hello.substring(1, hello.length()) + there.substring(1, there.length()));

        //Exercise 5
        //Given a string, return a string length 1 from its front, unless front is false, in which
        // case return a string length 1 from its back. The string will be non-empty.

        String str = "Hello";
        boolean front = true;
        if (front) {
            System.out.println(str.substring(0, 1));
        } else
            System.out.println(str.substring(str.length() - 1));

        //Exercise 6
        //Given a string, return true if it ends in "ly".

          // String endsL
        int lengthOfWord = str.length();
        String endOfWord = "ly";
        if (lengthOfWord < 2) {
            System.out.println("false");
        } else if (endOfWord.equals(str.substring(lengthOfWord - 2, lengthOfWord)))
            System.out.println("true");
        else
            System.out.println("false");
    }

}
