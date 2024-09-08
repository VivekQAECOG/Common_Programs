package com.commomPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListSet {

    /*
# Java Colelction Doesn't accept primitive as arguments, only wrapper

Wrapper Classes:
int → Integer
double → Double
char → Character
boolean → Boolean
long → Long
short → Short
float → Float
byte → Byte

# HashSet does allow duplicate values whereas Arralist alllows duplicate values.

     */

    public static void main(String[] args) {

//          Set<String> AL = new HashSet<>();

        List<String> AL = new ArrayList<>();

        AL.add("John");
        AL.add("Austin");
        AL.add("Austin");
        AL.add("Kevin");

//        for(String name: AL){
//            System.out.println(name);
//        }

        AL.forEach(System.out::println);


    }

}
