package com.commomPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    /*

    LinkedHashMap is used here to maintain the order of characters as they appear in the string.

     */

    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Integer> charcount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charcount.put(c, charcount.getOrDefault(c, 0) + 1);
        }

        charcount.forEach((key, value) -> {
            System.out.println(key + ":" + String.valueOf(value));
        });

        //minimum occurence

        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }

        }
        ;

        //maximum occurence

        char maxChar = '\0'; // Default to null character
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("The maximum occurring character is: " + maxChar);


    }
}