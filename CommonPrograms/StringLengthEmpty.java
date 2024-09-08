package com.commomPrograms;

public class StringLengthEmpty {

    public static void main(String[] args) {

        String str1 = "AUTOMATION";

        String str2 = "";

        int l = str2.length();

        System.out.println(l);

        boolean empty = false;

        if(str2.isEmpty()){
            empty = true;
        }else{
            empty = false;
        }

        System.out.println(empty);


    }


}
