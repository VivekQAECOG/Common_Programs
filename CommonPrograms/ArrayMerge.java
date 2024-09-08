package com.commomPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArrayMerge {

    /*

    Use Primitive Arrays (int[], double[], etc.) when performance and
    memoryefficiency are critical and you do not need the additional features
    of wrapper classes.

         //Primitive Arrays(int, double, long)

        //IntStream, LongStream ,LongStream = Arrays.stream(arr)

    Use Object Arrays (Integer[], Double[], etc.) when you need to represent null values or require additional methods provided by wrapper classes.

        //Stream<String or Integer> = Arrays.stream(arr)

        //toArray(String or Integer[]::new);

     */


    public static void main(String[] args) {


        int[] arr1 = {9, 3, 6, 1, 7};

        int[] arr2 = {8, 2, 4, 5, 10};

        int[] mergedARR = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();

        for (int i : mergedARR) {
            System.out.println(i);
        }

        //Objects->String


        String[] sarr1 = {"John", "Steve", "Dan"};

        String[] sarr2 = {"Kevin", "Austin", "Mandy"};

        String[] mergedStringArray = Stream.concat(Arrays.stream(sarr1), Arrays.stream(sarr2)).sorted().toArray(String[]::new);


        for (String s : mergedStringArray) {
            System.out.println(s);
        }


        //Objects->Integer


        Integer[] integerarr1 = {1,7,4};

        Integer[] integerarr2 = {5,9,3};

        Integer[] mergedIntegerArray = Stream.concat(Arrays.stream(integerarr1), Arrays.stream(integerarr2)).sorted().toArray(Integer[]::new);


        for (Integer s : mergedIntegerArray) {
            System.out.println(s);
        }



    }

}
