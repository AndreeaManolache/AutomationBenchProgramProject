package academy.learnprogramming;

//Exercise 1
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//        helloName("Bob") → "Hello Bob!"
//        helloName("Alice") → "Hello Alice!"
//        helloName("X") → "Hello X!"


import javax.swing.*;
import java.sql.SQLOutput;

public class StringExercises {

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

        String endLy = "oddly";
        int lengthOfWord = endLy.length();
        String endOfWord = "ly";
        if (lengthOfWord < 2) {
            System.out.println("false");
        } else if (endOfWord.equals(endLy.substring(lengthOfWord - 2, lengthOfWord)))
            System.out.println("true");
        else
            System.out.println("false");

        //Exercise 7
        //    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
        //    The string length will be at least 3.
//
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"

        String middleThree= "Candy";
        System.out.println(middleThree.length()/2);
        int wordLength =middleThree.length()/2;
        System.out.println(middleThree.substring(wordLength-1, wordLength+2));

        //Exercise 8

//        Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
//        If either string is length 0, use '@' for its missing char.
//
//        lastChars("last", "chars") → "ls"
//        lastChars("yo", "java") → "ya"
//        lastChars("hi", "") → "h@"

       String firstString="yo";
       String lastString="java";
       if(firstString.length() == 0)
           firstString="@";
        if(lastString.length() == 0)
            lastString = "@";
        System.out.println(firstString.substring(0,1) + lastString.substring(lastString.length()-1));


        /*Exercise 9
        Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
         */

       // String color="red";
        String color="blue";
        if(color.startsWith("red"))
            System.out.println("red");
        if(color.startsWith("blue"))
            System.out.println("blue");
        else
            System.out.println(" ");

        /*Exercise 10
        Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
         The string may be any length. If there are fewer than 2 chars, use whatever is there.

        extraFront("Hello") → "HeHeHe"
        extraFront("ab") → "ababab"
        extraFront("H") → "HHH"
         */
        String extraFront="Hello";
        System.out.println(extraFront.length());
        if(extraFront.length() > 2)
            System.out.println(extraFront.substring(0,2) + extraFront.substring(0,2) + extraFront.substring(0,2));
        if(extraFront.length() < 2)
            System.out.println(extraFront.substring(0,1) + extraFront.substring(0,1) + extraFront.substring(0,1));


        /* Exercise 11

        Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
         except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
          So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

        startWord("hippo", "hi") → "hi"
        startWord("hippo", "xip") → "hip"
        startWord("hippo", "i") → "h"
         */


        String startWord="hippo";
        String secondWord="hi";
//        if(startWord.length() == 0)
//            System.out.println(" ");
//        if(startWord.length() > secondWord.length() )
//            System.out.println(" ");
//        if(startWord.length() ==1)
//            System.out.println(secondWord.substring(0,1));
//        else if (secondWord.substring(1,secondWord.length()).equals(startWord.substring(1,startWord.length())))
//            System.out.println(secondWord.substring(0,startWord.length()));
//        else
//            System.out.println(" ");

         if(startWord.length() >= secondWord.length() && startWord.substring(1, secondWord.length()).equals(secondWord.substring(1)))
             System.out.println(startWord.substring(0, secondWord.length()));
         else System.out.println(" ");


         /* Exercise 12

        Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

            makeAbba("Hi", "Bye") → "HiByeByeHi"
            makeAbba("Yo", "Alice") → "YoAliceAliceYo"
            makeAbba("What", "Up") → "WhatUpUpWhat"
          */
        String a="Hi";
        String b="Bye";
        System.out.println(a + b + b + a);

        /* Exercise 13

        Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

        extraEnd("Hello") → "lololo"
        extraEnd("ab") → "ababab"
        extraEnd("Hi") → "HiHiHi"
         */

        String extraEnd="Hello";
        int lenExtraEnd=extraEnd.length();
        System.out.println(extraEnd.substring(lenExtraEnd-2,lenExtraEnd) + extraEnd.substring(lenExtraEnd-2,lenExtraEnd) + extraEnd.substring(lenExtraEnd-2,lenExtraEnd));

        /* Exercise 14
        Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

        withoutEnd("Hello") → "ell"
        withoutEnd("java") → "av"
        withoutEnd("coding") → "odin"
         */

        String withoutEnd="Hello";
        int lenForWithoutEnd=withoutEnd.length();
        System.out.println(withoutEnd.substring(1,lenForWithoutEnd-1));

        /*Exercise 15
        Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

        left2("Hello") → "lloHe"
        left2("java") → "vaja"
        left2("Hi") → "Hi"
         */

        String left2="Hello";
        int lenLeft2=left2.length();
        System.out.println(left2.substring(lenLeft2-3,lenLeft2) + left2.substring(0,2));


        /*Exercise 16
        Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""
         */

        String withoutEnd2="Hello";
        int lenWithoutEnd2=withoutEnd2.length();
        System.out.println(withoutEnd2.substring(1,lenWithoutEnd2-1));

        /*Exercise 17
        Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
         */

        String nTwice="Hello";
        int n =2;
        System.out.println(nTwice.substring(0,2) + nTwice.substring(nTwice.length()-n));

        /* Exercise 18
            Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
             The string may be any length, including 0. Note: use .equals() to compare 2 strings
         */

       String hasBad="badxx";
       // String hasBad="xxadxx";
        if(hasBad.length()==3)
            System.out.println(hasBad.substring(0,3).equals("bad"));
        if(hasBad.length()>=4)
            System.out.println(hasBad.substring(0,3).equals("bad") || hasBad.substring(1,4).equals("bad"));
        else
            System.out.println(false);


        /*Exercise 19
        Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char,
        then omit one of the chars, so "abc" and "cat" yields "abcat".
         */

        String abc="abc";
        String cat="cat";
        if(abc.charAt(abc.length() -1) == cat.charAt(0))
            System.out.println(abc + cat.substring(1));
        else
            System.out.println(abc + cat);


        /*Exercise 20
        Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
        frontAgain("edited") → true
        frontAgain("edit") → false
        frontAgain("ed") → true
         */

        String frontAgain="edit";
        if(frontAgain.substring(0,2).equals(frontAgain.substring(frontAgain.length()-2)))
            System.out.println(true);
        else
            System.out.println(false);

        /*Exercise 21
        Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning,
        so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

        without2("HelloHe") → "lloHe"
        without2("HelloHi") → "HelloHi"
        without2("Hi") → ""
         */

        String without2="HelloHe";
        if(without2.substring(0,2).equals(without2.substring(without2.length()-2)))
            System.out.println(without2.substring(2));
        else
            System.out.println(without2);

        /*Exercise 22

        Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"
         */

        String withoutx="Hxix";
        if(withoutx.length() ==0)
            System.out.println(withoutx);
        if(withoutx.length() == 1)
            if(withoutx.charAt(0) == 'x')
                System.out.println(" ");
            else
                System.out.println(withoutx);
        if(withoutx.charAt(0) == 'x')
            withoutx=withoutx.substring(1,withoutx.length());
        if(withoutx.charAt(withoutx.length()-1)== 'x')
            withoutx=withoutx.substring(0,withoutx.length() -1);
        System.out.println(withoutx);

        /*Exercise 23

        The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which
        surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

        makeTags("i", "Yay") → "<i>Yay</i>"
        makeTags("i", "Hello") → "<i>Hello</i>"
        makeTags("cite", "Yay") → "<cite>Yay</cite>"
         */
        String tag="i";
        String wordTag="Hello";
        System.out.println("<" + tag + ">" + wordTag + "</" + tag + ">");

        /*Exercise 24
        Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2,
        return whatever there is, so "X" yields "X",  and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"
         */

        String firstTwo="Hello";
        int lenfirstTwo=firstTwo.length();
        if(lenfirstTwo > 2)
            System.out.println(firstTwo.substring(0,2));
        else
            System.out.println(firstTwo);

        /*Exercise 25
        Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
        The strings will not be the same length, but they may be empty (length 0).
         */

        String comboString1="Hello";
        String comboString2="hi";
        System.out.println(comboString2 + comboString1 + comboString2);

        /*Exercise 26
        Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
         */

        String right2="Hello";
        if(right2.length() > 2)
            System.out.println(right2.substring(right2.length()-2) + right2.substring(0, right2.length()-2));
        else
            System.out.println(right2);

        /*Exercise 27
        Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
         */

        String middleTwo="string";
        if(middleTwo.length() >2)
            System.out.println(middleTwo.substring(middleTwo.length()/2 -1, middleTwo.length()/2 + 1));

        /*Exercise 28
        Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars.
         The string length will be at least 2.
         */

        String twoChar="java";
        int index=2;
        if(index + 2 >twoChar.length() || index<0 )
        System.out.println(twoChar.substring(0,2));
        else
            System.out.println(twoChar.substring(index , index + 2));

       /*Exsercise 29
       Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        atFirst("hello") → "he"
        atFirst("hi") → "hi"
        atFirst("h") → "h@"
        */

        String atFirst="h";

        if(atFirst.length() == 0)
            System.out.println("@@");

        if(atFirst.length() == 1)
            System.out.println(atFirst + "@");
        else
            System.out.println(atFirst.substring(0, 2));

        /*Exercise 30

        Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
         */

        String lastTwo="coding";
        if(lastTwo.length() < 2) {
            System.out.println(lastTwo);
        }else
            System.out.println(lastTwo.substring(0, lastTwo.length() - 2) + lastTwo.charAt(str.length() - 1) + lastTwo.charAt(lastTwo.length() - 2));

        //Exercise 31
       // Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths,
        // omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

        String miniCat="Hello";
        String miniCat2="Hi";
        int min = Math.min(miniCat.length(), miniCat2.length());
        System.out.println(miniCat.substring(miniCat.length() - min) + miniCat2.substring(miniCat2.length() - min));

        /*Exercise 32
        Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
         The string may be any length. Harder than it looks.
        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"
         */

        String defront = "Hello";
        if(defront.length() == 1 && defront.charAt(0) != 'a')
            System.out.println("");;

        if(defront.length() >= 2) {
            if(defront.charAt(0) != 'a' && defront.charAt(1) != 'b') {
                System.out.println(str.substring(2));
            } else if(defront.charAt(0) != 'a') {
                System.out.println(str.substring(1));
            } else if(defront.charAt(1) != 'b') {
                System.out.println("a" + str.substring(2));
            }
        }
        else
            System.out.println(defront);

        /*Exercise 33
        Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
         This is a little harder than it looks.
        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"
         */

         String withoutX2="xHi";
        if(withoutX2.length() == 1 && withoutX2.charAt(0) == 'x')
            System.out.println("");

        if(withoutX2.length() >= 2) {
            if(withoutX2.charAt(0) == 'x' && withoutX2.charAt(1) == 'x') {
                System.out.println(withoutX2.substring(2));
            } else if(withoutX2.charAt(0) == 'x') {
                System.out.println(withoutX2.substring(1));
            } else if(withoutX2.charAt(1) == 'x') {
                System.out.println(withoutX2.charAt(0) + withoutX2.substring(2));
            }
        }
        else
            System.out.println(withoutX2);

    }
}
