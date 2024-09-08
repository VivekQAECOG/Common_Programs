package com.commomPrograms;

public class FibonacciSeries {

    /*

    0 1 1 2 3 5 8 13 ....

     */

    public static void main(String[] args) {

        int n = 10;

        int num1 = 0;

        int num2 = 1;

        int num3 = 0;

        System.out.print(num1 + " " + num2);

        for (int i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }

    }

}
