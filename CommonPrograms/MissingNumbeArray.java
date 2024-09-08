package com.commomPrograms;

public class MissingNumbeArray {

    /*

   Missing nummber in series of natural numbers.

     */

    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length;

        System.out.println(n);

        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers

        System.out.println(expectedSum);

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println(actualSum);

        int missingNum = actualSum -expectedSum;

        System.out.println(missingNum);


    }
}
