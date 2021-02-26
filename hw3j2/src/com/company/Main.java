package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static int count;

    public static void main(String[] args) {

        // First task
        String[] array = {"a", "b", "c", "a", "c", "d", "e", "f", "g", "h", "h", "h"};
        HashMap<String, Integer> arr = new HashMap();
        for (int i = 0; i < array.length; i++) {
            Integer value = arr.get(array[i]);
            if (value == null) {
                arr.put(array[i], 1);
            } else {
                arr.put(array[i], value + 1);
            }
        }
        System.out.println(arr.toString());

        // Second task

        Phonebook phonebook = new Phonebook();

        phonebook.add("Johnson", "+1");
        phonebook.add("Denison", "+111111");
        phonebook.add("Gamble", "777");
        phonebook.add("Hewlett", "777777777");
        phonebook.add("Johnson", "+9631452");
        phonebook.add("Packard", "657512");
        phonebook.add("Procter", "657512");
        phonebook.add("Johnson", "741");
        phonebook.add("Morris", "657512");


        System.out.println(phonebook.get("Johnson"));
        System.out.println(phonebook.get("Denison"));


    }
}
