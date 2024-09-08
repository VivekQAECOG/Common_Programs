package com.commomPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        //Primitive array
        int[] num1 = {10, 20, 30, 40, 40};

        //Wrapper Object Array
        Integer[] num2 = {20, 50, 60, 90};

        ArrayList<Integer> num3 = new ArrayList<>();

        num3.add(9);
        num3.add(39);
        num3.add(27);
        num3.add(34);
        num3.add(13);
        num3.add(41);

        HashSet<Integer> num4 = new HashSet<>();

        num4.add(89);
        num4.add(160);
        num4.add(510);
        num4.add(510);

        System.out.println(Arrays.stream(num1).max().getAsInt());

        System.out.println(Arrays.stream(num2).max(Comparator.naturalOrder()).get().intValue());

        System.out.println(num3.stream().max(Comparator.naturalOrder()).get().intValue());

        System.out.println(num4.stream().max(Comparator.naturalOrder()).get().intValue());

        System.out.println(Stream.of(18,119,23,67,82).max(Comparator.naturalOrder()).get().intValue());

        num3.stream().filter(n-> n > 10 && n < 40).sorted().forEach(System.out::println);




    }
}
