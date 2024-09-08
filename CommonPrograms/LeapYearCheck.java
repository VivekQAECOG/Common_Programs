package com.commomPrograms;

public class LeapYearCheck {

    /*

   Divisible by 4 and not divisible by 100:
   Divisible by 400:

   Year 2000 staisfy second conditon

     */

    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap);
    }
}
