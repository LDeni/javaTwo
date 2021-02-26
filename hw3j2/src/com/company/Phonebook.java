package com.company;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Phonebook {

    HashMap<String, Set <String>> contacts = new HashMap<>();


    public void add(String name, String telephone) {
       Set<String> numbers = contacts.getOrDefault(name, new HashSet<>());
       numbers.add(telephone);
       contacts.put(name, numbers);
    }

    public Set<String> get(String name) {
        System.out.print(name + " : ");
  return contacts.get(name);
        }

    }


