package com.commomPrograms;

public class RemoveWhitespaces {

    public static void main(String[] args) {

        String str = "A U T O M A T I O N  ";

        System.out.println(str);

        System.out.println(str.length());

        String result = str.replaceAll("\\s+", "");

        System.out.println(result);

        System.out.println(result.length());


        String str1 = "Automation Testing";
        String str2 = "Testing";
        System.out.println(str1.contains(str2));
    }

}
