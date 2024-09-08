package com.commomPrograms;

import java.util.Arrays;

public class DistinctArray {


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4, 4};

        Integer[] arr2 = {1, 2, 2, 3, 4, 4};

        Arrays.stream(arr1).distinct().sorted().forEach(System.out::println);

        Arrays.stream(arr2).distinct().sorted().forEach(System.out::println);


    }
}
