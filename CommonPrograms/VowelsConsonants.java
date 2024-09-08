package com.commomPrograms;

public class VowelsConsonants {

    /*

    Vowels -> a e i o u

    The indexOf method of the String class returns the index of the first
    occurrence of the specified character (c in this case).
    If the character c is not found in the string, indexOf returns -1.

     */

    public static void main(String[] args) {

        String word = "AUTomAtion";

        char[] arr = word.toCharArray();

        int vow = 0, con =0;

        for(char c : arr){

            if("AEIOUaeiou".indexOf(c)!=-1){
                vow++;
            }else{
                con++;
            }
        }

        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + con);

    }

}
