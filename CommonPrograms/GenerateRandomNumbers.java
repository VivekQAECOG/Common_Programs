package com.commomPrograms;

import java.util.Random;

public class GenerateRandomNumbers {

    public static void main(String[] args) {

        Random obj = new Random();

        for(int i = 0; i<5 ; i++) {
            System.out.println(obj.nextLong(100000000));
        }

    }
}
