package com.commomPrograms;

public class PerfectNumber {

    /*

    A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.

     */

    public static void main(String[] args) {

        int num = 28;

        int sumofdiv = 0;

        for(int i=1 ; i < num ; i++){
            if(num%i==0){
                sumofdiv = sumofdiv + i;
            }
        }
        System.out.println(sumofdiv);


    }

}
