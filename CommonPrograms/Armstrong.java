package com.commomPrograms;

public class Armstrong {

    /*

    Armstrong

    153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

     */


    public static void main(String[] args) {

        int num = 407;

        int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10) * (num % 10) * (num % 10);
            num = num / 10;
        }

        System.out.println(sum);
    }


}
