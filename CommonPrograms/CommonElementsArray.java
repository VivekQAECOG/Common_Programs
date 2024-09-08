package com.commomPrograms;

import java.util.ArrayList;

public class CommonElementsArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 9};
        int[] arr2 = {3, 4, 5, 6, 1};

        ArrayList<Integer> carr = new ArrayList<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    carr.add(arr1[i]);
                }

            }

        }

        for (int common : carr) {
            System.out.println(common);
        }
    }

}
