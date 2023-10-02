package academy.learnprogramming;

import java.util.Arrays;

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

//        int [] firstLast6= new int[] {1,2,6};   //declararea si initializarea unui array
//        if(firstLast6[0] == 6 || firstLast6[firstLast6.length-1]==6)
//            System.out.println(true);
//        else System.out.println(false);

        /*Exercise 2

        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
         */
//        int [] commonEnd1= new int[] {1,2,3};
//        int [] commonEnd2= new int[] {7,3};
//        if(commonEnd1[0] == commonEnd2[0] || commonEnd1[commonEnd1.length-1] == commonEnd2[commonEnd2.length-1])
//            System.out.println(true);
//        else
//            System.out.println(false);

        /*Exercise 3

        Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]
         */
//        int [] reverse3= new int[] {1,2,3};
//        int[] reverseArray=new int[3];
//        reverseArray[0]=reverse3[2];
//        reverseArray[1]=reverse3[1];
//        reverseArray[2]=reverse3[0];
//        System.out.println("Reverse array " + Arrays.toString(reverseArray));

        /*Exercise 4
        Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
         */

//        int [] middleWay= new int[] {1,2,3};
//        int [] middleWay2= new int[] {4,5,6};
//        System.out.println("[" + middleWay[1] + ", "  + middleWay2[1] + "]");

        /*Exercise 5
        Given an int array length 2, return true if it does not contain a 2 or 3.
        no23([4, 5]) → true
        no23([4, 2]) → false
        no23([3, 5]) → false
         */

//        int [] no23= new int[] {4,5};
//        if(no23[0] ==2 || no23[1]==3 || no23[0]==3 || no23[1]==3)
//            System.out.println(false);
//        else System.out.println(true);

        /*Exercise 6
        Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
        fix23([1, 2, 3]) → [1, 2, 0]
        fix23([2, 3, 5]) → [2, 0, 5]
        fix23([1, 2, 1]) → [1, 2, 1]
         */


//        int [] fix23= new int[] {1,2,3};
//        if(fix23[0] == 2 && fix23[1]==3)
//            fix23[1]=0;
//        if(fix23[1] == 2 && fix23[2]==3)
//            fix23[2]=0;
//        System.out.println("[" + fix23[0] + ","+ fix23[1] + "," + fix23[2] + "]");

        /*Exercise 7
        Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
        The original array will be length 2 or more.
        makeMiddle([1, 2, 3, 4]) → [2, 3]
        makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
        makeMiddle([1, 2]) → [1, 2]
         */
//
//        int [] makeMiddle= new int[] {1,2,3,4};
//        System.out.println("[" + makeMiddle[makeMiddle.length/2 -1] + "," + makeMiddle[makeMiddle.length/2] + "]");

        /*Exercise 8
        Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
        The array length will be at least 3.
        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        midThree([1, 2, 3]) → [1, 2, 3]
         */
//        int [] midThree= new int[] {1,2,3,4,5};
//        System.out.println("[" + midThree[midThree.length/2 -1] + "," + midThree[midThree.length/2] + "," + midThree[midThree.length/2 +1] +  "]");

        /*Exercise 9
        We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
         Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        unlucky1([1, 3, 4, 5]) → true
        unlucky1([2, 1, 3, 4, 5]) → true
        unlucky1([1, 1, 1]) → false
         */
//        int [] unlucky= new int[] {1,3,4,5};
//        if(unlucky.length <2) {
//            System.out.println(false);
//        }else if((unlucky[0]==1 && unlucky[1]==3) || (unlucky[unlucky.length-2]==1 && unlucky[unlucky.length-1]==3)) {
//            System.out.println(true);
//        } else if(unlucky.length>2 && unlucky[1]==1 && unlucky[2]==3) {
//            System.out.println(true);
//        }else System.out.println(false);

        /*Exercise 10
        Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true
         */
//        int [] sameFirstLast= new int[] {1,2,1};
//        if(sameFirstLast[0]==1 && sameFirstLast[sameFirstLast.length-1]==1)
//            System.out.println(true);
//        else System.out.println(false);

        /*Exercise 11
        Given an array of ints length 3, return the sum of all the elements.
        sum3([1, 2, 3]) → 6
        sum3([5, 11, 2]) → 18
        sum3([7, 0, 0]) → 7
         */
//        int [] sum3= new int[] {1,2,3};
//        System.out.println(sum3[0] + sum3[1] + sum3[2]);

        /*exercise 12
        Given an array of ints length 3, figure out which is larger, the first or last element in the array,
         and set all the other elements to be that value. Return the changed array.
        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]
         */
//        int [] maxEnd3= new int[] {1,2,3};
//        //System.out.println("[" + maxEnd3[maxEnd3.length-1] + "," + maxEnd3[maxEnd3.length-1] + "," + maxEnd3[maxEnd3.length-1] + "]");
//        if (maxEnd3[0] >= maxEnd3[maxEnd3.length-1]) {
//            maxEnd3[0] = maxEnd3[0];
//            maxEnd3[1] = maxEnd3[0];
//            maxEnd3[2] = maxEnd3[0];
//        }
//        else if (maxEnd3[0] <= maxEnd3[maxEnd3.length-1]) {
//            maxEnd3[0] = maxEnd3[maxEnd3.length-1];
//            maxEnd3[1] = maxEnd3[maxEnd3.length-1];
//            maxEnd3[2] = maxEnd3[maxEnd3.length-1];
//        }
//        System.out.println("[" + maxEnd3[0] + "," + maxEnd3[1] + "," + maxEnd3[2] + "]");

        /*Exercise 13
        Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
        The original array will be length 1 or more.
        makeEnds([1, 2, 3]) → [1, 3]
        makeEnds([1, 2, 3, 4]) → [1, 4]
        makeEnds([7, 4, 6, 2]) → [7, 2]
         */
//        int [] makeEnds= new int[] {1,2,3};
//        System.out.println("[" + makeEnds[0] + "," + makeEnds[makeEnds.length-1] + "]");

        /*Exercise 14
        Given an int array, return a new array with double the length where its last element is the same as the original array,
         and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLast([1, 2]) → [0, 0, 0, 2]
        makeLast([3]) → [0, 3]
         */
       int[] makeLast= new int[] {1,2};
       int[] makeLast1= new int[makeLast.length*2];
        makeLast1[makeLast.length*2 - 1] = makeLast[makeLast.length -1];
        System.out.println(Arrays.toString(makeLast1));
    }
}