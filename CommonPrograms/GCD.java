package com.commomPrograms;

public class GCD {

    /*

    60 - > 2*3*2*5
    48 - > 3*2*2*2*2

    GCD[Greatest Common Divisor] : 2 * 3 * 2 = 12

    a % b     b
    48%60 -> 48
    60%48 -> 12
    48%12 -> 0

     */

    public static void main(String[] args) {

        int a=48;

        int b=60;

        int result = Math.min(a, b);

        System.out.println(result);

        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        System.out.println(result);
    }
}
