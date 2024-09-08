package com.commomPrograms;

public class Prime {

    /*

    only divisible by 1 or itself

    1 is not a prime number as it has only one factor.

    25 Prime number 1 -> 100

    2	3	5	7	11	13	17	19	23	29	31	37	41	43	47	53	59	61	67	71	73	79	83	89	97

     */

    public static void main(String[] args) {
        int n = 50;
        for (int i = 10; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
            }

        }
            if(isPrime){
                System.out.print(i);
                System.out.print("\t");}
        }

    }

}
