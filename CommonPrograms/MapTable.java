package com.commomPrograms;

import org.openqa.selenium.devtools.v126.css.model.Value;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTable {


    public static void main(String[] args) {

//      HashMap<Integer, String> map = new HashMap<Integer, String>();

        Hashtable<Integer, String> map = new Hashtable<Integer, String>();

        map.put(1, "John");
        map.put(2, "Kevin");
        map.put(3, null);
        map.put(4, "Mendy");
        map.put(5, "Austin");

        map.forEach((Key, Value) -> {
            System.out.println(Key);
            System.out.println(Value);
        });

        //Map is interface
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


    }

}
