package com.commomPrograms;

import java.util.Arrays;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 12345;

        int rev =0;

        while(num!=0){
            rev = rev * 10 + num%10;

            // 5
            // 54
            // 543
            // 5432
            // 54321

            num = num/10;
        }

        System.out.println(rev);


    }
}
