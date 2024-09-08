package com.commomPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElementArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};

        Integer[] arr2 = {1, 3, 5, 7, 9};

        System.out.println(Arrays.stream(arr1).max().getAsInt());

        System.out.println(Arrays.stream(arr2).max(Comparator.naturalOrder()).get().intValue());

    }

}
