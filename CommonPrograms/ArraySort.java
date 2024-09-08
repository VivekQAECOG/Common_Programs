package com.commomPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySort {

    public static void main(String[] args) {

        int[] arrprimitive = {9,3,6,1,7};

        Integer[] arrobj = {9,3,6,1,7};

        String[] sarr2 = {"Kevin", "Austin", "Mandy"};

//        Arrays.sort(arr);
//
//        for(int i : arr){
//            System.out.println(i);
//        }

        Arrays.stream(arrprimitive).sorted().forEach(System.out::println);

        Arrays.stream(arrobj).sorted().forEach(System.out::println);

        Arrays.stream(sarr2).sorted().forEach(System.out::println);



    }

}
