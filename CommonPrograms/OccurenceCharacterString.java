package com.commomPrograms;

import java.util.Arrays;

public class OccurenceCharacterString {

    public static void main(String[] args) {

        String str = "Automataiona";

        char expec = 'a';

//        int count =0;
//
//        for(char c : str.toCharArray()){
//            if(expec==c){
//                count++;
//            }
//        }
//
//        System.out.println(count);

        System.out.println(str.chars().filter(c->c==expec).count());
    }
}
