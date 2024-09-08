package com.commomPrograms;

public class Factorial {

    /*
    Factorial ->

    5! ->  5 * 4 * 3 * 2 * 1 = 120


    f = 1
    --> Iterates 1 to n(<=5)
    => n=1 : f = ( 1 * 1 ) => 1
    => n=2 : f = ( 1 * 2 ) => 2
    => n=3 : f = ( 2 * 3 ) => 6
    => n=4 : f = ( 6 * 4 ) => 24
    => n=5 : f = ( 24 * 5 ) => 120

     */


    public static void main(String[] args) {

        int num = 5, factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

    }


}
