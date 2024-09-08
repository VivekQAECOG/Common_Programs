package com.commomPrograms;

import java.util.Arrays;

public class Anagram {

    /*

An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once

CAT -> ACT

     */

    public static void main(String[] args) {

        String str1 ="CAT";

        String str2 ="ACT";

        char[] c1 = str1.toCharArray();

        Arrays.sort(c1);

        char[] c2 = str2.toCharArray();

        Arrays.sort(c2);

        System.out.println(Arrays.equals(c1, c2));
    }

}
