package com.commomPrograms;

public class FactorialRecurrsion {

    public static void main(String[] args) {

        System.out.println(getFactorial(5));

    }

    static int getFactorial(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num * getFactorial(num - 1);

        }
    }


}
