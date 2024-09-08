package com.commomPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestArray {

    /*

   System.out.println(Arrays.stream(arr)  // Convert int[] to IntStream
            .distinct()                      // Remove duplicates
            .boxed()                         // Convert IntStream to Stream<Integer>
            .sorted(Comparator.reverseOrder()) // Sort in descending order
            .skip(1)                         // Skip the largest element
            .findFirst()                     // Get the first element of the remaining stream
            .get()                           // Extract the value from the Optional                  // Unwrap the Optional<Integer>

    Converts the IntStream to a Stream<Integer>, which is required for sorting with a custom comparator.

     */

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 24, 1};

        System.out.println(Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

    }


}
