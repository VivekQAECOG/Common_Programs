package com.commomPrograms;

public class Swap {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b; // 30
        System.out.println(a);
        b = a - b; // 10
        System.out.println(b);
        a = a - b; // 30
        System.out.println(a);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

//        int temp = 0;
//
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//

    }

}
