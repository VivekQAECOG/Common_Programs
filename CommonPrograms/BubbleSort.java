package com.commomPrograms;

public class BubbleSort {

    /*

    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
     */

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        int temp = 0;

        for(int i=0 ; i<arr.length-1 ; i++){

            for(int j=0 ; j<arr.length-1-i ; j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int n : arr){
            System.out.println(n);
        }


    }
}
